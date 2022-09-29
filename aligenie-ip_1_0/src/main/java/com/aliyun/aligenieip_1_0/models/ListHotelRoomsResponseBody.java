// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelRoomsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListHotelRoomsResponseBodyResult> result;

    public static ListHotelRoomsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotelRoomsResponseBody self = new ListHotelRoomsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotelRoomsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListHotelRoomsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotelRoomsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotelRoomsResponseBody setResult(java.util.List<ListHotelRoomsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListHotelRoomsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListHotelRoomsResponseBodyResult extends TeaModel {
        @NameInMap("HotelId")
        public String hotelId;

        @NameInMap("RoomNo")
        public String roomNo;

        public static ListHotelRoomsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListHotelRoomsResponseBodyResult self = new ListHotelRoomsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListHotelRoomsResponseBodyResult setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public ListHotelRoomsResponseBodyResult setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public String getRoomNo() {
            return this.roomNo;
        }

    }

}
