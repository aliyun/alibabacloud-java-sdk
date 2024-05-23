// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class DescribeScheduledTasksResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScheduledTasks")
    public DescribeScheduledTasksResponseBodyScheduledTasks scheduledTasks;

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

    public DescribeScheduledTasksResponseBody setScheduledTasks(DescribeScheduledTasksResponseBodyScheduledTasks scheduledTasks) {
        this.scheduledTasks = scheduledTasks;
        return this;
    }
    public DescribeScheduledTasksResponseBodyScheduledTasks getScheduledTasks() {
        return this.scheduledTasks;
    }

    public DescribeScheduledTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("LaunchExpirationTime")
        public Integer launchExpirationTime;

        @NameInMap("LaunchTime")
        public String launchTime;

        @NameInMap("RecurrenceEndTime")
        public String recurrenceEndTime;

        @NameInMap("RecurrenceType")
        public String recurrenceType;

        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        @NameInMap("ScheduledAction")
        public String scheduledAction;

        @NameInMap("ScheduledTaskId")
        public String scheduledTaskId;

        @NameInMap("ScheduledTaskName")
        public String scheduledTaskName;

        @NameInMap("TaskEnabled")
        public Boolean taskEnabled;

        public static DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask self = new DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask();
            return TeaModel.build(map, self);
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setLaunchExpirationTime(Integer launchExpirationTime) {
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }
        public Integer getLaunchExpirationTime() {
            return this.launchExpirationTime;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setLaunchTime(String launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public String getLaunchTime() {
            return this.launchTime;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setRecurrenceEndTime(String recurrenceEndTime) {
            this.recurrenceEndTime = recurrenceEndTime;
            return this;
        }
        public String getRecurrenceEndTime() {
            return this.recurrenceEndTime;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setScheduledAction(String scheduledAction) {
            this.scheduledAction = scheduledAction;
            return this;
        }
        public String getScheduledAction() {
            return this.scheduledAction;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setScheduledTaskId(String scheduledTaskId) {
            this.scheduledTaskId = scheduledTaskId;
            return this;
        }
        public String getScheduledTaskId() {
            return this.scheduledTaskId;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setScheduledTaskName(String scheduledTaskName) {
            this.scheduledTaskName = scheduledTaskName;
            return this;
        }
        public String getScheduledTaskName() {
            return this.scheduledTaskName;
        }

        public DescribeScheduledTasksResponseBodyScheduledTasksScheduledTask setTaskEnabled(Boolean taskEnabled) {
            this.taskEnabled = taskEnabled;
            return this;
        }
        public Boolean getTaskEnabled() {
            return this.taskEnabled;
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
