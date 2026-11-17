// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeSourceShrinkRequest extends TeaModel {
    /**
     * <p>The complete configuration for Type=DATA_SOURCE.</p>
     */
    @NameInMap("DataSource")
    public String dataSourceShrink;

    /**
     * <p>The new description.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales metrics and policy documents</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The complete configuration for Type=DOCUMENT. Credentials are not returned after they are written.</p>
     */
    @NameInMap("Document")
    public String documentShrink;

    /**
     * <p>The ID of the knowledge base to which the source belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The new name.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales Project</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The complete configuration for Type=PROJECT.</p>
     */
    @NameInMap("Project")
    public String projectShrink;

    /**
     * <p>The source ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>src-001</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    public static UpdateKnowledgeSourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeSourceShrinkRequest self = new UpdateKnowledgeSourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeSourceShrinkRequest setDataSourceShrink(String dataSourceShrink) {
        this.dataSourceShrink = dataSourceShrink;
        return this;
    }
    public String getDataSourceShrink() {
        return this.dataSourceShrink;
    }

    public UpdateKnowledgeSourceShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKnowledgeSourceShrinkRequest setDocumentShrink(String documentShrink) {
        this.documentShrink = documentShrink;
        return this;
    }
    public String getDocumentShrink() {
        return this.documentShrink;
    }

    public UpdateKnowledgeSourceShrinkRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public UpdateKnowledgeSourceShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateKnowledgeSourceShrinkRequest setProjectShrink(String projectShrink) {
        this.projectShrink = projectShrink;
        return this;
    }
    public String getProjectShrink() {
        return this.projectShrink;
    }

    public UpdateKnowledgeSourceShrinkRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

}
