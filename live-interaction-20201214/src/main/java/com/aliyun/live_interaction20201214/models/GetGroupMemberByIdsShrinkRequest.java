// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetGroupMemberByIdsShrinkRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 群聊设置扩展字段请求实体
    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static GetGroupMemberByIdsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGroupMemberByIdsShrinkRequest self = new GetGroupMemberByIdsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetGroupMemberByIdsShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetGroupMemberByIdsShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
