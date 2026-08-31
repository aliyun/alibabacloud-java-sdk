// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreatePipelineRequest extends TeaModel {
    /**
     * <p>The request context information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public CreatePipelineRequestContext context;

    /**
     * <p>The configuration for creating a pipeline or workflow node.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreatePipelineRequestCreateCommand createCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static CreatePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineRequest self = new CreatePipelineRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineRequest setContext(CreatePipelineRequestContext context) {
        this.context = context;
        return this;
    }
    public CreatePipelineRequestContext getContext() {
        return this.context;
    }

    public CreatePipelineRequest setCreateCommand(CreatePipelineRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreatePipelineRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreatePipelineRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreatePipelineRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class CreatePipelineRequestContext extends TeaModel {
        /**
         * <p>The current operating environment. Valid values:</p>
         * <ul>
         * <li>DEV: the development environment.</li>
         * <li>PROD: the production environment.</li>
         * </ul>
         * <p>For workflow nodes, only PROD is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The ID of the project to which the integration pipeline or workflow node belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static CreatePipelineRequestContext build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestContext self = new CreatePipelineRequestContext();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public CreatePipelineRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class CreatePipelineRequestCreateCommandNodeInfo extends TeaModel {
        /**
         * <p>The folder of the integration pipeline or workflow node. Default value: root folder. The folder must already exist. If it does not exist, call the relevant API operation to create a folder of type offlinePipeline (or unstructuredPipeline for workflows).</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The pipeline or workflow file ID. Leave this parameter empty for initial creation. When updating a pipeline or workflow node, specify at least one of pipelineId, fileId, or nodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The scheduling node ID of the pipeline or workflow node. Leave this parameter empty for initial creation. When updating a pipeline or workflow node, specify at least one of pipelineId, fileId, or nodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>n_123</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The name of the integration pipeline or workflow node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The pipeline or workflow node ID. Leave this parameter empty for initial creation. When updating a pipeline or workflow node, specify at least one of pipelineId, fileId, or nodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PipelineId")
        public Long pipelineId;

        public static CreatePipelineRequestCreateCommandNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestCreateCommandNodeInfo self = new CreatePipelineRequestCreateCommandNodeInfo();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestCreateCommandNodeInfo setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreatePipelineRequestCreateCommandNodeInfo setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public CreatePipelineRequestCreateCommandNodeInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreatePipelineRequestCreateCommandNodeInfo setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public CreatePipelineRequestCreateCommandNodeInfo setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

    }

    public static class CreatePipelineRequestCreateCommandPipelineConfigHops extends TeaModel {
        /**
         * <p>Specifies the downstream condition for a conditional distribution component. Set this parameter to true if the downstream condition is true, or false otherwise. If the node is a workflow node, you can ignore this parameter.</p>
         */
        @NameInMap("SendTo")
        public Boolean sendTo;

        /**
         * <p>The name of the input step, which corresponds to Steps[*].StepName.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_reader</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The name of the output step, which corresponds to Steps[*].StepName.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_writer</p>
         */
        @NameInMap("Target")
        public String target;

        public static CreatePipelineRequestCreateCommandPipelineConfigHops build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestCreateCommandPipelineConfigHops self = new CreatePipelineRequestCreateCommandPipelineConfigHops();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestCreateCommandPipelineConfigHops setSendTo(Boolean sendTo) {
            this.sendTo = sendTo;
            return this;
        }
        public Boolean getSendTo() {
            return this.sendTo;
        }

        public CreatePipelineRequestCreateCommandPipelineConfigHops setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreatePipelineRequestCreateCommandPipelineConfigHops setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class CreatePipelineRequestCreateCommandPipelineConfigSteps extends TeaModel {
        /**
         * <p>Specifies the data distribution mode when the current component has multiple downstream components. Valid values:</p>
         * <ul>
         * <li>true: The data of the current component is distributed to all downstream components in a round-robin manner. For example, if the current component has 100 records and two downstream components, each downstream component receives 50 records. Default value: true.</li>
         * <li>false: The full data of the current component is sent to all downstream components. For example, if the current component has 100 records and two downstream components, both downstream components receive 100 records.</li>
         * </ul>
         * <p>If the node is a workflow node, you can ignore this parameter.</p>
         */
        @NameInMap("IsDistribute")
        public Boolean isDistribute;

        /**
         * <p>The plugin ID. Each plugin or operator has a unique identifier. Refer to the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig#stepKey. Developers should inherit the component or operator configuration class and implement the corresponding component or operator configuration. Each component or operator configuration has the same structure as the configuration created on the Dataphin console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysqlinput</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The specific component configuration in JSON string format. Refer to the toJsonString method of the relevant subclasses of the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig (for workflow operators, use com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.unstructured.BaseOAUnstructuredNeuronConfig). Developers should inherit the component or operator configuration class and implement the corresponding component or operator configuration. Each component or operator configuration has the same structure as the node configuration created on the Dataphin console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PluginConfig")
        public String pluginConfig;

        /**
         * <p>The step name. Step names must be unique within the same pipeline node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_reader</p>
         */
        @NameInMap("StepName")
        public String stepName;

        /**
         * <p>The component type. Valid values:</p>
         * <ul>
         * <li>input: an input component.</li>
         * <li>output: an output component.</li>
         * <li>transfrom: a transform component.</li>
         * <li>process: a flow control component.</li>
         * </ul>
         * <p>For workflow nodes, this parameter specifies the operator type, such as image or text. Refer to the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig#stepType. Developers should inherit the component or operator configuration class and implement the corresponding component or operator configuration. Each component or operator configuration has the same structure as the configuration created on the Dataphin console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("StepType")
        public String stepType;

        public static CreatePipelineRequestCreateCommandPipelineConfigSteps build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestCreateCommandPipelineConfigSteps self = new CreatePipelineRequestCreateCommandPipelineConfigSteps();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestCreateCommandPipelineConfigSteps setIsDistribute(Boolean isDistribute) {
            this.isDistribute = isDistribute;
            return this;
        }
        public Boolean getIsDistribute() {
            return this.isDistribute;
        }

        public CreatePipelineRequestCreateCommandPipelineConfigSteps setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePipelineRequestCreateCommandPipelineConfigSteps setPluginConfig(String pluginConfig) {
            this.pluginConfig = pluginConfig;
            return this;
        }
        public String getPluginConfig() {
            return this.pluginConfig;
        }

        public CreatePipelineRequestCreateCommandPipelineConfigSteps setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public CreatePipelineRequestCreateCommandPipelineConfigSteps setStepType(String stepType) {
            this.stepType = stepType;
            return this;
        }
        public String getStepType() {
            return this.stepType;
        }

    }

    public static class CreatePipelineRequestCreateCommandPipelineConfig extends TeaModel {
        /**
         * <p>The directed acyclic graph (DAG) link configuration that describes the connections between all components or operators.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Hops")
        public java.util.List<CreatePipelineRequestCreateCommandPipelineConfigHops> hops;

        /**
         * <p>The component or operator configurations, which contain the detailed configurations of all components or operators used.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Steps")
        public java.util.List<CreatePipelineRequestCreateCommandPipelineConfigSteps> steps;

        public static CreatePipelineRequestCreateCommandPipelineConfig build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestCreateCommandPipelineConfig self = new CreatePipelineRequestCreateCommandPipelineConfig();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestCreateCommandPipelineConfig setHops(java.util.List<CreatePipelineRequestCreateCommandPipelineConfigHops> hops) {
            this.hops = hops;
            return this;
        }
        public java.util.List<CreatePipelineRequestCreateCommandPipelineConfigHops> getHops() {
            return this.hops;
        }

        public CreatePipelineRequestCreateCommandPipelineConfig setSteps(java.util.List<CreatePipelineRequestCreateCommandPipelineConfigSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<CreatePipelineRequestCreateCommandPipelineConfigSteps> getSteps() {
            return this.steps;
        }

    }

    public static class CreatePipelineRequestCreateCommand extends TeaModel {
        /**
         * <p>The comment.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The integration pipeline configuration mode. Valid values:</p>
         * <ul>
         * <li>PIPELINE: pipeline mode. This is the default value.</li>
         * <li>JSON: script mode.</li>
         * </ul>
         * <p>If the node is a workflow node, you can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>PIPELINE</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The basic information of the integration pipeline or workflow node.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeInfo")
        public CreatePipelineRequestCreateCommandNodeInfo nodeInfo;

        /**
         * <p>The integration pipeline component or workflow operator configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("PipelineConfig")
        public CreatePipelineRequestCreateCommandPipelineConfig pipelineConfig;

        /**
         * <p>The integration pipeline configuration in JSON string format for script mode. Workflow nodes do not support script mode.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PipelineJson")
        public String pipelineJson;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li>0: offline integration. Default value: 0.</li>
         * <li>1: real-time integration.</li>
         * <li>14: offline workflow node.</li>
         * <li>15: real-time workflow.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PipelineType")
        public Integer pipelineType;

        /**
         * <p>The scheduling configuration in JSON string format. Refer to the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.OAScheduleConfig#toJsonString method.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cronExpression&quot;:&quot;0 0 0 * * ?&quot;}</p>
         */
        @NameInMap("ScheduleConfig")
        public String scheduleConfig;

        /**
         * <p>The channel configuration in JSON string format. Refer to the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.OAPipelineSetting#toJsonString method.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Settings")
        public String settings;

        /**
         * <p>Specifies whether to submit the node. The node is submitted by default.</p>
         */
        @NameInMap("Submit")
        public Boolean submit;

        public static CreatePipelineRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestCreateCommand self = new CreatePipelineRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestCreateCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreatePipelineRequestCreateCommand setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreatePipelineRequestCreateCommand setNodeInfo(CreatePipelineRequestCreateCommandNodeInfo nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public CreatePipelineRequestCreateCommandNodeInfo getNodeInfo() {
            return this.nodeInfo;
        }

        public CreatePipelineRequestCreateCommand setPipelineConfig(CreatePipelineRequestCreateCommandPipelineConfig pipelineConfig) {
            this.pipelineConfig = pipelineConfig;
            return this;
        }
        public CreatePipelineRequestCreateCommandPipelineConfig getPipelineConfig() {
            return this.pipelineConfig;
        }

        public CreatePipelineRequestCreateCommand setPipelineJson(String pipelineJson) {
            this.pipelineJson = pipelineJson;
            return this;
        }
        public String getPipelineJson() {
            return this.pipelineJson;
        }

        public CreatePipelineRequestCreateCommand setPipelineType(Integer pipelineType) {
            this.pipelineType = pipelineType;
            return this;
        }
        public Integer getPipelineType() {
            return this.pipelineType;
        }

        public CreatePipelineRequestCreateCommand setScheduleConfig(String scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public String getScheduleConfig() {
            return this.scheduleConfig;
        }

        public CreatePipelineRequestCreateCommand setSettings(String settings) {
            this.settings = settings;
            return this;
        }
        public String getSettings() {
            return this.settings;
        }

        public CreatePipelineRequestCreateCommand setSubmit(Boolean submit) {
            this.submit = submit;
            return this;
        }
        public Boolean getSubmit() {
            return this.submit;
        }

    }

}
