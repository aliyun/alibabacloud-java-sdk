// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CreateReminderShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("Payload")
    public String payloadShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static CreateReminderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReminderShrinkRequest self = new CreateReminderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateReminderShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public CreateReminderShrinkRequest setPayloadShrink(String payloadShrink) {
        this.payloadShrink = payloadShrink;
        return this;
    }
    public String getPayloadShrink() {
        return this.payloadShrink;
    }

    public CreateReminderShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
