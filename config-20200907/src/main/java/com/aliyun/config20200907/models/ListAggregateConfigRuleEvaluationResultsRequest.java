// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRuleEvaluationResultsRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("CompliancePackId")
    public String compliancePackId;

    @NameInMap("ComplianceType")
    public String complianceType;

    @NameInMap("ConfigRuleId")
    public String configRuleId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Regions")
    public String regions;

    @NameInMap("ResourceGroupIds")
    public String resourceGroupIds;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
