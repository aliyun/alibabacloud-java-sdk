// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DescribeWorkflowResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("schedule")
    public DescribeWorkflowResponseBodySchedule schedule;

    @NameInMap("taskRelations")
    public java.util.List<DescribeWorkflowResponseBodyTaskRelations> taskRelations;

    @NameInMap("tasks")
    public java.util.List<DescribeWorkflowResponseBodyTasks> tasks;

    @NameInMap("workflow")
    public DescribeWorkflowResponseBodyWorkflow workflow;

    public static DescribeWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkflowResponseBody self = new DescribeWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWorkflowResponseBody setSchedule(DescribeWorkflowResponseBodySchedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public DescribeWorkflowResponseBodySchedule getSchedule() {
        return this.schedule;
    }

    public DescribeWorkflowResponseBody setTaskRelations(java.util.List<DescribeWorkflowResponseBodyTaskRelations> taskRelations) {
        this.taskRelations = taskRelations;
        return this;
    }
    public java.util.List<DescribeWorkflowResponseBodyTaskRelations> getTaskRelations() {
        return this.taskRelations;
    }

    public DescribeWorkflowResponseBody setTasks(java.util.List<DescribeWorkflowResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DescribeWorkflowResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public DescribeWorkflowResponseBody setWorkflow(DescribeWorkflowResponseBodyWorkflow workflow) {
        this.workflow = workflow;
        return this;
    }
    public DescribeWorkflowResponseBodyWorkflow getWorkflow() {
        return this.workflow;
    }

    public static class DescribeWorkflowResponseBodySchedule extends TeaModel {
        @NameInMap("alertGroupId")
        public String alertGroupId;

        @NameInMap("alertStrategy")
        public String alertStrategy;

        @NameInMap("cronExpr")
        public String cronExpr;

        @NameInMap("emrClusterId")
        public String emrClusterId;

        @NameInMap("failureStrategy")
        public String failureStrategy;

        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        @NameInMap("scheduleEndTime")
        public String scheduleEndTime;

        @NameInMap("scheduleStartTime")
        public String scheduleStartTime;

        @NameInMap("scheduleState")
        public String scheduleState;

        @NameInMap("timeZone")
        public String timeZone;

        @NameInMap("workflowInstancePriority")
        public String workflowInstancePriority;

        public static DescribeWorkflowResponseBodySchedule build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkflowResponseBodySchedule self = new DescribeWorkflowResponseBodySchedule();
            return TeaModel.build(map, self);
        }

        public DescribeWorkflowResponseBodySchedule setAlertGroupId(String alertGroupId) {
            this.alertGroupId = alertGroupId;
            return this;
        }
        public String getAlertGroupId() {
            return this.alertGroupId;
        }

        public DescribeWorkflowResponseBodySchedule setAlertStrategy(String alertStrategy) {
            this.alertStrategy = alertStrategy;
            return this;
        }
        public String getAlertStrategy() {
            return this.alertStrategy;
        }

        public DescribeWorkflowResponseBodySchedule setCronExpr(String cronExpr) {
            this.cronExpr = cronExpr;
            return this;
        }
        public String getCronExpr() {
            return this.cronExpr;
        }

        public DescribeWorkflowResponseBodySchedule setEmrClusterId(String emrClusterId) {
            this.emrClusterId = emrClusterId;
            return this;
        }
        public String getEmrClusterId() {
            return this.emrClusterId;
        }

        public DescribeWorkflowResponseBodySchedule setFailureStrategy(String failureStrategy) {
            this.failureStrategy = failureStrategy;
            return this;
        }
        public String getFailureStrategy() {
            return this.failureStrategy;
        }

        public DescribeWorkflowResponseBodySchedule setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeWorkflowResponseBodySchedule setScheduleEndTime(String scheduleEndTime) {
            this.scheduleEndTime = scheduleEndTime;
            return this;
        }
        public String getScheduleEndTime() {
            return this.scheduleEndTime;
        }

        public DescribeWorkflowResponseBodySchedule setScheduleStartTime(String scheduleStartTime) {
            this.scheduleStartTime = scheduleStartTime;
            return this;
        }
        public String getScheduleStartTime() {
            return this.scheduleStartTime;
        }

        public DescribeWorkflowResponseBodySchedule setScheduleState(String scheduleState) {
            this.scheduleState = scheduleState;
            return this;
        }
        public String getScheduleState() {
            return this.scheduleState;
        }

        public DescribeWorkflowResponseBodySchedule setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public DescribeWorkflowResponseBodySchedule setWorkflowInstancePriority(String workflowInstancePriority) {
            this.workflowInstancePriority = workflowInstancePriority;
            return this;
        }
        public String getWorkflowInstancePriority() {
            return this.workflowInstancePriority;
        }

    }

    public static class DescribeWorkflowResponseBodyTaskRelations extends TeaModel {
        @NameInMap("postTaskId")
        public String postTaskId;

        @NameInMap("preTaskId")
        public String preTaskId;

        public static DescribeWorkflowResponseBodyTaskRelations build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkflowResponseBodyTaskRelations self = new DescribeWorkflowResponseBodyTaskRelations();
            return TeaModel.build(map, self);
        }

        public DescribeWorkflowResponseBodyTaskRelations setPostTaskId(String postTaskId) {
            this.postTaskId = postTaskId;
            return this;
        }
        public String getPostTaskId() {
            return this.postTaskId;
        }

        public DescribeWorkflowResponseBodyTaskRelations setPreTaskId(String preTaskId) {
            this.preTaskId = preTaskId;
            return this;
        }
        public String getPreTaskId() {
            return this.preTaskId;
        }

    }

    public static class DescribeWorkflowResponseBodyTasks extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("taskId")
        public String taskId;

        @NameInMap("version")
        public Integer version;

        public static DescribeWorkflowResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkflowResponseBodyTasks self = new DescribeWorkflowResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeWorkflowResponseBodyTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeWorkflowResponseBodyTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeWorkflowResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeWorkflowResponseBodyTasks setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class DescribeWorkflowResponseBodyWorkflow extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("executionType")
        public String executionType;

        @NameInMap("name")
        public String name;

        @NameInMap("parentDirectoryId")
        public String parentDirectoryId;

        @NameInMap("timeout")
        public Integer timeout;

        @NameInMap("updateTime")
        public String updateTime;

        @NameInMap("workflowId")
        public String workflowId;

        @NameInMap("workflowParams")
        public String workflowParams;

        public static DescribeWorkflowResponseBodyWorkflow build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkflowResponseBodyWorkflow self = new DescribeWorkflowResponseBodyWorkflow();
            return TeaModel.build(map, self);
        }

        public DescribeWorkflowResponseBodyWorkflow setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeWorkflowResponseBodyWorkflow setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeWorkflowResponseBodyWorkflow setExecutionType(String executionType) {
            this.executionType = executionType;
            return this;
        }
        public String getExecutionType() {
            return this.executionType;
        }

        public DescribeWorkflowResponseBodyWorkflow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeWorkflowResponseBodyWorkflow setParentDirectoryId(String parentDirectoryId) {
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }
        public String getParentDirectoryId() {
            return this.parentDirectoryId;
        }

        public DescribeWorkflowResponseBodyWorkflow setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public DescribeWorkflowResponseBodyWorkflow setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeWorkflowResponseBodyWorkflow setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

        public DescribeWorkflowResponseBodyWorkflow setWorkflowParams(String workflowParams) {
            this.workflowParams = workflowParams;
            return this;
        }
        public String getWorkflowParams() {
            return this.workflowParams;
        }

    }

}
