// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateAgentIMChannelRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UpdateAgentIMChannelRequestBody body;

    /**
     * <p>The reserved idempotency token. The backend does not provide persistent idempotency guarantees in this phase.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateAgentIMChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentIMChannelRequest self = new UpdateAgentIMChannelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentIMChannelRequest setBody(UpdateAgentIMChannelRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentIMChannelRequestBody getBody() {
        return this.body;
    }

    public UpdateAgentIMChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateAgentIMChannelRequestBodyChannelConfig extends TeaModel {
        /**
         * <p>Specifies whether to display the thinking process in IM messages. Default value: false.</p>
         */
        @NameInMap("showThinking")
        public Boolean showThinking;

        /**
         * <p>Specifies whether to display the tool calling process in IM messages. Default value: false.</p>
         */
        @NameInMap("showToolCalls")
        public Boolean showToolCalls;

        public static UpdateAgentIMChannelRequestBodyChannelConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentIMChannelRequestBodyChannelConfig self = new UpdateAgentIMChannelRequestBodyChannelConfig();
            return TeaModel.build(map, self);
        }

        public UpdateAgentIMChannelRequestBodyChannelConfig setShowThinking(Boolean showThinking) {
            this.showThinking = showThinking;
            return this;
        }
        public Boolean getShowThinking() {
            return this.showThinking;
        }

        public UpdateAgentIMChannelRequestBodyChannelConfig setShowToolCalls(Boolean showToolCalls) {
            this.showToolCalls = showToolCalls;
            return this;
        }
        public Boolean getShowToolCalls() {
            return this.showToolCalls;
        }

    }

    public static class UpdateAgentIMChannelRequestBody extends TeaModel {
        /**
         * <p>The channel behavior configuration. When provided, the entire configuration is replaced. An empty object restores default values.</p>
         */
        @NameInMap("channelConfig")
        public UpdateAgentIMChannelRequestBodyChannelConfig channelConfig;

        /**
         * <p>Specifies whether to enable the IM channel. Default value: true (when created).</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The ID of the bound ServiceEndpoint. The endpoint must belong to the specified agent and its current version, be in the ready state, and have a public endpoint address.</p>
         * 
         * <strong>example:</strong>
         * <p>se-1</p>
         */
        @NameInMap("serviceEndpointId")
        public String serviceEndpointId;

        public static UpdateAgentIMChannelRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentIMChannelRequestBody self = new UpdateAgentIMChannelRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateAgentIMChannelRequestBody setChannelConfig(UpdateAgentIMChannelRequestBodyChannelConfig channelConfig) {
            this.channelConfig = channelConfig;
            return this;
        }
        public UpdateAgentIMChannelRequestBodyChannelConfig getChannelConfig() {
            return this.channelConfig;
        }

        public UpdateAgentIMChannelRequestBody setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateAgentIMChannelRequestBody setServiceEndpointId(String serviceEndpointId) {
            this.serviceEndpointId = serviceEndpointId;
            return this;
        }
        public String getServiceEndpointId() {
            return this.serviceEndpointId;
        }

    }

}
