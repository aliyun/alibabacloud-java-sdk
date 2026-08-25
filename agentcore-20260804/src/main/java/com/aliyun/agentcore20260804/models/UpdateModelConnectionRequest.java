// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateModelConnectionRequest extends TeaModel {
    @NameInMap("body")
    public UpdateModelConnectionRequestBody body;

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
        @NameInMap("apiKeys")
        public java.util.List<String> apiKeys;

        @NameInMap("description")
        public String description;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("name")
        public String name;

        @NameInMap("protocol")
        public String protocol;

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
