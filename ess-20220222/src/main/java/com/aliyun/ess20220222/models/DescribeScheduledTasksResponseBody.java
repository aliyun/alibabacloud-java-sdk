// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScheduledTasksResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information collection of the scheduled tasks.</p>
     */
    @NameInMap("ScheduledTasks")
    public java.util.List<DescribeScheduledTasksResponseBodyScheduledTasks> scheduledTasks;

    /**
     * <p>The total number of scheduled tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>Test scheduled task.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The expected number of instances in the scaling group. If you set <code>Scaling Method</code> to <code>Configure Number of Instances in Scaling Group</code>, you can specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DesiredCapacity")
        public Integer desiredCapacity;

        /**
         * <p>The time window during which the scheduled task can be retried. Unit: seconds. Valid values: 0 to 21600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("LaunchExpirationTime")
        public Integer launchExpirationTime;

        /**
         * <p>The point in time at which the scheduled task is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-08-18T10:52Z</p>
         */
        @NameInMap("LaunchTime")
        public String launchTime;

        /**
         * <p>The maximum number of instances that must be contained in the scaling group. If you set <code>Scaling Method</code> to <code>Configure Number of Instances in Scaling Group</code>, you can specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxValue")
        public Integer maxValue;

        /**
         * <p>The minimum number of instances that must be contained in the scaling group. If you set <code>Scaling Method</code> to <code>Configure Number of Instances in Scaling Group</code>, you can specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinValue")
        public Integer minValue;

        /**
         * <p>The end time of the recurrence of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-08-20T16:55Z</p>
         */
        @NameInMap("RecurrenceEndTime")
        public String recurrenceEndTime;

        /**
         * <p>The recurring interval of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>The frequency of recurrence of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        /**
         * <p>The ID of the scaling group to which the scheduled task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1bo5tca4m56nap****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The scaling rule of the scheduled task. A value is returned for this parameter only after you specify ScheduledActions.</p>
         * 
         * <strong>example:</strong>
         * <p>ari:acs:ess:cn-hangzhou:1406926474****:scalingrule/asr-bp1id5rhu8edp7kd****</p>
         */
        @NameInMap("ScheduledAction")
        public String scheduledAction;

        /**
         * <p>The ID of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>edRtShc57WGXdt8TlPbr****</p>
         */
        @NameInMap("ScheduledTaskId")
        public String scheduledTaskId;

        /**
         * <p>The name of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>scheduled****</p>
         */
        @NameInMap("ScheduledTaskName")
        public String scheduledTaskName;

        /**
         * <p>Indicates whether the scheduled task is enabled.</p>
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
