// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateAutoSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the automatic snapshot policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAutoSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoSnapshotPolicyResponseBody self = new CreateAutoSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAutoSnapshotPolicyResponseBody setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public CreateAutoSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
