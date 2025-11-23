// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AnswerSqlSyntaxByMetaAgentResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public AnswerSqlSyntaxByMetaAgentResponseBodyData data;

    /**
     * <p>The error code that is returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message that is returned if the request failed.</p>
     * 
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
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AnswerSqlSyntaxByMetaAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AnswerSqlSyntaxByMetaAgentResponseBody self = new AnswerSqlSyntaxByMetaAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public AnswerSqlSyntaxByMetaAgentResponseBody setData(AnswerSqlSyntaxByMetaAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AnswerSqlSyntaxByMetaAgentResponseBodyData getData() {
        return this.data;
    }

    public AnswerSqlSyntaxByMetaAgentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AnswerSqlSyntaxByMetaAgentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AnswerSqlSyntaxByMetaAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AnswerSqlSyntaxByMetaAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AnswerSqlSyntaxByMetaAgentResponseBodyData extends TeaModel {
        /**
         * <p>The answer to the question.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql数据库类型下...</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f63a6eed-0e3c-4564-8533-b1295db8d6ff</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static AnswerSqlSyntaxByMetaAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AnswerSqlSyntaxByMetaAgentResponseBodyData self = new AnswerSqlSyntaxByMetaAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AnswerSqlSyntaxByMetaAgentResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AnswerSqlSyntaxByMetaAgentResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
