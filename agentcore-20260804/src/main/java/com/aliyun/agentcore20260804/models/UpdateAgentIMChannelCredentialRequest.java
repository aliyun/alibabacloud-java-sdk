// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateAgentIMChannelCredentialRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UpdateAgentIMChannelCredentialRequestBody body;

    /**
     * <p>A reserved idempotency token. The backend does not provide persistent idempotence guarantee in the current version.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateAgentIMChannelCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentIMChannelCredentialRequest self = new UpdateAgentIMChannelCredentialRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentIMChannelCredentialRequest setBody(UpdateAgentIMChannelCredentialRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentIMChannelCredentialRequestBody getBody() {
        return this.body;
    }

    public UpdateAgentIMChannelCredentialRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateAgentIMChannelCredentialRequestBody extends TeaModel {
        /**
         * <p>The channel credential. All fields must be provided and field values must be non-empty strings. DingTalk uses clientID and clientSecret. Lark uses appId and appSecret. WeCom uses botId and secret.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("credential")
        public java.util.Map<String, String> credential;

        public static UpdateAgentIMChannelCredentialRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentIMChannelCredentialRequestBody self = new UpdateAgentIMChannelCredentialRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateAgentIMChannelCredentialRequestBody setCredential(java.util.Map<String, String> credential) {
            this.credential = credential;
            return this;
        }
        public java.util.Map<String, String> getCredential() {
            return this.credential;
        }

    }

}
