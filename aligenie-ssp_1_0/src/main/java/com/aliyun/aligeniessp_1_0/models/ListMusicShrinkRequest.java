// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListMusicShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public String payloadShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static ListMusicShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMusicShrinkRequest self = new ListMusicShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMusicShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public ListMusicShrinkRequest setPayloadShrink(String payloadShrink) {
        this.payloadShrink = payloadShrink;
        return this;
    }
    public String getPayloadShrink() {
        return this.payloadShrink;
    }

    public ListMusicShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
