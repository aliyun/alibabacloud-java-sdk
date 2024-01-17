// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateNatFirewallControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the access control policy.</p>
     * <br>
     * <p>>  To modify an access control policy, you must specify the unique ID of the policy. You can call the DescribeNatFirewallControlPolicy operation to obtain the ID.</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNatFirewallControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNatFirewallControlPolicyResponseBody self = new CreateNatFirewallControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNatFirewallControlPolicyResponseBody setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public CreateNatFirewallControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
