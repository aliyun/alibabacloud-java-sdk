// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class InvokeRobotPushRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("PushType")
    public String pushType;

    @NameInMap("RoomNo")
    public String roomNo;

    public static InvokeRobotPushRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeRobotPushRequest self = new InvokeRobotPushRequest();
        return TeaModel.build(map, self);
    }

    public InvokeRobotPushRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public InvokeRobotPushRequest setPushType(String pushType) {
        this.pushType = pushType;
        return this;
    }
    public String getPushType() {
        return this.pushType;
    }

    public InvokeRobotPushRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

}
