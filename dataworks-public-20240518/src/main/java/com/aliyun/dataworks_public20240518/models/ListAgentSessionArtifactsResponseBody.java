// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAgentSessionArtifactsResponseBody extends TeaModel {
    @NameInMap("JsonRpcResponse")
    public ListAgentSessionArtifactsResponseBodyJsonRpcResponse jsonRpcResponse;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAgentSessionArtifactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSessionArtifactsResponseBody self = new ListAgentSessionArtifactsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentSessionArtifactsResponseBody setJsonRpcResponse(ListAgentSessionArtifactsResponseBodyJsonRpcResponse jsonRpcResponse) {
        this.jsonRpcResponse = jsonRpcResponse;
        return this;
    }
    public ListAgentSessionArtifactsResponseBodyJsonRpcResponse getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    public ListAgentSessionArtifactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAgentSessionArtifactsResponseBodyJsonRpcResponseResultArtifacts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mock_report.md</p>
         */
        @NameInMap("ArtifactName")
        public String artifactName;

        /**
         * <strong>example:</strong>
         * <p>mock/mock_report.md</p>
         */
        @NameInMap("ArtifactPath")
        public String artifactPath;

        /**
         * <strong>example:</strong>
         * <p>md</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        public static ListAgentSessionArtifactsResponseBodyJsonRpcResponseResultArtifacts build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSessionArtifactsResponseBodyJsonRpcResponseResultArtifacts self = new ListAgentSessionArtifactsResponseBodyJsonRpcResponseResultArtifacts();
            return TeaModel.build(map, self);
        }

        public ListAgentSessionArtifactsResponseBodyJsonRpcResponseResultArtifacts setArtifactName(String artifactName) {
            this.artifactName = artifactName;
            return this;
        }
        public String getArtifactName() {
            return this.artifactName;
        }

        public ListAgentSessionArtifactsResponseBodyJsonRpcResponseResultArtifacts setArtifactPath(String artifactPath) {
            this.artifactPath = artifactPath;
            return this;
        }
        public String getArtifactPath() {
            return this.artifactPath;
        }

        public ListAgentSessionArtifactsResponseBodyJsonRpcResponseResultArtifacts setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

    }

    public static class ListAgentSessionArtifactsResponseBodyJsonRpcResponseResult extends TeaModel {
        @NameInMap("Artifacts")
        public java.util.List<ListAgentSessionArtifactsResponseBodyJsonRpcResponseResultArtifacts> artifacts;

        /**
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>CAESExFsbyH...</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListAgentSessionArtifactsResponseBodyJsonRpcResponseResult build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSessionArtifactsResponseBodyJsonRpcResponseResult self = new ListAgentSessionArtifactsResponseBodyJsonRpcResponseResult();
            return TeaModel.build(map, self);
        }

        public ListAgentSessionArtifactsResponseBodyJsonRpcResponseResult setArtifacts(java.util.List<ListAgentSessionArtifactsResponseBodyJsonRpcResponseResultArtifacts> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public java.util.List<ListAgentSessionArtifactsResponseBodyJsonRpcResponseResultArtifacts> getArtifacts() {
            return this.artifacts;
        }

        public ListAgentSessionArtifactsResponseBodyJsonRpcResponseResult setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListAgentSessionArtifactsResponseBodyJsonRpcResponseResult setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

    public static class ListAgentSessionArtifactsResponseBodyJsonRpcResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>28477817</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Jsonrpc")
        public String jsonrpc;

        @NameInMap("Result")
        public ListAgentSessionArtifactsResponseBodyJsonRpcResponseResult result;

        public static ListAgentSessionArtifactsResponseBodyJsonRpcResponse build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSessionArtifactsResponseBodyJsonRpcResponse self = new ListAgentSessionArtifactsResponseBodyJsonRpcResponse();
            return TeaModel.build(map, self);
        }

        public ListAgentSessionArtifactsResponseBodyJsonRpcResponse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAgentSessionArtifactsResponseBodyJsonRpcResponse setJsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        public ListAgentSessionArtifactsResponseBodyJsonRpcResponse setResult(ListAgentSessionArtifactsResponseBodyJsonRpcResponseResult result) {
            this.result = result;
            return this;
        }
        public ListAgentSessionArtifactsResponseBodyJsonRpcResponseResult getResult() {
            return this.result;
        }

    }

}
