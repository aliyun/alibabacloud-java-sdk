// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateTaskAsyncRequest extends TeaModel {
    /**
     * <p>The client unique code of the node, which uniquely identifies a node. This code is used for asynchronous operations and idempotence. If you do not specify this parameter during creation, the system automatically generates one. The code is uniquely bound to the resource ID. When updating or deleting a resource, if you specify this parameter, it must be the same as the client unique code specified during creation.</p>
     * 
     * <strong>example:</strong>
     * <p>Workflow_0bc5213917368545132902xxxxxxxx</p>
     */
    @NameInMap("ClientUniqueCode")
    public String clientUniqueCode;

    /**
     * <p>The associated data source information.</p>
     */
    @NameInMap("DataSource")
    public UpdateTaskAsyncRequestDataSource dataSource;

    /**
     * <p>The dependency information.</p>
     */
    @NameInMap("Dependencies")
    public java.util.List<UpdateTaskAsyncRequestDependencies> dependencies;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The project environment. Valid values:</p>
     * <ul>
     * <li>Prod: production</li>
     * <li>Dev: development</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The node ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The input information.</p>
     */
    @NameInMap("Inputs")
    public UpdateTaskAsyncRequestInputs inputs;

    /**
     * <p>The instance generation mode. Valid values:</p>
     * <ul>
     * <li>T+1: Generates instances the next day.</li>
     * <li>Immediately: Generates instances immediately. Note: Only periodic instances whose scheduled time is at least 10 minutes after the node publish time are generated. During the full instance generation period (22:00 to 24:00), real-time instance generation is not available. You can submit and publish nodes, but new nodes do not automatically generate instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T+1</p>
     */
    @NameInMap("InstanceMode")
    public String instanceMode;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output information.</p>
     */
    @NameInMap("Outputs")
    public UpdateTaskAsyncRequestOutputs outputs;

    /**
     * <p>The account ID of the node owner. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and hover over the profile picture in the upper-right corner of the top navigation bar to view the account ID. If this parameter is left empty, the Alibaba Cloud account ID of the caller is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000001</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The retry time interval, in milliseconds. The value cannot exceed 1800000.</p>
     * 
     * <strong>example:</strong>
     * <p>60000</p>
     */
    @NameInMap("RerunInterval")
    public Integer rerunInterval;

    /**
     * <p>Specifies whether the node can be rerun. Valid values:</p>
     * <ul>
     * <li>AllDenied: Cannot be rerun regardless of success or failure.</li>
     * <li>FailureAllowed: Can be rerun only upon failure.</li>
     * <li>AllAllowed: Can be rerun regardless of success or failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AllAllowed</p>
     */
    @NameInMap("RerunMode")
    public String rerunMode;

    /**
     * <p>The number of retries. This parameter takes effect when the node is configured to allow reruns.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RerunTimes")
    public Integer rerunTimes;

    /**
     * <p>The runtime environment configuration, such as schedule resource group information.</p>
     */
    @NameInMap("RuntimeResource")
    public UpdateTaskAsyncRequestRuntimeResource runtimeResource;

    /**
     * <p>The script information.</p>
     */
    @NameInMap("Script")
    public UpdateTaskAsyncRequestScript script;

    /**
     * <p>The list of data asset tags to bind.</p>
     */
    @NameInMap("Tags")
    public java.util.List<UpdateTaskAsyncRequestTags> tags;

    /**
     * <p>The timeout setting for scheduling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The trigger method of the node.</p>
     */
    @NameInMap("Trigger")
    public UpdateTaskAsyncRequestTrigger trigger;

    public static UpdateTaskAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskAsyncRequest self = new UpdateTaskAsyncRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskAsyncRequest setClientUniqueCode(String clientUniqueCode) {
        this.clientUniqueCode = clientUniqueCode;
        return this;
    }
    public String getClientUniqueCode() {
        return this.clientUniqueCode;
    }

    public UpdateTaskAsyncRequest setDataSource(UpdateTaskAsyncRequestDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public UpdateTaskAsyncRequestDataSource getDataSource() {
        return this.dataSource;
    }

    public UpdateTaskAsyncRequest setDependencies(java.util.List<UpdateTaskAsyncRequestDependencies> dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public java.util.List<UpdateTaskAsyncRequestDependencies> getDependencies() {
        return this.dependencies;
    }

    public UpdateTaskAsyncRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTaskAsyncRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public UpdateTaskAsyncRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateTaskAsyncRequest setInputs(UpdateTaskAsyncRequestInputs inputs) {
        this.inputs = inputs;
        return this;
    }
    public UpdateTaskAsyncRequestInputs getInputs() {
        return this.inputs;
    }

    public UpdateTaskAsyncRequest setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
        return this;
    }
    public String getInstanceMode() {
        return this.instanceMode;
    }

    public UpdateTaskAsyncRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTaskAsyncRequest setOutputs(UpdateTaskAsyncRequestOutputs outputs) {
        this.outputs = outputs;
        return this;
    }
    public UpdateTaskAsyncRequestOutputs getOutputs() {
        return this.outputs;
    }

    public UpdateTaskAsyncRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateTaskAsyncRequest setRerunInterval(Integer rerunInterval) {
        this.rerunInterval = rerunInterval;
        return this;
    }
    public Integer getRerunInterval() {
        return this.rerunInterval;
    }

    public UpdateTaskAsyncRequest setRerunMode(String rerunMode) {
        this.rerunMode = rerunMode;
        return this;
    }
    public String getRerunMode() {
        return this.rerunMode;
    }

    public UpdateTaskAsyncRequest setRerunTimes(Integer rerunTimes) {
        this.rerunTimes = rerunTimes;
        return this;
    }
    public Integer getRerunTimes() {
        return this.rerunTimes;
    }

    public UpdateTaskAsyncRequest setRuntimeResource(UpdateTaskAsyncRequestRuntimeResource runtimeResource) {
        this.runtimeResource = runtimeResource;
        return this;
    }
    public UpdateTaskAsyncRequestRuntimeResource getRuntimeResource() {
        return this.runtimeResource;
    }

    public UpdateTaskAsyncRequest setScript(UpdateTaskAsyncRequestScript script) {
        this.script = script;
        return this;
    }
    public UpdateTaskAsyncRequestScript getScript() {
        return this.script;
    }

    public UpdateTaskAsyncRequest setTags(java.util.List<UpdateTaskAsyncRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdateTaskAsyncRequestTags> getTags() {
        return this.tags;
    }

    public UpdateTaskAsyncRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateTaskAsyncRequest setTrigger(UpdateTaskAsyncRequestTrigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public UpdateTaskAsyncRequestTrigger getTrigger() {
        return this.trigger;
    }

    public static class UpdateTaskAsyncRequestDataSource extends TeaModel {
        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateTaskAsyncRequestDataSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskAsyncRequestDataSource self = new UpdateTaskAsyncRequestDataSource();
            return TeaModel.build(map, self);
        }

        public UpdateTaskAsyncRequestDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateTaskAsyncRequestDependencies extends TeaModel {
        /**
         * <p>The dependency type. Valid values:</p>
         * <ul>
         * <li>CrossCycleDependsOnChildren: cross-cycle dependency on first-level child nodes</li>
         * <li>CrossCycleDependsOnSelf: cross-cycle dependency on the current node</li>
         * <li>CrossCycleDependsOnOtherNode: cross-cycle dependency on other nodes</li>
         * <li>Normal: same-cycle dependency</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The output identifier of the upstream node. This field is returned when the dependency type is same-cycle dependency and input content is set.</p>
         * 
         * <strong>example:</strong>
         * <p>pre.odps_sql_demo_0</p>
         */
        @NameInMap("UpstreamOutput")
        public String upstreamOutput;

        /**
         * <p>The ID of the upstream node. This field is returned when the dependency type is cross-cycle dependency on other nodes or same-cycle dependency without input content set. It is not returned in other cases.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("UpstreamTaskId")
        public Long upstreamTaskId;

        public static UpdateTaskAsyncRequestDependencies build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskAsyncRequestDependencies self = new UpdateTaskAsyncRequestDependencies();
            return TeaModel.build(map, self);
        }

        public UpdateTaskAsyncRequestDependencies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateTaskAsyncRequestDependencies setUpstreamOutput(String upstreamOutput) {
            this.upstreamOutput = upstreamOutput;
            return this;
        }
        public String getUpstreamOutput() {
            return this.upstreamOutput;
        }

        public UpdateTaskAsyncRequestDependencies setUpstreamTaskId(Long upstreamTaskId) {
            this.upstreamTaskId = upstreamTaskId;
            return this;
        }
        public Long getUpstreamTaskId() {
            return this.upstreamTaskId;
        }

    }

    public static class UpdateTaskAsyncRequestInputsVariables extends TeaModel {
        /**
         * <p>The variable name.</p>
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
         * <li>PassThrough: parameter node output</li>
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
         * <p>The variable value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateTaskAsyncRequestInputsVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskAsyncRequestInputsVariables self = new UpdateTaskAsyncRequestInputsVariables();
            return TeaModel.build(map, self);
        }

        public UpdateTaskAsyncRequestInputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTaskAsyncRequestInputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateTaskAsyncRequestInputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateTaskAsyncRequestInputs extends TeaModel {
        /**
         * <p>The list of variable definitions.</p>
         */
        @NameInMap("Variables")
        public java.util.List<UpdateTaskAsyncRequestInputsVariables> variables;

        public static UpdateTaskAsyncRequestInputs build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskAsyncRequestInputs self = new UpdateTaskAsyncRequestInputs();
            return TeaModel.build(map, self);
        }

        public UpdateTaskAsyncRequestInputs setVariables(java.util.List<UpdateTaskAsyncRequestInputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<UpdateTaskAsyncRequestInputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class UpdateTaskAsyncRequestOutputsTaskOutputs extends TeaModel {
        /**
         * <p>The output identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>pre.odps_sql_demo_0</p>
         */
        @NameInMap("Output")
        public String output;

        public static UpdateTaskAsyncRequestOutputsTaskOutputs build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskAsyncRequestOutputsTaskOutputs self = new UpdateTaskAsyncRequestOutputsTaskOutputs();
            return TeaModel.build(map, self);
        }

        public UpdateTaskAsyncRequestOutputsTaskOutputs setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class UpdateTaskAsyncRequestOutputsVariables extends TeaModel {
        /**
         * <p>The variable name.</p>
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
         * <li>PassThrough: parameter node output</li>
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
         * <p>The variable value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateTaskAsyncRequestOutputsVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskAsyncRequestOutputsVariables self = new UpdateTaskAsyncRequestOutputsVariables();
            return TeaModel.build(map, self);
        }

        public UpdateTaskAsyncRequestOutputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTaskAsyncRequestOutputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateTaskAsyncRequestOutputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateTaskAsyncRequestOutputs extends TeaModel {
        /**
         * <p>The list of node output definitions.</p>
         */
        @NameInMap("TaskOutputs")
        public java.util.List<UpdateTaskAsyncRequestOutputsTaskOutputs> taskOutputs;

        /**
         * <p>The list of variable definitions.</p>
         */
        @NameInMap("Variables")
        public java.util.List<UpdateTaskAsyncRequestOutputsVariables> variables;

        public static UpdateTaskAsyncRequestOutputs build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskAsyncRequestOutputs self = new UpdateTaskAsyncRequestOutputs();
            return TeaModel.build(map, self);
        }

        public UpdateTaskAsyncRequestOutputs setTaskOutputs(java.util.List<UpdateTaskAsyncRequestOutputsTaskOutputs> taskOutputs) {
            this.taskOutputs = taskOutputs;
            return this;
        }
        public java.util.List<UpdateTaskAsyncRequestOutputsTaskOutputs> getTaskOutputs() {
            return this.taskOutputs;
        }

        public UpdateTaskAsyncRequestOutputs setVariables(java.util.List<UpdateTaskAsyncRequestOutputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<UpdateTaskAsyncRequestOutputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class UpdateTaskAsyncRequestRuntimeResource extends TeaModel {
        /**
         * <p>The CU consumption configured for the node.</p>
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
         * <p>63900680</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static UpdateTaskAsyncRequestRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskAsyncRequestRuntimeResource self = new UpdateTaskAsyncRequestRuntimeResource();
            return TeaModel.build(map, self);
        }

        public UpdateTaskAsyncRequestRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public UpdateTaskAsyncRequestRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public UpdateTaskAsyncRequestRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class UpdateTaskAsyncRequestScript extends TeaModel {
        /**
         * <p>The script content.</p>
         * 
         * <strong>example:</strong>
         * <p>echo &quot;helloWorld&quot;</p>
         */
        @NameInMap("Content")
        @Deprecated
        public String content;

        /**
         * <p>The list of script parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>para1=$bizdate</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        public static UpdateTaskAsyncRequestScript build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskAsyncRequestScript self = new UpdateTaskAsyncRequestScript();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public UpdateTaskAsyncRequestScript setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateTaskAsyncRequestScript setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

    }

    public static class UpdateTaskAsyncRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateTaskAsyncRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskAsyncRequestTags self = new UpdateTaskAsyncRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdateTaskAsyncRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateTaskAsyncRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateTaskAsyncRequestTrigger extends TeaModel {
        /**
         * <p>The cron expression. This parameter takes effect when type is set to Scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The epoch type. This parameter takes effect when Type is set to Scheduler and the cron expression specifies timed scheduling within a specific hour. Default value: Daily. Valid values:</p>
         * <ul>
         * <li>Daily: daily scheduling</li>
         * <li>NotDaily: hourly scheduling</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("CycleType")
        public String cycleType;

        /**
         * <p>The time when the periodic trigger expires. This parameter takes effect when type is set to Scheduler. Format: <code>yyyy-mm-dd hh:mm:ss</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>9999-01-01 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The run mode when the trigger fires. This parameter takes effect when type is set to Scheduler. Valid values:</p>
         * <ul>
         * <li>Pause: paused</li>
         * <li>Skip: dry run</li>
         * <li>Normal: normal execution</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Recurrence")
        public String recurrence;

        /**
         * <p>The effective period of the epoch trigger. This parameter takes effect when type is set to Scheduler. Format: <code>yyyy-mm-dd hh:mm:ss</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1970-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The trigger type. Valid values:</p>
         * <ul>
         * <li>Scheduler: periodic scheduling trigger</li>
         * <li>Manual: manual trigger</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BySchedule</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateTaskAsyncRequestTrigger build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskAsyncRequestTrigger self = new UpdateTaskAsyncRequestTrigger();
            return TeaModel.build(map, self);
        }

        public UpdateTaskAsyncRequestTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public UpdateTaskAsyncRequestTrigger setCycleType(String cycleType) {
            this.cycleType = cycleType;
            return this;
        }
        public String getCycleType() {
            return this.cycleType;
        }

        public UpdateTaskAsyncRequestTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateTaskAsyncRequestTrigger setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public UpdateTaskAsyncRequestTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public UpdateTaskAsyncRequestTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
