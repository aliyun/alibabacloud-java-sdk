// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class SendMessageShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://xx">http://xx</a></p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static SendMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageShrinkRequest self = new SendMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SendMessageShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
