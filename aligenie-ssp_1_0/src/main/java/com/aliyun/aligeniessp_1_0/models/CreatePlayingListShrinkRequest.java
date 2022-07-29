// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CreatePlayingListShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("OpenCreatePlayingListRequest")
    public String openCreatePlayingListRequestShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static CreatePlayingListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePlayingListShrinkRequest self = new CreatePlayingListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePlayingListShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public CreatePlayingListShrinkRequest setOpenCreatePlayingListRequestShrink(String openCreatePlayingListRequestShrink) {
        this.openCreatePlayingListRequestShrink = openCreatePlayingListRequestShrink;
        return this;
    }
    public String getOpenCreatePlayingListRequestShrink() {
        return this.openCreatePlayingListRequestShrink;
    }

    public CreatePlayingListShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
