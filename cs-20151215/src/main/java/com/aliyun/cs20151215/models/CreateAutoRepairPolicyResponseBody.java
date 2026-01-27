// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateAutoRepairPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>r-xxxxxxx</p>
     */
    @NameInMap("policy_id")
    public String policyId;

    /**
     * <strong>example:</strong>
     * <p>E368C761-F8F6-4A36-9B58-BD53D5******</p>
     */
    @NameInMap("request_id")
    public String requestId;

    public static CreateAutoRepairPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoRepairPolicyResponseBody self = new CreateAutoRepairPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAutoRepairPolicyResponseBody setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public CreateAutoRepairPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
