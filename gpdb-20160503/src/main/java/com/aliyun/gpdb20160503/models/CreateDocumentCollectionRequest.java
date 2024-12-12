// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDocumentCollectionRequest extends TeaModel {
    /**
     * <p>Name of the document library to be created.</p>
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
     * <p>Instance ID.</p>
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

    /**
     * <p>Vectorization algorithm.</p>
     * <blockquote>
     * <p>Supported algorithms:</p>
     * <ul>
     * <li>text-embedding-v1: 1536 dimensions</li>
     * <li>text-embedding-v2: 1536 dimensions</li>
     * <li>text2vec: 1024 dimensions</li>
     * <li>m3e-base: 768 dimensions</li>
     * <li>m3e-small: 512 dimensions</li>
     * <li>clip-vit-b-32: CLIP ViT-B/32 model, 512 dimensions, image vectorization algorithm</li>
     * <li>clip-vit-b-16: CLIP ViT-B/16 model, 512 dimensions, image vectorization algorithm</li>
     * <li>clip-vit-l-14: CLIP ViT-L/14 model, 768 dimensions, image vectorization algorithm</li>
     * <li>clip-vit-l-14-336px: CLIP ViT-L/14@336px model, 768 dimensions, image vectorization algorithm</li>
     * <li>clip-rn50: CLIP RN50 model, 1024 dimensions, image vectorization algorithm</li>
     * <li>clip-rn101: CLIP RN101 model, 512 dimensions, image vectorization algorithm</li>
     * <li>clip-rn50x4: CLIP RN50x4 model, 640 dimensions, image vectorization algorithm</li>
     * <li>clip-rn50x16: CLIP RN50x16 model, 768 dimensions, image vectorization algorithm</li>
     * <li>clip-rn50x64: CLIP RN50x64 model, 1024 dimensions, image vectorization algorithm</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v1</p>
     */
    @NameInMap("EmbeddingModel")
    public String embeddingModel;

    /**
     * <p>Whether to use mmap to build HNSW index, default is 0. If the data does not need to be deleted and there are requirements for the speed of uploading data, it is recommended to set this to 1.</p>
     * <blockquote>
     * <ul>
     * <li>When set to 0, segment-page storage will be used by default to build the index. This mode can use PostgreSQL\&quot;s shared_buffer as a cache and supports operations such as deletion and updates.</li>
     * <li>When set to 1, the index will be built using mmap. This mode does not support deletion or update operations.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExternalStorage")
    public Integer externalStorage;

    /**
     * <p>Fields used for full-text search, separated by commas (,). These fields must be keys defined in Metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>title,page</p>
     */
    @NameInMap("FullTextRetrievalFields")
    public String fullTextRetrievalFields;

    /**
     * <p>The maximum number of neighbors in the HNSW algorithm, ranging from 1 to 1000. The interface will automatically set this value based on the vector dimension, and it generally does not need to be manually configured.</p>
     * <blockquote>
     * <p>It is recommended to set according to the vector dimension: &gt;- For dimensions less than or equal to 384: 16 &gt;- For dimensions greater than 384 but less than or equal to 768: 32 &gt;- For dimensions greater than 768 but less than or equal to 1024: 64 &gt;- For dimensions greater than 1024: 128</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("HnswM")
    public Integer hnswM;

    /**
     * <p>Name of the management account with rds_superuser permissions.</p>
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
     * <p>Management account password.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("ManagerAccountPassword")
    public String managerAccountPassword;

    /**
     * <p>Metadata of vector data, in the form of a MAP JSON string. The key represents the field name, and the value represents the data type.</p>
     * <blockquote>
     * <p>Supported data types</p>
     * <ul>
     * <li>For a list of data types, see: <a href="https://www.alibabacloud.com/help/en/analyticdb/analyticdb-for-postgresql/developer-reference/data-types-1/">Data Types</a>.</li>
     * <li>The money type is not supported at this time.</li>
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

    @NameInMap("MetadataIndices")
    public String metadataIndices;

    /**
     * <p>Method used when building the vector index.</p>
     * <p>Value description:</p>
     * <ul>
     * <li><strong>l2</strong>: Euclidean distance.</li>
     * <li><strong>ip</strong>: Inner product (dot product) distance.</li>
     * <li><strong>cosine</strong> (default): Cosine similarity.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cosine</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>Namespace, default is public.</p>
     * <blockquote>
     * <p>You can create a namespace using the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> API and view the list using the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> API.</p>
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
     * <p>Tokenizer used for full-text search, default is zh_cn.</p>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Parser")
    public String parser;

    /**
     * <p>Whether to enable PQ (Product Quantization) algorithm for index acceleration. It is recommended to enable this when the data volume exceeds 500,000. Value description:</p>
     * <ul>
     * <li>0: Disabled.</li>
     * <li>1: Enabled (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PqEnable")
    public Integer pqEnable;

    /**
     * <p>ID of the region where the instance is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateDocumentCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDocumentCollectionRequest self = new CreateDocumentCollectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateDocumentCollectionRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public CreateDocumentCollectionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDocumentCollectionRequest setEmbeddingModel(String embeddingModel) {
        this.embeddingModel = embeddingModel;
        return this;
    }
    public String getEmbeddingModel() {
        return this.embeddingModel;
    }

    public CreateDocumentCollectionRequest setExternalStorage(Integer externalStorage) {
        this.externalStorage = externalStorage;
        return this;
    }
    public Integer getExternalStorage() {
        return this.externalStorage;
    }

    public CreateDocumentCollectionRequest setFullTextRetrievalFields(String fullTextRetrievalFields) {
        this.fullTextRetrievalFields = fullTextRetrievalFields;
        return this;
    }
    public String getFullTextRetrievalFields() {
        return this.fullTextRetrievalFields;
    }

    public CreateDocumentCollectionRequest setHnswM(Integer hnswM) {
        this.hnswM = hnswM;
        return this;
    }
    public Integer getHnswM() {
        return this.hnswM;
    }

    public CreateDocumentCollectionRequest setManagerAccount(String managerAccount) {
        this.managerAccount = managerAccount;
        return this;
    }
    public String getManagerAccount() {
        return this.managerAccount;
    }

    public CreateDocumentCollectionRequest setManagerAccountPassword(String managerAccountPassword) {
        this.managerAccountPassword = managerAccountPassword;
        return this;
    }
    public String getManagerAccountPassword() {
        return this.managerAccountPassword;
    }

    public CreateDocumentCollectionRequest setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
    }

    public CreateDocumentCollectionRequest setMetadataIndices(String metadataIndices) {
        this.metadataIndices = metadataIndices;
        return this;
    }
    public String getMetadataIndices() {
        return this.metadataIndices;
    }

    public CreateDocumentCollectionRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public CreateDocumentCollectionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateDocumentCollectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDocumentCollectionRequest setParser(String parser) {
        this.parser = parser;
        return this;
    }
    public String getParser() {
        return this.parser;
    }

    public CreateDocumentCollectionRequest setPqEnable(Integer pqEnable) {
        this.pqEnable = pqEnable;
        return this;
    }
    public Integer getPqEnable() {
        return this.pqEnable;
    }

    public CreateDocumentCollectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
