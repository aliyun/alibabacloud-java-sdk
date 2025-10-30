// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPipelineByIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPipelineByIdResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPipelineByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineByIdResponseBody self = new GetPipelineByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPipelineByIdResponseBody setData(GetPipelineByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPipelineByIdResponseBodyData getData() {
        return this.data;
    }

    public GetPipelineByIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPipelineByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPipelineByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPipelineByIdResponseBodyDataNodeInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Desc")
        public String desc;

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

        public static GetPipelineByIdResponseBodyDataNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineByIdResponseBodyDataNodeInfo self = new GetPipelineByIdResponseBodyDataNodeInfo();
            return TeaModel.build(map, self);
        }

        public GetPipelineByIdResponseBodyDataNodeInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetPipelineByIdResponseBodyDataNodeInfo setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public GetPipelineByIdResponseBodyDataNodeInfo setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetPipelineByIdResponseBodyDataNodeInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetPipelineByIdResponseBodyDataNodeInfo setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetPipelineByIdResponseBodyDataNodeInfo setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

    }

    public static class GetPipelineByIdResponseBodyDataPipelineConfigHops extends TeaModel {
        @NameInMap("SendTo")
        public Boolean sendTo;

        /**
         * <strong>example:</strong>
         * <p>mysql_reader</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>odps_writer</p>
         */
        @NameInMap("Target")
        public String target;

        public static GetPipelineByIdResponseBodyDataPipelineConfigHops build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineByIdResponseBodyDataPipelineConfigHops self = new GetPipelineByIdResponseBodyDataPipelineConfigHops();
            return TeaModel.build(map, self);
        }

        public GetPipelineByIdResponseBodyDataPipelineConfigHops setSendTo(Boolean sendTo) {
            this.sendTo = sendTo;
            return this;
        }
        public Boolean getSendTo() {
            return this.sendTo;
        }

        public GetPipelineByIdResponseBodyDataPipelineConfigHops setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetPipelineByIdResponseBodyDataPipelineConfigHops setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class GetPipelineByIdResponseBodyDataPipelineConfigSteps extends TeaModel {
        @NameInMap("IsDistribute")
        public Boolean isDistribute;

        /**
         * <strong>example:</strong>
         * <p>mysqlinput</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PluginConfig")
        public String pluginConfig;

        /**
         * <strong>example:</strong>
         * <p>mysql_reader</p>
         */
        @NameInMap("StepName")
        public String stepName;

        /**
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("StepType")
        public String stepType;

        public static GetPipelineByIdResponseBodyDataPipelineConfigSteps build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineByIdResponseBodyDataPipelineConfigSteps self = new GetPipelineByIdResponseBodyDataPipelineConfigSteps();
            return TeaModel.build(map, self);
        }

        public GetPipelineByIdResponseBodyDataPipelineConfigSteps setIsDistribute(Boolean isDistribute) {
            this.isDistribute = isDistribute;
            return this;
        }
        public Boolean getIsDistribute() {
            return this.isDistribute;
        }

        public GetPipelineByIdResponseBodyDataPipelineConfigSteps setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetPipelineByIdResponseBodyDataPipelineConfigSteps setPluginConfig(String pluginConfig) {
            this.pluginConfig = pluginConfig;
            return this;
        }
        public String getPluginConfig() {
            return this.pluginConfig;
        }

        public GetPipelineByIdResponseBodyDataPipelineConfigSteps setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public GetPipelineByIdResponseBodyDataPipelineConfigSteps setStepType(String stepType) {
            this.stepType = stepType;
            return this;
        }
        public String getStepType() {
            return this.stepType;
        }

    }

    public static class GetPipelineByIdResponseBodyDataPipelineConfig extends TeaModel {
        @NameInMap("Hops")
        public java.util.List<GetPipelineByIdResponseBodyDataPipelineConfigHops> hops;

        @NameInMap("Steps")
        public java.util.List<GetPipelineByIdResponseBodyDataPipelineConfigSteps> steps;

        public static GetPipelineByIdResponseBodyDataPipelineConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineByIdResponseBodyDataPipelineConfig self = new GetPipelineByIdResponseBodyDataPipelineConfig();
            return TeaModel.build(map, self);
        }

        public GetPipelineByIdResponseBodyDataPipelineConfig setHops(java.util.List<GetPipelineByIdResponseBodyDataPipelineConfigHops> hops) {
            this.hops = hops;
            return this;
        }
        public java.util.List<GetPipelineByIdResponseBodyDataPipelineConfigHops> getHops() {
            return this.hops;
        }

        public GetPipelineByIdResponseBodyDataPipelineConfig setSteps(java.util.List<GetPipelineByIdResponseBodyDataPipelineConfigSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<GetPipelineByIdResponseBodyDataPipelineConfigSteps> getSteps() {
            return this.steps;
        }

    }

    public static class GetPipelineByIdResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PIPELINE</p>
         */
        @NameInMap("Mode")
        public String mode;

        @NameInMap("NodeInfo")
        public GetPipelineByIdResponseBodyDataNodeInfo nodeInfo;

        @NameInMap("PipelineConfig")
        public GetPipelineByIdResponseBodyDataPipelineConfig pipelineConfig;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PipelineJson")
        public String pipelineJson;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PipelineType")
        public Integer pipelineType;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ScheduleConfig")
        public String scheduleConfig;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Settings")
        public String settings;

        public static GetPipelineByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineByIdResponseBodyData self = new GetPipelineByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPipelineByIdResponseBodyData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetPipelineByIdResponseBodyData setNodeInfo(GetPipelineByIdResponseBodyDataNodeInfo nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public GetPipelineByIdResponseBodyDataNodeInfo getNodeInfo() {
            return this.nodeInfo;
        }

        public GetPipelineByIdResponseBodyData setPipelineConfig(GetPipelineByIdResponseBodyDataPipelineConfig pipelineConfig) {
            this.pipelineConfig = pipelineConfig;
            return this;
        }
        public GetPipelineByIdResponseBodyDataPipelineConfig getPipelineConfig() {
            return this.pipelineConfig;
        }

        public GetPipelineByIdResponseBodyData setPipelineJson(String pipelineJson) {
            this.pipelineJson = pipelineJson;
            return this;
        }
        public String getPipelineJson() {
            return this.pipelineJson;
        }

        public GetPipelineByIdResponseBodyData setPipelineType(Integer pipelineType) {
            this.pipelineType = pipelineType;
            return this;
        }
        public Integer getPipelineType() {
            return this.pipelineType;
        }

        public GetPipelineByIdResponseBodyData setScheduleConfig(String scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public String getScheduleConfig() {
            return this.scheduleConfig;
        }

        public GetPipelineByIdResponseBodyData setSettings(String settings) {
            this.settings = settings;
            return this;
        }
        public String getSettings() {
            return this.settings;
        }

    }

}
