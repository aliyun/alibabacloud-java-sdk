// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceIdentityShrinkRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    public static GetDeviceIdentityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceIdentityShrinkRequest self = new GetDeviceIdentityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceIdentityShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

}
