// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetAgentSessionArtifactMetaRequest extends TeaModel {
    /**
     * <p>A client-provided ID that is echoed in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>900335678024</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. The value is <code>2.0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The container for business parameters.</p>
     */
    @NameInMap("Params")
    public GetAgentSessionArtifactMetaRequestParams params;

    public static GetAgentSessionArtifactMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSessionArtifactMetaRequest self = new GetAgentSessionArtifactMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentSessionArtifactMetaRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetAgentSessionArtifactMetaRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public GetAgentSessionArtifactMetaRequest setParams(GetAgentSessionArtifactMetaRequestParams params) {
        this.params = params;
        return this;
    }
    public GetAgentSessionArtifactMetaRequestParams getParams() {
        return this.params;
    }

    public static class GetAgentSessionArtifactMetaRequestParams extends TeaModel {
        /**
         * <p>The path of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>mock/mock_report.md</p>
         */
        @NameInMap("ArtifactPath")
        public String artifactPath;

        /**
         * <p>The ID of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>sess_0f12abc34</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static GetAgentSessionArtifactMetaRequestParams build(java.util.Map<String, ?> map) throws Exception {
            GetAgentSessionArtifactMetaRequestParams self = new GetAgentSessionArtifactMetaRequestParams();
            return TeaModel.build(map, self);
        }

        public GetAgentSessionArtifactMetaRequestParams setArtifactPath(String artifactPath) {
            this.artifactPath = artifactPath;
            return this;
        }
        public String getArtifactPath() {
            return this.artifactPath;
        }

        public GetAgentSessionArtifactMetaRequestParams setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
