// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreatePipelineByAsyncRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public CreatePipelineByAsyncRequestContext context;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreatePipelineByAsyncRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

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

    public static class CreatePipelineByAsyncRequestContext extends TeaModel {
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("Hops")
        public java.util.List<CreatePipelineByAsyncRequestCreateCommandPipelineConfigHops> hops;

        /**
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
        public CreatePipelineByAsyncRequestCreateCommandNodeInfo nodeInfo;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("PipelineConfig")
        public CreatePipelineByAsyncRequestCreateCommandPipelineConfig pipelineConfig;

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
