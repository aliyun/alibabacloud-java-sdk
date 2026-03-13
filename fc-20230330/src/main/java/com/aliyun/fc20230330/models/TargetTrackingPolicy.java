// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class TargetTrackingPolicy extends TeaModel {
    /**
     * <p>The end time of the policy, in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-10T10:10:10Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The maximum number of provisioned instances for scale-out.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxCapacity")
    public Long maxCapacity;

    /**
     * <p>The threshold value for metric-based auto scaling.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.6</p>
     */
    @NameInMap("metricTarget")
    public Float metricTarget;

    /**
     * <p>The metric type for tracing. ProvisionedConcurrencyUtilization: the concurrency utilization of provisioned instances. CPUUtilization: the CPU utilization. GPUMemUtilization: the GPU utilization.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CPUUtilization</p>
     */
    @NameInMap("metricType")
    public String metricType;

    /**
     * <p>The minimum number of provisioned instances for scale-in.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("minCapacity")
    public Long minCapacity;

    /**
     * <p>The policy name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The time when the policy starts to take effect, in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-10T10:10:10Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The time zone. If the time zone parameter is empty, the time of startTime and endTime must be in UTC format.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

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

    public TargetTrackingPolicy setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
