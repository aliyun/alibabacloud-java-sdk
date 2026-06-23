// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CancelAgentSessionRequest extends TeaModel {
    /**
     * <p>The ID passed by the requester. The value is returned as-is in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>676303114031776</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. Fixed value: 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The business parameters of the request.</p>
     */
    @NameInMap("Params")
    public CancelAgentSessionRequestParams params;

    public static CancelAgentSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAgentSessionRequest self = new CancelAgentSessionRequest();
        return TeaModel.build(map, self);
    }

    public CancelAgentSessionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CancelAgentSessionRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public CancelAgentSessionRequest setParams(CancelAgentSessionRequestParams params) {
        this.params = params;
        return this;
    }
    public CancelAgentSessionRequestParams getParams() {
        return this.params;
    }

    public static class CancelAgentSessionRequestParams extends TeaModel {
        /**
         * <p>The ID of the session to cancel. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sess_0f12abc34</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static CancelAgentSessionRequestParams build(java.util.Map<String, ?> map) throws Exception {
            CancelAgentSessionRequestParams self = new CancelAgentSessionRequestParams();
            return TeaModel.build(map, self);
        }

        public CancelAgentSessionRequestParams setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
