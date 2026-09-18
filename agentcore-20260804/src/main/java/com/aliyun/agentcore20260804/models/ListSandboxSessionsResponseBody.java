// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListSandboxSessionsResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value SUCCESS is returned if the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code. The value 200 is returned if the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of active sessions in the sandbox.</p>
     */
    @NameInMap("items")
    public java.util.List<ListSandboxSessionsResponseBodyItems> items;

    /**
     * <p>The maximum number of records per page for this query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message. The value success is returned if the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token for the next page. An empty value indicates that no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of records that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>27</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListSandboxSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSandboxSessionsResponseBody self = new ListSandboxSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSandboxSessionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSandboxSessionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSandboxSessionsResponseBody setItems(java.util.List<ListSandboxSessionsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListSandboxSessionsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListSandboxSessionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSandboxSessionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSandboxSessionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSandboxSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSandboxSessionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSandboxSessionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSandboxSessionsResponseBodyItems extends TeaModel {
        /**
         * <p>The external channel type, such as DINGTALK, FEISHU, or WECOM. This parameter is empty for non-external channels.</p>
         * 
         * <strong>example:</strong>
         * <p>DINGTALK</p>
         */
        @NameInMap("channelType")
        public String channelType;

        /**
         * <p>The unique identifier of the active session.</p>
         * 
         * <strong>example:</strong>
         * <p>sess-2</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The session source type. Valid values:</p>
         * <ul>
         * <li>API: API call.</li>
         * <li>CONSOLE_DEBUG: Console debugging.</li>
         * <li>EXTERNAL_CHANNEL: External channel.</li>
         * <li>UNKNOWN: Unknown source.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXTERNAL_CHANNEL</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static ListSandboxSessionsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListSandboxSessionsResponseBodyItems self = new ListSandboxSessionsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListSandboxSessionsResponseBodyItems setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public ListSandboxSessionsResponseBodyItems setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListSandboxSessionsResponseBodyItems setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
