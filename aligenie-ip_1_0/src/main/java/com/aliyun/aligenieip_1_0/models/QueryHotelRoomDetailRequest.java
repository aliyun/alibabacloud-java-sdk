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

    /**
     * <p>设备sn信息</p>
     * <p>注：若在mac uuid sn全都输入的情况下 按照输入正确的内容查询 若全输入都是正确的 则 按照 uuid > mac > sn 优先级查询</p>
     * <p>传入mac uuid sn其中一个 则酒店id和房间号可不传</p>
     */
    @NameInMap("Sn")
    public String sn;

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

    public QueryHotelRoomDetailRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public QueryHotelRoomDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
