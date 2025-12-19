// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListWorkloadIdentitiesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAcCoknY19uiBwPrAe1W7XMikkA6+rCQddIGHccphiDPypD8zCxQkHV2pg8CkZvyRKg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>173C69C9-9C07-5B25-9477-603A33E5DA32</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>33</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("WorkloadIdentities")
    public java.util.List<ListWorkloadIdentitiesResponseBodyWorkloadIdentities> workloadIdentities;

    public static ListWorkloadIdentitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkloadIdentitiesResponseBody self = new ListWorkloadIdentitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkloadIdentitiesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkloadIdentitiesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkloadIdentitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkloadIdentitiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListWorkloadIdentitiesResponseBody setWorkloadIdentities(java.util.List<ListWorkloadIdentitiesResponseBodyWorkloadIdentities> workloadIdentities) {
        this.workloadIdentities = workloadIdentities;
        return this;
    }
    public java.util.List<ListWorkloadIdentitiesResponseBodyWorkloadIdentities> getWorkloadIdentities() {
        return this.workloadIdentities;
    }

    public static class ListWorkloadIdentitiesResponseBodyWorkloadIdentities extends TeaModel {
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

        @NameInMap("IdentityProviderName")
        public String identityProviderName;

        /**
         * <strong>example:</strong>
         * <p>acs:ram::1953507478506681:role/test-rrsa-cb5ca90a20f854671adbac6ed4559a654</p>
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

        public static ListWorkloadIdentitiesResponseBodyWorkloadIdentities build(java.util.Map<String, ?> map) throws Exception {
            ListWorkloadIdentitiesResponseBodyWorkloadIdentities self = new ListWorkloadIdentitiesResponseBodyWorkloadIdentities();
            return TeaModel.build(map, self);
        }

        public ListWorkloadIdentitiesResponseBodyWorkloadIdentities setAllowedResourceOAuth2ReturnURLs(java.util.List<String> allowedResourceOAuth2ReturnURLs) {
            this.allowedResourceOAuth2ReturnURLs = allowedResourceOAuth2ReturnURLs;
            return this;
        }
        public java.util.List<String> getAllowedResourceOAuth2ReturnURLs() {
            return this.allowedResourceOAuth2ReturnURLs;
        }

        public ListWorkloadIdentitiesResponseBodyWorkloadIdentities setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWorkloadIdentitiesResponseBodyWorkloadIdentities setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkloadIdentitiesResponseBodyWorkloadIdentities setIdentityProviderName(String identityProviderName) {
            this.identityProviderName = identityProviderName;
            return this;
        }
        public String getIdentityProviderName() {
            return this.identityProviderName;
        }

        public ListWorkloadIdentitiesResponseBodyWorkloadIdentities setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public ListWorkloadIdentitiesResponseBodyWorkloadIdentities setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListWorkloadIdentitiesResponseBodyWorkloadIdentities setWorkloadIdentityArn(String workloadIdentityArn) {
            this.workloadIdentityArn = workloadIdentityArn;
            return this;
        }
        public String getWorkloadIdentityArn() {
            return this.workloadIdentityArn;
        }

        public ListWorkloadIdentitiesResponseBodyWorkloadIdentities setWorkloadIdentityName(String workloadIdentityName) {
            this.workloadIdentityName = workloadIdentityName;
            return this;
        }
        public String getWorkloadIdentityName() {
            return this.workloadIdentityName;
        }

    }

}
