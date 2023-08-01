// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ControlRoomDeviceRequest extends TeaModel {
    @NameInMap("Cmd")
    public String cmd;

    @NameInMap("DeviceIndex")
    public Integer deviceIndex;

    @NameInMap("DeviceNumber")
    public String deviceNumber;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("Properties")
    public java.util.Map<String, String> properties;

    @NameInMap("RoomNo")
    public String roomNo;

    public static ControlRoomDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ControlRoomDeviceRequest self = new ControlRoomDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ControlRoomDeviceRequest setCmd(String cmd) {
        this.cmd = cmd;
        return this;
    }
    public String getCmd() {
        return this.cmd;
    }

    public ControlRoomDeviceRequest setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }
    public Integer getDeviceIndex() {
        return this.deviceIndex;
    }

    public ControlRoomDeviceRequest setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
        return this;
    }
    public String getDeviceNumber() {
        return this.deviceNumber;
    }

    public ControlRoomDeviceRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ControlRoomDeviceRequest setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, String> getProperties() {
        return this.properties;
    }

    public ControlRoomDeviceRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

}
