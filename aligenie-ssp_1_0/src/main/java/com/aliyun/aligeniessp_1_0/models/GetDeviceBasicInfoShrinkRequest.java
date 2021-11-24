// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceBasicInfoShrinkRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    public static GetDeviceBasicInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceBasicInfoShrinkRequest self = new GetDeviceBasicInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceBasicInfoShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

}
