// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDocumentCollectionShrinkRequest extends TeaModel {
    /**
     * <p>The name of the document collection that you want to create.</p>
     * <blockquote>
     * <p>The name must comply with PostgreSQL object naming restrictions.</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> API to view details of all AnalyticDB for PostgreSQL instances in the target region, including the instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Dimension")
    public Integer dimension;

    /**
     * <p>The vectorization algorithm.</p>
     * <blockquote>
     * <p> Supported algorithms:</p>
     * </blockquote>
     * <ul>
     * <li><p>text-embedding-v1: the algorithm that produces 1536-dimensional vectors.</p>
     * </li>
     * <li><p>text-embedding-v2: the algorithm that produces 1536-dimensional vectors.</p>
     * </li>
     * <li><p>text2vec: the algorithm that produces 1024-dimensional vectors.</p>
     * </li>
     * <li><p>m3e-base: the algorithm that produces 768-dimensional vectors.</p>
     * </li>
     * <li><p>m3e-small: the algorithm that produces 512-dimensional vectors.</p>
     * </li>
     * <li><p>clip-vit-b-32: the image vectorization algorithm that uses the Contrastive Language-Image Pre-Training (CLIP) ViT-B/32 model and produces 512-dimensional vectors.</p>
     * </li>
     * <li><p>clip-vit-b-16: the image vectorization algorithm that uses the CLIP ViT-B/16 model and produces 512-dimensional vectors.</p>
     * </li>
     * <li><p>clip-vit-l-14: the image vectorization algorithm that uses the CLIP ViT-L/14 model and produces 768-dimensional vectors.</p>
     * </li>
     * <li><p>clip-vit-l-14-336px: the image vectorization algorithm that uses the CLIP ViT-L/14@336px model and produces 768-dimensional vectors.</p>
     * </li>
     * <li><p>clip-rn50: the image vectorization algorithm that uses the CLIP RN50 model and produces 1024-dimensional vectors.</p>
     * </li>
     * <li><p>clip-rn101: the image vectorization algorithm that uses the CLIP RN101 model and produces 512-dimensional vectors.</p>
     * </li>
     * <li><p>clip-rn50x4: the image vectorization algorithm that uses the CLIP RN50x4 model and produces 640-dimensional vectors.</p>
     * </li>
     * <li><p>clip-rn50x16: the image vectorization algorithm that uses the CLIP RN50x16 model and produces 768-dimensional vectors.</p>
     * </li>
     * <li><p>clip-rn50x64: the image vectorization algorithm that uses the CLIP RN50x64 model and produces 1024-dimensional vectors.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v1</p>
     */
    @NameInMap("EmbeddingModel")
    public String embeddingModel;

    @NameInMap("EnableGraph")
    public Boolean enableGraph;

    @NameInMap("EntityTypes")
    public String entityTypesShrink;

    /**
     * <p>Specifies whether to use the memory mapping technology to create HNSW indexes. Valid values: 0 and 1. Default value: 0. We recommend that you set the value to 1 in scenarios that require upload speed but not data deletion.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>0: uses segmented paging storage to create indexes. This method uses the shared buffer of PostgreSQL for caching and supports the delete and update operations.</p>
     * </li>
     * <li><p>1: uses the memory mapping technology to create indexes. This method does not support the delete or update operation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExternalStorage")
    public Integer externalStorage;

    /**
     * <p>The fields used for full-text search. Separate multiple fields with commas (,). These fields must be keys defined in Metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>title,page</p>
     */
    @NameInMap("FullTextRetrievalFields")
    public String fullTextRetrievalFields;

    @NameInMap("HnswEfConstruction")
    public String hnswEfConstruction;

    /**
     * <p>The maximum number of neighbors for the Hierarchical Navigable Small World (HNSW) algorithm. Valid values: 1 to 1000. In most cases, this parameter is automatically configured based on the value of the Dimension parameter. You do not need to configure this parameter.</p>
     * <blockquote>
     * <p> We recommend that you configure this parameter based on the value of the Dimension parameter.</p>
     * </blockquote>
     * <ul>
     * <li><p>If you set Dimension to a value less than or equal to 384, set the value of HnswM to 16.</p>
     * </li>
     * <li><p>If you set Dimension to a value greater than 384 and less than or equal to 768, set the value of HnswM to 32.</p>
     * </li>
     * <li><p>If you set Dimension to a value greater than 768 and less than or equal to 1024, set the value of HnswM to 64.</p>
     * </li>
     * <li><p>If you set Dimension to a value greater than 1024, set the value of HnswM to 128.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("HnswM")
    public Integer hnswM;

    @NameInMap("LLMModel")
    public String LLMModel;

    @NameInMap("Language")
    public String language;

    /**
     * <p>The name of the manager account that has the rds_superuser permission.</p>
     * <blockquote>
     * <p>You can create an account through the console -&gt; Account Management, or by using the <a href="https://help.aliyun.com/document_detail/2361789.html">CreateAccount</a> API.</p>
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
     * <p>The metadata of the vector data, which is a JSON string in the MAP format. The key specifies the field name, and the value specifies the data type.</p>
     * <blockquote>
     * <p>Supported data types:</p>
     * <ul>
     * <li>For information about data types, see: <a href="https://www.alibabacloud.com/help/en/analyticdb/analyticdb-for-postgresql/developer-reference/data-types-1/">Data Types</a>.</li>
     * <li>The money type is not supported.</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <p>Warning: The fields id, vector, doc_name, content, loader_metadata, source, and to_tsvector are reserved and should not be used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;title&quot;:&quot;text&quot;,&quot;page&quot;:&quot;int&quot;}</p>
     */
    @NameInMap("Metadata")
    public String metadata;

    /**
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("MetadataIndices")
    public String metadataIndices;

    /**
     * <p>The method that is used to create vector indexes.</p>
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
     * <p>The name of the namespace. Default value: public.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation to create a namespace and call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to query a list of namespaces.</p>
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
     * <p>The analyzer that is used for full-text search. Default value: zh_cn.</p>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Parser")
    public String parser;

    /**
     * <p>Specifies whether to enable the product quantization (PQ) feature for index acceleration. We recommend that you enable this feature for more than 500,000 rows of data. Valid values:</p>
     * <ul>
     * <li>0: no.</li>
     * <li>1 (default): yes.</li>
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

    @NameInMap("RelationshipTypes")
    public String relationshipTypesShrink;

    @NameInMap("SparseRetrievalFields")
    public String sparseRetrievalFields;

    @NameInMap("SparseVectorIndexConfig")
    public String sparseVectorIndexConfigShrink;

    @NameInMap("SupportSparse")
    public Boolean supportSparse;

    public static CreateDocumentCollectionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDocumentCollectionShrinkRequest self = new CreateDocumentCollectionShrinkRequest();
        return TeaModel.build(map, self);
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

}
