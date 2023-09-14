// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListSecurityPoliciesRequest extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   You do not need to specify this parameter for the first request.</p>
     * <p>*   You must specify the token that is obtained from the previous query as the value of **NextToken**.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The security policy IDs. You can specify up to 20 IDs.</p>
     */
    @NameInMap("SecurityPolicyIds")
    public java.util.List<String> securityPolicyIds;

    /**
     * <p>The names of the security policies. You can specify up to 10 names.</p>
     */
    @NameInMap("SecurityPolicyNames")
    public java.util.List<String> securityPolicyNames;

    @NameInMap("Tag")
    public java.util.List<ListSecurityPoliciesRequestTag> tag;

    public static ListSecurityPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityPoliciesRequest self = new ListSecurityPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListSecurityPoliciesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSecurityPoliciesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSecurityPoliciesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListSecurityPoliciesRequest setSecurityPolicyIds(java.util.List<String> securityPolicyIds) {
        this.securityPolicyIds = securityPolicyIds;
        return this;
    }
    public java.util.List<String> getSecurityPolicyIds() {
        return this.securityPolicyIds;
    }

    public ListSecurityPoliciesRequest setSecurityPolicyNames(java.util.List<String> securityPolicyNames) {
        this.securityPolicyNames = securityPolicyNames;
        return this;
    }
    public java.util.List<String> getSecurityPolicyNames() {
        return this.securityPolicyNames;
    }

    public ListSecurityPoliciesRequest setTag(java.util.List<ListSecurityPoliciesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListSecurityPoliciesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListSecurityPoliciesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListSecurityPoliciesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityPoliciesRequestTag self = new ListSecurityPoliciesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListSecurityPoliciesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListSecurityPoliciesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
