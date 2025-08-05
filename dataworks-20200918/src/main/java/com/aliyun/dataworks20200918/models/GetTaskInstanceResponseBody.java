// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetTaskInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("TaskOutputs")
        public java.util.List<GetTaskInstanceResponseBodyTaskInstanceOutputsTaskOutputs> taskOutputs;

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
        @NameInMap("Gateway")
        public String gateway;

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
        @NameInMap("Cu")
        public String cu;

        @NameInMap("Image")
        public String image;

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
        @NameInMap("Content")
        public String content;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("Bizdate")
        public Long bizdate;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DataSource")
        public GetTaskInstanceResponseBodyTaskInstanceDataSource dataSource;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("FinishedTime")
        public Long finishedTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Inputs")
        public GetTaskInstanceResponseBodyTaskInstanceInputs inputs;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Outputs")
        public GetTaskInstanceResponseBodyTaskInstanceOutputs outputs;

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
        public GetTaskInstanceResponseBodyTaskInstanceRuntime runtime;

        @NameInMap("RuntimeResource")
        public GetTaskInstanceResponseBodyTaskInstanceRuntimeResource runtimeResource;

        @NameInMap("Script")
        public GetTaskInstanceResponseBodyTaskInstanceScript script;

        @NameInMap("StartedTime")
        public Long startedTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<GetTaskInstanceResponseBodyTaskInstanceTags> tags;

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

        @NameInMap("WorkflowId")
        public Long workflowId;

        @NameInMap("WorkflowInstanceId")
        public Long workflowInstanceId;

        @NameInMap("WorkflowInstanceType")
        public String workflowInstanceType;

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

        public GetTaskInstanceResponseBodyTaskInstance setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
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

        public GetTaskInstanceResponseBodyTaskInstance setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
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
