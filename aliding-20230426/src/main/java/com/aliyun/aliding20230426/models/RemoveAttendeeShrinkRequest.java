// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RemoveAttendeeShrinkRequest extends TeaModel {
    @NameInMap("AttendeesToRemove")
    public String attendeesToRemoveShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>primary</p>
     */
    @NameInMap("CalendarId")
    public String calendarId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iiiP35sJadba8aBSgjrwPRKgiEiF</p>
     */
    @NameInMap("EventId")
    public String eventId;

    public static RemoveAttendeeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAttendeeShrinkRequest self = new RemoveAttendeeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveAttendeeShrinkRequest setAttendeesToRemoveShrink(String attendeesToRemoveShrink) {
        this.attendeesToRemoveShrink = attendeesToRemoveShrink;
        return this;
    }
    public String getAttendeesToRemoveShrink() {
        return this.attendeesToRemoveShrink;
    }

    public RemoveAttendeeShrinkRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public RemoveAttendeeShrinkRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

}
