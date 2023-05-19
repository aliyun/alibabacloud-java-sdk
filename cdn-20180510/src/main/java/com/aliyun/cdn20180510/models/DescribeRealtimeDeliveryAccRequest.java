// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRealtimeDeliveryAccRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * <br>
     * <p>The end of the time range to query. The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time interval between the data entries. Unit: seconds. The value varies based on the values of the **StartTime** and **EndTime** parameters. Valid values:</p>
     * <br>
     * <p>*   If the time span between StartTime and EndTime is less than 3 days, valid values are **300**, **3600**, and **86400**. Default value: **300**.</p>
     * <p>*   If the time span between StartTime and EndTime is from 3 to 31 days (31 days excluded), valid values are **3600** and **86400**. Default value: **3600**.</p>
     * <p>*   If the time span between StartTime and EndTime is 31 days or longer, the valid value is **86400**. Default value: **86400**.</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The timestamp of the data.</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    /**
     * <p>The name of the Log Service project that is used for real-time log delivery. By default, all projects are queried.</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The information about real-time log delivery.</p>
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
