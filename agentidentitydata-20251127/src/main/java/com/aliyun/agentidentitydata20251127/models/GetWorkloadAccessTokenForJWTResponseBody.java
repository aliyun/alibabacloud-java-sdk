// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetWorkloadAccessTokenForJWTResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserContext")
    public GetWorkloadAccessTokenForJWTResponseBodyUserContext userContext;

    @NameInMap("WorkloadAccessToken")
    public String workloadAccessToken;

    @NameInMap("WorkloadIdentityArn")
    public String workloadIdentityArn;

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

    public GetWorkloadAccessTokenForJWTResponseBody setUserContext(GetWorkloadAccessTokenForJWTResponseBodyUserContext userContext) {
        this.userContext = userContext;
        return this;
    }
    public GetWorkloadAccessTokenForJWTResponseBodyUserContext getUserContext() {
        return this.userContext;
    }

    public GetWorkloadAccessTokenForJWTResponseBody setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }
    public String getWorkloadAccessToken() {
        return this.workloadAccessToken;
    }

    public GetWorkloadAccessTokenForJWTResponseBody setWorkloadIdentityArn(String workloadIdentityArn) {
        this.workloadIdentityArn = workloadIdentityArn;
        return this;
    }
    public String getWorkloadIdentityArn() {
        return this.workloadIdentityArn;
    }

    public static class GetWorkloadAccessTokenForJWTResponseBodyUserContextJwtClaims extends TeaModel {
        @NameInMap("Audiences")
        public String audiences;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("JTI")
        public String JTI;

        @NameInMap("Subject")
        public String subject;

        public static GetWorkloadAccessTokenForJWTResponseBodyUserContextJwtClaims build(java.util.Map<String, ?> map) throws Exception {
            GetWorkloadAccessTokenForJWTResponseBodyUserContextJwtClaims self = new GetWorkloadAccessTokenForJWTResponseBodyUserContextJwtClaims();
            return TeaModel.build(map, self);
        }

        public GetWorkloadAccessTokenForJWTResponseBodyUserContextJwtClaims setAudiences(String audiences) {
            this.audiences = audiences;
            return this;
        }
        public String getAudiences() {
            return this.audiences;
        }

        public GetWorkloadAccessTokenForJWTResponseBodyUserContextJwtClaims setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public GetWorkloadAccessTokenForJWTResponseBodyUserContextJwtClaims setJTI(String JTI) {
            this.JTI = JTI;
            return this;
        }
        public String getJTI() {
            return this.JTI;
        }

        public GetWorkloadAccessTokenForJWTResponseBodyUserContextJwtClaims setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class GetWorkloadAccessTokenForJWTResponseBodyUserContext extends TeaModel {
        @NameInMap("JwtClaims")
        public GetWorkloadAccessTokenForJWTResponseBodyUserContextJwtClaims jwtClaims;

        public static GetWorkloadAccessTokenForJWTResponseBodyUserContext build(java.util.Map<String, ?> map) throws Exception {
            GetWorkloadAccessTokenForJWTResponseBodyUserContext self = new GetWorkloadAccessTokenForJWTResponseBodyUserContext();
            return TeaModel.build(map, self);
        }

        public GetWorkloadAccessTokenForJWTResponseBodyUserContext setJwtClaims(GetWorkloadAccessTokenForJWTResponseBodyUserContextJwtClaims jwtClaims) {
            this.jwtClaims = jwtClaims;
            return this;
        }
        public GetWorkloadAccessTokenForJWTResponseBodyUserContextJwtClaims getJwtClaims() {
            return this.jwtClaims;
        }

    }

}
