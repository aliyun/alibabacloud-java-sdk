// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveGroupMemberExtensionByKeysShrinkRequest extends TeaModel {
    // App ID, IMPaaS租户的ID
    @NameInMap("AppId")
    public String appId;

    // 删除群成员扩展信息的请求体
    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static RemoveGroupMemberExtensionByKeysShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupMemberExtensionByKeysShrinkRequest self = new RemoveGroupMemberExtensionByKeysShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveGroupMemberExtensionByKeysShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveGroupMemberExtensionByKeysShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
