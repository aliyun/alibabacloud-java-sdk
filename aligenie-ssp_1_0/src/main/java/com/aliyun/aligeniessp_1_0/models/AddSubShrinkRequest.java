// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AddSubShrinkRequest extends TeaModel {
    @NameInMap("AddSubscriptionInfoRequest")
    public String addSubscriptionInfoRequestShrink;

    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static AddSubShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSubShrinkRequest self = new AddSubShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddSubShrinkRequest setAddSubscriptionInfoRequestShrink(String addSubscriptionInfoRequestShrink) {
        this.addSubscriptionInfoRequestShrink = addSubscriptionInfoRequestShrink;
        return this;
    }
    public String getAddSubscriptionInfoRequestShrink() {
        return this.addSubscriptionInfoRequestShrink;
    }

    public AddSubShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public AddSubShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
