// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeScheduledTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ScheduledTasks")
    public DescribeScheduledTasksResponseBodyScheduledTasks scheduledTasks;

    public static DescribeScheduledTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduledTasksResponseBody self = new DescribeScheduledTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScheduledTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public DescribeScheduledTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeScheduledTasksResponseBody setScheduledTasks(DescribeScheduledTasksResponseBodyScheduledTasks scheduledTasks) {
        this.scheduledTasks = scheduledTasks;
        return this;
    }
    public DescribeScheduledTasksResponseBodyScheduledTasks getScheduledTasks() {
        return this.scheduledTasks;
    }

    public static class DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask extends TeaModel {
        @NameInMap("TaskEnabled")
        public Boolean taskEnabled;

        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        @NameInMap("RecurrenceType")
        public String recurrenceType;

        @NameInMap("MaxValue")
        public Integer maxValue;

        @NameInMap("ScheduledTaskName")
        public String scheduledTaskName;

        @NameInMap("RecurrenceEndTime")
        public String recurrenceEndTime;

        @NameInMap("DesiredCapacity")
        public Integer desiredCapacity;

        @NameInMap("ScheduledTaskId")
        public String scheduledTaskId;

        @NameInMap("MinValue")
        public Integer minValue;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("LaunchExpirationTime")
        public Integer launchExpirationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ScheduledAction")
        public String scheduledAction;

        @NameInMap("LaunchTime")
        public String launchTime;

        public static DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask self = new DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask();
            return TeaModel.build(map, self);
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setTaskEnabled(Boolean taskEnabled) {
            this.taskEnabled = taskEnabled;
            return this;
        }
        public Boolean getTaskEnabled() {
            return this.taskEnabled;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setMaxValue(Integer maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Integer getMaxValue() {
            return this.maxValue;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setScheduledTaskName(String scheduledTaskName) {
            this.scheduledTaskName = scheduledTaskName;
            return this;
        }
        public String getScheduledTaskName() {
            return this.scheduledTaskName;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setRecurrenceEndTime(String recurrenceEndTime) {
            this.recurrenceEndTime = recurrenceEndTime;
            return this;
        }
        public String getRecurrenceEndTime() {
            return this.recurrenceEndTime;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setDesiredCapacity(Integer desiredCapacity) {
            this.desiredCapacity = desiredCapacity;
            return this;
        }
        public Integer getDesiredCapacity() {
            return this.desiredCapacity;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setScheduledTaskId(String scheduledTaskId) {
            this.scheduledTaskId = scheduledTaskId;
            return this;
        }
        public String getScheduledTaskId() {
            return this.scheduledTaskId;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setMinValue(Integer minValue) {
            this.minValue = minValue;
            return this;
        }
        public Integer getMinValue() {
            return this.minValue;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setLaunchExpirationTime(Integer launchExpirationTime) {
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }
        public Integer getLaunchExpirationTime() {
            return this.launchExpirationTime;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setScheduledAction(String scheduledAction) {
            this.scheduledAction = scheduledAction;
            return this;
        }
        public String getScheduledAction() {
            return this.scheduledAction;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setLaunchTime(String launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public String getLaunchTime() {
            return this.launchTime;
        }

    }

    public static class DescribeScheduledTasksResponseBodyScheduledTasks extends TeaModel {
        @NameInMap("ScheduledTask")
        public java.util.List<DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask> scheduledTask;

        public static DescribeScheduledTasksResponseBodyScheduledTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeScheduledTasksResponseBodyScheduledTasks self = new DescribeScheduledTasksResponseBodyScheduledTasks();
            return TeaModel.build(map, self);
        }

        public DescribeScheduledTasksResponseBodyScheduledTasks setScheduledTask(java.util.List<DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask> scheduledTask) {
            this.scheduledTask = scheduledTask;
            return this;
        }
        public java.util.List<DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask> getScheduledTask() {
            return this.scheduledTask;
        }

    }

}
