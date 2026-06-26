// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetWorkloadIdentityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WorkloadIdentity")
    public GetWorkloadIdentityResponseBodyWorkloadIdentity workloadIdentity;

    public static GetWorkloadIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkloadIdentityResponseBody self = new GetWorkloadIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkloadIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkloadIdentityResponseBody setWorkloadIdentity(GetWorkloadIdentityResponseBodyWorkloadIdentity workloadIdentity) {
        this.workloadIdentity = workloadIdentity;
        return this;
    }
    public GetWorkloadIdentityResponseBodyWorkloadIdentity getWorkloadIdentity() {
        return this.workloadIdentity;
    }

    public static class GetWorkloadIdentityResponseBodyWorkloadIdentity extends TeaModel {
        @NameInMap("AllowedResourceOAuth2ReturnURLs")
        public java.util.List<String> allowedResourceOAuth2ReturnURLs;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("IdentityProviderName")
        public String identityProviderName;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("SessionBindingEnabled")
        public Boolean sessionBindingEnabled;

        @NameInMap("SourceAgentArn")
        public String sourceAgentArn;

        @NameInMap("SourcePlatform")
        public String sourcePlatform;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("WorkloadIdentityArn")
        public String workloadIdentityArn;

        @NameInMap("WorkloadIdentityName")
        public String workloadIdentityName;

        public static GetWorkloadIdentityResponseBodyWorkloadIdentity build(java.util.Map<String, ?> map) throws Exception {
            GetWorkloadIdentityResponseBodyWorkloadIdentity self = new GetWorkloadIdentityResponseBodyWorkloadIdentity();
            return TeaModel.build(map, self);
        }

        public GetWorkloadIdentityResponseBodyWorkloadIdentity setAllowedResourceOAuth2ReturnURLs(java.util.List<String> allowedResourceOAuth2ReturnURLs) {
            this.allowedResourceOAuth2ReturnURLs = allowedResourceOAuth2ReturnURLs;
            return this;
        }
        public java.util.List<String> getAllowedResourceOAuth2ReturnURLs() {
            return this.allowedResourceOAuth2ReturnURLs;
        }

        public GetWorkloadIdentityResponseBodyWorkloadIdentity setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetWorkloadIdentityResponseBodyWorkloadIdentity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkloadIdentityResponseBodyWorkloadIdentity setIdentityProviderName(String identityProviderName) {
            this.identityProviderName = identityProviderName;
            return this;
        }
        public String getIdentityProviderName() {
            return this.identityProviderName;
        }

        public GetWorkloadIdentityResponseBodyWorkloadIdentity setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public GetWorkloadIdentityResponseBodyWorkloadIdentity setSessionBindingEnabled(Boolean sessionBindingEnabled) {
            this.sessionBindingEnabled = sessionBindingEnabled;
            return this;
        }
        public Boolean getSessionBindingEnabled() {
            return this.sessionBindingEnabled;
        }

        public GetWorkloadIdentityResponseBodyWorkloadIdentity setSourceAgentArn(String sourceAgentArn) {
            this.sourceAgentArn = sourceAgentArn;
            return this;
        }
        public String getSourceAgentArn() {
            return this.sourceAgentArn;
        }

        public GetWorkloadIdentityResponseBodyWorkloadIdentity setSourcePlatform(String sourcePlatform) {
            this.sourcePlatform = sourcePlatform;
            return this;
        }
        public String getSourcePlatform() {
            return this.sourcePlatform;
        }

        public GetWorkloadIdentityResponseBodyWorkloadIdentity setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetWorkloadIdentityResponseBodyWorkloadIdentity setWorkloadIdentityArn(String workloadIdentityArn) {
            this.workloadIdentityArn = workloadIdentityArn;
            return this;
        }
        public String getWorkloadIdentityArn() {
            return this.workloadIdentityArn;
        }

        public GetWorkloadIdentityResponseBodyWorkloadIdentity setWorkloadIdentityName(String workloadIdentityName) {
            this.workloadIdentityName = workloadIdentityName;
            return this;
        }
        public String getWorkloadIdentityName() {
            return this.workloadIdentityName;
        }

    }

}
