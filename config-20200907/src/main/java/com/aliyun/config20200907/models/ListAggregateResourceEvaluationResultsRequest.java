// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateResourceEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](https://help.aliyun.com/document_detail/255797.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

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
     * <p>The maximum number of entries to return for a single request. Valid values: 1 to 100.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that you want to use to initiate the current request. If the response of the previous request is truncated, you can use this token to initiate another request and obtain the remaining entries.``</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where one or more resources that you want to query reside. For example, the value `global` indicates global regions and the value `cn-hangzhou` indicates the China (Hangzhou) region.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a region, see [ListAggregateDiscoveredResources](https://help.aliyun.com/document_detail/265983.html).</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the resource.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a resource, see [ListAggregateDiscoveredResources](https://help.aliyun.com/document_detail/265983.html).</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the resource.</p>
     * <br>
     * <p>For more information about how to query the type of a resource, see [ListAggregateDiscoveredResources](https://help.aliyun.com/document_detail/265983.html).</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

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

}
