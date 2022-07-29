// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ProgressControlShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("OpenProgressControlRequest")
    public String openProgressControlRequestShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static ProgressControlShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ProgressControlShrinkRequest self = new ProgressControlShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ProgressControlShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public ProgressControlShrinkRequest setOpenProgressControlRequestShrink(String openProgressControlRequestShrink) {
        this.openProgressControlRequestShrink = openProgressControlRequestShrink;
        return this;
    }
    public String getOpenProgressControlRequestShrink() {
        return this.openProgressControlRequestShrink;
    }

    public ProgressControlShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
