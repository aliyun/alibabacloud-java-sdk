// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateMsgRecallIntervalShrinkRequest extends TeaModel {
    // 请求
    @NameInMap("RequestParams")
    public String requestParamsShrink;

    // 应用Id
    @NameInMap("AppId")
    public String appId;

    public static UpdateMsgRecallIntervalShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsgRecallIntervalShrinkRequest self = new UpdateMsgRecallIntervalShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsgRecallIntervalShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

    public UpdateMsgRecallIntervalShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
