// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseShrinkRequest extends TeaModel {
    /**
     * <p>The EventHouse catalog to which the knowledge base belongs. This parameter, together with Namespace and KnowledgeBaseName, uniquely identifies the knowledge base. This parameter cannot be modified after the knowledge base is created. System catalogs cannot be bound.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>Optional. The default chunking strategy for the knowledge base. This strategy applies only to documents uploaded after the configuration is set. If this parameter is not specified, the system default chunking strategy is used.</p>
     */
    @NameInMap("ChunkConfiguration")
    public String chunkConfigurationShrink;

    /**
     * <p>The description of the knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>Product documentation knowledge base</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Optional. The vector dimensions. The value is validated against the embedding model: text-embedding-v3 supports 64, 128, 256, 512, 768, and 1024. text-embedding-v4 supports 64, 128, 256, 512, 768, 1024, 1536, and 2048. qwen3.7-text-embedding supports 256, 512, 768, 1024, 1536, 2048, and 2560. qwen3.7-text-embedding-flash supports 256, 512, 768, and 1024. Default value: 1024 (the default dimension of the model). This parameter cannot be modified after the knowledge base is created. Even if the dimensions are the same, you must rebuild the knowledge base when switching models.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("EmbeddingDimension")
    public Integer embeddingDimension;

    /**
     * <p>Optional. The embedding model used for vectorization. This parameter cannot be modified after the knowledge base is created. Valid values: text-embedding-v3, text-embedding-v4, qwen3.7-text-embedding, and qwen3.7-text-embedding-flash. Only Bailian Tongyi models are supported. Third-party models are not supported. Default value: text-embedding-v4.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v4</p>
     */
    @NameInMap("EmbeddingModel")
    public String embeddingModel;

    /**
     * <p>The name of the knowledge base. The name must be unique within the namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>product-docs</p>
     */
    @NameInMap("KnowledgeBaseName")
    public String knowledgeBaseName;

    /**
     * <p>Declares the metadata fields of the knowledge base. When you upload documents, the metadata can contain only the fields declared here. This parameter cannot be modified after the knowledge base is created.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Name&quot;:&quot;department&quot;,&quot;Type&quot;:&quot;STRING&quot;}]</p>
     */
    @NameInMap("MetadataSchema")
    public String metadataSchemaShrink;

    /**
     * <p>The EventHouse namespace to which the knowledge base belongs. The namespace must belong to the specified catalog. This parameter, together with Catalog and KnowledgeBaseName, uniquely identifies the knowledge base. This parameter cannot be modified after the knowledge base is created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Optional. The default search configuration at the knowledge base level. This configuration takes effect when the corresponding parameters are not specified in search requests. You can modify this configuration after creation by calling UpdateKnowledgeBase.</p>
     */
    @NameInMap("SearchConfiguration")
    public String searchConfigurationShrink;

    public static CreateKnowledgeBaseShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseShrinkRequest self = new CreateKnowledgeBaseShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseShrinkRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public CreateKnowledgeBaseShrinkRequest setChunkConfigurationShrink(String chunkConfigurationShrink) {
        this.chunkConfigurationShrink = chunkConfigurationShrink;
        return this;
    }
    public String getChunkConfigurationShrink() {
        return this.chunkConfigurationShrink;
    }

    public CreateKnowledgeBaseShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeBaseShrinkRequest setEmbeddingDimension(Integer embeddingDimension) {
        this.embeddingDimension = embeddingDimension;
        return this;
    }
    public Integer getEmbeddingDimension() {
        return this.embeddingDimension;
    }

    public CreateKnowledgeBaseShrinkRequest setEmbeddingModel(String embeddingModel) {
        this.embeddingModel = embeddingModel;
        return this;
    }
    public String getEmbeddingModel() {
        return this.embeddingModel;
    }

    public CreateKnowledgeBaseShrinkRequest setKnowledgeBaseName(String knowledgeBaseName) {
        this.knowledgeBaseName = knowledgeBaseName;
        return this;
    }
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public CreateKnowledgeBaseShrinkRequest setMetadataSchemaShrink(String metadataSchemaShrink) {
        this.metadataSchemaShrink = metadataSchemaShrink;
        return this;
    }
    public String getMetadataSchemaShrink() {
        return this.metadataSchemaShrink;
    }

    public CreateKnowledgeBaseShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateKnowledgeBaseShrinkRequest setSearchConfigurationShrink(String searchConfigurationShrink) {
        this.searchConfigurationShrink = searchConfigurationShrink;
        return this;
    }
    public String getSearchConfigurationShrink() {
        return this.searchConfigurationShrink;
    }

}
