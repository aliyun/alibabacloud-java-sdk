// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class FixSqlByMetaAgentResponseBody extends TeaModel {
    @NameInMap("Data")
    public FixSqlByMetaAgentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static FixSqlByMetaAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FixSqlByMetaAgentResponseBody self = new FixSqlByMetaAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public FixSqlByMetaAgentResponseBody setData(FixSqlByMetaAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FixSqlByMetaAgentResponseBodyData getData() {
        return this.data;
    }

    public FixSqlByMetaAgentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public FixSqlByMetaAgentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public FixSqlByMetaAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FixSqlByMetaAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FixSqlByMetaAgentResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SQL修复结果...</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>f63a6eed-0e3c-4564-8533-b1295db8d6ff</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static FixSqlByMetaAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FixSqlByMetaAgentResponseBodyData self = new FixSqlByMetaAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FixSqlByMetaAgentResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FixSqlByMetaAgentResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
