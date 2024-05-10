// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddMeetingRoomsShrinkRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MeetingRoomsToAdd")
    public String meetingRoomsToAddShrink;

    public static AddMeetingRoomsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMeetingRoomsShrinkRequest self = new AddMeetingRoomsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddMeetingRoomsShrinkRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public AddMeetingRoomsShrinkRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public AddMeetingRoomsShrinkRequest setMeetingRoomsToAddShrink(String meetingRoomsToAddShrink) {
        this.meetingRoomsToAddShrink = meetingRoomsToAddShrink;
        return this;
    }
    public String getMeetingRoomsToAddShrink() {
        return this.meetingRoomsToAddShrink;
    }

}
