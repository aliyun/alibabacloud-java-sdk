// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyNatFirewallControlPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNatFirewallControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatFirewallControlPolicyResponseBody self = new ModifyNatFirewallControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNatFirewallControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
