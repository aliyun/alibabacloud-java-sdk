// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreatePipelineByAsyncRequest extends TeaModel {
    /**
     * <p>The request context information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public CreatePipelineByAsyncRequestContext context;

    /**
     * <p>The configuration for creating a pipeline or workflow task.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreatePipelineByAsyncRequestCreateCommand createCommand;

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
     * <p>The ID of the user who performs the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static CreatePipelineByAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineByAsyncRequest self = new CreatePipelineByAsyncRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineByAsyncRequest setContext(CreatePipelineByAsyncRequestContext context) {
        this.context = context;
        return this;
    }
    public CreatePipelineByAsyncRequestContext getContext() {
        return this.context;
    }

    public CreatePipelineByAsyncRequest setCreateCommand(CreatePipelineByAsyncRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreatePipelineByAsyncRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreatePipelineByAsyncRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreatePipelineByAsyncRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class CreatePipelineByAsyncRequestContext extends TeaModel {
        /**
         * <p>The current operation environment. Valid values: DEV: development environment. PROD: production environment. For workflows, only PROD is currently supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The ID of the project to which the integration pipeline or workflow task belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static CreatePipelineByAsyncRequestContext build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineByAsyncRequestContext self = new CreatePipelineByAsyncRequestContext();
            return TeaModel.build(map, self);
        }

        public CreatePipelineByAsyncRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public CreatePipelineByAsyncRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class CreatePipelineByAsyncRequestCreateCommandNodeInfo extends TeaModel {
        /**
         * <p>The node directory of the integration pipeline task. Default value: root directory. The directory must exist. If it does not exist, call the relevant API operation to create a directory of the offlinePipeline type.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The ID of the pipeline file. Leave this parameter empty when creating a task for the first time. When updating a pipeline task, you must configure at least one of the following parameters: pipelineId, fileId, and nodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The ID of the schedule node for the pipeline task. Leave this parameter empty when creating a task for the first time. When updating a pipeline task, you must configure at least one of the following parameters: pipelineId, fileId, and nodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>n_123</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The name of the integration pipeline task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The ID of the pipeline task. Leave this parameter empty when creating a task for the first time. When updating a pipeline task, you must configure at least one of the following parameters: pipelineId, fileId, and nodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PipelineId")
        public Long pipelineId;

        public static CreatePipelineByAsyncRequestCreateCommandNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineByAsyncRequestCreateCommandNodeInfo self = new CreatePipelineByAsyncRequestCreateCommandNodeInfo();
            return TeaModel.build(map, self);
        }

        public CreatePipelineByAsyncRequestCreateCommandNodeInfo setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreatePipelineByAsyncRequestCreateCommandNodeInfo setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public CreatePipelineByAsyncRequestCreateCommandNodeInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreatePipelineByAsyncRequestCreateCommandNodeInfo setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public CreatePipelineByAsyncRequestCreateCommandNodeInfo setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

    }

    public static class CreatePipelineByAsyncRequestCreateCommandPipelineConfigHops extends TeaModel {
        /**
         * <p>For conditional distribution components, set this parameter to true if the downstream connection condition is true. Otherwise, set it to false. Ignore this parameter for workflow tasks.</p>
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

        public static CreatePipelineByAsyncRequestCreateCommandPipelineConfigHops build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineByAsyncRequestCreateCommandPipelineConfigHops self = new CreatePipelineByAsyncRequestCreateCommandPipelineConfigHops();
            return TeaModel.build(map, self);
        }

        public CreatePipelineByAsyncRequestCreateCommandPipelineConfigHops setSendTo(Boolean sendTo) {
            this.sendTo = sendTo;
            return this;
        }
        public Boolean getSendTo() {
            return this.sendTo;
        }

        public CreatePipelineByAsyncRequestCreateCommandPipelineConfigHops setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreatePipelineByAsyncRequestCreateCommandPipelineConfigHops setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class CreatePipelineByAsyncRequestCreateCommandPipelineConfigSteps extends TeaModel {
        /**
         * <p>The data distribution method when the current component has multiple downstream components. Valid values: true: distributes data from the current component to all downstream components in turn. For example, if the current component has 100 data records and two downstream components, each downstream component receives 50 data records. Default value: true. false: sends all data from the current component to all downstream components. For example, if the current component has 100 data records and two downstream components, both downstream components receive all 100 data records. Ignore this parameter for workflow tasks.</p>
         */
        @NameInMap("IsDistribute")
        public Boolean isDistribute;

        /**
         * <p>The plugin ID. Each plugin or operator has a unique identifier. Refer to the stepKey field in the com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig utility class. Developers must inherit this component or operator configuration class to implement the corresponding configuration. The structure of each component or operator configuration must be identical to the configuration structure created on the Dataphin page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysqlinput</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The specific component configuration in JSON string format. Refer to the toJsonString method of the relevant subclasses of com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig (for workflow operators, use com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.unstructured.BaseOAUnstructuredNeuronConfig). Developers must inherit this component or operator configuration class to implement the corresponding configuration. The structure of each component or operator configuration must be identical to the task configuration structure created on the Dataphin page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PluginConfig")
        public String pluginConfig;

        /**
         * <p>The step name. Step names must be unique within the same pipeline task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_reader</p>
         */
        @NameInMap("StepName")
        public String stepName;

        /**
         * <p>The component type. Valid values: input: input component. output: output component. transfrom: transform component. process: flow control component. For workflow tasks, this indicates the operator type, such as image for images and text for text. Refer to the stepType field in the com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig utility class. Developers must inherit this component or operator configuration class to implement the corresponding configuration. The structure of each component or operator configuration must be identical to the configuration structure created on the Dataphin page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("StepType")
        public String stepType;

        public static CreatePipelineByAsyncRequestCreateCommandPipelineConfigSteps build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineByAsyncRequestCreateCommandPipelineConfigSteps self = new CreatePipelineByAsyncRequestCreateCommandPipelineConfigSteps();
            return TeaModel.build(map, self);
        }

        public CreatePipelineByAsyncRequestCreateCommandPipelineConfigSteps setIsDistribute(Boolean isDistribute) {
            this.isDistribute = isDistribute;
            return this;
        }
        public Boolean getIsDistribute() {
            return this.isDistribute;
        }

        public CreatePipelineByAsyncRequestCreateCommandPipelineConfigSteps setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePipelineByAsyncRequestCreateCommandPipelineConfigSteps setPluginConfig(String pluginConfig) {
            this.pluginConfig = pluginConfig;
            return this;
        }
        public String getPluginConfig() {
            return this.pluginConfig;
        }

        public CreatePipelineByAsyncRequestCreateCommandPipelineConfigSteps setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public CreatePipelineByAsyncRequestCreateCommandPipelineConfigSteps setStepType(String stepType) {
            this.stepType = stepType;
            return this;
        }
        public String getStepType() {
            return this.stepType;
        }

    }

    public static class CreatePipelineByAsyncRequestCreateCommandPipelineConfig extends TeaModel {
        /**
         * <p>The directed acyclic graph (DAG) link configuration that describes the connection relationships among all components.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Hops")
        public java.util.List<CreatePipelineByAsyncRequestCreateCommandPipelineConfigHops> hops;

        /**
         * <p>The component or operator configurations, including the detailed configurations of all used components or operators.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Steps")
        public java.util.List<CreatePipelineByAsyncRequestCreateCommandPipelineConfigSteps> steps;

        public static CreatePipelineByAsyncRequestCreateCommandPipelineConfig build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineByAsyncRequestCreateCommandPipelineConfig self = new CreatePipelineByAsyncRequestCreateCommandPipelineConfig();
            return TeaModel.build(map, self);
        }

        public CreatePipelineByAsyncRequestCreateCommandPipelineConfig setHops(java.util.List<CreatePipelineByAsyncRequestCreateCommandPipelineConfigHops> hops) {
            this.hops = hops;
            return this;
        }
        public java.util.List<CreatePipelineByAsyncRequestCreateCommandPipelineConfigHops> getHops() {
            return this.hops;
        }

        public CreatePipelineByAsyncRequestCreateCommandPipelineConfig setSteps(java.util.List<CreatePipelineByAsyncRequestCreateCommandPipelineConfigSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<CreatePipelineByAsyncRequestCreateCommandPipelineConfigSteps> getSteps() {
            return this.steps;
        }

    }

    public static class CreatePipelineByAsyncRequestCreateCommand extends TeaModel {
        /**
         * <p>The comment.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The integration pipeline configuration mode. Valid values: PIPELINE: pipeline mode (default). JSON: script mode. Ignore this parameter for workflows.</p>
         * 
         * <strong>example:</strong>
         * <p>PIPELINE</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The basic information of the integration pipeline task.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeInfo")
        public CreatePipelineByAsyncRequestCreateCommandNodeInfo nodeInfo;

        /**
         * <p>The integration pipeline component or workflow operator configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("PipelineConfig")
        public CreatePipelineByAsyncRequestCreateCommandPipelineConfig pipelineConfig;

        /**
         * <p>The integration pipeline configuration in JSON string format for script mode. Workflow tasks do not support script mode.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PipelineJson")
        public String pipelineJson;

        /**
         * <p>The task type. Valid values: 0: offline integration (default). 1: real-time integration. 14: offline workflow task. 15: real-time workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PipelineType")
        public Integer pipelineType;

        /**
         * <p>The schedule configuration in JSON string format. Refer to the toJsonString method in the com.alibaba.dataphin.pipeline.common.facade.openapi.model.OAScheduleConfig utility class.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cronExpression&quot;:&quot;0 0 0 * * ?&quot;}</p>
         */
        @NameInMap("ScheduleConfig")
        public String scheduleConfig;

        /**
         * <p>The channel configuration in JSON string format. Refer to the toJsonString method in the com.alibaba.dataphin.pipeline.common.facade.openapi.model.OAPipelineSetting utility class.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Settings")
        public String settings;

        /**
         * <p>Specifies whether to submit the task. By default, the task is submitted.</p>
         */
        @NameInMap("Submit")
        public Boolean submit;

        public static CreatePipelineByAsyncRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineByAsyncRequestCreateCommand self = new CreatePipelineByAsyncRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreatePipelineByAsyncRequestCreateCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreatePipelineByAsyncRequestCreateCommand setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreatePipelineByAsyncRequestCreateCommand setNodeInfo(CreatePipelineByAsyncRequestCreateCommandNodeInfo nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public CreatePipelineByAsyncRequestCreateCommandNodeInfo getNodeInfo() {
            return this.nodeInfo;
        }

        public CreatePipelineByAsyncRequestCreateCommand setPipelineConfig(CreatePipelineByAsyncRequestCreateCommandPipelineConfig pipelineConfig) {
            this.pipelineConfig = pipelineConfig;
            return this;
        }
        public CreatePipelineByAsyncRequestCreateCommandPipelineConfig getPipelineConfig() {
            return this.pipelineConfig;
        }

        public CreatePipelineByAsyncRequestCreateCommand setPipelineJson(String pipelineJson) {
            this.pipelineJson = pipelineJson;
            return this;
        }
        public String getPipelineJson() {
            return this.pipelineJson;
        }

        public CreatePipelineByAsyncRequestCreateCommand setPipelineType(Integer pipelineType) {
            this.pipelineType = pipelineType;
            return this;
        }
        public Integer getPipelineType() {
            return this.pipelineType;
        }

        public CreatePipelineByAsyncRequestCreateCommand setScheduleConfig(String scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public String getScheduleConfig() {
            return this.scheduleConfig;
        }

        public CreatePipelineByAsyncRequestCreateCommand setSettings(String settings) {
            this.settings = settings;
            return this;
        }
        public String getSettings() {
            return this.settings;
        }

        public CreatePipelineByAsyncRequestCreateCommand setSubmit(Boolean submit) {
            this.submit = submit;
            return this;
        }
        public Boolean getSubmit() {
            return this.submit;
        }

    }

}
