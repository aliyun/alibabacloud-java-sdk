// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetGroupMemberExtensionByKeysShrinkRequest extends TeaModel {
    // App ID, IMPaaS租户的ID
    @NameInMap("AppId")
    public String appId;

    // 设置群成员扩展信息的请求体
    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static SetGroupMemberExtensionByKeysShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGroupMemberExtensionByKeysShrinkRequest self = new SetGroupMemberExtensionByKeysShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetGroupMemberExtensionByKeysShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetGroupMemberExtensionByKeysShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
