// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetReminderShrinkRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    // 服务请求入参
    @NameInMap("Payload")
    public String payloadShrink;

    // 用户标识信息
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static GetReminderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReminderShrinkRequest self = new GetReminderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetReminderShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public GetReminderShrinkRequest setPayloadShrink(String payloadShrink) {
        this.payloadShrink = payloadShrink;
        return this;
    }
    public String getPayloadShrink() {
        return this.payloadShrink;
    }

    public GetReminderShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
