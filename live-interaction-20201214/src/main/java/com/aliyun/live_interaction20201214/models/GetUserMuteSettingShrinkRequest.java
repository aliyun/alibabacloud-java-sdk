// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetUserMuteSettingShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static GetUserMuteSettingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserMuteSettingShrinkRequest self = new GetUserMuteSettingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetUserMuteSettingShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetUserMuteSettingShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
