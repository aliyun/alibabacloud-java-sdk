// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateEnterpriseSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>snapshot policy instance id</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

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
