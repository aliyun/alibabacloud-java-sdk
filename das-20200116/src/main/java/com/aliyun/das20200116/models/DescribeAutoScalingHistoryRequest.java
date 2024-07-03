// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeAutoScalingHistoryRequest extends TeaModel {
    /**
     * <p>The type of the auto scaling task that you want to query. Set the value to <strong>SPEC</strong>, which indicates that you can query the history of only automatic performance scaling tasks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SPEC</p>
     */
    @NameInMap("AutoScalingTaskType")
    public String autoScalingTaskType;

    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1676605305796</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>Only ApsaraDB RDS for MySQL instances are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p>The maximum time range that can be specified is 45 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1675833788056</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeAutoScalingHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoScalingHistoryRequest self = new DescribeAutoScalingHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoScalingHistoryRequest setAutoScalingTaskType(String autoScalingTaskType) {
        this.autoScalingTaskType = autoScalingTaskType;
        return this;
    }
    public String getAutoScalingTaskType() {
        return this.autoScalingTaskType;
    }

    public DescribeAutoScalingHistoryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAutoScalingHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAutoScalingHistoryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
