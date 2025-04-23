// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigRuleEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The ID of the compliance package.</p>
     * <p>For more information about how to obtain the ID of a compliance package, see <a href="https://help.aliyun.com/document_detail/263332.html">ListCompliancePacks</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cp-f1e3326622af00cb****</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The compliance evaluation result of the resource. Valid values:</p>
     * <ul>
     * <li>COMPLIANT: The resource is evaluated as compliant.</li>
     * <li>NON_COMPLIANT: The resource is evaluated as non-compliant.</li>
     * <li>NOT_APPLICABLE: The rule does not apply to the resources.</li>
     * <li>INSUFFICIENT_DATA: No data is available.</li>
     * <li>IGNORED: The resource is ignored during compliance evaluation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NON_COMPLIANT</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ComplianceType")
    public String complianceType;

    /**
     * <p>The rule ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a> operation to obtain the rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-cac56457e0d900d3****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The maximum number of entries to return in a request. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>IWBjqMYSy0is7zSMGu16****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the resources that you want to evaluate reside. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Regions")
    public String regions;

    /**
     * <p>The ID of the resource group to which the resources that you want to evaluate belong. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2indxn3g****</p>
     */
    @NameInMap("ResourceGroupIds")
    public String resourceGroupIds;

    /**
     * <p>The type of the resources that you want to evaluate. Separate multiple resource types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instane</p>
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
