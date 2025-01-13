// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryRoomStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cf2446fc9d144c85aaee4f9ae20a96e7</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <strong>example:</strong>
     * <p>1211</p>
     */
    @NameInMap("RoomNo")
    public String roomNo;

    public static QueryRoomStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRoomStatusRequest self = new QueryRoomStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryRoomStatusRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public QueryRoomStatusRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

}
