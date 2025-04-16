// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticMetricSetsRequest extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>If this parameter is left empty, the default value is 10.</li>
     * <li>If you set this parameter to a value that is greater than 100, the default value is 100.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The IDs of diagnostic metric sets.</p>
     */
    @NameInMap("MetricSetIds")
    public java.util.List<String> metricSetIds;

    /**
     * <p>The pagination token that is used in the request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the diagnostic metric set. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource type supported by the diagnostic metric set.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The type of the diagnostic metric set. Valid values:</p>
     * <ul>
     * <li>User: user-defined diagnostic metric set</li>
     * <li>Common: common diagnostic metric set</li>
     * </ul>
     * <p>Default value: User.</p>
     * 
     * <strong>example:</strong>
     * <p>User</p>
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
