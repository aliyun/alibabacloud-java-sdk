// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetAgentSessionArtifactMetaResponseBody extends TeaModel {
    @NameInMap("JsonRpcResponse")
    public GetAgentSessionArtifactMetaResponseBodyJsonRpcResponse jsonRpcResponse;

    /**
     * <strong>example:</strong>
     * <p>CE70C54F-A3BD-5C19-88EF-2A7D3451C449</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAgentSessionArtifactMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSessionArtifactMetaResponseBody self = new GetAgentSessionArtifactMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentSessionArtifactMetaResponseBody setJsonRpcResponse(GetAgentSessionArtifactMetaResponseBodyJsonRpcResponse jsonRpcResponse) {
        this.jsonRpcResponse = jsonRpcResponse;
        return this;
    }
    public GetAgentSessionArtifactMetaResponseBodyJsonRpcResponse getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    public GetAgentSessionArtifactMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAgentSessionArtifactMetaResponseBodyJsonRpcResponseResult extends TeaModel {
        @NameInMap("ArtifactContent")
        public String artifactContent;

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

        public static GetAgentSessionArtifactMetaResponseBodyJsonRpcResponseResult build(java.util.Map<String, ?> map) throws Exception {
            GetAgentSessionArtifactMetaResponseBodyJsonRpcResponseResult self = new GetAgentSessionArtifactMetaResponseBodyJsonRpcResponseResult();
            return TeaModel.build(map, self);
        }

        public GetAgentSessionArtifactMetaResponseBodyJsonRpcResponseResult setArtifactContent(String artifactContent) {
            this.artifactContent = artifactContent;
            return this;
        }
        public String getArtifactContent() {
            return this.artifactContent;
        }

        public GetAgentSessionArtifactMetaResponseBodyJsonRpcResponseResult setArtifactName(String artifactName) {
            this.artifactName = artifactName;
            return this;
        }
        public String getArtifactName() {
            return this.artifactName;
        }

        public GetAgentSessionArtifactMetaResponseBodyJsonRpcResponseResult setArtifactPath(String artifactPath) {
            this.artifactPath = artifactPath;
            return this;
        }
        public String getArtifactPath() {
            return this.artifactPath;
        }

    }

    public static class GetAgentSessionArtifactMetaResponseBodyJsonRpcResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>300010555</p>
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
        public GetAgentSessionArtifactMetaResponseBodyJsonRpcResponseResult result;

        public static GetAgentSessionArtifactMetaResponseBodyJsonRpcResponse build(java.util.Map<String, ?> map) throws Exception {
            GetAgentSessionArtifactMetaResponseBodyJsonRpcResponse self = new GetAgentSessionArtifactMetaResponseBodyJsonRpcResponse();
            return TeaModel.build(map, self);
        }

        public GetAgentSessionArtifactMetaResponseBodyJsonRpcResponse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAgentSessionArtifactMetaResponseBodyJsonRpcResponse setJsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        public GetAgentSessionArtifactMetaResponseBodyJsonRpcResponse setResult(GetAgentSessionArtifactMetaResponseBodyJsonRpcResponseResult result) {
            this.result = result;
            return this;
        }
        public GetAgentSessionArtifactMetaResponseBodyJsonRpcResponseResult getResult() {
            return this.result;
        }

    }

}
