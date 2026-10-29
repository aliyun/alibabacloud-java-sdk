// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseShrinkRequest extends TeaModel {
    /**
     * <p>The data catalog to which the knowledge base belongs. It is used together with Namespace and KnowledgeBaseName to locate the knowledge base. You can call ListCatalogs to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>Optional. Updates the default chunking strategy of the knowledge base. This update takes effect only for newly uploaded documents and does not re-chunk existing documents. If this parameter is not specified, the strategy is not modified.</p>
     */
    @NameInMap("ChunkConfiguration")
    public String chunkConfigurationShrink;

    /**
     * <p>Updates the description of the knowledge base. If this parameter is not specified, the description is not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>Product documentation knowledge base</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the knowledge base. The name must be unique within the namespace. It is specified during creation and cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-knowledge-base</p>
     */
    @NameInMap("KnowledgeBaseName")
    public String knowledgeBaseName;

    /**
     * <p>The namespace to which the knowledge base belongs. The namespace must belong to the specified data catalog. It is used together with Catalog and KnowledgeBaseName to locate the knowledge base. You can call ListNamespaces to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Optional. Updates the default search configuration at the knowledge base level. The update takes effect immediately for subsequent search requests. If this parameter is not specified, the configuration is not modified.</p>
     */
    @NameInMap("SearchConfiguration")
    public String searchConfigurationShrink;

    public static UpdateKnowledgeBaseShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseShrinkRequest self = new UpdateKnowledgeBaseShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseShrinkRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public UpdateKnowledgeBaseShrinkRequest setChunkConfigurationShrink(String chunkConfigurationShrink) {
        this.chunkConfigurationShrink = chunkConfigurationShrink;
        return this;
    }
    public String getChunkConfigurationShrink() {
        return this.chunkConfigurationShrink;
    }

    public UpdateKnowledgeBaseShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKnowledgeBaseShrinkRequest setKnowledgeBaseName(String knowledgeBaseName) {
        this.knowledgeBaseName = knowledgeBaseName;
        return this;
    }
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public UpdateKnowledgeBaseShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateKnowledgeBaseShrinkRequest setSearchConfigurationShrink(String searchConfigurationShrink) {
        this.searchConfigurationShrink = searchConfigurationShrink;
        return this;
    }
    public String getSearchConfigurationShrink() {
        return this.searchConfigurationShrink;
    }

}
