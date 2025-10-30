// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdatePipelineByAsyncRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public UpdatePipelineByAsyncRequestContext context;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdatePipelineByAsyncRequestUpdateCommand updateCommand;

    public static UpdatePipelineByAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineByAsyncRequest self = new UpdatePipelineByAsyncRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineByAsyncRequest setContext(UpdatePipelineByAsyncRequestContext context) {
        this.context = context;
        return this;
    }
    public UpdatePipelineByAsyncRequestContext getContext() {
        return this.context;
    }

    public UpdatePipelineByAsyncRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdatePipelineByAsyncRequest setUpdateCommand(UpdatePipelineByAsyncRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdatePipelineByAsyncRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdatePipelineByAsyncRequestContext extends TeaModel {
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

        public static UpdatePipelineByAsyncRequestContext build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineByAsyncRequestContext self = new UpdatePipelineByAsyncRequestContext();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineByAsyncRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public UpdatePipelineByAsyncRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class UpdatePipelineByAsyncRequestUpdateCommandNodeInfo extends TeaModel {
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

        public static UpdatePipelineByAsyncRequestUpdateCommandNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineByAsyncRequestUpdateCommandNodeInfo self = new UpdatePipelineByAsyncRequestUpdateCommandNodeInfo();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineByAsyncRequestUpdateCommandNodeInfo setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public UpdatePipelineByAsyncRequestUpdateCommandNodeInfo setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public UpdatePipelineByAsyncRequestUpdateCommandNodeInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public UpdatePipelineByAsyncRequestUpdateCommandNodeInfo setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public UpdatePipelineByAsyncRequestUpdateCommandNodeInfo setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

    }

    public static class UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigHops extends TeaModel {
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

        public static UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigHops build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigHops self = new UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigHops();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigHops setSendTo(Boolean sendTo) {
            this.sendTo = sendTo;
            return this;
        }
        public Boolean getSendTo() {
            return this.sendTo;
        }

        public UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigHops setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigHops setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigSteps extends TeaModel {
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

        public static UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigSteps build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigSteps self = new UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigSteps();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigSteps setIsDistribute(Boolean isDistribute) {
            this.isDistribute = isDistribute;
            return this;
        }
        public Boolean getIsDistribute() {
            return this.isDistribute;
        }

        public UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigSteps setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigSteps setPluginConfig(String pluginConfig) {
            this.pluginConfig = pluginConfig;
            return this;
        }
        public String getPluginConfig() {
            return this.pluginConfig;
        }

        public UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigSteps setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigSteps setStepType(String stepType) {
            this.stepType = stepType;
            return this;
        }
        public String getStepType() {
            return this.stepType;
        }

    }

    public static class UpdatePipelineByAsyncRequestUpdateCommandPipelineConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Hops")
        public java.util.List<UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigHops> hops;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Steps")
        public java.util.List<UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigSteps> steps;

        public static UpdatePipelineByAsyncRequestUpdateCommandPipelineConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineByAsyncRequestUpdateCommandPipelineConfig self = new UpdatePipelineByAsyncRequestUpdateCommandPipelineConfig();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineByAsyncRequestUpdateCommandPipelineConfig setHops(java.util.List<UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigHops> hops) {
            this.hops = hops;
            return this;
        }
        public java.util.List<UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigHops> getHops() {
            return this.hops;
        }

        public UpdatePipelineByAsyncRequestUpdateCommandPipelineConfig setSteps(java.util.List<UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<UpdatePipelineByAsyncRequestUpdateCommandPipelineConfigSteps> getSteps() {
            return this.steps;
        }

    }

    public static class UpdatePipelineByAsyncRequestUpdateCommand extends TeaModel {
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
        public UpdatePipelineByAsyncRequestUpdateCommandNodeInfo nodeInfo;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("PipelineConfig")
        public UpdatePipelineByAsyncRequestUpdateCommandPipelineConfig pipelineConfig;

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

        public static UpdatePipelineByAsyncRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineByAsyncRequestUpdateCommand self = new UpdatePipelineByAsyncRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineByAsyncRequestUpdateCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UpdatePipelineByAsyncRequestUpdateCommand setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public UpdatePipelineByAsyncRequestUpdateCommand setNodeInfo(UpdatePipelineByAsyncRequestUpdateCommandNodeInfo nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public UpdatePipelineByAsyncRequestUpdateCommandNodeInfo getNodeInfo() {
            return this.nodeInfo;
        }

        public UpdatePipelineByAsyncRequestUpdateCommand setPipelineConfig(UpdatePipelineByAsyncRequestUpdateCommandPipelineConfig pipelineConfig) {
            this.pipelineConfig = pipelineConfig;
            return this;
        }
        public UpdatePipelineByAsyncRequestUpdateCommandPipelineConfig getPipelineConfig() {
            return this.pipelineConfig;
        }

        public UpdatePipelineByAsyncRequestUpdateCommand setPipelineJson(String pipelineJson) {
            this.pipelineJson = pipelineJson;
            return this;
        }
        public String getPipelineJson() {
            return this.pipelineJson;
        }

        public UpdatePipelineByAsyncRequestUpdateCommand setPipelineType(Integer pipelineType) {
            this.pipelineType = pipelineType;
            return this;
        }
        public Integer getPipelineType() {
            return this.pipelineType;
        }

        public UpdatePipelineByAsyncRequestUpdateCommand setScheduleConfig(String scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public String getScheduleConfig() {
            return this.scheduleConfig;
        }

        public UpdatePipelineByAsyncRequestUpdateCommand setSettings(String settings) {
            this.settings = settings;
            return this;
        }
        public String getSettings() {
            return this.settings;
        }

        public UpdatePipelineByAsyncRequestUpdateCommand setSubmit(Boolean submit) {
            this.submit = submit;
            return this;
        }
        public Boolean getSubmit() {
            return this.submit;
        }

    }

}
