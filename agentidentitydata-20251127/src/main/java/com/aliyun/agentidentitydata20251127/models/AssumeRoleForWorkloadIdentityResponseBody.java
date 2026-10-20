// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class AssumeRoleForWorkloadIdentityResponseBody extends TeaModel {
    @NameInMap("AssumedRoleUser")
    public AssumeRoleForWorkloadIdentityResponseBodyAssumedRoleUser assumedRoleUser;

    @NameInMap("Credentials")
    public AssumeRoleForWorkloadIdentityResponseBodyCredentials credentials;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WorkloadContextInfo")
    public AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfo workloadContextInfo;

    public static AssumeRoleForWorkloadIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleForWorkloadIdentityResponseBody self = new AssumeRoleForWorkloadIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public AssumeRoleForWorkloadIdentityResponseBody setAssumedRoleUser(AssumeRoleForWorkloadIdentityResponseBodyAssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
        return this;
    }
    public AssumeRoleForWorkloadIdentityResponseBodyAssumedRoleUser getAssumedRoleUser() {
        return this.assumedRoleUser;
    }

    public AssumeRoleForWorkloadIdentityResponseBody setCredentials(AssumeRoleForWorkloadIdentityResponseBodyCredentials credentials) {
        this.credentials = credentials;
        return this;
    }
    public AssumeRoleForWorkloadIdentityResponseBodyCredentials getCredentials() {
        return this.credentials;
    }

    public AssumeRoleForWorkloadIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssumeRoleForWorkloadIdentityResponseBody setWorkloadContextInfo(AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfo workloadContextInfo) {
        this.workloadContextInfo = workloadContextInfo;
        return this;
    }
    public AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfo getWorkloadContextInfo() {
        return this.workloadContextInfo;
    }

    public static class AssumeRoleForWorkloadIdentityResponseBodyAssumedRoleUser extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("AssumedRoleId")
        public String assumedRoleId;

        public static AssumeRoleForWorkloadIdentityResponseBodyAssumedRoleUser build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleForWorkloadIdentityResponseBodyAssumedRoleUser self = new AssumeRoleForWorkloadIdentityResponseBodyAssumedRoleUser();
            return TeaModel.build(map, self);
        }

        public AssumeRoleForWorkloadIdentityResponseBodyAssumedRoleUser setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public AssumeRoleForWorkloadIdentityResponseBodyAssumedRoleUser setAssumedRoleId(String assumedRoleId) {
            this.assumedRoleId = assumedRoleId;
            return this;
        }
        public String getAssumedRoleId() {
            return this.assumedRoleId;
        }

    }

    public static class AssumeRoleForWorkloadIdentityResponseBodyCredentials extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static AssumeRoleForWorkloadIdentityResponseBodyCredentials build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleForWorkloadIdentityResponseBodyCredentials self = new AssumeRoleForWorkloadIdentityResponseBodyCredentials();
            return TeaModel.build(map, self);
        }

        public AssumeRoleForWorkloadIdentityResponseBodyCredentials setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public AssumeRoleForWorkloadIdentityResponseBodyCredentials setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public AssumeRoleForWorkloadIdentityResponseBodyCredentials setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public AssumeRoleForWorkloadIdentityResponseBodyCredentials setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

    public static class AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContextJwtClaims extends TeaModel {
        @NameInMap("Audiences")
        public String audiences;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("JTI")
        public String JTI;

        @NameInMap("Subject")
        public String subject;

        public static AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContextJwtClaims build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContextJwtClaims self = new AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContextJwtClaims();
            return TeaModel.build(map, self);
        }

        public AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContextJwtClaims setAudiences(String audiences) {
            this.audiences = audiences;
            return this;
        }
        public String getAudiences() {
            return this.audiences;
        }

        public AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContextJwtClaims setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContextJwtClaims setJTI(String JTI) {
            this.JTI = JTI;
            return this;
        }
        public String getJTI() {
            return this.JTI;
        }

        public AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContextJwtClaims setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContext extends TeaModel {
        @NameInMap("JwtClaims")
        public AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContextJwtClaims jwtClaims;

        @NameInMap("UserId")
        public String userId;

        public static AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContext build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContext self = new AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContext();
            return TeaModel.build(map, self);
        }

        public AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContext setJwtClaims(AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContextJwtClaims jwtClaims) {
            this.jwtClaims = jwtClaims;
            return this;
        }
        public AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContextJwtClaims getJwtClaims() {
            return this.jwtClaims;
        }

        public AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfo extends TeaModel {
        @NameInMap("UserContext")
        public AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContext userContext;

        @NameInMap("WorkloadIdentityArn")
        public String workloadIdentityArn;

        public static AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfo build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfo self = new AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfo();
            return TeaModel.build(map, self);
        }

        public AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfo setUserContext(AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfoUserContext getUserContext() {
            return this.userContext;
        }

        public AssumeRoleForWorkloadIdentityResponseBodyWorkloadContextInfo setWorkloadIdentityArn(String workloadIdentityArn) {
            this.workloadIdentityArn = workloadIdentityArn;
            return this;
        }
        public String getWorkloadIdentityArn() {
            return this.workloadIdentityArn;
        }

    }

}
