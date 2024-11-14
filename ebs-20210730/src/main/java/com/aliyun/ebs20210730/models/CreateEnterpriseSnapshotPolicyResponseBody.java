// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateEnterpriseSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>The id of a policy.</p>
     * 
     * <strong>example:</strong>
     * <p>esp-xxx</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7A8959DA-1E04-5724-8288-58334031454E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEnterpriseSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseSnapshotPolicyResponseBody self = new CreateEnterpriseSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseSnapshotPolicyResponseBody setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public CreateEnterpriseSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
