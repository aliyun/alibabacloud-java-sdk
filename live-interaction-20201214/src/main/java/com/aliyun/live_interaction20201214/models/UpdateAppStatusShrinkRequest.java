// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateAppStatusShrinkRequest extends TeaModel {
    // 应用Id
    @NameInMap("AppId")
    public String appId;

    // 请求
    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static UpdateAppStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppStatusShrinkRequest self = new UpdateAppStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppStatusShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAppStatusShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
