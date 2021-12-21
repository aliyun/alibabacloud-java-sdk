// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterRouteTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TransitRouterRouteTableId")
    public String transitRouterRouteTableId;

    public static CreateTransitRouterRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterRouteTableResponseBody self = new CreateTransitRouterRouteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterRouteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTransitRouterRouteTableResponseBody setTransitRouterRouteTableId(String transitRouterRouteTableId) {
        this.transitRouterRouteTableId = transitRouterRouteTableId;
        return this;
    }
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

}
