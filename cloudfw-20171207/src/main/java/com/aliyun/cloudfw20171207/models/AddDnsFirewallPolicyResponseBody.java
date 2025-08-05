// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddDnsFirewallPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f88dae6f-XXX-XXX-613de9ab2be8</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <strong>example:</strong>
     * <p>71209DFE-XXX-XXX-52B4A4E9DA3B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddDnsFirewallPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDnsFirewallPolicyResponseBody self = new AddDnsFirewallPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDnsFirewallPolicyResponseBody setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public AddDnsFirewallPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
