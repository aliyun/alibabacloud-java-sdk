// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateRouteMapRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EF44D7B7-6248-5A60-8A4C-A92388605A57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRouteMapRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRouteMapRuleResponseBody self = new UpdateRouteMapRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRouteMapRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
