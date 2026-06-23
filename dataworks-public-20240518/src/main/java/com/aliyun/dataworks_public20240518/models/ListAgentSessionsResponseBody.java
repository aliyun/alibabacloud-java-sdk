// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAgentSessionsResponseBody extends TeaModel {
    /**
     * <p>The JSON-RPC response.</p>
     */
    @NameInMap("JsonRpcResponse")
    public ListAgentSessionsResponseBodyJsonRpcResponse jsonRpcResponse;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50C5A9F7-B5BD-58B2-9EB8-ADFFA9E6A56F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAgentSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSessionsResponseBody self = new ListAgentSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentSessionsResponseBody setJsonRpcResponse(ListAgentSessionsResponseBodyJsonRpcResponse jsonRpcResponse) {
        this.jsonRpcResponse = jsonRpcResponse;
        return this;
    }
    public ListAgentSessionsResponseBodyJsonRpcResponse getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    public ListAgentSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMetaSessionTagList extends TeaModel {
        /**
         * <p>A tag for the session, which can be used for filtering. For example, if your application has its own user accounts but calls the API through a single service account, you can pass your application\&quot;s user ID as a tag. This allows you to filter sessions by your internal users.</p>
         * 
         * <strong>example:</strong>
         * <p>user_123456</p>
         */
        @NameInMap("SessionTagCode")
        public String sessionTagCode;

        public static ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMetaSessionTagList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMetaSessionTagList self = new ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMetaSessionTagList();
            return TeaModel.build(map, self);
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMetaSessionTagList setSessionTagCode(String sessionTagCode) {
            this.sessionTagCode = sessionTagCode;
            return this;
        }
        public String getSessionTagCode() {
            return this.sessionTagCode;
        }

    }

    public static class ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMeta extends TeaModel {
        /**
         * <p>The source of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>openapi_sdk</p>
         */
        @NameInMap("SessionSource")
        public String sessionSource;

        /**
         * <p>The session status.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>NORMAL: 无状态的session</li>
         * <li>INIT: 初始化状态</li>
         * <li>RUNNING: 运行中</li>
         * <li>RELEASED: 释放状态</li>
         * </ul>
         */
        @NameInMap("SessionStatus")
        public String sessionStatus;

        /**
         * <p>A list of session tags.</p>
         */
        @NameInMap("SessionTagList")
        public java.util.List<ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMetaSessionTagList> sessionTagList;

        public static ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMeta build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMeta self = new ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMeta();
            return TeaModel.build(map, self);
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMeta setSessionSource(String sessionSource) {
            this.sessionSource = sessionSource;
            return this;
        }
        public String getSessionSource() {
            return this.sessionSource;
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMeta setSessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMeta setSessionTagList(java.util.List<ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMetaSessionTagList> sessionTagList) {
            this.sessionTagList = sessionTagList;
            return this;
        }
        public java.util.List<ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMetaSessionTagList> getSessionTagList() {
            return this.sessionTagList;
        }

    }

    public static class ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessions extends TeaModel {
        /**
         * <p>DataWorks-specific session metadata. This field is not part of the standard ACP protocol.</p>
         */
        @NameInMap("Meta")
        public ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMeta meta;

        /**
         * <p>The time the session was created.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("SessionCreatedAt")
        public Long sessionCreatedAt;

        /**
         * <p>The session description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales trend analysis</p>
         */
        @NameInMap("SessionDescription")
        public String sessionDescription;

        /**
         * <p>The unique session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sess_0f12abc34</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The session title.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales analysis for the last 30 days</p>
         */
        @NameInMap("SessionTitle")
        public String sessionTitle;

        /**
         * <p>The time the session was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("SessionUpdatedAt")
        public Long sessionUpdatedAt;

        public static ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessions build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessions self = new ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessions();
            return TeaModel.build(map, self);
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessions setMeta(ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMeta meta) {
            this.meta = meta;
            return this;
        }
        public ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMeta getMeta() {
            return this.meta;
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessions setSessionCreatedAt(Long sessionCreatedAt) {
            this.sessionCreatedAt = sessionCreatedAt;
            return this;
        }
        public Long getSessionCreatedAt() {
            return this.sessionCreatedAt;
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessions setSessionDescription(String sessionDescription) {
            this.sessionDescription = sessionDescription;
            return this;
        }
        public String getSessionDescription() {
            return this.sessionDescription;
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessions setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessions setSessionTitle(String sessionTitle) {
            this.sessionTitle = sessionTitle;
            return this;
        }
        public String getSessionTitle() {
            return this.sessionTitle;
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessions setSessionUpdatedAt(Long sessionUpdatedAt) {
            this.sessionUpdatedAt = sessionUpdatedAt;
            return this;
        }
        public Long getSessionUpdatedAt() {
            return this.sessionUpdatedAt;
        }

    }

    public static class ListAgentSessionsResponseBodyJsonRpcResponseResult extends TeaModel {
        /**
         * <p>A list of sessions.</p>
         */
        @NameInMap("AgentSessions")
        public java.util.List<ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessions> agentSessions;

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token to retrieve the next page of results. To retrieve the first page, use the value <code>1</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of sessions that match the query.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAgentSessionsResponseBodyJsonRpcResponseResult build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSessionsResponseBodyJsonRpcResponseResult self = new ListAgentSessionsResponseBodyJsonRpcResponseResult();
            return TeaModel.build(map, self);
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResult setAgentSessions(java.util.List<ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessions> agentSessions) {
            this.agentSessions = agentSessions;
            return this;
        }
        public java.util.List<ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessions> getAgentSessions() {
            return this.agentSessions;
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResult setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResult setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListAgentSessionsResponseBodyJsonRpcResponse extends TeaModel {
        /**
         * <p>The ID provided in the request. This value is returned unmodified.</p>
         * 
         * <strong>example:</strong>
         * <p>29d9a29c-a284-48c1-9eaa-4a42c7c616d5</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The JSON-RPC version. The value is always <code>2.0</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Jsonrpc")
        public String jsonrpc;

        /**
         * <p>The paginated results of the session query.</p>
         */
        @NameInMap("Result")
        public ListAgentSessionsResponseBodyJsonRpcResponseResult result;

        public static ListAgentSessionsResponseBodyJsonRpcResponse build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSessionsResponseBodyJsonRpcResponse self = new ListAgentSessionsResponseBodyJsonRpcResponse();
            return TeaModel.build(map, self);
        }

        public ListAgentSessionsResponseBodyJsonRpcResponse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAgentSessionsResponseBodyJsonRpcResponse setJsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        public ListAgentSessionsResponseBodyJsonRpcResponse setResult(ListAgentSessionsResponseBodyJsonRpcResponseResult result) {
            this.result = result;
            return this;
        }
        public ListAgentSessionsResponseBodyJsonRpcResponseResult getResult() {
            return this.result;
        }

    }

}
