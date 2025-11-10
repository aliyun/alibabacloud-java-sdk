// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPoliciesRequest extends TeaModel {
    /**
     * <p>Addon name.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-default</p>
     */
    @NameInMap("addonName")
    public String addonName;

    /**
     * <p>Bound resource ID</p>
     * 
     * <strong>example:</strong>
     * <p>622d27c2e87d49debceeebc7c642610e</p>
     */
    @NameInMap("bindResourceId")
    public String bindResourceId;

    /**
     * <p>Filter for entity IDs, separated by commas</p>
     * 
     * <strong>example:</strong>
     * <p>eg-1,eg-2,eg-3</p>
     */
    @NameInMap("entityGroupIds")
    public String entityGroupIds;

    /**
     * <p>Used for Region query, separated by commas</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing,cn-hangzhou</p>
     */
    @NameInMap("filterRegionIds")
    public String filterRegionIds;

    /**
     * <p>Maximum number of results to return. Default is 30, with a maximum of 100.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Used to return more results. This parameter is not required for the first query. For subsequent queries, use the Token obtained from the response.</p>
     * 
     * <strong>example:</strong>
     * <p>mvnX6zqg3P</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>policy-93817a401f78435596d745a97d2e85a1</p>
     */
    @NameInMap("policyId")
    public String policyId;

    /**
     * <p>Rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-database</p>
     */
    @NameInMap("policyName")
    public String policyName;

    /**
     * <p>Policy type</p>
     * 
     * <strong>example:</strong>
     * <p>CS</p>
     */
    @NameInMap("policyType")
    public String policyType;

    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cmee-622d27c2e87d49debceeebc7c642610e</p>
     */
    @NameInMap("prometheusInstanceId")
    public String prometheusInstanceId;

    /**
     * <p>Used for general queries</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxxxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Tag list.</p>
     */
    @NameInMap("tag")
    public java.util.List<ListIntegrationPoliciesRequestTag> tag;

    /**
     * <p>Workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ListIntegrationPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPoliciesRequest self = new ListIntegrationPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPoliciesRequest setAddonName(String addonName) {
        this.addonName = addonName;
        return this;
    }
    public String getAddonName() {
        return this.addonName;
    }

    public ListIntegrationPoliciesRequest setBindResourceId(String bindResourceId) {
        this.bindResourceId = bindResourceId;
        return this;
    }
    public String getBindResourceId() {
        return this.bindResourceId;
    }

    public ListIntegrationPoliciesRequest setEntityGroupIds(String entityGroupIds) {
        this.entityGroupIds = entityGroupIds;
        return this;
    }
    public String getEntityGroupIds() {
        return this.entityGroupIds;
    }

    public ListIntegrationPoliciesRequest setFilterRegionIds(String filterRegionIds) {
        this.filterRegionIds = filterRegionIds;
        return this;
    }
    public String getFilterRegionIds() {
        return this.filterRegionIds;
    }

    public ListIntegrationPoliciesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIntegrationPoliciesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIntegrationPoliciesRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ListIntegrationPoliciesRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public ListIntegrationPoliciesRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public ListIntegrationPoliciesRequest setPrometheusInstanceId(String prometheusInstanceId) {
        this.prometheusInstanceId = prometheusInstanceId;
        return this;
    }
    public String getPrometheusInstanceId() {
        return this.prometheusInstanceId;
    }

    public ListIntegrationPoliciesRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListIntegrationPoliciesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListIntegrationPoliciesRequest setTag(java.util.List<ListIntegrationPoliciesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListIntegrationPoliciesRequestTag> getTag() {
        return this.tag;
    }

    public ListIntegrationPoliciesRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class ListIntegrationPoliciesRequestTag extends TeaModel {
        /**
         * <p>Tag key</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>Tag value</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("value")
        public String value;

        public static ListIntegrationPoliciesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPoliciesRequestTag self = new ListIntegrationPoliciesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPoliciesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListIntegrationPoliciesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
