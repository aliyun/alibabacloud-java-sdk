// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetCustomAgentImagePreparationResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The preparation query result. Refer to the phase for the asynchronous execution status.</p>
     */
    @NameInMap("data")
    public GetCustomAgentImagePreparationResponseBodyData data;

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

    public static GetCustomAgentImagePreparationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomAgentImagePreparationResponseBody self = new GetCustomAgentImagePreparationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomAgentImagePreparationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomAgentImagePreparationResponseBody setData(GetCustomAgentImagePreparationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomAgentImagePreparationResponseBodyData getData() {
        return this.data;
    }

    public GetCustomAgentImagePreparationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCustomAgentImagePreparationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomAgentImagePreparationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomAgentImagePreparationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomAgentImagePreparationResponseBodyDataError extends TeaModel {
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

        public static GetCustomAgentImagePreparationResponseBodyDataError build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentImagePreparationResponseBodyDataError self = new GetCustomAgentImagePreparationResponseBodyDataError();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentImagePreparationResponseBodyDataError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetCustomAgentImagePreparationResponseBodyDataError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class GetCustomAgentImagePreparationResponseBodyData extends TeaModel {
        /**
         * <p>The target agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-example</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The error information. This field is returned only when the task fails. Otherwise, the value is null.</p>
         */
        @NameInMap("error")
        public GetCustomAgentImagePreparationResponseBodyDataError error;

        /**
         * <p>The failed phase. This field is returned only when the status is FAILED. Otherwise, the value is null.</p>
         * 
         * <strong>example:</strong>
         * <p>COPYING</p>
         */
        @NameInMap("failedPhase")
        public String failedPhase;

        /**
         * <p>The current phase. Only SUCCEEDED indicates that the deployment of the target version is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>FAILED</p>
         */
        @NameInMap("phase")
        public String phase;

        /**
         * <p>The console submission task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-example:1</p>
         */
        @NameInMap("preparationId")
        public String preparationId;

        public static GetCustomAgentImagePreparationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentImagePreparationResponseBodyData self = new GetCustomAgentImagePreparationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentImagePreparationResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetCustomAgentImagePreparationResponseBodyData setError(GetCustomAgentImagePreparationResponseBodyDataError error) {
            this.error = error;
            return this;
        }
        public GetCustomAgentImagePreparationResponseBodyDataError getError() {
            return this.error;
        }

        public GetCustomAgentImagePreparationResponseBodyData setFailedPhase(String failedPhase) {
            this.failedPhase = failedPhase;
            return this;
        }
        public String getFailedPhase() {
            return this.failedPhase;
        }

        public GetCustomAgentImagePreparationResponseBodyData setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public GetCustomAgentImagePreparationResponseBodyData setPreparationId(String preparationId) {
            this.preparationId = preparationId;
            return this;
        }
        public String getPreparationId() {
            return this.preparationId;
        }

    }

}
