// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateWorkloadIdentityResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D325DF9D-7CA8-5C47-BA0C-9A74873F2BE3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The workload identity.</p>
     */
    @NameInMap("WorkloadIdentity")
    public CreateWorkloadIdentityResponseBodyWorkloadIdentity workloadIdentity;

    public static CreateWorkloadIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkloadIdentityResponseBody self = new CreateWorkloadIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkloadIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkloadIdentityResponseBody setWorkloadIdentity(CreateWorkloadIdentityResponseBodyWorkloadIdentity workloadIdentity) {
        this.workloadIdentity = workloadIdentity;
        return this;
    }
    public CreateWorkloadIdentityResponseBodyWorkloadIdentity getWorkloadIdentity() {
        return this.workloadIdentity;
    }

    public static class CreateWorkloadIdentityResponseBodyWorkloadIdentity extends TeaModel {
        /**
         * <p>The allowlist of Consent authorization callback URLs for the workload identity, which constrains the allowed redirect addresses during the offline delegation (OfflineAccess) authorization flow.</p>
         */
        @NameInMap("AllowedConsentCallbackURLs")
        public java.util.List<String> allowedConsentCallbackURLs;

        /**
         * <p>The list of allowed OAuth2 return URLs.</p>
         */
        @NameInMap("AllowedResourceOAuth2ReturnURLs")
        public java.util.List<String> allowedResourceOAuth2ReturnURLs;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-18T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>example agent</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The configured identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>identity-provider-okta</p>
         */
        @NameInMap("IdentityProviderName")
        public String identityProviderName;

        /**
         * <p>The ARN of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456:role/agent-101-role</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>Specifies whether session binding is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SessionBindingEnabled")
        public Boolean sessionBindingEnabled;

        /**
         * <p>The ARN of the source agent.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:workloadidentity/my-identity</p>
         */
        @NameInMap("SourceAgentArn")
        public String sourceAgentArn;

        /**
         * <p>The creation source.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("SourcePlatform")
        public String sourcePlatform;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-18T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The ARN of the workload identity.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:workloadidentitydirectory/default/workloadidentity/agent-101</p>
         */
        @NameInMap("WorkloadIdentityArn")
        public String workloadIdentityArn;

        /**
         * <p>The unique name of the workload identity.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-101</p>
         */
        @NameInMap("WorkloadIdentityName")
        public String workloadIdentityName;

        public static CreateWorkloadIdentityResponseBodyWorkloadIdentity build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkloadIdentityResponseBodyWorkloadIdentity self = new CreateWorkloadIdentityResponseBodyWorkloadIdentity();
            return TeaModel.build(map, self);
        }

        public CreateWorkloadIdentityResponseBodyWorkloadIdentity setAllowedConsentCallbackURLs(java.util.List<String> allowedConsentCallbackURLs) {
            this.allowedConsentCallbackURLs = allowedConsentCallbackURLs;
            return this;
        }
        public java.util.List<String> getAllowedConsentCallbackURLs() {
            return this.allowedConsentCallbackURLs;
        }

        public CreateWorkloadIdentityResponseBodyWorkloadIdentity setAllowedResourceOAuth2ReturnURLs(java.util.List<String> allowedResourceOAuth2ReturnURLs) {
            this.allowedResourceOAuth2ReturnURLs = allowedResourceOAuth2ReturnURLs;
            return this;
        }
        public java.util.List<String> getAllowedResourceOAuth2ReturnURLs() {
            return this.allowedResourceOAuth2ReturnURLs;
        }

        public CreateWorkloadIdentityResponseBodyWorkloadIdentity setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateWorkloadIdentityResponseBodyWorkloadIdentity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateWorkloadIdentityResponseBodyWorkloadIdentity setIdentityProviderName(String identityProviderName) {
            this.identityProviderName = identityProviderName;
            return this;
        }
        public String getIdentityProviderName() {
            return this.identityProviderName;
        }

        public CreateWorkloadIdentityResponseBodyWorkloadIdentity setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public CreateWorkloadIdentityResponseBodyWorkloadIdentity setSessionBindingEnabled(Boolean sessionBindingEnabled) {
            this.sessionBindingEnabled = sessionBindingEnabled;
            return this;
        }
        public Boolean getSessionBindingEnabled() {
            return this.sessionBindingEnabled;
        }

        public CreateWorkloadIdentityResponseBodyWorkloadIdentity setSourceAgentArn(String sourceAgentArn) {
            this.sourceAgentArn = sourceAgentArn;
            return this;
        }
        public String getSourceAgentArn() {
            return this.sourceAgentArn;
        }

        public CreateWorkloadIdentityResponseBodyWorkloadIdentity setSourcePlatform(String sourcePlatform) {
            this.sourcePlatform = sourcePlatform;
            return this;
        }
        public String getSourcePlatform() {
            return this.sourcePlatform;
        }

        public CreateWorkloadIdentityResponseBodyWorkloadIdentity setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public CreateWorkloadIdentityResponseBodyWorkloadIdentity setWorkloadIdentityArn(String workloadIdentityArn) {
            this.workloadIdentityArn = workloadIdentityArn;
            return this;
        }
        public String getWorkloadIdentityArn() {
            return this.workloadIdentityArn;
        }

        public CreateWorkloadIdentityResponseBodyWorkloadIdentity setWorkloadIdentityName(String workloadIdentityName) {
            this.workloadIdentityName = workloadIdentityName;
            return this;
        }
        public String getWorkloadIdentityName() {
            return this.workloadIdentityName;
        }

    }

}
