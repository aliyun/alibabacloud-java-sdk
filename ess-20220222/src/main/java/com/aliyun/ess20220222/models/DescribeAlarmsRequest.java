// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeAlarmsRequest extends TeaModel {
    /**
     * <p>The ID of the event-triggered task.</p>
     */
    @NameInMap("AlarmTaskId")
    public String alarmTaskId;

    /**
     * <p>Specifies whether to enable the event-triggered task. Valid values:</p>
     * <br>
     * <p>*   true: enables the event-triggered task.</p>
     * <p>*   false: disables the event-triggered task.</p>
     */
    @NameInMap("IsEnable")
    public Boolean isEnable;

    /**
     * <p>The metric name.</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The metric type. Valid values:</p>
     * <br>
     * <p>*   system: system metrics of CloudMonitor</p>
     * <p>*   custom: custom metrics that are reported to CloudMonitor.</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the event-triggered task.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group with which the event-triggered task is associated.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The status of the event-triggered task. Valid values:</p>
     * <br>
     * <p>*   ALARM: The alert condition is met and an alert is triggered.</p>
     * <p>*   OK: The alert condition is not met.</p>
     * <p>*   INSUFFICIENT_DATA: Auto Scaling cannot determine whether the alert condition is met due to insufficient data.</p>
     */
    @NameInMap("State")
    public String state;

    public static DescribeAlarmsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmsRequest self = new DescribeAlarmsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmsRequest setAlarmTaskId(String alarmTaskId) {
        this.alarmTaskId = alarmTaskId;
        return this;
    }
    public String getAlarmTaskId() {
        return this.alarmTaskId;
    }

    public DescribeAlarmsRequest setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
        return this;
    }
    public Boolean getIsEnable() {
        return this.isEnable;
    }

    public DescribeAlarmsRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeAlarmsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeAlarmsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAlarmsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAlarmsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlarmsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAlarmsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAlarmsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public DescribeAlarmsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
