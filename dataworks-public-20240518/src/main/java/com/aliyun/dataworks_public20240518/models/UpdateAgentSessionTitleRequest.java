// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateAgentSessionTitleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>updateagentsessiontitle-rpc-001</p>
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
    public UpdateAgentSessionTitleRequestParams params;

    public static UpdateAgentSessionTitleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentSessionTitleRequest self = new UpdateAgentSessionTitleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentSessionTitleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAgentSessionTitleRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public UpdateAgentSessionTitleRequest setParams(UpdateAgentSessionTitleRequestParams params) {
        this.params = params;
        return this;
    }
    public UpdateAgentSessionTitleRequestParams getParams() {
        return this.params;
    }

    public static class UpdateAgentSessionTitleRequestParams extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-42d3-a456-426614174000</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>New title</p>
         */
        @NameInMap("Title")
        public String title;

        public static UpdateAgentSessionTitleRequestParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentSessionTitleRequestParams self = new UpdateAgentSessionTitleRequestParams();
            return TeaModel.build(map, self);
        }

        public UpdateAgentSessionTitleRequestParams setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public UpdateAgentSessionTitleRequestParams setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
