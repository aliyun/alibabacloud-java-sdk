// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateTaskRequest extends TeaModel {
    /**
     * <p>The unique code of the client. This code uniquely identifies a task. This parameter is used to create a task asynchronously and implement the idempotence of the task. If you do not specify this parameter when you create the task, the system automatically generates a unique code. The unique code is uniquely associated with the task ID. If you specify this parameter when you update or delete the task, the value of this parameter must be the unique code that is used to create the task.</p>
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
    public UpdateTaskRequestDataSource dataSource;

    /**
     * <p>The dependency information.</p>
     */
    @NameInMap("Dependencies")
    public java.util.List<UpdateTaskRequestDependencies> dependencies;

    /**
     * <p>The description of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

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
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
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
    public UpdateTaskRequestInputs inputs;

    /**
     * <p>The instance generation mode. Valid values:</p>
     * <ul>
     * <li>T+1</li>
     * <li>Immediately</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T+1</p>
     */
    @NameInMap("InstanceMode")
    public String instanceMode;

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
     * <p>The output information.</p>
     */
    @NameInMap("Outputs")
    public UpdateTaskRequestOutputs outputs;

    /**
     * <p>The account ID of the task owner.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The rerun interval. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RerunInterval")
    public Integer rerunInterval;

    /**
     * <p>The rerun mode. Valid values:</p>
     * <ul>
     * <li>AllDenied: The task cannot be rerun regardless of whether the task is successfully run or fails to run.</li>
     * <li>FailureAllowed: The task can be rerun only after it fails to run.</li>
     * <li>AllAllowed: The task can be rerun regardless of whether the task is successfully run or fails to run.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AllAllowed</p>
     */
    @NameInMap("RerunMode")
    public String rerunMode;

    /**
     * <p>The number of times that the task is rerun. This parameter takes effect only if the RerunMode parameter is set to AllAllowed or FailureAllowed.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RerunTimes")
    public Integer rerunTimes;

    /**
     * <p>The configurations of the runtime environment, such as the resource group information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuntimeResource")
    public UpdateTaskRequestRuntimeResource runtimeResource;

    /**
     * <p>The script information.</p>
     */
    @NameInMap("Script")
    public UpdateTaskRequestScript script;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<UpdateTaskRequestTags> tags;

    /**
     * <p>The timeout period of task running. Unit: seconds.</p>
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
    public UpdateTaskRequestTrigger trigger;

    public static UpdateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskRequest self = new UpdateTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskRequest setClientUniqueCode(String clientUniqueCode) {
        this.clientUniqueCode = clientUniqueCode;
        return this;
    }
    public String getClientUniqueCode() {
        return this.clientUniqueCode;
    }

    public UpdateTaskRequest setDataSource(UpdateTaskRequestDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public UpdateTaskRequestDataSource getDataSource() {
        return this.dataSource;
    }

    public UpdateTaskRequest setDependencies(java.util.List<UpdateTaskRequestDependencies> dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public java.util.List<UpdateTaskRequestDependencies> getDependencies() {
        return this.dependencies;
    }

    public UpdateTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTaskRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public UpdateTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateTaskRequest setInputs(UpdateTaskRequestInputs inputs) {
        this.inputs = inputs;
        return this;
    }
    public UpdateTaskRequestInputs getInputs() {
        return this.inputs;
    }

    public UpdateTaskRequest setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
        return this;
    }
    public String getInstanceMode() {
        return this.instanceMode;
    }

    public UpdateTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTaskRequest setOutputs(UpdateTaskRequestOutputs outputs) {
        this.outputs = outputs;
        return this;
    }
    public UpdateTaskRequestOutputs getOutputs() {
        return this.outputs;
    }

    public UpdateTaskRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateTaskRequest setRerunInterval(Integer rerunInterval) {
        this.rerunInterval = rerunInterval;
        return this;
    }
    public Integer getRerunInterval() {
        return this.rerunInterval;
    }

    public UpdateTaskRequest setRerunMode(String rerunMode) {
        this.rerunMode = rerunMode;
        return this;
    }
    public String getRerunMode() {
        return this.rerunMode;
    }

    public UpdateTaskRequest setRerunTimes(Integer rerunTimes) {
        this.rerunTimes = rerunTimes;
        return this;
    }
    public Integer getRerunTimes() {
        return this.rerunTimes;
    }

    public UpdateTaskRequest setRuntimeResource(UpdateTaskRequestRuntimeResource runtimeResource) {
        this.runtimeResource = runtimeResource;
        return this;
    }
    public UpdateTaskRequestRuntimeResource getRuntimeResource() {
        return this.runtimeResource;
    }

    public UpdateTaskRequest setScript(UpdateTaskRequestScript script) {
        this.script = script;
        return this;
    }
    public UpdateTaskRequestScript getScript() {
        return this.script;
    }

    public UpdateTaskRequest setTags(java.util.List<UpdateTaskRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdateTaskRequestTags> getTags() {
        return this.tags;
    }

    public UpdateTaskRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateTaskRequest setTrigger(UpdateTaskRequestTrigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public UpdateTaskRequestTrigger getTrigger() {
        return this.trigger;
    }

    public static class UpdateTaskRequestDataSource extends TeaModel {
        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateTaskRequestDataSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskRequestDataSource self = new UpdateTaskRequestDataSource();
            return TeaModel.build(map, self);
        }

        public UpdateTaskRequestDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateTaskRequestDependencies extends TeaModel {
        /**
         * <p>The dependency type. Valid values:</p>
         * <ul>
         * <li>CrossCycleDependsOnChildren: cross-cycle dependency on level-1 descendant nodes</li>
         * <li>CrossCycleDependsOnSelf: cross-cycle dependency on the current node</li>
         * <li>CrossCycleDependsOnOtherNode: cross-cycle dependency on other nodes</li>
         * <li>Normal: same-cycle scheduling dependency</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The identifier of the output of the ancestor task. This parameter is returned only if <code>same-cycle scheduling dependencies</code> and the node input are configured.</p>
         * 
         * <strong>example:</strong>
         * <p>pre.odps_sql_demo_0</p>
         */
        @NameInMap("UpstreamOutput")
        public String upstreamOutput;

        /**
         * <p>The ancestor task ID. This parameter is returned only if <code>cross-cycle scheduling dependencies</code> or <code>same-cycle scheduling dependencies</code> and the node input are not configured.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("UpstreamTaskId")
        public Long upstreamTaskId;

        public static UpdateTaskRequestDependencies build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskRequestDependencies self = new UpdateTaskRequestDependencies();
            return TeaModel.build(map, self);
        }

        public UpdateTaskRequestDependencies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateTaskRequestDependencies setUpstreamOutput(String upstreamOutput) {
            this.upstreamOutput = upstreamOutput;
            return this;
        }
        public String getUpstreamOutput() {
            return this.upstreamOutput;
        }

        public UpdateTaskRequestDependencies setUpstreamTaskId(Long upstreamTaskId) {
            this.upstreamTaskId = upstreamTaskId;
            return this;
        }
        public Long getUpstreamTaskId() {
            return this.upstreamTaskId;
        }

    }

    public static class UpdateTaskRequestInputsVariables extends TeaModel {
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

        public static UpdateTaskRequestInputsVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskRequestInputsVariables self = new UpdateTaskRequestInputsVariables();
            return TeaModel.build(map, self);
        }

        public UpdateTaskRequestInputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTaskRequestInputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateTaskRequestInputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateTaskRequestInputs extends TeaModel {
        /**
         * <p>The variables.</p>
         */
        @NameInMap("Variables")
        public java.util.List<UpdateTaskRequestInputsVariables> variables;

        public static UpdateTaskRequestInputs build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskRequestInputs self = new UpdateTaskRequestInputs();
            return TeaModel.build(map, self);
        }

        public UpdateTaskRequestInputs setVariables(java.util.List<UpdateTaskRequestInputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<UpdateTaskRequestInputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class UpdateTaskRequestOutputsTaskOutputs extends TeaModel {
        /**
         * <p>The identifier of the output.</p>
         * 
         * <strong>example:</strong>
         * <p>pre.odps_sql_demo_0</p>
         */
        @NameInMap("Output")
        public String output;

        public static UpdateTaskRequestOutputsTaskOutputs build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskRequestOutputsTaskOutputs self = new UpdateTaskRequestOutputsTaskOutputs();
            return TeaModel.build(map, self);
        }

        public UpdateTaskRequestOutputsTaskOutputs setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class UpdateTaskRequestOutputsVariables extends TeaModel {
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

        public static UpdateTaskRequestOutputsVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskRequestOutputsVariables self = new UpdateTaskRequestOutputsVariables();
            return TeaModel.build(map, self);
        }

        public UpdateTaskRequestOutputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTaskRequestOutputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateTaskRequestOutputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateTaskRequestOutputs extends TeaModel {
        /**
         * <p>The task outputs.</p>
         */
        @NameInMap("TaskOutputs")
        public java.util.List<UpdateTaskRequestOutputsTaskOutputs> taskOutputs;

        /**
         * <p>The variables.</p>
         */
        @NameInMap("Variables")
        public java.util.List<UpdateTaskRequestOutputsVariables> variables;

        public static UpdateTaskRequestOutputs build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskRequestOutputs self = new UpdateTaskRequestOutputs();
            return TeaModel.build(map, self);
        }

        public UpdateTaskRequestOutputs setTaskOutputs(java.util.List<UpdateTaskRequestOutputsTaskOutputs> taskOutputs) {
            this.taskOutputs = taskOutputs;
            return this;
        }
        public java.util.List<UpdateTaskRequestOutputsTaskOutputs> getTaskOutputs() {
            return this.taskOutputs;
        }

        public UpdateTaskRequestOutputs setVariables(java.util.List<UpdateTaskRequestOutputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<UpdateTaskRequestOutputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class UpdateTaskRequestRuntimeResource extends TeaModel {
        /**
         * <p>The default number of compute units (CUs) configured for task running.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static UpdateTaskRequestRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskRequestRuntimeResource self = new UpdateTaskRequestRuntimeResource();
            return TeaModel.build(map, self);
        }

        public UpdateTaskRequestRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public UpdateTaskRequestRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public UpdateTaskRequestRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class UpdateTaskRequestScript extends TeaModel {
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

        public static UpdateTaskRequestScript build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskRequestScript self = new UpdateTaskRequestScript();
            return TeaModel.build(map, self);
        }

        public UpdateTaskRequestScript setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateTaskRequestScript setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

    }

    public static class UpdateTaskRequestTags extends TeaModel {
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

        public static UpdateTaskRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskRequestTags self = new UpdateTaskRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdateTaskRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateTaskRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateTaskRequestTrigger extends TeaModel {
        /**
         * <p>The CRON expression. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The end time of the time range during which the task is periodically scheduled. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>9999-01-01 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The running mode of the task after it is triggered. This parameter takes effect only if the Type parameter is set to Scheduler. Valid values:</p>
         * <ul>
         * <li>Pause</li>
         * <li>Skip</li>
         * <li>Normal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Recurrence")
        public String recurrence;

        /**
         * <p>The start time of the time range during which the task is periodically scheduled. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>1970-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The trigger type. Valid values:</p>
         * <ul>
         * <li>Scheduler: periodic scheduling</li>
         * <li>Manual: manual scheduling</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateTaskRequestTrigger build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskRequestTrigger self = new UpdateTaskRequestTrigger();
            return TeaModel.build(map, self);
        }

        public UpdateTaskRequestTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public UpdateTaskRequestTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateTaskRequestTrigger setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public UpdateTaskRequestTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public UpdateTaskRequestTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
