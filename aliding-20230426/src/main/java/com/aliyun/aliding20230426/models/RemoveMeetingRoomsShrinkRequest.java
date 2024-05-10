// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RemoveMeetingRoomsShrinkRequest extends TeaModel {
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

    @NameInMap("MeetingRoomsToRemove")
    public String meetingRoomsToRemoveShrink;

    public static RemoveMeetingRoomsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveMeetingRoomsShrinkRequest self = new RemoveMeetingRoomsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveMeetingRoomsShrinkRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public RemoveMeetingRoomsShrinkRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public RemoveMeetingRoomsShrinkRequest setMeetingRoomsToRemoveShrink(String meetingRoomsToRemoveShrink) {
        this.meetingRoomsToRemoveShrink = meetingRoomsToRemoveShrink;
        return this;
    }
    public String getMeetingRoomsToRemoveShrink() {
        return this.meetingRoomsToRemoveShrink;
    }

}
