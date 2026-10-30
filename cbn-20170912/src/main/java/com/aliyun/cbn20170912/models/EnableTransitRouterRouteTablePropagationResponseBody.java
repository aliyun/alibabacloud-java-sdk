// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class EnableTransitRouterRouteTablePropagationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>59CF8BF9-DE61-421E-B903-D56AF46A303C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableTransitRouterRouteTablePropagationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableTransitRouterRouteTablePropagationResponseBody self = new EnableTransitRouterRouteTablePropagationResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableTransitRouterRouteTablePropagationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
