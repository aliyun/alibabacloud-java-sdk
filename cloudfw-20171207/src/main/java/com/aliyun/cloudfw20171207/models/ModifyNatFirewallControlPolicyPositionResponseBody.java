// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyNatFirewallControlPolicyPositionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNatFirewallControlPolicyPositionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatFirewallControlPolicyPositionResponseBody self = new ModifyNatFirewallControlPolicyPositionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNatFirewallControlPolicyPositionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
