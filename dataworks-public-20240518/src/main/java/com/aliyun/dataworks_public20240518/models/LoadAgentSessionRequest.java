// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class LoadAgentSessionRequest extends TeaModel {
    /**
     * <p>The client-generated request ID, which is returned in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>4as3dasf654a</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. The value must be <code>2.0</code>.</p>
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
         * <p>In a resumable transfer scenario, this specifies the offset from which to resume fetching the SSE output.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("BeginLogOffset")
        public Long beginLogOffset;

        /**
         * <p>Specifies whether to use resumable transfer. If the SSE stream is interrupted due to issues like an unstable network connection, you can set this parameter to <code>true</code> to re-fetch the stream data from the point of failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true or false</p>
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
         * <p>DataWorks-specific extended parameters for ACP.</p>
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
