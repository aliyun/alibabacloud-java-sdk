// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateTrFirewallV2RoutePolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
