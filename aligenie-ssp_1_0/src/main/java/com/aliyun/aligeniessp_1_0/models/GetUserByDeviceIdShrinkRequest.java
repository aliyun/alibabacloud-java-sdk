// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetUserByDeviceIdShrinkRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    public static GetUserByDeviceIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserByDeviceIdShrinkRequest self = new GetUserByDeviceIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetUserByDeviceIdShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

}
