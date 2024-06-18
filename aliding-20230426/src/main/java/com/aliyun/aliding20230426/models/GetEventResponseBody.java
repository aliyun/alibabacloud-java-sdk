// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetEventResponseBody extends TeaModel {
    @NameInMap("attendees")
    public java.util.List<GetEventResponseBodyAttendees> attendees;

    @NameInMap("categories")
    public java.util.List<GetEventResponseBodyCategories> categories;

    /**
     * <strong>example:</strong>
     * <p>2020-01-01T10:15:30+08:00</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>2020-01-01T10:15:30+08:00</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("end")
    public GetEventResponseBodyEnd end;

    @NameInMap("extendedProperties")
    public GetEventResponseBodyExtendedProperties extendedProperties;

    /**
     * <strong>example:</strong>
     * <p>iiiP35sJxxxxPRKgiEiF</p>
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
    public GetEventResponseBodyLocation location;

    @NameInMap("meetingRooms")
    public java.util.List<GetEventResponseBodyMeetingRooms> meetingRooms;

    @NameInMap("onlineMeetingInfo")
    public GetEventResponseBodyOnlineMeetingInfo onlineMeetingInfo;

    @NameInMap("organizer")
    public GetEventResponseBodyOrganizer organizer;

    @NameInMap("originStart")
    public GetEventResponseBodyOriginStart originStart;

    @NameInMap("recurrence")
    public GetEventResponseBodyRecurrence recurrence;

    @NameInMap("reminders")
    public java.util.List<GetEventResponseBodyReminders> reminders;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("richTextDescription")
    public GetEventResponseBodyRichTextDescription richTextDescription;

    /**
     * <strong>example:</strong>
     * <p>cnNTbW1YbxxxxvdlQrQT09</p>
     */
    @NameInMap("seriesMasterId")
    public String seriesMasterId;

    @NameInMap("start")
    public GetEventResponseBodyStart start;

    /**
     * <strong>example:</strong>
     * <p>confirmed</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>test event</p>
     */
    @NameInMap("summary")
    public String summary;

    /**
     * <strong>example:</strong>
     * <p>2020-01-01T10:15:30+08:00</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    public static GetEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEventResponseBody self = new GetEventResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEventResponseBody setAttendees(java.util.List<GetEventResponseBodyAttendees> attendees) {
        this.attendees = attendees;
        return this;
    }
    public java.util.List<GetEventResponseBodyAttendees> getAttendees() {
        return this.attendees;
    }

    public GetEventResponseBody setCategories(java.util.List<GetEventResponseBodyCategories> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<GetEventResponseBodyCategories> getCategories() {
        return this.categories;
    }

    public GetEventResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetEventResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetEventResponseBody setEnd(GetEventResponseBodyEnd end) {
        this.end = end;
        return this;
    }
    public GetEventResponseBodyEnd getEnd() {
        return this.end;
    }

    public GetEventResponseBody setExtendedProperties(GetEventResponseBodyExtendedProperties extendedProperties) {
        this.extendedProperties = extendedProperties;
        return this;
    }
    public GetEventResponseBodyExtendedProperties getExtendedProperties() {
        return this.extendedProperties;
    }

    public GetEventResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetEventResponseBody setIsAllDay(Boolean isAllDay) {
        this.isAllDay = isAllDay;
        return this;
    }
    public Boolean getIsAllDay() {
        return this.isAllDay;
    }

    public GetEventResponseBody setLocation(GetEventResponseBodyLocation location) {
        this.location = location;
        return this;
    }
    public GetEventResponseBodyLocation getLocation() {
        return this.location;
    }

    public GetEventResponseBody setMeetingRooms(java.util.List<GetEventResponseBodyMeetingRooms> meetingRooms) {
        this.meetingRooms = meetingRooms;
        return this;
    }
    public java.util.List<GetEventResponseBodyMeetingRooms> getMeetingRooms() {
        return this.meetingRooms;
    }

    public GetEventResponseBody setOnlineMeetingInfo(GetEventResponseBodyOnlineMeetingInfo onlineMeetingInfo) {
        this.onlineMeetingInfo = onlineMeetingInfo;
        return this;
    }
    public GetEventResponseBodyOnlineMeetingInfo getOnlineMeetingInfo() {
        return this.onlineMeetingInfo;
    }

    public GetEventResponseBody setOrganizer(GetEventResponseBodyOrganizer organizer) {
        this.organizer = organizer;
        return this;
    }
    public GetEventResponseBodyOrganizer getOrganizer() {
        return this.organizer;
    }

    public GetEventResponseBody setOriginStart(GetEventResponseBodyOriginStart originStart) {
        this.originStart = originStart;
        return this;
    }
    public GetEventResponseBodyOriginStart getOriginStart() {
        return this.originStart;
    }

    public GetEventResponseBody setRecurrence(GetEventResponseBodyRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }
    public GetEventResponseBodyRecurrence getRecurrence() {
        return this.recurrence;
    }

    public GetEventResponseBody setReminders(java.util.List<GetEventResponseBodyReminders> reminders) {
        this.reminders = reminders;
        return this;
    }
    public java.util.List<GetEventResponseBodyReminders> getReminders() {
        return this.reminders;
    }

    public GetEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEventResponseBody setRichTextDescription(GetEventResponseBodyRichTextDescription richTextDescription) {
        this.richTextDescription = richTextDescription;
        return this;
    }
    public GetEventResponseBodyRichTextDescription getRichTextDescription() {
        return this.richTextDescription;
    }

    public GetEventResponseBody setSeriesMasterId(String seriesMasterId) {
        this.seriesMasterId = seriesMasterId;
        return this;
    }
    public String getSeriesMasterId() {
        return this.seriesMasterId;
    }

    public GetEventResponseBody setStart(GetEventResponseBodyStart start) {
        this.start = start;
        return this;
    }
    public GetEventResponseBodyStart getStart() {
        return this.start;
    }

    public GetEventResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetEventResponseBody setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public GetEventResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class GetEventResponseBodyAttendees extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>jack</p>
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

        public static GetEventResponseBodyAttendees build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyAttendees self = new GetEventResponseBodyAttendees();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyAttendees setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetEventResponseBodyAttendees setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetEventResponseBodyAttendees setIsOptional(Boolean isOptional) {
            this.isOptional = isOptional;
            return this;
        }
        public Boolean getIsOptional() {
            return this.isOptional;
        }

        public GetEventResponseBodyAttendees setResponseStatus(String responseStatus) {
            this.responseStatus = responseStatus;
            return this;
        }
        public String getResponseStatus() {
            return this.responseStatus;
        }

        public GetEventResponseBodyAttendees setSelf(Boolean self) {
            this.self = self;
            return this;
        }
        public Boolean getSelf() {
            return this.self;
        }

    }

    public static class GetEventResponseBodyCategories extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        public static GetEventResponseBodyCategories build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyCategories self = new GetEventResponseBodyCategories();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyCategories setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

    public static class GetEventResponseBodyEnd extends TeaModel {
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

        public static GetEventResponseBodyEnd build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyEnd self = new GetEventResponseBodyEnd();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyEnd setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetEventResponseBodyEnd setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public GetEventResponseBodyEnd setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class GetEventResponseBodyExtendedPropertiesSharedProperties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dingd*****1231231</p>
         */
        @NameInMap("BelongCorpId")
        public String belongCorpId;

        /**
         * <strong>example:</strong>
         * <p>zxcvasdfvb123====</p>
         */
        @NameInMap("SourceOpenCid")
        public String sourceOpenCid;

        public static GetEventResponseBodyExtendedPropertiesSharedProperties build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyExtendedPropertiesSharedProperties self = new GetEventResponseBodyExtendedPropertiesSharedProperties();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyExtendedPropertiesSharedProperties setBelongCorpId(String belongCorpId) {
            this.belongCorpId = belongCorpId;
            return this;
        }
        public String getBelongCorpId() {
            return this.belongCorpId;
        }

        public GetEventResponseBodyExtendedPropertiesSharedProperties setSourceOpenCid(String sourceOpenCid) {
            this.sourceOpenCid = sourceOpenCid;
            return this;
        }
        public String getSourceOpenCid() {
            return this.sourceOpenCid;
        }

    }

    public static class GetEventResponseBodyExtendedProperties extends TeaModel {
        @NameInMap("SharedProperties")
        public GetEventResponseBodyExtendedPropertiesSharedProperties sharedProperties;

        public static GetEventResponseBodyExtendedProperties build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyExtendedProperties self = new GetEventResponseBodyExtendedProperties();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyExtendedProperties setSharedProperties(GetEventResponseBodyExtendedPropertiesSharedProperties sharedProperties) {
            this.sharedProperties = sharedProperties;
            return this;
        }
        public GetEventResponseBodyExtendedPropertiesSharedProperties getSharedProperties() {
            return this.sharedProperties;
        }

    }

    public static class GetEventResponseBodyLocation extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>--</p>
         */
        @NameInMap("MeetingRooms")
        public java.util.List<String> meetingRooms;

        public static GetEventResponseBodyLocation build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyLocation self = new GetEventResponseBodyLocation();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyLocation setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetEventResponseBodyLocation setMeetingRooms(java.util.List<String> meetingRooms) {
            this.meetingRooms = meetingRooms;
            return this;
        }
        public java.util.List<String> getMeetingRooms() {
            return this.meetingRooms;
        }

    }

    public static class GetEventResponseBodyMeetingRooms extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>room 1-2-3</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>accepted</p>
         */
        @NameInMap("ResponseStatus")
        public String responseStatus;

        /**
         * <strong>example:</strong>
         * <p>c10315a8b4e740a317813ab6fxxxxxx</p>
         */
        @NameInMap("RoomId")
        public String roomId;

        public static GetEventResponseBodyMeetingRooms build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyMeetingRooms self = new GetEventResponseBodyMeetingRooms();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyMeetingRooms setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetEventResponseBodyMeetingRooms setResponseStatus(String responseStatus) {
            this.responseStatus = responseStatus;
            return this;
        }
        public String getResponseStatus() {
            return this.responseStatus;
        }

        public GetEventResponseBodyMeetingRooms setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

    }

    public static class GetEventResponseBodyOnlineMeetingInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5c4df21d-xxxx-a6db402b9f3a</p>
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
         * <p>dingtalk://dingtalkclient/page/videoxxxxalendar?confId=5c4df21d-xxxx9f3f&amp;calendarId=127xxxx124</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetEventResponseBodyOnlineMeetingInfo build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyOnlineMeetingInfo self = new GetEventResponseBodyOnlineMeetingInfo();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyOnlineMeetingInfo setConferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }
        public String getConferenceId() {
            return this.conferenceId;
        }

        public GetEventResponseBodyOnlineMeetingInfo setExtraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtraInfo() {
            return this.extraInfo;
        }

        public GetEventResponseBodyOnlineMeetingInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetEventResponseBodyOnlineMeetingInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetEventResponseBodyOrganizer extends TeaModel {
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

        public static GetEventResponseBodyOrganizer build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyOrganizer self = new GetEventResponseBodyOrganizer();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyOrganizer setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetEventResponseBodyOrganizer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetEventResponseBodyOrganizer setResponseStatus(String responseStatus) {
            this.responseStatus = responseStatus;
            return this;
        }
        public String getResponseStatus() {
            return this.responseStatus;
        }

        public GetEventResponseBodyOrganizer setSelf(Boolean self) {
            this.self = self;
            return this;
        }
        public Boolean getSelf() {
            return this.self;
        }

    }

    public static class GetEventResponseBodyOriginStart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-01-01T00:00:00Z</p>
         */
        @NameInMap("DateTime")
        public String dateTime;

        public static GetEventResponseBodyOriginStart build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyOriginStart self = new GetEventResponseBodyOriginStart();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyOriginStart setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

    }

    public static class GetEventResponseBodyRecurrencePattern extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("DayOfMonth")
        public Integer dayOfMonth;

        /**
         * <strong>example:</strong>
         * <p>monday</p>
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

        public static GetEventResponseBodyRecurrencePattern build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyRecurrencePattern self = new GetEventResponseBodyRecurrencePattern();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyRecurrencePattern setDayOfMonth(Integer dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            return this;
        }
        public Integer getDayOfMonth() {
            return this.dayOfMonth;
        }

        public GetEventResponseBodyRecurrencePattern setDaysOfWeek(String daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public String getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public GetEventResponseBodyRecurrencePattern setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetEventResponseBodyRecurrencePattern setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public GetEventResponseBodyRecurrencePattern setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetEventResponseBodyRecurrenceRange extends TeaModel {
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

        public static GetEventResponseBodyRecurrenceRange build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyRecurrenceRange self = new GetEventResponseBodyRecurrenceRange();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyRecurrenceRange setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetEventResponseBodyRecurrenceRange setNumberOfOccurrences(Integer numberOfOccurrences) {
            this.numberOfOccurrences = numberOfOccurrences;
            return this;
        }
        public Integer getNumberOfOccurrences() {
            return this.numberOfOccurrences;
        }

        public GetEventResponseBodyRecurrenceRange setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetEventResponseBodyRecurrence extends TeaModel {
        @NameInMap("Pattern")
        public GetEventResponseBodyRecurrencePattern pattern;

        @NameInMap("Range")
        public GetEventResponseBodyRecurrenceRange range;

        public static GetEventResponseBodyRecurrence build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyRecurrence self = new GetEventResponseBodyRecurrence();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyRecurrence setPattern(GetEventResponseBodyRecurrencePattern pattern) {
            this.pattern = pattern;
            return this;
        }
        public GetEventResponseBodyRecurrencePattern getPattern() {
            return this.pattern;
        }

        public GetEventResponseBodyRecurrence setRange(GetEventResponseBodyRecurrenceRange range) {
            this.range = range;
            return this;
        }
        public GetEventResponseBodyRecurrenceRange getRange() {
            return this.range;
        }

    }

    public static class GetEventResponseBodyReminders extends TeaModel {
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

        public static GetEventResponseBodyReminders build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyReminders self = new GetEventResponseBodyReminders();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyReminders setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetEventResponseBodyReminders setMinutes(String minutes) {
            this.minutes = minutes;
            return this;
        }
        public String getMinutes() {
            return this.minutes;
        }

    }

    public static class GetEventResponseBodyRichTextDescription extends TeaModel {
        @NameInMap("Text")
        public String text;

        public static GetEventResponseBodyRichTextDescription build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyRichTextDescription self = new GetEventResponseBodyRichTextDescription();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyRichTextDescription setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetEventResponseBodyStart extends TeaModel {
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

        public static GetEventResponseBodyStart build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyStart self = new GetEventResponseBodyStart();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyStart setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetEventResponseBodyStart setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public GetEventResponseBodyStart setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

}
