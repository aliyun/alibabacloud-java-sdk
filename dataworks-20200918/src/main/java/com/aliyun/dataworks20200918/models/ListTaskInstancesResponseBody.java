// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListTaskInstancesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListTaskInstancesResponseBodyPagingInfo pagingInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTaskInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskInstancesResponseBody self = new ListTaskInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskInstancesResponseBody setPagingInfo(ListTaskInstancesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListTaskInstancesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListTaskInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ListTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource self = new ListTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource();
            return TeaModel.build(map, self);
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime extends TeaModel {
        @NameInMap("Gateway")
        public String gateway;

        @NameInMap("ProcessId")
        public String processId;

        public static ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime build(java.util.Map<String, ?> map) throws Exception {
            ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime self = new ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime();
            return TeaModel.build(map, self);
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

    }

    public static class ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource extends TeaModel {
        @NameInMap("Cu")
        public String cu;

        @NameInMap("Image")
        public String image;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource self = new ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListTaskInstancesResponseBodyPagingInfoTaskInstances extends TeaModel {
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("Bizdate")
        public Long bizdate;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DataSource")
        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource dataSource;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("FinishedTime")
        public Long finishedTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("PeriodNumber")
        public Integer periodNumber;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("RerunMode")
        public String rerunMode;

        @NameInMap("RunNumber")
        public Integer runNumber;

        @NameInMap("Runtime")
        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime runtime;

        @NameInMap("RuntimeResource")
        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource runtimeResource;

        @NameInMap("ScriptParameters")
        public String scriptParameters;

        @NameInMap("StartedTime")
        public Long startedTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("TriggerRecurrence")
        public String triggerRecurrence;

        @NameInMap("TriggerTime")
        public Long triggerTime;

        @NameInMap("TriggerType")
        public String triggerType;

        @NameInMap("WaitingResourceTime")
        public Long waitingResourceTime;

        @NameInMap("WaitingTriggerTime")
        public Long waitingTriggerTime;

        @NameInMap("WorkflowId")
        public Long workflowId;

        @NameInMap("WorkflowInstanceId")
        public Long workflowInstanceId;

        @NameInMap("WorkflowInstanceType")
        public String workflowInstanceType;

        @NameInMap("WorkflowName")
        public String workflowName;

        public static ListTaskInstancesResponseBodyPagingInfoTaskInstances build(java.util.Map<String, ?> map) throws Exception {
            ListTaskInstancesResponseBodyPagingInfoTaskInstances self = new ListTaskInstancesResponseBodyPagingInfoTaskInstances();
            return TeaModel.build(map, self);
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setDataSource(ListTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource getDataSource() {
            return this.dataSource;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setPeriodNumber(Integer periodNumber) {
            this.periodNumber = periodNumber;
            return this;
        }
        public Integer getPeriodNumber() {
            return this.periodNumber;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setRunNumber(Integer runNumber) {
            this.runNumber = runNumber;
            return this;
        }
        public Integer getRunNumber() {
            return this.runNumber;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setRuntime(ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime getRuntime() {
            return this.runtime;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setRuntimeResource(ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setScriptParameters(String scriptParameters) {
            this.scriptParameters = scriptParameters;
            return this;
        }
        public String getScriptParameters() {
            return this.scriptParameters;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setTriggerRecurrence(String triggerRecurrence) {
            this.triggerRecurrence = triggerRecurrence;
            return this;
        }
        public String getTriggerRecurrence() {
            return this.triggerRecurrence;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setTriggerTime(Long triggerTime) {
            this.triggerTime = triggerTime;
            return this;
        }
        public Long getTriggerTime() {
            return this.triggerTime;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setWaitingResourceTime(Long waitingResourceTime) {
            this.waitingResourceTime = waitingResourceTime;
            return this;
        }
        public Long getWaitingResourceTime() {
            return this.waitingResourceTime;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setWaitingTriggerTime(Long waitingTriggerTime) {
            this.waitingTriggerTime = waitingTriggerTime;
            return this;
        }
        public Long getWaitingTriggerTime() {
            return this.waitingTriggerTime;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setWorkflowInstanceId(Long workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setWorkflowInstanceType(String workflowInstanceType) {
            this.workflowInstanceType = workflowInstanceType;
            return this;
        }
        public String getWorkflowInstanceType() {
            return this.workflowInstanceType;
        }

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setWorkflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }
        public String getWorkflowName() {
            return this.workflowName;
        }

    }

    public static class ListTaskInstancesResponseBodyPagingInfo extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TaskInstances")
        public java.util.List<ListTaskInstancesResponseBodyPagingInfoTaskInstances> taskInstances;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListTaskInstancesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTaskInstancesResponseBodyPagingInfo self = new ListTaskInstancesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListTaskInstancesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListTaskInstancesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTaskInstancesResponseBodyPagingInfo setTaskInstances(java.util.List<ListTaskInstancesResponseBodyPagingInfoTaskInstances> taskInstances) {
            this.taskInstances = taskInstances;
            return this;
        }
        public java.util.List<ListTaskInstancesResponseBodyPagingInfoTaskInstances> getTaskInstances() {
            return this.taskInstances;
        }

        public ListTaskInstancesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
