// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreatePipelineRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public CreatePipelineRequestContext context;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreatePipelineRequestCreateCommand createCommand;

    /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
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
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <strong>example:</strong>
         * <p>n_123</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
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
        @NameInMap("SendTo")
        public Boolean sendTo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_reader</p>
         */
        @NameInMap("Source")
        public String source;

        /**
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
        @NameInMap("IsDistribute")
        public Boolean isDistribute;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysqlinput</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PluginConfig")
        public String pluginConfig;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_reader</p>
         */
        @NameInMap("StepName")
        public String stepName;

        /**
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("Hops")
        public java.util.List<CreatePipelineRequestCreateCommandPipelineConfigHops> hops;

        /**
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
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>PIPELINE</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeInfo")
        public CreatePipelineRequestCreateCommandNodeInfo nodeInfo;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("PipelineConfig")
        public CreatePipelineRequestCreateCommandPipelineConfig pipelineConfig;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PipelineJson")
        public String pipelineJson;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PipelineType")
        public Integer pipelineType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cronExpression&quot;:&quot;0 0 0 * * ?&quot;}</p>
         */
        @NameInMap("ScheduleConfig")
        public String scheduleConfig;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Settings")
        public String settings;

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
