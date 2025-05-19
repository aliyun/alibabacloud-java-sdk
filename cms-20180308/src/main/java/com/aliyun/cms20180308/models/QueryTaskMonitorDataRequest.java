// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryTaskMonitorDataRequest extends TeaModel {
    @NameInMap("Cursor")
    public String cursor;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Length")
    public Integer length;

    @NameInMap("Period")
    public String period;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("Type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("metricName")
    public String metricName;

    public static QueryTaskMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskMonitorDataRequest self = new QueryTaskMonitorDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskMonitorDataRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public QueryTaskMonitorDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryTaskMonitorDataRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public QueryTaskMonitorDataRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public QueryTaskMonitorDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryTaskMonitorDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryTaskMonitorDataRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryTaskMonitorDataRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryTaskMonitorDataRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

}
