// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetWorkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Workflow")
    public GetWorkflowResponseBodyWorkflow workflow;

    public static GetWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowResponseBody self = new GetWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowResponseBody setWorkflow(GetWorkflowResponseBodyWorkflow workflow) {
        this.workflow = workflow;
        return this;
    }
    public GetWorkflowResponseBodyWorkflow getWorkflow() {
        return this.workflow;
    }

    public static class GetWorkflowResponseBodyWorkflowDependencies extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("UpstreamOutput")
        public String upstreamOutput;

        @NameInMap("UpstreamTaskId")
        public Long upstreamTaskId;

        public static GetWorkflowResponseBodyWorkflowDependencies build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowDependencies self = new GetWorkflowResponseBodyWorkflowDependencies();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowDependencies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWorkflowResponseBodyWorkflowDependencies setUpstreamOutput(String upstreamOutput) {
            this.upstreamOutput = upstreamOutput;
            return this;
        }
        public String getUpstreamOutput() {
            return this.upstreamOutput;
        }

        public GetWorkflowResponseBodyWorkflowDependencies setUpstreamTaskId(Long upstreamTaskId) {
            this.upstreamTaskId = upstreamTaskId;
            return this;
        }
        public Long getUpstreamTaskId() {
            return this.upstreamTaskId;
        }

    }

    public static class GetWorkflowResponseBodyWorkflowOutputsTaskOutputs extends TeaModel {
        @NameInMap("Output")
        public String output;

        public static GetWorkflowResponseBodyWorkflowOutputsTaskOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowOutputsTaskOutputs self = new GetWorkflowResponseBodyWorkflowOutputsTaskOutputs();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowOutputsTaskOutputs setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class GetWorkflowResponseBodyWorkflowOutputs extends TeaModel {
        @NameInMap("TaskOutputs")
        public java.util.List<GetWorkflowResponseBodyWorkflowOutputsTaskOutputs> taskOutputs;

        public static GetWorkflowResponseBodyWorkflowOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowOutputs self = new GetWorkflowResponseBodyWorkflowOutputs();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowOutputs setTaskOutputs(java.util.List<GetWorkflowResponseBodyWorkflowOutputsTaskOutputs> taskOutputs) {
            this.taskOutputs = taskOutputs;
            return this;
        }
        public java.util.List<GetWorkflowResponseBodyWorkflowOutputsTaskOutputs> getTaskOutputs() {
            return this.taskOutputs;
        }

    }

    public static class GetWorkflowResponseBodyWorkflowTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetWorkflowResponseBodyWorkflowTags build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowTags self = new GetWorkflowResponseBodyWorkflowTags();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetWorkflowResponseBodyWorkflowTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetWorkflowResponseBodyWorkflowTasksDataSource extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static GetWorkflowResponseBodyWorkflowTasksDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowTasksDataSource self = new GetWorkflowResponseBodyWorkflowTasksDataSource();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowTasksDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetWorkflowResponseBodyWorkflowTasksRuntimeResource extends TeaModel {
        @NameInMap("Cu")
        public String cu;

        @NameInMap("Image")
        public String image;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static GetWorkflowResponseBodyWorkflowTasksRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowTasksRuntimeResource self = new GetWorkflowResponseBodyWorkflowTasksRuntimeResource();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowTasksRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public GetWorkflowResponseBodyWorkflowTasksRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetWorkflowResponseBodyWorkflowTasksRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class GetWorkflowResponseBodyWorkflowTasks extends TeaModel {
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("ClientUniqueCode")
        public String clientUniqueCode;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DataSource")
        public GetWorkflowResponseBodyWorkflowTasksDataSource dataSource;

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
        public GetWorkflowResponseBodyWorkflowTasksRuntimeResource runtimeResource;

        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("TriggerRecurrence")
        public String triggerRecurrence;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkflowId")
        public Long workflowId;

        public static GetWorkflowResponseBodyWorkflowTasks build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowTasks self = new GetWorkflowResponseBodyWorkflowTasks();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowTasks setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetWorkflowResponseBodyWorkflowTasks setClientUniqueCode(String clientUniqueCode) {
            this.clientUniqueCode = clientUniqueCode;
            return this;
        }
        public String getClientUniqueCode() {
            return this.clientUniqueCode;
        }

        public GetWorkflowResponseBodyWorkflowTasks setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetWorkflowResponseBodyWorkflowTasks setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetWorkflowResponseBodyWorkflowTasks setDataSource(GetWorkflowResponseBodyWorkflowTasksDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public GetWorkflowResponseBodyWorkflowTasksDataSource getDataSource() {
            return this.dataSource;
        }

        public GetWorkflowResponseBodyWorkflowTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkflowResponseBodyWorkflowTasks setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetWorkflowResponseBodyWorkflowTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetWorkflowResponseBodyWorkflowTasks setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetWorkflowResponseBodyWorkflowTasks setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetWorkflowResponseBodyWorkflowTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowResponseBodyWorkflowTasks setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetWorkflowResponseBodyWorkflowTasks setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetWorkflowResponseBodyWorkflowTasks setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetWorkflowResponseBodyWorkflowTasks setRerunInterval(Integer rerunInterval) {
            this.rerunInterval = rerunInterval;
            return this;
        }
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        public GetWorkflowResponseBodyWorkflowTasks setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public GetWorkflowResponseBodyWorkflowTasks setRerunTimes(Integer rerunTimes) {
            this.rerunTimes = rerunTimes;
            return this;
        }
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        public GetWorkflowResponseBodyWorkflowTasks setRuntimeResource(GetWorkflowResponseBodyWorkflowTasksRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public GetWorkflowResponseBodyWorkflowTasksRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public GetWorkflowResponseBodyWorkflowTasks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetWorkflowResponseBodyWorkflowTasks setTriggerRecurrence(String triggerRecurrence) {
            this.triggerRecurrence = triggerRecurrence;
            return this;
        }
        public String getTriggerRecurrence() {
            return this.triggerRecurrence;
        }

        public GetWorkflowResponseBodyWorkflowTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWorkflowResponseBodyWorkflowTasks setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class GetWorkflowResponseBodyWorkflowTrigger extends TeaModel {
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

        public static GetWorkflowResponseBodyWorkflowTrigger build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowTrigger self = new GetWorkflowResponseBodyWorkflowTrigger();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public GetWorkflowResponseBodyWorkflowTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetWorkflowResponseBodyWorkflowTrigger setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public GetWorkflowResponseBodyWorkflowTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetWorkflowResponseBodyWorkflowTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetWorkflowResponseBodyWorkflow extends TeaModel {
        @NameInMap("ClientUniqueCode")
        public String clientUniqueCode;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("Dependencies")
        public java.util.List<GetWorkflowResponseBodyWorkflowDependencies> dependencies;

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

        @NameInMap("Outputs")
        public GetWorkflowResponseBodyWorkflowOutputs outputs;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Parameters")
        public String parameters;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Tags")
        public java.util.List<GetWorkflowResponseBodyWorkflowTags> tags;

        @NameInMap("Tasks")
        public java.util.List<GetWorkflowResponseBodyWorkflowTasks> tasks;

        @NameInMap("Trigger")
        public GetWorkflowResponseBodyWorkflowTrigger trigger;

        public static GetWorkflowResponseBodyWorkflow build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflow self = new GetWorkflowResponseBodyWorkflow();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflow setClientUniqueCode(String clientUniqueCode) {
            this.clientUniqueCode = clientUniqueCode;
            return this;
        }
        public String getClientUniqueCode() {
            return this.clientUniqueCode;
        }

        public GetWorkflowResponseBodyWorkflow setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetWorkflowResponseBodyWorkflow setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetWorkflowResponseBodyWorkflow setDependencies(java.util.List<GetWorkflowResponseBodyWorkflowDependencies> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public java.util.List<GetWorkflowResponseBodyWorkflowDependencies> getDependencies() {
            return this.dependencies;
        }

        public GetWorkflowResponseBodyWorkflow setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkflowResponseBodyWorkflow setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetWorkflowResponseBodyWorkflow setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetWorkflowResponseBodyWorkflow setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetWorkflowResponseBodyWorkflow setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetWorkflowResponseBodyWorkflow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowResponseBodyWorkflow setOutputs(GetWorkflowResponseBodyWorkflowOutputs outputs) {
            this.outputs = outputs;
            return this;
        }
        public GetWorkflowResponseBodyWorkflowOutputs getOutputs() {
            return this.outputs;
        }

        public GetWorkflowResponseBodyWorkflow setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetWorkflowResponseBodyWorkflow setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public GetWorkflowResponseBodyWorkflow setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetWorkflowResponseBodyWorkflow setTags(java.util.List<GetWorkflowResponseBodyWorkflowTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetWorkflowResponseBodyWorkflowTags> getTags() {
            return this.tags;
        }

        public GetWorkflowResponseBodyWorkflow setTasks(java.util.List<GetWorkflowResponseBodyWorkflowTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<GetWorkflowResponseBodyWorkflowTasks> getTasks() {
            return this.tasks;
        }

        public GetWorkflowResponseBodyWorkflow setTrigger(GetWorkflowResponseBodyWorkflowTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public GetWorkflowResponseBodyWorkflowTrigger getTrigger() {
            return this.trigger;
        }

    }

}
