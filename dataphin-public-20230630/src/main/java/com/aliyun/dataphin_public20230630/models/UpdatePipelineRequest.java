// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdatePipelineRequest extends TeaModel {
    /**
     * <p>The request context information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public UpdatePipelineRequestContext context;

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
     * <p>The configuration for updating the pipeline or workflow node.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdatePipelineRequestUpdateCommand updateCommand;

    public static UpdatePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineRequest self = new UpdatePipelineRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineRequest setContext(UpdatePipelineRequestContext context) {
        this.context = context;
        return this;
    }
    public UpdatePipelineRequestContext getContext() {
        return this.context;
    }

    public UpdatePipelineRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdatePipelineRequest setUpdateCommand(UpdatePipelineRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdatePipelineRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdatePipelineRequestContext extends TeaModel {
        /**
         * <p>The current operating environment. Valid values:</p>
         * <ul>
         * <li>DEV: the development environment.</li>
         * <li>PROD: the production environment. For workflow nodes, only PROD is supported.</li>
         * </ul>
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

        public static UpdatePipelineRequestContext build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestContext self = new UpdatePipelineRequestContext();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public UpdatePipelineRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class UpdatePipelineRequestUpdateCommandNodeInfo extends TeaModel {
        /**
         * <p>The folder of the integration pipeline or workflow node (defaults to the root folder). The folder must exist. If it does not exist, call the relevant API operation to create a folder of type offlinePipeline (or unstructuredPipeline for workflows).</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The file ID of the pipeline or workflow. Leave this parameter empty for initial creation. When updating a pipeline or workflow node, specify at least one of pipelineId, fileId, or nodeId.</p>
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
         * <p>The ID of the pipeline or workflow node. Leave this parameter empty for initial creation. When updating a pipeline or workflow node, specify at least one of pipelineId, fileId, or nodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PipelineId")
        public Long pipelineId;

        public static UpdatePipelineRequestUpdateCommandNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestUpdateCommandNodeInfo self = new UpdatePipelineRequestUpdateCommandNodeInfo();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestUpdateCommandNodeInfo setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public UpdatePipelineRequestUpdateCommandNodeInfo setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public UpdatePipelineRequestUpdateCommandNodeInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public UpdatePipelineRequestUpdateCommandNodeInfo setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public UpdatePipelineRequestUpdateCommandNodeInfo setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

    }

    public static class UpdatePipelineRequestUpdateCommandPipelineConfigHops extends TeaModel {
        /**
         * <p>Specifies whether the downstream condition is true for a conditional distribution component. Set this parameter to true if the downstream condition is true, or false otherwise. This parameter is not applicable to workflow nodes.</p>
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

        public static UpdatePipelineRequestUpdateCommandPipelineConfigHops build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestUpdateCommandPipelineConfigHops self = new UpdatePipelineRequestUpdateCommandPipelineConfigHops();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestUpdateCommandPipelineConfigHops setSendTo(Boolean sendTo) {
            this.sendTo = sendTo;
            return this;
        }
        public Boolean getSendTo() {
            return this.sendTo;
        }

        public UpdatePipelineRequestUpdateCommandPipelineConfigHops setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdatePipelineRequestUpdateCommandPipelineConfigHops setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class UpdatePipelineRequestUpdateCommandPipelineConfigSteps extends TeaModel {
        /**
         * <p>Specifies the data distribution method when the current component has multiple downstream components. Valid values:</p>
         * <ul>
         * <li>true (default): The data from the current component is distributed to all downstream components in a round-robin manner. For example, if the current component has 100 records and two downstream components, each downstream component receives 50 records.</li>
         * <li>false: The full data from the current component is sent to all downstream components. For example, if the current component has 100 records and two downstream components, each downstream component receives 100 records.</li>
         * </ul>
         * <p>This parameter is not applicable to workflow nodes.</p>
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
         * <p>The specific component configuration in JSON string format. Refer to the toJsonString method of the relevant subclasses of the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig (or com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.unstructured.BaseOAUnstructuredNeuronConfig for workflow operators). Developers should inherit the component or operator configuration class and implement the corresponding component or operator configuration. Each component or operator configuration has the same structure as the node configuration created on the Dataphin console.</p>
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
         * <p>For workflow nodes, this parameter specifies the operator type, such as image for images and text for text. Refer to the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig#stepType. Developers should inherit the component or operator configuration class and implement the corresponding component or operator configuration. Each component or operator configuration has the same structure as the configuration created on the Dataphin console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("StepType")
        public String stepType;

        public static UpdatePipelineRequestUpdateCommandPipelineConfigSteps build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestUpdateCommandPipelineConfigSteps self = new UpdatePipelineRequestUpdateCommandPipelineConfigSteps();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestUpdateCommandPipelineConfigSteps setIsDistribute(Boolean isDistribute) {
            this.isDistribute = isDistribute;
            return this;
        }
        public Boolean getIsDistribute() {
            return this.isDistribute;
        }

        public UpdatePipelineRequestUpdateCommandPipelineConfigSteps setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdatePipelineRequestUpdateCommandPipelineConfigSteps setPluginConfig(String pluginConfig) {
            this.pluginConfig = pluginConfig;
            return this;
        }
        public String getPluginConfig() {
            return this.pluginConfig;
        }

        public UpdatePipelineRequestUpdateCommandPipelineConfigSteps setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public UpdatePipelineRequestUpdateCommandPipelineConfigSteps setStepType(String stepType) {
            this.stepType = stepType;
            return this;
        }
        public String getStepType() {
            return this.stepType;
        }

    }

    public static class UpdatePipelineRequestUpdateCommandPipelineConfig extends TeaModel {
        /**
         * <p>The DAG (directed acyclic graph) link configuration that describes the connection relationships among all components or operators.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Hops")
        public java.util.List<UpdatePipelineRequestUpdateCommandPipelineConfigHops> hops;

        /**
         * <p>The component or operator configurations, including the detailed configurations of all components or operators used.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Steps")
        public java.util.List<UpdatePipelineRequestUpdateCommandPipelineConfigSteps> steps;

        public static UpdatePipelineRequestUpdateCommandPipelineConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestUpdateCommandPipelineConfig self = new UpdatePipelineRequestUpdateCommandPipelineConfig();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestUpdateCommandPipelineConfig setHops(java.util.List<UpdatePipelineRequestUpdateCommandPipelineConfigHops> hops) {
            this.hops = hops;
            return this;
        }
        public java.util.List<UpdatePipelineRequestUpdateCommandPipelineConfigHops> getHops() {
            return this.hops;
        }

        public UpdatePipelineRequestUpdateCommandPipelineConfig setSteps(java.util.List<UpdatePipelineRequestUpdateCommandPipelineConfigSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<UpdatePipelineRequestUpdateCommandPipelineConfigSteps> getSteps() {
            return this.steps;
        }

    }

    public static class UpdatePipelineRequestUpdateCommand extends TeaModel {
        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The integration pipeline configuration mode. Valid values:</p>
         * <ul>
         * <li>PIPELINE (default): pipeline mode.</li>
         * <li>JSON: script mode.</li>
         * </ul>
         * <p>This parameter is not applicable to workflow nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>PIPELINE</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The basic information about the integration pipeline or workflow node.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeInfo")
        public UpdatePipelineRequestUpdateCommandNodeInfo nodeInfo;

        /**
         * <p>The integration pipeline component or workflow operator configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("PipelineConfig")
        public UpdatePipelineRequestUpdateCommandPipelineConfig pipelineConfig;

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
         * <li>0 (default): batch integration.</li>
         * <li>1: real-time integration.</li>
         * <li>14: workflow node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PipelineType")
        public Integer pipelineType;

        /**
         * <p>The scheduling configuration in JSON string format. Refer to the toJsonString method of the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.OAScheduleConfig.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cronExpression&quot;:&quot;0 0 0 * * ?&quot;}</p>
         */
        @NameInMap("ScheduleConfig")
        public String scheduleConfig;

        /**
         * <p>The channel configuration in JSON string format. Refer to the toJsonString method of the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.OAPipelineSetting.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Settings")
        public String settings;

        /**
         * <p>Specifies whether to submit the node. Default value: true.</p>
         */
        @NameInMap("Submit")
        public Boolean submit;

        public static UpdatePipelineRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestUpdateCommand self = new UpdatePipelineRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestUpdateCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UpdatePipelineRequestUpdateCommand setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public UpdatePipelineRequestUpdateCommand setNodeInfo(UpdatePipelineRequestUpdateCommandNodeInfo nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public UpdatePipelineRequestUpdateCommandNodeInfo getNodeInfo() {
            return this.nodeInfo;
        }

        public UpdatePipelineRequestUpdateCommand setPipelineConfig(UpdatePipelineRequestUpdateCommandPipelineConfig pipelineConfig) {
            this.pipelineConfig = pipelineConfig;
            return this;
        }
        public UpdatePipelineRequestUpdateCommandPipelineConfig getPipelineConfig() {
            return this.pipelineConfig;
        }

        public UpdatePipelineRequestUpdateCommand setPipelineJson(String pipelineJson) {
            this.pipelineJson = pipelineJson;
            return this;
        }
        public String getPipelineJson() {
            return this.pipelineJson;
        }

        public UpdatePipelineRequestUpdateCommand setPipelineType(Integer pipelineType) {
            this.pipelineType = pipelineType;
            return this;
        }
        public Integer getPipelineType() {
            return this.pipelineType;
        }

        public UpdatePipelineRequestUpdateCommand setScheduleConfig(String scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public String getScheduleConfig() {
            return this.scheduleConfig;
        }

        public UpdatePipelineRequestUpdateCommand setSettings(String settings) {
            this.settings = settings;
            return this;
        }
        public String getSettings() {
            return this.settings;
        }

        public UpdatePipelineRequestUpdateCommand setSubmit(Boolean submit) {
            this.submit = submit;
            return this;
        }
        public Boolean getSubmit() {
            return this.submit;
        }

    }

}
