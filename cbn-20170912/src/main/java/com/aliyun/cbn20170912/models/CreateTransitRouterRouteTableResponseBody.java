// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterRouteTableResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>599904C8-A3DA-4E5F-83B6-D5364E664247</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the custom route table.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp1xbcgpgcz9axl9m****</p>
     */
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
