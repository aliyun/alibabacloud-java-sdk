// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListSecurityPoliciesResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is empty, no next page exists.</p>
     * <p>*   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The supported security policies.</p>
     */
    @NameInMap("SecurityPolicies")
    public java.util.List<ListSecurityPoliciesResponseBodySecurityPolicies> securityPolicies;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSecurityPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityPoliciesResponseBody self = new ListSecurityPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityPoliciesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSecurityPoliciesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSecurityPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecurityPoliciesResponseBody setSecurityPolicies(java.util.List<ListSecurityPoliciesResponseBodySecurityPolicies> securityPolicies) {
        this.securityPolicies = securityPolicies;
        return this;
    }
    public java.util.List<ListSecurityPoliciesResponseBodySecurityPolicies> getSecurityPolicies() {
        return this.securityPolicies;
    }

    public ListSecurityPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSecurityPoliciesResponseBodySecurityPoliciesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListSecurityPoliciesResponseBodySecurityPoliciesTags build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityPoliciesResponseBodySecurityPoliciesTags self = new ListSecurityPoliciesResponseBodySecurityPoliciesTags();
            return TeaModel.build(map, self);
        }

        public ListSecurityPoliciesResponseBodySecurityPoliciesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListSecurityPoliciesResponseBodySecurityPoliciesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListSecurityPoliciesResponseBodySecurityPolicies extends TeaModel {
        /**
         * <p>The supported cipher suites.</p>
         */
        @NameInMap("Ciphers")
        public java.util.List<String> ciphers;

        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The resource group ID.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The security policy ID.</p>
         */
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        /**
         * <p>The name of the security policy.</p>
         */
        @NameInMap("SecurityPolicyName")
        public String securityPolicyName;

        /**
         * <p>The status of the security policy. Valid values:</p>
         * <br>
         * <p>*   **Configuring**</p>
         * <p>*   **Available**</p>
         */
        @NameInMap("SecurityPolicyStatus")
        public String securityPolicyStatus;

        /**
         * <p>The supported TLS protocol versions.</p>
         */
        @NameInMap("TLSVersions")
        public java.util.List<String> TLSVersions;

        @NameInMap("Tags")
        public java.util.List<ListSecurityPoliciesResponseBodySecurityPoliciesTags> tags;

        public static ListSecurityPoliciesResponseBodySecurityPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityPoliciesResponseBodySecurityPolicies self = new ListSecurityPoliciesResponseBodySecurityPolicies();
            return TeaModel.build(map, self);
        }

        public ListSecurityPoliciesResponseBodySecurityPolicies setCiphers(java.util.List<String> ciphers) {
            this.ciphers = ciphers;
            return this;
        }
        public java.util.List<String> getCiphers() {
            return this.ciphers;
        }

        public ListSecurityPoliciesResponseBodySecurityPolicies setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSecurityPoliciesResponseBodySecurityPolicies setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListSecurityPoliciesResponseBodySecurityPolicies setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        public ListSecurityPoliciesResponseBodySecurityPolicies setSecurityPolicyName(String securityPolicyName) {
            this.securityPolicyName = securityPolicyName;
            return this;
        }
        public String getSecurityPolicyName() {
            return this.securityPolicyName;
        }

        public ListSecurityPoliciesResponseBodySecurityPolicies setSecurityPolicyStatus(String securityPolicyStatus) {
            this.securityPolicyStatus = securityPolicyStatus;
            return this;
        }
        public String getSecurityPolicyStatus() {
            return this.securityPolicyStatus;
        }

        public ListSecurityPoliciesResponseBodySecurityPolicies setTLSVersions(java.util.List<String> TLSVersions) {
            this.TLSVersions = TLSVersions;
            return this;
        }
        public java.util.List<String> getTLSVersions() {
            return this.TLSVersions;
        }

        public ListSecurityPoliciesResponseBodySecurityPolicies setTags(java.util.List<ListSecurityPoliciesResponseBodySecurityPoliciesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListSecurityPoliciesResponseBodySecurityPoliciesTags> getTags() {
            return this.tags;
        }

    }

}
