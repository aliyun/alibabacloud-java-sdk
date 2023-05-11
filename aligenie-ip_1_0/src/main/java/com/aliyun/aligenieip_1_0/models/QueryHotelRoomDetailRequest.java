// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryHotelRoomDetailRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("Mac")
    public String mac;

    @NameInMap("RoomNo")
    public String roomNo;

    @NameInMap("Uuid")
    public String uuid;

    public static QueryHotelRoomDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotelRoomDetailRequest self = new QueryHotelRoomDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotelRoomDetailRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public QueryHotelRoomDetailRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public QueryHotelRoomDetailRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

    public QueryHotelRoomDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
