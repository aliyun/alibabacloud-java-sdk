// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RemoveAttendeeRequest extends TeaModel {
    @NameInMap("AttendeesToRemove")
    public java.util.List<String> attendeesToRemove;

    @NameInMap("CalendarId")
    public String calendarId;

    @NameInMap("EventId")
    public String eventId;

    public static RemoveAttendeeRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAttendeeRequest self = new RemoveAttendeeRequest();
        return TeaModel.build(map, self);
    }

    public RemoveAttendeeRequest setAttendeesToRemove(java.util.List<String> attendeesToRemove) {
        this.attendeesToRemove = attendeesToRemove;
        return this;
    }
    public java.util.List<String> getAttendeesToRemove() {
        return this.attendeesToRemove;
    }

    public RemoveAttendeeRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public RemoveAttendeeRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

}
