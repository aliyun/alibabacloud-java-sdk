// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateModelConnectionRequest extends TeaModel {
    @NameInMap("body")
    public CreateModelConnectionRequestBody body;

    /**
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateModelConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelConnectionRequest self = new CreateModelConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelConnectionRequest setBody(CreateModelConnectionRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateModelConnectionRequestBody getBody() {
        return this.body;
    }

    public CreateModelConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateModelConnectionRequestBody extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("apiKeys")
        public java.util.List<String> apiKeys;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>OpenAI/v1</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        @NameInMap("providerType")
        public String providerType;

        public static CreateModelConnectionRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateModelConnectionRequestBody self = new CreateModelConnectionRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateModelConnectionRequestBody setApiKeys(java.util.List<String> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }
        public java.util.List<String> getApiKeys() {
            return this.apiKeys;
        }

        public CreateModelConnectionRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateModelConnectionRequestBody setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateModelConnectionRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateModelConnectionRequestBody setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateModelConnectionRequestBody setProviderType(String providerType) {
            this.providerType = providerType;
            return this;
        }
        public String getProviderType() {
            return this.providerType;
        }

    }

}
