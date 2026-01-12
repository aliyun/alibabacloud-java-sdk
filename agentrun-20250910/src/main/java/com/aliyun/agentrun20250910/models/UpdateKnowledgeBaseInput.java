// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseInput extends TeaModel {
    @NameInMap("credentialName")
    public String credentialName;

    @NameInMap("description")
    public String description;

    @NameInMap("providerSettings")
    public java.util.Map<String, ?> providerSettings;

    @NameInMap("retrieveSettings")
    public java.util.Map<String, ?> retrieveSettings;

    public static UpdateKnowledgeBaseInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseInput self = new UpdateKnowledgeBaseInput();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseInput setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public UpdateKnowledgeBaseInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKnowledgeBaseInput setProviderSettings(java.util.Map<String, ?> providerSettings) {
        this.providerSettings = providerSettings;
        return this;
    }
    public java.util.Map<String, ?> getProviderSettings() {
        return this.providerSettings;
    }

    public UpdateKnowledgeBaseInput setRetrieveSettings(java.util.Map<String, ?> retrieveSettings) {
        this.retrieveSettings = retrieveSettings;
        return this;
    }
    public java.util.Map<String, ?> getRetrieveSettings() {
        return this.retrieveSettings;
    }

}
