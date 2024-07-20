// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCustomRoutingEndpointTrafficPoliciesResponseBody extends TeaModel {
    /**
     * <p>The IDs of the traffic destinations.</p>
     */
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCustomRoutingEndpointTrafficPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomRoutingEndpointTrafficPoliciesResponseBody self = new UpdateCustomRoutingEndpointTrafficPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCustomRoutingEndpointTrafficPoliciesResponseBody setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

    public UpdateCustomRoutingEndpointTrafficPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
