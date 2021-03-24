// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetUserConversationExtensionByKeysShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    // 设置用户拓展字段请求实体
    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static SetUserConversationExtensionByKeysShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserConversationExtensionByKeysShrinkRequest self = new SetUserConversationExtensionByKeysShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetUserConversationExtensionByKeysShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetUserConversationExtensionByKeysShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
