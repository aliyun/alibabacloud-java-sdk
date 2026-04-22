// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class LoadAgentSessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4as3dasf654a</p>
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
        @NameInMap("BeginLogOffset")
        public Long beginLogOffset;

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
        @NameInMap("Meta")
        public LoadAgentSessionRequestParamsMeta meta;

        /**
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
