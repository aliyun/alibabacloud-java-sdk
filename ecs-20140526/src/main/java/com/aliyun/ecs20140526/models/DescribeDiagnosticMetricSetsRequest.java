// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticMetricSetsRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("MetricSetIds")
    public java.util.List<String> metricSetIds;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Type")
    public String type;

    public static DescribeDiagnosticMetricSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticMetricSetsRequest self = new DescribeDiagnosticMetricSetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticMetricSetsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDiagnosticMetricSetsRequest setMetricSetIds(java.util.List<String> metricSetIds) {
        this.metricSetIds = metricSetIds;
        return this;
    }
    public java.util.List<String> getMetricSetIds() {
        return this.metricSetIds;
    }

    public DescribeDiagnosticMetricSetsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiagnosticMetricSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiagnosticMetricSetsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeDiagnosticMetricSetsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
