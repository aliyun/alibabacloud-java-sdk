// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDocumentCollectionShrinkRequest extends TeaModel {
    /**
     * <p>The vector index algorithm.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>hnswflat</code>: An HNSW index without quantization compression. This is the default value.</p>
     * </li>
     * <li><p><code>novam</code>: A graph index without quantization compression. This algorithm is suitable for high-performance scenarios such as real-time recommendation.</p>
     * </li>
     * <li><p><code>novad</code>: A partitioned index with rabitq quantization. This algorithm is suitable for large-scale, low-cost retrieval scenarios.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hnswflat</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The name of the document collection to create.</p>
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
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in the target region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The vector dimension. If you omit this parameter, the system uses a default dimension for the selected <code>EmbeddingModel</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Dimension")
    public Integer dimension;

    /**
     * <p>The embedding model. The default value is <code>text-embedding-v3</code>.</p>
     * <blockquote>
     * <p>Supported models:</p>
     * <ul>
     * <li><p><code>text-embedding-v3</code> (Recommended, Default): 1,024, 768, or 512 dimensions</p>
     * </li>
     * <li><p><code>multimodal-embedding-v1</code> (Recommended): 1,024 dimensions, a multimodal embedding model</p>
     * </li>
     * <li><p><code>text-embedding-v1</code>: 1,536 dimensions</p>
     * </li>
     * <li><p><code>text-embedding-v2</code>: 1,536 dimensions</p>
     * </li>
     * <li><p><code>text2vec</code> (Not recommended): 1,024 dimensions</p>
     * </li>
     * <li><p><code>m3e-base</code> (Not recommended): 768 dimensions</p>
     * </li>
     * <li><p><code>m3e-small</code> (Not recommended): 512 dimensions</p>
     * </li>
     * <li><p><code>clip-vit-b-32</code> (Not recommended): CLIP ViT-B/32 model, 512 dimensions, an image embedding model</p>
     * </li>
     * <li><p><code>clip-vit-b-16</code> (Not recommended): CLIP ViT-B/16 model, 512 dimensions, an image embedding model</p>
     * </li>
     * <li><p><code>clip-vit-l-14</code> (Not recommended): CLIP ViT-L/14 model, 768 dimensions, an image embedding model</p>
     * </li>
     * <li><p><code>clip-vit-l-14-336px</code> (Not recommended): CLIP ViT-L/14\@336px model, 768 dimensions, an image embedding model</p>
     * </li>
     * <li><p><code>clip-rn50</code> (Not recommended): CLIP RN50 model, 1,024 dimensions, an image embedding model</p>
     * </li>
     * <li><p><code>clip-rn101</code> (Not recommended): CLIP RN101 model, 512 dimensions, an image embedding model</p>
     * </li>
     * <li><p><code>clip-rn50x4</code> (Not recommended): CLIP RN50x4 model, 640 dimensions, an image embedding model</p>
     * </li>
     * <li><p><code>clip-rn50x16</code> (Not recommended): CLIP RN50x16 model, 768 dimensions, an image embedding model</p>
     * </li>
     * <li><p><code>clip-rn50x64</code> (Not recommended): CLIP RN50x64 model, 1,024 dimensions, an image embedding model</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v1</p>
     */
    @NameInMap("EmbeddingModel")
    public String embeddingModel;

    /**
     * <p>Specifies whether to build a knowledge graph. The default value is <code>false</code>.</p>
     * <blockquote>
     * <p>To use this parameter, you must first upgrade your instance to a version that supports the graph engine. During the public preview period, submit a ticket to request an upgrade.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableGraph")
    public Boolean enableGraph;

    /**
     * <p>A list of entity types.</p>
     * <blockquote>
     * <p>This parameter is required when <code>EnableGraph</code> is set to <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Location</p>
     */
    @NameInMap("EntityTypes")
    public String entityTypesShrink;

    /**
     * <p>Specifies whether to use memory-mapped files (mmap) to build the HNSW index. The default value is 0. Setting this to <code>1</code> is recommended if you do not need to delete data and require high upload performance.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>0</code>: Builds the index by using segmented page storage. This mode supports delete and update operations and can use the <code>shared_buffer</code> in PostgreSQL for caching. This is the default value.</p>
     * </li>
     * <li><p><code>1</code>: Builds the index by using mmap. This mode does not support delete or update operations.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The <code>ExternalStorage</code> parameter is supported only by AnalyticDB for PostgreSQL V6.0 instances. It is not supported by V7.0 instances.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExternalStorage")
    public Integer externalStorage;

    /**
     * <p>The metadata fields to use for full-text search. These fields must be keys defined in <code>Metadata</code>. Separate multiple fields with a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>title,page</p>
     */
    @NameInMap("FullTextRetrievalFields")
    public String fullTextRetrievalFields;

    /**
     * <p>The size of the candidate set (<code>ef_construction</code>) for HNSW index construction. The value must be greater than or equal to <code>2 * HnswM</code>.</p>
     * <blockquote>
     * <p>Value range:</p>
     * <ul>
     * <li><p>For AnalyticDB for PostgreSQL V6.0 instances: 40 to 4,000.</p>
     * </li>
     * <li><p>For AnalyticDB for PostgreSQL V7.0 instances: 4 to 1,000. The default value is 64.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("HnswEfConstruction")
    public String hnswEfConstruction;

    /**
     * <p>The maximum number of neighbors (M) for the HNSW algorithm. You do not typically need to set this parameter, as the system automatically sets it based on the vector dimension.</p>
     * <blockquote>
     * <p>Value range:</p>
     * <ul>
     * <li><p>For AnalyticDB for PostgreSQL V6.0 instances: 1 to 1,000.</p>
     * </li>
     * <li><p>For AnalyticDB for PostgreSQL V7.0 instances: 2 to 100. The default value is 16.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <p>We recommend that you set this parameter based on the vector dimension:</p>
     * <ul>
     * <li><p>If the dimension is 384 or less: 16</p>
     * </li>
     * <li><p>If the dimension is greater than 384 and less than or equal to 768: 32</p>
     * </li>
     * <li><p>If the dimension is greater than 768 and less than or equal to 1,024: 64</p>
     * </li>
     * <li><p>If the dimension is greater than 1,024: 128</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("HnswM")
    public Integer hnswM;

    /**
     * <p>The name of the LLM model. Valid values:</p>
     * <ul>
     * <li><p><code>knowledge-extract-standard</code>: The default value.</p>
     * </li>
     * <li><p><code>knowledge-extract-mini</code></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <code>EnableGraph</code> is set to <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>knowledge-extract-standard</p>
     */
    @NameInMap("LLMModel")
    public String LLMModel;

    /**
     * <p>The language used to build the knowledge graph. Valid values:</p>
     * <ul>
     * <li><p><code>Simplified Chinese</code>: The default value.</p>
     * </li>
     * <li><p><code>English</code></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <code>EnableGraph</code> is set to <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Simplified Chinese</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The name of the manager account that has <code>rds_superuser</code> permissions.</p>
     * <blockquote>
     * <p>You can create an account in the console on the \<em>\<em>Account Management\</em>\</em> page or by calling the <a href="https://help.aliyun.com/document_detail/2361789.html">CreateAccount</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testaccount</p>
     */
    @NameInMap("ManagerAccount")
    public String managerAccount;

    /**
     * <p>The password for the manager account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("ManagerAccountPassword")
    public String managerAccountPassword;

    /**
     * <p>The metadata schema for the vector data, specified as a JSON map where keys are field names and values are data types.</p>
     * <blockquote>
     * <p>Supported data types</p>
     * <ul>
     * <li><p>For a list of supported data types, see <a href="https://help.aliyun.com/document_detail/424383.html">Data types</a>.</p>
     * </li>
     * <li><p>The <code>money</code> data type is not supported.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <p>Warning: </p>
     * </blockquote>
     * <p>The following fields are reserved and cannot be used: <code>id</code>, <code>vector</code>, <code>doc_name</code>, <code>content</code>, <code>loader_metadata</code>, <code>source</code>, and <code>to_tsvector</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;title&quot;:&quot;text&quot;,&quot;page&quot;:&quot;int&quot;}</p>
     */
    @NameInMap("Metadata")
    public String metadata;

    /**
     * <p>The metadata fields on which to create scalar indexes. These fields must be keys defined in <code>Metadata</code>. Separate multiple fields with a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("MetadataIndices")
    public String metadataIndices;

    /**
     * <p>The distance metric for the vector index.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong><code>l2</code></strong>: Euclidean distance.</p>
     * </li>
     * <li><p><strong><code>ip</code></strong>: dot product (inner product) distance.</p>
     * </li>
     * <li><p><strong><code>cosine</code></strong> (Default): cosine similarity.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cosine</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>The namespace. The default value is <code>public</code>.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation to create a namespace and the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to list namespaces.</p>
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
     * <p>The tokenizer for full-text search. The default value is <code>zh_cn</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Parser")
    public String parser;

    /**
     * <p>Specifies whether to enable the PQ (product quantization) algorithm to accelerate indexing. This is recommended for datasets with over 500,000 entries. Valid values:</p>
     * <ul>
     * <li><p><code>0</code>: Disables the feature.</p>
     * </li>
     * <li><p><code>1</code>: Enables the feature. This is the default value.</p>
     * </li>
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
     * <p>A list of relationship types.</p>
     * <blockquote>
     * <p>This parameter is required when <code>EnableGraph</code> is set to <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Occurred</p>
     */
    @NameInMap("RelationshipTypes")
    public String relationshipTypesShrink;

    /**
     * <p>The metadata fields used to build the sparse vector. These fields must be keys defined in <code>Metadata</code>. Separate multiple fields with a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>title,abstract</p>
     */
    @NameInMap("SparseRetrievalFields")
    public String sparseRetrievalFields;

    /**
     * <p>Configuration for the sparse vector index. Specifying this parameter creates the index.</p>
     */
    @NameInMap("SparseVectorIndexConfig")
    public String sparseVectorIndexConfigShrink;

    /**
     * <p>Specifies whether to support sparse vectors. The default value is <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SupportSparse")
    public Boolean supportSparse;

    /**
     * <p>Configuration for the dense vector index.</p>
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
