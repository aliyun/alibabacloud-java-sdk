// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class DeviceControlShrinkRequest extends TeaModel {
    @NameInMap("ControlRequest")
    public String controlRequestShrink;

    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    public static DeviceControlShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeviceControlShrinkRequest self = new DeviceControlShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeviceControlShrinkRequest setControlRequestShrink(String controlRequestShrink) {
        this.controlRequestShrink = controlRequestShrink;
        return this;
    }
    public String getControlRequestShrink() {
        return this.controlRequestShrink;
    }

    public DeviceControlShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

}
