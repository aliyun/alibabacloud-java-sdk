// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteInstantMonitorLogRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("Length")
    public Integer length;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TaskIds")
    public String taskIds;

    public static DescribeSiteInstantMonitorLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteInstantMonitorLogRequest self = new DescribeSiteInstantMonitorLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteInstantMonitorLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteInstantMonitorLogRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public DescribeSiteInstantMonitorLogRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public DescribeSiteInstantMonitorLogRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeSiteInstantMonitorLogRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSiteInstantMonitorLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSiteInstantMonitorLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSiteInstantMonitorLogRequest setTaskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public String getTaskIds() {
        return this.taskIds;
    }

}
