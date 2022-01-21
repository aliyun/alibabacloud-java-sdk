// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorDataRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Length")
    public Integer length;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Period")
    public String period;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("Type")
    public String type;

    public static DescribeSiteMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorDataRequest self = new DescribeSiteMonitorDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteMonitorDataRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public DescribeSiteMonitorDataRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeSiteMonitorDataRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSiteMonitorDataRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeSiteMonitorDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSiteMonitorDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSiteMonitorDataRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeSiteMonitorDataRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
