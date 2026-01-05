// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListTaskInstancesResponseBody extends TeaModel {
    /**
     * <p>Pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListTaskInstancesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
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
         * <p>The host for running.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai.1.2</p>
         */
        @NameInMap("Gateway")
        public String gateway;

        /**
         * <p>The instance run ID.</p>
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
         * <p>The default number of CUs configured for task running.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public String cu;

        /**
         * <p>The ID of the image configured for task running.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxxx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The ID of the resource group for scheduling configured for task running.</p>
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
         * <p>The data timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The account ID of the user who creates the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The information about the associated data source.</p>
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
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("FinishedTime")
        public Long finishedTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The account ID of the user who modifies the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The account ID of the task owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The sequence number of the cycle. This parameter indicates the cycle of the task instance on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodNumber")
        public Integer periodNumber;

        /**
         * <p>The priority of the task. Minimum value: 1. Maximum value: 8. A larger value indicates a higher priority. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The environment of the workspace.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Prod: production environment</li>
         * <li>Dev: development environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("ProjectEnv")
        public String projectEnv;

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The rerun mode</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AllDenied: The task cannot be rerun regardless of whether the task is successfully run or fails to run.</li>
         * <li>FailureAllowed: The task can be rerun only after it fails to run.</li>
         * <li>AllAllowed: The task can be rerun regardless of whether the task is successfully run or fails to run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AllAllowed</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>The number of times the task is run. By default, the value starts from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunNumber")
        public Integer runNumber;

        /**
         * <p>The runtime information about the instance.</p>
         */
        @NameInMap("Runtime")
        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime runtime;

        /**
         * <p>The information about the resource group with which the instance is associated.</p>
         */
        @NameInMap("RuntimeResource")
        public ListTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource runtimeResource;

        /**
         * <p>The script parameter list.</p>
         * 
         * <strong>example:</strong>
         * <p>para1=val1 para2=val2</p>
         */
        @NameInMap("ScriptParameters")
        public String scriptParameters;

        /**
         * <p>The time when the instance started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <p>The status of the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>NotRun: The instance is not run.</li>
         * <li>Running: The instance is running.</li>
         * <li>WaitTime: The instance is waiting for the scheduling time to arrive.</li>
         * <li>CheckingCondition: Branch conditions are being checked for the instance.</li>
         * <li>WaitResource: The instance is waiting for resources.</li>
         * <li>Failure: The instance fails to be run.</li>
         * <li>Success: The instance is successfully run.</li>
         * <li>Checking: Data quality is being checked for the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task for which the instance is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The name of the task for which the instance is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL node</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The type of the task for which the instance is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The timeout period of task running. Unit: seconds.</p>
         * <p>Note: The value of this parameter is rounded up by hour.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The running mode of the instance after it is triggered. This parameter takes effect only if the TriggerType parameter is set to Scheduler.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Pause</li>
         * <li>Skip</li>
         * <li>Normal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("TriggerRecurrence")
        public String triggerRecurrence;

        /**
         * <p>The scheduling time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("TriggerTime")
        public Long triggerTime;

        /**
         * <p>The trigger type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Scheduler: scheduling cycle-based trigger</li>
         * <li>Manual: manual trigger</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("UnifiedWorkflowInstanceId")
        public Long unifiedWorkflowInstanceId;

        /**
         * <p>The timestamp for when it started waiting for resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("WaitingResourceTime")
        public Long waitingResourceTime;

        /**
         * <p>The timestamp for when it started waiting for the scheduled time.</p>
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
         * <p>The workflow instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("WorkflowInstanceId")
        public Long workflowInstanceId;

        /**
         * <p>The type of the workflow instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>SmokeTest</li>
         * <li>SupplementData</li>
         * <li>Manual</li>
         * <li>ManualWorkflow</li>
         * <li>Normal</li>
         * <li>ManualFlow</li>
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
         * <p>The total number of entries returned.</p>
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
