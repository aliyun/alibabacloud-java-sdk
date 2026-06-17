// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateCollectionRequest extends TeaModel {
    /**
     * <p>The vector index algorithm.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>hnswflat</code>: (Default) An HNSW index without quantization compression.</p>
     * </li>
     * <li><p><code>novam</code>: A graph index without quantization compression. This algorithm is suitable for high-performance scenarios, such as real-time recommendations.</p>
     * </li>
     * <li><p><code>novad</code>: A partitioned index with <code>rabitq</code> quantization. This algorithm is suitable for large-scale, low-cost retrieval scenarios.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hnswflat</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The name of the collection to create.</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a specific region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-bp152460513z****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The vector dimension.</p>
     * <blockquote>
     * <p>If you specify this parameter, a vector index is created. In subsequent calls to the <a href="https://help.aliyun.com/document_detail/2401493.html">UpsertCollectionData</a> operation, the length of <code>Rows.Vector</code> must match this dimension. If you do not specify this parameter, you must call the <a href="https://help.aliyun.com/document_detail/2401499.html">CreateVectorIndex</a> operation to create an index later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Dimension")
    public Long dimension;

    /**
     * <p>Specifies whether to use <code>mmap</code> to build the HNSW index. The default value is 0. We recommend setting this to 1 if your data does not require deletion and you need high-performance data ingestion.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>0</code>: (Default) Builds the index by using segmented page storage. This mode can use the <code>shared_buffer</code> in PostgreSQL for caching and supports <code>DELETE</code> and <code>UPDATE</code> operations.</p>
     * </li>
     * <li><p><code>1</code>: Builds the index by using <code>mmap</code>. This mode does not support <code>DELETE</code> or <code>UPDATE</code> operations.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The <code>ExternalStorage</code> parameter is available only for AnalyticDB for PostgreSQL v6.0 instances and is not supported in v7.0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExternalStorage")
    public Integer externalStorage;

    /**
     * <p>The fields to use for full-text search. Use commas (<code>,</code>) to separate multiple field names. These fields must be keys defined in the <code>Metadata</code> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>title,content</p>
     */
    @NameInMap("FullTextRetrievalFields")
    public String fullTextRetrievalFields;

    /**
     * <p>The size of the candidate set for HNSW index construction. The value must be greater than or equal to <code>2 * HnswM</code>.</p>
     * <blockquote>
     * <p>Value range:</p>
     * <ul>
     * <li><p>For AnalyticDB for PostgreSQL V6.0 instances: 40 to 4000.</p>
     * </li>
     * <li><p>For AnalyticDB for PostgreSQL V7.0 instances: 4 to 1000. The default value is 64.</p>
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
     * <p>The maximum number of neighbors for the HNSW algorithm. You do not typically need to set this parameter, as the system automatically determines a value based on the vector dimension.</p>
     * <blockquote>
     * <p>Value range:</p>
     * <ul>
     * <li><p>For AnalyticDB for PostgreSQL V6.0 instances: 1 to 1000.</p>
     * </li>
     * <li><p>For AnalyticDB for PostgreSQL V7.0 instances: 2 to 100. The default value is 16.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <p>We recommend that you set this parameter based on the vector dimension:</p>
     * <ul>
     * <li><p>16 for dimensions less than or equal to 384.</p>
     * </li>
     * <li><p>32 for dimensions greater than 384 and less than or equal to 768.</p>
     * </li>
     * <li><p>64 for dimensions greater than 768 and less than or equal to 1024.</p>
     * </li>
     * <li><p>128 for dimensions greater than 1024.</p>
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
     * <p>The name of the management account that has the <code>rds_superuser</code> privilege.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2361789.html">CreateAccount</a> operation to create an account.</p>
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
     * <p>A JSON string that defines the metadata schema as a map. The keys are field names, and the values are their corresponding data types.</p>
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
     * <p>The field names <code>id</code>, <code>vector</code>, <code>to_tsvector</code>, and <code>source</code> are reserved and cannot be used.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;title&quot;:&quot;text&quot;,&quot;content&quot;:&quot;text&quot;,&quot;response&quot;:&quot;int&quot;}</p>
     */
    @NameInMap("Metadata")
    public String metadata;

    /**
     * <p>The scalar index fields. Separate multiple fields with commas (<code>,</code>). The fields must be keys that are defined in <code>Metadata</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("MetadataIndices")
    public String metadataIndices;

    /**
     * <p>The distance metric used to build the vector index. Valid values:</p>
     * <ul>
     * <li><p><code>l2</code>: Euclidean distance.</p>
     * </li>
     * <li><p><code>ip</code>: dot product.</p>
     * </li>
     * <li><p><code>cosine</code>: cosine similarity.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cosine</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>The namespace.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation to create a namespace or the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to list existing namespaces.</p>
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
     * <p>The parser for full-text search. The default is <code>zh_cn</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Parser")
    public String parser;

    /**
     * <p>Specifies whether to enable Product Quantization (PQ) for index acceleration. This is recommended for datasets with more than 500,000 entries. Valid values:</p>
     * <ul>
     * <li><p><code>0</code>: Disabled.</p>
     * </li>
     * <li><p><code>1</code>: (Default) Enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PqEnable")
    public Integer pqEnable;

    /**
     * <p>The ID of the region where the instance is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The configuration for the sparse vector index. If specified, a sparse vector index is created.</p>
     */
    @NameInMap("SparseVectorIndexConfig")
    public CreateCollectionRequestSparseVectorIndexConfig sparseVectorIndexConfig;

    /**
     * <p>Specifies whether to enable support for sparse vectors. The default value is <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SupportSparse")
    public Boolean supportSparse;

    /**
     * <p>The configuration for the dense vector index.</p>
     */
    @NameInMap("VectorIndexConfig")
    public CreateCollectionRequestVectorIndexConfig vectorIndexConfig;

    /**
     * <p>The ID of the workspace, which contains multiple database instances. You must specify either <code>WorkspaceId</code> or <code>DBInstanceId</code>. If both are specified, <code>WorkspaceId</code> takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-ws-*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCollectionRequest self = new CreateCollectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateCollectionRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateCollectionRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public CreateCollectionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateCollectionRequest setDimension(Long dimension) {
        this.dimension = dimension;
        return this;
    }
    public Long getDimension() {
        return this.dimension;
    }

    public CreateCollectionRequest setExternalStorage(Integer externalStorage) {
        this.externalStorage = externalStorage;
        return this;
    }
    public Integer getExternalStorage() {
        return this.externalStorage;
    }

    public CreateCollectionRequest setFullTextRetrievalFields(String fullTextRetrievalFields) {
        this.fullTextRetrievalFields = fullTextRetrievalFields;
        return this;
    }
    public String getFullTextRetrievalFields() {
        return this.fullTextRetrievalFields;
    }

    public CreateCollectionRequest setHnswEfConstruction(String hnswEfConstruction) {
        this.hnswEfConstruction = hnswEfConstruction;
        return this;
    }
    public String getHnswEfConstruction() {
        return this.hnswEfConstruction;
    }

    public CreateCollectionRequest setHnswM(Integer hnswM) {
        this.hnswM = hnswM;
        return this;
    }
    public Integer getHnswM() {
        return this.hnswM;
    }

    public CreateCollectionRequest setManagerAccount(String managerAccount) {
        this.managerAccount = managerAccount;
        return this;
    }
    public String getManagerAccount() {
        return this.managerAccount;
    }

    public CreateCollectionRequest setManagerAccountPassword(String managerAccountPassword) {
        this.managerAccountPassword = managerAccountPassword;
        return this;
    }
    public String getManagerAccountPassword() {
        return this.managerAccountPassword;
    }

    public CreateCollectionRequest setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
    }

    public CreateCollectionRequest setMetadataIndices(String metadataIndices) {
        this.metadataIndices = metadataIndices;
        return this;
    }
    public String getMetadataIndices() {
        return this.metadataIndices;
    }

    public CreateCollectionRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public CreateCollectionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateCollectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCollectionRequest setParser(String parser) {
        this.parser = parser;
        return this;
    }
    public String getParser() {
        return this.parser;
    }

    public CreateCollectionRequest setPqEnable(Integer pqEnable) {
        this.pqEnable = pqEnable;
        return this;
    }
    public Integer getPqEnable() {
        return this.pqEnable;
    }

    public CreateCollectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCollectionRequest setSparseVectorIndexConfig(CreateCollectionRequestSparseVectorIndexConfig sparseVectorIndexConfig) {
        this.sparseVectorIndexConfig = sparseVectorIndexConfig;
        return this;
    }
    public CreateCollectionRequestSparseVectorIndexConfig getSparseVectorIndexConfig() {
        return this.sparseVectorIndexConfig;
    }

    public CreateCollectionRequest setSupportSparse(Boolean supportSparse) {
        this.supportSparse = supportSparse;
        return this;
    }
    public Boolean getSupportSparse() {
        return this.supportSparse;
    }

    public CreateCollectionRequest setVectorIndexConfig(CreateCollectionRequestVectorIndexConfig vectorIndexConfig) {
        this.vectorIndexConfig = vectorIndexConfig;
        return this;
    }
    public CreateCollectionRequestVectorIndexConfig getVectorIndexConfig() {
        return this.vectorIndexConfig;
    }

    public CreateCollectionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateCollectionRequestSparseVectorIndexConfig extends TeaModel {
        /**
         * <p>The vector index algorithm.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>hnswflat</code>: (Default) An HNSW index without quantization compression.</p>
         * </li>
         * <li><p><code>novam</code>: A graph index without quantization compression. This algorithm is suitable for high-performance scenarios, such as real-time recommendations.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hnswflat</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The size of the candidate set for HNSW index construction. The value must be an integer from 4 to 1,000. The default is 64.</p>
         * <blockquote>
         * <p>This parameter is required only for AnalyticDB for PostgreSQL V7.0 instances, and its value must be greater than or equal to <code>2 * HnswM</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("HnswEfConstruction")
        public Integer hnswEfConstruction;

        /**
         * <p>The maximum number of neighbors for the HNSW algorithm. You do not typically need to set this parameter, as the system automatically determines a value based on the vector dimension.</p>
         * <blockquote>
         * <p>Value range:</p>
         * <ul>
         * <li><p>For AnalyticDB for PostgreSQL V6.0 instances: 1 to 1000.</p>
         * </li>
         * <li><p>For AnalyticDB for PostgreSQL V7.0 instances: 2 to 100. The default value is 16.</p>
         * </li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>We recommend that you set this parameter based on the vector dimension:</p>
         * <ul>
         * <li><p>16 for dimensions less than or equal to 384.</p>
         * </li>
         * <li><p>32 for dimensions greater than 384 and less than or equal to 768.</p>
         * </li>
         * <li><p>64 for dimensions greater than 768 and less than or equal to 1024.</p>
         * </li>
         * <li><p>128 for dimensions greater than 1024.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("HnswM")
        public Integer hnswM;

        public static CreateCollectionRequestSparseVectorIndexConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateCollectionRequestSparseVectorIndexConfig self = new CreateCollectionRequestSparseVectorIndexConfig();
            return TeaModel.build(map, self);
        }

        public CreateCollectionRequestSparseVectorIndexConfig setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public CreateCollectionRequestSparseVectorIndexConfig setHnswEfConstruction(Integer hnswEfConstruction) {
            this.hnswEfConstruction = hnswEfConstruction;
            return this;
        }
        public Integer getHnswEfConstruction() {
            return this.hnswEfConstruction;
        }

        public CreateCollectionRequestSparseVectorIndexConfig setHnswM(Integer hnswM) {
            this.hnswM = hnswM;
            return this;
        }
        public Integer getHnswM() {
            return this.hnswM;
        }

    }

    public static class CreateCollectionRequestVectorIndexConfig extends TeaModel {
        /**
         * <p>The number of lists (partitions) for a <code>novad</code> index. The value must be an integer from 2 to 1,073,741,824. The default is 256.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("Nlist")
        public Integer nlist;

        /**
         * <p>The number of bits for <code>rabitq</code> compression. The value must be an integer from 1 to 8. The default is 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RabitqBits")
        public Integer rabitqBits;

        public static CreateCollectionRequestVectorIndexConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateCollectionRequestVectorIndexConfig self = new CreateCollectionRequestVectorIndexConfig();
            return TeaModel.build(map, self);
        }

        public CreateCollectionRequestVectorIndexConfig setNlist(Integer nlist) {
            this.nlist = nlist;
            return this;
        }
        public Integer getNlist() {
            return this.nlist;
        }

        public CreateCollectionRequestVectorIndexConfig setRabitqBits(Integer rabitqBits) {
            this.rabitqBits = rabitqBits;
            return this;
        }
        public Integer getRabitqBits() {
            return this.rabitqBits;
        }

    }

}
