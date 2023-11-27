// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetGroupExtensionByKeysShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static SetGroupExtensionByKeysShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGroupExtensionByKeysShrinkRequest self = new SetGroupExtensionByKeysShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetGroupExtensionByKeysShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetGroupExtensionByKeysShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
