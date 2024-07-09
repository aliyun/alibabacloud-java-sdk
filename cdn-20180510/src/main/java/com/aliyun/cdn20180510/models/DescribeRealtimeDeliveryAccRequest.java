// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRealtimeDeliveryAccRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>The end time must be later than the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-10-20T05:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the data entries. Unit: seconds. The value varies based on the values of the <strong>StartTime</strong> and <strong>EndTime</strong> parameters. Valid values:</p>
     * <ul>
     * <li>If the time span between StartTime and EndTime is less than 3 days, valid values are <strong>300</strong>, <strong>3600</strong>, and <strong>86400</strong>. Default value: <strong>300</strong>.</li>
     * <li>If the time span between StartTime and EndTime is greater than or equal to 3 days and less than 31 days, valid values are <strong>3600</strong> and <strong>86400</strong>. Default value: <strong>3600</strong>.</li>
     * <li>If the time span between StartTime and EndTime is 31 days or longer, the valid value is <strong>86400</strong>. Default value: <strong>86400</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The name of the Logstore that stores log data. If you do leave this parameter empty, real-time log deliveries of all Logstores are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>LogStore</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    /**
     * <p>The name of the Log Service project that is used for real-time log delivery. If you do leave this parameter empty, real-time log deliveries of all projects are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Project</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-10-20T04:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRealtimeDeliveryAccRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRealtimeDeliveryAccRequest self = new DescribeRealtimeDeliveryAccRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRealtimeDeliveryAccRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRealtimeDeliveryAccRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeRealtimeDeliveryAccRequest setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public DescribeRealtimeDeliveryAccRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DescribeRealtimeDeliveryAccRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
