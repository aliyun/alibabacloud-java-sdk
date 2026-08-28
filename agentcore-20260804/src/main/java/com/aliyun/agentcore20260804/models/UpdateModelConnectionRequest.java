// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateModelConnectionRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UpdateModelConnectionRequestBody body;

    /**
     * <p>The client token used for idempotence. Not currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateModelConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelConnectionRequest self = new UpdateModelConnectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelConnectionRequest setBody(UpdateModelConnectionRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelConnectionRequestBody getBody() {
        return this.body;
    }

    public UpdateModelConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateModelConnectionRequestBody extends TeaModel {
        /**
         * <p>The list of API keys used to access the upstream model service. The list must contain at least one non-empty value.</p>
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
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The model connection name. The name must be 1 to 128 non-whitespace characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The model invocation protocol. Currently, only OpenAI/v1 is supported. If not specified in Settings when the model connection is created, this default value is used.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAI/v1</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The model provider type.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        @NameInMap("providerType")
        public String providerType;

        public static UpdateModelConnectionRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelConnectionRequestBody self = new UpdateModelConnectionRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateModelConnectionRequestBody setApiKeys(java.util.List<String> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }
        public java.util.List<String> getApiKeys() {
            return this.apiKeys;
        }

        public UpdateModelConnectionRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateModelConnectionRequestBody setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateModelConnectionRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateModelConnectionRequestBody setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateModelConnectionRequestBody setProviderType(String providerType) {
            this.providerType = providerType;
            return this;
        }
        public String getProviderType() {
            return this.providerType;
        }

    }

}
