// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreatePipelineRequest extends TeaModel {
    /**
     * <p>Request context information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public CreatePipelineRequestContext context;

    /**
     * <p>Pipeline/workflow task creation configuration</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreatePipelineRequestCreateCommand createCommand;

    /**
     * <p>Tenant ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

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

    public static class CreatePipelineRequestContext extends TeaModel {
        /**
         * <p>Current operating environment: DEV indicates the development environment, PROD indicates the production environment (for workflows, only PROD is currently supported)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>Project ID to which the integration pipeline/workflow task belongs</p>
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
         * <p>Directory of the integration pipeline/workflow task node (defaults to root directory). The directory must exist. If it does not exist, call the relevant API to create a directory of type offlinePipeline (or unstructuredPipeline for workflows)</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>Pipeline/workflow file ID. Leave empty for initial creation. When updating a pipeline/workflow task, at least one of pipelineId, fileId, or nodeId must be specified</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>Scheduling node ID of the pipeline/workflow task. Leave empty for initial creation. When updating a pipeline/workflow task, at least one of pipelineId, fileId, or nodeId must be specified</p>
         * 
         * <strong>example:</strong>
         * <p>n_123</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Integration pipeline/workflow task name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>Pipeline/workflow task ID. Leave empty for initial creation. When updating a pipeline/workflow task, at least one of pipelineId, fileId, or nodeId must be specified</p>
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
         * <p>For conditional distribution components, set to true when the downstream condition is true, otherwise set to false.
         * For workflow tasks, this can be ignored.</p>
         */
        @NameInMap("SendTo")
        public Boolean sendTo;

        /**
         * <p>Input step name, i.e., Steps[*].StepName</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_reader</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>Output step name, i.e., Steps[*].StepName</p>
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
         * <p>Indicates the data distribution method when the current component has multiple downstream components:
         * true indicates that data from the current component is sent to all downstream components in a round-robin manner. For example, if the current component has 100 records and two downstream components, each downstream component receives 50 records. The default value is true.
         * false indicates that data from the current component is sent in full to all downstream components. For example, if the current component has 100 records and two downstream components, both downstream components receive all 100 records.
         * For workflow tasks, this value can be ignored.</p>
         */
        @NameInMap("IsDistribute")
        public Boolean isDistribute;

        /**
         * <p>Plugin/operator ID. Each plugin/operator has a unique identifier. Refer to the utility class: com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig#stepKey. Developers should inherit this component/operator configuration class and implement the corresponding component/operator configuration. Each component/operator configuration has the same structure as the configuration created on the Dataphin page</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysqlinput</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Specific component configuration in JSON string format. Refer to the utility class: subclasses of com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig (for workflow operators, use com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.unstructured.BaseOAUnstructuredNeuronConfig) and their toJsonString method. Developers should inherit this component/operator configuration class and implement the corresponding component/operator configuration. Each component/operator configuration has the same structure as the task configuration created on the Dataphin page</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PluginConfig")
        public String pluginConfig;

        /**
         * <p>Step name. Step names must be unique within the same pipeline task</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_reader</p>
         */
        @NameInMap("StepName")
        public String stepName;

        /**
         * <p>Component type: input indicates an input component, output indicates an output component, transfrom indicates a transform component, process indicates a flow control component. For workflow tasks, this indicates the operator type, such as image for image, text for text. Refer to the utility class: com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig#stepType. Developers should inherit this component/operator configuration class and implement the corresponding component/operator configuration. Each component/operator configuration has the same structure as the configuration created on the Dataphin page</p>
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
         * <p>DAG (directed acyclic graph) link configuration: describes the connections between all components/operators</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Hops")
        public java.util.List<CreatePipelineRequestCreateCommandPipelineConfigHops> hops;

        /**
         * <p>Component/operator configuration: contains detailed configuration of all components/operators used</p>
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
         * <p>Comment</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Integration pipeline configuration mode: PIPELINE indicates pipeline mode (default), JSON indicates script mode.
         * For workflows, this can be ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>PIPELINE</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>Integration pipeline/workflow task basic information</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeInfo")
        public CreatePipelineRequestCreateCommandNodeInfo nodeInfo;

        /**
         * <p>Integration pipeline component/workflow operator configuration</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("PipelineConfig")
        public CreatePipelineRequestCreateCommandPipelineConfig pipelineConfig;

        /**
         * <p>In script mode: integration pipeline configuration (in JSON string format).
         * Workflow tasks do not support script mode</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PipelineJson")
        public String pipelineJson;

        /**
         * <p>Task type: 0 indicates offline integration (default), 1 indicates real-time integration, 14 indicates a workflow task</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PipelineType")
        public Integer pipelineType;

        /**
         * <p>Scheduling configuration in JSON string format. Refer to the utility class: com.alibaba.dataphin.pipeline.common.facade.openapi.model.OAScheduleConfig#toJsonString method</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cronExpression&quot;:&quot;0 0 0 * * ?&quot;}</p>
         */
        @NameInMap("ScheduleConfig")
        public String scheduleConfig;

        /**
         * <p>Channel configuration in JSON string format. Refer to the utility class: com.alibaba.dataphin.pipeline.common.facade.openapi.model.OAPipelineSetting#toJsonString method</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Settings")
        public String settings;

        /**
         * <p>Whether to submit. Submitted by default</p>
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
