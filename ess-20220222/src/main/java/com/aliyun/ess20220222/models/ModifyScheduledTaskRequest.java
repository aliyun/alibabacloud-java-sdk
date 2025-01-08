// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyScheduledTaskRequest extends TeaModel {
    /**
     * <p>The description of the scheduled task. The description must be 2 to 200 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Test scheduled task.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The expected number of instances in the scaling group if you specify the ScalingGroupId parameter.</p>
     * <blockquote>
     * <p>You must specify the <code>DesiredCapacity</code> parameter when you create a scaling group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DesiredCapacity")
    public Integer desiredCapacity;

    /**
     * <p>The time period during which the failed scheduled task is retried. Unit: seconds. Valid values: 0 to 1800.</p>
     * <p>Default value: 600.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("LaunchExpirationTime")
    public Integer launchExpirationTime;

    /**
     * <p>The point in time at which the scheduled task is triggered. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC. You cannot enter a time point later than 90 days from the point in time at which the scheduled task is modified.</p>
     * <ul>
     * <li>If you specify the <code>RecurrenceType</code> parameter, the task is repeatedly executed at the time point that is specified by the LaunchTime parameter.</li>
     * <li>If you do not specify the <code>RecurrenceType</code> parameter, the task is executed only once at the point in time that is specified by the LaunchTime parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2014-08-18T10:52Z</p>
     */
    @NameInMap("LaunchTime")
    public String launchTime;

    /**
     * <p>The maximum number of instances in the scaling group if you specify the ScalingGroupId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxValue")
    public Integer maxValue;

    /**
     * <p>The minimum number of instances in the scaling group if you specify the ScalingGroupId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MinValue")
    public Integer minValue;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The end time of the scheduled task. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC. You cannot enter a point in time that is later than 365 days from the point in time at which the scheduled task is modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2014-08-20T16:55Z</p>
     */
    @NameInMap("RecurrenceEndTime")
    public String recurrenceEndTime;

    /**
     * <p>The interval at which the scheduled task is repeated. Valid values:</p>
     * <ul>
     * <li>Daily: The scheduled task is executed once every specified number of days.</li>
     * <li>Weekly: The scheduled task is executed on each specified day of the week.</li>
     * <li>Monthly: The scheduled task is executed on each specified day of the month.</li>
     * <li>Cron: The scheduled task is executed based on the specified cron expression.</li>
     * </ul>
     * <p>After you modify the scheduled task, the values that you specify for the <code>RecurrenceType</code> and <code>RecurrenceValue</code> parameters must be valid at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("RecurrenceType")
    public String recurrenceType;

    /**
     * <p>The number of recurrences of the scheduled task.</p>
     * <ul>
     * <li>If you set the <code>RecurrenceType</code> parameter to <code>Daily</code>, you can specify only one value for this parameter. Valid values: 1 to 31.</li>
     * <li>If you set the <code>RecurrenceType</code> parameter to <code>Weekly</code>, you can specify multiple values for this parameter. Separate the values with commas (,). The values that correspond to Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday are 0, 1, 2, 3, 4, 5, and 6.``</li>
     * <li>If you set the <code>RecurrenceType</code> parameter to <code>Monthly</code>, you can specify two values in the <code>A-B</code> format for this parameter. Valid values of A and B: 1 to 31. B must be greater than or equal to A.</li>
     * <li>If you set the <code>RecurrenceType</code> parameter to <code>Cron</code>, you can specify a cron expression. A cron expression is written in UTC time and consists of the following fields: minute, hour, day, month, and week. The expression can contain the letters L and W and the following wildcard characters: commas (,), question marks (?), hyphens (-), asterisks (\*), number signs (#), and forward slashes (/).</li>
     * </ul>
     * <p>After you modify the scheduled task, the values that you specify for the <code>RecurrenceType</code> and <code>RecurrenceValue</code> parameters must be valid at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RecurrenceValue")
    public String recurrenceValue;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the scaling group whose number of instances must be modified when the scheduled task is triggered. If you specify the <code>ScalingGroupId</code> parameter for a scheduled task, you must specify the minimum, maximum, or expected numbers of instances for a scaling group in the scheduled task. That is, you must specify at least one of the <code>MinValue</code>, <code>MaxValue</code>, and <code>DesiredCapacity</code> parameters.</p>
     * <blockquote>
     * <p>You cannot specify the <code>ScheduledAction</code> and <code>ScalingGroupId</code> parameters at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>asg-bp18p2yfxow2dloq****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The scaling rule that you want to execute when the scheduled task is triggered. Enter the ID of the scaling rule. To obtain the ID of a scaling rule, go to the scaling rule details page. If you specify <code>ScheduledAction</code>, you must select an existing scaling rule for the scheduled task.</p>
     * <blockquote>
     * <p> You can specify only one of <code>ScheduledAction</code> and <code>ScalingGroupId</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ari:acs:ess:cn-hangzhou:14069264****:scalingrule/asr-bp12tcnol686y1ik****</p>
     */
    @NameInMap("ScheduledAction")
    public String scheduledAction;

    /**
     * <p>The ID of the scheduled task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>edRtShc57WGXdt8TlPbr****</p>
     */
    @NameInMap("ScheduledTaskId")
    public String scheduledTaskId;

    /**
     * <p>The name of the scheduled task. The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (_), hyphens (-), and periods (.). It must start with a letter or a digit. The name of the scheduled task must be unique in the region and within the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>scheduled****</p>
     */
    @NameInMap("ScheduledTaskName")
    public String scheduledTaskName;

    /**
     * <p>Specifies whether to enable the scheduled task. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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

    public ModifyScheduledTaskRequest setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }
    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
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

    public ModifyScheduledTaskRequest setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
        return this;
    }
    public Integer getMaxValue() {
        return this.maxValue;
    }

    public ModifyScheduledTaskRequest setMinValue(Integer minValue) {
        this.minValue = minValue;
        return this;
    }
    public Integer getMinValue() {
        return this.minValue;
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

    public ModifyScheduledTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public ModifyScheduledTaskRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
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
