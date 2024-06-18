// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class PatchEventRequest extends TeaModel {
    @NameInMap("Attendees")
    public java.util.List<PatchEventRequestAttendees> attendees;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>primary</p>
     */
    @NameInMap("CalendarId")
    public String calendarId;

    @NameInMap("Description")
    public String description;

    @NameInMap("End")
    public PatchEventRequestEnd end;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iiiP35sJadba8aBSgjrwPRKgiEiF</p>
     */
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("Extra")
    public java.util.Map<String, String> extra;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAllDay")
    public Boolean isAllDay;

    @NameInMap("Location")
    public PatchEventRequestLocation location;

    @NameInMap("Recurrence")
    public PatchEventRequestRecurrence recurrence;

    @NameInMap("Reminders")
    public java.util.List<PatchEventRequestReminders> reminders;

    @NameInMap("Start")
    public PatchEventRequestStart start;

    @NameInMap("Summary")
    public String summary;

    public static PatchEventRequest build(java.util.Map<String, ?> map) throws Exception {
        PatchEventRequest self = new PatchEventRequest();
        return TeaModel.build(map, self);
    }

    public PatchEventRequest setAttendees(java.util.List<PatchEventRequestAttendees> attendees) {
        this.attendees = attendees;
        return this;
    }
    public java.util.List<PatchEventRequestAttendees> getAttendees() {
        return this.attendees;
    }

    public PatchEventRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public PatchEventRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PatchEventRequest setEnd(PatchEventRequestEnd end) {
        this.end = end;
        return this;
    }
    public PatchEventRequestEnd getEnd() {
        return this.end;
    }

    public PatchEventRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public PatchEventRequest setExtra(java.util.Map<String, String> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, String> getExtra() {
        return this.extra;
    }

    public PatchEventRequest setIsAllDay(Boolean isAllDay) {
        this.isAllDay = isAllDay;
        return this;
    }
    public Boolean getIsAllDay() {
        return this.isAllDay;
    }

    public PatchEventRequest setLocation(PatchEventRequestLocation location) {
        this.location = location;
        return this;
    }
    public PatchEventRequestLocation getLocation() {
        return this.location;
    }

    public PatchEventRequest setRecurrence(PatchEventRequestRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }
    public PatchEventRequestRecurrence getRecurrence() {
        return this.recurrence;
    }

    public PatchEventRequest setReminders(java.util.List<PatchEventRequestReminders> reminders) {
        this.reminders = reminders;
        return this;
    }
    public java.util.List<PatchEventRequestReminders> getReminders() {
        return this.reminders;
    }

    public PatchEventRequest setStart(PatchEventRequestStart start) {
        this.start = start;
        return this;
    }
    public PatchEventRequestStart getStart() {
        return this.start;
    }

    public PatchEventRequest setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public static class PatchEventRequestAttendees extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isOptional")
        public Boolean isOptional;

        public static PatchEventRequestAttendees build(java.util.Map<String, ?> map) throws Exception {
            PatchEventRequestAttendees self = new PatchEventRequestAttendees();
            return TeaModel.build(map, self);
        }

        public PatchEventRequestAttendees setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PatchEventRequestAttendees setIsOptional(Boolean isOptional) {
            this.isOptional = isOptional;
            return this;
        }
        public Boolean getIsOptional() {
            return this.isOptional;
        }

    }

    public static class PatchEventRequestEnd extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>2020-01-01T10:15:30+08:00</p>
         */
        @NameInMap("dateTime")
        public String dateTime;

        /**
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timeZone")
        public String timeZone;

        public static PatchEventRequestEnd build(java.util.Map<String, ?> map) throws Exception {
            PatchEventRequestEnd self = new PatchEventRequestEnd();
            return TeaModel.build(map, self);
        }

        public PatchEventRequestEnd setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public PatchEventRequestEnd setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public PatchEventRequestEnd setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class PatchEventRequestLocation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>room 1-2-3</p>
         */
        @NameInMap("displayName")
        public String displayName;

        public static PatchEventRequestLocation build(java.util.Map<String, ?> map) throws Exception {
            PatchEventRequestLocation self = new PatchEventRequestLocation();
            return TeaModel.build(map, self);
        }

        public PatchEventRequestLocation setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

    public static class PatchEventRequestRecurrencePattern extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dayOfMonth")
        public Integer dayOfMonth;

        /**
         * <strong>example:</strong>
         * <p>sunday</p>
         */
        @NameInMap("daysOfWeek")
        public String daysOfWeek;

        /**
         * <strong>example:</strong>
         * <p>last</p>
         */
        @NameInMap("index")
        public String index;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("interval")
        public Integer interval;

        /**
         * <strong>example:</strong>
         * <p>daily</p>
         */
        @NameInMap("type")
        public String type;

        public static PatchEventRequestRecurrencePattern build(java.util.Map<String, ?> map) throws Exception {
            PatchEventRequestRecurrencePattern self = new PatchEventRequestRecurrencePattern();
            return TeaModel.build(map, self);
        }

        public PatchEventRequestRecurrencePattern setDayOfMonth(Integer dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            return this;
        }
        public Integer getDayOfMonth() {
            return this.dayOfMonth;
        }

        public PatchEventRequestRecurrencePattern setDaysOfWeek(String daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public String getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public PatchEventRequestRecurrencePattern setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public PatchEventRequestRecurrencePattern setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public PatchEventRequestRecurrencePattern setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PatchEventRequestRecurrenceRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-12-31T10:15:30+08:00</p>
         */
        @NameInMap("endDate")
        public String endDate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("numberOfOccurrences")
        public Integer numberOfOccurrences;

        /**
         * <strong>example:</strong>
         * <p>endDate</p>
         */
        @NameInMap("type")
        public String type;

        public static PatchEventRequestRecurrenceRange build(java.util.Map<String, ?> map) throws Exception {
            PatchEventRequestRecurrenceRange self = new PatchEventRequestRecurrenceRange();
            return TeaModel.build(map, self);
        }

        public PatchEventRequestRecurrenceRange setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public PatchEventRequestRecurrenceRange setNumberOfOccurrences(Integer numberOfOccurrences) {
            this.numberOfOccurrences = numberOfOccurrences;
            return this;
        }
        public Integer getNumberOfOccurrences() {
            return this.numberOfOccurrences;
        }

        public PatchEventRequestRecurrenceRange setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PatchEventRequestRecurrence extends TeaModel {
        @NameInMap("pattern")
        public PatchEventRequestRecurrencePattern pattern;

        @NameInMap("range")
        public PatchEventRequestRecurrenceRange range;

        public static PatchEventRequestRecurrence build(java.util.Map<String, ?> map) throws Exception {
            PatchEventRequestRecurrence self = new PatchEventRequestRecurrence();
            return TeaModel.build(map, self);
        }

        public PatchEventRequestRecurrence setPattern(PatchEventRequestRecurrencePattern pattern) {
            this.pattern = pattern;
            return this;
        }
        public PatchEventRequestRecurrencePattern getPattern() {
            return this.pattern;
        }

        public PatchEventRequestRecurrence setRange(PatchEventRequestRecurrenceRange range) {
            this.range = range;
            return this;
        }
        public PatchEventRequestRecurrenceRange getRange() {
            return this.range;
        }

    }

    public static class PatchEventRequestReminders extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("minutes")
        public Integer minutes;

        public static PatchEventRequestReminders build(java.util.Map<String, ?> map) throws Exception {
            PatchEventRequestReminders self = new PatchEventRequestReminders();
            return TeaModel.build(map, self);
        }

        public PatchEventRequestReminders setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public PatchEventRequestReminders setMinutes(Integer minutes) {
            this.minutes = minutes;
            return this;
        }
        public Integer getMinutes() {
            return this.minutes;
        }

    }

    public static class PatchEventRequestStart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>2020-01-01T10:15:30+08:00</p>
         */
        @NameInMap("dateTime")
        public String dateTime;

        /**
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timeZone")
        public String timeZone;

        public static PatchEventRequestStart build(java.util.Map<String, ?> map) throws Exception {
            PatchEventRequestStart self = new PatchEventRequestStart();
            return TeaModel.build(map, self);
        }

        public PatchEventRequestStart setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public PatchEventRequestStart setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public PatchEventRequestStart setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

}
