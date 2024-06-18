// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListEventsResponseBody extends TeaModel {
    @NameInMap("events")
    public java.util.List<ListEventsResponseBodyEvents> events;

    /**
     * <strong>example:</strong>
     * <p>cnNTbW1YbxxxxdlQrQT09</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>4248DCC9-785F-5A14-8BE0-830FD52E1261</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>zxcasdfvc000009</p>
     */
    @NameInMap("syncToken")
    public String syncToken;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static ListEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventsResponseBody self = new ListEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventsResponseBody setEvents(java.util.List<ListEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<ListEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public ListEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventsResponseBody setSyncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }
    public String getSyncToken() {
        return this.syncToken;
    }

    public ListEventsResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public ListEventsResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class ListEventsResponseBodyEventsAttendees extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>tony</p>
         */
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

        public static ListEventsResponseBodyEventsAttendees build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEventsAttendees self = new ListEventsResponseBodyEventsAttendees();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEventsAttendees setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListEventsResponseBodyEventsAttendees setIsOptional(Boolean isOptional) {
            this.isOptional = isOptional;
            return this;
        }
        public Boolean getIsOptional() {
            return this.isOptional;
        }

        public ListEventsResponseBodyEventsAttendees setResponseStatus(String responseStatus) {
            this.responseStatus = responseStatus;
            return this;
        }
        public String getResponseStatus() {
            return this.responseStatus;
        }

        public ListEventsResponseBodyEventsAttendees setSelf(Boolean self) {
            this.self = self;
            return this;
        }
        public Boolean getSelf() {
            return this.self;
        }

    }

    public static class ListEventsResponseBodyEventsCategories extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        public static ListEventsResponseBodyEventsCategories build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEventsCategories self = new ListEventsResponseBodyEventsCategories();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEventsCategories setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

    public static class ListEventsResponseBodyEventsEnd extends TeaModel {
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

        public static ListEventsResponseBodyEventsEnd build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEventsEnd self = new ListEventsResponseBodyEventsEnd();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEventsEnd setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListEventsResponseBodyEventsEnd setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public ListEventsResponseBodyEventsEnd setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class ListEventsResponseBodyEventsExtendedPropertiesSharedProperties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ding*********31</p>
         */
        @NameInMap("BelongCorpId")
        public String belongCorpId;

        /**
         * <strong>example:</strong>
         * <p>zxcv90asdf123===</p>
         */
        @NameInMap("SourceOpenCid")
        public String sourceOpenCid;

        public static ListEventsResponseBodyEventsExtendedPropertiesSharedProperties build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEventsExtendedPropertiesSharedProperties self = new ListEventsResponseBodyEventsExtendedPropertiesSharedProperties();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEventsExtendedPropertiesSharedProperties setBelongCorpId(String belongCorpId) {
            this.belongCorpId = belongCorpId;
            return this;
        }
        public String getBelongCorpId() {
            return this.belongCorpId;
        }

        public ListEventsResponseBodyEventsExtendedPropertiesSharedProperties setSourceOpenCid(String sourceOpenCid) {
            this.sourceOpenCid = sourceOpenCid;
            return this;
        }
        public String getSourceOpenCid() {
            return this.sourceOpenCid;
        }

    }

    public static class ListEventsResponseBodyEventsExtendedProperties extends TeaModel {
        @NameInMap("SharedProperties")
        public ListEventsResponseBodyEventsExtendedPropertiesSharedProperties sharedProperties;

        public static ListEventsResponseBodyEventsExtendedProperties build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEventsExtendedProperties self = new ListEventsResponseBodyEventsExtendedProperties();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEventsExtendedProperties setSharedProperties(ListEventsResponseBodyEventsExtendedPropertiesSharedProperties sharedProperties) {
            this.sharedProperties = sharedProperties;
            return this;
        }
        public ListEventsResponseBodyEventsExtendedPropertiesSharedProperties getSharedProperties() {
            return this.sharedProperties;
        }

    }

    public static class ListEventsResponseBodyEventsLocation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>room 1-2-3</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("MeetingRooms")
        public java.util.List<String> meetingRooms;

        public static ListEventsResponseBodyEventsLocation build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEventsLocation self = new ListEventsResponseBodyEventsLocation();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEventsLocation setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListEventsResponseBodyEventsLocation setMeetingRooms(java.util.List<String> meetingRooms) {
            this.meetingRooms = meetingRooms;
            return this;
        }
        public java.util.List<String> getMeetingRooms() {
            return this.meetingRooms;
        }

    }

    public static class ListEventsResponseBodyEventsMeetingRooms extends TeaModel {
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

        public static ListEventsResponseBodyEventsMeetingRooms build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEventsMeetingRooms self = new ListEventsResponseBodyEventsMeetingRooms();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEventsMeetingRooms setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListEventsResponseBodyEventsMeetingRooms setResponseStatus(String responseStatus) {
            this.responseStatus = responseStatus;
            return this;
        }
        public String getResponseStatus() {
            return this.responseStatus;
        }

        public ListEventsResponseBodyEventsMeetingRooms setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

    }

    public static class ListEventsResponseBodyEventsOnlineMeetingInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5c4df21dxxxx-a6db402b9f3a</p>
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
         * <p>dingtalk://dingtalkclient/page/videoCoxxxxndar?confId=5c4df21dxxxx2b9f3a&amp;calendarId=92xxxx36</p>
         */
        @NameInMap("Url")
        public String url;

        public static ListEventsResponseBodyEventsOnlineMeetingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEventsOnlineMeetingInfo self = new ListEventsResponseBodyEventsOnlineMeetingInfo();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEventsOnlineMeetingInfo setConferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }
        public String getConferenceId() {
            return this.conferenceId;
        }

        public ListEventsResponseBodyEventsOnlineMeetingInfo setExtraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtraInfo() {
            return this.extraInfo;
        }

        public ListEventsResponseBodyEventsOnlineMeetingInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListEventsResponseBodyEventsOnlineMeetingInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListEventsResponseBodyEventsOrganizer extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>tony</p>
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
         * <p>true</p>
         */
        @NameInMap("Self")
        public Boolean self;

        public static ListEventsResponseBodyEventsOrganizer build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEventsOrganizer self = new ListEventsResponseBodyEventsOrganizer();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEventsOrganizer setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListEventsResponseBodyEventsOrganizer setResponseStatus(String responseStatus) {
            this.responseStatus = responseStatus;
            return this;
        }
        public String getResponseStatus() {
            return this.responseStatus;
        }

        public ListEventsResponseBodyEventsOrganizer setSelf(Boolean self) {
            this.self = self;
            return this;
        }
        public Boolean getSelf() {
            return this.self;
        }

    }

    public static class ListEventsResponseBodyEventsOriginStart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-01-01T00:00:00Z</p>
         */
        @NameInMap("DateTime")
        public String dateTime;

        public static ListEventsResponseBodyEventsOriginStart build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEventsOriginStart self = new ListEventsResponseBodyEventsOriginStart();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEventsOriginStart setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

    }

    public static class ListEventsResponseBodyEventsRecurrencePattern extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
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

        public static ListEventsResponseBodyEventsRecurrencePattern build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEventsRecurrencePattern self = new ListEventsResponseBodyEventsRecurrencePattern();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEventsRecurrencePattern setDayOfMonth(Integer dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            return this;
        }
        public Integer getDayOfMonth() {
            return this.dayOfMonth;
        }

        public ListEventsResponseBodyEventsRecurrencePattern setDaysOfWeek(String daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public String getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public ListEventsResponseBodyEventsRecurrencePattern setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public ListEventsResponseBodyEventsRecurrencePattern setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ListEventsResponseBodyEventsRecurrencePattern setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListEventsResponseBodyEventsRecurrenceRange extends TeaModel {
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

        public static ListEventsResponseBodyEventsRecurrenceRange build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEventsRecurrenceRange self = new ListEventsResponseBodyEventsRecurrenceRange();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEventsRecurrenceRange setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListEventsResponseBodyEventsRecurrenceRange setNumberOfOccurrences(Integer numberOfOccurrences) {
            this.numberOfOccurrences = numberOfOccurrences;
            return this;
        }
        public Integer getNumberOfOccurrences() {
            return this.numberOfOccurrences;
        }

        public ListEventsResponseBodyEventsRecurrenceRange setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListEventsResponseBodyEventsRecurrence extends TeaModel {
        @NameInMap("Pattern")
        public ListEventsResponseBodyEventsRecurrencePattern pattern;

        @NameInMap("Range")
        public ListEventsResponseBodyEventsRecurrenceRange range;

        public static ListEventsResponseBodyEventsRecurrence build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEventsRecurrence self = new ListEventsResponseBodyEventsRecurrence();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEventsRecurrence setPattern(ListEventsResponseBodyEventsRecurrencePattern pattern) {
            this.pattern = pattern;
            return this;
        }
        public ListEventsResponseBodyEventsRecurrencePattern getPattern() {
            return this.pattern;
        }

        public ListEventsResponseBodyEventsRecurrence setRange(ListEventsResponseBodyEventsRecurrenceRange range) {
            this.range = range;
            return this;
        }
        public ListEventsResponseBodyEventsRecurrenceRange getRange() {
            return this.range;
        }

    }

    public static class ListEventsResponseBodyEventsReminders extends TeaModel {
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

        public static ListEventsResponseBodyEventsReminders build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEventsReminders self = new ListEventsResponseBodyEventsReminders();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEventsReminders setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListEventsResponseBodyEventsReminders setMinutes(String minutes) {
            this.minutes = minutes;
            return this;
        }
        public String getMinutes() {
            return this.minutes;
        }

    }

    public static class ListEventsResponseBodyEventsRichTextDescription extends TeaModel {
        @NameInMap("Text")
        public String text;

        public static ListEventsResponseBodyEventsRichTextDescription build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEventsRichTextDescription self = new ListEventsResponseBodyEventsRichTextDescription();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEventsRichTextDescription setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ListEventsResponseBodyEventsStart extends TeaModel {
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

        public static ListEventsResponseBodyEventsStart build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEventsStart self = new ListEventsResponseBodyEventsStart();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEventsStart setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListEventsResponseBodyEventsStart setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public ListEventsResponseBodyEventsStart setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class ListEventsResponseBodyEvents extends TeaModel {
        @NameInMap("Attendees")
        public java.util.List<ListEventsResponseBodyEventsAttendees> attendees;

        @NameInMap("Categories")
        public java.util.List<ListEventsResponseBodyEventsCategories> categories;

        /**
         * <strong>example:</strong>
         * <p>2020-01-01T10:15:30+08:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>something about this event</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("End")
        public ListEventsResponseBodyEventsEnd end;

        @NameInMap("ExtendedProperties")
        public ListEventsResponseBodyEventsExtendedProperties extendedProperties;

        /**
         * <strong>example:</strong>
         * <p>cnNTbW1YbxxxxdEgvdlQrQT09</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsAllDay")
        public Boolean isAllDay;

        @NameInMap("Location")
        public ListEventsResponseBodyEventsLocation location;

        @NameInMap("MeetingRooms")
        public java.util.List<ListEventsResponseBodyEventsMeetingRooms> meetingRooms;

        @NameInMap("OnlineMeetingInfo")
        public ListEventsResponseBodyEventsOnlineMeetingInfo onlineMeetingInfo;

        @NameInMap("Organizer")
        public ListEventsResponseBodyEventsOrganizer organizer;

        @NameInMap("OriginStart")
        public ListEventsResponseBodyEventsOriginStart originStart;

        @NameInMap("Recurrence")
        public ListEventsResponseBodyEventsRecurrence recurrence;

        @NameInMap("Reminders")
        public java.util.List<ListEventsResponseBodyEventsReminders> reminders;

        @NameInMap("RichTextDescription")
        public ListEventsResponseBodyEventsRichTextDescription richTextDescription;

        /**
         * <strong>example:</strong>
         * <p>cnNTbWxxxxaFJZdEgvdlQrQT09</p>
         */
        @NameInMap("SeriesMasterId")
        public String seriesMasterId;

        @NameInMap("Start")
        public ListEventsResponseBodyEventsStart start;

        /**
         * <strong>example:</strong>
         * <p>confirmed</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>2020-01-01T10:15:30+08:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyEvents self = new ListEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyEvents setAttendees(java.util.List<ListEventsResponseBodyEventsAttendees> attendees) {
            this.attendees = attendees;
            return this;
        }
        public java.util.List<ListEventsResponseBodyEventsAttendees> getAttendees() {
            return this.attendees;
        }

        public ListEventsResponseBodyEvents setCategories(java.util.List<ListEventsResponseBodyEventsCategories> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<ListEventsResponseBodyEventsCategories> getCategories() {
            return this.categories;
        }

        public ListEventsResponseBodyEvents setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEventsResponseBodyEvents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEventsResponseBodyEvents setEnd(ListEventsResponseBodyEventsEnd end) {
            this.end = end;
            return this;
        }
        public ListEventsResponseBodyEventsEnd getEnd() {
            return this.end;
        }

        public ListEventsResponseBodyEvents setExtendedProperties(ListEventsResponseBodyEventsExtendedProperties extendedProperties) {
            this.extendedProperties = extendedProperties;
            return this;
        }
        public ListEventsResponseBodyEventsExtendedProperties getExtendedProperties() {
            return this.extendedProperties;
        }

        public ListEventsResponseBodyEvents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListEventsResponseBodyEvents setIsAllDay(Boolean isAllDay) {
            this.isAllDay = isAllDay;
            return this;
        }
        public Boolean getIsAllDay() {
            return this.isAllDay;
        }

        public ListEventsResponseBodyEvents setLocation(ListEventsResponseBodyEventsLocation location) {
            this.location = location;
            return this;
        }
        public ListEventsResponseBodyEventsLocation getLocation() {
            return this.location;
        }

        public ListEventsResponseBodyEvents setMeetingRooms(java.util.List<ListEventsResponseBodyEventsMeetingRooms> meetingRooms) {
            this.meetingRooms = meetingRooms;
            return this;
        }
        public java.util.List<ListEventsResponseBodyEventsMeetingRooms> getMeetingRooms() {
            return this.meetingRooms;
        }

        public ListEventsResponseBodyEvents setOnlineMeetingInfo(ListEventsResponseBodyEventsOnlineMeetingInfo onlineMeetingInfo) {
            this.onlineMeetingInfo = onlineMeetingInfo;
            return this;
        }
        public ListEventsResponseBodyEventsOnlineMeetingInfo getOnlineMeetingInfo() {
            return this.onlineMeetingInfo;
        }

        public ListEventsResponseBodyEvents setOrganizer(ListEventsResponseBodyEventsOrganizer organizer) {
            this.organizer = organizer;
            return this;
        }
        public ListEventsResponseBodyEventsOrganizer getOrganizer() {
            return this.organizer;
        }

        public ListEventsResponseBodyEvents setOriginStart(ListEventsResponseBodyEventsOriginStart originStart) {
            this.originStart = originStart;
            return this;
        }
        public ListEventsResponseBodyEventsOriginStart getOriginStart() {
            return this.originStart;
        }

        public ListEventsResponseBodyEvents setRecurrence(ListEventsResponseBodyEventsRecurrence recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public ListEventsResponseBodyEventsRecurrence getRecurrence() {
            return this.recurrence;
        }

        public ListEventsResponseBodyEvents setReminders(java.util.List<ListEventsResponseBodyEventsReminders> reminders) {
            this.reminders = reminders;
            return this;
        }
        public java.util.List<ListEventsResponseBodyEventsReminders> getReminders() {
            return this.reminders;
        }

        public ListEventsResponseBodyEvents setRichTextDescription(ListEventsResponseBodyEventsRichTextDescription richTextDescription) {
            this.richTextDescription = richTextDescription;
            return this;
        }
        public ListEventsResponseBodyEventsRichTextDescription getRichTextDescription() {
            return this.richTextDescription;
        }

        public ListEventsResponseBodyEvents setSeriesMasterId(String seriesMasterId) {
            this.seriesMasterId = seriesMasterId;
            return this;
        }
        public String getSeriesMasterId() {
            return this.seriesMasterId;
        }

        public ListEventsResponseBodyEvents setStart(ListEventsResponseBodyEventsStart start) {
            this.start = start;
            return this;
        }
        public ListEventsResponseBodyEventsStart getStart() {
            return this.start;
        }

        public ListEventsResponseBodyEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEventsResponseBodyEvents setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListEventsResponseBodyEvents setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
