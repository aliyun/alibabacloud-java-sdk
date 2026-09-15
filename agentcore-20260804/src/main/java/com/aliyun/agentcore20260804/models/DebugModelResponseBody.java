// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DebugModelResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value SUCCESS indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The model debugging result.</p>
     */
    @NameInMap("data")
    public DebugModelResponseBodyData data;

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

    public static DebugModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DebugModelResponseBody self = new DebugModelResponseBody();
        return TeaModel.build(map, self);
    }

    public DebugModelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DebugModelResponseBody setData(DebugModelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DebugModelResponseBodyData getData() {
        return this.data;
    }

    public DebugModelResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DebugModelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DebugModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DebugModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DebugModelResponseBodyData extends TeaModel {
        /**
         * <p>The model connection ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-1</p>
         */
        @NameInMap("connectionId")
        public String connectionId;

        /**
         * <p>Indicates whether the model debugging was successful.</p>
         */
        @NameInMap("debugSuccess")
        public Boolean debugSuccess;

        /**
         * <p>The error code returned when debugging fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UPSTREAM_MODEL_ERROR</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The error message returned when debugging fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The model endpoint rejected the debug request.</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The number of input tokens consumed by this model debugging request.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <p>The time consumed by this model debugging call, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("latencyMs")
        public Long latencyMs;

        /**
         * <p>The model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>model-1</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <p>The number of output tokens consumed by this model debugging response.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <p>The text response returned by the model when debugging succeeds. This value is empty when debugging fails.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("response")
        public String response;

        /**
         * <p>The debug result status.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("status")
        public String status;

        public static DebugModelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DebugModelResponseBodyData self = new DebugModelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DebugModelResponseBodyData setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public DebugModelResponseBodyData setDebugSuccess(Boolean debugSuccess) {
            this.debugSuccess = debugSuccess;
            return this;
        }
        public Boolean getDebugSuccess() {
            return this.debugSuccess;
        }

        public DebugModelResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DebugModelResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DebugModelResponseBodyData setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public DebugModelResponseBodyData setLatencyMs(Long latencyMs) {
            this.latencyMs = latencyMs;
            return this;
        }
        public Long getLatencyMs() {
            return this.latencyMs;
        }

        public DebugModelResponseBodyData setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public DebugModelResponseBodyData setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public DebugModelResponseBodyData setResponse(String response) {
            this.response = response;
            return this;
        }
        public String getResponse() {
            return this.response;
        }

        public DebugModelResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
