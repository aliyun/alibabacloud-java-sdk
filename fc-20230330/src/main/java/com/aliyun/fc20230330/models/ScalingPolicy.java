// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ScalingPolicy extends TeaModel {
    /**
     * <p>The time when the policy expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-10T10:10:10Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The maximum number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxInstances")
    public Long maxInstances;

    /**
     * <p>The target value for the metric.</p>
     * 
     * <strong>example:</strong>
     * <p>0.6</p>
     */
    @NameInMap("metricTarget")
    public Float metricTarget;

    /**
     * <p>The type of metric to track. ProvisionedConcurrencyUtilization is the concurrency utilization of provisioned instances. CPUUtilization is the CPU utilization. GPUMemUtilization is the GPU memory utilization.</p>
     * 
     * <strong>example:</strong>
     * <p>CPUUtilization</p>
     */
    @NameInMap("metricType")
    public String metricType;

    /**
     * <p>The minimum number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("minInstances")
    public Long minInstances;

    /**
     * <p>The name of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The time when the policy takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-10T10:10:10Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The time zone. If this parameter is empty, the times for startTime, endTime, and scheduleExpression must be in Coordinated Universal Time (UTC).</p>
     * 
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
