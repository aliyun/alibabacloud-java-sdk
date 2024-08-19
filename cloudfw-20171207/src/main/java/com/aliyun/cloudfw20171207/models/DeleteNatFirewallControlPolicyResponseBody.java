// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteNatFirewallControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31306869-C4BC-56F3-BBE6-C377CF9C8E1C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNatFirewallControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatFirewallControlPolicyResponseBody self = new DeleteNatFirewallControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNatFirewallControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
