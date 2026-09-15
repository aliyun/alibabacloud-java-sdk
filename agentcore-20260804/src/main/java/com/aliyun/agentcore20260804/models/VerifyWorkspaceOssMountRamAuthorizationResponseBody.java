// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class VerifyWorkspaceOssMountRamAuthorizationResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public VerifyWorkspaceOssMountRamAuthorizationResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static VerifyWorkspaceOssMountRamAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyWorkspaceOssMountRamAuthorizationResponseBody self = new VerifyWorkspaceOssMountRamAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyWorkspaceOssMountRamAuthorizationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyWorkspaceOssMountRamAuthorizationResponseBody setData(VerifyWorkspaceOssMountRamAuthorizationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyWorkspaceOssMountRamAuthorizationResponseBodyData getData() {
        return this.data;
    }

    public VerifyWorkspaceOssMountRamAuthorizationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public VerifyWorkspaceOssMountRamAuthorizationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyWorkspaceOssMountRamAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyWorkspaceOssMountRamAuthorizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VerifyWorkspaceOssMountRamAuthorizationResponseBodyData extends TeaModel {
        /**
         * <p>The OSS storage authorization status.</p>
         */
        @NameInMap("authorizationStatus")
        public String authorizationStatus;

        public static VerifyWorkspaceOssMountRamAuthorizationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyWorkspaceOssMountRamAuthorizationResponseBodyData self = new VerifyWorkspaceOssMountRamAuthorizationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyWorkspaceOssMountRamAuthorizationResponseBodyData setAuthorizationStatus(String authorizationStatus) {
            this.authorizationStatus = authorizationStatus;
            return this;
        }
        public String getAuthorizationStatus() {
            return this.authorizationStatus;
        }

    }

}
