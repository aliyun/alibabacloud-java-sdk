// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class PatchEventResponseBody extends TeaModel {
    @NameInMap("attendees")
    public java.util.List<PatchEventResponseBodyAttendees> attendees;

    /**
     * <strong>example:</strong>
     * <p>2022-10-25T02:26:14Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("end")
    public PatchEventResponseBodyEnd end;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isAllDay")
    public Boolean isAllDay;

    @NameInMap("location")
    public PatchEventResponseBodyLocation location;

    @NameInMap("organizer")
    public PatchEventResponseBodyOrganizer organizer;

    @NameInMap("recurrence")
    public PatchEventResponseBodyRecurrence recurrence;

    @NameInMap("reminders")
    public java.util.List<PatchEventResponseBodyReminders> reminders;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>4248DCC9-785F-5A14-8BE0-830FD52E1261</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("start")
    public PatchEventResponseBodyStart start;

    @NameInMap("summary")
    public String summary;

    /**
     * <strong>example:</strong>
     * <p>2020-01-01T10:15:30+08:00</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    public static PatchEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PatchEventResponseBody self = new PatchEventResponseBody();
        return TeaModel.build(map, self);
    }

    public PatchEventResponseBody setAttendees(java.util.List<PatchEventResponseBodyAttendees> attendees) {
        this.attendees = attendees;
        return this;
    }
    public java.util.List<PatchEventResponseBodyAttendees> getAttendees() {
        return this.attendees;
    }

    public PatchEventResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public PatchEventResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PatchEventResponseBody setEnd(PatchEventResponseBodyEnd end) {
        this.end = end;
        return this;
    }
    public PatchEventResponseBodyEnd getEnd() {
        return this.end;
    }

    public PatchEventResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public PatchEventResponseBody setIsAllDay(Boolean isAllDay) {
        this.isAllDay = isAllDay;
        return this;
    }
    public Boolean getIsAllDay() {
        return this.isAllDay;
    }

    public PatchEventResponseBody setLocation(PatchEventResponseBodyLocation location) {
        this.location = location;
        return this;
    }
    public PatchEventResponseBodyLocation getLocation() {
        return this.location;
    }

    public PatchEventResponseBody setOrganizer(PatchEventResponseBodyOrganizer organizer) {
        this.organizer = organizer;
        return this;
    }
    public PatchEventResponseBodyOrganizer getOrganizer() {
        return this.organizer;
    }

    public PatchEventResponseBody setRecurrence(PatchEventResponseBodyRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }
    public PatchEventResponseBodyRecurrence getRecurrence() {
        return this.recurrence;
    }

    public PatchEventResponseBody setReminders(java.util.List<PatchEventResponseBodyReminders> reminders) {
        this.reminders = reminders;
        return this;
    }
    public java.util.List<PatchEventResponseBodyReminders> getReminders() {
        return this.reminders;
    }

    public PatchEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PatchEventResponseBody setStart(PatchEventResponseBodyStart start) {
        this.start = start;
        return this;
    }
    public PatchEventResponseBodyStart getStart() {
        return this.start;
    }

    public PatchEventResponseBody setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public PatchEventResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class PatchEventResponseBodyAttendees extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>tony</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsOptional")
        public Boolean isOptional;

        /**
         * <strong>example:</strong>
         * <p>accepted</p>
         */
        @NameInMap("ResponseStatus")
        public String responseStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Self")
        public Boolean self;

        public static PatchEventResponseBodyAttendees build(java.util.Map<String, ?> map) throws Exception {
            PatchEventResponseBodyAttendees self = new PatchEventResponseBodyAttendees();
            return TeaModel.build(map, self);
        }

        public PatchEventResponseBodyAttendees setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public PatchEventResponseBodyAttendees setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PatchEventResponseBodyAttendees setIsOptional(Boolean isOptional) {
            this.isOptional = isOptional;
            return this;
        }
        public Boolean getIsOptional() {
            return this.isOptional;
        }

        public PatchEventResponseBodyAttendees setResponseStatus(String responseStatus) {
            this.responseStatus = responseStatus;
            return this;
        }
        public String getResponseStatus() {
            return this.responseStatus;
        }

        public PatchEventResponseBodyAttendees setSelf(Boolean self) {
            this.self = self;
            return this;
        }
        public Boolean getSelf() {
            return this.self;
        }

    }

    public static class PatchEventResponseBodyEnd extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>2020-01-01T10:15:30+08:00</p>
         */
        @NameInMap("DateTime")
        public String dateTime;

        /**
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        public static PatchEventResponseBodyEnd build(java.util.Map<String, ?> map) throws Exception {
            PatchEventResponseBodyEnd self = new PatchEventResponseBodyEnd();
            return TeaModel.build(map, self);
        }

        public PatchEventResponseBodyEnd setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public PatchEventResponseBodyEnd setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public PatchEventResponseBodyEnd setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class PatchEventResponseBodyLocation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("MeetingRooms")
        public java.util.List<String> meetingRooms;

        public static PatchEventResponseBodyLocation build(java.util.Map<String, ?> map) throws Exception {
            PatchEventResponseBodyLocation self = new PatchEventResponseBodyLocation();
            return TeaModel.build(map, self);
        }

        public PatchEventResponseBodyLocation setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public PatchEventResponseBodyLocation setMeetingRooms(java.util.List<String> meetingRooms) {
            this.meetingRooms = meetingRooms;
            return this;
        }
        public java.util.List<String> getMeetingRooms() {
            return this.meetingRooms;
        }

    }

    public static class PatchEventResponseBodyOrganizer extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>tony</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>accepted</p>
         */
        @NameInMap("ResponseStatus")
        public String responseStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Self")
        public Boolean self;

        public static PatchEventResponseBodyOrganizer build(java.util.Map<String, ?> map) throws Exception {
            PatchEventResponseBodyOrganizer self = new PatchEventResponseBodyOrganizer();
            return TeaModel.build(map, self);
        }

        public PatchEventResponseBodyOrganizer setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public PatchEventResponseBodyOrganizer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PatchEventResponseBodyOrganizer setResponseStatus(String responseStatus) {
            this.responseStatus = responseStatus;
            return this;
        }
        public String getResponseStatus() {
            return this.responseStatus;
        }

        public PatchEventResponseBodyOrganizer setSelf(Boolean self) {
            this.self = self;
            return this;
        }
        public Boolean getSelf() {
            return this.self;
        }

    }

    public static class PatchEventResponseBodyRecurrencePattern extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("DayOfMonth")
        public Integer dayOfMonth;

        /**
         * <strong>example:</strong>
         * <p>sunday</p>
         */
        @NameInMap("DaysOfWeek")
        public String daysOfWeek;

        /**
         * <strong>example:</strong>
         * <p>first</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <strong>example:</strong>
         * <p>daily</p>
         */
        @NameInMap("Type")
        public String type;

        public static PatchEventResponseBodyRecurrencePattern build(java.util.Map<String, ?> map) throws Exception {
            PatchEventResponseBodyRecurrencePattern self = new PatchEventResponseBodyRecurrencePattern();
            return TeaModel.build(map, self);
        }

        public PatchEventResponseBodyRecurrencePattern setDayOfMonth(Integer dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            return this;
        }
        public Integer getDayOfMonth() {
            return this.dayOfMonth;
        }

        public PatchEventResponseBodyRecurrencePattern setDaysOfWeek(String daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public String getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public PatchEventResponseBodyRecurrencePattern setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public PatchEventResponseBodyRecurrencePattern setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public PatchEventResponseBodyRecurrencePattern setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PatchEventResponseBodyRecurrenceRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-01-01T10:15:30+08:00</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NumberOfOccurrences")
        public Integer numberOfOccurrences;

        /**
         * <strong>example:</strong>
         * <p>noEnd</p>
         */
        @NameInMap("Type")
        public String type;

        public static PatchEventResponseBodyRecurrenceRange build(java.util.Map<String, ?> map) throws Exception {
            PatchEventResponseBodyRecurrenceRange self = new PatchEventResponseBodyRecurrenceRange();
            return TeaModel.build(map, self);
        }

        public PatchEventResponseBodyRecurrenceRange setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public PatchEventResponseBodyRecurrenceRange setNumberOfOccurrences(Integer numberOfOccurrences) {
            this.numberOfOccurrences = numberOfOccurrences;
            return this;
        }
        public Integer getNumberOfOccurrences() {
            return this.numberOfOccurrences;
        }

        public PatchEventResponseBodyRecurrenceRange setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PatchEventResponseBodyRecurrence extends TeaModel {
        @NameInMap("Pattern")
        public PatchEventResponseBodyRecurrencePattern pattern;

        @NameInMap("Range")
        public PatchEventResponseBodyRecurrenceRange range;

        public static PatchEventResponseBodyRecurrence build(java.util.Map<String, ?> map) throws Exception {
            PatchEventResponseBodyRecurrence self = new PatchEventResponseBodyRecurrence();
            return TeaModel.build(map, self);
        }

        public PatchEventResponseBodyRecurrence setPattern(PatchEventResponseBodyRecurrencePattern pattern) {
            this.pattern = pattern;
            return this;
        }
        public PatchEventResponseBodyRecurrencePattern getPattern() {
            return this.pattern;
        }

        public PatchEventResponseBodyRecurrence setRange(PatchEventResponseBodyRecurrenceRange range) {
            this.range = range;
            return this;
        }
        public PatchEventResponseBodyRecurrenceRange getRange() {
            return this.range;
        }

    }

    public static class PatchEventResponseBodyReminders extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Minutes")
        public String minutes;

        public static PatchEventResponseBodyReminders build(java.util.Map<String, ?> map) throws Exception {
            PatchEventResponseBodyReminders self = new PatchEventResponseBodyReminders();
            return TeaModel.build(map, self);
        }

        public PatchEventResponseBodyReminders setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public PatchEventResponseBodyReminders setMinutes(String minutes) {
            this.minutes = minutes;
            return this;
        }
        public String getMinutes() {
            return this.minutes;
        }

    }

    public static class PatchEventResponseBodyStart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>2020-01-01T10:15:30+08:00</p>
         */
        @NameInMap("DateTime")
        public String dateTime;

        /**
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        public static PatchEventResponseBodyStart build(java.util.Map<String, ?> map) throws Exception {
            PatchEventResponseBodyStart self = new PatchEventResponseBodyStart();
            return TeaModel.build(map, self);
        }

        public PatchEventResponseBodyStart setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public PatchEventResponseBodyStart setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public PatchEventResponseBodyStart setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

}
