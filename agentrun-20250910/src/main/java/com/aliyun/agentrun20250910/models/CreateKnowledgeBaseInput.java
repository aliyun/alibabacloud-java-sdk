// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseInput extends TeaModel {
    @NameInMap("credentialName")
    public String credentialName;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("knowledgeBaseName")
    public String knowledgeBaseName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("providerSettings")
    public java.util.Map<String, ?> providerSettings;

    @NameInMap("retrieveSettings")
    public java.util.Map<String, ?> retrieveSettings;

    public static CreateKnowledgeBaseInput build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseInput self = new CreateKnowledgeBaseInput();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseInput setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public CreateKnowledgeBaseInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeBaseInput setKnowledgeBaseName(String knowledgeBaseName) {
        this.knowledgeBaseName = knowledgeBaseName;
        return this;
    }
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public CreateKnowledgeBaseInput setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public CreateKnowledgeBaseInput setProviderSettings(java.util.Map<String, ?> providerSettings) {
        this.providerSettings = providerSettings;
        return this;
    }
    public java.util.Map<String, ?> getProviderSettings() {
        return this.providerSettings;
    }

    public CreateKnowledgeBaseInput setRetrieveSettings(java.util.Map<String, ?> retrieveSettings) {
        this.retrieveSettings = retrieveSettings;
        return this;
    }
    public java.util.Map<String, ?> getRetrieveSettings() {
        return this.retrieveSettings;
    }

}
