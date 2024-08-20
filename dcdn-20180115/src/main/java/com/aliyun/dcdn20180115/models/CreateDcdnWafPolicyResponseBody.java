// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnWafPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the protection policy that you created.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDcdnWafPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnWafPolicyResponseBody self = new CreateDcdnWafPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDcdnWafPolicyResponseBody setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public CreateDcdnWafPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
