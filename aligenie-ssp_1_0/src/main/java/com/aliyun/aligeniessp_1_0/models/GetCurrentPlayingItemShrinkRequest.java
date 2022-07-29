// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetCurrentPlayingItemShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static GetCurrentPlayingItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentPlayingItemShrinkRequest self = new GetCurrentPlayingItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetCurrentPlayingItemShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public GetCurrentPlayingItemShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
