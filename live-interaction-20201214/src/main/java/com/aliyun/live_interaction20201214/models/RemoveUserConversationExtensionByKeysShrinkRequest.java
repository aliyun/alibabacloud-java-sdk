// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveUserConversationExtensionByKeysShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    // 移除用户拓展字段请求实体
    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static RemoveUserConversationExtensionByKeysShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserConversationExtensionByKeysShrinkRequest self = new RemoveUserConversationExtensionByKeysShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserConversationExtensionByKeysShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveUserConversationExtensionByKeysShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
