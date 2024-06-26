// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreatePolicyGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pg-exbuu6yrpvb******</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC******</p>
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
