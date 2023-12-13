// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorDataRequest extends TeaModel {
    /**
     * <p>The end of the time range for the query. Supported formats:</p>
     * <br>
     * <p>*   UNIX timestamp: The value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * <p>*   Time format: The value is in the YYYY-MM-DDThh:mm:ssZ format.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of data points to return.</p>
     */
    @NameInMap("Length")
    public Integer length;

    /**
     * <p>The name of the metric. Valid values:</p>
     * <br>
     * <p>*   Availability</p>
     * <p>*   ResponseTime</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The pagination cursor.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The interval at which monitoring data is returned. The value is an integral multiple of 60. Unit: seconds.</p>
     * <br>
     * <p>>  The default value equals the minimum interval at which detection requests are sent to the monitored address.</p>
     */
    @NameInMap("Period")
    public String period;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range for the query. Supported formats:</p>
     * <br>
     * <p>*   UNIX timestamp: The value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * <p>*   Time format: The value is in the YYYY-MM-DDThh:mm:ssZ format.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the site monitoring task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The type of the monitored object whose monitoring data is to be queried. Valid values:</p>
     * <br>
     * <p>*   metric</p>
     * <p>*   event</p>
     */
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
