// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class BatchDeleteVpcFirewallControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B2841452-CB8D-4F7D-B247-38E1CF7334F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchDeleteVpcFirewallControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteVpcFirewallControlPolicyResponseBody self = new BatchDeleteVpcFirewallControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteVpcFirewallControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
