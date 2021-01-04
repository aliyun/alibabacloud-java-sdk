// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallControlPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVpcFirewallControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallControlPolicyResponseBody self = new ModifyVpcFirewallControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
