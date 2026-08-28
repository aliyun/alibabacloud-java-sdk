// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateAgentIMChannelCredentialResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value SUCCESS indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The summary of the updated IM channel credential.</p>
     */
    @NameInMap("data")
    public UpdateAgentIMChannelCredentialResponseBodyData data;

    /**
     * <p>The HTTP status code. The value 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The result message of the request.</p>
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
     * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateAgentIMChannelCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentIMChannelCredentialResponseBody self = new UpdateAgentIMChannelCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAgentIMChannelCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAgentIMChannelCredentialResponseBody setData(UpdateAgentIMChannelCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateAgentIMChannelCredentialResponseBodyData getData() {
        return this.data;
    }

    public UpdateAgentIMChannelCredentialResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateAgentIMChannelCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAgentIMChannelCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAgentIMChannelCredentialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateAgentIMChannelCredentialResponseBodyData extends TeaModel {
        /**
         * <p>The list of configured secret field names. Secret values are not included.</p>
         */
        @NameInMap("configuredSecretFields")
        public java.util.List<String> configuredSecretFields;

        /**
         * <p>The non-sensitive credential fields and their values.</p>
         */
        @NameInMap("nonSecretFields")
        public java.util.Map<String, String> nonSecretFields;

        public static UpdateAgentIMChannelCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentIMChannelCredentialResponseBodyData self = new UpdateAgentIMChannelCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAgentIMChannelCredentialResponseBodyData setConfiguredSecretFields(java.util.List<String> configuredSecretFields) {
            this.configuredSecretFields = configuredSecretFields;
            return this;
        }
        public java.util.List<String> getConfiguredSecretFields() {
            return this.configuredSecretFields;
        }

        public UpdateAgentIMChannelCredentialResponseBodyData setNonSecretFields(java.util.Map<String, String> nonSecretFields) {
            this.nonSecretFields = nonSecretFields;
            return this;
        }
        public java.util.Map<String, String> getNonSecretFields() {
            return this.nonSecretFields;
        }

    }

}
