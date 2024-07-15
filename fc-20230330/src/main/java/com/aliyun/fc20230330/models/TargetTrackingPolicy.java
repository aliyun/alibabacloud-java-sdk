// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class TargetTrackingPolicy extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2024-03-10T10:10:10Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxCapacity")
    public Long maxCapacity;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.6</p>
     */
    @NameInMap("metricTarget")
    public Float metricTarget;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CPUUtilization</p>
     */
    @NameInMap("metricType")
    public String metricType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("minCapacity")
    public Long minCapacity;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>2023-03-10T10:10:10Z</p>
     */
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
