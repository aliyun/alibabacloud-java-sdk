// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddAttendeeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AttendeesToAdd")
    public java.util.List<AddAttendeeRequestAttendeesToAdd> attendeesToAdd;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CalendarId")
    public String calendarId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("chatNotification")
    public Boolean chatNotification;

    @NameInMap("pushNotification")
    public Boolean pushNotification;

    public static AddAttendeeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAttendeeRequest self = new AddAttendeeRequest();
        return TeaModel.build(map, self);
    }

    public AddAttendeeRequest setAttendeesToAdd(java.util.List<AddAttendeeRequestAttendeesToAdd> attendeesToAdd) {
        this.attendeesToAdd = attendeesToAdd;
        return this;
    }
    public java.util.List<AddAttendeeRequestAttendeesToAdd> getAttendeesToAdd() {
        return this.attendeesToAdd;
    }

    public AddAttendeeRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public AddAttendeeRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public AddAttendeeRequest setChatNotification(Boolean chatNotification) {
        this.chatNotification = chatNotification;
        return this;
    }
    public Boolean getChatNotification() {
        return this.chatNotification;
    }

    public AddAttendeeRequest setPushNotification(Boolean pushNotification) {
        this.pushNotification = pushNotification;
        return this;
    }
    public Boolean getPushNotification() {
        return this.pushNotification;
    }

    public static class AddAttendeeRequestAttendeesToAdd extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("isOptional")
        public Boolean isOptional;

        public static AddAttendeeRequestAttendeesToAdd build(java.util.Map<String, ?> map) throws Exception {
            AddAttendeeRequestAttendeesToAdd self = new AddAttendeeRequestAttendeesToAdd();
            return TeaModel.build(map, self);
        }

        public AddAttendeeRequestAttendeesToAdd setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddAttendeeRequestAttendeesToAdd setIsOptional(Boolean isOptional) {
            this.isOptional = isOptional;
            return this;
        }
        public Boolean getIsOptional() {
            return this.isOptional;
        }

    }

}
