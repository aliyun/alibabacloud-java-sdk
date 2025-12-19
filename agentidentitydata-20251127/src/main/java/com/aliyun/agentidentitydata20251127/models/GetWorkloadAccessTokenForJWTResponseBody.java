// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetWorkloadAccessTokenForJWTResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D679769C-957B-586A-AD00-5C2064DAFA7D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>eyAgImFsZyI6ICJSUzI1N****</p>
     */
    @NameInMap("WorkloadAccessToken")
    public String workloadAccessToken;

    public static GetWorkloadAccessTokenForJWTResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkloadAccessTokenForJWTResponseBody self = new GetWorkloadAccessTokenForJWTResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkloadAccessTokenForJWTResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkloadAccessTokenForJWTResponseBody setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }
    public String getWorkloadAccessToken() {
        return this.workloadAccessToken;
    }

}
