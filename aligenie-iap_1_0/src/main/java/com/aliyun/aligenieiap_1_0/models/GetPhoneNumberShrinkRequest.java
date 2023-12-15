// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetPhoneNumberShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static GetPhoneNumberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberShrinkRequest self = new GetPhoneNumberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public GetPhoneNumberShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
