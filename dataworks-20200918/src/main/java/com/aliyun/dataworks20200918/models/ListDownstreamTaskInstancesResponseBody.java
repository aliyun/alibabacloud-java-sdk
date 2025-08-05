// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListDownstreamTaskInstancesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListDownstreamTaskInstancesResponseBodyPagingInfo pagingInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDownstreamTaskInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDownstreamTaskInstancesResponseBody self = new ListDownstreamTaskInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDownstreamTaskInstancesResponseBody setPagingInfo(ListDownstreamTaskInstancesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDownstreamTaskInstancesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDownstreamTaskInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceDataSource extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceDataSource self = new ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceDataSource();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntime extends TeaModel {
        @NameInMap("Gateway")
        public String gateway;

        @NameInMap("ProcessId")
        public String processId;

        public static ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntime build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntime self = new ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntime();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntime setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntime setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

    }

    public static class ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntimeResource extends TeaModel {
        @NameInMap("Cu")
        public String cu;

        @NameInMap("Image")
        public String image;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntimeResource self = new ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance extends TeaModel {
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("Bizdate")
        public Long bizdate;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DataSource")
        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceDataSource dataSource;

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
        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntime runtime;

        @NameInMap("RuntimeResource")
        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntimeResource runtimeResource;

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

        public static ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance self = new ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setDataSource(ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceDataSource getDataSource() {
            return this.dataSource;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setPeriodNumber(Integer periodNumber) {
            this.periodNumber = periodNumber;
            return this;
        }
        public Integer getPeriodNumber() {
            return this.periodNumber;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setRunNumber(Integer runNumber) {
            this.runNumber = runNumber;
            return this;
        }
        public Integer getRunNumber() {
            return this.runNumber;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setRuntime(ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntime getRuntime() {
            return this.runtime;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setRuntimeResource(ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setTriggerRecurrence(String triggerRecurrence) {
            this.triggerRecurrence = triggerRecurrence;
            return this;
        }
        public String getTriggerRecurrence() {
            return this.triggerRecurrence;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setTriggerTime(Long triggerTime) {
            this.triggerTime = triggerTime;
            return this;
        }
        public Long getTriggerTime() {
            return this.triggerTime;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setWaitingResourceTime(Long waitingResourceTime) {
            this.waitingResourceTime = waitingResourceTime;
            return this;
        }
        public Long getWaitingResourceTime() {
            return this.waitingResourceTime;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setWaitingTriggerTime(Long waitingTriggerTime) {
            this.waitingTriggerTime = waitingTriggerTime;
            return this;
        }
        public Long getWaitingTriggerTime() {
            return this.waitingTriggerTime;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setWorkflowInstanceId(Long workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setWorkflowInstanceType(String workflowInstanceType) {
            this.workflowInstanceType = workflowInstanceType;
            return this;
        }
        public String getWorkflowInstanceType() {
            return this.workflowInstanceType;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance setWorkflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }
        public String getWorkflowName() {
            return this.workflowName;
        }

    }

    public static class ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstances extends TeaModel {
        @NameInMap("DependencyType")
        public String dependencyType;

        @NameInMap("TaskInstance")
        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance taskInstance;

        public static ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstances build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstances self = new ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstances();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstances setDependencyType(String dependencyType) {
            this.dependencyType = dependencyType;
            return this;
        }
        public String getDependencyType() {
            return this.dependencyType;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstances setTaskInstance(ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance taskInstance) {
            this.taskInstance = taskInstance;
            return this;
        }
        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstance getTaskInstance() {
            return this.taskInstance;
        }

    }

    public static class ListDownstreamTaskInstancesResponseBodyPagingInfo extends TeaModel {
        @NameInMap("DownstreamTaskInstances")
        public java.util.List<ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstances> downstreamTaskInstances;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDownstreamTaskInstancesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTaskInstancesResponseBodyPagingInfo self = new ListDownstreamTaskInstancesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfo setDownstreamTaskInstances(java.util.List<ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstances> downstreamTaskInstances) {
            this.downstreamTaskInstances = downstreamTaskInstances;
            return this;
        }
        public java.util.List<ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstances> getDownstreamTaskInstances() {
            return this.downstreamTaskInstances;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
