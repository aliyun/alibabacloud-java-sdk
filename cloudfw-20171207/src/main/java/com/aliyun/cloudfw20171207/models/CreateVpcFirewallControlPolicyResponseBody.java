// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallControlPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AclUuid")
    public String aclUuid;

    public static CreateVpcFirewallControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallControlPolicyResponseBody self = new CreateVpcFirewallControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpcFirewallControlPolicyResponseBody setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

}
