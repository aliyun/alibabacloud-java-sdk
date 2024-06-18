// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-policy-867ef4007c8a****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <strong>example:</strong>
     * <p>EFE7EBB2-449D-5BBB-B381-CA7839BC1649</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePrivateAccessPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateAccessPolicyResponseBody self = new CreatePrivateAccessPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePrivateAccessPolicyResponseBody setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public CreatePrivateAccessPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
