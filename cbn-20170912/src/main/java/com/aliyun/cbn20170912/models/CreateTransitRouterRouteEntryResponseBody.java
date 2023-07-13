// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterRouteEntryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the route.</p>
     */
    @NameInMap("TransitRouterRouteEntryId")
    public String transitRouterRouteEntryId;

    public static CreateTransitRouterRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterRouteEntryResponseBody self = new CreateTransitRouterRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTransitRouterRouteEntryResponseBody setTransitRouterRouteEntryId(String transitRouterRouteEntryId) {
        this.transitRouterRouteEntryId = transitRouterRouteEntryId;
        return this;
    }
    public String getTransitRouterRouteEntryId() {
        return this.transitRouterRouteEntryId;
    }

}
