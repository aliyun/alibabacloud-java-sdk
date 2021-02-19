// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class CreateScheduledTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScheduledTaskName")
    public String scheduledTaskName;

    @NameInMap("Description")
    public String description;

    @NameInMap("ScheduledAction")
    public String scheduledAction;

    @NameInMap("RecurrenceEndTime")
    public String recurrenceEndTime;

    @NameInMap("LaunchTime")
    public String launchTime;

    @NameInMap("RecurrenceType")
    public String recurrenceType;

    @NameInMap("RecurrenceValue")
    public String recurrenceValue;

    @NameInMap("TaskEnabled")
    public Boolean taskEnabled;

    @NameInMap("LaunchExpirationTime")
    public Integer launchExpirationTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("MinValue")
    public Integer minValue;

    @NameInMap("MaxValue")
    public Integer maxValue;

    @NameInMap("DesiredCapacity")
    public Integer desiredCapacity;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static CreateScheduledTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledTaskRequest self = new CreateScheduledTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduledTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateScheduledTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateScheduledTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateScheduledTaskRequest setScheduledTaskName(String scheduledTaskName) {
        this.scheduledTaskName = scheduledTaskName;
        return this;
    }
    public String getScheduledTaskName() {
        return this.scheduledTaskName;
    }

    public CreateScheduledTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateScheduledTaskRequest setScheduledAction(String scheduledAction) {
        this.scheduledAction = scheduledAction;
        return this;
    }
    public String getScheduledAction() {
        return this.scheduledAction;
    }

    public CreateScheduledTaskRequest setRecurrenceEndTime(String recurrenceEndTime) {
        this.recurrenceEndTime = recurrenceEndTime;
        return this;
    }
    public String getRecurrenceEndTime() {
        return this.recurrenceEndTime;
    }

    public CreateScheduledTaskRequest setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
        return this;
    }
    public String getLaunchTime() {
        return this.launchTime;
    }

    public CreateScheduledTaskRequest setRecurrenceType(String recurrenceType) {
        this.recurrenceType = recurrenceType;
        return this;
    }
    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    public CreateScheduledTaskRequest setRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
        return this;
    }
    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

    public CreateScheduledTaskRequest setTaskEnabled(Boolean taskEnabled) {
        this.taskEnabled = taskEnabled;
        return this;
    }
    public Boolean getTaskEnabled() {
        return this.taskEnabled;
    }

    public CreateScheduledTaskRequest setLaunchExpirationTime(Integer launchExpirationTime) {
        this.launchExpirationTime = launchExpirationTime;
        return this;
    }
    public Integer getLaunchExpirationTime() {
        return this.launchExpirationTime;
    }

    public CreateScheduledTaskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateScheduledTaskRequest setMinValue(Integer minValue) {
        this.minValue = minValue;
        return this;
    }
    public Integer getMinValue() {
        return this.minValue;
    }

    public CreateScheduledTaskRequest setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
        return this;
    }
    public Integer getMaxValue() {
        return this.maxValue;
    }

    public CreateScheduledTaskRequest setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }
    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    public CreateScheduledTaskRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
