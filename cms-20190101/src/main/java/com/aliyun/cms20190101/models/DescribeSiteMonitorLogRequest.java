// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorLogRequest extends TeaModel {
    @NameInMap("City")
    public String city;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("Isp")
    public String isp;

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

    public static DescribeSiteMonitorLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorLogRequest self = new DescribeSiteMonitorLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorLogRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DescribeSiteMonitorLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteMonitorLogRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public DescribeSiteMonitorLogRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeSiteMonitorLogRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public DescribeSiteMonitorLogRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeSiteMonitorLogRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSiteMonitorLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSiteMonitorLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSiteMonitorLogRequest setTaskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public String getTaskIds() {
        return this.taskIds;
    }

}
