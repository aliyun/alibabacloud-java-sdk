// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class VerifyConnectorResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The validation result.</p>
     */
    @NameInMap("data")
    public VerifyConnectorResponseBodyData data;

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
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static VerifyConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyConnectorResponseBody self = new VerifyConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyConnectorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyConnectorResponseBody setData(VerifyConnectorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyConnectorResponseBodyData getData() {
        return this.data;
    }

    public VerifyConnectorResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public VerifyConnectorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyConnectorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VerifyConnectorResponseBodyData extends TeaModel {
        /**
         * <p>The list of Service Account Key names that failed validation. Each element is a key name string. This list is empty if all keys pass validation.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("invalidServiceAccountKeys")
        public java.util.List<String> invalidServiceAccountKeys;

        /**
         * <p>Indicates whether the credentials are valid.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("valid")
        public Boolean valid;

        public static VerifyConnectorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyConnectorResponseBodyData self = new VerifyConnectorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyConnectorResponseBodyData setInvalidServiceAccountKeys(java.util.List<String> invalidServiceAccountKeys) {
            this.invalidServiceAccountKeys = invalidServiceAccountKeys;
            return this;
        }
        public java.util.List<String> getInvalidServiceAccountKeys() {
            return this.invalidServiceAccountKeys;
        }

        public VerifyConnectorResponseBodyData setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

}
