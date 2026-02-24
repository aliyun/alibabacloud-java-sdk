// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigRuleEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The compliance package ID.</p>
     * <p>For more information about how to obtain a compliance package ID, see <a href="https://help.aliyun.com/document_detail/263332.html">ListCompliancePacks</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cp-f1e3326622af00cb****</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The compliance evaluation result. Valid values:</p>
     * <ul>
     * <li><p>COMPLIANT: The resource is compliant.</p>
     * </li>
     * <li><p>NON_COMPLIANT: The resource is non-compliant.</p>
     * </li>
     * <li><p>NOT_APPLICABLE: The rule does not apply to the resource.</p>
     * </li>
     * <li><p>INSUFFICIENT_DATA: No data is available.</p>
     * </li>
     * <li><p>IGNORED: The evaluation result is ignored.</p>
     * </li>
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
     * <p>For more information about how to obtain a rule ID, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-cac56457e0d900d3****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The maximum number of entries to return on each page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>If the response is truncated, use the <code>NextToken</code> to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>IWBjqMYSy0is7zSMGu16****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region where the evaluated resource resides. Separate multiple regions with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Regions")
    public String regions;

    /**
     * <p>The ID of the resource group to which the evaluated resource belongs. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2indxn3g****</p>
     */
    @NameInMap("ResourceGroupIds")
    public String resourceGroupIds;

    /**
     * <p>The type of the evaluated resource. Separate multiple resource types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
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
