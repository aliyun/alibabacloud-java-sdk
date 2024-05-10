// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RemoveMeetingRoomsRequest extends TeaModel {
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
    public java.util.List<RemoveMeetingRoomsRequestMeetingRoomsToRemove> meetingRoomsToRemove;

    public static RemoveMeetingRoomsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveMeetingRoomsRequest self = new RemoveMeetingRoomsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveMeetingRoomsRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public RemoveMeetingRoomsRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public RemoveMeetingRoomsRequest setMeetingRoomsToRemove(java.util.List<RemoveMeetingRoomsRequestMeetingRoomsToRemove> meetingRoomsToRemove) {
        this.meetingRoomsToRemove = meetingRoomsToRemove;
        return this;
    }
    public java.util.List<RemoveMeetingRoomsRequestMeetingRoomsToRemove> getMeetingRoomsToRemove() {
        return this.meetingRoomsToRemove;
    }

    public static class RemoveMeetingRoomsRequestMeetingRoomsToRemove extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("RoomId")
        public String roomId;

        public static RemoveMeetingRoomsRequestMeetingRoomsToRemove build(java.util.Map<String, ?> map) throws Exception {
            RemoveMeetingRoomsRequestMeetingRoomsToRemove self = new RemoveMeetingRoomsRequestMeetingRoomsToRemove();
            return TeaModel.build(map, self);
        }

        public RemoveMeetingRoomsRequestMeetingRoomsToRemove setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

    }

}
