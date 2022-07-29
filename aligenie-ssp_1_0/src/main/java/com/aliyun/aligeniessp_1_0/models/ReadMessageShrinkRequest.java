// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ReadMessageShrinkRequest extends TeaModel {
    @NameInMap("MessageId")
    public Long messageId;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static ReadMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageShrinkRequest self = new ReadMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReadMessageShrinkRequest setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }
    public Long getMessageId() {
        return this.messageId;
    }

    public ReadMessageShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
