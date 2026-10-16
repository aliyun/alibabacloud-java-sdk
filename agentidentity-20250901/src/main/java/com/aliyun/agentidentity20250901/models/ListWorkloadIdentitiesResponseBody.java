// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListWorkloadIdentitiesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token used to retrieve the next page of results. This field is not returned if no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAcCoknY19uiBwPrAe1W7XMikkA6+rCQddIGHccphiDPypD8zCxQkHV2pg8CkZvyRKg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>173C69C9-9C07-5B25-9477-603A33E5DA32</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of workload identities.</p>
     * 
     * <strong>example:</strong>
     * <p>33</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of workload identities.</p>
     */
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
        /**
         * <p>The whitelist of consent authorization callback URLs for the workload identity. This whitelist restricts the allowed callback addresses in the offline delegation (OfflineAccess) authorization flow.</p>
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
         * <p>Operations Center single sign-on</p>
         */
        @NameInMap("IdentityProviderName")
        public String identityProviderName;

        /**
         * <p>The ARN of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1953507478506681:role/test-rrsa-cb5ca90a20f854671adbac6ed4559a654</p>
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

        public static ListWorkloadIdentitiesResponseBodyWorkloadIdentities build(java.util.Map<String, ?> map) throws Exception {
            ListWorkloadIdentitiesResponseBodyWorkloadIdentities self = new ListWorkloadIdentitiesResponseBodyWorkloadIdentities();
            return TeaModel.build(map, self);
        }

        public ListWorkloadIdentitiesResponseBodyWorkloadIdentities setAllowedConsentCallbackURLs(java.util.List<String> allowedConsentCallbackURLs) {
            this.allowedConsentCallbackURLs = allowedConsentCallbackURLs;
            return this;
        }
        public java.util.List<String> getAllowedConsentCallbackURLs() {
            return this.allowedConsentCallbackURLs;
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

        public ListWorkloadIdentitiesResponseBodyWorkloadIdentities setSessionBindingEnabled(Boolean sessionBindingEnabled) {
            this.sessionBindingEnabled = sessionBindingEnabled;
            return this;
        }
        public Boolean getSessionBindingEnabled() {
            return this.sessionBindingEnabled;
        }

        public ListWorkloadIdentitiesResponseBodyWorkloadIdentities setSourceAgentArn(String sourceAgentArn) {
            this.sourceAgentArn = sourceAgentArn;
            return this;
        }
        public String getSourceAgentArn() {
            return this.sourceAgentArn;
        }

        public ListWorkloadIdentitiesResponseBodyWorkloadIdentities setSourcePlatform(String sourcePlatform) {
            this.sourcePlatform = sourcePlatform;
            return this;
        }
        public String getSourcePlatform() {
            return this.sourcePlatform;
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
