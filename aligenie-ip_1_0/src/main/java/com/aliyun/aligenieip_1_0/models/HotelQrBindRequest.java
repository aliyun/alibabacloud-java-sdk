// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class HotelQrBindRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("Code")
    public String code;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("RoomNo")
    public String roomNo;

    public static HotelQrBindRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelQrBindRequest self = new HotelQrBindRequest();
        return TeaModel.build(map, self);
    }

    public HotelQrBindRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public HotelQrBindRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelQrBindRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public HotelQrBindRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public HotelQrBindRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

}
