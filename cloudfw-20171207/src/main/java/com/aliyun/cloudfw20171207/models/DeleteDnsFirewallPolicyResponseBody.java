// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteDnsFirewallPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>32314C1E-82CF-582C-853A-B1773F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDnsFirewallPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnsFirewallPolicyResponseBody self = new DeleteDnsFirewallPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDnsFirewallPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
