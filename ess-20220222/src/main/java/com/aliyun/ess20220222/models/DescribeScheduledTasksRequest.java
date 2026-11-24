// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScheduledTasksRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the scheduled task list. Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paged query. Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The recurrence type of the scheduled task. Valid values: </p>
     * <ul>
     * <li>Daily: The scheduled task is executed once every specified number of days. </li>
     * <li>Weekly: The scheduled task is executed on specified days of each week. </li>
     * <li>Monthly: The scheduled task is executed on specified days of each month. </li>
     * <li>Cron: The scheduled task is executed based on a specified cron expression.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Weekly</p>
     */
    @NameInMap("RecurrenceType")
    public String recurrenceType;

    /**
     * <p>The recurrence value of the scheduled task.</p>
     * <p>This parameter is supported only when RecurrenceType is set to Weekly. You can specify multiple values separated by commas (,). For example, the values for Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday are 0, 1, 2, 3, 4, 5, and 6.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
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
     * <p>The ID of the scaling group that executes the scheduled task.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1bo5tca4m56nap****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The scaling rules that are used when the scheduled tasks are triggered. This parameter is valid only when a scaling rule is specified for the scheduled task.</p>
     */
    @NameInMap("ScheduledActions")
    public java.util.List<String> scheduledActions;

    /**
     * <p>The IDs of the scheduled tasks to be queried.</p>
     */
    @NameInMap("ScheduledTaskIds")
    public java.util.List<String> scheduledTaskIds;

    /**
     * <p>The names of the scheduled tasks to be queried.</p>
     */
    @NameInMap("ScheduledTaskNames")
    public java.util.List<String> scheduledTaskNames;

    /**
     * <p>Specifies whether the scheduled task is started. Valid values:</p>
     * <ul>
     * <li>true: The task is started.</li>
     * <li>false: The task is stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TaskEnabled")
    public Boolean taskEnabled;

    /**
     * <p>The name of the task. Fuzzy match by keyword is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>scheduled****</p>
     */
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
