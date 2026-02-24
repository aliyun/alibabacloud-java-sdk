// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRuleEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-b1e6626622af00cb****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the compliance package.</p>
     * <p>For more information about how to obtain the ID of a compliance package, see <a href="https://help.aliyun.com/document_detail/262059.html">ListAggregateCompliancePacks</a>.</p>
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
     */
    @NameInMap("ComplianceType")
    public String complianceType;

    /**
     * <p>The rule ID.</p>
     * <p>For more information about how to obtain a rule ID, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-888f626622af00ae****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The maximum number of entries to return on a single page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is returned when the response is truncated. Use this token in the next request to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>IWBjqMYSy0is7zSMGu16****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the resource resides. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Regions")
    public String regions;

    /**
     * <p>The ID of the Alibaba Cloud account to which the resource in the account group belongs.</p>
     * <blockquote>
     * <p>Specify this parameter or \<code>ResourceOwnerId\\</code>. We recommend that you specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100931896542****</p>
     */
    @NameInMap("ResourceAccountId")
    public Long resourceAccountId;

    /**
     * <p>The ID of the resource group to which the resource belongs. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2cqyzvuj****</p>
     */
    @NameInMap("ResourceGroupIds")
    public String resourceGroupIds;

    @NameInMap("ResourceOwnerId")
    @Deprecated
    public Long resourceOwnerId;

    /**
     * <p>The resource type. Separate multiple resource types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
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

    @Deprecated
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
