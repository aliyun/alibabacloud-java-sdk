// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateAgentIMChannelRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public CreateAgentIMChannelRequestBody body;

    /**
     * <p>A reserved idempotency token. The backend does not provide persistent idempotency guarantees in the current phase.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateAgentIMChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentIMChannelRequest self = new CreateAgentIMChannelRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentIMChannelRequest setBody(CreateAgentIMChannelRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentIMChannelRequestBody getBody() {
        return this.body;
    }

    public CreateAgentIMChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateAgentIMChannelRequestBodyChannelConfig extends TeaModel {
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

        public static CreateAgentIMChannelRequestBodyChannelConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentIMChannelRequestBodyChannelConfig self = new CreateAgentIMChannelRequestBodyChannelConfig();
            return TeaModel.build(map, self);
        }

        public CreateAgentIMChannelRequestBodyChannelConfig setShowThinking(Boolean showThinking) {
            this.showThinking = showThinking;
            return this;
        }
        public Boolean getShowThinking() {
            return this.showThinking;
        }

        public CreateAgentIMChannelRequestBodyChannelConfig setShowToolCalls(Boolean showToolCalls) {
            this.showToolCalls = showToolCalls;
            return this;
        }
        public Boolean getShowToolCalls() {
            return this.showToolCalls;
        }

    }

    public static class CreateAgentIMChannelRequestBody extends TeaModel {
        /**
         * <p>The channel behavior configuration.</p>
         */
        @NameInMap("channelConfig")
        public CreateAgentIMChannelRequestBodyChannelConfig channelConfig;

        /**
         * <p>The IM channel type. Valid values:</p>
         * <ul>
         * <li>DINGTALK: DingTalk.</li>
         * <li>FEISHU: Lark.</li>
         * <li>WECOM: WeCom.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DINGTALK</p>
         */
        @NameInMap("channelType")
        public String channelType;

        /**
         * <p>The channel credentials. All fields must be provided and field values must be non-empty strings. DingTalk uses clientID and clientSecret. Lark uses appId and appSecret. WeCom uses botId and secret.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("credential")
        public java.util.Map<String, String> credential;

        /**
         * <p>Specifies whether to enable the IM channel. Default value: true.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The ID of the ServiceEndpoint to bind. The endpoint must belong to the specified agent and its current version, be in the ready state, and have a public network address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>se-1</p>
         */
        @NameInMap("serviceEndpointId")
        public String serviceEndpointId;

        public static CreateAgentIMChannelRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentIMChannelRequestBody self = new CreateAgentIMChannelRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateAgentIMChannelRequestBody setChannelConfig(CreateAgentIMChannelRequestBodyChannelConfig channelConfig) {
            this.channelConfig = channelConfig;
            return this;
        }
        public CreateAgentIMChannelRequestBodyChannelConfig getChannelConfig() {
            return this.channelConfig;
        }

        public CreateAgentIMChannelRequestBody setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public CreateAgentIMChannelRequestBody setCredential(java.util.Map<String, String> credential) {
            this.credential = credential;
            return this;
        }
        public java.util.Map<String, String> getCredential() {
            return this.credential;
        }

        public CreateAgentIMChannelRequestBody setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateAgentIMChannelRequestBody setServiceEndpointId(String serviceEndpointId) {
            this.serviceEndpointId = serviceEndpointId;
            return this;
        }
        public String getServiceEndpointId() {
            return this.serviceEndpointId;
        }

    }

}
