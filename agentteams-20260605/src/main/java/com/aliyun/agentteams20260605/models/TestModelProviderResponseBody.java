// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class TestModelProviderResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public TestModelProviderResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>req-xxx</p>
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
        /**
         * <p>The error message. This parameter is returned when the test fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The model provider returned an error</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The number of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <p>The call latency, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("LatencyMs")
        public Long latencyMs;

        /**
         * <p>The number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <p>The response content returned by the model.</p>
         * 
         * <strong>example:</strong>
         * <p>I am fine, thank you!</p>
         */
        @NameInMap("Response")
        public String response;

        /**
         * <p>The test status.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the test was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
