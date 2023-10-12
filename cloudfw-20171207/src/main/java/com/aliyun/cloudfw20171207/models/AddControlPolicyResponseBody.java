// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the access control policy that is created on the Internet firewall.</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddControlPolicyResponseBody self = new AddControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public AddControlPolicyResponseBody setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public AddControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
