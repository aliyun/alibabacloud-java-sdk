// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ResetNatFirewallRuleHitCountResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5CAA0FFD-4B94-5BB9-8B0A-ECFC86A0E666</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetNatFirewallRuleHitCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetNatFirewallRuleHitCountResponseBody self = new ResetNatFirewallRuleHitCountResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetNatFirewallRuleHitCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
