// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UnbindInterconnectionUidShrinkRequest extends TeaModel {
    /**
     * <p>AppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static UnbindInterconnectionUidShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindInterconnectionUidShrinkRequest self = new UnbindInterconnectionUidShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UnbindInterconnectionUidShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UnbindInterconnectionUidShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
