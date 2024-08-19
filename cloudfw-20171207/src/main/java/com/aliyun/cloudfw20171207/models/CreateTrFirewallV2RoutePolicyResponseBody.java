// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateTrFirewallV2RoutePolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C91D68BA-A0BE-51BF-A0F1-1CB5C57FE58D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the routing policy.</p>
     * 
     * <strong>example:</strong>
     * <p>policy-8ebed27e13e14ce2****</p>
     */
    @NameInMap("TrFirewallRoutePolicyId")
    public String trFirewallRoutePolicyId;

    public static CreateTrFirewallV2RoutePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrFirewallV2RoutePolicyResponseBody self = new CreateTrFirewallV2RoutePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrFirewallV2RoutePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTrFirewallV2RoutePolicyResponseBody setTrFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
        this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
        return this;
    }
    public String getTrFirewallRoutePolicyId() {
        return this.trFirewallRoutePolicyId;
    }

}
