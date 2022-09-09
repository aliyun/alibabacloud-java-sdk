// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScheduledTasksResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScheduledTasks")
    public java.util.List<DescribeScheduledTasksResponseBodyScheduledTasks> scheduledTasks;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("DesiredCapacity")
        public Integer desiredCapacity;

        @NameInMap("LaunchExpirationTime")
        public Integer launchExpirationTime;

        @NameInMap("LaunchTime")
        public String launchTime;

        @NameInMap("MaxValue")
        public Integer maxValue;

        @NameInMap("MinValue")
        public Integer minValue;

        @NameInMap("RecurrenceEndTime")
        public String recurrenceEndTime;

        @NameInMap("RecurrenceType")
        public String recurrenceType;

        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("ScheduledAction")
        public String scheduledAction;

        @NameInMap("ScheduledTaskId")
        public String scheduledTaskId;

        @NameInMap("ScheduledTaskName")
        public String scheduledTaskName;

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
