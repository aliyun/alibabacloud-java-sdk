// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceMonitorDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. If the value of the seconds place is not 00, the start time is automatically set to the next minute.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the instance. You can specify only one instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The precision of the monitoring data that you want to obtain. Valid values: 60, 300, 1200, 3600, and 14400. Default value: 60. Unit: seconds.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. If the value of the seconds place is not 00, the start time is automatically set to the next minute.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The version number.</p>
     */
    @NameInMap("Version")
    public String version;

    public static DescribeInstanceMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMonitorDataRequest self = new DescribeInstanceMonitorDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMonitorDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInstanceMonitorDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceMonitorDataRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeInstanceMonitorDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeInstanceMonitorDataRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
