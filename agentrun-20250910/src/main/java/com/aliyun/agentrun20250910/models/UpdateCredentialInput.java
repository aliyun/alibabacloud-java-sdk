// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateCredentialInput extends TeaModel {
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

    public static UpdateCredentialInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialInput self = new UpdateCredentialInput();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialInput setConfig(java.util.Map<String, String> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, String> getConfig() {
        return this.config;
    }

    public UpdateCredentialInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCredentialInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCredentialInput setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public UpdateCredentialInput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
