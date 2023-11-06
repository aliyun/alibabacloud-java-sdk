// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigRuleEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The ID of the compliance package.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a compliance package, see [ListCompliancePacks](~~263332~~).</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The compliance evaluation result of the resource. Valid values:</p>
     * <br>
     * <p>*   COMPLIANT: The resource is evaluated as compliant.</p>
     * <p>*   NON_COMPLIANT: The resource is evaluated as non-compliant.</p>
     * <p>*   NOT_APPLICABLE: The rule does not apply to the resource.</p>
     * <p>*   INSUFFICIENT_DATA: No data is available.</p>
     * <p>*   IGNORED: The resource is ignored during compliance evaluation.</p>
     */
    @NameInMap("ComplianceType")
    public String complianceType;

    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListConfigRules](~~169607~~).</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The maximum number of entries to return for a single request. Valid values: 1 to 100.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to initiate the next request. If the response to the current request is truncated, this token is used to initiate another request and obtain the remaining entries.``</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the resources that you want to evaluate reside. Separate multiple region IDs with commas (,).</p>
     */
    @NameInMap("Regions")
    public String regions;

    /**
     * <p>The ID of the resource group to which the resources that you want to evaluate belong. Separate multiple resource group IDs with commas (,).</p>
     */
    @NameInMap("ResourceGroupIds")
    public String resourceGroupIds;

    /**
     * <p>The type of the resources that you want to evaluate. Separate multiple resource types with commas (,).</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    public static ListConfigRuleEvaluationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRuleEvaluationResultsRequest self = new ListConfigRuleEvaluationResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigRuleEvaluationResultsRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public ListConfigRuleEvaluationResultsRequest setComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }
    public String getComplianceType() {
        return this.complianceType;
    }

    public ListConfigRuleEvaluationResultsRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public ListConfigRuleEvaluationResultsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConfigRuleEvaluationResultsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConfigRuleEvaluationResultsRequest setRegions(String regions) {
        this.regions = regions;
        return this;
    }
    public String getRegions() {
        return this.regions;
    }

    public ListConfigRuleEvaluationResultsRequest setResourceGroupIds(String resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public String getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public ListConfigRuleEvaluationResultsRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

}
