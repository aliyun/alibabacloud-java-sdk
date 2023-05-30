// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyFirewallV2RoutePolicySwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyFirewallV2RoutePolicySwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirewallV2RoutePolicySwitchResponseBody self = new ModifyFirewallV2RoutePolicySwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFirewallV2RoutePolicySwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
