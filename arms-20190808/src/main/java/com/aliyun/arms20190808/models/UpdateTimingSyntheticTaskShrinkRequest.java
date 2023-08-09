// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateTimingSyntheticTaskShrinkRequest extends TeaModel {
    @NameInMap("AvailableAssertions")
    public String availableAssertionsShrink;

    @NameInMap("CommonSetting")
    public String commonSettingShrink;

    @NameInMap("CustomPeriod")
    public String customPeriodShrink;

    @NameInMap("Frequency")
    public String frequency;

    @NameInMap("MonitorCategory")
    public Integer monitorCategory;

    @NameInMap("MonitorConf")
    public String monitorConfShrink;

    @NameInMap("Monitors")
    public String monitorsShrink;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public String tagsShrink;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskType")
    public Integer taskType;

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

    public UpdateTimingSyntheticTaskShrinkRequest setMonitorCategory(Integer monitorCategory) {
        this.monitorCategory = monitorCategory;
        return this;
    }
    public Integer getMonitorCategory() {
        return this.monitorCategory;
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

    public UpdateTimingSyntheticTaskShrinkRequest setTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }
    public Integer getTaskType() {
        return this.taskType;
    }

}
