// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DebugModelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public DebugModelResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>request-1</p>
     */
    @NameInMap("requestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>mc-1</p>
         */
        @NameInMap("connectionId")
        public String connectionId;

        @NameInMap("debugSuccess")
        public Boolean debugSuccess;

        /**
         * <p>调试失败时的错误码。取值：MODEL_CONNECTION_NOT_READY（模型连接尚未发布就绪）、MODEL_CONNECTION_TEST_FAILED（平台调用网关失败）、UPSTREAM_MODEL_NOT_FOUND（模型服务商侧不存在该模型）、UPSTREAM_UNAUTHORIZED（模型服务商拒绝所配置的凭证）、UPSTREAM_RATE_LIMITED（模型服务商限流）、UPSTREAM_SERVER_ERROR（模型服务商服务端错误）、UPSTREAM_HTTP_ERROR（模型服务商返回其它非成功状态）、UPSTREAM_EMPTY_RESPONSE（模型服务商返回空响应）、UPSTREAM_INVALID_RESPONSE（模型服务商响应格式非法）、UPSTREAM_MODEL_ERROR（模型服务商拒绝本次请求）、MODEL_RESPONSE_INVALID（响应解析失败）。</p>
         * 
         * <strong>example:</strong>
         * <p>UPSTREAM_MODEL_ERROR</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>调试失败时的错误描述，为固定脱敏文案，不透传模型服务商的原始错误详情。</p>
         * 
         * <strong>example:</strong>
         * <p>The model endpoint rejected the debug request.</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("latencyMs")
        public Long latencyMs;

        /**
         * <strong>example:</strong>
         * <p>model-1</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("response")
        public String response;

        /**
         * <p>调试结果状态。取值：NORMAL（正常）、ABNORMAL（异常）。</p>
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
