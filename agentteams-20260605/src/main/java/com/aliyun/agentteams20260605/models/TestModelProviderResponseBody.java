// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class TestModelProviderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public TestModelProviderResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static TestModelProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestModelProviderResponseBody self = new TestModelProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public TestModelProviderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TestModelProviderResponseBody setData(TestModelProviderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TestModelProviderResponseBodyData getData() {
        return this.data;
    }

    public TestModelProviderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TestModelProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestModelProviderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TestModelProviderResponseBodyData extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("InputTokens")
        public Long inputTokens;

        @NameInMap("LatencyMs")
        public Long latencyMs;

        @NameInMap("OutputTokens")
        public Long outputTokens;

        @NameInMap("Response")
        public String response;

        @NameInMap("Status")
        public String status;

        @NameInMap("Success")
        public Boolean success;

        public static TestModelProviderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TestModelProviderResponseBodyData self = new TestModelProviderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TestModelProviderResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public TestModelProviderResponseBodyData setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public TestModelProviderResponseBodyData setLatencyMs(Long latencyMs) {
            this.latencyMs = latencyMs;
            return this;
        }
        public Long getLatencyMs() {
            return this.latencyMs;
        }

        public TestModelProviderResponseBodyData setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public TestModelProviderResponseBodyData setResponse(String response) {
            this.response = response;
            return this;
        }
        public String getResponse() {
            return this.response;
        }

        public TestModelProviderResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public TestModelProviderResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
