// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteEventRequest extends TeaModel {
    @NameInMap("CalendarId")
    public String calendarId;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("pushNotification")
    public Boolean pushNotification;

    public static DeleteEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRequest self = new DeleteEventRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public DeleteEventRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DeleteEventRequest setPushNotification(Boolean pushNotification) {
        this.pushNotification = pushNotification;
        return this;
    }
    public Boolean getPushNotification() {
        return this.pushNotification;
    }

}
