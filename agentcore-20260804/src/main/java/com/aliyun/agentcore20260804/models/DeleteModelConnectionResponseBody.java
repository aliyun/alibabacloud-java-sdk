// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteModelConnectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public DeleteModelConnectionResponseBodyData data;

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

    public static DeleteModelConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelConnectionResponseBody self = new DeleteModelConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteModelConnectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteModelConnectionResponseBody setData(DeleteModelConnectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteModelConnectionResponseBodyData getData() {
        return this.data;
    }

    public DeleteModelConnectionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteModelConnectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteModelConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteModelConnectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteModelConnectionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mc-1</p>
         */
        @NameInMap("connectionId")
        public String connectionId;

        /**
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static DeleteModelConnectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteModelConnectionResponseBodyData self = new DeleteModelConnectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteModelConnectionResponseBodyData setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public DeleteModelConnectionResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
