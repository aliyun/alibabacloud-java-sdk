// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateCredentialOutput extends TeaModel {
    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("credentialAuthType")
    public String credentialAuthType;

    @NameInMap("credentialId")
    public String credentialId;

    @NameInMap("credentialName")
    public String credentialName;

    @NameInMap("credentialPublicConfig")
    public java.util.Map<String, String> credentialPublicConfig;

    @NameInMap("credentialSecret")
    public String credentialSecret;

    @NameInMap("credentialSourceType")
    public String credentialSourceType;

    @NameInMap("description")
    public String description;

    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("relatedResources")
    public java.util.List<RelatedResource> relatedResources;

    @NameInMap("updatedAt")
    public String updatedAt;

    public static UpdateCredentialOutput build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialOutput self = new UpdateCredentialOutput();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialOutput setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateCredentialOutput setCredentialAuthType(String credentialAuthType) {
        this.credentialAuthType = credentialAuthType;
        return this;
    }
    public String getCredentialAuthType() {
        return this.credentialAuthType;
    }

    public UpdateCredentialOutput setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public UpdateCredentialOutput setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public UpdateCredentialOutput setCredentialPublicConfig(java.util.Map<String, String> credentialPublicConfig) {
        this.credentialPublicConfig = credentialPublicConfig;
        return this;
    }
    public java.util.Map<String, String> getCredentialPublicConfig() {
        return this.credentialPublicConfig;
    }

    public UpdateCredentialOutput setCredentialSecret(String credentialSecret) {
        this.credentialSecret = credentialSecret;
        return this;
    }
    public String getCredentialSecret() {
        return this.credentialSecret;
    }

    public UpdateCredentialOutput setCredentialSourceType(String credentialSourceType) {
        this.credentialSourceType = credentialSourceType;
        return this;
    }
    public String getCredentialSourceType() {
        return this.credentialSourceType;
    }

    public UpdateCredentialOutput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCredentialOutput setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateCredentialOutput setRelatedResources(java.util.List<RelatedResource> relatedResources) {
        this.relatedResources = relatedResources;
        return this;
    }
    public java.util.List<RelatedResource> getRelatedResources() {
        return this.relatedResources;
    }

    public UpdateCredentialOutput setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
