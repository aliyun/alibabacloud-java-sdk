// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CredentialListItem extends TeaModel {
    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("credentialAuthType")
    public String credentialAuthType;

    @NameInMap("credentialId")
    public String credentialId;

    @NameInMap("credentialName")
    public String credentialName;

    @NameInMap("credentialSourceType")
    public String credentialSourceType;

    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("relatedResourceCount")
    public Integer relatedResourceCount;

    @NameInMap("updatedAt")
    public String updatedAt;

    public static CredentialListItem build(java.util.Map<String, ?> map) throws Exception {
        CredentialListItem self = new CredentialListItem();
        return TeaModel.build(map, self);
    }

    public CredentialListItem setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CredentialListItem setCredentialAuthType(String credentialAuthType) {
        this.credentialAuthType = credentialAuthType;
        return this;
    }
    public String getCredentialAuthType() {
        return this.credentialAuthType;
    }

    public CredentialListItem setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public CredentialListItem setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public CredentialListItem setCredentialSourceType(String credentialSourceType) {
        this.credentialSourceType = credentialSourceType;
        return this;
    }
    public String getCredentialSourceType() {
        return this.credentialSourceType;
    }

    public CredentialListItem setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CredentialListItem setRelatedResourceCount(Integer relatedResourceCount) {
        this.relatedResourceCount = relatedResourceCount;
        return this;
    }
    public Integer getRelatedResourceCount() {
        return this.relatedResourceCount;
    }

    public CredentialListItem setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
