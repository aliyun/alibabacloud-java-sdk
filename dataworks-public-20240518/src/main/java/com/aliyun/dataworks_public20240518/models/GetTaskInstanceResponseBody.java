// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetTaskInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
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
         * <p>The type. Valid values:</p>
         * <ul>
         * <li>Constant: constant</li>
         * <li>PassThrough: node output</li>
         * <li>System: variable</li>
         * <li>NodeOutput: script output</li>
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
         * <p>The variables.</p>
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
         * <p>The type. Valid values:</p>
         * <ul>
         * <li>Constant: constant</li>
         * <li>PassThrough: node output</li>
         * <li>System: variable</li>
         * <li>NodeOutput: script output</li>
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
         * <p>The task outputs.</p>
         */
        @NameInMap("TaskOutputs")
        public java.util.List<GetTaskInstanceResponseBodyTaskInstanceOutputsTaskOutputs> taskOutputs;

        /**
         * <p>The variables.</p>
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
         * <p>The script content.</p>
         * 
         * <strong>example:</strong>
         * <p>echo &quot;helloWorld&quot;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The script parameters.</p>
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
         * <p>The account ID of the creator.</p>
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
         * <p>The input information.</p>
         */
        @NameInMap("Inputs")
        public GetTaskInstanceResponseBodyTaskInstanceInputs inputs;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The account ID of the modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

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
         * <p>The sequence number of the cycle. This parameter indicates the cycle of the task instance on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodNumber")
        public Integer periodNumber;

        /**
         * <p>The task priority. Valid values: 1 to 8. A larger value indicates a higher priority. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The environment of the workspace. Valid values:</p>
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
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The rerun mode. Valid values:</p>
         * <ul>
         * <li>AllDenied: The task cannot be rerun regardless of whether the task is successfully run or fails to run.</li>
         * <li>AllAllowed: The task can be rerun regardless of whether the task is successfully run or fails to run.</li>
         * <li>FailureAllowed: The task can be rerun only after it fails to run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AllAllowed</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>The number of times the instance is run. By default, the value starts from 1.</p>
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
        public GetTaskInstanceResponseBodyTaskInstanceRuntime runtime;

        /**
         * <p>The information about the resource group with which the instance is associated.</p>
         */
        @NameInMap("RuntimeResource")
        public GetTaskInstanceResponseBodyTaskInstanceRuntimeResource runtimeResource;

        /**
         * <p>The script information.</p>
         */
        @NameInMap("Script")
        public GetTaskInstanceResponseBodyTaskInstanceScript script;

        /**
         * <p>The time when the instance started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <p>The status of the instance. Valid values:</p>
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
         * <p>The tags of the task.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetTaskInstanceResponseBodyTaskInstanceTags> tags;

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
         * <p>The running mode of the instance after it is triggered. This parameter takes effect only if the TriggerType parameter is set to Scheduler. Valid values:</p>
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
         * <p>The method to trigger instance scheduling. The value of the Trigger.Type parameter in the response of the GetTask operation is used. Valid values:</p>
         * <ul>
         * <li>Scheduler</li>
         * <li>Manual</li>
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
         * <p>The type of the workflow instance. Valid values:</p>
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
