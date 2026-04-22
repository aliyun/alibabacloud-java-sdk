// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAgentSessionArtifactsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    @NameInMap("Params")
    public ListAgentSessionArtifactsRequestParams params;

    public static ListAgentSessionArtifactsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSessionArtifactsRequest self = new ListAgentSessionArtifactsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentSessionArtifactsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListAgentSessionArtifactsRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public ListAgentSessionArtifactsRequest setParams(ListAgentSessionArtifactsRequestParams params) {
        this.params = params;
        return this;
    }
    public ListAgentSessionArtifactsRequestParams getParams() {
        return this.params;
    }

    public static class ListAgentSessionArtifactsRequestParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>CAESExFsbyH...</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>req_20260421_001</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>sess_0f12abc34</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static ListAgentSessionArtifactsRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSessionArtifactsRequestParams self = new ListAgentSessionArtifactsRequestParams();
            return TeaModel.build(map, self);
        }

        public ListAgentSessionArtifactsRequestParams setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListAgentSessionArtifactsRequestParams setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListAgentSessionArtifactsRequestParams setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListAgentSessionArtifactsRequestParams setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
