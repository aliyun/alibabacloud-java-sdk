// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryHotelRoomDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>520a0c0***5eb</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <strong>example:</strong>
     * <p>38:c8:<strong>:</strong>:f5:22</p>
     */
    @NameInMap("Mac")
    public String mac;

    /**
     * <strong>example:</strong>
     * <p>1211</p>
     */
    @NameInMap("RoomNo")
    public String roomNo;

    /**
     * <p>设备sn信息
     * 注：若在mac uuid sn全都输入的情况下 按照输入正确的内容查询 若全输入都是正确的 则 按照 uuid &gt; mac &gt; sn 优先级查询
     * 传入mac uuid sn其中一个 则酒店id和房间号可不传</p>
     * 
     * <strong>example:</strong>
     * <p>280**28</p>
     */
    @NameInMap("Sn")
    public String sn;

    /**
     * <strong>example:</strong>
     * <p>588***96j5WU</p>
     */
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
