// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterPolicyBasedRouteResponseBody extends TeaModel {
    /**
     * <p>The instance ID of the policy-based routing rule.</p>
     * 
     * <strong>example:</strong>
     * <p>pbr-123abczxc</p>
     */
    @NameInMap("PolicyBasedRouteId")
    public String policyBasedRouteId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13526224-5780-4426-8BDF-BC8B08700F22</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTransitRouterPolicyBasedRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterPolicyBasedRouteResponseBody self = new CreateTransitRouterPolicyBasedRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterPolicyBasedRouteResponseBody setPolicyBasedRouteId(String policyBasedRouteId) {
        this.policyBasedRouteId = policyBasedRouteId;
        return this;
    }
    public String getPolicyBasedRouteId() {
        return this.policyBasedRouteId;
    }

    public CreateTransitRouterPolicyBasedRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
