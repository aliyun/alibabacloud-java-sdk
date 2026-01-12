// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class KnowledgeBase extends TeaModel {
    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("credentialName")
    public String credentialName;

    @NameInMap("description")
    public String description;

    @NameInMap("knowledgeBaseId")
    public String knowledgeBaseId;

    @NameInMap("knowledgeBaseName")
    public String knowledgeBaseName;

    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    @NameInMap("provider")
    public String provider;

    @NameInMap("providerSettings")
    public java.util.Map<String, ?> providerSettings;

    @NameInMap("retrieveSettings")
    public java.util.Map<String, ?> retrieveSettings;

    public static KnowledgeBase build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeBase self = new KnowledgeBase();
        return TeaModel.build(map, self);
    }

    public KnowledgeBase setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public KnowledgeBase setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public KnowledgeBase setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public KnowledgeBase setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public KnowledgeBase setKnowledgeBaseName(String knowledgeBaseName) {
        this.knowledgeBaseName = knowledgeBaseName;
        return this;
    }
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public KnowledgeBase setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public KnowledgeBase setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public KnowledgeBase setProviderSettings(java.util.Map<String, ?> providerSettings) {
        this.providerSettings = providerSettings;
        return this;
    }
    public java.util.Map<String, ?> getProviderSettings() {
        return this.providerSettings;
    }

    public KnowledgeBase setRetrieveSettings(java.util.Map<String, ?> retrieveSettings) {
        this.retrieveSettings = retrieveSettings;
        return this;
    }
    public java.util.Map<String, ?> getRetrieveSettings() {
        return this.retrieveSettings;
    }

}
