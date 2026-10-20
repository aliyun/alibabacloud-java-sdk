// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetWorkloadAccessTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WorkloadAccessToken")
    public String workloadAccessToken;

    @NameInMap("WorkloadIdentityArn")
    public String workloadIdentityArn;

    public static GetWorkloadAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkloadAccessTokenResponseBody self = new GetWorkloadAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkloadAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkloadAccessTokenResponseBody setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }
    public String getWorkloadAccessToken() {
        return this.workloadAccessToken;
    }

    public GetWorkloadAccessTokenResponseBody setWorkloadIdentityArn(String workloadIdentityArn) {
        this.workloadIdentityArn = workloadIdentityArn;
        return this;
    }
    public String getWorkloadIdentityArn() {
        return this.workloadIdentityArn;
    }

}
