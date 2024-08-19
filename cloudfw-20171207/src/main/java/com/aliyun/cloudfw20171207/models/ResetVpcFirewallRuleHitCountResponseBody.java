// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ResetVpcFirewallRuleHitCountResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A918B4F6-482F-5A91-8F65-AFFFF1FC04EA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetVpcFirewallRuleHitCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetVpcFirewallRuleHitCountResponseBody self = new ResetVpcFirewallRuleHitCountResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetVpcFirewallRuleHitCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
