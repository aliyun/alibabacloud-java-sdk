// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListPredefinedModelsResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value SUCCESS indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of predefined models.</p>
     */
    @NameInMap("data")
    public java.util.List<ListPredefinedModelsResponseBodyData> data;

    /**
     * <p>The HTTP status code. The value 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request processing result message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListPredefinedModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPredefinedModelsResponseBody self = new ListPredefinedModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPredefinedModelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPredefinedModelsResponseBody setData(java.util.List<ListPredefinedModelsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPredefinedModelsResponseBodyData> getData() {
        return this.data;
    }

    public ListPredefinedModelsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPredefinedModelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPredefinedModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPredefinedModelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPredefinedModelsResponseBodyDataCapabilities extends TeaModel {
        /**
         * <p>Indicates whether the model supports audio input or output.</p>
         */
        @NameInMap("audio")
        public Boolean audio;

        /**
         * <p>Indicates whether the model supports document input.</p>
         */
        @NameInMap("document")
        public Boolean document;

        /**
         * <p>Indicates whether the model is able to invoke multiple tool calling requests in a single response.</p>
         */
        @NameInMap("multiToolCall")
        public Boolean multiToolCall;

        /**
         * <p>Indicates whether the model supports reasoning capabilities.</p>
         */
        @NameInMap("reasoning")
        public Boolean reasoning;

        /**
         * <p>Indicates whether the model supports streaming tool calling.</p>
         */
        @NameInMap("streamToolCall")
        public Boolean streamToolCall;

        /**
         * <p>Indicates whether the model supports tool calling.</p>
         */
        @NameInMap("toolCall")
        public Boolean toolCall;

        /**
         * <p>Indicates whether the model supports video input.</p>
         */
        @NameInMap("video")
        public Boolean video;

        /**
         * <p>Indicates whether the model supports image input.</p>
         */
        @NameInMap("vision")
        public Boolean vision;

        public static ListPredefinedModelsResponseBodyDataCapabilities build(java.util.Map<String, ?> map) throws Exception {
            ListPredefinedModelsResponseBodyDataCapabilities self = new ListPredefinedModelsResponseBodyDataCapabilities();
            return TeaModel.build(map, self);
        }

        public ListPredefinedModelsResponseBodyDataCapabilities setAudio(Boolean audio) {
            this.audio = audio;
            return this;
        }
        public Boolean getAudio() {
            return this.audio;
        }

        public ListPredefinedModelsResponseBodyDataCapabilities setDocument(Boolean document) {
            this.document = document;
            return this;
        }
        public Boolean getDocument() {
            return this.document;
        }

        public ListPredefinedModelsResponseBodyDataCapabilities setMultiToolCall(Boolean multiToolCall) {
            this.multiToolCall = multiToolCall;
            return this;
        }
        public Boolean getMultiToolCall() {
            return this.multiToolCall;
        }

        public ListPredefinedModelsResponseBodyDataCapabilities setReasoning(Boolean reasoning) {
            this.reasoning = reasoning;
            return this;
        }
        public Boolean getReasoning() {
            return this.reasoning;
        }

        public ListPredefinedModelsResponseBodyDataCapabilities setStreamToolCall(Boolean streamToolCall) {
            this.streamToolCall = streamToolCall;
            return this;
        }
        public Boolean getStreamToolCall() {
            return this.streamToolCall;
        }

        public ListPredefinedModelsResponseBodyDataCapabilities setToolCall(Boolean toolCall) {
            this.toolCall = toolCall;
            return this;
        }
        public Boolean getToolCall() {
            return this.toolCall;
        }

        public ListPredefinedModelsResponseBodyDataCapabilities setVideo(Boolean video) {
            this.video = video;
            return this;
        }
        public Boolean getVideo() {
            return this.video;
        }

        public ListPredefinedModelsResponseBodyDataCapabilities setVision(Boolean vision) {
            this.vision = vision;
            return this;
        }
        public Boolean getVision() {
            return this.vision;
        }

    }

    public static class ListPredefinedModelsResponseBodyData extends TeaModel {
        /**
         * <p>The model capability configuration.</p>
         */
        @NameInMap("capabilities")
        public ListPredefinedModelsResponseBodyDataCapabilities capabilities;

        /**
         * <p>The model context window size in tokens. The value must be a positive integer.</p>
         * 
         * <strong>example:</strong>
         * <p>128000</p>
         */
        @NameInMap("contextSize")
        public Long contextSize;

        /**
         * <p>The maximum number of output tokens supported by the model in a single generation.</p>
         * 
         * <strong>example:</strong>
         * <p>131072</p>
         */
        @NameInMap("maxTokens")
        public Long maxTokens;

        /**
         * <p>The upstream model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The model release date in the format of YYYY-MM-DD.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-01</p>
         */
        @NameInMap("releaseDate")
        public String releaseDate;

        public static ListPredefinedModelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPredefinedModelsResponseBodyData self = new ListPredefinedModelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPredefinedModelsResponseBodyData setCapabilities(ListPredefinedModelsResponseBodyDataCapabilities capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public ListPredefinedModelsResponseBodyDataCapabilities getCapabilities() {
            return this.capabilities;
        }

        public ListPredefinedModelsResponseBodyData setContextSize(Long contextSize) {
            this.contextSize = contextSize;
            return this;
        }
        public Long getContextSize() {
            return this.contextSize;
        }

        public ListPredefinedModelsResponseBodyData setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public ListPredefinedModelsResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListPredefinedModelsResponseBodyData setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public String getReleaseDate() {
            return this.releaseDate;
        }

    }

}
