// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class EnableCustomScenePolicyResponseBody extends TeaModel {
    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>65C66B7B-671A-8297-9187-2R5477247B76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableCustomScenePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableCustomScenePolicyResponseBody self = new EnableCustomScenePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableCustomScenePolicyResponseBody setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public EnableCustomScenePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
