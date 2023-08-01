// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticMetricsRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The ID of diagnostic metric.</p>
     */
    @NameInMap("MetricIds")
    public java.util.List<String> metricIds;

    /**
     * <p>The maximum number of entries to return on each page. Maximum value: 100.</p>
     * <br>
     * <p>Default value:</p>
     * <br>
     * <p>*   If this parameter is left empty, the default value is 10.</p>
     * <p>*   If this parameter is set to a value greater than 100, the default value is 100.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The IDs of diagnostic metrics.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The query token. Set the value to the `NextToken` value returned in the last call to the DescribeDiagnosticMetrics operation. Leave this parameter empty the first time you call this operation.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeDiagnosticMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticMetricsRequest self = new DescribeDiagnosticMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticMetricsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDiagnosticMetricsRequest setMetricIds(java.util.List<String> metricIds) {
        this.metricIds = metricIds;
        return this;
    }
    public java.util.List<String> getMetricIds() {
        return this.metricIds;
    }

    public DescribeDiagnosticMetricsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiagnosticMetricsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiagnosticMetricsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
