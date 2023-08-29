// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class PatchEventResponseBody extends TeaModel {
    @NameInMap("attendees")
    public java.util.List<PatchEventResponseBodyAttendees> attendees;

    @NameInMap("createTime")
    public String createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("end")
    public PatchEventResponseBodyEnd end;

    @NameInMap("id")
    public String id;

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
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("start")
    public PatchEventResponseBodyStart start;

    @NameInMap("summary")
    public String summary;

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
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsOptional")
        public Boolean isOptional;

        @NameInMap("ResponseStatus")
        public String responseStatus;

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
        @NameInMap("Date")
        public String date;

        @NameInMap("DateTime")
        public String dateTime;

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
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public String id;

        @NameInMap("ResponseStatus")
        public String responseStatus;

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
        @NameInMap("DayOfMonth")
        public Integer dayOfMonth;

        @NameInMap("DaysOfWeek")
        public String daysOfWeek;

        @NameInMap("Index")
        public String index;

        @NameInMap("Interval")
        public Integer interval;

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
        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("NumberOfOccurrences")
        public Integer numberOfOccurrences;

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
        @NameInMap("Method")
        public String method;

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
        @NameInMap("Date")
        public String date;

        @NameInMap("DateTime")
        public String dateTime;

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
