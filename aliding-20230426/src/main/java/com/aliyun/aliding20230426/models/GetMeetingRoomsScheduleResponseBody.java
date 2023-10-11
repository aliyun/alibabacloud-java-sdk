// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMeetingRoomsScheduleResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("scheduleInformation")
    public java.util.List<GetMeetingRoomsScheduleResponseBodyScheduleInformation> scheduleInformation;

    public static GetMeetingRoomsScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMeetingRoomsScheduleResponseBody self = new GetMeetingRoomsScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMeetingRoomsScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMeetingRoomsScheduleResponseBody setScheduleInformation(java.util.List<GetMeetingRoomsScheduleResponseBodyScheduleInformation> scheduleInformation) {
        this.scheduleInformation = scheduleInformation;
        return this;
    }
    public java.util.List<GetMeetingRoomsScheduleResponseBodyScheduleInformation> getScheduleInformation() {
        return this.scheduleInformation;
    }

    public static class GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsEnd extends TeaModel {
        @NameInMap("DateTime")
        public String dateTime;

        @NameInMap("TimeZone")
        public String timeZone;

        public static GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsEnd build(java.util.Map<String, ?> map) throws Exception {
            GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsEnd self = new GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsEnd();
            return TeaModel.build(map, self);
        }

        public GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsEnd setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsEnd setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsOrganizer extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsOrganizer build(java.util.Map<String, ?> map) throws Exception {
            GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsOrganizer self = new GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsOrganizer();
            return TeaModel.build(map, self);
        }

        public GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsOrganizer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsStart extends TeaModel {
        @NameInMap("DateTime")
        public String dateTime;

        @NameInMap("TimeZone")
        public String timeZone;

        public static GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsStart build(java.util.Map<String, ?> map) throws Exception {
            GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsStart self = new GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsStart();
            return TeaModel.build(map, self);
        }

        public GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsStart setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsStart setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItems extends TeaModel {
        @NameInMap("End")
        public GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsEnd end;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("Organizer")
        public GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsOrganizer organizer;

        @NameInMap("Start")
        public GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsStart start;

        @NameInMap("Status")
        public String status;

        public static GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItems build(java.util.Map<String, ?> map) throws Exception {
            GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItems self = new GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItems();
            return TeaModel.build(map, self);
        }

        public GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItems setEnd(GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsEnd end) {
            this.end = end;
            return this;
        }
        public GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsEnd getEnd() {
            return this.end;
        }

        public GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItems setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItems setOrganizer(GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsOrganizer organizer) {
            this.organizer = organizer;
            return this;
        }
        public GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsOrganizer getOrganizer() {
            return this.organizer;
        }

        public GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItems setStart(GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsStart start) {
            this.start = start;
            return this;
        }
        public GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItemsStart getStart() {
            return this.start;
        }

        public GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetMeetingRoomsScheduleResponseBodyScheduleInformation extends TeaModel {
        @NameInMap("Error")
        public String error;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("ScheduleItems")
        public java.util.List<GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItems> scheduleItems;

        public static GetMeetingRoomsScheduleResponseBodyScheduleInformation build(java.util.Map<String, ?> map) throws Exception {
            GetMeetingRoomsScheduleResponseBodyScheduleInformation self = new GetMeetingRoomsScheduleResponseBodyScheduleInformation();
            return TeaModel.build(map, self);
        }

        public GetMeetingRoomsScheduleResponseBodyScheduleInformation setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetMeetingRoomsScheduleResponseBodyScheduleInformation setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetMeetingRoomsScheduleResponseBodyScheduleInformation setScheduleItems(java.util.List<GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItems> scheduleItems) {
            this.scheduleItems = scheduleItems;
            return this;
        }
        public java.util.List<GetMeetingRoomsScheduleResponseBodyScheduleInformationScheduleItems> getScheduleItems() {
            return this.scheduleItems;
        }

    }

}
