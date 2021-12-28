// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeScaleStrategysRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScaleStrategyName")
    public String scaleStrategyName;

    public static DescribeScaleStrategysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScaleStrategysRequest self = new DescribeScaleStrategysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScaleStrategysRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeScaleStrategysRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeScaleStrategysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScaleStrategysRequest setScaleStrategyName(String scaleStrategyName) {
        this.scaleStrategyName = scaleStrategyName;
        return this;
    }
    public String getScaleStrategyName() {
        return this.scaleStrategyName;
    }

}
