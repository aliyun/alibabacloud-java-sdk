// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceMonitorDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. If the value of the seconds place is not 00, the start time is automatically set to the next minute.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-10-30T08:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the instance. You can specify only one instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>yourInstance ID</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The precision of the monitoring data that you want to obtain. Valid values: 60, 300, 1200, 3600, and 14400. Default value: 60. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. If the value of the seconds place is not 00, the start time is automatically set to the next minute.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-10-29T23:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

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

}
