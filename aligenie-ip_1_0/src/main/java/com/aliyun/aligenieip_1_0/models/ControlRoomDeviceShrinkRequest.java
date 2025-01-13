// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ControlRoomDeviceShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>thing.attribute.set
     * thing.attribute.adjust</p>
     */
    @NameInMap("Cmd")
    public String cmd;

    @NameInMap("DeviceIndex")
    public Integer deviceIndex;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INFRARED49122575595</p>
     */
    @NameInMap("DeviceNumber")
    public String deviceNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a7***83</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Properties")
    public String propertiesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1211</p>
     */
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

    public ControlRoomDeviceShrinkRequest setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }
    public Integer getDeviceIndex() {
        return this.deviceIndex;
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
