// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddAttendeeShrinkRequest extends TeaModel {
    @NameInMap("AttendeesToAdd")
    public String attendeesToAddShrink;

    @NameInMap("CalendarId")
    public String calendarId;

    @NameInMap("EventId")
    public String eventId;

    public static AddAttendeeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAttendeeShrinkRequest self = new AddAttendeeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddAttendeeShrinkRequest setAttendeesToAddShrink(String attendeesToAddShrink) {
        this.attendeesToAddShrink = attendeesToAddShrink;
        return this;
    }
    public String getAttendeesToAddShrink() {
        return this.attendeesToAddShrink;
    }

    public AddAttendeeShrinkRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public AddAttendeeShrinkRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

}
