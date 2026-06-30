// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetEventRequest extends TeaModel {
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

    @NameInMap("MaxAttendees")
    public Long maxAttendees;

    public static GetEventRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventRequest self = new GetEventRequest();
        return TeaModel.build(map, self);
    }

    public GetEventRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public GetEventRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetEventRequest setMaxAttendees(Long maxAttendees) {
        this.maxAttendees = maxAttendees;
        return this;
    }
    public Long getMaxAttendees() {
        return this.maxAttendees;
    }

}
