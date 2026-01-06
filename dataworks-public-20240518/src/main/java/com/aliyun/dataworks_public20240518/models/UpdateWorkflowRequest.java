// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateWorkflowRequest extends TeaModel {
    /**
     * <p>The unique code of the client. This parameter is used to create a workflow asynchronously and implement the idempotence of the workflow. If you do not specify this parameter when you create the workflow, the system automatically generates a unique code. The unique code is uniquely associated with the workflow ID. If you specify this parameter when you update or delete the workflow, the value of this parameter must be the unique code that is used to create the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>Workflow_0bc5213917368545132902xxxxxxxx</p>
     */
    @NameInMap("ClientUniqueCode")
    public String clientUniqueCode;

    /**
     * <p>The dependency information.</p>
     */
    @NameInMap("Dependencies")
    public java.util.List<UpdateWorkflowRequestDependencies> dependencies;

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
     * <ul>
     * <li>Prod</li>
     * <li>Dev</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The workflow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The instance generation mode.</p>
     * <ul>
     * <li>T+1: the next day</li>
     * <li>Immediately Note: Periodic instances will only be generated normally if the workflow\&quot;s scheduled time is more than 10 minutes after the workflow publication time. Real-time instance generation is not available during the batch instance generation period (23:30 to 24:00). While workflows can be published during this time, instances will not be regenerated immediately after submission.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T+1</p>
     */
    @NameInMap("InstanceMode")
    public String instanceMode;

    /**
     * <p>The name of the workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>My Workflow</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output information.</p>
     */
    @NameInMap("Outputs")
    public UpdateWorkflowRequestOutputs outputs;

    /**
     * <p>The account ID of the owner.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>para1=$bizdate para2=$[yyyymmdd]</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<UpdateWorkflowRequestTags> tags;

    /**
     * <p>Details about tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<UpdateWorkflowRequestTasks> tasks;

    /**
     * <p>The trigger method.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Trigger")
    public UpdateWorkflowRequestTrigger trigger;

    public static UpdateWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowRequest self = new UpdateWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowRequest setClientUniqueCode(String clientUniqueCode) {
        this.clientUniqueCode = clientUniqueCode;
        return this;
    }
    public String getClientUniqueCode() {
        return this.clientUniqueCode;
    }

    public UpdateWorkflowRequest setDependencies(java.util.List<UpdateWorkflowRequestDependencies> dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public java.util.List<UpdateWorkflowRequestDependencies> getDependencies() {
        return this.dependencies;
    }

    public UpdateWorkflowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWorkflowRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public UpdateWorkflowRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateWorkflowRequest setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
        return this;
    }
    public String getInstanceMode() {
        return this.instanceMode;
    }

    public UpdateWorkflowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWorkflowRequest setOutputs(UpdateWorkflowRequestOutputs outputs) {
        this.outputs = outputs;
        return this;
    }
    public UpdateWorkflowRequestOutputs getOutputs() {
        return this.outputs;
    }

    public UpdateWorkflowRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateWorkflowRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public UpdateWorkflowRequest setTags(java.util.List<UpdateWorkflowRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdateWorkflowRequestTags> getTags() {
        return this.tags;
    }

    public UpdateWorkflowRequest setTasks(java.util.List<UpdateWorkflowRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<UpdateWorkflowRequestTasks> getTasks() {
        return this.tasks;
    }

    public UpdateWorkflowRequest setTrigger(UpdateWorkflowRequestTrigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public UpdateWorkflowRequestTrigger getTrigger() {
        return this.trigger;
    }

    public static class UpdateWorkflowRequestDependencies extends TeaModel {
        /**
         * <p>The dependency type. Valid values:</p>
         * <ul>
         * <li>CrossCycleDependsOnChildren: Depends on level-1 downstream nodes across cycles</li>
         * <li>CrossCycleDependsOnSelf: Depends on itself across cycles.</li>
         * <li>CrossCycleDependsOnOtherNode: Depends on other nodes across cycles.</li>
         * <li>Normal: Depends on nodes in the same cycle.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The output identifier of the upstream task. (This parameter is returned only if <code>Normal</code> is set and the node input is configured.)</p>
         * 
         * <strong>example:</strong>
         * <p>pre.odps_sql_demo_0</p>
         */
        @NameInMap("UpstreamOutput")
        public String upstreamOutput;

        /**
         * <p>The ID of the upstream task. (This parameter is returned only if <code>Normal</code> or <code>CrossCycleDependsOnOtherNode</code> is set and the node input is not configured.)</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("UpstreamTaskId")
        public Long upstreamTaskId;

        public static UpdateWorkflowRequestDependencies build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestDependencies self = new UpdateWorkflowRequestDependencies();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestDependencies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateWorkflowRequestDependencies setUpstreamOutput(String upstreamOutput) {
            this.upstreamOutput = upstreamOutput;
            return this;
        }
        public String getUpstreamOutput() {
            return this.upstreamOutput;
        }

        public UpdateWorkflowRequestDependencies setUpstreamTaskId(Long upstreamTaskId) {
            this.upstreamTaskId = upstreamTaskId;
            return this;
        }
        public Long getUpstreamTaskId() {
            return this.upstreamTaskId;
        }

    }

    public static class UpdateWorkflowRequestOutputsTaskOutputs extends TeaModel {
        /**
         * <p>The identifier of the output.</p>
         * 
         * <strong>example:</strong>
         * <p>pre.odps_sql_demo_0</p>
         */
        @NameInMap("Output")
        public String output;

        public static UpdateWorkflowRequestOutputsTaskOutputs build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestOutputsTaskOutputs self = new UpdateWorkflowRequestOutputsTaskOutputs();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestOutputsTaskOutputs setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class UpdateWorkflowRequestOutputs extends TeaModel {
        /**
         * <p>The task outputs.</p>
         */
        @NameInMap("TaskOutputs")
        public java.util.List<UpdateWorkflowRequestOutputsTaskOutputs> taskOutputs;

        public static UpdateWorkflowRequestOutputs build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestOutputs self = new UpdateWorkflowRequestOutputs();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestOutputs setTaskOutputs(java.util.List<UpdateWorkflowRequestOutputsTaskOutputs> taskOutputs) {
            this.taskOutputs = taskOutputs;
            return this;
        }
        public java.util.List<UpdateWorkflowRequestOutputsTaskOutputs> getTaskOutputs() {
            return this.taskOutputs;
        }

    }

    public static class UpdateWorkflowRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>This parameter is required.</p>
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

        public static UpdateWorkflowRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestTags self = new UpdateWorkflowRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateWorkflowRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateWorkflowRequestTasksDataSource extends TeaModel {
        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateWorkflowRequestTasksDataSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestTasksDataSource self = new UpdateWorkflowRequestTasksDataSource();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestTasksDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateWorkflowRequestTasksDependencies extends TeaModel {
        /**
         * <p>The dependency type. Valid values:</p>
         * <ul>
         * <li>CrossCycleDependsOnChildren: Depends on level-1 downstream nodes across cycles</li>
         * <li>CrossCycleDependsOnSelf: Depends on itself across cycles.</li>
         * <li>CrossCycleDependsOnOtherNode: Depends on other nodes across cycles.</li>
         * <li>Normal: Depends on nodes in the same cycle.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The output identifier of the upstream task. (This parameter is returned only if <code>Normal</code> is set and the node input is configured.)</p>
         * 
         * <strong>example:</strong>
         * <p>pre.odps_sql_demo_0</p>
         */
        @NameInMap("UpstreamOutput")
        public String upstreamOutput;

        /**
         * <p>The ID of the upstream task. (This parameter is returned only if <code>Normal</code> or <code>CrossCycleDependsOnOtherNode</code> is set and the node input is not configured.)</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("UpstreamTaskId")
        public Long upstreamTaskId;

        public static UpdateWorkflowRequestTasksDependencies build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestTasksDependencies self = new UpdateWorkflowRequestTasksDependencies();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestTasksDependencies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateWorkflowRequestTasksDependencies setUpstreamOutput(String upstreamOutput) {
            this.upstreamOutput = upstreamOutput;
            return this;
        }
        public String getUpstreamOutput() {
            return this.upstreamOutput;
        }

        public UpdateWorkflowRequestTasksDependencies setUpstreamTaskId(Long upstreamTaskId) {
            this.upstreamTaskId = upstreamTaskId;
            return this;
        }
        public Long getUpstreamTaskId() {
            return this.upstreamTaskId;
        }

    }

    public static class UpdateWorkflowRequestTasksInputsVariables extends TeaModel {
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
         * <li>Constant: constant value.</li>
         * <li>PassThrough: node output.</li>
         * <li>System: variable.</li>
         * <li>NodeOutput: script output.</li>
         * </ul>
         * <p>This parameter is required.</p>
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

        public static UpdateWorkflowRequestTasksInputsVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestTasksInputsVariables self = new UpdateWorkflowRequestTasksInputsVariables();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestTasksInputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWorkflowRequestTasksInputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateWorkflowRequestTasksInputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateWorkflowRequestTasksInputs extends TeaModel {
        /**
         * <p>The variables. By default, the settings of all input variables are deleted if this parameter is set to null or not specified.</p>
         */
        @NameInMap("Variables")
        public java.util.List<UpdateWorkflowRequestTasksInputsVariables> variables;

        public static UpdateWorkflowRequestTasksInputs build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestTasksInputs self = new UpdateWorkflowRequestTasksInputs();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestTasksInputs setVariables(java.util.List<UpdateWorkflowRequestTasksInputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<UpdateWorkflowRequestTasksInputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class UpdateWorkflowRequestTasksOutputsTaskOutputs extends TeaModel {
        /**
         * <p>The identifier of the output.</p>
         * 
         * <strong>example:</strong>
         * <p>pre.odps_sql_demo_0</p>
         */
        @NameInMap("Output")
        public String output;

        public static UpdateWorkflowRequestTasksOutputsTaskOutputs build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestTasksOutputsTaskOutputs self = new UpdateWorkflowRequestTasksOutputsTaskOutputs();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestTasksOutputsTaskOutputs setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class UpdateWorkflowRequestTasksOutputsVariables extends TeaModel {
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
         * <li>Constant: constant value.</li>
         * <li>PassThrough: node output.</li>
         * <li>System: variable.</li>
         * <li>NodeOutput: script output.</li>
         * </ul>
         * <p>This parameter is required.</p>
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

        public static UpdateWorkflowRequestTasksOutputsVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestTasksOutputsVariables self = new UpdateWorkflowRequestTasksOutputsVariables();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestTasksOutputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWorkflowRequestTasksOutputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateWorkflowRequestTasksOutputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateWorkflowRequestTasksOutputs extends TeaModel {
        /**
         * <p>The task outputs. By default, all task output information is deleted if this parameter is set to null or not specified.</p>
         */
        @NameInMap("TaskOutputs")
        public java.util.List<UpdateWorkflowRequestTasksOutputsTaskOutputs> taskOutputs;

        /**
         * <p>The variables. Note: The settings of all output variables are deleted if this parameter is set to null or not specified.</p>
         */
        @NameInMap("Variables")
        public java.util.List<UpdateWorkflowRequestTasksOutputsVariables> variables;

        public static UpdateWorkflowRequestTasksOutputs build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestTasksOutputs self = new UpdateWorkflowRequestTasksOutputs();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestTasksOutputs setTaskOutputs(java.util.List<UpdateWorkflowRequestTasksOutputsTaskOutputs> taskOutputs) {
            this.taskOutputs = taskOutputs;
            return this;
        }
        public java.util.List<UpdateWorkflowRequestTasksOutputsTaskOutputs> getTaskOutputs() {
            return this.taskOutputs;
        }

        public UpdateWorkflowRequestTasksOutputs setVariables(java.util.List<UpdateWorkflowRequestTasksOutputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<UpdateWorkflowRequestTasksOutputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class UpdateWorkflowRequestTasksRuntimeResource extends TeaModel {
        /**
         * <p>The default number of compute units (CUs) configured for task running.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public String cu;

        /**
         * <p>The image ID used in the task runtime configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxxx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The identifier of the scheduling resource group used in the task runtime configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static UpdateWorkflowRequestTasksRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestTasksRuntimeResource self = new UpdateWorkflowRequestTasksRuntimeResource();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestTasksRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public UpdateWorkflowRequestTasksRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public UpdateWorkflowRequestTasksRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class UpdateWorkflowRequestTasksScript extends TeaModel {
        /**
         * <p>The script content.</p>
         * 
         * <strong>example:</strong>
         * <p>echo &quot;helloWorld&quot;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The script parameter list.</p>
         * 
         * <strong>example:</strong>
         * <p>para1=$bizdate</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        public static UpdateWorkflowRequestTasksScript build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestTasksScript self = new UpdateWorkflowRequestTasksScript();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestTasksScript setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateWorkflowRequestTasksScript setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

    }

    public static class UpdateWorkflowRequestTasksTags extends TeaModel {
        /**
         * <p>The key of a tag.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of a tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateWorkflowRequestTasksTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestTasksTags self = new UpdateWorkflowRequestTasksTags();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestTasksTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateWorkflowRequestTasksTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateWorkflowRequestTasksTrigger extends TeaModel {
        /**
         * <p>The running mode of the task after it is triggered. This parameter takes effect only if the Type parameter is set to Scheduler. Valid values:</p>
         * <ul>
         * <li>Pause</li>
         * <li>Skip</li>
         * <li>Normal</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Recurrence")
        public String recurrence;

        /**
         * <p>The trigger type. Valid values:</p>
         * <ul>
         * <li>Scheduler: periodically triggered</li>
         * <li>Manual</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateWorkflowRequestTasksTrigger build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestTasksTrigger self = new UpdateWorkflowRequestTasksTrigger();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestTasksTrigger setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public UpdateWorkflowRequestTasksTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateWorkflowRequestTasks extends TeaModel {
        /**
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("BaseLineId")
        public Long baseLineId;

        /**
         * <p>The client-side unique token for the task, used to ensure asynchronous processing and idempotency. If not specified during creation, the system will automatically generate one. This token is uniquely associated with the resource ID. If provided when updating or deleting resources, this parameter must match the client token used during creation.</p>
         * 
         * <strong>example:</strong>
         * <p>Task_0bc5213917368545132902xxxxxxxx</p>
         */
        @NameInMap("ClientUniqueCode")
        public String clientUniqueCode;

        /**
         * <p>The information about the associated data source.</p>
         */
        @NameInMap("DataSource")
        public UpdateWorkflowRequestTasksDataSource dataSource;

        /**
         * <p>The dependency information. Note: If this parameter is left empty or set to an empty array, all dependency configurations will be deleted.</p>
         */
        @NameInMap("Dependencies")
        public java.util.List<UpdateWorkflowRequestTasksDependencies> dependencies;

        /**
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The project environment.</p>
         * <ul>
         * <li>Prod</li>
         * <li>Dev</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The ID of the task. Specifying this field triggers a full update for the corresponding task. If left unspecified, a new task will be created.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The input information. By default, all input information is deleted if this parameter is set to null.</p>
         */
        @NameInMap("Inputs")
        public UpdateWorkflowRequestTasksInputs inputs;

        /**
         * <p>The name of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL node</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output information. By default, all output information is deleted if this parameter is set to null.</p>
         */
        @NameInMap("Outputs")
        public UpdateWorkflowRequestTasksOutputs outputs;

        /**
         * <p>The account ID of the owner.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The retry interval in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RerunInterval")
        public Integer rerunInterval;

        /**
         * <p>Configuration for whether the task can be rerun.</p>
         * <ul>
         * <li>AllDenied: The task cannot be rerun.</li>
         * <li>FailureAllowed: The task can be rerun only after it fails.</li>
         * <li>AllAllowed: The task can always be rerun.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AllAllowed</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>The number of retry attempts. Takes effect when the task is configured to allow reruns.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RerunTimes")
        public Integer rerunTimes;

        /**
         * <p>Runtime environment configurations, such as resource group information.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuntimeResource")
        public UpdateWorkflowRequestTasksRuntimeResource runtimeResource;

        /**
         * <p>The run script information.</p>
         */
        @NameInMap("Script")
        public UpdateWorkflowRequestTasksScript script;

        /**
         * <p>The list of task tags. Note: If this field is unspecified or set to an empty array, all existing Tag configurations will be deleted by default.</p>
         */
        @NameInMap("Tags")
        public java.util.List<UpdateWorkflowRequestTasksTags> tags;

        /**
         * <p>The task execution timeout in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The trigger method.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Trigger")
        public UpdateWorkflowRequestTasksTrigger trigger;

        /**
         * <p>The type of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateWorkflowRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestTasks self = new UpdateWorkflowRequestTasks();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestTasks setBaseLineId(Long baseLineId) {
            this.baseLineId = baseLineId;
            return this;
        }
        public Long getBaseLineId() {
            return this.baseLineId;
        }

        public UpdateWorkflowRequestTasks setClientUniqueCode(String clientUniqueCode) {
            this.clientUniqueCode = clientUniqueCode;
            return this;
        }
        public String getClientUniqueCode() {
            return this.clientUniqueCode;
        }

        public UpdateWorkflowRequestTasks setDataSource(UpdateWorkflowRequestTasksDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public UpdateWorkflowRequestTasksDataSource getDataSource() {
            return this.dataSource;
        }

        public UpdateWorkflowRequestTasks setDependencies(java.util.List<UpdateWorkflowRequestTasksDependencies> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public java.util.List<UpdateWorkflowRequestTasksDependencies> getDependencies() {
            return this.dependencies;
        }

        public UpdateWorkflowRequestTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateWorkflowRequestTasks setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public UpdateWorkflowRequestTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateWorkflowRequestTasks setInputs(UpdateWorkflowRequestTasksInputs inputs) {
            this.inputs = inputs;
            return this;
        }
        public UpdateWorkflowRequestTasksInputs getInputs() {
            return this.inputs;
        }

        public UpdateWorkflowRequestTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWorkflowRequestTasks setOutputs(UpdateWorkflowRequestTasksOutputs outputs) {
            this.outputs = outputs;
            return this;
        }
        public UpdateWorkflowRequestTasksOutputs getOutputs() {
            return this.outputs;
        }

        public UpdateWorkflowRequestTasks setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public UpdateWorkflowRequestTasks setRerunInterval(Integer rerunInterval) {
            this.rerunInterval = rerunInterval;
            return this;
        }
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        public UpdateWorkflowRequestTasks setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public UpdateWorkflowRequestTasks setRerunTimes(Integer rerunTimes) {
            this.rerunTimes = rerunTimes;
            return this;
        }
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        public UpdateWorkflowRequestTasks setRuntimeResource(UpdateWorkflowRequestTasksRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public UpdateWorkflowRequestTasksRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public UpdateWorkflowRequestTasks setScript(UpdateWorkflowRequestTasksScript script) {
            this.script = script;
            return this;
        }
        public UpdateWorkflowRequestTasksScript getScript() {
            return this.script;
        }

        public UpdateWorkflowRequestTasks setTags(java.util.List<UpdateWorkflowRequestTasksTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<UpdateWorkflowRequestTasksTags> getTags() {
            return this.tags;
        }

        public UpdateWorkflowRequestTasks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public UpdateWorkflowRequestTasks setTrigger(UpdateWorkflowRequestTasksTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public UpdateWorkflowRequestTasksTrigger getTrigger() {
            return this.trigger;
        }

        public UpdateWorkflowRequestTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateWorkflowRequestTrigger extends TeaModel {
        /**
         * <p>The Cron expression. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The expiration time of periodic triggering. Takes effect only when type is set to Scheduler. The value of this parameter is in the<code>yyyy-mm-dd hh:mm:ss</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>9999-01-01 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The time when periodic triggering takes effect. This parameter takes effect only if the Type parameter is set to Scheduler. The value of this parameter is in the<code>yyyy-mm-dd hh:mm:ss</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>1970-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The trigger type. Valid values:</p>
         * <ul>
         * <li>Scheduler: periodically triggered</li>
         * <li>Manual</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateWorkflowRequestTrigger build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowRequestTrigger self = new UpdateWorkflowRequestTrigger();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowRequestTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public UpdateWorkflowRequestTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateWorkflowRequestTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public UpdateWorkflowRequestTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
