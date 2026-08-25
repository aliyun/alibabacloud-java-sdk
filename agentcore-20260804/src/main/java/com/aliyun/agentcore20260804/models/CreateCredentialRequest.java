// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateCredentialRequest extends TeaModel {
    @NameInMap("body")
    public CreateCredentialRequestBody body;

    /**
     * <strong>example:</strong>
     * <p>暂不支持</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCredentialRequest self = new CreateCredentialRequest();
        return TeaModel.build(map, self);
    }

    public CreateCredentialRequest setBody(CreateCredentialRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateCredentialRequestBody getBody() {
        return this.body;
    }

    public CreateCredentialRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateCredentialRequestBody extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;apiKey&quot;:&quot;sk-example-value&quot;}</p>
         */
        @NameInMap("credentialMetadata")
        public String credentialMetadata;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apiKey</p>
         */
        @NameInMap("credentialType")
        public String credentialType;

        /**
         * <strong>example:</strong>
         * <p>线上环境调用模型服务使用的 API Key</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model-api-key</p>
         */
        @NameInMap("name")
        public String name;

        public static CreateCredentialRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateCredentialRequestBody self = new CreateCredentialRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateCredentialRequestBody setCredentialMetadata(String credentialMetadata) {
            this.credentialMetadata = credentialMetadata;
            return this;
        }
        public String getCredentialMetadata() {
            return this.credentialMetadata;
        }

        public CreateCredentialRequestBody setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public CreateCredentialRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCredentialRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
