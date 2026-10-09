// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetTaskInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the task instance.</p>
     */
    @NameInMap("TaskInstance")
    public GetTaskInstanceResponseBodyTaskInstance taskInstance;

    public static GetTaskInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskInstanceResponseBody self = new GetTaskInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskInstanceResponseBody setTaskInstance(GetTaskInstanceResponseBodyTaskInstance taskInstance) {
        this.taskInstance = taskInstance;
        return this;
    }
    public GetTaskInstanceResponseBodyTaskInstance getTaskInstance() {
        return this.taskInstance;
    }

    public static class GetTaskInstanceResponseBodyTaskInstanceDataSource extends TeaModel {
        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetTaskInstanceResponseBodyTaskInstanceDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInstanceResponseBodyTaskInstanceDataSource self = new GetTaskInstanceResponseBodyTaskInstanceDataSource();
            return TeaModel.build(map, self);
        }

        public GetTaskInstanceResponseBodyTaskInstanceDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetTaskInstanceResponseBodyTaskInstanceInputsVariables extends TeaModel {
        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>Key1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the variable. Valid values:</p>
         * <ul>
         * <li>Constant: The variable is a constant.</li>
         * <li>PassThrough: The variable is the output of a parameter node.</li>
         * <li>System: The variable is a system variable.</li>
         * <li>NodeOutput: The variable is the script output.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Constant</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>Value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetTaskInstanceResponseBodyTaskInstanceInputsVariables build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInstanceResponseBodyTaskInstanceInputsVariables self = new GetTaskInstanceResponseBodyTaskInstanceInputsVariables();
            return TeaModel.build(map, self);
        }

        public GetTaskInstanceResponseBodyTaskInstanceInputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskInstanceResponseBodyTaskInstanceInputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskInstanceResponseBodyTaskInstanceInputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTaskInstanceResponseBodyTaskInstanceInputs extends TeaModel {
        /**
         * <p>The list of variable definitions.</p>
         */
        @NameInMap("Variables")
        public java.util.List<GetTaskInstanceResponseBodyTaskInstanceInputsVariables> variables;

        public static GetTaskInstanceResponseBodyTaskInstanceInputs build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInstanceResponseBodyTaskInstanceInputs self = new GetTaskInstanceResponseBodyTaskInstanceInputs();
            return TeaModel.build(map, self);
        }

        public GetTaskInstanceResponseBodyTaskInstanceInputs setVariables(java.util.List<GetTaskInstanceResponseBodyTaskInstanceInputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<GetTaskInstanceResponseBodyTaskInstanceInputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class GetTaskInstanceResponseBodyTaskInstanceOutputsTaskOutputs extends TeaModel {
        /**
         * <p>The output identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>pre.odps_sql_demo_0</p>
         */
        @NameInMap("Output")
        public String output;

        public static GetTaskInstanceResponseBodyTaskInstanceOutputsTaskOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInstanceResponseBodyTaskInstanceOutputsTaskOutputs self = new GetTaskInstanceResponseBodyTaskInstanceOutputsTaskOutputs();
            return TeaModel.build(map, self);
        }

        public GetTaskInstanceResponseBodyTaskInstanceOutputsTaskOutputs setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class GetTaskInstanceResponseBodyTaskInstanceOutputsVariables extends TeaModel {
        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the variable. Valid values:</p>
         * <ul>
         * <li>Constant: The variable is a constant.</li>
         * <li>PassThrough: The variable is the output of a parameter node.</li>
         * <li>System: The variable is a system variable.</li>
         * <li>NodeOutput: The variable is the script output.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Constant</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetTaskInstanceResponseBodyTaskInstanceOutputsVariables build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInstanceResponseBodyTaskInstanceOutputsVariables self = new GetTaskInstanceResponseBodyTaskInstanceOutputsVariables();
            return TeaModel.build(map, self);
        }

        public GetTaskInstanceResponseBodyTaskInstanceOutputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskInstanceResponseBodyTaskInstanceOutputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskInstanceResponseBodyTaskInstanceOutputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTaskInstanceResponseBodyTaskInstanceOutputs extends TeaModel {
        /**
         * <p>The list of task output definitions.</p>
         */
        @NameInMap("TaskOutputs")
        public java.util.List<GetTaskInstanceResponseBodyTaskInstanceOutputsTaskOutputs> taskOutputs;

        /**
         * <p>The list of variable definitions.</p>
         */
        @NameInMap("Variables")
        public java.util.List<GetTaskInstanceResponseBodyTaskInstanceOutputsVariables> variables;

        public static GetTaskInstanceResponseBodyTaskInstanceOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInstanceResponseBodyTaskInstanceOutputs self = new GetTaskInstanceResponseBodyTaskInstanceOutputs();
            return TeaModel.build(map, self);
        }

        public GetTaskInstanceResponseBodyTaskInstanceOutputs setTaskOutputs(java.util.List<GetTaskInstanceResponseBodyTaskInstanceOutputsTaskOutputs> taskOutputs) {
            this.taskOutputs = taskOutputs;
            return this;
        }
        public java.util.List<GetTaskInstanceResponseBodyTaskInstanceOutputsTaskOutputs> getTaskOutputs() {
            return this.taskOutputs;
        }

        public GetTaskInstanceResponseBodyTaskInstanceOutputs setVariables(java.util.List<GetTaskInstanceResponseBodyTaskInstanceOutputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<GetTaskInstanceResponseBodyTaskInstanceOutputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class GetTaskInstanceResponseBodyTaskInstanceRuntime extends TeaModel {
        /**
         * <p>The machine on which the task is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai.1.2</p>
         */
        @NameInMap("Gateway")
        public String gateway;

        /**
         * <p>The unique ID of the execution process.</p>
         * 
         * <strong>example:</strong>
         * <p>T3_123</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        public static GetTaskInstanceResponseBodyTaskInstanceRuntime build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInstanceResponseBodyTaskInstanceRuntime self = new GetTaskInstanceResponseBodyTaskInstanceRuntime();
            return TeaModel.build(map, self);
        }

        public GetTaskInstanceResponseBodyTaskInstanceRuntime setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public GetTaskInstanceResponseBodyTaskInstanceRuntime setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

    }

    public static class GetTaskInstanceResponseBodyTaskInstanceRuntimeResource extends TeaModel {
        /**
         * <p>The compute unit (CU) consumption configured for task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public String cu;

        /**
         * <p>The ID of the image configured for task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxxx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The identifier of the scheduling resource group configured for task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static GetTaskInstanceResponseBodyTaskInstanceRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInstanceResponseBodyTaskInstanceRuntimeResource self = new GetTaskInstanceResponseBodyTaskInstanceRuntimeResource();
            return TeaModel.build(map, self);
        }

        public GetTaskInstanceResponseBodyTaskInstanceRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public GetTaskInstanceResponseBodyTaskInstanceRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetTaskInstanceResponseBodyTaskInstanceRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class GetTaskInstanceResponseBodyTaskInstanceScript extends TeaModel {
        /**
         * <p>The content of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>echo &quot;helloWorld&quot;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The list of script parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>para1=$bizdate</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        public static GetTaskInstanceResponseBodyTaskInstanceScript build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInstanceResponseBodyTaskInstanceScript self = new GetTaskInstanceResponseBodyTaskInstanceScript();
            return TeaModel.build(map, self);
        }

        public GetTaskInstanceResponseBodyTaskInstanceScript setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTaskInstanceResponseBodyTaskInstanceScript setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

    }

    public static class GetTaskInstanceResponseBodyTaskInstanceTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetTaskInstanceResponseBodyTaskInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInstanceResponseBodyTaskInstanceTags self = new GetTaskInstanceResponseBodyTaskInstanceTags();
            return TeaModel.build(map, self);
        }

        public GetTaskInstanceResponseBodyTaskInstanceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTaskInstanceResponseBodyTaskInstanceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTaskInstanceResponseBodyTaskInstance extends TeaModel {
        /**
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The business date. The value is a 13-digit UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The creation time. The value is a 13-digit UNIX timestamp in milliseconds.</p>
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
         * <p>The information about the data source associated with the instance.</p>
         */
        @NameInMap("DataSource")
        public GetTaskInstanceResponseBodyTaskInstanceDataSource dataSource;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The completion time. The value is a 13-digit UNIX timestamp in milliseconds.</p>
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
         * <p>The input information.</p>
         */
        @NameInMap("Inputs")
        public GetTaskInstanceResponseBodyTaskInstanceInputs inputs;

        /**
         * <p>The update time. The value is a 13-digit UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The account ID of the user who updated the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The type of the latest operation on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TriggerDqc</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The output information.</p>
         */
        @NameInMap("Outputs")
        public GetTaskInstanceResponseBodyTaskInstanceOutputs outputs;

        /**
         * <p>The account ID of the task owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The period number. This indicates the sequence of the execution cycle for the task instance on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodNumber")
        public Integer periodNumber;

        /**
         * <p>The execution priority of the task. Valid values: 1 to 8. A larger value indicates a higher priority. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The project environment. Valid values:</p>
         * <ul>
         * <li>Prod: Production.</li>
         * <li>Dev: Development.</li>
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
         * <p>The configuration that specifies whether the task can be rerun. Valid values:</p>
         * <ul>
         * <li>AllDenied: The task cannot be rerun regardless of whether it fails or succeeds.</li>
         * <li>AllAllowed: The task can be rerun regardless of whether it fails or succeeds.</li>
         * <li>FailureAllowed: The task can be rerun only if it fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AllAllowed</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>The current number of runs. Default value: 1.</p>
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
        public GetTaskInstanceResponseBodyTaskInstanceRuntime runtime;

        /**
         * <p>The information about the resource group associated with the instance.</p>
         */
        @NameInMap("RuntimeResource")
        public GetTaskInstanceResponseBodyTaskInstanceRuntimeResource runtimeResource;

        /**
         * <p>The information about the execution script.</p>
         */
        @NameInMap("Script")
        public GetTaskInstanceResponseBodyTaskInstanceScript script;

        /**
         * <p>The start time. The value is a 13-digit UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <p>The running status of the instance. Valid values:</p>
         * <ul>
         * <li>NotRun: Not run.</li>
         * <li>Running: Running.</li>
         * <li>WaitTime: Waiting for the trigger time.</li>
         * <li>CheckingCondition: Checking branch conditions.</li>
         * <li>WaitResource: Waiting for resources.</li>
         * <li>Failure: Execution failed.</li>
         * <li>Success: Execution succeeded.</li>
         * <li>Checking: Submitted for data quality check.</li>
         * <li>WaitTrigger: Waiting for an external trigger. Triggered nodes change to this status after the waiting time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of task tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetTaskInstanceResponseBodyTaskInstanceTags> tags;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL node</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The type of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The timeout period for task execution, in seconds.</p>
         * <p>Note: The scheduling system rounds the configured value to the nearest hour.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The run mode upon trigger. This parameter takes effect only when TriggerType is set to Scheduler. Valid values:</p>
         * <ul>
         * <li>Normal: The task is a normal scheduled task and is scheduled on a daily basis.</li>
         * <li>Manual: The task is a manual task and is not scheduled on a daily basis.</li>
         * <li>Pause: The task is paused. It is scheduled on a daily basis, but is directly set to failed when the scheduling is triggered.</li>
         * <li>Skip: The task performs a dry run. It is scheduled on a daily basis, but is directly set to successful when the scheduling is triggered.</li>
         * <li>SkipUnchoose: The task is an unselected task in a temporary workflow. It exists only in temporary workflows and is directly set to successful when the scheduling is triggered.</li>
         * <li>SkipCycle: The task is a weekly or monthly task that has not reached its execution cycle. It is scheduled on a daily basis, but is directly set to successful when the scheduling is triggered.</li>
         * <li>ConditionUnchoose: The downstream node is not selected by an upstream branch (IF) node. The task is directly set to a dry run.</li>
         * <li>RealtimeDeprecated: The task is an expired periodic instance generated in real time. It is directly set to successful.</li>
         * <li>PauseCalendar: The instance is paused due to a referenced calendar.</li>
         * <li>SkipCalendar: The instance performs a dry run due to a referenced calendar.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("TriggerRecurrence")
        public String triggerRecurrence;

        /**
         * <p>The scheduled trigger time. The value is a 13-digit UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("TriggerTime")
        public Long triggerTime;

        /**
         * <p>The trigger type. You can obtain the trigger type from the Trigger.Type response parameter of the GetTask operation. Valid values:</p>
         * <ul>
         * <li>Scheduler: The task is triggered by a scheduling cycle.</li>
         * <li>Manual: The task is triggered manually.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <p>The unified workflow instance ID. The value of this field is the same for all task instances within a specific business date under a single trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("UnifiedWorkflowInstanceId")
        public Long unifiedWorkflowInstanceId;

        /**
         * <p>The time when the instance starts waiting for resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("WaitingResourceTime")
        public Long waitingResourceTime;

        /**
         * <p>The time when the instance starts waiting for the scheduled trigger. The value is a 13-digit UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("WaitingTriggerTime")
        public Long waitingTriggerTime;

        /**
         * <p>The ID of the workflow to which the task instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("WorkflowId")
        public Long workflowId;

        /**
         * <p>The ID of the workflow instance to which the task instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("WorkflowInstanceId")
        public Long workflowInstanceId;

        /**
         * <p>The type of the workflow instance to which the task instance belongs. Valid values:</p>
         * <ul>
         * <li>SmokeTest: The instance is a smoke test.</li>
         * <li>SupplementData: The instance is for data backfill.</li>
         * <li>Manual: The instance is a manual task.</li>
         * <li>ManualWorkflow: The instance is a manual workflow.</li>
         * <li>Normal: The instance uses periodic scheduling.</li>
         * <li>ManualFlow: The instance is a manually executed business flow.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("WorkflowInstanceType")
        public String workflowInstanceType;

        /**
         * <p>The name of the workflow to which the task instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Test workflow</p>
         */
        @NameInMap("WorkflowName")
        public String workflowName;

        public static GetTaskInstanceResponseBodyTaskInstance build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInstanceResponseBodyTaskInstance self = new GetTaskInstanceResponseBodyTaskInstance();
            return TeaModel.build(map, self);
        }

        public GetTaskInstanceResponseBodyTaskInstance setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetTaskInstanceResponseBodyTaskInstance setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public GetTaskInstanceResponseBodyTaskInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTaskInstanceResponseBodyTaskInstance setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetTaskInstanceResponseBodyTaskInstance setDataSource(GetTaskInstanceResponseBodyTaskInstanceDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public GetTaskInstanceResponseBodyTaskInstanceDataSource getDataSource() {
            return this.dataSource;
        }

        public GetTaskInstanceResponseBodyTaskInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTaskInstanceResponseBodyTaskInstance setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public GetTaskInstanceResponseBodyTaskInstance setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetTaskInstanceResponseBodyTaskInstance setInputs(GetTaskInstanceResponseBodyTaskInstanceInputs inputs) {
            this.inputs = inputs;
            return this;
        }
        public GetTaskInstanceResponseBodyTaskInstanceInputs getInputs() {
            return this.inputs;
        }

        public GetTaskInstanceResponseBodyTaskInstance setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetTaskInstanceResponseBodyTaskInstance setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetTaskInstanceResponseBodyTaskInstance setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public GetTaskInstanceResponseBodyTaskInstance setOutputs(GetTaskInstanceResponseBodyTaskInstanceOutputs outputs) {
            this.outputs = outputs;
            return this;
        }
        public GetTaskInstanceResponseBodyTaskInstanceOutputs getOutputs() {
            return this.outputs;
        }

        public GetTaskInstanceResponseBodyTaskInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTaskInstanceResponseBodyTaskInstance setPeriodNumber(Integer periodNumber) {
            this.periodNumber = periodNumber;
            return this;
        }
        public Integer getPeriodNumber() {
            return this.periodNumber;
        }

        public GetTaskInstanceResponseBodyTaskInstance setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetTaskInstanceResponseBodyTaskInstance setProjectEnv(String projectEnv) {
            this.projectEnv = projectEnv;
            return this;
        }
        public String getProjectEnv() {
            return this.projectEnv;
        }

        public GetTaskInstanceResponseBodyTaskInstance setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetTaskInstanceResponseBodyTaskInstance setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public GetTaskInstanceResponseBodyTaskInstance setRunNumber(Integer runNumber) {
            this.runNumber = runNumber;
            return this;
        }
        public Integer getRunNumber() {
            return this.runNumber;
        }

        public GetTaskInstanceResponseBodyTaskInstance setRuntime(GetTaskInstanceResponseBodyTaskInstanceRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public GetTaskInstanceResponseBodyTaskInstanceRuntime getRuntime() {
            return this.runtime;
        }

        public GetTaskInstanceResponseBodyTaskInstance setRuntimeResource(GetTaskInstanceResponseBodyTaskInstanceRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public GetTaskInstanceResponseBodyTaskInstanceRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public GetTaskInstanceResponseBodyTaskInstance setScript(GetTaskInstanceResponseBodyTaskInstanceScript script) {
            this.script = script;
            return this;
        }
        public GetTaskInstanceResponseBodyTaskInstanceScript getScript() {
            return this.script;
        }

        public GetTaskInstanceResponseBodyTaskInstance setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public GetTaskInstanceResponseBodyTaskInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskInstanceResponseBodyTaskInstance setTags(java.util.List<GetTaskInstanceResponseBodyTaskInstanceTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetTaskInstanceResponseBodyTaskInstanceTags> getTags() {
            return this.tags;
        }

        public GetTaskInstanceResponseBodyTaskInstance setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetTaskInstanceResponseBodyTaskInstance setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetTaskInstanceResponseBodyTaskInstance setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetTaskInstanceResponseBodyTaskInstance setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetTaskInstanceResponseBodyTaskInstance setTriggerRecurrence(String triggerRecurrence) {
            this.triggerRecurrence = triggerRecurrence;
            return this;
        }
        public String getTriggerRecurrence() {
            return this.triggerRecurrence;
        }

        public GetTaskInstanceResponseBodyTaskInstance setTriggerTime(Long triggerTime) {
            this.triggerTime = triggerTime;
            return this;
        }
        public Long getTriggerTime() {
            return this.triggerTime;
        }

        public GetTaskInstanceResponseBodyTaskInstance setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public GetTaskInstanceResponseBodyTaskInstance setUnifiedWorkflowInstanceId(Long unifiedWorkflowInstanceId) {
            this.unifiedWorkflowInstanceId = unifiedWorkflowInstanceId;
            return this;
        }
        public Long getUnifiedWorkflowInstanceId() {
            return this.unifiedWorkflowInstanceId;
        }

        public GetTaskInstanceResponseBodyTaskInstance setWaitingResourceTime(Long waitingResourceTime) {
            this.waitingResourceTime = waitingResourceTime;
            return this;
        }
        public Long getWaitingResourceTime() {
            return this.waitingResourceTime;
        }

        public GetTaskInstanceResponseBodyTaskInstance setWaitingTriggerTime(Long waitingTriggerTime) {
            this.waitingTriggerTime = waitingTriggerTime;
            return this;
        }
        public Long getWaitingTriggerTime() {
            return this.waitingTriggerTime;
        }

        public GetTaskInstanceResponseBodyTaskInstance setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public GetTaskInstanceResponseBodyTaskInstance setWorkflowInstanceId(Long workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        public GetTaskInstanceResponseBodyTaskInstance setWorkflowInstanceType(String workflowInstanceType) {
            this.workflowInstanceType = workflowInstanceType;
            return this;
        }
        public String getWorkflowInstanceType() {
            return this.workflowInstanceType;
        }

        public GetTaskInstanceResponseBodyTaskInstance setWorkflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }
        public String getWorkflowName() {
            return this.workflowName;
        }

    }

}
