// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAgentSessionsResponseBody extends TeaModel {
    @NameInMap("JsonRpcResponse")
    public ListAgentSessionsResponseBodyJsonRpcResponse jsonRpcResponse;

    /**
     * <p>Id of the request</p>
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
         * <strong>example:</strong>
         * <p>openapi_sdk</p>
         */
        @NameInMap("SessionSource")
        public String sessionSource;

        @NameInMap("SessionStatus")
        public String sessionStatus;

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
        @NameInMap("Meta")
        public ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessionsMeta meta;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("SessionCreatedAt")
        public Long sessionCreatedAt;

        @NameInMap("SessionDescription")
        public String sessionDescription;

        /**
         * <strong>example:</strong>
         * <p>sess_0f12abc34</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("SessionTitle")
        public String sessionTitle;

        /**
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
        @NameInMap("AgentSessions")
        public java.util.List<ListAgentSessionsResponseBodyJsonRpcResponseResultAgentSessions> agentSessions;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
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
         * <strong>example:</strong>
         * <p>29d9a29c-a284-48c1-9eaa-4a42c7c616d5</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Jsonrpc")
        public String jsonrpc;

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
