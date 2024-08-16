// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DisableTransitRouterRouteTablePropagationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A7C43F99-B1E5-4A53-AB64-4BAE8AF4484E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableTransitRouterRouteTablePropagationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableTransitRouterRouteTablePropagationResponseBody self = new DisableTransitRouterRouteTablePropagationResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableTransitRouterRouteTablePropagationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
