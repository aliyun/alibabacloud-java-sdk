// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class LoadAgentSessionRequest extends TeaModel {
    /**
     * <p>The ID provided by the requester. This ID is echoed back as is.</p>
     * 
     * <strong>example:</strong>
     * <p>4as3dasf654a</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. Fixed to 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The business parameters.</p>
     */
    @NameInMap("Params")
    public LoadAgentSessionRequestParams params;

    public static LoadAgentSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        LoadAgentSessionRequest self = new LoadAgentSessionRequest();
        return TeaModel.build(map, self);
    }

    public LoadAgentSessionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LoadAgentSessionRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public LoadAgentSessionRequest setParams(LoadAgentSessionRequestParams params) {
        this.params = params;
        return this;
    }
    public LoadAgentSessionRequestParams getParams() {
        return this.params;
    }

    public static class LoadAgentSessionRequestParamsMeta extends TeaModel {
        /**
         * <p>The offset from which to pull subsequent SSE outputs in a resumable transmission scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("BeginLogOffset")
        public Long beginLogOffset;

        /**
         * <p>Specifies whether this is a resumable transmission scenario. If the SSE stream is interrupted due to network instability, you can set this flag to repull the SSE response data from the breakpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsReload")
        public Boolean isReload;

        public static LoadAgentSessionRequestParamsMeta build(java.util.Map<String, ?> map) throws Exception {
            LoadAgentSessionRequestParamsMeta self = new LoadAgentSessionRequestParamsMeta();
            return TeaModel.build(map, self);
        }

        public LoadAgentSessionRequestParamsMeta setBeginLogOffset(Long beginLogOffset) {
            this.beginLogOffset = beginLogOffset;
            return this;
        }
        public Long getBeginLogOffset() {
            return this.beginLogOffset;
        }

        public LoadAgentSessionRequestParamsMeta setIsReload(Boolean isReload) {
            this.isReload = isReload;
            return this;
        }
        public Boolean getIsReload() {
            return this.isReload;
        }

    }

    public static class LoadAgentSessionRequestParams extends TeaModel {
        /**
         * <p>The ACP extension parameters for DataWorks.</p>
         */
        @NameInMap("Meta")
        public LoadAgentSessionRequestParamsMeta meta;

        /**
         * <p>The ID of the target session. If the session does not exist, an SSE error frame is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>sess_0f12abc34</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static LoadAgentSessionRequestParams build(java.util.Map<String, ?> map) throws Exception {
            LoadAgentSessionRequestParams self = new LoadAgentSessionRequestParams();
            return TeaModel.build(map, self);
        }

        public LoadAgentSessionRequestParams setMeta(LoadAgentSessionRequestParamsMeta meta) {
            this.meta = meta;
            return this;
        }
        public LoadAgentSessionRequestParamsMeta getMeta() {
            return this.meta;
        }

        public LoadAgentSessionRequestParams setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
