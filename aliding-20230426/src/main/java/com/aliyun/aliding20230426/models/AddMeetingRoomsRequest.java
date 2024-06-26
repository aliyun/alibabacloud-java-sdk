// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddMeetingRoomsRequest extends TeaModel {
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
     * <p>U5Kxxxxx</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MeetingRoomsToAdd")
    public java.util.List<AddMeetingRoomsRequestMeetingRoomsToAdd> meetingRoomsToAdd;

    public static AddMeetingRoomsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMeetingRoomsRequest self = new AddMeetingRoomsRequest();
        return TeaModel.build(map, self);
    }

    public AddMeetingRoomsRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public AddMeetingRoomsRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public AddMeetingRoomsRequest setMeetingRoomsToAdd(java.util.List<AddMeetingRoomsRequestMeetingRoomsToAdd> meetingRoomsToAdd) {
        this.meetingRoomsToAdd = meetingRoomsToAdd;
        return this;
    }
    public java.util.List<AddMeetingRoomsRequestMeetingRoomsToAdd> getMeetingRoomsToAdd() {
        return this.meetingRoomsToAdd;
    }

    public static class AddMeetingRoomsRequestMeetingRoomsToAdd extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4002fxxxxx</p>
         */
        @NameInMap("RoomId")
        public String roomId;

        public static AddMeetingRoomsRequestMeetingRoomsToAdd build(java.util.Map<String, ?> map) throws Exception {
            AddMeetingRoomsRequestMeetingRoomsToAdd self = new AddMeetingRoomsRequestMeetingRoomsToAdd();
            return TeaModel.build(map, self);
        }

        public AddMeetingRoomsRequestMeetingRoomsToAdd setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

    }

}
