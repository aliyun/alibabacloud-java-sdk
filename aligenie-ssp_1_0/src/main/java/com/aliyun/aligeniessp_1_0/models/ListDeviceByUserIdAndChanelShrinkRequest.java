// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceByUserIdAndChanelShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelInfo")
    public String channelInfoShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static ListDeviceByUserIdAndChanelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceByUserIdAndChanelShrinkRequest self = new ListDeviceByUserIdAndChanelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceByUserIdAndChanelShrinkRequest setChannelInfoShrink(String channelInfoShrink) {
        this.channelInfoShrink = channelInfoShrink;
        return this;
    }
    public String getChannelInfoShrink() {
        return this.channelInfoShrink;
    }

    public ListDeviceByUserIdAndChanelShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
