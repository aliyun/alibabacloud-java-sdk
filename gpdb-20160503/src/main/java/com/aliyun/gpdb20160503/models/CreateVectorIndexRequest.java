// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateVectorIndexRequest extends TeaModel {
    /**
     * <p>The vector indexing algorithm.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>hnswflat</code>: (Default) An HNSW index that does not use quantization compression.</p>
     * </li>
     * <li><p><code>novam</code>: A graph-based index that does not use quantization compression. This algorithm is suitable for high-performance scenarios, such as real-time recommendations.</p>
     * </li>
     * <li><p><code>novad</code>: A partitioned index that uses rabitq quantization. This algorithm is suitable for large-scale, cost-effective retrieval scenarios.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hnswflat</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The collection name.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401503.html">ListCollections</a> operation to list all collections.</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to view the details of all AnalyticDB for PostgreSQL instances in a specific region, including the instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The vector dimension.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is required for dense vectors.</p>
     * </li>
     * <li><p>This value must match the length of the <code>Rows.Vector</code> data provided when calling the <a href="https://help.aliyun.com/document_detail/2401493.html">UpsertCollectionData</a> operation.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Dimension")
    public Integer dimension;

    /**
     * <p>Specifies whether to use <code>mmap</code> to build the HNSW index. The default value is 0. Set this to 1 for high-performance data uploads in scenarios where data deletion is not required.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>0</code>: (Default) Builds the index by using segmented page storage. This mode uses the <code>shared_buffer</code> in PostgreSQL for caching and supports delete and update operations.</p>
     * </li>
     * <li><p><code>1</code>: Builds the index by using <code>mmap</code>. This mode does not support delete and update operations.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The <code>ExternalStorage</code> parameter is supported only by AnalyticDB for PostgreSQL V6.0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExternalStorage")
    public Integer externalStorage;

    /**
     * <p>The size of the candidate set for the HNSW algorithm during index construction. The value must be in the range of 4 to 1,000. The default value is 64.</p>
     * <blockquote>
     * <p>This parameter applies only to AnalyticDB for PostgreSQL V7.0 instances, and its value must be greater than or equal to <code>2 * HnswM</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("HnswEfConstruction")
    public Integer hnswEfConstruction;

    /**
     * <p>The maximum number of neighbors for the Hierarchical Navigable Small World (HNSW) algorithm. The system automatically sets this value based on the vector dimension. You do not typically need to configure this parameter manually.</p>
     * <blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>For AnalyticDB for PostgreSQL V6.0 instances: 1 to 1,000.</p>
     * </li>
     * <li><p>For AnalyticDB for PostgreSQL V7.0 instances: 2 to 100. The default value is 16.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <p>We recommend the following values based on the vector dimension:</p>
     * <ul>
     * <li><p>For dimensions of 384 or less: 16</p>
     * </li>
     * <li><p>For dimensions from 385 to 768: 32</p>
     * </li>
     * <li><p>For dimensions from 769 to 1,024: 64</p>
     * </li>
     * <li><p>For dimensions greater than 1,024: 128</p>
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
     * <p>The name of the management account that has <code>rds_superuser</code> permissions.</p>
     * <blockquote>
     * <p>You can create an account on the \<em>\<em>account management\</em>\</em> page in the console or by calling the <a href="https://help.aliyun.com/document_detail/2361789.html">CreateAccount</a> operation.</p>
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
     * <p>The distance metric used to build the vector index. Valid values:</p>
     * <ul>
     * <li><p><code>l2</code>: euclidean distance</p>
     * </li>
     * <li><p><code>ip</code>: dot product (inner product)</p>
     * </li>
     * <li><p><code>cosine</code>: cosine similarity</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Sparse vectors support only <code>ip</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cosine</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>The namespace. The default value is <code>public</code>.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to list all namespaces.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The number of lists (partitions) for the Novad algorithm. The value must be in the range of 2 to 1,073,741,824. The default value is 256.</p>
     * 
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("Nlist")
    public Integer nlist;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to enable Product Quantization (PQ) to accelerate indexing. Recommended for collections with over 500,000 vectors. Valid values:</p>
     * <ul>
     * <li><p><code>0</code>: Disabled.</p>
     * </li>
     * <li><p><code>1</code>: Enabled. (Default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PqEnable")
    public Integer pqEnable;

    /**
     * <p>The number of bits for rabitq compression. The valid range is 1 to 8. The default value is 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RabitqBits")
    public Integer rabitqBits;

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
     * <p>The vector type. Valid values:</p>
     * <ul>
     * <li><p><code>Dense</code>: (Default) a dense vector</p>
     * </li>
     * <li><p><code>Sparse</code>: a sparse vector</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Dense</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateVectorIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVectorIndexRequest self = new CreateVectorIndexRequest();
        return TeaModel.build(map, self);
    }

    public CreateVectorIndexRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateVectorIndexRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public CreateVectorIndexRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateVectorIndexRequest setDimension(Integer dimension) {
        this.dimension = dimension;
        return this;
    }
    public Integer getDimension() {
        return this.dimension;
    }

    public CreateVectorIndexRequest setExternalStorage(Integer externalStorage) {
        this.externalStorage = externalStorage;
        return this;
    }
    public Integer getExternalStorage() {
        return this.externalStorage;
    }

    public CreateVectorIndexRequest setHnswEfConstruction(Integer hnswEfConstruction) {
        this.hnswEfConstruction = hnswEfConstruction;
        return this;
    }
    public Integer getHnswEfConstruction() {
        return this.hnswEfConstruction;
    }

    public CreateVectorIndexRequest setHnswM(Integer hnswM) {
        this.hnswM = hnswM;
        return this;
    }
    public Integer getHnswM() {
        return this.hnswM;
    }

    public CreateVectorIndexRequest setManagerAccount(String managerAccount) {
        this.managerAccount = managerAccount;
        return this;
    }
    public String getManagerAccount() {
        return this.managerAccount;
    }

    public CreateVectorIndexRequest setManagerAccountPassword(String managerAccountPassword) {
        this.managerAccountPassword = managerAccountPassword;
        return this;
    }
    public String getManagerAccountPassword() {
        return this.managerAccountPassword;
    }

    public CreateVectorIndexRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public CreateVectorIndexRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateVectorIndexRequest setNlist(Integer nlist) {
        this.nlist = nlist;
        return this;
    }
    public Integer getNlist() {
        return this.nlist;
    }

    public CreateVectorIndexRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVectorIndexRequest setPqEnable(Integer pqEnable) {
        this.pqEnable = pqEnable;
        return this;
    }
    public Integer getPqEnable() {
        return this.pqEnable;
    }

    public CreateVectorIndexRequest setRabitqBits(Integer rabitqBits) {
        this.rabitqBits = rabitqBits;
        return this;
    }
    public Integer getRabitqBits() {
        return this.rabitqBits;
    }

    public CreateVectorIndexRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVectorIndexRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
