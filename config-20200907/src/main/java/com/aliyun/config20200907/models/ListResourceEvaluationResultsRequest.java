// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListResourceEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The compliance evaluation result of the resources. Valid values:</p>
     * <br>
     * <p>*   COMPLIANT: The resources are evaluated as compliant.</p>
     * <p>*   NON_COMPLIANT: The resources are evaluated as incompliant.</p>
     * <p>*   NOT_APPLICABLE: The rule does not apply to your resources.</p>
     * <p>*   INSUFFICIENT_DATA: No resource data is available.</p>
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
     * <p>The ID of the region where one or more resources you want to query reside. For example, the value `global` indicates global regions and the value `cn-hangzhou` indicates the China (Hangzhou) region.</p>
     * <br>
     * <p>For more information about how to obtain the ID of the region where a resource resides, see [ListDiscoveredResources](~~169620~~).</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the resource.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a resource, see [ListDiscoveredResources](~~169620~~).</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the resource.</p>
     * <br>
     * <p>For more information about how to query the type of a resource, see [ListDiscoveredResources](~~169620~~).</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

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

}
