// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class PreviousAndNextControlShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OpenControlPlayingListRequest")
    public String openControlPlayingListRequestShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static PreviousAndNextControlShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviousAndNextControlShrinkRequest self = new PreviousAndNextControlShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PreviousAndNextControlShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public PreviousAndNextControlShrinkRequest setOpenControlPlayingListRequestShrink(String openControlPlayingListRequestShrink) {
        this.openControlPlayingListRequestShrink = openControlPlayingListRequestShrink;
        return this;
    }
    public String getOpenControlPlayingListRequestShrink() {
        return this.openControlPlayingListRequestShrink;
    }

    public PreviousAndNextControlShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
