// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeSourceShrinkRequest extends TeaModel {
    /**
     * <p>The client token used to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>source-create-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The data source configuration. This parameter is required when Type is set to DATA_SOURCE.</p>
     */
    @NameInMap("DataSource")
    public String dataSourceShrink;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales metrics and policy documents</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The document configuration. This parameter is required when Type is set to DOCUMENT.</p>
     */
    @NameInMap("Document")
    public String documentShrink;

    /**
     * <p>The ID of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The name of the source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales topic project</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The project configuration. This parameter is required when Type is set to PROJECT.</p>
     */
    @NameInMap("Project")
    public String projectShrink;

    /**
     * <p>The type of the knowledge source. Valid values: PROJECT, DATA_SOURCE, and DOCUMENT.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROJECT</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateKnowledgeSourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeSourceShrinkRequest self = new CreateKnowledgeSourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeSourceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateKnowledgeSourceShrinkRequest setDataSourceShrink(String dataSourceShrink) {
        this.dataSourceShrink = dataSourceShrink;
        return this;
    }
    public String getDataSourceShrink() {
        return this.dataSourceShrink;
    }

    public CreateKnowledgeSourceShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeSourceShrinkRequest setDocumentShrink(String documentShrink) {
        this.documentShrink = documentShrink;
        return this;
    }
    public String getDocumentShrink() {
        return this.documentShrink;
    }

    public CreateKnowledgeSourceShrinkRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public CreateKnowledgeSourceShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKnowledgeSourceShrinkRequest setProjectShrink(String projectShrink) {
        this.projectShrink = projectShrink;
        return this;
    }
    public String getProjectShrink() {
        return this.projectShrink;
    }

    public CreateKnowledgeSourceShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
