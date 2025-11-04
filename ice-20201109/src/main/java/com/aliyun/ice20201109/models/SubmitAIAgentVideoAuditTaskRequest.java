// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAIAgentVideoAuditTaskRequest extends TeaModel {
    /**
     * <p>The ID of the AI agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>*<strong><strong><strong>3b3d94abda22</strong></strong></strong></p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    /**
     * <p>The interval, in milliseconds, at which to submit captured frames to the AI agent. Valid values: 0 to 5000. Default value: 3000. If it is set to 0, all captured frames are sent to the model in a single batch request. Otherwise, frames are sent sequentially with the specified interval between each request.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("AuditInterval")
    public Integer auditInterval;

    /**
     * <p>Callback configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Url&quot;:&quot;<a href="https://yourcallback%22,%22Token%22:%22yourtoken%22%7D">https://yourcallback&quot;,&quot;Token&quot;:&quot;yourtoken&quot;}</a></p>
     */
    @NameInMap("CallbackConfig")
    public SubmitAIAgentVideoAuditTaskRequestCallbackConfig callbackConfig;

    /**
     * <p>An array of frame-capturing policies. Each policy defines a set of frames to be analyzed and will generate a separate result from the model.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CapturePolicies")
    public java.util.List<SubmitAIAgentVideoAuditTaskRequestCapturePolicies> capturePolicies;

    /**
     * <p>The details of the input file.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitAIAgentVideoAuditTaskRequestInput input;

    /**
     * <p>The user-defined data.</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitAIAgentVideoAuditTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIAgentVideoAuditTaskRequest self = new SubmitAIAgentVideoAuditTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIAgentVideoAuditTaskRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public SubmitAIAgentVideoAuditTaskRequest setAuditInterval(Integer auditInterval) {
        this.auditInterval = auditInterval;
        return this;
    }
    public Integer getAuditInterval() {
        return this.auditInterval;
    }

    public SubmitAIAgentVideoAuditTaskRequest setCallbackConfig(SubmitAIAgentVideoAuditTaskRequestCallbackConfig callbackConfig) {
        this.callbackConfig = callbackConfig;
        return this;
    }
    public SubmitAIAgentVideoAuditTaskRequestCallbackConfig getCallbackConfig() {
        return this.callbackConfig;
    }

    public SubmitAIAgentVideoAuditTaskRequest setCapturePolicies(java.util.List<SubmitAIAgentVideoAuditTaskRequestCapturePolicies> capturePolicies) {
        this.capturePolicies = capturePolicies;
        return this;
    }
    public java.util.List<SubmitAIAgentVideoAuditTaskRequestCapturePolicies> getCapturePolicies() {
        return this.capturePolicies;
    }

    public SubmitAIAgentVideoAuditTaskRequest setInput(SubmitAIAgentVideoAuditTaskRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitAIAgentVideoAuditTaskRequestInput getInput() {
        return this.input;
    }

    public SubmitAIAgentVideoAuditTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitAIAgentVideoAuditTaskRequestCallbackConfig extends TeaModel {
        /**
         * <p>The authentication token for callback.</p>
         * 
         * <strong>example:</strong>
         * <p>Bearer Token</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>The URL for receiving callback notifications.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://yourcallback">https://yourcallback</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static SubmitAIAgentVideoAuditTaskRequestCallbackConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIAgentVideoAuditTaskRequestCallbackConfig self = new SubmitAIAgentVideoAuditTaskRequestCallbackConfig();
            return TeaModel.build(map, self);
        }

        public SubmitAIAgentVideoAuditTaskRequestCallbackConfig setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public SubmitAIAgentVideoAuditTaskRequestCallbackConfig setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SubmitAIAgentVideoAuditTaskRequestCapturePolicies extends TeaModel {
        /**
         * <p>The duration over which to capture the specified number of frames. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The number of frames to capture.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FrameCount")
        public Integer frameCount;

        /**
         * <p>The text prompt to send to the MLLM along with the captured frames.</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>The timestamp in the video at which to start capturing frames. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Integer startTime;

        public static SubmitAIAgentVideoAuditTaskRequestCapturePolicies build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIAgentVideoAuditTaskRequestCapturePolicies self = new SubmitAIAgentVideoAuditTaskRequestCapturePolicies();
            return TeaModel.build(map, self);
        }

        public SubmitAIAgentVideoAuditTaskRequestCapturePolicies setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public SubmitAIAgentVideoAuditTaskRequestCapturePolicies setFrameCount(Integer frameCount) {
            this.frameCount = frameCount;
            return this;
        }
        public Integer getFrameCount() {
            return this.frameCount;
        }

        public SubmitAIAgentVideoAuditTaskRequestCapturePolicies setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public SubmitAIAgentVideoAuditTaskRequestCapturePolicies setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

    }

    public static class SubmitAIAgentVideoAuditTaskRequestInput extends TeaModel {
        /**
         * <p>The OSS URL of the input file. Format:</p>
         * <p>http(s)://{BucketName}.{Endpoint}/{ObjectName}</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://my-bucket.cn-shanghai.aliyuncs.com/object-id.mp4">http://my-bucket.cn-shanghai.aliyuncs.com/object-id.mp4</a></p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the input file. Valid values:</p>
         * <ul>
         * <li>OSS: an OSS object.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitAIAgentVideoAuditTaskRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIAgentVideoAuditTaskRequestInput self = new SubmitAIAgentVideoAuditTaskRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitAIAgentVideoAuditTaskRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitAIAgentVideoAuditTaskRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
