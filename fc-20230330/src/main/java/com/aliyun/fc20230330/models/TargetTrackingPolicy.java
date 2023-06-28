// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class TargetTrackingPolicy extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("maxCapacity")
    public Long maxCapacity;

    @NameInMap("metricTarget")
    public Float metricTarget;

    @NameInMap("metricType")
    public String metricType;

    @NameInMap("minCapacity")
    public Long minCapacity;

    @NameInMap("name")
    public String name;

    @NameInMap("startTime")
    public String startTime;

    public static TargetTrackingPolicy build(java.util.Map<String, ?> map) throws Exception {
        TargetTrackingPolicy self = new TargetTrackingPolicy();
        return TeaModel.build(map, self);
    }

    public TargetTrackingPolicy setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TargetTrackingPolicy setMaxCapacity(Long maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }
    public Long getMaxCapacity() {
        return this.maxCapacity;
    }

    public TargetTrackingPolicy setMetricTarget(Float metricTarget) {
        this.metricTarget = metricTarget;
        return this;
    }
    public Float getMetricTarget() {
        return this.metricTarget;
    }

    public TargetTrackingPolicy setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public TargetTrackingPolicy setMinCapacity(Long minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }
    public Long getMinCapacity() {
        return this.minCapacity;
    }

    public TargetTrackingPolicy setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TargetTrackingPolicy setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
