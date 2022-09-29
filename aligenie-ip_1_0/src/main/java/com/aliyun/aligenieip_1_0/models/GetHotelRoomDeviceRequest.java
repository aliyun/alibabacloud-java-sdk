// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelRoomDeviceRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("RoomNo")
    public String roomNo;

    public static GetHotelRoomDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelRoomDeviceRequest self = new GetHotelRoomDeviceRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelRoomDeviceRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public GetHotelRoomDeviceRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

}
