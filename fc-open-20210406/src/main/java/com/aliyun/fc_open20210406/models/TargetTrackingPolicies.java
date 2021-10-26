// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class TargetTrackingPolicies extends TeaModel {
    // endTime
    @NameInMap("endTime")
    public String endTime;

    // maxCapacity
    @NameInMap("maxCapacity")
    public Long maxCapacity;

    // metricTarget
    @NameInMap("metricTarget")
    public Double metricTarget;

    // metricType
    @NameInMap("metricType")
    public String metricType;

    // minCapacity
    @NameInMap("minCapacity")
    public Long minCapacity;

    // name
    @NameInMap("name")
    public String name;

    // startTime
    @NameInMap("startTime")
    public String startTime;

    public static TargetTrackingPolicies build(java.util.Map<String, ?> map) throws Exception {
        TargetTrackingPolicies self = new TargetTrackingPolicies();
        return TeaModel.build(map, self);
    }

    public TargetTrackingPolicies setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TargetTrackingPolicies setMaxCapacity(Long maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }
    public Long getMaxCapacity() {
        return this.maxCapacity;
    }

    public TargetTrackingPolicies setMetricTarget(Double metricTarget) {
        this.metricTarget = metricTarget;
        return this;
    }
    public Double getMetricTarget() {
        return this.metricTarget;
    }

    public TargetTrackingPolicies setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public TargetTrackingPolicies setMinCapacity(Long minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }
    public Long getMinCapacity() {
        return this.minCapacity;
    }

    public TargetTrackingPolicies setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TargetTrackingPolicies setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
