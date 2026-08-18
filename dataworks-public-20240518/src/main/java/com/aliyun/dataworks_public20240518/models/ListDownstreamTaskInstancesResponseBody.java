// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDownstreamTaskInstancesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDownstreamTaskInstancesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
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
        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_test</p>
         */
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
        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceDataSource dataSource;

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
         * <p>The account ID of the node owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The period number. Indicates which scheduling cycle of the day the instance is in.</p>
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
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The rerun configuration of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>AllAllowed</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>The current run number. The default value starts from 1.</p>
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
        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntime runtime;

        /**
         * <p>The runtime environment configuration, such as resource group information.</p>
         */
        @NameInMap("RuntimeResource")
        public ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstancesTaskInstanceRuntimeResource runtimeResource;

        /**
         * <p>The time when the instance started running.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <p>The run status of the instance.</p>
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
         * <p>The timeout period for node execution. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The run mode when triggered. This parameter takes effect when TriggerType is set to Scheduler. Valid values:</p>
         * <ul>
         * <li>Pause: paused.</li>
         * <li>Skip: dry run.</li>
         * <li>Normal: normal execution.</li>
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
        /**
         * <p>The dependency type.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("DependencyType")
        public String dependencyType;

        /**
         * <p>The task instance.</p>
         */
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

    public static class ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource extends TeaModel {
        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource self = new ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime extends TeaModel {
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

        public static ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime self = new ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

    }

    public static class ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource extends TeaModel {
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

        public static ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource self = new ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances extends TeaModel {
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
        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource dataSource;

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
         * <p>The account ID of the node owner.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The period number. Indicates which scheduling cycle of the day the instance is in.</p>
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
         * <p><strong>[Deprecated]</strong> The project environment. This field is deprecated. Use EnvType instead.</p>
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
         * <p>The rerun configuration of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>AllAllowed</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>The current run number. The default value starts from 1.</p>
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
        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime runtime;

        /**
         * <p>The resource group information associated with the instance.</p>
         */
        @NameInMap("RuntimeResource")
        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource runtimeResource;

        /**
         * <p>The time when the instance started running.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <p>The run status of the instance.</p>
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
         * <p>The timeout period for node execution. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The run mode at the time of triggering. This parameter takes effect when TriggerType is set to Scheduler.</p>
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

        public static ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances self = new ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setDataSource(ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesDataSource getDataSource() {
            return this.dataSource;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setPeriodNumber(Integer periodNumber) {
            this.periodNumber = periodNumber;
            return this;
        }
        public Integer getPeriodNumber() {
            return this.periodNumber;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        @Deprecated
        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setProjectEnv(String projectEnv) {
            this.projectEnv = projectEnv;
            return this;
        }
        public String getProjectEnv() {
            return this.projectEnv;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setRunNumber(Integer runNumber) {
            this.runNumber = runNumber;
            return this;
        }
        public Integer getRunNumber() {
            return this.runNumber;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setRuntime(ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntime getRuntime() {
            return this.runtime;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setRuntimeResource(ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstancesRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setStepType(String stepType) {
            this.stepType = stepType;
            return this;
        }
        public String getStepType() {
            return this.stepType;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setTriggerRecurrence(String triggerRecurrence) {
            this.triggerRecurrence = triggerRecurrence;
            return this;
        }
        public String getTriggerRecurrence() {
            return this.triggerRecurrence;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setTriggerTime(Long triggerTime) {
            this.triggerTime = triggerTime;
            return this;
        }
        public Long getTriggerTime() {
            return this.triggerTime;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setWorkflowInstanceId(Long workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setWorkflowInstanceType(String workflowInstanceType) {
            this.workflowInstanceType = workflowInstanceType;
            return this;
        }
        public String getWorkflowInstanceType() {
            return this.workflowInstanceType;
        }

        public ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances setWorkflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }
        public String getWorkflowName() {
            return this.workflowName;
        }

    }

    public static class ListDownstreamTaskInstancesResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The list of downstream task instances.</p>
         */
        @NameInMap("DownstreamTaskInstances")
        public java.util.List<ListDownstreamTaskInstancesResponseBodyPagingInfoDownstreamTaskInstances> downstreamTaskInstances;

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
         * <p><strong>[Deprecated]</strong> The list of task instances. This field is deprecated. Use DownstreamTaskInstances instead.</p>
         */
        @NameInMap("TaskInstances")
        public java.util.List<ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances> taskInstances;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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

        public ListDownstreamTaskInstancesResponseBodyPagingInfo setTaskInstances(java.util.List<ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances> taskInstances) {
            this.taskInstances = taskInstances;
            return this;
        }
        public java.util.List<ListDownstreamTaskInstancesResponseBodyPagingInfoTaskInstances> getTaskInstances() {
            return this.taskInstances;
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
