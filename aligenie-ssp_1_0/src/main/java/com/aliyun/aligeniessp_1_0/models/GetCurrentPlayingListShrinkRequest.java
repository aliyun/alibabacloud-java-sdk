// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetCurrentPlayingListShrinkRequest extends TeaModel {
    /**
     * <p>Device identification information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    /**
     * <p>Business parameters</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OpenQueryPlayListRequest")
    public String openQueryPlayListRequestShrink;

    /**
     * <p>User identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static GetCurrentPlayingListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentPlayingListShrinkRequest self = new GetCurrentPlayingListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetCurrentPlayingListShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public GetCurrentPlayingListShrinkRequest setOpenQueryPlayListRequestShrink(String openQueryPlayListRequestShrink) {
        this.openQueryPlayListRequestShrink = openQueryPlayListRequestShrink;
        return this;
    }
    public String getOpenQueryPlayListRequestShrink() {
        return this.openQueryPlayListRequestShrink;
    }

    public GetCurrentPlayingListShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
