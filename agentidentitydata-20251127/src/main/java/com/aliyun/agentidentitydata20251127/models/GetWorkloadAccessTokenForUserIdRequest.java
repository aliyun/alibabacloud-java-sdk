// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetWorkloadAccessTokenForUserIdRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>externalUser1</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>test-workload-identity</p>
     */
    @NameInMap("WorkloadIdentityName")
    public String workloadIdentityName;

    public static GetWorkloadAccessTokenForUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkloadAccessTokenForUserIdRequest self = new GetWorkloadAccessTokenForUserIdRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkloadAccessTokenForUserIdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetWorkloadAccessTokenForUserIdRequest setWorkloadIdentityName(String workloadIdentityName) {
        this.workloadIdentityName = workloadIdentityName;
        return this;
    }
    public String getWorkloadIdentityName() {
        return this.workloadIdentityName;
    }

}
