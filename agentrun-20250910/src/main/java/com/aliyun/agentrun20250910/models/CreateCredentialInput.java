// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateCredentialInput extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("credentialAuthType")
    public String credentialAuthType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    @NameInMap("credentialPublicConfig")
    public CredentialPublicConfig credentialPublicConfig;

    @NameInMap("credentialSecret")
    public String credentialSecret;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("credentialSourceType")
    public String credentialSourceType;

    @NameInMap("description")
    public String description;

    @NameInMap("enabled")
    public Boolean enabled;

    public static CreateCredentialInput build(java.util.Map<String, ?> map) throws Exception {
        CreateCredentialInput self = new CreateCredentialInput();
        return TeaModel.build(map, self);
    }

    public CreateCredentialInput setCredentialAuthType(String credentialAuthType) {
        this.credentialAuthType = credentialAuthType;
        return this;
    }
    public String getCredentialAuthType() {
        return this.credentialAuthType;
    }

    public CreateCredentialInput setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public CreateCredentialInput setCredentialPublicConfig(CredentialPublicConfig credentialPublicConfig) {
        this.credentialPublicConfig = credentialPublicConfig;
        return this;
    }
    public CredentialPublicConfig getCredentialPublicConfig() {
        return this.credentialPublicConfig;
    }

    public CreateCredentialInput setCredentialSecret(String credentialSecret) {
        this.credentialSecret = credentialSecret;
        return this;
    }
    public String getCredentialSecret() {
        return this.credentialSecret;
    }

    public CreateCredentialInput setCredentialSourceType(String credentialSourceType) {
        this.credentialSourceType = credentialSourceType;
        return this;
    }
    public String getCredentialSourceType() {
        return this.credentialSourceType;
    }

    public CreateCredentialInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCredentialInput setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
