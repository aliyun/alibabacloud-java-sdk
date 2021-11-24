// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class UnbindDeviceShrinkRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    // 用户标识信息
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static UnbindDeviceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindDeviceShrinkRequest self = new UnbindDeviceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UnbindDeviceShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public UnbindDeviceShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
