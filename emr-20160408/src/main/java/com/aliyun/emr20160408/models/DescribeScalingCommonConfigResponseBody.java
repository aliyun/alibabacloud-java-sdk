// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeScalingCommonConfigResponseBody extends TeaModel {
    @NameInMap("AutoScalingHookHeartbeatDefaultTime")
    public Integer autoScalingHookHeartbeatDefaultTime;

    @NameInMap("AutoScalingRuleAlarmDelayLimit")
    public Integer autoScalingRuleAlarmDelayLimit;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AutoScalingGroupMaxSizeLimit")
    public Integer autoScalingGroupMaxSizeLimit;

    @NameInMap("AutoScalingMNSScalingThreadSleepTime")
    public Long autoScalingMNSScalingThreadSleepTime;

    @NameInMap("AutoScalingConfigDecommissionQueryInterval")
    public Long autoScalingConfigDecommissionQueryInterval;

    @NameInMap("AutoScalingCoolDownTime")
    public Integer autoScalingCoolDownTime;

    @NameInMap("AutoScalingRuleMinDelayLimit")
    public Integer autoScalingRuleMinDelayLimit;

    @NameInMap("AutoScalingRuleAlarmSilentTime")
    public Integer autoScalingRuleAlarmSilentTime;

    @NameInMap("AutoScalingConfigSystemDiskSize")
    public Integer autoScalingConfigSystemDiskSize;

    @NameInMap("AutoScalingGroupMinSizeLimit")
    public Integer autoScalingGroupMinSizeLimit;

    public static DescribeScalingCommonConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingCommonConfigResponseBody self = new DescribeScalingCommonConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingHookHeartbeatDefaultTime(Integer autoScalingHookHeartbeatDefaultTime) {
        this.autoScalingHookHeartbeatDefaultTime = autoScalingHookHeartbeatDefaultTime;
        return this;
    }
    public Integer getAutoScalingHookHeartbeatDefaultTime() {
        return this.autoScalingHookHeartbeatDefaultTime;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingRuleAlarmDelayLimit(Integer autoScalingRuleAlarmDelayLimit) {
        this.autoScalingRuleAlarmDelayLimit = autoScalingRuleAlarmDelayLimit;
        return this;
    }
    public Integer getAutoScalingRuleAlarmDelayLimit() {
        return this.autoScalingRuleAlarmDelayLimit;
    }

    public DescribeScalingCommonConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingGroupMaxSizeLimit(Integer autoScalingGroupMaxSizeLimit) {
        this.autoScalingGroupMaxSizeLimit = autoScalingGroupMaxSizeLimit;
        return this;
    }
    public Integer getAutoScalingGroupMaxSizeLimit() {
        return this.autoScalingGroupMaxSizeLimit;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingMNSScalingThreadSleepTime(Long autoScalingMNSScalingThreadSleepTime) {
        this.autoScalingMNSScalingThreadSleepTime = autoScalingMNSScalingThreadSleepTime;
        return this;
    }
    public Long getAutoScalingMNSScalingThreadSleepTime() {
        return this.autoScalingMNSScalingThreadSleepTime;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingConfigDecommissionQueryInterval(Long autoScalingConfigDecommissionQueryInterval) {
        this.autoScalingConfigDecommissionQueryInterval = autoScalingConfigDecommissionQueryInterval;
        return this;
    }
    public Long getAutoScalingConfigDecommissionQueryInterval() {
        return this.autoScalingConfigDecommissionQueryInterval;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingCoolDownTime(Integer autoScalingCoolDownTime) {
        this.autoScalingCoolDownTime = autoScalingCoolDownTime;
        return this;
    }
    public Integer getAutoScalingCoolDownTime() {
        return this.autoScalingCoolDownTime;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingRuleMinDelayLimit(Integer autoScalingRuleMinDelayLimit) {
        this.autoScalingRuleMinDelayLimit = autoScalingRuleMinDelayLimit;
        return this;
    }
    public Integer getAutoScalingRuleMinDelayLimit() {
        return this.autoScalingRuleMinDelayLimit;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingRuleAlarmSilentTime(Integer autoScalingRuleAlarmSilentTime) {
        this.autoScalingRuleAlarmSilentTime = autoScalingRuleAlarmSilentTime;
        return this;
    }
    public Integer getAutoScalingRuleAlarmSilentTime() {
        return this.autoScalingRuleAlarmSilentTime;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingConfigSystemDiskSize(Integer autoScalingConfigSystemDiskSize) {
        this.autoScalingConfigSystemDiskSize = autoScalingConfigSystemDiskSize;
        return this;
    }
    public Integer getAutoScalingConfigSystemDiskSize() {
        return this.autoScalingConfigSystemDiskSize;
    }

    public DescribeScalingCommonConfigResponseBody setAutoScalingGroupMinSizeLimit(Integer autoScalingGroupMinSizeLimit) {
        this.autoScalingGroupMinSizeLimit = autoScalingGroupMinSizeLimit;
        return this;
    }
    public Integer getAutoScalingGroupMinSizeLimit() {
        return this.autoScalingGroupMinSizeLimit;
    }

}
