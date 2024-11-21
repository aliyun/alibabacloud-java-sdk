// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DisableCustomScenePolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the disabled policy.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableCustomScenePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableCustomScenePolicyResponseBody self = new DisableCustomScenePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableCustomScenePolicyResponseBody setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public DisableCustomScenePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
