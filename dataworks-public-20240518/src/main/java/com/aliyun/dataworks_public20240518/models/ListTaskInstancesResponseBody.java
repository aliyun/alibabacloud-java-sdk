// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListTaskInstancesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListTaskInstancesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
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
        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_test</p>
         */
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
        /**
         * <p>The machine on which the instance runs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai.1.2</p>
         */
        @NameInMap("Gateway")
        public String gateway;

        /**
         * <p>The unique run ID.</p>
         * 
         * <strong>example:</strong>
         * <p>T3_123</p>
         */
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
        /**
         * <p>The compute unit (CU) consumption configured for the node.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public String cu;

        /**
         * <p>The image ID configured for the node.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxxx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The identifier of the schedule resource group configured for the node.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
         */
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
        /**
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The business date.</p>
         * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The creation time.</p>
         * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The account ID of the user who created the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The data source information associated with the instance.</p>
         */
        @NameInMap("DataSource")
        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource dataSource;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the instance finished running.</p>
         * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("FinishedTime")
        public Long finishedTime;

        /**
         * <p>The unique identifier of the task instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The modification time.</p>
         * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The account ID of the user who last modified the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The type of the most recent operation on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TriggerDqc</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The account ID of the node owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The period number. Indicates which scheduling cycle of the day the instance belongs to.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodNumber")
        public Integer periodNumber;

        /**
         * <p>The run priority of the node. Minimum value: 1. Maximum value: 8. A larger value indicates a higher priority. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The project environment. Valid values:</p>
         * <ul>
         * <li>Prod: production.</li>
         * <li>Dev: development.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("ProjectEnv")
        public String projectEnv;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The rerun configuration for the node. Valid values:</p>
         * <ul>
         * <li>AllDenied: rerun is not allowed regardless of success or failure.</li>
         * <li>FailureAllowed: rerun is allowed only upon failure.</li>
         * <li>AllAllowed: rerun is allowed regardless of success or failure.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AllAllowed</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>The current run number, starting from 1 by default.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunNumber")
        public Integer runNumber;

        /**
         * <p>The runtime information of the instance.</p>
         */
        @NameInMap("Runtime")
        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime runtime;

        /**
         * <p>The resource group information associated with the instance.</p>
         */
        @NameInMap("RuntimeResource")
        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource runtimeResource;

        /**
         * <p>The list of script parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>para1=val1 para2=val2</p>
         */
        @NameInMap("ScriptParameters")
        public String scriptParameters;

        /**
         * <p>The time when the instance started running.</p>
         * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <p>The run status of the instance. Valid values:</p>
         * <ul>
         * <li>NotRun: not run.</li>
         * <li>Running: running.</li>
         * <li>WaitTime: waiting for the TriggerTime to arrive.</li>
         * <li>CheckingCondition: checking branch conditions.</li>
         * <li>WaitResource: waiting for resources.</li>
         * <li>Failure: execution failed.</li>
         * <li>Success: execution succeeded.</li>
         * <li>Checking: submitted for qualityrule check.</li>
         * <li>WaitTrigger: waiting for an external trigger. Trigger-based nodes enter this status after the waiting period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the corresponding node.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The name of the corresponding node.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL node</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The type of the corresponding node.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The timeout period for node execution, in seconds.</p>
         * <p>Note: The scheduling system rounds the configured value to the nearest hour.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The run mode at the time of triggering. This parameter takes effect when TriggerType is set to Scheduler. Valid values:</p>
         * <ul>
         * <li>Pause: paused.</li>
         * <li>Skip: dry run.</li>
         * <li>Normal: normal run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("TriggerRecurrence")
        public String triggerRecurrence;

        /**
         * <p>The scheduled trigger time.</p>
         * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("TriggerTime")
        public Long triggerTime;

        /**
         * <p>The trigger type. Valid values:</p>
         * <ul>
         * <li>Scheduler: triggered by a scheduling cycle.</li>
         * <li>Manual: manually triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <p>The unified workflow instance ID. All instances within the same business date under a single trigger share the same value for this field.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("UnifiedWorkflowInstanceId")
        public Long unifiedWorkflowInstanceId;

        /**
         * <p>The time when the instance entered the waiting-for-resource state.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("WaitingResourceTime")
        public Long waitingResourceTime;

        /**
         * <p>The time when the instance entered the waiting-for-scheduled-time state.</p>
         * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("WaitingTriggerTime")
        public Long waitingTriggerTime;

        /**
         * <p>The ID of the workflow to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("WorkflowId")
        public Long workflowId;

        /**
         * <p>The ID of the workflow instance to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("WorkflowInstanceId")
        public Long workflowInstanceId;

        /**
         * <p>The type of the workflow instance to which the instance belongs. Valid values:</p>
         * <ul>
         * <li>SmokeTest: smoke test.</li>
         * <li>SupplementData: data backfill.</li>
         * <li>Manual: manually triggered.</li>
         * <li>ManualWorkflow: manual workflow.</li>
         * <li>Normal: periodic scheduling.</li>
         * <li>ManualFlow: manually triggered workflow.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("WorkflowInstanceType")
        public String workflowInstanceType;

        /**
         * <p>The name of the workflow to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Test workflow</p>
         */
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

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
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

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setProjectEnv(String projectEnv) {
            this.projectEnv = projectEnv;
            return this;
        }
        public String getProjectEnv() {
            return this.projectEnv;
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

        public ListTaskInstancesResponseBodyPagingInfoTaskInstances setUnifiedWorkflowInstanceId(Long unifiedWorkflowInstanceId) {
            this.unifiedWorkflowInstanceId = unifiedWorkflowInstanceId;
            return this;
        }
        public Long getUnifiedWorkflowInstanceId() {
            return this.unifiedWorkflowInstanceId;
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
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of task instances.</p>
         */
        @NameInMap("TaskInstances")
        public java.util.List<ListTaskInstancesResponseBodyPagingInfoTaskInstances> taskInstances;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
