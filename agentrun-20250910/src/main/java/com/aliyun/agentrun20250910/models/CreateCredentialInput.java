// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateCredentialInput extends TeaModel {
    /**
     * <p>凭证的配置参数，以键值对形式存储</p>
     * 
     * <strong>example:</strong>
     * <p>api_endpoint=<a href="https://api.example.com,timeout=30">https://api.example.com,timeout=30</a></p>
     */
    @NameInMap("config")
    public java.util.Map<String, String> config;

    @NameInMap("description")
    public String description;

    @NameInMap("name")
    public String name;

    @NameInMap("secret")
    public String secret;

    @NameInMap("type")
    public String type;

    public static CreateCredentialInput build(java.util.Map<String, ?> map) throws Exception {
        CreateCredentialInput self = new CreateCredentialInput();
        return TeaModel.build(map, self);
    }

    public CreateCredentialInput setConfig(java.util.Map<String, String> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, String> getConfig() {
        return this.config;
    }

    public CreateCredentialInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCredentialInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCredentialInput setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public CreateCredentialInput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
