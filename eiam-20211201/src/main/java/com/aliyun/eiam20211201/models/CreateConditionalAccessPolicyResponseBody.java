// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateConditionalAccessPolicyResponseBody extends TeaModel {
    /**
     * <p>Conditional Access Policy ID</p>
     * 
     * <strong>example:</strong>
     * <p>cp_xxxxx</p>
     */
    @NameInMap("ConditionalAccessPolicyId")
    public String conditionalAccessPolicyId;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateConditionalAccessPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConditionalAccessPolicyResponseBody self = new CreateConditionalAccessPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConditionalAccessPolicyResponseBody setConditionalAccessPolicyId(String conditionalAccessPolicyId) {
        this.conditionalAccessPolicyId = conditionalAccessPolicyId;
        return this;
    }
    public String getConditionalAccessPolicyId() {
        return this.conditionalAccessPolicyId;
    }

    public CreateConditionalAccessPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
