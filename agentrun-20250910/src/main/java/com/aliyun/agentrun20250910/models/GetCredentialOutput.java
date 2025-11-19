// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetCredentialOutput extends TeaModel {
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

    public static GetCredentialOutput build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialOutput self = new GetCredentialOutput();
        return TeaModel.build(map, self);
    }

    public GetCredentialOutput setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public GetCredentialOutput setCredentialAuthType(String credentialAuthType) {
        this.credentialAuthType = credentialAuthType;
        return this;
    }
    public String getCredentialAuthType() {
        return this.credentialAuthType;
    }

    public GetCredentialOutput setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public GetCredentialOutput setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public GetCredentialOutput setCredentialPublicConfig(java.util.Map<String, String> credentialPublicConfig) {
        this.credentialPublicConfig = credentialPublicConfig;
        return this;
    }
    public java.util.Map<String, String> getCredentialPublicConfig() {
        return this.credentialPublicConfig;
    }

    public GetCredentialOutput setCredentialSecret(String credentialSecret) {
        this.credentialSecret = credentialSecret;
        return this;
    }
    public String getCredentialSecret() {
        return this.credentialSecret;
    }

    public GetCredentialOutput setCredentialSourceType(String credentialSourceType) {
        this.credentialSourceType = credentialSourceType;
        return this;
    }
    public String getCredentialSourceType() {
        return this.credentialSourceType;
    }

    public GetCredentialOutput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetCredentialOutput setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetCredentialOutput setRelatedResources(java.util.List<RelatedResource> relatedResources) {
        this.relatedResources = relatedResources;
        return this;
    }
    public java.util.List<RelatedResource> getRelatedResources() {
        return this.relatedResources;
    }

    public GetCredentialOutput setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
