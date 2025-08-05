// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListUpstreamTaskInstancesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListUpstreamTaskInstancesResponseBodyPagingInfo pagingInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUpstreamTaskInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUpstreamTaskInstancesResponseBody self = new ListUpstreamTaskInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUpstreamTaskInstancesResponseBody setPagingInfo(ListUpstreamTaskInstancesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListUpstreamTaskInstancesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListUpstreamTaskInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceDataSource extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceDataSource self = new ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceDataSource();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntime extends TeaModel {
        @NameInMap("Gateway")
        public String gateway;

        @NameInMap("ProcessId")
        public String processId;

        public static ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntime build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntime self = new ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntime();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntime setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntime setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

    }

    public static class ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntimeResource extends TeaModel {
        @NameInMap("Cu")
        public String cu;

        @NameInMap("Image")
        public String image;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntimeResource self = new ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance extends TeaModel {
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("Bizdate")
        public Long bizdate;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DataSource")
        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceDataSource dataSource;

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
        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntime runtime;

        @NameInMap("RuntimeResource")
        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntimeResource runtimeResource;

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

        public static ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance self = new ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setDataSource(ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceDataSource getDataSource() {
            return this.dataSource;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setPeriodNumber(Integer periodNumber) {
            this.periodNumber = periodNumber;
            return this;
        }
        public Integer getPeriodNumber() {
            return this.periodNumber;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setRunNumber(Integer runNumber) {
            this.runNumber = runNumber;
            return this;
        }
        public Integer getRunNumber() {
            return this.runNumber;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setRuntime(ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntime getRuntime() {
            return this.runtime;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setRuntimeResource(ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setTriggerRecurrence(String triggerRecurrence) {
            this.triggerRecurrence = triggerRecurrence;
            return this;
        }
        public String getTriggerRecurrence() {
            return this.triggerRecurrence;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setTriggerTime(Long triggerTime) {
            this.triggerTime = triggerTime;
            return this;
        }
        public Long getTriggerTime() {
            return this.triggerTime;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setWaitingResourceTime(Long waitingResourceTime) {
            this.waitingResourceTime = waitingResourceTime;
            return this;
        }
        public Long getWaitingResourceTime() {
            return this.waitingResourceTime;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setWaitingTriggerTime(Long waitingTriggerTime) {
            this.waitingTriggerTime = waitingTriggerTime;
            return this;
        }
        public Long getWaitingTriggerTime() {
            return this.waitingTriggerTime;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setWorkflowInstanceId(Long workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setWorkflowInstanceType(String workflowInstanceType) {
            this.workflowInstanceType = workflowInstanceType;
            return this;
        }
        public String getWorkflowInstanceType() {
            return this.workflowInstanceType;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance setWorkflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }
        public String getWorkflowName() {
            return this.workflowName;
        }

    }

    public static class ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstances extends TeaModel {
        @NameInMap("DependencyType")
        public String dependencyType;

        @NameInMap("TaskInstance")
        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance taskInstance;

        public static ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstances build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstances self = new ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstances();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstances setDependencyType(String dependencyType) {
            this.dependencyType = dependencyType;
            return this;
        }
        public String getDependencyType() {
            return this.dependencyType;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstances setTaskInstance(ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance taskInstance) {
            this.taskInstance = taskInstance;
            return this;
        }
        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstance getTaskInstance() {
            return this.taskInstance;
        }

    }

    public static class ListUpstreamTaskInstancesResponseBodyPagingInfo extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("UpstreamTaskInstances")
        public java.util.List<ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstances> upstreamTaskInstances;

        public static ListUpstreamTaskInstancesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTaskInstancesResponseBodyPagingInfo self = new ListUpstreamTaskInstancesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfo setUpstreamTaskInstances(java.util.List<ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstances> upstreamTaskInstances) {
            this.upstreamTaskInstances = upstreamTaskInstances;
            return this;
        }
        public java.util.List<ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstances> getUpstreamTaskInstances() {
            return this.upstreamTaskInstances;
        }

    }

}
