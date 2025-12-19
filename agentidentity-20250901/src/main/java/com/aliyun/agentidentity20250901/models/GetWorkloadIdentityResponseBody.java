// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetWorkloadIdentityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5EEF5C1D-E951-5C0D-B0BC-5FF1B626CFC6</p>
     */
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
