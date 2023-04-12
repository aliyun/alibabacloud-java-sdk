// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRuleEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the compliance package.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a compliance package, see [ListAggregateCompliancePacks](~~262059~~).</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The compliance evaluation result of the resources. Valid values:</p>
     * <br>
     * <p>*   COMPLIANT: The resources are evaluated as compliant.</p>
     * <p>*   NON_COMPLIANT: The resources are evaluated as non-compliant.</p>
     * <p>*   NOT_APPLICABLE: The rule does not apply to the resources.</p>
     * <p>*   INSUFFICIENT_DATA: No resource data is available.</p>
     * <p>*   IGNORED: The resources are ignored during compliance evaluation.</p>
     */
    @NameInMap("ComplianceType")
    public String complianceType;

    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListAggregateConfigRules](~~264148~~).</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The maximum number of entries to return in a request. Valid values: 1 to 100.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to initiate the next request. If the response to the current request is truncated, this token is used to initiate another request and obtain the remaining entries.``</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region whose resources you want to evaluate. Separate multiple region IDs with commas (,).</p>
     */
    @NameInMap("Regions")
    public String regions;

    @NameInMap("ResourceAccountId")
    public Long resourceAccountId;

    /**
     * <p>The ID of the resource group whose resources you want to evaluate. Separate multiple resource group IDs with commas (,).</p>
     */
    @NameInMap("ResourceGroupIds")
    public String resourceGroupIds;

    @NameInMap("ResourceOwnerId")
    @Deprecated
    public Long resourceOwnerId;

    /**
     * <p>The type of the resources that you want to evaluate. Separate multiple resource types with commas (,).</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    public static ListAggregateConfigRuleEvaluationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateConfigRuleEvaluationResultsRequest self = new ListAggregateConfigRuleEvaluationResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregateConfigRuleEvaluationResultsRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public ListAggregateConfigRuleEvaluationResultsRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public ListAggregateConfigRuleEvaluationResultsRequest setComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }
    public String getComplianceType() {
        return this.complianceType;
    }

    public ListAggregateConfigRuleEvaluationResultsRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public ListAggregateConfigRuleEvaluationResultsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAggregateConfigRuleEvaluationResultsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAggregateConfigRuleEvaluationResultsRequest setRegions(String regions) {
        this.regions = regions;
        return this;
    }
    public String getRegions() {
        return this.regions;
    }

    public ListAggregateConfigRuleEvaluationResultsRequest setResourceAccountId(Long resourceAccountId) {
        this.resourceAccountId = resourceAccountId;
        return this;
    }
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    public ListAggregateConfigRuleEvaluationResultsRequest setResourceGroupIds(String resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public String getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public ListAggregateConfigRuleEvaluationResultsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListAggregateConfigRuleEvaluationResultsRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

}
