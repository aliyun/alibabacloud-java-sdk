// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCenterPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pg-gx2x1dhsmthe9****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCenterPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCenterPolicyResponseBody self = new CreateCenterPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCenterPolicyResponseBody setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public CreateCenterPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
