// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class PlayAndPauseControlShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("OpenPlayAndPauseControlParam")
    public String openPlayAndPauseControlParamShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static PlayAndPauseControlShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PlayAndPauseControlShrinkRequest self = new PlayAndPauseControlShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PlayAndPauseControlShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public PlayAndPauseControlShrinkRequest setOpenPlayAndPauseControlParamShrink(String openPlayAndPauseControlParamShrink) {
        this.openPlayAndPauseControlParamShrink = openPlayAndPauseControlParamShrink;
        return this;
    }
    public String getOpenPlayAndPauseControlParamShrink() {
        return this.openPlayAndPauseControlParamShrink;
    }

    public PlayAndPauseControlShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
