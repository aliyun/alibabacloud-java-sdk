// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class BatchCopyVpcFirewallControlPolicyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static BatchCopyVpcFirewallControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCopyVpcFirewallControlPolicyResponseBody self = new BatchCopyVpcFirewallControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCopyVpcFirewallControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
