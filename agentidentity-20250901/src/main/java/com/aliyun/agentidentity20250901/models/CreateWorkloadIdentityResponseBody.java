// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateWorkloadIdentityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D325DF9D-7CA8-5C47-BA0C-9A74873F2BE3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AllowedResourceOAuth2ReturnURLs")
        public java.util.List<String> allowedResourceOAuth2ReturnURLs;

        /**
         * <strong>example:</strong>
         * <p>2025-12-18T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>example agent</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>identity-provider-okta</p>
         */
        @NameInMap("IdentityProviderName")
        public String identityProviderName;

        /**
         * <strong>example:</strong>
         * <p>acs:ram::123456:role/agent-101-role</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <strong>example:</strong>
         * <p>2025-12-18T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:workloadidentitydirectory/default/workloadidentity/agent-101</p>
         */
        @NameInMap("WorkloadIdentityArn")
        public String workloadIdentityArn;

        /**
         * <strong>example:</strong>
         * <p>agent-101</p>
         */
        @NameInMap("WorkloadIdentityName")
        public String workloadIdentityName;

        public static CreateWorkloadIdentityResponseBodyWorkloadIdentity build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkloadIdentityResponseBodyWorkloadIdentity self = new CreateWorkloadIdentityResponseBodyWorkloadIdentity();
            return TeaModel.build(map, self);
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
