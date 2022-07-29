// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class IndexControlPlayingListShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("OpenIndexControlRequest")
    public String openIndexControlRequestShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static IndexControlPlayingListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IndexControlPlayingListShrinkRequest self = new IndexControlPlayingListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IndexControlPlayingListShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public IndexControlPlayingListShrinkRequest setOpenIndexControlRequestShrink(String openIndexControlRequestShrink) {
        this.openIndexControlRequestShrink = openIndexControlRequestShrink;
        return this;
    }
    public String getOpenIndexControlRequestShrink() {
        return this.openIndexControlRequestShrink;
    }

    public IndexControlPlayingListShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
