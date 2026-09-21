// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBodyData data;

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
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
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

    public static VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBody self = new VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBody setData(VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBodyData getData() {
        return this.data;
    }

    public VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBodyData extends TeaModel {
        /**
         * <p>The authorization status. A value of AUTHORIZED does not indicate that the actual mount was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTHORIZED</p>
         */
        @NameInMap("authorizationStatus")
        public String authorizationStatus;

        public static VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBodyData self = new VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBodyData setAuthorizationStatus(String authorizationStatus) {
            this.authorizationStatus = authorizationStatus;
            return this;
        }
        public String getAuthorizationStatus() {
            return this.authorizationStatus;
        }

    }

}
