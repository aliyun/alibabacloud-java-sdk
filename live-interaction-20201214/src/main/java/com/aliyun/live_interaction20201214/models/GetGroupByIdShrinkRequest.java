// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetGroupByIdShrinkRequest extends TeaModel {
    // APP ID, IMPaaS租户的ID
    @NameInMap("AppId")
    public String appId;

    // 群会话信息获取的请求体
    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static GetGroupByIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGroupByIdShrinkRequest self = new GetGroupByIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetGroupByIdShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetGroupByIdShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
