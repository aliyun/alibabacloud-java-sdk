// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetWorkloadAccessTokenForUserIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserContext")
    public GetWorkloadAccessTokenForUserIdResponseBodyUserContext userContext;

    @NameInMap("WorkloadAccessToken")
    public String workloadAccessToken;

    @NameInMap("WorkloadIdentityArn")
    public String workloadIdentityArn;

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

    public GetWorkloadAccessTokenForUserIdResponseBody setUserContext(GetWorkloadAccessTokenForUserIdResponseBodyUserContext userContext) {
        this.userContext = userContext;
        return this;
    }
    public GetWorkloadAccessTokenForUserIdResponseBodyUserContext getUserContext() {
        return this.userContext;
    }

    public GetWorkloadAccessTokenForUserIdResponseBody setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }
    public String getWorkloadAccessToken() {
        return this.workloadAccessToken;
    }

    public GetWorkloadAccessTokenForUserIdResponseBody setWorkloadIdentityArn(String workloadIdentityArn) {
        this.workloadIdentityArn = workloadIdentityArn;
        return this;
    }
    public String getWorkloadIdentityArn() {
        return this.workloadIdentityArn;
    }

    public static class GetWorkloadAccessTokenForUserIdResponseBodyUserContext extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        public static GetWorkloadAccessTokenForUserIdResponseBodyUserContext build(java.util.Map<String, ?> map) throws Exception {
            GetWorkloadAccessTokenForUserIdResponseBodyUserContext self = new GetWorkloadAccessTokenForUserIdResponseBodyUserContext();
            return TeaModel.build(map, self);
        }

        public GetWorkloadAccessTokenForUserIdResponseBodyUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
