// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterPolicyBasedRouteResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E4B345CD-2CBA-4881-AF6D-E5D9BAE1CA7B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTransitRouterPolicyBasedRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterPolicyBasedRouteResponseBody self = new DeleteTransitRouterPolicyBasedRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterPolicyBasedRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
