// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateTimingSyntheticTaskShrinkRequest extends TeaModel {
    /**
     * <p>The list of assertions.</p>
     */
    @NameInMap("AvailableAssertions")
    public String availableAssertionsShrink;

    /**
     * <p>The general settings.</p>
     */
    @NameInMap("CommonSetting")
    public String commonSettingShrink;

    /**
     * <p>The custom cycle.</p>
     */
    @NameInMap("CustomPeriod")
    public String customPeriodShrink;

    /**
     * <p>The detection frequency. Valid values: 1m, 5m, 10m, 15m, 20m, 30m, 1h, 2h, 3h, 4h, 6h, 8h, 12h, and 24h.</p>
     * 
     * <strong>example:</strong>
     * <p>5m</p>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The monitoring configurations.</p>
     */
    @NameInMap("MonitorConf")
    public String monitorConfShrink;

    /**
     * <p>The list of monitoring points.</p>
     */
    @NameInMap("Monitors")
    public String monitorsShrink;

    /**
     * <p>The name of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>AlibabaCloud DNS Task</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The ID of the synthetic monitoring task.</p>
     * 
     * <strong>example:</strong>
     * <p>5308a2691f59422c8c3b7aeccxxxxxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpdateTimingSyntheticTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTimingSyntheticTaskShrinkRequest self = new UpdateTimingSyntheticTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTimingSyntheticTaskShrinkRequest setAvailableAssertionsShrink(String availableAssertionsShrink) {
        this.availableAssertionsShrink = availableAssertionsShrink;
        return this;
    }
    public String getAvailableAssertionsShrink() {
        return this.availableAssertionsShrink;
    }

    public UpdateTimingSyntheticTaskShrinkRequest setCommonSettingShrink(String commonSettingShrink) {
        this.commonSettingShrink = commonSettingShrink;
        return this;
    }
    public String getCommonSettingShrink() {
        return this.commonSettingShrink;
    }

    public UpdateTimingSyntheticTaskShrinkRequest setCustomPeriodShrink(String customPeriodShrink) {
        this.customPeriodShrink = customPeriodShrink;
        return this;
    }
    public String getCustomPeriodShrink() {
        return this.customPeriodShrink;
    }

    public UpdateTimingSyntheticTaskShrinkRequest setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

    public UpdateTimingSyntheticTaskShrinkRequest setMonitorConfShrink(String monitorConfShrink) {
        this.monitorConfShrink = monitorConfShrink;
        return this;
    }
    public String getMonitorConfShrink() {
        return this.monitorConfShrink;
    }

    public UpdateTimingSyntheticTaskShrinkRequest setMonitorsShrink(String monitorsShrink) {
        this.monitorsShrink = monitorsShrink;
        return this;
    }
    public String getMonitorsShrink() {
        return this.monitorsShrink;
    }

    public UpdateTimingSyntheticTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTimingSyntheticTaskShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateTimingSyntheticTaskShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateTimingSyntheticTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public UpdateTimingSyntheticTaskShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
