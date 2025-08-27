// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ScalingPolicy extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("maxInstances")
    public Long maxInstances;

    @NameInMap("metricTarget")
    public Float metricTarget;

    @NameInMap("metricType")
    public String metricType;

    @NameInMap("minInstances")
    public Long minInstances;

    @NameInMap("name")
    public String name;

    @NameInMap("startTime")
    public String startTime;

    @NameInMap("timeZone")
    public String timeZone;

    public static ScalingPolicy build(java.util.Map<String, ?> map) throws Exception {
        ScalingPolicy self = new ScalingPolicy();
        return TeaModel.build(map, self);
    }

    public ScalingPolicy setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ScalingPolicy setMaxInstances(Long maxInstances) {
        this.maxInstances = maxInstances;
        return this;
    }
    public Long getMaxInstances() {
        return this.maxInstances;
    }

    public ScalingPolicy setMetricTarget(Float metricTarget) {
        this.metricTarget = metricTarget;
        return this;
    }
    public Float getMetricTarget() {
        return this.metricTarget;
    }

    public ScalingPolicy setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public ScalingPolicy setMinInstances(Long minInstances) {
        this.minInstances = minInstances;
        return this;
    }
    public Long getMinInstances() {
        return this.minInstances;
    }

    public ScalingPolicy setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ScalingPolicy setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ScalingPolicy setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
