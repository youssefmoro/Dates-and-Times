import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Main {
    private static void performAnimalEnrichment(LocalDate start, LocalDate end,Period period) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) { // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // add a month
        } }
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, Month.JANUARY, 20);
        date=date.plusDays(2);
        System.out.println(date);
        date=date.plusWeeks(1);
        System.out.println(date);
        date=date.plusMonths(1);
        System.out.println(date);
        date=date.plusYears(3);//java recognizes leap years
        System.out.println(date);
        LocalTime time=LocalTime.of(5,50,30);
        LocalDateTime date_Time=LocalDateTime.of(date,time);
        date_Time=date_Time.minusDays(2);
        System.out.println(date_Time);
        date_Time=date_Time.minusWeeks(1);
        System.out.println(date_Time);
        date_Time=date_Time.minusMonths(1);
        System.out.println(date_Time);
        date_Time=date_Time.minusYears(3);
        System.out.println(date_Time);
        //methodChaining
        LocalDateTime date_Time2=LocalDateTime.of(date,time).minusDays(2).plusDays(2).minusMonths(3).plusMonths(3).plusYears(5).minusYears(5).plusSeconds(50);
        System.out.println(date_Time2);
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period=Period.ofMonths(1);
        Period everyYearAndWeek=Period.of(0,1,5);
        performAnimalEnrichment(start, end,everyYearAndWeek);
        //durations
        Duration daily=Duration.ofDays(10);
        System.out.println(daily);
        Duration hourly=Duration.ofHours(5);
        System.out.println(hourly);
        Duration perMinute=Duration.ofMinutes(15);
        System.out.println(perMinute);
        Duration perSeconds=Duration.ofSeconds(20);
        System.out.println(perSeconds);
        Duration perNano=Duration.ofNanos(500);
        System.out.println(perNano);
        Duration per100Nano=Duration.of(100, ChronoUnit.NANOS);
        System.out.println(per100Nano);
        //chrono units to calculate differeneces
        LocalTime time1diff=LocalTime.of(5,30);
        LocalTime time2diff=LocalTime.of(6,30);
        System.out.println(ChronoUnit.HOURS.between(time1diff,time2diff));
        System.out.println(ChronoUnit.HALF_DAYS);
        //you can pass duration as an argument
        System.out.println(time1diff.plus(hourly));//10:30  supposedly
        //instants
        Instant ins1=Instant.now();
        for(int i=0;i<1000000;i++)
        {

        }
        Instant ins2=Instant.now();
        System.out.println(Duration.between(ins1,ins2).toMillis());
        LocalDate date2=LocalDate.of(2015,Month.JANUARY,10);
        LocalTime time2=LocalTime.of(5,45);
        ZoneId zone=ZoneId.of("US/Eastern");// inner string must be written exactly the same
        ZonedDateTime zonedDateTime=ZonedDateTime.of(date2,time2,zone);
        System.out.println(zonedDateTime);
        Instant ins3=zonedDateTime.toInstant();
        System.out.println(ins3);
        Instant nextDay=ins3.plus(1,ChronoUnit.HALF_DAYS);System.out.println(nextDay);
        Instant nextHour=ins3.plus(1,ChronoUnit.HOURS);System.out.println(nextHour);
        //Instant nextWeek=ins3.plus(1,ChronoUnit.WEEKS);System.out.println(nextWeek);//Exception
        //Daylight saving time example
        LocalDate date3=LocalDate.of(2016,Month.MARCH,13);
        LocalTime time3=LocalTime.of(1,30);
        ZonedDateTime dayLight=ZonedDateTime.of(date3,time3,zone);
        System.out.println(dayLight);
        dayLight=dayLight.plusHours(1);
        System.out.println(dayLight);
        //Localization and internatiolaization
        Locale locale=Locale.getDefault();
        System.out.println(locale);
        System.out.println(locale.GERMAN);
        System.out.println(locale.GERMANY);
        System.out.println(new Locale("arabic","EGYPT"));
        Locale l1=new Locale.Builder().setLanguage("ar").setRegion("EG").build();
        System.out.println(l1);


    }
}