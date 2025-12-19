// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetWorkloadAccessTokenForUserIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1E85BA86-0955-5841-9679-9C33867E460D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>eyAgImFsZyI6ICJSUzI1N****</p>
     */
    @NameInMap("WorkloadAccessToken")
    public String workloadAccessToken;

    public static GetWorkloadAccessTokenForUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkloadAccessTokenForUserIdResponseBody self = new GetWorkloadAccessTokenForUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkloadAccessTokenForUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkloadAccessTokenForUserIdResponseBody setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }
    public String getWorkloadAccessToken() {
        return this.workloadAccessToken;
    }

}
