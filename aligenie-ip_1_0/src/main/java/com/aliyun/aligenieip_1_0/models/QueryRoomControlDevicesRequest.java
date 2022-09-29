// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryRoomControlDevicesRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("RoomNo")
    public String roomNo;

    public static QueryRoomControlDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRoomControlDevicesRequest self = new QueryRoomControlDevicesRequest();
        return TeaModel.build(map, self);
    }

    public QueryRoomControlDevicesRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public QueryRoomControlDevicesRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

}
