// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class CameraConsoleDebugStreamRequest extends TeaModel {
    @NameInMap("config")
    public CameraConsoleDebugStreamRequestConfig config;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("input")
    public CameraConsoleDebugStreamRequestInput input;

    /**
     * <strong>example:</strong>
     * <p>CAMERA_...</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("parameters")
    public CameraConsoleDebugStreamRequestParameters parameters;

    /**
     * <p>请求 ID 优先级：可信 POP 注入的 x-acs-request-id、非空 X-QI-Request-Id Header、Body.requestId。没有前两者时 Body.requestId 必填；没有可信 POP ID 时 Header 与 Body.requestId 至少提供一个。 格式同 sessionId。成功重放还须复用原 Session；已记录为失败的请求须换新 Request ID。</p>
     * 
     * <strong>example:</strong>
     * <p>debug-request-001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>person_scan</p>
     */
    @NameInMap("scenario")
    public String scenario;

    /**
     * <strong>example:</strong>
     * <p>debug-session-001</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static CameraConsoleDebugStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        CameraConsoleDebugStreamRequest self = new CameraConsoleDebugStreamRequest();
        return TeaModel.build(map, self);
    }

    public CameraConsoleDebugStreamRequest setConfig(CameraConsoleDebugStreamRequestConfig config) {
        this.config = config;
        return this;
    }
    public CameraConsoleDebugStreamRequestConfig getConfig() {
        return this.config;
    }

    public CameraConsoleDebugStreamRequest setInput(CameraConsoleDebugStreamRequestInput input) {
        this.input = input;
        return this;
    }
    public CameraConsoleDebugStreamRequestInput getInput() {
        return this.input;
    }

    public CameraConsoleDebugStreamRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CameraConsoleDebugStreamRequest setParameters(CameraConsoleDebugStreamRequestParameters parameters) {
        this.parameters = parameters;
        return this;
    }
    public CameraConsoleDebugStreamRequestParameters getParameters() {
        return this.parameters;
    }

    public CameraConsoleDebugStreamRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CameraConsoleDebugStreamRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public CameraConsoleDebugStreamRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public static class CameraConsoleDebugStreamRequestConfigExtensionConfigCamera extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.65</p>
         */
        @NameInMap("headMaxHeightRatio")
        public Double headMaxHeightRatio;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("headMinHeightRatio")
        public Double headMinHeightRatio;

        /**
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("minConfidence")
        public Double minConfidence;

        /**
         * <strong>example:</strong>
         * <p>person</p>
         */
        @NameInMap("scenario")
        public String scenario;

        public static CameraConsoleDebugStreamRequestConfigExtensionConfigCamera build(java.util.Map<String, ?> map) throws Exception {
            CameraConsoleDebugStreamRequestConfigExtensionConfigCamera self = new CameraConsoleDebugStreamRequestConfigExtensionConfigCamera();
            return TeaModel.build(map, self);
        }

        public CameraConsoleDebugStreamRequestConfigExtensionConfigCamera setHeadMaxHeightRatio(Double headMaxHeightRatio) {
            this.headMaxHeightRatio = headMaxHeightRatio;
            return this;
        }
        public Double getHeadMaxHeightRatio() {
            return this.headMaxHeightRatio;
        }

        public CameraConsoleDebugStreamRequestConfigExtensionConfigCamera setHeadMinHeightRatio(Double headMinHeightRatio) {
            this.headMinHeightRatio = headMinHeightRatio;
            return this;
        }
        public Double getHeadMinHeightRatio() {
            return this.headMinHeightRatio;
        }

        public CameraConsoleDebugStreamRequestConfigExtensionConfigCamera setMinConfidence(Double minConfidence) {
            this.minConfidence = minConfidence;
            return this;
        }
        public Double getMinConfidence() {
            return this.minConfidence;
        }

        public CameraConsoleDebugStreamRequestConfigExtensionConfigCamera setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

    }

    public static class CameraConsoleDebugStreamRequestConfigExtensionConfigPersonScan extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.65</p>
         */
        @NameInMap("maxHeightRatio")
        public Double maxHeightRatio;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("minHeightRatio")
        public Double minHeightRatio;

        /**
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("minScore")
        public Double minScore;

        public static CameraConsoleDebugStreamRequestConfigExtensionConfigPersonScan build(java.util.Map<String, ?> map) throws Exception {
            CameraConsoleDebugStreamRequestConfigExtensionConfigPersonScan self = new CameraConsoleDebugStreamRequestConfigExtensionConfigPersonScan();
            return TeaModel.build(map, self);
        }

        public CameraConsoleDebugStreamRequestConfigExtensionConfigPersonScan setMaxHeightRatio(Double maxHeightRatio) {
            this.maxHeightRatio = maxHeightRatio;
            return this;
        }
        public Double getMaxHeightRatio() {
            return this.maxHeightRatio;
        }

        public CameraConsoleDebugStreamRequestConfigExtensionConfigPersonScan setMinHeightRatio(Double minHeightRatio) {
            this.minHeightRatio = minHeightRatio;
            return this;
        }
        public Double getMinHeightRatio() {
            return this.minHeightRatio;
        }

        public CameraConsoleDebugStreamRequestConfigExtensionConfigPersonScan setMinScore(Double minScore) {
            this.minScore = minScore;
            return this;
        }
        public Double getMinScore() {
            return this.minScore;
        }

    }

    public static class CameraConsoleDebugStreamRequestConfigExtensionConfig extends TeaModel {
        @NameInMap("camera")
        public CameraConsoleDebugStreamRequestConfigExtensionConfigCamera camera;

        @NameInMap("personScan")
        public CameraConsoleDebugStreamRequestConfigExtensionConfigPersonScan personScan;

        /**
         * <strong>example:</strong>
         * <p>person_scan</p>
         */
        @NameInMap("scenario")
        public String scenario;

        public static CameraConsoleDebugStreamRequestConfigExtensionConfig build(java.util.Map<String, ?> map) throws Exception {
            CameraConsoleDebugStreamRequestConfigExtensionConfig self = new CameraConsoleDebugStreamRequestConfigExtensionConfig();
            return TeaModel.build(map, self);
        }

        public CameraConsoleDebugStreamRequestConfigExtensionConfig setCamera(CameraConsoleDebugStreamRequestConfigExtensionConfigCamera camera) {
            this.camera = camera;
            return this;
        }
        public CameraConsoleDebugStreamRequestConfigExtensionConfigCamera getCamera() {
            return this.camera;
        }

        public CameraConsoleDebugStreamRequestConfigExtensionConfig setPersonScan(CameraConsoleDebugStreamRequestConfigExtensionConfigPersonScan personScan) {
            this.personScan = personScan;
            return this;
        }
        public CameraConsoleDebugStreamRequestConfigExtensionConfigPersonScan getPersonScan() {
            return this.personScan;
        }

        public CameraConsoleDebugStreamRequestConfigExtensionConfig setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

    }

    public static class CameraConsoleDebugStreamRequestConfigModel extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&lt;主模型目录ID&gt;</p>
         */
        @NameInMap("catalogModelId")
        public String catalogModelId;

        public static CameraConsoleDebugStreamRequestConfigModel build(java.util.Map<String, ?> map) throws Exception {
            CameraConsoleDebugStreamRequestConfigModel self = new CameraConsoleDebugStreamRequestConfigModel();
            return TeaModel.build(map, self);
        }

        public CameraConsoleDebugStreamRequestConfigModel setCatalogModelId(String catalogModelId) {
            this.catalogModelId = catalogModelId;
            return this;
        }
        public String getCatalogModelId() {
            return this.catalogModelId;
        }

    }

    public static class CameraConsoleDebugStreamRequestConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CAMERA</p>
         */
        @NameInMap("agentType")
        public String agentType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CameraStandard</p>
         */
        @NameInMap("apiName")
        public String apiName;

        @NameInMap("extensionConfig")
        public CameraConsoleDebugStreamRequestConfigExtensionConfig extensionConfig;

        @NameInMap("instructions")
        public String instructions;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("maxIterations")
        public Integer maxIterations;

        @NameInMap("model")
        public CameraConsoleDebugStreamRequestConfigModel model;

        public static CameraConsoleDebugStreamRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            CameraConsoleDebugStreamRequestConfig self = new CameraConsoleDebugStreamRequestConfig();
            return TeaModel.build(map, self);
        }

        public CameraConsoleDebugStreamRequestConfig setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public CameraConsoleDebugStreamRequestConfig setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public CameraConsoleDebugStreamRequestConfig setExtensionConfig(CameraConsoleDebugStreamRequestConfigExtensionConfig extensionConfig) {
            this.extensionConfig = extensionConfig;
            return this;
        }
        public CameraConsoleDebugStreamRequestConfigExtensionConfig getExtensionConfig() {
            return this.extensionConfig;
        }

        public CameraConsoleDebugStreamRequestConfig setInstructions(String instructions) {
            this.instructions = instructions;
            return this;
        }
        public String getInstructions() {
            return this.instructions;
        }

        public CameraConsoleDebugStreamRequestConfig setMaxIterations(Integer maxIterations) {
            this.maxIterations = maxIterations;
            return this;
        }
        public Integer getMaxIterations() {
            return this.maxIterations;
        }

        public CameraConsoleDebugStreamRequestConfig setModel(CameraConsoleDebugStreamRequestConfigModel model) {
            this.model = model;
            return this;
        }
        public CameraConsoleDebugStreamRequestConfigModel getModel() {
            return this.model;
        }

    }

    public static class CameraConsoleDebugStreamRequestInputMessagesContentImageUrl extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/images/person.jpg">https://example.com/images/person.jpg</a></p>
         */
        @NameInMap("url")
        public String url;

        public static CameraConsoleDebugStreamRequestInputMessagesContentImageUrl build(java.util.Map<String, ?> map) throws Exception {
            CameraConsoleDebugStreamRequestInputMessagesContentImageUrl self = new CameraConsoleDebugStreamRequestInputMessagesContentImageUrl();
            return TeaModel.build(map, self);
        }

        public CameraConsoleDebugStreamRequestInputMessagesContentImageUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CameraConsoleDebugStreamRequestInputMessagesContent extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("imageUrl")
        public CameraConsoleDebugStreamRequestInputMessagesContentImageUrl imageUrl;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>image_url</p>
         */
        @NameInMap("type")
        public String type;

        public static CameraConsoleDebugStreamRequestInputMessagesContent build(java.util.Map<String, ?> map) throws Exception {
            CameraConsoleDebugStreamRequestInputMessagesContent self = new CameraConsoleDebugStreamRequestInputMessagesContent();
            return TeaModel.build(map, self);
        }

        public CameraConsoleDebugStreamRequestInputMessagesContent setImageUrl(CameraConsoleDebugStreamRequestInputMessagesContentImageUrl imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public CameraConsoleDebugStreamRequestInputMessagesContentImageUrl getImageUrl() {
            return this.imageUrl;
        }

        public CameraConsoleDebugStreamRequestInputMessagesContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CameraConsoleDebugStreamRequestInputMessages extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("content")
        public java.util.List<CameraConsoleDebugStreamRequestInputMessagesContent> content;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static CameraConsoleDebugStreamRequestInputMessages build(java.util.Map<String, ?> map) throws Exception {
            CameraConsoleDebugStreamRequestInputMessages self = new CameraConsoleDebugStreamRequestInputMessages();
            return TeaModel.build(map, self);
        }

        public CameraConsoleDebugStreamRequestInputMessages setContent(java.util.List<CameraConsoleDebugStreamRequestInputMessagesContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<CameraConsoleDebugStreamRequestInputMessagesContent> getContent() {
            return this.content;
        }

        public CameraConsoleDebugStreamRequestInputMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class CameraConsoleDebugStreamRequestInput extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:[{&quot;type&quot;:&quot;image_url&quot;,&quot;image_url&quot;:{&quot;url&quot;:&quot;<a href="https://example.com/images/person.jpg%22%7D%7D%5D%7D%5D">https://example.com/images/person.jpg&quot;}}]}]</a></p>
         */
        @NameInMap("messages")
        public java.util.List<CameraConsoleDebugStreamRequestInputMessages> messages;

        /**
         * <strong>example:</strong>
         * <p>meeting-room-001</p>
         */
        @NameInMap("sceneId")
        public String sceneId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("stream")
        public Boolean stream;

        public static CameraConsoleDebugStreamRequestInput build(java.util.Map<String, ?> map) throws Exception {
            CameraConsoleDebugStreamRequestInput self = new CameraConsoleDebugStreamRequestInput();
            return TeaModel.build(map, self);
        }

        public CameraConsoleDebugStreamRequestInput setMessages(java.util.List<CameraConsoleDebugStreamRequestInputMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<CameraConsoleDebugStreamRequestInputMessages> getMessages() {
            return this.messages;
        }

        public CameraConsoleDebugStreamRequestInput setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public CameraConsoleDebugStreamRequestInput setStream(Boolean stream) {
            this.stream = stream;
            return this;
        }
        public Boolean getStream() {
            return this.stream;
        }

    }

    public static class CameraConsoleDebugStreamRequestParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.65</p>
         */
        @NameInMap("maxHeightRatio")
        public Double maxHeightRatio;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("minHeightRatio")
        public Double minHeightRatio;

        /**
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("minScore")
        public Double minScore;

        public static CameraConsoleDebugStreamRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CameraConsoleDebugStreamRequestParameters self = new CameraConsoleDebugStreamRequestParameters();
            return TeaModel.build(map, self);
        }

        public CameraConsoleDebugStreamRequestParameters setMaxHeightRatio(Double maxHeightRatio) {
            this.maxHeightRatio = maxHeightRatio;
            return this;
        }
        public Double getMaxHeightRatio() {
            return this.maxHeightRatio;
        }

        public CameraConsoleDebugStreamRequestParameters setMinHeightRatio(Double minHeightRatio) {
            this.minHeightRatio = minHeightRatio;
            return this;
        }
        public Double getMinHeightRatio() {
            return this.minHeightRatio;
        }

        public CameraConsoleDebugStreamRequestParameters setMinScore(Double minScore) {
            this.minScore = minScore;
            return this;
        }
        public Double getMinScore() {
            return this.minScore;
        }

    }

}
