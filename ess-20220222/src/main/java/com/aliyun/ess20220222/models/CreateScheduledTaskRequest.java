// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateScheduledTaskRequest extends TeaModel {
    /**
     * <p>The description of the scheduled task. The description must be 2 to 200 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Test scheduled task.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The expected number of instances in the scaling group when the scaling method of the scheduled task is set to specifying the number of instances in the scaling group.</p>
     * <blockquote>
     * <p>The scaling group must support the expected number of instances. This means that DesiredCapacity must be specified when the scaling group is created.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DesiredCapacity")
    public Integer desiredCapacity;

    /**
     * <p>The period within which the scheduled task retries after a trigger failure. Unit: seconds. Valid values: 0 to 1800.</p>
     * <p>Default value: 600.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("LaunchExpirationTime")
    public Integer launchExpirationTime;

    /**
     * <p>The time at which the scheduled task is triggered. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC. You cannot specify a time that is later than 90 days from the creation date. </p>
     * <ul>
     * <li><p>If RecurrenceType is specified, the time specified by this parameter is the default time for recurring execution.</p>
     * </li>
     * <li><p>If RecurrenceType is not specified, the task is executed only once at the specified date and time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2014-08-17T16:52Z</p>
     */
    @NameInMap("LaunchTime")
    public String launchTime;

    /**
     * <p>The maximum number of instances in the scaling group when the scaling method of the scheduled task is set to specifying the number of instances in the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxValue")
    public Integer maxValue;

    /**
     * <p>The minimum number of instances in the scaling group when the scaling method of the scheduled task is set to specifying the number of instances in the scaling group.</p>
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
     * <p>The end time of the scheduled task that is executed repeatedly. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC. You cannot specify a time that is later than 365 days from the creation date.</p>
     * 
     * <strong>example:</strong>
     * <p>2014-08-17T16:55Z</p>
     */
    @NameInMap("RecurrenceEndTime")
    public String recurrenceEndTime;

    /**
     * <p>The recurrence type of the scheduled task. Valid values: </p>
     * <ul>
     * <li>Daily: The scheduled task is executed once every specified number of days. </li>
     * <li>Weekly: The scheduled task is executed on specified days of each week. </li>
     * <li>Monthly: The scheduled task is executed on specified days of each month. </li>
     * <li>Cron: The scheduled task is executed based on the specified cron expression.</li>
     * </ul>
     * <p>You must specify both RecurrenceType and RecurrenceValue.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("RecurrenceType")
    public String recurrenceType;

    /**
     * <p>The recurrence value of the scheduled task. </p>
     * <ul>
     * <li>If RecurrenceType is set to Daily, you can specify only one value. Valid values: 1 to 31. </li>
     * <li>If RecurrenceType is set to Weekly, you can specify multiple values separated by commas (,). For example, the values for Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday are 0,1,2,3,4,5,6.  </li>
     * <li>If RecurrenceType is set to Monthly, the format is A-B. Valid values of A and B: 1 to 31. B must be greater than or equal to A. </li>
     * <li>If RecurrenceType is set to Cron, the value represents UTC time and supports a five-field expression for minutes, hours, days, months, and days of the week. The expression supports the following wildcards: commas (,), question marks (?), hyphens (-), asterisks (*), number signs (#), forward slashes (/), L, and W.</li>
     * </ul>
     * <p>You must specify both RecurrenceType and RecurrenceValue.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecurrenceValue")
    public String recurrenceValue;

    /**
     * <p>The ID of the region to which the scheduled task belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group in which you want to modify the number of instances or adjust the warm pool capacity when the scheduled task is triggered.</p>
     * <p>After you specify ScalingGroupId, the scaling method of the scheduled task is set to specifying the number of instances in the scaling group or adjusting the warm pool capacity.</p>
     * <ul>
     * <li>To specify the number of instances in the scaling group, you must specify a value for at least one of the following parameters: MinValue, MaxValue, and DesiredCapacity.</li>
     * <li>To adjust the warm pool capacity, you must configure WarmPoolCapacityOptions.</li>
     * </ul>
     * <blockquote>
     * <p>You cannot specify both ScheduledAction and ScalingGroupId at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>asg-bp18p2yfxow2dloq****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The unique identifier of the scaling rule to be executed when the scheduled task is triggered.</p>
     * <p>After you specify ScheduledAction, the scaling method of the scheduled task is set to selecting an existing scaling rule. You cannot specify both ScheduledAction and ScalingGroupId at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>ari:acs:ess:cn-hangzhou:140692647****:scalingrule/asr-bp12tcnol686y1ik****</p>
     */
    @NameInMap("ScheduledAction")
    public String scheduledAction;

    /**
     * <p>The name of the scheduled task. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.). It must start with a letter, digit, or Chinese character. The name must be unique within the same region and Alibaba Cloud account. </p>
     * <p>Default value: the value of ScheduledTaskId.</p>
     * 
     * <strong>example:</strong>
     * <p>scheduled****</p>
     */
    @NameInMap("ScheduledTaskName")
    public String scheduledTaskName;

    /**
     * <p>Specifies whether to enable the scheduled task. Valid values: </p>
     * <ul>
     * <li>true: enables the task.</li>
     * <li>false: disables the task.</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TaskEnabled")
    public Boolean taskEnabled;

    /**
     * <p>The warm pool capacity configurations of the scaling group. This parameter takes effect only when a warm pool is configured for the scaling group.</p>
     * <blockquote>
     * <p>When you configure this parameter, you must specify ScalingGroupId.</p>
     * </blockquote>
     */
    @NameInMap("WarmPoolCapacityOptions")
    public CreateScheduledTaskRequestWarmPoolCapacityOptions warmPoolCapacityOptions;

    public static CreateScheduledTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledTaskRequest self = new CreateScheduledTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduledTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateScheduledTaskRequest setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }
    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    public CreateScheduledTaskRequest setLaunchExpirationTime(Integer launchExpirationTime) {
        this.launchExpirationTime = launchExpirationTime;
        return this;
    }
    public Integer getLaunchExpirationTime() {
        return this.launchExpirationTime;
    }

    public CreateScheduledTaskRequest setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
        return this;
    }
    public String getLaunchTime() {
        return this.launchTime;
    }

    public CreateScheduledTaskRequest setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
        return this;
    }
    public Integer getMaxValue() {
        return this.maxValue;
    }

    public CreateScheduledTaskRequest setMinValue(Integer minValue) {
        this.minValue = minValue;
        return this;
    }
    public Integer getMinValue() {
        return this.minValue;
    }

    public CreateScheduledTaskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateScheduledTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateScheduledTaskRequest setRecurrenceEndTime(String recurrenceEndTime) {
        this.recurrenceEndTime = recurrenceEndTime;
        return this;
    }
    public String getRecurrenceEndTime() {
        return this.recurrenceEndTime;
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

    public CreateScheduledTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateScheduledTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateScheduledTaskRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public CreateScheduledTaskRequest setScheduledAction(String scheduledAction) {
        this.scheduledAction = scheduledAction;
        return this;
    }
    public String getScheduledAction() {
        return this.scheduledAction;
    }

    public CreateScheduledTaskRequest setScheduledTaskName(String scheduledTaskName) {
        this.scheduledTaskName = scheduledTaskName;
        return this;
    }
    public String getScheduledTaskName() {
        return this.scheduledTaskName;
    }

    public CreateScheduledTaskRequest setTaskEnabled(Boolean taskEnabled) {
        this.taskEnabled = taskEnabled;
        return this;
    }
    public Boolean getTaskEnabled() {
        return this.taskEnabled;
    }

    public CreateScheduledTaskRequest setWarmPoolCapacityOptions(CreateScheduledTaskRequestWarmPoolCapacityOptions warmPoolCapacityOptions) {
        this.warmPoolCapacityOptions = warmPoolCapacityOptions;
        return this;
    }
    public CreateScheduledTaskRequestWarmPoolCapacityOptions getWarmPoolCapacityOptions() {
        return this.warmPoolCapacityOptions;
    }

    public static class CreateScheduledTaskRequestWarmPoolCapacityOptions extends TeaModel {
        /**
         * <p>The expected number of prepared instances to be covered. The system maintains the sum of the current number of instances in the scaling group and the number of instances in the warm pool at this value. Default value: the maximum number of instances in the scaling group, which is specified by MaxSize.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DesiredGroupPreparedCapacity")
        public Integer desiredGroupPreparedCapacity;

        /**
         * <p>The minimum number of instances in the warm pool. The system always retains at least this number of prepared instances in the warm pool to ensure that instances can be quickly added from the warm pool during scale-out. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinCapacity")
        public Integer minCapacity;

        public static CreateScheduledTaskRequestWarmPoolCapacityOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledTaskRequestWarmPoolCapacityOptions self = new CreateScheduledTaskRequestWarmPoolCapacityOptions();
            return TeaModel.build(map, self);
        }

        public CreateScheduledTaskRequestWarmPoolCapacityOptions setDesiredGroupPreparedCapacity(Integer desiredGroupPreparedCapacity) {
            this.desiredGroupPreparedCapacity = desiredGroupPreparedCapacity;
            return this;
        }
        public Integer getDesiredGroupPreparedCapacity() {
            return this.desiredGroupPreparedCapacity;
        }

        public CreateScheduledTaskRequestWarmPoolCapacityOptions setMinCapacity(Integer minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public Integer getMinCapacity() {
            return this.minCapacity;
        }

    }

}
