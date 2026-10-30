// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateRouteMapRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EF44D7B7-6248-5A60-8A4C-A92388605A57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the route map rule.</p>
     * 
     * <strong>example:</strong>
     * <p>rmr-3dm13f66wtctcnydup</p>
     */
    @NameInMap("RouteMapRuleId")
    public String routeMapRuleId;

    public static CreateRouteMapRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteMapRuleResponseBody self = new CreateRouteMapRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRouteMapRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRouteMapRuleResponseBody setRouteMapRuleId(String routeMapRuleId) {
        this.routeMapRuleId = routeMapRuleId;
        return this;
    }
    public String getRouteMapRuleId() {
        return this.routeMapRuleId;
    }

}
