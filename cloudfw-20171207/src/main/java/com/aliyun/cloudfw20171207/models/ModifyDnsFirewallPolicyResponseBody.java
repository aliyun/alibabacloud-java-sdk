// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyDnsFirewallPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9C50C2A9-4BBB-5504-8ADA-C41A79****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDnsFirewallPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDnsFirewallPolicyResponseBody self = new ModifyDnsFirewallPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDnsFirewallPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
