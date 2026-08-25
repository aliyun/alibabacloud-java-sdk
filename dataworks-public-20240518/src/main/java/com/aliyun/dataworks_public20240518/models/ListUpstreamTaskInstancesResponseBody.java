// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListUpstreamTaskInstancesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListUpstreamTaskInstancesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
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

    public static class ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource extends TeaModel {
        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource self = new ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime extends TeaModel {
        /**
         * <p>The machine on which the task runs.</p>
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

        public static ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime self = new ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

    }

    public static class ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource extends TeaModel {
        /**
         * <p>The compute unit (CU) consumption configured for the task.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public String cu;

        /**
         * <p>The image ID configured for the task.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxxx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The identifier of the schedule resource group configured for the task.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource self = new ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances extends TeaModel {
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
        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource dataSource;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The project environment.</p>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The time when the instance finished running.</p>
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
         * <p>The account ID of the task owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The period number. Indicates which scheduling cycle of the day the task instance belongs to.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodNumber")
        public Integer periodNumber;

        /**
         * <p>The task running priority. Minimum value: 1. Maximum value: 8. A larger value indicates a higher priority. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The project environment.</p>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("ProjectEnv")
        @Deprecated
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
         * <p>The rerun configuration of the node. Valid values:</p>
         * <ul>
         * <li>AllDenied: The node cannot be rerun regardless of whether it fails or succeeds.</li>
         * <li>FailureAllowed: The node can be rerun only after it fails.</li>
         * <li>AllAllowed: The node can be rerun regardless of whether it fails or succeeds.</li>
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
         * <p>The instance runtime information.</p>
         */
        @NameInMap("Runtime")
        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime runtime;

        /**
         * <p>The runtime environment configuration, such as resource group information.</p>
         */
        @NameInMap("RuntimeResource")
        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource runtimeResource;

        /**
         * <p>The time when the instance started running.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <p>The instance running status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The dependency type.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("StepType")
        public String stepType;

        /**
         * <p>The ID of the corresponding task.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The name of the corresponding task.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL node</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The type of the corresponding task.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The timeout period for task execution, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The run mode when the instance is triggered. This parameter takes effect when TriggerType is set to Scheduler.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Pause: paused</li>
         * <li>Skip: dry run</li>
         * <li>Normal: normal execution</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("TriggerRecurrence")
        public String triggerRecurrence;

        /**
         * <p>The scheduled trigger time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("TriggerTime")
        public Long triggerTime;

        /**
         * <p>The trigger type.</p>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

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
         * <p>The type of the workflow instance to which the instance belongs.</p>
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

        public static ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances self = new ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setDataSource(ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource getDataSource() {
            return this.dataSource;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setPeriodNumber(Integer periodNumber) {
            this.periodNumber = periodNumber;
            return this;
        }
        public Integer getPeriodNumber() {
            return this.periodNumber;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        @Deprecated
        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setProjectEnv(String projectEnv) {
            this.projectEnv = projectEnv;
            return this;
        }
        public String getProjectEnv() {
            return this.projectEnv;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setRunNumber(Integer runNumber) {
            this.runNumber = runNumber;
            return this;
        }
        public Integer getRunNumber() {
            return this.runNumber;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setRuntime(ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime getRuntime() {
            return this.runtime;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setRuntimeResource(ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setStepType(String stepType) {
            this.stepType = stepType;
            return this;
        }
        public String getStepType() {
            return this.stepType;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setTriggerRecurrence(String triggerRecurrence) {
            this.triggerRecurrence = triggerRecurrence;
            return this;
        }
        public String getTriggerRecurrence() {
            return this.triggerRecurrence;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setTriggerTime(Long triggerTime) {
            this.triggerTime = triggerTime;
            return this;
        }
        public Long getTriggerTime() {
            return this.triggerTime;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setWorkflowInstanceId(Long workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setWorkflowInstanceType(String workflowInstanceType) {
            this.workflowInstanceType = workflowInstanceType;
            return this;
        }
        public String getWorkflowInstanceType() {
            return this.workflowInstanceType;
        }

        public ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances setWorkflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }
        public String getWorkflowName() {
            return this.workflowName;
        }

    }

    public static class ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceDataSource extends TeaModel {
        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_test</p>
         */
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
        /**
         * <p>The machine on which the task runs.</p>
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
        /**
         * <p>The compute unit (CU) consumption configured for the task.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public String cu;

        /**
         * <p>The image ID configured for the task.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxxx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The identifier of the schedule resource group configured for the task.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
         */
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
        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceDataSource dataSource;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The environment of the target data source. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The time when the instance finished running.</p>
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
         * <p>The account ID of the task owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The period number. Indicates which scheduling cycle of the day the task instance belongs to.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodNumber")
        public Integer periodNumber;

        /**
         * <p>The task running priority. Minimum value: 1. Maximum value: 8. A larger value indicates a higher priority. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The configuration that specifies whether the task can be rerun.</p>
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
         * <p>The instance runtime information.</p>
         */
        @NameInMap("Runtime")
        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntime runtime;

        /**
         * <p>The runtime environment configuration, such as resource group information.</p>
         */
        @NameInMap("RuntimeResource")
        public ListUpstreamTaskInstancesResponseBodyPagingInfoUpstreamTaskInstancesTaskInstanceRuntimeResource runtimeResource;

        /**
         * <p>The time when the instance started running.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <p>The instance running status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the corresponding task.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The name of the corresponding task.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL node</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The type of the corresponding task.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The timeout period for task execution, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The run mode when the instance is triggered. This parameter takes effect when TriggerType is set to Scheduler.</p>
         * <p>Valid values:</p>
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
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("TriggerTime")
        public Long triggerTime;

        /**
         * <p>The trigger type.</p>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

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
         * <p>The type of the workflow instance to which the instance belongs.</p>
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
        /**
         * <p>The dependency type.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("DependencyType")
        public String dependencyType;

        /**
         * <p>The details of the task instance.</p>
         */
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
         * <p><strong>[Deprecated]</strong> The list of task instances. This field is deprecated. Use UpstreamTaskInstances instead.</p>
         */
        @NameInMap("TaskInstances")
        public java.util.List<ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances> taskInstances;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The list of upstream task instances.</p>
         */
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

        public ListUpstreamTaskInstancesResponseBodyPagingInfo setTaskInstances(java.util.List<ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances> taskInstances) {
            this.taskInstances = taskInstances;
            return this;
        }
        public java.util.List<ListUpstreamTaskInstancesResponseBodyPagingInfoTaskInstances> getTaskInstances() {
            return this.taskInstances;
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
