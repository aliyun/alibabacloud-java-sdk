// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeAutoScalingHistoryRequest extends TeaModel {
    /**
     * <p>The type of elastic scaling task to query. Currently, only <strong>SPEC</strong> is supported, which indicates querying the automatic performance scaling history.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SPEC</p>
     */
    @NameInMap("AutoScalingTaskType")
    public String autoScalingTaskType;

    /**
     * <p>The end time of the query task. Specify the value as a UNIX timestamp. Unit: milliseconds.</p>
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
     * <p>Currently, only ApsaraDB RDS for MySQL instances are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The start time of the query task. Specify the value as a UNIX timestamp. Unit: milliseconds.</p>
     * <blockquote>
     * <p>The start time cannot be earlier than 45 days before the current time.</p>
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
