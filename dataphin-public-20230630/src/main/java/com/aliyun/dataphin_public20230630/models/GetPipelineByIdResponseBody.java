// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPipelineByIdResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The pipeline task details.</p>
     */
    @NameInMap("Data")
    public GetPipelineByIdResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error details returned by the backend.</p>
     * 
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
     * <p>Indicates whether the request was successful.</p>
     * 
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
         * <p>The task description.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The folder of the integration pipeline task node. The default value is the root folder. The folder must exist. If it does not exist, call the relevant API operation to create a folder of the offlinePipeline type.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The pipeline file ID. This parameter is empty when the task is first created. When updating a pipeline task, specify at least one of pipelineId, fileId, or nodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The scheduling node ID of the pipeline task. This parameter is empty when the task is first created. When updating a pipeline task, specify at least one of pipelineId, fileId, or nodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>n_123</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The name of the integration pipeline task.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The pipeline task ID. This parameter is empty when the task is first created. When updating a pipeline task, specify at least one of pipelineId, fileId, or nodeId.</p>
         * 
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
        /**
         * <p>For conditional distribution components, set this parameter to true when the downstream condition is true. Otherwise, set it to false.</p>
         */
        @NameInMap("SendTo")
        public Boolean sendTo;

        /**
         * <p>The input step name, which corresponds to Steps[*].StepName.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_reader</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The output step name, which corresponds to Steps[*].StepName.</p>
         * 
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
        /**
         * <p>Specifies the data distribution method when the current component has multiple downstream components. Valid values:</p>
         * <ul>
         * <li>true: The data of the current component is sent to all downstream components in a round-robin manner. For example, if the current component has 100 records and two downstream components, each downstream component receives 50 records. Default value: true.</li>
         * <li>false: The full data of the current component is sent to all downstream components. For example, if the current component has 100 records and two downstream components, each downstream component receives 100 records.</li>
         * </ul>
         */
        @NameInMap("IsDistribute")
        public Boolean isDistribute;

        /**
         * <p>The plugin ID. Each plugin has a unique identifier. Refer to the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig#stepKey. Developers should inherit this component configuration class and implement the corresponding component configuration. Each component configuration has the same structure as the pipeline configuration created on the Dataphin console.</p>
         * 
         * <strong>example:</strong>
         * <p>mysqlinput</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The specific component configuration in JSON string format. Refer to the toJsonString method of the subclasses of the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig. Developers should inherit this component configuration class and implement the corresponding component configuration. Each component configuration has the same structure as the pipeline configuration created on the Dataphin console.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PluginConfig")
        public String pluginConfig;

        /**
         * <p>The step name. Step names must be unique within the same pipeline task.</p>
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
         * <li>transfrom: a transformation component.</li>
         * <li>process: a flow control component.
         * Refer to the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig#stepType. Developers should inherit this component configuration class and implement the corresponding component configuration. Each component configuration has the same structure as the pipeline configuration created on the Dataphin console.</li>
         * </ul>
         * 
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
        /**
         * <p>The DAG (directed acyclic graph) link configuration that describes the connections between all components.</p>
         */
        @NameInMap("Hops")
        public java.util.List<GetPipelineByIdResponseBodyDataPipelineConfigHops> hops;

        /**
         * <p>The component configurations, including detailed configurations of all components used.</p>
         */
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
         * <p>The configuration mode of the integration pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>PIPELINE</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The basic information of the pipeline task.</p>
         */
        @NameInMap("NodeInfo")
        public GetPipelineByIdResponseBodyDataNodeInfo nodeInfo;

        /**
         * <p>The component configuration of the integration pipeline.</p>
         */
        @NameInMap("PipelineConfig")
        public GetPipelineByIdResponseBodyDataPipelineConfig pipelineConfig;

        /**
         * <p>The script mode configuration of the integration pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PipelineJson")
        public String pipelineJson;

        /**
         * <p>The pipeline task type.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PipelineType")
        public Integer pipelineType;

        /**
         * <p>The schedule configuration of the integration pipeline. The value is a JSON string. Deserialize it by using the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.vo.OAScheduleConfigVO.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ScheduleConfig")
        public String scheduleConfig;

        /**
         * <p>The channel configuration of the integration pipeline. The value is a JSON string. Deserialize it by using the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.OAPipelineSetting.</p>
         * 
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
