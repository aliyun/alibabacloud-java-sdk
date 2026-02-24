// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListResourceEvaluationResultsRequest extends TeaModel {
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
     * <p>The maximum number of entries to return for a single request. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>If the response is truncated, pass the <code>NextToken</code> value in a subsequent request to retrieve the remaining results.</p>
     * 
     * <strong>example:</strong>
     * <p>IWBjqMYSy0is7zSMGu16****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the resource resides. For example, <code>global</code> indicates Global, and <code>cn-hangzhou</code> indicates China (Hangzhou).</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The resource ID.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>23642660635396****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::RAM::User</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The risk level of the rule. Valid values:</p>
     * <ul>
     * <li><p>1: High risk.</p>
     * </li>
     * <li><p>2: Medium risk.</p>
     * </li>
     * <li><p>3: Low risk.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>This parameter is optional. The only supported value is <code>LastNonCompliantRecordTimestamp-Asc</code>. This value sorts resources based on when they first became non-compliant, with the earliest appearing first. Use this parameter only when you set the <code>ComplianceType</code> parameter to <code>NON_COMPLIANT</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>LastNonCompliantRecordTimestamp-Asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListResourceEvaluationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceEvaluationResultsRequest self = new ListResourceEvaluationResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceEvaluationResultsRequest setComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }
    public String getComplianceType() {
        return this.complianceType;
    }

    public ListResourceEvaluationResultsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceEvaluationResultsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceEvaluationResultsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListResourceEvaluationResultsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListResourceEvaluationResultsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListResourceEvaluationResultsRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public ListResourceEvaluationResultsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
