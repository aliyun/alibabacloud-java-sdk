// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetMessageByIdShrinkRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 请求实体
    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static GetMessageByIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMessageByIdShrinkRequest self = new GetMessageByIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetMessageByIdShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMessageByIdShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
