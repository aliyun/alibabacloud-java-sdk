// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ResetUserPasswordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ResetUserPasswordResponseBodyData data;

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
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ResetUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetUserPasswordResponseBody self = new ResetUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetUserPasswordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResetUserPasswordResponseBody setData(ResetUserPasswordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResetUserPasswordResponseBodyData getData() {
        return this.data;
    }

    public ResetUserPasswordResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ResetUserPasswordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResetUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetUserPasswordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ResetUserPasswordResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>usr-123456</p>
         */
        @NameInMap("agentCoreUserId")
        public String agentCoreUserId;

        /**
         * <strong>example:</strong>
         * <p>Example@2026</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ResetUserPasswordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResetUserPasswordResponseBodyData self = new ResetUserPasswordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResetUserPasswordResponseBodyData setAgentCoreUserId(String agentCoreUserId) {
            this.agentCoreUserId = agentCoreUserId;
            return this;
        }
        public String getAgentCoreUserId() {
            return this.agentCoreUserId;
        }

        public ResetUserPasswordResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ResetUserPasswordResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
