// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RequestParamsOptionsSingleChatCreateRequestUserConversationValue extends TeaModel {
    @NameInMap("UserExtensions")
    public java.util.Map<String, String> userExtensions;

    public static RequestParamsOptionsSingleChatCreateRequestUserConversationValue build(java.util.Map<String, ?> map) throws Exception {
        RequestParamsOptionsSingleChatCreateRequestUserConversationValue self = new RequestParamsOptionsSingleChatCreateRequestUserConversationValue();
        return TeaModel.build(map, self);
    }

    public RequestParamsOptionsSingleChatCreateRequestUserConversationValue setUserExtensions(java.util.Map<String, String> userExtensions) {
        this.userExtensions = userExtensions;
        return this;
    }
    public java.util.Map<String, String> getUserExtensions() {
        return this.userExtensions;
    }

}
