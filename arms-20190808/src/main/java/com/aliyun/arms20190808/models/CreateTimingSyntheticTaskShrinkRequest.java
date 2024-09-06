// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateTimingSyntheticTaskShrinkRequest extends TeaModel {
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
     * <p>The general settings.</p>
     */
    @NameInMap("CustomPeriod")
    public String customPeriodShrink;

    /**
     * <p>The detection frequency. Valid values: 1m, 5m, 10m, 15m, 20m, 30m, 1h, 2h, 3h, 4h, 6h, 8h, 12h, and 24h.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5m</p>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The detection point type. Valid values:</p>
     * <ul>
     * <li>1: PC</li>
     * <li>2: mobile device</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MonitorCategory")
    public Integer monitorCategory;

    /**
     * <p>The monitoring configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MonitorConf")
    public String monitorConfShrink;

    /**
     * <p>The list of detection points.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Monitors")
    public String monitorsShrink;

    /**
     * <p>The name of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The type of the task. Valid values:</p>
     * <p>1: ICMP. 2: TCP. 3: DNS. 4: HTTP. 5: website speed measurement. 6: file download.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
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
