// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteNatFirewallControlPolicyBatchResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>450D47F5-956E-543E-8502-2F71C8C54E72</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNatFirewallControlPolicyBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatFirewallControlPolicyBatchResponseBody self = new DeleteNatFirewallControlPolicyBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNatFirewallControlPolicyBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
