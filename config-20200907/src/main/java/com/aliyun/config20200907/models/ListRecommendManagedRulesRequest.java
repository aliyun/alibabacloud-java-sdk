// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListRecommendManagedRulesRequest extends TeaModel {
    /**
     * <p>The rule does not take effect on resources in the specified regions. The resources in the specified regions are not evaluated. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ExcludeRegionIdsScope")
    public String excludeRegionIdsScope;

    /**
     * <p>The rule does not take effect on resources in the specified resource groups. The resources in the specified resource groups are not evaluated. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bnczc6r7rml****</p>
     */
    @NameInMap("ExcludeResourceGroupIdsScope")
    public String excludeResourceGroupIdsScope;

    /**
     * <p>The rule does not take effect on the specified resources. The specified resources are not evaluated. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>23642660635687****</p>
     */
    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    /**
     * <p>The maximum number of entries to return on each page. Default value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that specifies the position from which to start the query. If this parameter is left empty, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>IWBjqMYSy0is7zSMGu16****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The scope of region IDs. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    /**
     * <p>The rule takes effect only on resources in the specified resource groups. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzc7r7rhx****</p>
     */
    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    /**
     * <p>The rule takes effect on the specified resources. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5cmbowstbkss9ta03****</p>
     */
    @NameInMap("ResourceIdsScope")
    public String resourceIdsScope;

    /**
     * <p>The managed rules that have been selected. Separate multiple rule identifiers with commas (,).
     * The system does not recommend managed rules that are of the same resource type as the selected managed rules.</p>
     * 
     * <strong>example:</strong>
     * <p>ram-user-last-login-expired-check</p>
     */
    @NameInMap("SelectedManagedRuleIdentifiers")
    public String selectedManagedRuleIdentifiers;

    public static ListRecommendManagedRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecommendManagedRulesRequest self = new ListRecommendManagedRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListRecommendManagedRulesRequest setExcludeRegionIdsScope(String excludeRegionIdsScope) {
        this.excludeRegionIdsScope = excludeRegionIdsScope;
        return this;
    }
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    public ListRecommendManagedRulesRequest setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
        this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
        return this;
    }
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    public ListRecommendManagedRulesRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public ListRecommendManagedRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRecommendManagedRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRecommendManagedRulesRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public ListRecommendManagedRulesRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public ListRecommendManagedRulesRequest setResourceIdsScope(String resourceIdsScope) {
        this.resourceIdsScope = resourceIdsScope;
        return this;
    }
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    public ListRecommendManagedRulesRequest setSelectedManagedRuleIdentifiers(String selectedManagedRuleIdentifiers) {
        this.selectedManagedRuleIdentifiers = selectedManagedRuleIdentifiers;
        return this;
    }
    public String getSelectedManagedRuleIdentifiers() {
        return this.selectedManagedRuleIdentifiers;
    }

}
