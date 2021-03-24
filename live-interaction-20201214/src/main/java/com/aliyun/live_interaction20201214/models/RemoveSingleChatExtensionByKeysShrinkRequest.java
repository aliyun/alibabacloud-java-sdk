// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveSingleChatExtensionByKeysShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    // 单聊移除拓展字段请求实体
    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static RemoveSingleChatExtensionByKeysShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSingleChatExtensionByKeysShrinkRequest self = new RemoveSingleChatExtensionByKeysShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSingleChatExtensionByKeysShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveSingleChatExtensionByKeysShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
