// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateEventResponseBody extends TeaModel {
    @NameInMap("attendees")
    public java.util.List<CreateEventResponseBodyAttendees> attendees;

    /**
     * <strong>example:</strong>
     * <p>2020-01-01T10:15:30+08:00</p>
     */
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("end")
    public CreateEventResponseBodyEnd end;

    /**
     * <strong>example:</strong>
     * <p>iiiP35sJadba8aBSgjrwPRKgiEiF</p>
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
    public CreateEventResponseBodyLocation location;

    @NameInMap("onlineMeetingInfo")
    public CreateEventResponseBodyOnlineMeetingInfo onlineMeetingInfo;

    @NameInMap("organizer")
    public CreateEventResponseBodyOrganizer organizer;

    @NameInMap("recurrence")
    public CreateEventResponseBodyRecurrence recurrence;

    @NameInMap("reminders")
    public java.util.List<CreateEventResponseBodyReminders> reminders;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>4248DCC9-785F-5A14-8BE0-830FD52E1261</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("richTextDescription")
    public CreateEventResponseBodyRichTextDescription richTextDescription;

    @NameInMap("start")
    public CreateEventResponseBodyStart start;

    @NameInMap("summary")
    public String summary;

    @NameInMap("uiConfigs")
    public java.util.List<CreateEventResponseBodyUiConfigs> uiConfigs;

    /**
     * <strong>example:</strong>
     * <p>2020-01-01T10:15:30+08:00</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    public static CreateEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEventResponseBody self = new CreateEventResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEventResponseBody setAttendees(java.util.List<CreateEventResponseBodyAttendees> attendees) {
        this.attendees = attendees;
        return this;
    }
    public java.util.List<CreateEventResponseBodyAttendees> getAttendees() {
        return this.attendees;
    }

    public CreateEventResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateEventResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEventResponseBody setEnd(CreateEventResponseBodyEnd end) {
        this.end = end;
        return this;
    }
    public CreateEventResponseBodyEnd getEnd() {
        return this.end;
    }

    public CreateEventResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateEventResponseBody setIsAllDay(Boolean isAllDay) {
        this.isAllDay = isAllDay;
        return this;
    }
    public Boolean getIsAllDay() {
        return this.isAllDay;
    }

    public CreateEventResponseBody setLocation(CreateEventResponseBodyLocation location) {
        this.location = location;
        return this;
    }
    public CreateEventResponseBodyLocation getLocation() {
        return this.location;
    }

    public CreateEventResponseBody setOnlineMeetingInfo(CreateEventResponseBodyOnlineMeetingInfo onlineMeetingInfo) {
        this.onlineMeetingInfo = onlineMeetingInfo;
        return this;
    }
    public CreateEventResponseBodyOnlineMeetingInfo getOnlineMeetingInfo() {
        return this.onlineMeetingInfo;
    }

    public CreateEventResponseBody setOrganizer(CreateEventResponseBodyOrganizer organizer) {
        this.organizer = organizer;
        return this;
    }
    public CreateEventResponseBodyOrganizer getOrganizer() {
        return this.organizer;
    }

    public CreateEventResponseBody setRecurrence(CreateEventResponseBodyRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }
    public CreateEventResponseBodyRecurrence getRecurrence() {
        return this.recurrence;
    }

    public CreateEventResponseBody setReminders(java.util.List<CreateEventResponseBodyReminders> reminders) {
        this.reminders = reminders;
        return this;
    }
    public java.util.List<CreateEventResponseBodyReminders> getReminders() {
        return this.reminders;
    }

    public CreateEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEventResponseBody setRichTextDescription(CreateEventResponseBodyRichTextDescription richTextDescription) {
        this.richTextDescription = richTextDescription;
        return this;
    }
    public CreateEventResponseBodyRichTextDescription getRichTextDescription() {
        return this.richTextDescription;
    }

    public CreateEventResponseBody setStart(CreateEventResponseBodyStart start) {
        this.start = start;
        return this;
    }
    public CreateEventResponseBodyStart getStart() {
        return this.start;
    }

    public CreateEventResponseBody setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public CreateEventResponseBody setUiConfigs(java.util.List<CreateEventResponseBodyUiConfigs> uiConfigs) {
        this.uiConfigs = uiConfigs;
        return this;
    }
    public java.util.List<CreateEventResponseBodyUiConfigs> getUiConfigs() {
        return this.uiConfigs;
    }

    public CreateEventResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class CreateEventResponseBodyAttendees extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsOptional")
        public Boolean isOptional;

        /**
         * <strong>example:</strong>
         * <p>needsAction</p>
         */
        @NameInMap("ResponseStatus")
        public String responseStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Self")
        public Boolean self;

        public static CreateEventResponseBodyAttendees build(java.util.Map<String, ?> map) throws Exception {
            CreateEventResponseBodyAttendees self = new CreateEventResponseBodyAttendees();
            return TeaModel.build(map, self);
        }

        public CreateEventResponseBodyAttendees setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateEventResponseBodyAttendees setIsOptional(Boolean isOptional) {
            this.isOptional = isOptional;
            return this;
        }
        public Boolean getIsOptional() {
            return this.isOptional;
        }

        public CreateEventResponseBodyAttendees setResponseStatus(String responseStatus) {
            this.responseStatus = responseStatus;
            return this;
        }
        public String getResponseStatus() {
            return this.responseStatus;
        }

        public CreateEventResponseBodyAttendees setSelf(Boolean self) {
            this.self = self;
            return this;
        }
        public Boolean getSelf() {
            return this.self;
        }

    }

    public static class CreateEventResponseBodyEnd extends TeaModel {
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

        public static CreateEventResponseBodyEnd build(java.util.Map<String, ?> map) throws Exception {
            CreateEventResponseBodyEnd self = new CreateEventResponseBodyEnd();
            return TeaModel.build(map, self);
        }

        public CreateEventResponseBodyEnd setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public CreateEventResponseBodyEnd setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public CreateEventResponseBodyEnd setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class CreateEventResponseBodyLocation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>room 1-2-3</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        public static CreateEventResponseBodyLocation build(java.util.Map<String, ?> map) throws Exception {
            CreateEventResponseBodyLocation self = new CreateEventResponseBodyLocation();
            return TeaModel.build(map, self);
        }

        public CreateEventResponseBodyLocation setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

    public static class CreateEventResponseBodyOnlineMeetingInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ConferenceId")
        public String conferenceId;

        @NameInMap("ExtraInfo")
        public java.util.Map<String, ?> extraInfo;

        /**
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p><a href="http://meeting">http://meeting</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static CreateEventResponseBodyOnlineMeetingInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateEventResponseBodyOnlineMeetingInfo self = new CreateEventResponseBodyOnlineMeetingInfo();
            return TeaModel.build(map, self);
        }

        public CreateEventResponseBodyOnlineMeetingInfo setConferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }
        public String getConferenceId() {
            return this.conferenceId;
        }

        public CreateEventResponseBodyOnlineMeetingInfo setExtraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtraInfo() {
            return this.extraInfo;
        }

        public CreateEventResponseBodyOnlineMeetingInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateEventResponseBodyOnlineMeetingInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateEventResponseBodyOrganizer extends TeaModel {
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

        public static CreateEventResponseBodyOrganizer build(java.util.Map<String, ?> map) throws Exception {
            CreateEventResponseBodyOrganizer self = new CreateEventResponseBodyOrganizer();
            return TeaModel.build(map, self);
        }

        public CreateEventResponseBodyOrganizer setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateEventResponseBodyOrganizer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateEventResponseBodyOrganizer setResponseStatus(String responseStatus) {
            this.responseStatus = responseStatus;
            return this;
        }
        public String getResponseStatus() {
            return this.responseStatus;
        }

        public CreateEventResponseBodyOrganizer setSelf(Boolean self) {
            this.self = self;
            return this;
        }
        public Boolean getSelf() {
            return this.self;
        }

    }

    public static class CreateEventResponseBodyRecurrencePattern extends TeaModel {
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

        public static CreateEventResponseBodyRecurrencePattern build(java.util.Map<String, ?> map) throws Exception {
            CreateEventResponseBodyRecurrencePattern self = new CreateEventResponseBodyRecurrencePattern();
            return TeaModel.build(map, self);
        }

        public CreateEventResponseBodyRecurrencePattern setDayOfMonth(Integer dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            return this;
        }
        public Integer getDayOfMonth() {
            return this.dayOfMonth;
        }

        public CreateEventResponseBodyRecurrencePattern setDaysOfWeek(String daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public String getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public CreateEventResponseBodyRecurrencePattern setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public CreateEventResponseBodyRecurrencePattern setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreateEventResponseBodyRecurrencePattern setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateEventResponseBodyRecurrenceRange extends TeaModel {
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

        public static CreateEventResponseBodyRecurrenceRange build(java.util.Map<String, ?> map) throws Exception {
            CreateEventResponseBodyRecurrenceRange self = new CreateEventResponseBodyRecurrenceRange();
            return TeaModel.build(map, self);
        }

        public CreateEventResponseBodyRecurrenceRange setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public CreateEventResponseBodyRecurrenceRange setNumberOfOccurrences(Integer numberOfOccurrences) {
            this.numberOfOccurrences = numberOfOccurrences;
            return this;
        }
        public Integer getNumberOfOccurrences() {
            return this.numberOfOccurrences;
        }

        public CreateEventResponseBodyRecurrenceRange setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateEventResponseBodyRecurrence extends TeaModel {
        @NameInMap("Pattern")
        public CreateEventResponseBodyRecurrencePattern pattern;

        @NameInMap("Range")
        public CreateEventResponseBodyRecurrenceRange range;

        public static CreateEventResponseBodyRecurrence build(java.util.Map<String, ?> map) throws Exception {
            CreateEventResponseBodyRecurrence self = new CreateEventResponseBodyRecurrence();
            return TeaModel.build(map, self);
        }

        public CreateEventResponseBodyRecurrence setPattern(CreateEventResponseBodyRecurrencePattern pattern) {
            this.pattern = pattern;
            return this;
        }
        public CreateEventResponseBodyRecurrencePattern getPattern() {
            return this.pattern;
        }

        public CreateEventResponseBodyRecurrence setRange(CreateEventResponseBodyRecurrenceRange range) {
            this.range = range;
            return this;
        }
        public CreateEventResponseBodyRecurrenceRange getRange() {
            return this.range;
        }

    }

    public static class CreateEventResponseBodyReminders extends TeaModel {
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

        public static CreateEventResponseBodyReminders build(java.util.Map<String, ?> map) throws Exception {
            CreateEventResponseBodyReminders self = new CreateEventResponseBodyReminders();
            return TeaModel.build(map, self);
        }

        public CreateEventResponseBodyReminders setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public CreateEventResponseBodyReminders setMinutes(String minutes) {
            this.minutes = minutes;
            return this;
        }
        public String getMinutes() {
            return this.minutes;
        }

    }

    public static class CreateEventResponseBodyRichTextDescription extends TeaModel {
        @NameInMap("text")
        public String text;

        public static CreateEventResponseBodyRichTextDescription build(java.util.Map<String, ?> map) throws Exception {
            CreateEventResponseBodyRichTextDescription self = new CreateEventResponseBodyRichTextDescription();
            return TeaModel.build(map, self);
        }

        public CreateEventResponseBodyRichTextDescription setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class CreateEventResponseBodyStart extends TeaModel {
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

        public static CreateEventResponseBodyStart build(java.util.Map<String, ?> map) throws Exception {
            CreateEventResponseBodyStart self = new CreateEventResponseBodyStart();
            return TeaModel.build(map, self);
        }

        public CreateEventResponseBodyStart setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public CreateEventResponseBodyStart setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public CreateEventResponseBodyStart setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class CreateEventResponseBodyUiConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>updateEventButton</p>
         */
        @NameInMap("UiName")
        public String uiName;

        /**
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("UiStatus")
        public String uiStatus;

        public static CreateEventResponseBodyUiConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateEventResponseBodyUiConfigs self = new CreateEventResponseBodyUiConfigs();
            return TeaModel.build(map, self);
        }

        public CreateEventResponseBodyUiConfigs setUiName(String uiName) {
            this.uiName = uiName;
            return this;
        }
        public String getUiName() {
            return this.uiName;
        }

        public CreateEventResponseBodyUiConfigs setUiStatus(String uiStatus) {
            this.uiStatus = uiStatus;
            return this;
        }
        public String getUiStatus() {
            return this.uiStatus;
        }

    }

}
