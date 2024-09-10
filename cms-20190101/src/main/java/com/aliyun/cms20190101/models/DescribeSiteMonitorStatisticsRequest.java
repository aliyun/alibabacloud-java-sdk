// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorStatisticsRequest extends TeaModel {
    /**
     * <p>The name of the metric. Valid values:</p>
     * <ul>
     * <li>Availability</li>
     * <li>ErrorRate</li>
     * <li>ResponseTime</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Availability</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The timestamp that specifies the beginning of the time range to query.</p>
     * <p>Unit: milliseconds. The default value is 1 hour ahead of the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>1576142850527</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the site monitoring task.</p>
     * <p>For more information about how to obtain the ID of a site monitoring task, see <a href="https://help.aliyun.com/document_detail/115052.html">DescribeSiteMonitorList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ef4cdc8b-9dc7-43e7-810e-f950e56c****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The statistical period.</p>
     * <p>Unit: minutes. Default value: 1440 (1 day). Maximum value: 43200 (30 days).</p>
     * 
     * <strong>example:</strong>
     * <p>1440</p>
     */
    @NameInMap("TimeRange")
    public String timeRange;

    public static DescribeSiteMonitorStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorStatisticsRequest self = new DescribeSiteMonitorStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorStatisticsRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeSiteMonitorStatisticsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSiteMonitorStatisticsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSiteMonitorStatisticsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeSiteMonitorStatisticsRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
