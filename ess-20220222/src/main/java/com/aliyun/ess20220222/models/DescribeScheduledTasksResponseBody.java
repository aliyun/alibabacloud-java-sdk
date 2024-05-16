// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScheduledTasksResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the scheduled tasks.</p>
     */
    @NameInMap("ScheduledTasks")
    public java.util.List<DescribeScheduledTasksResponseBodyScheduledTasks> scheduledTasks;

    /**
     * <p>The total number of scheduled tasks.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeScheduledTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduledTasksResponseBody self = new DescribeScheduledTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScheduledTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScheduledTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScheduledTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScheduledTasksResponseBody setScheduledTasks(java.util.List<DescribeScheduledTasksResponseBodyScheduledTasks> scheduledTasks) {
        this.scheduledTasks = scheduledTasks;
        return this;
    }
    public java.util.List<DescribeScheduledTasksResponseBodyScheduledTasks> getScheduledTasks() {
        return this.scheduledTasks;
    }

    public DescribeScheduledTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeScheduledTasksResponseBodyScheduledTasks extends TeaModel {
        /**
         * <p>The description of the scheduled task.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The expected number of instances in the scaling group if you specify the ScalingGroupId parameter.</p>
         */
        @NameInMap("DesiredCapacity")
        public Integer desiredCapacity;

        /**
         * <p>The time period during which the failed scheduled task is retried. Unit: seconds. Valid values: 0 to 21600.</p>
         */
        @NameInMap("LaunchExpirationTime")
        public Integer launchExpirationTime;

        /**
         * <p>The point in time at which the scheduled task is triggered.</p>
         */
        @NameInMap("LaunchTime")
        public String launchTime;

        /**
         * <p>The maximum number of instances in the scaling group if you specify the ScalingGroupId parameter.</p>
         */
        @NameInMap("MaxValue")
        public Integer maxValue;

        /**
         * <p>The minimum number of instances in the scaling group if you specify the ScalingGroupId parameter.</p>
         */
        @NameInMap("MinValue")
        public Integer minValue;

        /**
         * <p>The end time of the recurrence of the scheduled task.</p>
         */
        @NameInMap("RecurrenceEndTime")
        public String recurrenceEndTime;

        /**
         * <p>The interval at which the scheduled task is repeated.</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>The number of recurrences of the scheduled task.</p>
         */
        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        /**
         * <p>The ID of the scaling group to which the scheduled task belongs.</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The scaling rule that is executed when the scheduled task is triggered. This parameter is returned only after a scaling rule is specified for the scheduled task.</p>
         */
        @NameInMap("ScheduledAction")
        public String scheduledAction;

        /**
         * <p>The ID of the scheduled task.</p>
         */
        @NameInMap("ScheduledTaskId")
        public String scheduledTaskId;

        /**
         * <p>The name of the scheduled task.</p>
         */
        @NameInMap("ScheduledTaskName")
        public String scheduledTaskName;

        /**
         * <p>Indicates whether the scheduled task is enabled.</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: true.</p>
         */
        @NameInMap("TaskEnabled")
        public Boolean taskEnabled;

        public static DescribeScheduledTasksResponseBodyScheduledTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeScheduledTasksResponseBodyScheduledTasks self = new DescribeScheduledTasksResponseBodyScheduledTasks();
            return TeaModel.build(map, self);
        }

        public DescribeScheduledTasksResponseBodyScheduledTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasks setDesiredCapacity(Integer desiredCapacity) {
            this.desiredCapacity = desiredCapacity;
            return this;
        }
        public Integer getDesiredCapacity() {
            return this.desiredCapacity;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasks setLaunchExpirationTime(Integer launchExpirationTime) {
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }
        public Integer getLaunchExpirationTime() {
            return this.launchExpirationTime;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasks setLaunchTime(String launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public String getLaunchTime() {
            return this.launchTime;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasks setMaxValue(Integer maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Integer getMaxValue() {
            return this.maxValue;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasks setMinValue(Integer minValue) {
            this.minValue = minValue;
            return this;
        }
        public Integer getMinValue() {
            return this.minValue;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasks setRecurrenceEndTime(String recurrenceEndTime) {
            this.recurrenceEndTime = recurrenceEndTime;
            return this;
        }
        public String getRecurrenceEndTime() {
            return this.recurrenceEndTime;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasks setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasks setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasks setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasks setScheduledAction(String scheduledAction) {
            this.scheduledAction = scheduledAction;
            return this;
        }
        public String getScheduledAction() {
            return this.scheduledAction;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasks setScheduledTaskId(String scheduledTaskId) {
            this.scheduledTaskId = scheduledTaskId;
            return this;
        }
        public String getScheduledTaskId() {
            return this.scheduledTaskId;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasks setScheduledTaskName(String scheduledTaskName) {
            this.scheduledTaskName = scheduledTaskName;
            return this;
        }
        public String getScheduledTaskName() {
            return this.scheduledTaskName;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasks setTaskEnabled(Boolean taskEnabled) {
            this.taskEnabled = taskEnabled;
            return this;
        }
        public Boolean getTaskEnabled() {
            return this.taskEnabled;
        }

    }

}
