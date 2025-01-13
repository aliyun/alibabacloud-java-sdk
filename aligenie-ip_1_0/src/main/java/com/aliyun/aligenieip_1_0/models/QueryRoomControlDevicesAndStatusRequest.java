// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryRoomControlDevicesAndStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af7***536</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <strong>example:</strong>
     * <p>1211</p>
     */
    @NameInMap("RoomNo")
    public String roomNo;

    public static QueryRoomControlDevicesAndStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRoomControlDevicesAndStatusRequest self = new QueryRoomControlDevicesAndStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryRoomControlDevicesAndStatusRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public QueryRoomControlDevicesAndStatusRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

}
