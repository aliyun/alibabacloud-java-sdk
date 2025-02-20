// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class InvokeRobotPushRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af7***536</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("PushType")
    public String pushType;

    @NameInMap("RoomName")
    public String roomName;

    /**
     * <strong>example:</strong>
     * <p>1211</p>
     */
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

    public InvokeRobotPushRequest setRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }
    public String getRoomName() {
        return this.roomName;
    }

    public InvokeRobotPushRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

}
