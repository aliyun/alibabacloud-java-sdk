// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetCodeEnhanceShrinkRequest extends TeaModel {
    /**
     * <p>Activation Channel, such as WeChat mini program or third-party app.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelInfo")
    public String channelInfoShrink;

    /**
     * <p>List of User Identifier information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static GetCodeEnhanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCodeEnhanceShrinkRequest self = new GetCodeEnhanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetCodeEnhanceShrinkRequest setChannelInfoShrink(String channelInfoShrink) {
        this.channelInfoShrink = channelInfoShrink;
        return this;
    }
    public String getChannelInfoShrink() {
        return this.channelInfoShrink;
    }

    public GetCodeEnhanceShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
