// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ImportGroupChatConversationShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static ImportGroupChatConversationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportGroupChatConversationShrinkRequest self = new ImportGroupChatConversationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportGroupChatConversationShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ImportGroupChatConversationShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
