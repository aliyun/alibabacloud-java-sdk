// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class FindCustomAgentImagePreparationResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The preparation query result. For the asynchronous execution status, refer to the phase.</p>
     */
    @NameInMap("data")
    public FindCustomAgentImagePreparationResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
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
     * <p>123e4567-e89b-12d3-a456-426614174000</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static FindCustomAgentImagePreparationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindCustomAgentImagePreparationResponseBody self = new FindCustomAgentImagePreparationResponseBody();
        return TeaModel.build(map, self);
    }

    public FindCustomAgentImagePreparationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FindCustomAgentImagePreparationResponseBody setData(FindCustomAgentImagePreparationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FindCustomAgentImagePreparationResponseBodyData getData() {
        return this.data;
    }

    public FindCustomAgentImagePreparationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public FindCustomAgentImagePreparationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FindCustomAgentImagePreparationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindCustomAgentImagePreparationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FindCustomAgentImagePreparationResponseBodyDataError extends TeaModel {
        /**
         * <p>The business error code for image preparation. This code is used to identify the failure type. For the specific cause, refer to the message.</p>
         * 
         * <strong>example:</strong>
         * <p>ImageSyncFailed</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The specific cause of the failure. This may include underlying errors such as image not found, authentication failure, network timeout, or certificate verification error. Passwords, tokens, or authentication headers are not returned. If the underlying system does not provide a cause, a general description is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>tls: failed to verify certificate: x509: certificate signed by unknown authority</p>
         */
        @NameInMap("message")
        public String message;

        public static FindCustomAgentImagePreparationResponseBodyDataError build(java.util.Map<String, ?> map) throws Exception {
            FindCustomAgentImagePreparationResponseBodyDataError self = new FindCustomAgentImagePreparationResponseBodyDataError();
            return TeaModel.build(map, self);
        }

        public FindCustomAgentImagePreparationResponseBodyDataError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public FindCustomAgentImagePreparationResponseBodyDataError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class FindCustomAgentImagePreparationResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the target agent.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-example</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The security error. This parameter is returned only when the task fails. Otherwise, the value is null.</p>
         */
        @NameInMap("error")
        public FindCustomAgentImagePreparationResponseBodyDataError error;

        /**
         * <p>The phase where the failure occurred. This parameter is returned only when the phase is FAILED. Otherwise, the value is null.</p>
         * 
         * <strong>example:</strong>
         * <p>COPYING</p>
         */
        @NameInMap("failedPhase")
        public String failedPhase;

        /**
         * <p>The current phase. Only SUCCEEDED indicates that the target version is deployed successfully.</p>
         * 
         * <strong>example:</strong>
         * <p>FAILED</p>
         */
        @NameInMap("phase")
        public String phase;

        /**
         * <p>The ID of the task submitted in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-example:1</p>
         */
        @NameInMap("preparationId")
        public String preparationId;

        public static FindCustomAgentImagePreparationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindCustomAgentImagePreparationResponseBodyData self = new FindCustomAgentImagePreparationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindCustomAgentImagePreparationResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public FindCustomAgentImagePreparationResponseBodyData setError(FindCustomAgentImagePreparationResponseBodyDataError error) {
            this.error = error;
            return this;
        }
        public FindCustomAgentImagePreparationResponseBodyDataError getError() {
            return this.error;
        }

        public FindCustomAgentImagePreparationResponseBodyData setFailedPhase(String failedPhase) {
            this.failedPhase = failedPhase;
            return this;
        }
        public String getFailedPhase() {
            return this.failedPhase;
        }

        public FindCustomAgentImagePreparationResponseBodyData setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public FindCustomAgentImagePreparationResponseBodyData setPreparationId(String preparationId) {
            this.preparationId = preparationId;
            return this;
        }
        public String getPreparationId() {
            return this.preparationId;
        }

    }

}
