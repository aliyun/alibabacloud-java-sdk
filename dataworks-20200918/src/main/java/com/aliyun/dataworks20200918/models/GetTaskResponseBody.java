// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Task")
    public GetTaskResponseBodyTask task;

    public static GetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponseBody self = new GetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResponseBody setTask(GetTaskResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetTaskResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetTaskResponseBodyTaskDataSource extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static GetTaskResponseBodyTaskDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskDataSource self = new GetTaskResponseBodyTaskDataSource();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetTaskResponseBodyTaskDependencies extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("UpstreamOutput")
        public String upstreamOutput;

        @NameInMap("UpstreamTaskId")
        public String upstreamTaskId;

        public static GetTaskResponseBodyTaskDependencies build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskDependencies self = new GetTaskResponseBodyTaskDependencies();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskDependencies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskResponseBodyTaskDependencies setUpstreamOutput(String upstreamOutput) {
            this.upstreamOutput = upstreamOutput;
            return this;
        }
        public String getUpstreamOutput() {
            return this.upstreamOutput;
        }

        public GetTaskResponseBodyTaskDependencies setUpstreamTaskId(String upstreamTaskId) {
            this.upstreamTaskId = upstreamTaskId;
            return this;
        }
        public String getUpstreamTaskId() {
            return this.upstreamTaskId;
        }

    }

    public static class GetTaskResponseBodyTaskInputsVariables extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static GetTaskResponseBodyTaskInputsVariables build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskInputsVariables self = new GetTaskResponseBodyTaskInputsVariables();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskInputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskResponseBodyTaskInputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskResponseBodyTaskInputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTaskResponseBodyTaskInputs extends TeaModel {
        @NameInMap("Variables")
        public java.util.List<GetTaskResponseBodyTaskInputsVariables> variables;

        public static GetTaskResponseBodyTaskInputs build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskInputs self = new GetTaskResponseBodyTaskInputs();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskInputs setVariables(java.util.List<GetTaskResponseBodyTaskInputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskInputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class GetTaskResponseBodyTaskOutputsTaskOutputs extends TeaModel {
        @NameInMap("Output")
        public String output;

        public static GetTaskResponseBodyTaskOutputsTaskOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskOutputsTaskOutputs self = new GetTaskResponseBodyTaskOutputsTaskOutputs();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskOutputsTaskOutputs setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class GetTaskResponseBodyTaskOutputsVariables extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static GetTaskResponseBodyTaskOutputsVariables build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskOutputsVariables self = new GetTaskResponseBodyTaskOutputsVariables();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskOutputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskResponseBodyTaskOutputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskResponseBodyTaskOutputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTaskResponseBodyTaskOutputs extends TeaModel {
        @NameInMap("TaskOutputs")
        public java.util.List<GetTaskResponseBodyTaskOutputsTaskOutputs> taskOutputs;

        @NameInMap("Variables")
        public java.util.List<GetTaskResponseBodyTaskOutputsVariables> variables;

        public static GetTaskResponseBodyTaskOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskOutputs self = new GetTaskResponseBodyTaskOutputs();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskOutputs setTaskOutputs(java.util.List<GetTaskResponseBodyTaskOutputsTaskOutputs> taskOutputs) {
            this.taskOutputs = taskOutputs;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskOutputsTaskOutputs> getTaskOutputs() {
            return this.taskOutputs;
        }

        public GetTaskResponseBodyTaskOutputs setVariables(java.util.List<GetTaskResponseBodyTaskOutputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskOutputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class GetTaskResponseBodyTaskRuntimeResource extends TeaModel {
        @NameInMap("Cu")
        public String cu;

        @NameInMap("Image")
        public String image;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static GetTaskResponseBodyTaskRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskRuntimeResource self = new GetTaskResponseBodyTaskRuntimeResource();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public GetTaskResponseBodyTaskRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetTaskResponseBodyTaskRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class GetTaskResponseBodyTaskScript extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Parameters")
        public String parameters;

        public static GetTaskResponseBodyTaskScript build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskScript self = new GetTaskResponseBodyTaskScript();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskScript setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTaskResponseBodyTaskScript setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

    }

    public static class GetTaskResponseBodyTaskSubTasksSubTasksDataSource extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static GetTaskResponseBodyTaskSubTasksSubTasksDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskSubTasksSubTasksDataSource self = new GetTaskResponseBodyTaskSubTasksSubTasksDataSource();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource extends TeaModel {
        @NameInMap("Cu")
        public String cu;

        @NameInMap("Image")
        public String image;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource self = new GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class GetTaskResponseBodyTaskSubTasksSubTasksTrigger extends TeaModel {
        @NameInMap("Cron")
        public String cron;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Recurrence")
        public String recurrence;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Type")
        public String type;

        public static GetTaskResponseBodyTaskSubTasksSubTasksTrigger build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskSubTasksSubTasksTrigger self = new GetTaskResponseBodyTaskSubTasksSubTasksTrigger();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksTrigger setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTaskResponseBodyTaskSubTasksSubTasks extends TeaModel {
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DataSource")
        public GetTaskResponseBodyTaskSubTasksSubTasksDataSource dataSource;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("RerunInterval")
        public Integer rerunInterval;

        @NameInMap("RerunMode")
        public String rerunMode;

        @NameInMap("RerunTimes")
        public Integer rerunTimes;

        @NameInMap("RuntimeResource")
        public GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource runtimeResource;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("Trigger")
        public GetTaskResponseBodyTaskSubTasksSubTasksTrigger trigger;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkflowId")
        public Long workflowId;

        public static GetTaskResponseBodyTaskSubTasksSubTasks build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskSubTasksSubTasks self = new GetTaskResponseBodyTaskSubTasksSubTasks();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setDataSource(GetTaskResponseBodyTaskSubTasksSubTasksDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public GetTaskResponseBodyTaskSubTasksSubTasksDataSource getDataSource() {
            return this.dataSource;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setRerunInterval(Integer rerunInterval) {
            this.rerunInterval = rerunInterval;
            return this;
        }
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setRerunTimes(Integer rerunTimes) {
            this.rerunTimes = rerunTimes;
            return this;
        }
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setRuntimeResource(GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setTrigger(GetTaskResponseBodyTaskSubTasksSubTasksTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public GetTaskResponseBodyTaskSubTasksSubTasksTrigger getTrigger() {
            return this.trigger;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class GetTaskResponseBodyTaskSubTasks extends TeaModel {
        @NameInMap("SubTasks")
        public java.util.List<GetTaskResponseBodyTaskSubTasksSubTasks> subTasks;

        @NameInMap("Type")
        public String type;

        public static GetTaskResponseBodyTaskSubTasks build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskSubTasks self = new GetTaskResponseBodyTaskSubTasks();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskSubTasks setSubTasks(java.util.List<GetTaskResponseBodyTaskSubTasksSubTasks> subTasks) {
            this.subTasks = subTasks;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskSubTasksSubTasks> getSubTasks() {
            return this.subTasks;
        }

        public GetTaskResponseBodyTaskSubTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTaskResponseBodyTaskTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetTaskResponseBodyTaskTags build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskTags self = new GetTaskResponseBodyTaskTags();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTaskResponseBodyTaskTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTaskResponseBodyTaskTrigger extends TeaModel {
        @NameInMap("Cron")
        public String cron;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Recurrence")
        public String recurrence;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Type")
        public String type;

        public static GetTaskResponseBodyTaskTrigger build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskTrigger self = new GetTaskResponseBodyTaskTrigger();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public GetTaskResponseBodyTaskTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetTaskResponseBodyTaskTrigger setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public GetTaskResponseBodyTaskTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetTaskResponseBodyTaskTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTaskResponseBodyTask extends TeaModel {
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DataSource")
        public GetTaskResponseBodyTaskDataSource dataSource;

        @NameInMap("Dependencies")
        public java.util.List<GetTaskResponseBodyTaskDependencies> dependencies;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Inputs")
        public GetTaskResponseBodyTaskInputs inputs;

        @NameInMap("InstanceMode")
        public String instanceMode;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Name")
        public String name;

        @NameInMap("Outputs")
        public GetTaskResponseBodyTaskOutputs outputs;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("RerunInterval")
        public Integer rerunInterval;

        @NameInMap("RerunMode")
        public String rerunMode;

        @NameInMap("RerunTimes")
        public Integer rerunTimes;

        @NameInMap("RuntimeResource")
        public GetTaskResponseBodyTaskRuntimeResource runtimeResource;

        @NameInMap("Script")
        public GetTaskResponseBodyTaskScript script;

        @NameInMap("SubTasks")
        public GetTaskResponseBodyTaskSubTasks subTasks;

        @NameInMap("Tags")
        public java.util.List<GetTaskResponseBodyTaskTags> tags;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("Trigger")
        public GetTaskResponseBodyTaskTrigger trigger;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkflowId")
        public Long workflowId;

        public static GetTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTask self = new GetTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTask setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetTaskResponseBodyTask setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTaskResponseBodyTask setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetTaskResponseBodyTask setDataSource(GetTaskResponseBodyTaskDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public GetTaskResponseBodyTaskDataSource getDataSource() {
            return this.dataSource;
        }

        public GetTaskResponseBodyTask setDependencies(java.util.List<GetTaskResponseBodyTaskDependencies> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskDependencies> getDependencies() {
            return this.dependencies;
        }

        public GetTaskResponseBodyTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTaskResponseBodyTask setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetTaskResponseBodyTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetTaskResponseBodyTask setInputs(GetTaskResponseBodyTaskInputs inputs) {
            this.inputs = inputs;
            return this;
        }
        public GetTaskResponseBodyTaskInputs getInputs() {
            return this.inputs;
        }

        public GetTaskResponseBodyTask setInstanceMode(String instanceMode) {
            this.instanceMode = instanceMode;
            return this;
        }
        public String getInstanceMode() {
            return this.instanceMode;
        }

        public GetTaskResponseBodyTask setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetTaskResponseBodyTask setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetTaskResponseBodyTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskResponseBodyTask setOutputs(GetTaskResponseBodyTaskOutputs outputs) {
            this.outputs = outputs;
            return this;
        }
        public GetTaskResponseBodyTaskOutputs getOutputs() {
            return this.outputs;
        }

        public GetTaskResponseBodyTask setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTaskResponseBodyTask setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetTaskResponseBodyTask setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetTaskResponseBodyTask setRerunInterval(Integer rerunInterval) {
            this.rerunInterval = rerunInterval;
            return this;
        }
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        public GetTaskResponseBodyTask setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public GetTaskResponseBodyTask setRerunTimes(Integer rerunTimes) {
            this.rerunTimes = rerunTimes;
            return this;
        }
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        public GetTaskResponseBodyTask setRuntimeResource(GetTaskResponseBodyTaskRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public GetTaskResponseBodyTaskRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public GetTaskResponseBodyTask setScript(GetTaskResponseBodyTaskScript script) {
            this.script = script;
            return this;
        }
        public GetTaskResponseBodyTaskScript getScript() {
            return this.script;
        }

        public GetTaskResponseBodyTask setSubTasks(GetTaskResponseBodyTaskSubTasks subTasks) {
            this.subTasks = subTasks;
            return this;
        }
        public GetTaskResponseBodyTaskSubTasks getSubTasks() {
            return this.subTasks;
        }

        public GetTaskResponseBodyTask setTags(java.util.List<GetTaskResponseBodyTaskTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskTags> getTags() {
            return this.tags;
        }

        public GetTaskResponseBodyTask setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetTaskResponseBodyTask setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetTaskResponseBodyTask setTrigger(GetTaskResponseBodyTaskTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public GetTaskResponseBodyTaskTrigger getTrigger() {
            return this.trigger;
        }

        public GetTaskResponseBodyTask setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskResponseBodyTask setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

}
