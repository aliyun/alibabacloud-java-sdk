// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDocumentCollectionShrinkRequest extends TeaModel {
    /**
     * <p>The vector index algorithm.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>hnswflat: HNSW index without quantization compression (default).</li>
     * <li>novam: graph index without quantization compression, suitable for high-performance scenarios such as real-time recommendations.</li>
     * <li>novad: partitioned index with RaBitQ quantization, suitable for large-scale low-cost retrieval scenarios.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hnswflat</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The name of the knowledge base to create.</p>
     * <blockquote>
     * <p>The name must comply with PostgreSQL object naming conventions.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The vector dimensions. The default value is the dimension supported by the embedding model.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Dimension")
    public Integer dimension;

    /**
     * <p>The embedding model. Default value: text-embedding-v3.</p>
     * <blockquote>
     * <p>Supported models:</p>
     * <ul>
     * <li>text-embedding-v3 (recommended, default): 1024, 768, or 512 dimensions</li>
     * <li>multimodal-embedding-v1 (recommended): 1024 dimensions, multimodal embedding model</li>
     * <li>text-embedding-v1: 1536 dimensions</li>
     * <li>text-embedding-v2: 1536 dimensions</li>
     * <li>text2vec (not recommended): 1024 dimensions</li>
     * <li>m3e-base (not recommended): 768 dimensions</li>
     * <li>m3e-small (not recommended): 512 dimensions</li>
     * <li>clip-vit-b-32 (not recommended): CLIP ViT-B/32 model, 512 dimensions, image embedding model</li>
     * <li>clip-vit-b-16 (not recommended): CLIP ViT-B/16 model, 512 dimensions, image embedding model</li>
     * <li>clip-vit-l-14 (not recommended): CLIP ViT-L/14 model, 768 dimensions, image embedding model</li>
     * <li>clip-vit-l-14-336px (not recommended): CLIP ViT-L/14@336px model, 768 dimensions, image embedding model</li>
     * <li>clip-rn50 (not recommended): CLIP RN50 model, 1024 dimensions, image embedding model</li>
     * <li>clip-rn101 (not recommended): CLIP RN101 model, 512 dimensions, image embedding model</li>
     * <li>clip-rn50x4 (not recommended): CLIP RN50x4 model, 640 dimensions, image embedding model</li>
     * <li>clip-rn50x16 (not recommended): CLIP RN50x16 model, 768 dimensions, image embedding model</li>
     * <li>clip-rn50x64 (not recommended): CLIP RN50x64 model, 1024 dimensions, image embedding model</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v1</p>
     */
    @NameInMap("EmbeddingModel")
    public String embeddingModel;

    /**
     * <p>Specifies whether to enable knowledge graph construction. Default value: false.</p>
     * <blockquote>
     * <p>Before using this parameter, upgrade the instance to a version that supports the graph engine. (During the public preview, submit a ticket to upgrade the version.)</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableGraph")
    public Boolean enableGraph;

    /**
     * <p>The list of entity types.</p>
     * <blockquote>
     * <p>This parameter is required when knowledge graph construction is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Location</p>
     */
    @NameInMap("EntityTypes")
    public String entityTypesShrink;

    /**
     * <p>Specifies whether to use mmap to build the HNSW index. Default value: 0. If data does not need to be deleted and you require high upload performance, set this parameter to 1.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>0: uses segment-page storage to build the index. This mode uses shared_buffer in PostgreSQL as cache and supports delete and update operations.</li>
     * <li>1: uses mmap to build the index. This mode does not support delete or update operations.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: Only version 6.0 supports the ExternalStorage parameter. Version 7.0 does not support this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExternalStorage")
    public Integer externalStorage;

    /**
     * <p>The fields used for full-text retrieval. Separate multiple fields with commas (,). The fields must be keys defined in Metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>title,page</p>
     */
    @NameInMap("FullTextRetrievalFields")
    public String fullTextRetrievalFields;

    /**
     * <p>The candidate set size when building an index with the HNSW algorithm. The value must be &gt;= 2*HNSW_M.</p>
     * <blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>AnalyticDB for PostgreSQL 6.0 instances: 40 to 4000.</li>
     * <li>AnalyticDB for PostgreSQL 7.0 instances: 4 to 1000. Default value: 64.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("HnswEfConstruction")
    public String hnswEfConstruction;

    /**
     * <p>The maximum number of neighbors in the HNSW algorithm. This value is automatically set based on the vector dimensions. Manual configuration is generally not required.</p>
     * <blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>AnalyticDB for PostgreSQL 6.0 instances: 1 to 1000.</li>
     * <li>AnalyticDB for PostgreSQL 7.0 instances: 2 to 100. Default value: 16.</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <p>Recommended values based on vector dimensions:</p>
     * <ul>
     * <li>384 or fewer: 16</li>
     * <li>Greater than 384 and up to 768: 32</li>
     * <li>Greater than 768 and up to 1024: 64</li>
     * <li>Greater than 1024: 128</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("HnswM")
    public Integer hnswM;

    /**
     * <p>The LLM model name. Valid values:</p>
     * <ul>
     * <li>knowledge-extract-standard: default value.</li>
     * <li>knowledge-extract-mini<blockquote>
     * <p>This parameter takes effect only when knowledge graph construction is enabled.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>knowledge-extract-standard</p>
     */
    @NameInMap("LLMModel")
    public String LLMModel;

    /**
     * <p>The language used for knowledge graph construction. Valid values:</p>
     * <ul>
     * <li>Simplified Chinese: Simplified Chinese. Default value.</li>
     * <li>English: English.<blockquote>
     * <p>This parameter takes effect only when knowledge graph construction is enabled.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Simplified Chinese</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The name of the management account that has the rds_superuser permission.</p>
     * <blockquote>
     * <p>You can create an account in the console by navigating to Account Management, or by calling the <a href="https://help.aliyun.com/document_detail/2361789.html">CreateAccount</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testaccount</p>
     */
    @NameInMap("ManagerAccount")
    public String managerAccount;

    /**
     * <p>The password of the management account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("ManagerAccountPassword")
    public String managerAccountPassword;

    /**
     * <p>The metadata of vector data, in the format of a JSON string representing a MAP. The key represents the field name, and the value represents the data type.</p>
     * <blockquote>
     * <p>Supported data types:</p>
     * <ul>
     * <li>For the list of data types, see <a href="https://help.aliyun.com/document_detail/424383.html">Data types</a>.</li>
     * <li>The money type is not supported.</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <p>Warning: The following fields are reserved and cannot be used: id, vector, doc_name, content, loader_metadata, source, and to_tsvector.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;title&quot;:&quot;text&quot;,&quot;page&quot;:&quot;int&quot;}</p>
     */
    @NameInMap("Metadata")
    public String metadata;

    /**
     * <p>The scalar index fields. Separate multiple fields with commas (,). The fields must be keys defined in Metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("MetadataIndices")
    public String metadataIndices;

    /**
     * <p>The distance metric used for building vector indexes.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>l2</strong>: Euclidean distance.</li>
     * <li><strong>ip</strong>: inner product distance.</li>
     * <li><strong>cosine</strong> (default): cosine similarity.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cosine</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>The namespace. Default value: public.</p>
     * <blockquote>
     * <p>You can create a namespace by calling the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation and query the list of namespaces by calling the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The tokenizer used for full-text retrieval. Default value: zh_cn.</p>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Parser")
    public String parser;

    /**
     * <p>Specifies whether to enable Product Quantization (PQ) algorithm acceleration for the index. We recommend enabling this feature when the data volume exceeds 500,000. Valid values:</p>
     * <ul>
     * <li>0: disabled.</li>
     * <li>1: enabled (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PqEnable")
    public Integer pqEnable;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of relationship edge types.</p>
     * <blockquote>
     * <p>This parameter is required when knowledge graph construction is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Occurred</p>
     */
    @NameInMap("RelationshipTypes")
    public String relationshipTypesShrink;

    /**
     * <p>The metadata fields used for building sparse vectors. Separate multiple fields with commas (,). The fields must be keys defined in Metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>title,abstract</p>
     */
    @NameInMap("SparseRetrievalFields")
    public String sparseRetrievalFields;

    /**
     * <p>The sparse vector index configuration. If specified, a sparse vector index is created.</p>
     */
    @NameInMap("SparseVectorIndexConfig")
    public String sparseVectorIndexConfigShrink;

    /**
     * <p>Specifies whether to support sparse vectors. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SupportSparse")
    public Boolean supportSparse;

    /**
     * <p>The dense vector index configuration.</p>
     */
    @NameInMap("VectorIndexConfig")
    public String vectorIndexConfigShrink;

    public static CreateDocumentCollectionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDocumentCollectionShrinkRequest self = new CreateDocumentCollectionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDocumentCollectionShrinkRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateDocumentCollectionShrinkRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public CreateDocumentCollectionShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDocumentCollectionShrinkRequest setDimension(Integer dimension) {
        this.dimension = dimension;
        return this;
    }
    public Integer getDimension() {
        return this.dimension;
    }

    public CreateDocumentCollectionShrinkRequest setEmbeddingModel(String embeddingModel) {
        this.embeddingModel = embeddingModel;
        return this;
    }
    public String getEmbeddingModel() {
        return this.embeddingModel;
    }

    public CreateDocumentCollectionShrinkRequest setEnableGraph(Boolean enableGraph) {
        this.enableGraph = enableGraph;
        return this;
    }
    public Boolean getEnableGraph() {
        return this.enableGraph;
    }

    public CreateDocumentCollectionShrinkRequest setEntityTypesShrink(String entityTypesShrink) {
        this.entityTypesShrink = entityTypesShrink;
        return this;
    }
    public String getEntityTypesShrink() {
        return this.entityTypesShrink;
    }

    public CreateDocumentCollectionShrinkRequest setExternalStorage(Integer externalStorage) {
        this.externalStorage = externalStorage;
        return this;
    }
    public Integer getExternalStorage() {
        return this.externalStorage;
    }

    public CreateDocumentCollectionShrinkRequest setFullTextRetrievalFields(String fullTextRetrievalFields) {
        this.fullTextRetrievalFields = fullTextRetrievalFields;
        return this;
    }
    public String getFullTextRetrievalFields() {
        return this.fullTextRetrievalFields;
    }

    public CreateDocumentCollectionShrinkRequest setHnswEfConstruction(String hnswEfConstruction) {
        this.hnswEfConstruction = hnswEfConstruction;
        return this;
    }
    public String getHnswEfConstruction() {
        return this.hnswEfConstruction;
    }

    public CreateDocumentCollectionShrinkRequest setHnswM(Integer hnswM) {
        this.hnswM = hnswM;
        return this;
    }
    public Integer getHnswM() {
        return this.hnswM;
    }

    public CreateDocumentCollectionShrinkRequest setLLMModel(String LLMModel) {
        this.LLMModel = LLMModel;
        return this;
    }
    public String getLLMModel() {
        return this.LLMModel;
    }

    public CreateDocumentCollectionShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateDocumentCollectionShrinkRequest setManagerAccount(String managerAccount) {
        this.managerAccount = managerAccount;
        return this;
    }
    public String getManagerAccount() {
        return this.managerAccount;
    }

    public CreateDocumentCollectionShrinkRequest setManagerAccountPassword(String managerAccountPassword) {
        this.managerAccountPassword = managerAccountPassword;
        return this;
    }
    public String getManagerAccountPassword() {
        return this.managerAccountPassword;
    }

    public CreateDocumentCollectionShrinkRequest setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
    }

    public CreateDocumentCollectionShrinkRequest setMetadataIndices(String metadataIndices) {
        this.metadataIndices = metadataIndices;
        return this;
    }
    public String getMetadataIndices() {
        return this.metadataIndices;
    }

    public CreateDocumentCollectionShrinkRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public CreateDocumentCollectionShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateDocumentCollectionShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDocumentCollectionShrinkRequest setParser(String parser) {
        this.parser = parser;
        return this;
    }
    public String getParser() {
        return this.parser;
    }

    public CreateDocumentCollectionShrinkRequest setPqEnable(Integer pqEnable) {
        this.pqEnable = pqEnable;
        return this;
    }
    public Integer getPqEnable() {
        return this.pqEnable;
    }

    public CreateDocumentCollectionShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDocumentCollectionShrinkRequest setRelationshipTypesShrink(String relationshipTypesShrink) {
        this.relationshipTypesShrink = relationshipTypesShrink;
        return this;
    }
    public String getRelationshipTypesShrink() {
        return this.relationshipTypesShrink;
    }

    public CreateDocumentCollectionShrinkRequest setSparseRetrievalFields(String sparseRetrievalFields) {
        this.sparseRetrievalFields = sparseRetrievalFields;
        return this;
    }
    public String getSparseRetrievalFields() {
        return this.sparseRetrievalFields;
    }

    public CreateDocumentCollectionShrinkRequest setSparseVectorIndexConfigShrink(String sparseVectorIndexConfigShrink) {
        this.sparseVectorIndexConfigShrink = sparseVectorIndexConfigShrink;
        return this;
    }
    public String getSparseVectorIndexConfigShrink() {
        return this.sparseVectorIndexConfigShrink;
    }

    public CreateDocumentCollectionShrinkRequest setSupportSparse(Boolean supportSparse) {
        this.supportSparse = supportSparse;
        return this;
    }
    public Boolean getSupportSparse() {
        return this.supportSparse;
    }

    public CreateDocumentCollectionShrinkRequest setVectorIndexConfigShrink(String vectorIndexConfigShrink) {
        this.vectorIndexConfigShrink = vectorIndexConfigShrink;
        return this;
    }
    public String getVectorIndexConfigShrink() {
        return this.vectorIndexConfigShrink;
    }

}
