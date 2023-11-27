// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class QueryInterconnectionCidMappingShrinkRequest extends TeaModel {
    /**
     * <p>AppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static QueryInterconnectionCidMappingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInterconnectionCidMappingShrinkRequest self = new QueryInterconnectionCidMappingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryInterconnectionCidMappingShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryInterconnectionCidMappingShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
