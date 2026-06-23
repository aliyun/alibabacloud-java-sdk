// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetAgentSessionTokenUsageRequest extends TeaModel {
    /**
     * <p>The ID provided by the requester, which is echoed in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>1033814166</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. The value is always 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>Business parameters.</p>
     */
    @NameInMap("Params")
    public GetAgentSessionTokenUsageRequestParams params;

    public static GetAgentSessionTokenUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSessionTokenUsageRequest self = new GetAgentSessionTokenUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentSessionTokenUsageRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetAgentSessionTokenUsageRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public GetAgentSessionTokenUsageRequest setParams(GetAgentSessionTokenUsageRequestParams params) {
        this.params = params;
        return this;
    }
    public GetAgentSessionTokenUsageRequestParams getParams() {
        return this.params;
    }

    public static class GetAgentSessionTokenUsageRequestParams extends TeaModel {
        /**
         * <p>The session ID. Required.</p>
         * 
         * <strong>example:</strong>
         * <p>sess_0f12abc34</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static GetAgentSessionTokenUsageRequestParams build(java.util.Map<String, ?> map) throws Exception {
            GetAgentSessionTokenUsageRequestParams self = new GetAgentSessionTokenUsageRequestParams();
            return TeaModel.build(map, self);
        }

        public GetAgentSessionTokenUsageRequestParams setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
