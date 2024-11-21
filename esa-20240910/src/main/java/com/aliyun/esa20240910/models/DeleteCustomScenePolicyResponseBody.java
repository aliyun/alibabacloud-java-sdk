// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteCustomScenePolicyResponseBody extends TeaModel {
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
     * <p>5CC228B4-7A67-4016-9C9F-4A4133494A91</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomScenePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomScenePolicyResponseBody self = new DeleteCustomScenePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomScenePolicyResponseBody setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public DeleteCustomScenePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
