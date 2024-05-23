// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticMetricSetsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return on each page. Maximum value: 100.</p>
     * <br>
     * <p>Default value:</p>
     * <br>
     * <p>*   If this parameter is left empty, the default value is 10.</p>
     * <p>*   If this parameter is set to a value greater than 100, the default value is 100.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The ID of diagnostic metric set N.</p>
     */
    @NameInMap("MetricSetIds")
    public java.util.List<String> metricSetIds;

    /**
     * <p>The query token. Set the value to the `NextToken` value returned in the last call to the DescribeDiagnosticMetricSets operation. Leave this parameter empty the first time you call this operation.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the diagnostic metric set. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource type supported by the diagnostic metric set.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The type of the diagnostic metric set. Valid values:</p>
     * <br>
     * <p>*   User: user-defined diagnostic metric set</p>
     * <p>*   Common: common diagnostic metric set</p>
     * <br>
     * <p>Default value: user.</p>
     */
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
