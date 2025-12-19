// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetWorkloadAccessTokenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-workload-identity</p>
     */
    @NameInMap("WorkloadIdentityName")
    public String workloadIdentityName;

    public static GetWorkloadAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkloadAccessTokenRequest self = new GetWorkloadAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkloadAccessTokenRequest setWorkloadIdentityName(String workloadIdentityName) {
        this.workloadIdentityName = workloadIdentityName;
        return this;
    }
    public String getWorkloadIdentityName() {
        return this.workloadIdentityName;
    }

}
