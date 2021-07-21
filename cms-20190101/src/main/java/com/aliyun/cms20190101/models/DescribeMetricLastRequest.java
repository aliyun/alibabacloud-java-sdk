// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricLastRequest extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("Period")
    public String period;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Dimensions")
    public String dimensions;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Length")
    public String length;

    @NameInMap("Express")
    public String express;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeMetricLastRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricLastRequest self = new DescribeMetricLastRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricLastRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeMetricLastRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeMetricLastRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeMetricLastRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeMetricLastRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMetricLastRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public DescribeMetricLastRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeMetricLastRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public DescribeMetricLastRequest setExpress(String express) {
        this.express = express;
        return this;
    }
    public String getExpress() {
        return this.express;
    }

    public DescribeMetricLastRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
