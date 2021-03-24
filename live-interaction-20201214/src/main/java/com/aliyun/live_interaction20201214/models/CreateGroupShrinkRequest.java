// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class CreateGroupShrinkRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 创建群聊请求实体
    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static CreateGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupShrinkRequest self = new CreateGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateGroupShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
