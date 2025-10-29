// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetCredentialOutput extends TeaModel {
    /**
     * <p>凭证的配置参数，以键值对形式存储</p>
     * 
     * <strong>example:</strong>
     * <p>api_endpoint=<a href="https://api.example.com,timeout=30">https://api.example.com,timeout=30</a></p>
     */
    @NameInMap("config")
    public java.util.Map<String, String> config;

    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("description")
    public String description;

    @NameInMap("id")
    public String id;

    @NameInMap("name")
    public String name;

    @NameInMap("secret")
    public String secret;

    @NameInMap("type")
    public String type;

    @NameInMap("updatedAt")
    public String updatedAt;

    public static GetCredentialOutput build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialOutput self = new GetCredentialOutput();
        return TeaModel.build(map, self);
    }

    public GetCredentialOutput setConfig(java.util.Map<String, String> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, String> getConfig() {
        return this.config;
    }

    public GetCredentialOutput setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public GetCredentialOutput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetCredentialOutput setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetCredentialOutput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetCredentialOutput setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public GetCredentialOutput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetCredentialOutput setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
