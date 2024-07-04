// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScheduledTasksRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RecurrenceType")
    public String recurrenceType;

    @NameInMap("RecurrenceValue")
    public String recurrenceValue;

    /**
     * <p>The region ID of the scaling group to which the scheduled task belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the scaling group to which the scheduled task belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1bo5tca4m56nap****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The scaling rules of the scheduled tasks. Once the scheduled tasks are triggered, the scaling rules are executed.</p>
     */
    @NameInMap("ScheduledActions")
    public java.util.List<String> scheduledActions;

    /**
     * <p>The IDs of the scheduled tasks that you want to query.</p>
     */
    @NameInMap("ScheduledTaskIds")
    public java.util.List<String> scheduledTaskIds;

    /**
     * <p>The names of the scheduled tasks that you want to query.</p>
     */
    @NameInMap("ScheduledTaskNames")
    public java.util.List<String> scheduledTaskNames;

    @NameInMap("TaskEnabled")
    public Boolean taskEnabled;

    @NameInMap("TaskName")
    public String taskName;

    public static DescribeScheduledTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduledTasksRequest self = new DescribeScheduledTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScheduledTasksRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeScheduledTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeScheduledTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScheduledTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScheduledTasksRequest setRecurrenceType(String recurrenceType) {
        this.recurrenceType = recurrenceType;
        return this;
    }
    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    public DescribeScheduledTasksRequest setRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
        return this;
    }
    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

    public DescribeScheduledTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScheduledTasksRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeScheduledTasksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeScheduledTasksRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public DescribeScheduledTasksRequest setScheduledActions(java.util.List<String> scheduledActions) {
        this.scheduledActions = scheduledActions;
        return this;
    }
    public java.util.List<String> getScheduledActions() {
        return this.scheduledActions;
    }

    public DescribeScheduledTasksRequest setScheduledTaskIds(java.util.List<String> scheduledTaskIds) {
        this.scheduledTaskIds = scheduledTaskIds;
        return this;
    }
    public java.util.List<String> getScheduledTaskIds() {
        return this.scheduledTaskIds;
    }

    public DescribeScheduledTasksRequest setScheduledTaskNames(java.util.List<String> scheduledTaskNames) {
        this.scheduledTaskNames = scheduledTaskNames;
        return this;
    }
    public java.util.List<String> getScheduledTaskNames() {
        return this.scheduledTaskNames;
    }

    public DescribeScheduledTasksRequest setTaskEnabled(Boolean taskEnabled) {
        this.taskEnabled = taskEnabled;
        return this;
    }
    public Boolean getTaskEnabled() {
        return this.taskEnabled;
    }

    public DescribeScheduledTasksRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
