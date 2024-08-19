// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyNatFirewallControlPolicyPositionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>60617208-F5F7-5B44-BB1E-3AC1B6FCD627</p>
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
