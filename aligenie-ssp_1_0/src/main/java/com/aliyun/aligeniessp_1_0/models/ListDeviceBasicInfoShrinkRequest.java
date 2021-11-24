// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceBasicInfoShrinkRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfos")
    public String deviceInfosShrink;

    public static ListDeviceBasicInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceBasicInfoShrinkRequest self = new ListDeviceBasicInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceBasicInfoShrinkRequest setDeviceInfosShrink(String deviceInfosShrink) {
        this.deviceInfosShrink = deviceInfosShrink;
        return this;
    }
    public String getDeviceInfosShrink() {
        return this.deviceInfosShrink;
    }

}
