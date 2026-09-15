// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateModelConnectionRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public CreateModelConnectionRequestBody body;

    /**
     * <p>The client token used for idempotence. Not supported.</p>
     * 
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
         * <p>The list of API keys used to access the upstream model service. The list must contain at least one non-empty value.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("apiKeys")
        public java.util.List<String> apiKeys;

        /**
         * <p>The description of the model connection. The description can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The absolute HTTP or HTTPS address of the upstream model service. The address can be up to 1024 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The model connection name. The name must be 1 to 128 non-whitespace characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The model invoke protocol. Currently, only OpenAI/v1 is supported. If this parameter is not configured in Settings during model creation, this default value is used.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAI/v1</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The model provider type.</p>
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
