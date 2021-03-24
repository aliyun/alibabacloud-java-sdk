// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateGroupMembersRoleShrinkRequest extends TeaModel {
    // App ID。IMPaaS租户的ID。
    @NameInMap("AppId")
    public String appId;

    // 更新群成员角色请求体。
    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static UpdateGroupMembersRoleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupMembersRoleShrinkRequest self = new UpdateGroupMembersRoleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupMembersRoleShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateGroupMembersRoleShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
