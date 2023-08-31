// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelRoomsRequest extends TeaModel {
    @NameInMap("HotelAdminRoom")
    public ListHotelRoomsRequestHotelAdminRoom hotelAdminRoom;

    @NameInMap("HotelId")
    public String hotelId;

    public static ListHotelRoomsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelRoomsRequest self = new ListHotelRoomsRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelRoomsRequest setHotelAdminRoom(ListHotelRoomsRequestHotelAdminRoom hotelAdminRoom) {
        this.hotelAdminRoom = hotelAdminRoom;
        return this;
    }
    public ListHotelRoomsRequestHotelAdminRoom getHotelAdminRoom() {
        return this.hotelAdminRoom;
    }

    public ListHotelRoomsRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public static class ListHotelRoomsRequestHotelAdminRoom extends TeaModel {
        @NameInMap("RoomNo")
        public String roomNo;

        public static ListHotelRoomsRequestHotelAdminRoom build(java.util.Map<String, ?> map) throws Exception {
            ListHotelRoomsRequestHotelAdminRoom self = new ListHotelRoomsRequestHotelAdminRoom();
            return TeaModel.build(map, self);
        }

        public ListHotelRoomsRequestHotelAdminRoom setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public String getRoomNo() {
            return this.roomNo;
        }

    }

}
