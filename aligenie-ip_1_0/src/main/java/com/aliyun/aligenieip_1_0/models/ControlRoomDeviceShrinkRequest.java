// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ControlRoomDeviceShrinkRequest extends TeaModel {
    @NameInMap("Cmd")
    public String cmd;

    @NameInMap("DeviceNumber")
    public String deviceNumber;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("Properties")
    public String propertiesShrink;

    @NameInMap("RoomNo")
    public String roomNo;

    public static ControlRoomDeviceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ControlRoomDeviceShrinkRequest self = new ControlRoomDeviceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ControlRoomDeviceShrinkRequest setCmd(String cmd) {
        this.cmd = cmd;
        return this;
    }
    public String getCmd() {
        return this.cmd;
    }

    public ControlRoomDeviceShrinkRequest setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
        return this;
    }
    public String getDeviceNumber() {
        return this.deviceNumber;
    }

    public ControlRoomDeviceShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ControlRoomDeviceShrinkRequest setPropertiesShrink(String propertiesShrink) {
        this.propertiesShrink = propertiesShrink;
        return this;
    }
    public String getPropertiesShrink() {
        return this.propertiesShrink;
    }

    public ControlRoomDeviceShrinkRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

}
