// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchTableKnowledgeResponseBody extends TeaModel {
    @NameInMap("Data")
    public SearchTableKnowledgeResponseBodyData data;

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

    public static SearchTableKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTableKnowledgeResponseBody self = new SearchTableKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTableKnowledgeResponseBody setData(SearchTableKnowledgeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchTableKnowledgeResponseBodyData getData() {
        return this.data;
    }

    public SearchTableKnowledgeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchTableKnowledgeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SearchTableKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTableKnowledgeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchTableKnowledgeResponseBodyData extends TeaModel {
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

        public static SearchTableKnowledgeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchTableKnowledgeResponseBodyData self = new SearchTableKnowledgeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchTableKnowledgeResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SearchTableKnowledgeResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
