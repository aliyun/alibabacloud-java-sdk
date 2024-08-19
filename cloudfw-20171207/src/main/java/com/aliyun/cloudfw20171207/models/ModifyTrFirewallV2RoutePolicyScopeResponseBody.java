// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyTrFirewallV2RoutePolicyScopeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E7D4D635-0C70-5CEB-A609-851E94D51FBB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the routing policy.</p>
     * 
     * <strong>example:</strong>
     * <p>policy-4d724d0139df48f18091</p>
     */
    @NameInMap("TrFirewallRoutePolicyId")
    public String trFirewallRoutePolicyId;

    public static ModifyTrFirewallV2RoutePolicyScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrFirewallV2RoutePolicyScopeResponseBody self = new ModifyTrFirewallV2RoutePolicyScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTrFirewallV2RoutePolicyScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTrFirewallV2RoutePolicyScopeResponseBody setTrFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
        this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
        return this;
    }
    public String getTrFirewallRoutePolicyId() {
        return this.trFirewallRoutePolicyId;
    }

}
