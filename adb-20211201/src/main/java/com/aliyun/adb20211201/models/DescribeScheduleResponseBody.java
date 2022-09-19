// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeScheduleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Schedule")
    public DescribeScheduleResponseBodySchedule schedule;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduleResponseBody self = new DescribeScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScheduleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScheduleResponseBody setSchedule(DescribeScheduleResponseBodySchedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public DescribeScheduleResponseBodySchedule getSchedule() {
        return this.schedule;
    }

    public DescribeScheduleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeScheduleResponseBodySchedule extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Crontab")
        public String crontab;

        @NameInMap("DefinitionDescription")
        public String definitionDescription;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EnvironmentCode")
        public Long environmentCode;

        @NameInMap("FailureStrategy")
        public String failureStrategy;

        @NameInMap("ProcessCode")
        public Long processCode;

        @NameInMap("ProcessDefinitionName")
        public String processDefinitionName;

        @NameInMap("ProcessInstancePriority")
        public String processInstancePriority;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ReleaseState")
        public String releaseState;

        @NameInMap("ScheduleId")
        public Long scheduleId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("TimeZoneId")
        public String timeZoneId;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("WarningGroupId")
        public Long warningGroupId;

        @NameInMap("WarningType")
        public String warningType;

        @NameInMap("WorkerGroup")
        public String workerGroup;

        public static DescribeScheduleResponseBodySchedule build(java.util.Map<String, ?> map) throws Exception {
            DescribeScheduleResponseBodySchedule self = new DescribeScheduleResponseBodySchedule();
            return TeaModel.build(map, self);
        }

        public DescribeScheduleResponseBodySchedule setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeScheduleResponseBodySchedule setCrontab(String crontab) {
            this.crontab = crontab;
            return this;
        }
        public String getCrontab() {
            return this.crontab;
        }

        public DescribeScheduleResponseBodySchedule setDefinitionDescription(String definitionDescription) {
            this.definitionDescription = definitionDescription;
            return this;
        }
        public String getDefinitionDescription() {
            return this.definitionDescription;
        }

        public DescribeScheduleResponseBodySchedule setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeScheduleResponseBodySchedule setEnvironmentCode(Long environmentCode) {
            this.environmentCode = environmentCode;
            return this;
        }
        public Long getEnvironmentCode() {
            return this.environmentCode;
        }

        public DescribeScheduleResponseBodySchedule setFailureStrategy(String failureStrategy) {
            this.failureStrategy = failureStrategy;
            return this;
        }
        public String getFailureStrategy() {
            return this.failureStrategy;
        }

        public DescribeScheduleResponseBodySchedule setProcessCode(Long processCode) {
            this.processCode = processCode;
            return this;
        }
        public Long getProcessCode() {
            return this.processCode;
        }

        public DescribeScheduleResponseBodySchedule setProcessDefinitionName(String processDefinitionName) {
            this.processDefinitionName = processDefinitionName;
            return this;
        }
        public String getProcessDefinitionName() {
            return this.processDefinitionName;
        }

        public DescribeScheduleResponseBodySchedule setProcessInstancePriority(String processInstancePriority) {
            this.processInstancePriority = processInstancePriority;
            return this;
        }
        public String getProcessInstancePriority() {
            return this.processInstancePriority;
        }

        public DescribeScheduleResponseBodySchedule setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeScheduleResponseBodySchedule setReleaseState(String releaseState) {
            this.releaseState = releaseState;
            return this;
        }
        public String getReleaseState() {
            return this.releaseState;
        }

        public DescribeScheduleResponseBodySchedule setScheduleId(Long scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }
        public Long getScheduleId() {
            return this.scheduleId;
        }

        public DescribeScheduleResponseBodySchedule setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeScheduleResponseBodySchedule setTimeZoneId(String timeZoneId) {
            this.timeZoneId = timeZoneId;
            return this;
        }
        public String getTimeZoneId() {
            return this.timeZoneId;
        }

        public DescribeScheduleResponseBodySchedule setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeScheduleResponseBodySchedule setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeScheduleResponseBodySchedule setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeScheduleResponseBodySchedule setWarningGroupId(Long warningGroupId) {
            this.warningGroupId = warningGroupId;
            return this;
        }
        public Long getWarningGroupId() {
            return this.warningGroupId;
        }

        public DescribeScheduleResponseBodySchedule setWarningType(String warningType) {
            this.warningType = warningType;
            return this;
        }
        public String getWarningType() {
            return this.warningType;
        }

        public DescribeScheduleResponseBodySchedule setWorkerGroup(String workerGroup) {
            this.workerGroup = workerGroup;
            return this;
        }
        public String getWorkerGroup() {
            return this.workerGroup;
        }

    }

}
