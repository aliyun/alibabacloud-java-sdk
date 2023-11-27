// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveGroupExtensionByKeysShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static RemoveGroupExtensionByKeysShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupExtensionByKeysShrinkRequest self = new RemoveGroupExtensionByKeysShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveGroupExtensionByKeysShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveGroupExtensionByKeysShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
