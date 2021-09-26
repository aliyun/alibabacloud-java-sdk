// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeScalingCommonConfigResponseBody extends TeaModel {
    // requestId
    @NameInMap("requestId")
    public String requestId;

    // autoScalingHookHeartbeatDefaultTime
    @NameInMap("AutoScalingHookHeartbeatDefaultTime")
    public Long autoScalingHookHeartbeatDefaultTime;

    @NameInMap("AutoScalingCoolDownTime")
    public Long autoScalingCoolDownTime;

    @NameInMap("AutoScalingMNSScalingThreadSleepTime")
    public Long autoScalingMNSScalingThreadSleepTime;

    @NameInMap("AutoScalingGroupMinSizeLimit")
    public Long autoScalingGroupMinSizeLimit;

    @NameInMap("AutoScalingGroupMaxSizeLimit")
    public Long autoScalingGroupMaxSizeLimit;

    @NameInMap("AutoScalingRuleMinDelayLimit")
    public Long autoScalingRuleMinDelayLimit;

    @NameInMap("AutoScalingRuleAlarmDelayLimit")
    public Long autoScalingRuleAlarmDelayLimit;

    @NameInMap("AutoScalingRuleAlarmSilentTime")
    public Long autoScalingRuleAlarmSilentTime;

    @NameInMap("AutoScalingConfigSystemDiskSize")
    public Long autoScalingConfigSystemDiskSize;

    @NameInMap("AutoScalingConfigDecommissionQueryInterval")
    public Long autoScalingConfigDecommissionQueryInterval;

    public static DescribeScalingCommonConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingCommonConfigResponseBody self = new DescribeScalingCommonConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingCommonConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingHookHeartbeatDefaultTime(Long autoScalingHookHeartbeatDefaultTime) {
        this.autoScalingHookHeartbeatDefaultTime = autoScalingHookHeartbeatDefaultTime;
        return this;
    }
    public Long getAutoScalingHookHeartbeatDefaultTime() {
        return this.autoScalingHookHeartbeatDefaultTime;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingCoolDownTime(Long autoScalingCoolDownTime) {
        this.autoScalingCoolDownTime = autoScalingCoolDownTime;
        return this;
    }
    public Long getAutoScalingCoolDownTime() {
        return this.autoScalingCoolDownTime;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingMNSScalingThreadSleepTime(Long autoScalingMNSScalingThreadSleepTime) {
        this.autoScalingMNSScalingThreadSleepTime = autoScalingMNSScalingThreadSleepTime;
        return this;
    }
    public Long getAutoScalingMNSScalingThreadSleepTime() {
        return this.autoScalingMNSScalingThreadSleepTime;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingGroupMinSizeLimit(Long autoScalingGroupMinSizeLimit) {
        this.autoScalingGroupMinSizeLimit = autoScalingGroupMinSizeLimit;
        return this;
    }
    public Long getAutoScalingGroupMinSizeLimit() {
        return this.autoScalingGroupMinSizeLimit;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingGroupMaxSizeLimit(Long autoScalingGroupMaxSizeLimit) {
        this.autoScalingGroupMaxSizeLimit = autoScalingGroupMaxSizeLimit;
        return this;
    }
    public Long getAutoScalingGroupMaxSizeLimit() {
        return this.autoScalingGroupMaxSizeLimit;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingRuleMinDelayLimit(Long autoScalingRuleMinDelayLimit) {
        this.autoScalingRuleMinDelayLimit = autoScalingRuleMinDelayLimit;
        return this;
    }
    public Long getAutoScalingRuleMinDelayLimit() {
        return this.autoScalingRuleMinDelayLimit;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingRuleAlarmDelayLimit(Long autoScalingRuleAlarmDelayLimit) {
        this.autoScalingRuleAlarmDelayLimit = autoScalingRuleAlarmDelayLimit;
        return this;
    }
    public Long getAutoScalingRuleAlarmDelayLimit() {
        return this.autoScalingRuleAlarmDelayLimit;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingRuleAlarmSilentTime(Long autoScalingRuleAlarmSilentTime) {
        this.autoScalingRuleAlarmSilentTime = autoScalingRuleAlarmSilentTime;
        return this;
    }
    public Long getAutoScalingRuleAlarmSilentTime() {
        return this.autoScalingRuleAlarmSilentTime;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingConfigSystemDiskSize(Long autoScalingConfigSystemDiskSize) {
        this.autoScalingConfigSystemDiskSize = autoScalingConfigSystemDiskSize;
        return this;
    }
    public Long getAutoScalingConfigSystemDiskSize() {
        return this.autoScalingConfigSystemDiskSize;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingConfigDecommissionQueryInterval(Long autoScalingConfigDecommissionQueryInterval) {
        this.autoScalingConfigDecommissionQueryInterval = autoScalingConfigDecommissionQueryInterval;
        return this;
    }
    public Long getAutoScalingConfigDecommissionQueryInterval() {
        return this.autoScalingConfigDecommissionQueryInterval;
    }

}
