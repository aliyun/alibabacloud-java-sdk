// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterCidrResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the CIDR block.</p>
     */
    @NameInMap("TransitRouterCidrId")
    public String transitRouterCidrId;

    public static CreateTransitRouterCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterCidrResponseBody self = new CreateTransitRouterCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTransitRouterCidrResponseBody setTransitRouterCidrId(String transitRouterCidrId) {
        this.transitRouterCidrId = transitRouterCidrId;
        return this;
    }
    public String getTransitRouterCidrId() {
        return this.transitRouterCidrId;
    }

}
