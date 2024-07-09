// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreatePolicyGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-gx2x1dhsmthe9****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePolicyGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyGroupResponseBody self = new CreatePolicyGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolicyGroupResponseBody setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public CreatePolicyGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
