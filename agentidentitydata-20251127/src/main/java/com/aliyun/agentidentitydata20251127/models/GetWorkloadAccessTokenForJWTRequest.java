// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetWorkloadAccessTokenForJWTRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eyAgImFsZyI6ICJSUzI1NiIsI*******</p>
     */
    @NameInMap("UserToken")
    public String userToken;

    /**
     * <strong>example:</strong>
     * <p>test-workload-identity</p>
     */
    @NameInMap("WorkloadIdentityName")
    public String workloadIdentityName;

    public static GetWorkloadAccessTokenForJWTRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkloadAccessTokenForJWTRequest self = new GetWorkloadAccessTokenForJWTRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkloadAccessTokenForJWTRequest setUserToken(String userToken) {
        this.userToken = userToken;
        return this;
    }
    public String getUserToken() {
        return this.userToken;
    }

    public GetWorkloadAccessTokenForJWTRequest setWorkloadIdentityName(String workloadIdentityName) {
        this.workloadIdentityName = workloadIdentityName;
        return this;
    }
    public String getWorkloadIdentityName() {
        return this.workloadIdentityName;
    }

}
