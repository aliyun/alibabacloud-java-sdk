// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateTimingSyntheticTaskShrinkRequest extends TeaModel {
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

    @NameInMap("TaskType")
    public Integer taskType;

    public static CreateTimingSyntheticTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTimingSyntheticTaskShrinkRequest self = new CreateTimingSyntheticTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTimingSyntheticTaskShrinkRequest setAvailableAssertionsShrink(String availableAssertionsShrink) {
        this.availableAssertionsShrink = availableAssertionsShrink;
        return this;
    }
    public String getAvailableAssertionsShrink() {
        return this.availableAssertionsShrink;
    }

    public CreateTimingSyntheticTaskShrinkRequest setCommonSettingShrink(String commonSettingShrink) {
        this.commonSettingShrink = commonSettingShrink;
        return this;
    }
    public String getCommonSettingShrink() {
        return this.commonSettingShrink;
    }

    public CreateTimingSyntheticTaskShrinkRequest setCustomPeriodShrink(String customPeriodShrink) {
        this.customPeriodShrink = customPeriodShrink;
        return this;
    }
    public String getCustomPeriodShrink() {
        return this.customPeriodShrink;
    }

    public CreateTimingSyntheticTaskShrinkRequest setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

    public CreateTimingSyntheticTaskShrinkRequest setMonitorCategory(Integer monitorCategory) {
        this.monitorCategory = monitorCategory;
        return this;
    }
    public Integer getMonitorCategory() {
        return this.monitorCategory;
    }

    public CreateTimingSyntheticTaskShrinkRequest setMonitorConfShrink(String monitorConfShrink) {
        this.monitorConfShrink = monitorConfShrink;
        return this;
    }
    public String getMonitorConfShrink() {
        return this.monitorConfShrink;
    }

    public CreateTimingSyntheticTaskShrinkRequest setMonitorsShrink(String monitorsShrink) {
        this.monitorsShrink = monitorsShrink;
        return this;
    }
    public String getMonitorsShrink() {
        return this.monitorsShrink;
    }

    public CreateTimingSyntheticTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTimingSyntheticTaskShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTimingSyntheticTaskShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateTimingSyntheticTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateTimingSyntheticTaskShrinkRequest setTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }
    public Integer getTaskType() {
        return this.taskType;
    }

}
