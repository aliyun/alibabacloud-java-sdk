// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallControlPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpcFirewallControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcFirewallControlPolicyResponseBody self = new DeleteVpcFirewallControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpcFirewallControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
