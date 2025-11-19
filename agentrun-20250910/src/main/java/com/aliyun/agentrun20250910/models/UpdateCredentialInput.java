// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateCredentialInput extends TeaModel {
    @NameInMap("credentialPublicConfig")
    public CredentialPublicConfig credentialPublicConfig;

    @NameInMap("credentialSecret")
    public String credentialSecret;

    @NameInMap("description")
    public String description;

    @NameInMap("enabled")
    public Boolean enabled;

    public static UpdateCredentialInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialInput self = new UpdateCredentialInput();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialInput setCredentialPublicConfig(CredentialPublicConfig credentialPublicConfig) {
        this.credentialPublicConfig = credentialPublicConfig;
        return this;
    }
    public CredentialPublicConfig getCredentialPublicConfig() {
        return this.credentialPublicConfig;
    }

    public UpdateCredentialInput setCredentialSecret(String credentialSecret) {
        this.credentialSecret = credentialSecret;
        return this;
    }
    public String getCredentialSecret() {
        return this.credentialSecret;
    }

    public UpdateCredentialInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCredentialInput setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
