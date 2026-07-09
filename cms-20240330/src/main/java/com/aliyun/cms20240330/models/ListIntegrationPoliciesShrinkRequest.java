// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPoliciesShrinkRequest extends TeaModel {
    /**
     * <p>The addon name.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-default</p>
     */
    @NameInMap("addonName")
    public String addonName;

    /**
     * <p>The ID of the bound resource.</p>
     * 
     * <strong>example:</strong>
     * <p>622d27c2e87d49debceeebc7c642610e</p>
     */
    @NameInMap("bindResourceId")
    public String bindResourceId;

    /**
     * <p>The entity IDs used for filtering, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>eg-1,eg-2,eg-3</p>
     */
    @NameInMap("entityGroupIds")
    public String entityGroupIds;

    /**
     * <p>The region IDs used for filtering, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing,cn-hangzhou</p>
     */
    @NameInMap("filterRegionIds")
    public String filterRegionIds;

    /**
     * <p>The maximum number of results to return. Default value: 30. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve more results. You do not need to specify this parameter for the first request. Use the token returned from the previous query for subsequent requests.</p>
     * 
     * <strong>example:</strong>
     * <p>mvnX6zqg3P</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>policy-93817a401f78435596d745a97d2e85a1</p>
     */
    @NameInMap("policyId")
    public String policyId;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-database</p>
     */
    @NameInMap("policyName")
    public String policyName;

    /**
     * <p>The policy type.</p>
     * 
     * <strong>example:</strong>
     * <p>CS</p>
     */
    @NameInMap("policyType")
    public String policyType;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cmee-622d27c2e87d49debceeebc7c642610e</p>
     */
    @NameInMap("prometheusInstanceId")
    public String prometheusInstanceId;

    /**
     * <p>The keyword used for general queries.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxxxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tag")
    public String tagShrink;

    /**
     * <p>The workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ListIntegrationPoliciesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPoliciesShrinkRequest self = new ListIntegrationPoliciesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPoliciesShrinkRequest setAddonName(String addonName) {
        this.addonName = addonName;
        return this;
    }
    public String getAddonName() {
        return this.addonName;
    }

    public ListIntegrationPoliciesShrinkRequest setBindResourceId(String bindResourceId) {
        this.bindResourceId = bindResourceId;
        return this;
    }
    public String getBindResourceId() {
        return this.bindResourceId;
    }

    public ListIntegrationPoliciesShrinkRequest setEntityGroupIds(String entityGroupIds) {
        this.entityGroupIds = entityGroupIds;
        return this;
    }
    public String getEntityGroupIds() {
        return this.entityGroupIds;
    }

    public ListIntegrationPoliciesShrinkRequest setFilterRegionIds(String filterRegionIds) {
        this.filterRegionIds = filterRegionIds;
        return this;
    }
    public String getFilterRegionIds() {
        return this.filterRegionIds;
    }

    public ListIntegrationPoliciesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIntegrationPoliciesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIntegrationPoliciesShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ListIntegrationPoliciesShrinkRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public ListIntegrationPoliciesShrinkRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public ListIntegrationPoliciesShrinkRequest setPrometheusInstanceId(String prometheusInstanceId) {
        this.prometheusInstanceId = prometheusInstanceId;
        return this;
    }
    public String getPrometheusInstanceId() {
        return this.prometheusInstanceId;
    }

    public ListIntegrationPoliciesShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListIntegrationPoliciesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListIntegrationPoliciesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public ListIntegrationPoliciesShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
