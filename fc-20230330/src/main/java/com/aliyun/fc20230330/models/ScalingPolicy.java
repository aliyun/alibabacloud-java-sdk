// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ScalingPolicy extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2024-03-10T10:10:10Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxInstances")
    public Long maxInstances;

    /**
     * <strong>example:</strong>
     * <p>0.6</p>
     */
    @NameInMap("metricTarget")
    public Float metricTarget;

    /**
     * <strong>example:</strong>
     * <p>CPUUtilization</p>
     */
    @NameInMap("metricType")
    public String metricType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("minInstances")
    public Long minInstances;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>2023-03-10T10:10:10Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
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
