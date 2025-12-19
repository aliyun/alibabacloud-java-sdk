// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetWorkloadIdentityRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>agent-101</p>
     */
    @NameInMap("WorkloadIdentityName")
    public String workloadIdentityName;

    public static GetWorkloadIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkloadIdentityRequest self = new GetWorkloadIdentityRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkloadIdentityRequest setWorkloadIdentityName(String workloadIdentityName) {
        this.workloadIdentityName = workloadIdentityName;
        return this;
    }
    public String getWorkloadIdentityName() {
        return this.workloadIdentityName;
    }

}
