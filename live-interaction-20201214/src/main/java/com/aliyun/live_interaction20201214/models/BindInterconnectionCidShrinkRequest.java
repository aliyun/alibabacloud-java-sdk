// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class BindInterconnectionCidShrinkRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 绑定会话ID请求体
    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static BindInterconnectionCidShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BindInterconnectionCidShrinkRequest self = new BindInterconnectionCidShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BindInterconnectionCidShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindInterconnectionCidShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
