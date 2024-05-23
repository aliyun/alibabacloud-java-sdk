// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class ModifyScheduledTaskRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("LaunchExpirationTime")
    public Integer launchExpirationTime;

    @NameInMap("LaunchTime")
    public String launchTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RecurrenceEndTime")
    public String recurrenceEndTime;

    @NameInMap("RecurrenceType")
    public String recurrenceType;

    @NameInMap("RecurrenceValue")
    public String recurrenceValue;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ScheduledAction")
    public String scheduledAction;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScheduledTaskId")
    public String scheduledTaskId;

    @NameInMap("ScheduledTaskName")
    public String scheduledTaskName;

    @NameInMap("TaskEnabled")
    public Boolean taskEnabled;

    public static ModifyScheduledTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduledTaskRequest self = new ModifyScheduledTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScheduledTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyScheduledTaskRequest setLaunchExpirationTime(Integer launchExpirationTime) {
        this.launchExpirationTime = launchExpirationTime;
        return this;
    }
    public Integer getLaunchExpirationTime() {
        return this.launchExpirationTime;
    }

    public ModifyScheduledTaskRequest setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
        return this;
    }
    public String getLaunchTime() {
        return this.launchTime;
    }

    public ModifyScheduledTaskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyScheduledTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyScheduledTaskRequest setRecurrenceEndTime(String recurrenceEndTime) {
        this.recurrenceEndTime = recurrenceEndTime;
        return this;
    }
    public String getRecurrenceEndTime() {
        return this.recurrenceEndTime;
    }

    public ModifyScheduledTaskRequest setRecurrenceType(String recurrenceType) {
        this.recurrenceType = recurrenceType;
        return this;
    }
    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    public ModifyScheduledTaskRequest setRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
        return this;
    }
    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

    public ModifyScheduledTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyScheduledTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyScheduledTaskRequest setScheduledAction(String scheduledAction) {
        this.scheduledAction = scheduledAction;
        return this;
    }
    public String getScheduledAction() {
        return this.scheduledAction;
    }

    public ModifyScheduledTaskRequest setScheduledTaskId(String scheduledTaskId) {
        this.scheduledTaskId = scheduledTaskId;
        return this;
    }
    public String getScheduledTaskId() {
        return this.scheduledTaskId;
    }

    public ModifyScheduledTaskRequest setScheduledTaskName(String scheduledTaskName) {
        this.scheduledTaskName = scheduledTaskName;
        return this;
    }
    public String getScheduledTaskName() {
        return this.scheduledTaskName;
    }

    public ModifyScheduledTaskRequest setTaskEnabled(Boolean taskEnabled) {
        this.taskEnabled = taskEnabled;
        return this;
    }
    public Boolean getTaskEnabled() {
        return this.taskEnabled;
    }

}
