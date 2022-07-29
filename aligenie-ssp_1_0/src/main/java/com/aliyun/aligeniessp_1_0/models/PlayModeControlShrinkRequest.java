// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class PlayModeControlShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("OpenPlayModeControlRequest")
    public String openPlayModeControlRequestShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static PlayModeControlShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PlayModeControlShrinkRequest self = new PlayModeControlShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PlayModeControlShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public PlayModeControlShrinkRequest setOpenPlayModeControlRequestShrink(String openPlayModeControlRequestShrink) {
        this.openPlayModeControlRequestShrink = openPlayModeControlRequestShrink;
        return this;
    }
    public String getOpenPlayModeControlRequestShrink() {
        return this.openPlayModeControlRequestShrink;
    }

    public PlayModeControlShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
