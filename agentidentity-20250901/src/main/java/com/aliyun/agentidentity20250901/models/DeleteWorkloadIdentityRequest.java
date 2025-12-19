// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteWorkloadIdentityRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>agent-101</p>
     */
    @NameInMap("WorkloadIdentityName")
    public String workloadIdentityName;

    public static DeleteWorkloadIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkloadIdentityRequest self = new DeleteWorkloadIdentityRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkloadIdentityRequest setWorkloadIdentityName(String workloadIdentityName) {
        this.workloadIdentityName = workloadIdentityName;
        return this;
    }
    public String getWorkloadIdentityName() {
        return this.workloadIdentityName;
    }

}
