// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateResourceEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-7f00626622af0041****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The compliance evaluation result. Valid values:</p>
     * <ul>
     * <li><p>COMPLIANT: The resource is compliant.</p>
     * </li>
     * <li><p>NON_COMPLIANT: The resource is non-compliant.</p>
     * </li>
     * <li><p>NOT_APPLICABLE: The rule does not apply to the resource.</p>
     * </li>
     * <li><p>INSUFFICIENT_DATA: No data is available for the resource.</p>
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
     * <p>The maximum number of entries to return on each page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the response is truncated, you can use this token to initiate another request to retrieve the remaining records.</p>
     * 
     * <strong>example:</strong>
     * <p>IWBjqMYSy0is7zSMGu16****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the resource resides. For example, <code>global</code> indicates Global and <code>cn-hangzhou</code> indicates China (Hangzhou).</p>
     * <p>For more information about how to obtain the region ID of a resource, see <a href="https://help.aliyun.com/document_detail/265983.html">ListAggregateDiscoveredResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The resource ID.</p>
     * <p>For more information about how to obtain the resource ID, see <a href="https://help.aliyun.com/document_detail/265983.html">ListAggregateDiscoveredResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>23642660635396****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type.</p>
     * <p>For more information about how to obtain the resource type, see <a href="https://help.aliyun.com/document_detail/265983.html">ListAggregateDiscoveredResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::RAM::User</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The risk level of the compliance package. Valid values:</p>
     * <ul>
     * <li><p>1: high</p>
     * </li>
     * <li><p>2: medium</p>
     * </li>
     * <li><p>3: low</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The sorting method. By default, this parameter is not specified. The supported value is <code>LastNonCompliantRecordTimestamp-Asc</code>. This value sorts resources based on the time when they first became non-compliant, in ascending order. You must set the <code>ComplianceType</code> parameter to <code>NON_COMPLIANT</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>LastNonCompliantRecordTimestamp-Asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListAggregateResourceEvaluationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateResourceEvaluationResultsRequest self = new ListAggregateResourceEvaluationResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregateResourceEvaluationResultsRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public ListAggregateResourceEvaluationResultsRequest setComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }
    public String getComplianceType() {
        return this.complianceType;
    }

    public ListAggregateResourceEvaluationResultsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAggregateResourceEvaluationResultsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAggregateResourceEvaluationResultsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListAggregateResourceEvaluationResultsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListAggregateResourceEvaluationResultsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListAggregateResourceEvaluationResultsRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public ListAggregateResourceEvaluationResultsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
