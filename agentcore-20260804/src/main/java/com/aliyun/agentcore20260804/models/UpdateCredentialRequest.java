// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateCredentialRequest extends TeaModel {
    @NameInMap("body")
    public UpdateCredentialRequestBody body;

    /**
     * <strong>example:</strong>
     * <p>暂不支持</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialRequest self = new UpdateCredentialRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialRequest setBody(UpdateCredentialRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateCredentialRequestBody getBody() {
        return this.body;
    }

    public UpdateCredentialRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateCredentialRequestBody extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;apiKey&quot;:&quot;sk-example-value&quot;}</p>
         */
        @NameInMap("credentialMetadata")
        public String credentialMetadata;

        /**
         * <strong>example:</strong>
         * <p>线上环境调用模型服务使用的 API Key</p>
         */
        @NameInMap("description")
        public String description;

        public static UpdateCredentialRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateCredentialRequestBody self = new UpdateCredentialRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateCredentialRequestBody setCredentialMetadata(String credentialMetadata) {
            this.credentialMetadata = credentialMetadata;
            return this;
        }
        public String getCredentialMetadata() {
            return this.credentialMetadata;
        }

        public UpdateCredentialRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
