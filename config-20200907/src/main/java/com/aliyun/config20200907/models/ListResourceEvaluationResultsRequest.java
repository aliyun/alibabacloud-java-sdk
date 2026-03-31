// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListResourceEvaluationResultsRequest extends TeaModel {
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
     */
    @NameInMap("ComplianceType")
    public String complianceType;

    /**
     * <p>The maximum number of entries to return in a request. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that you want to use to initiate the current request. If the response of the previous request is truncated, you can use this token to initiate another request and obtain the remaining entries.``</p>
     * 
     * <strong>example:</strong>
     * <p>IWBjqMYSy0is7zSMGu16****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where one or more resources you want to query reside. For example, the value <code>global</code> indicates global regions and the value <code>cn-hangzhou</code> indicates the China (Hangzhou) region.</p>
     * <p>For more information about how to obtain the ID of the region where a resource resides, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the resource.</p>
     * <p>For more information about how to obtain the ID of a resource, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>23642660635396****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the resource.</p>
     * <p>For more information about how to query the type of a resource, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::RAM::User</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("RiskLevel")
    public Integer riskLevel;

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
