// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryCollectionDataRequest extends TeaModel {
    /**
     * <p>Collection name.</p>
     * <blockquote>
     * <p>You can use the <a href="https://help.aliyun.com/document_detail/2401503.html">ListCollections</a> API to view the list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>Content for full-text search. When this value is empty, only vector search is used; when it is not empty, both vector and full-text search are used.</p>
     * <blockquote>
     * <p>The Vector parameter cannot be empty at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hello_world</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> API to view details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Filter conditions for the data to be queried, in SQL WHERE format. It is an expression that returns a boolean value (true or false). Conditions can be simple comparison operators such as equal (=), not equal (&lt;&gt; or !=), greater than (&gt;), less than (&lt;), greater than or equal to (&gt;=), less than or equal to (&lt;=), or more complex expressions combined with logical operators (AND, OR, NOT), as well as conditions using keywords like IN, BETWEEN, and LIKE.</p>
     * <blockquote>
     * <ul>
     * <li>For detailed syntax, refer to: <a href="https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/">https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/</a></li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>response &gt; 200</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>Dual-path recall algorithm, default is empty (i.e., directly compare and sort the scores of vectors and full-text).</p>
     * <p>Available values:</p>
     * <ul>
     * <li>RRF: Reciprocal rank fusion, with a parameter k controlling the fusion effect. See HybridSearchArgs configuration for details;</li>
     * <li>Weight: Weighted sorting, using a parameter alpha to control the score ratio of vectors and full-text, then sorting. See HybridSearchArgs configuration for details;</li>
     * <li>Cascaded: Perform full-text search first, then vector search based on the full-text results;</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RRF</p>
     */
    @NameInMap("HybridSearch")
    public String hybridSearch;

    /**
     * <p>The parameters of the two-way retrieval algorithm. The following parameters are supported:</p>
     * <ul>
     * <li>When HybridSearch is set to RRF, the scores are calculated by using the <code>1/(k+rank_i)</code> formula. The constant k is a positive integer that is greater than 1.</li>
     * </ul>
     * <!---->
     * 
     * <pre><code>{ 
     *    &quot;RRF&quot;: {
     *     &quot;k&quot;: 60
     *    }
     * }
     * </code></pre>
     * <ul>
     * <li>When HybridSearch is set to Weight, the scores are calculated by using the <code>alpha * vector_score + (1-alpha) * text_score</code> formula. The alpha parameter specifies the proportion of the vector search score and the full-text search score and ranges from 0 to 1. A value of 0 specifies full-text search and a value of 1 specifies vector search.</li>
     * </ul>
     * <!---->
     * 
     * <pre><code>{ 
     *    &quot;Weight&quot;: {
     *     &quot;alpha&quot;: 0.5
     *    }
     * }
     * </code></pre>
     */
    @NameInMap("HybridSearchArgs")
    public java.util.Map<String, java.util.Map<String, ?>> hybridSearchArgs;

    /**
     * <p>Defaults to empty, indicating the metadata fields to return. Multiple fields should be separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>title,content</p>
     */
    @NameInMap("IncludeMetadataFields")
    public String includeMetadataFields;

    /**
     * <p>Whether to return vector data. Value descriptions:</p>
     * <ul>
     * <li><strong>true</strong>: Return vector data.</li>
     * <li><strong>false</strong>: Do not return vector data, used for full-text search scenarios.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeValues")
    public Boolean includeValues;

    /**
     * <p>Similarity algorithm used during retrieval. Value descriptions:</p>
     * <ul>
     * <li><strong>l2</strong>: Euclidean distance.</li>
     * <li><strong>ip</strong>: Inner product (dot product) distance.</li>
     * <li><strong>cosine</strong>: Cosine similarity.</li>
     * </ul>
     * <blockquote>
     * <p>If this value is empty, the algorithm specified during index creation is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cosine</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>Namespace.</p>
     * <blockquote>
     * <p>You can use the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> API to view the list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Password for the namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("NamespacePassword")
    public String namespacePassword;

    /**
     * <p>Defaults to empty, indicating the starting point for pagination queries. Does not support hybrid search scenarios.</p>
     * <p>The value must be &gt;= 0. When this value is not empty, it will return <code>Total</code>, which indicates the total number of hits. This parameter works with <code>TopK</code>. For example, to paginate 20 and retrieve chunks with <code>chunk_id</code> from 0 to 44, you need to make three requests:</p>
     * <ul>
     * <li><code>Offset=0, TopK=20</code> returns <code>chunk_id</code> 0~19</li>
     * <li><code>Offset=20, TopK=20</code> returns <code>chunk_id</code> 20~39</li>
     * <li><code>Offset=30, TopK=20</code> returns <code>chunk_id</code> 40~44</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    /**
     * <p>Defaults to empty, indicating the field for sorting. Does not support hybrid search scenarios.</p>
     * <p>The field must belong to metadata or be a default field in the table, such as <code>id</code>. The supported formats are:</p>
     * <ul>
     * <li>A single field, e.g., <code>chunk_id</code>;</li>
     * <li>Multiple fields, separated by commas, e.g., <code>block_id, chunk_id</code>;</li>
     * <li>Supports reverse order, e.g., <code>block_id DESC, chunk_id DESC</code>;</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>chunk_id</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Region ID where the instance is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Uses another relational table to filter vector data (similar to a Join function).</p>
     * <blockquote>
     * <p>Data from the relational table can be returned by setting the <code>IncludeMetadataFields</code> parameter. For example, <code>rds_table_name.id</code> indicates returning the <code>id</code> field from the relational table.</p>
     * </blockquote>
     */
    @NameInMap("RelationalTableFilter")
    public QueryCollectionDataRequestRelationalTableFilter relationalTableFilter;

    /**
     * <p>Set the number of top results to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopK")
    public Long topK;

    /**
     * <p>Vector data, with the same dimension as specified in the <a href="https://help.aliyun.com/document_detail/2401497.html">CreateCollection</a> API.</p>
     * <blockquote>
     * <p>When the vector is empty, only full-text search results are returned.</p>
     * </blockquote>
     */
    @NameInMap("Vector")
    public java.util.List<Double> vector;

    /**
     * <p>The ID of the Workspace composed of multiple database instances. This parameter and <code>DBInstanceId</code> cannot both be empty. If both are specified, this parameter takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-ws-*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryCollectionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCollectionDataRequest self = new QueryCollectionDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryCollectionDataRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public QueryCollectionDataRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryCollectionDataRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public QueryCollectionDataRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public QueryCollectionDataRequest setHybridSearch(String hybridSearch) {
        this.hybridSearch = hybridSearch;
        return this;
    }
    public String getHybridSearch() {
        return this.hybridSearch;
    }

    public QueryCollectionDataRequest setHybridSearchArgs(java.util.Map<String, java.util.Map<String, ?>> hybridSearchArgs) {
        this.hybridSearchArgs = hybridSearchArgs;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getHybridSearchArgs() {
        return this.hybridSearchArgs;
    }

    public QueryCollectionDataRequest setIncludeMetadataFields(String includeMetadataFields) {
        this.includeMetadataFields = includeMetadataFields;
        return this;
    }
    public String getIncludeMetadataFields() {
        return this.includeMetadataFields;
    }

    public QueryCollectionDataRequest setIncludeValues(Boolean includeValues) {
        this.includeValues = includeValues;
        return this;
    }
    public Boolean getIncludeValues() {
        return this.includeValues;
    }

    public QueryCollectionDataRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public QueryCollectionDataRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryCollectionDataRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public QueryCollectionDataRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public QueryCollectionDataRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryCollectionDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryCollectionDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryCollectionDataRequest setRelationalTableFilter(QueryCollectionDataRequestRelationalTableFilter relationalTableFilter) {
        this.relationalTableFilter = relationalTableFilter;
        return this;
    }
    public QueryCollectionDataRequestRelationalTableFilter getRelationalTableFilter() {
        return this.relationalTableFilter;
    }

    public QueryCollectionDataRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public QueryCollectionDataRequest setVector(java.util.List<Double> vector) {
        this.vector = vector;
        return this;
    }
    public java.util.List<Double> getVector() {
        return this.vector;
    }

    public QueryCollectionDataRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class QueryCollectionDataRequestRelationalTableFilter extends TeaModel {
        /**
         * <p>The Metadata field of the vector collection, used to associate with the fields in the vector table.</p>
         * 
         * <strong>example:</strong>
         * <p>doc_id</p>
         */
        @NameInMap("CollectionMetadataField")
        public String collectionMetadataField;

        /**
         * <p>The filtering condition for the relational table.</p>
         * 
         * <strong>example:</strong>
         * <p>tags @&gt; ARRAY[\&quot;art\&quot;]</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The field in the relational table, used to associate with the Metadata field of the vector collection.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("TableField")
        public String tableField;

        /**
         * <p>The name of the relational table.</p>
         * 
         * <strong>example:</strong>
         * <p>my_rds_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static QueryCollectionDataRequestRelationalTableFilter build(java.util.Map<String, ?> map) throws Exception {
            QueryCollectionDataRequestRelationalTableFilter self = new QueryCollectionDataRequestRelationalTableFilter();
            return TeaModel.build(map, self);
        }

        public QueryCollectionDataRequestRelationalTableFilter setCollectionMetadataField(String collectionMetadataField) {
            this.collectionMetadataField = collectionMetadataField;
            return this;
        }
        public String getCollectionMetadataField() {
            return this.collectionMetadataField;
        }

        public QueryCollectionDataRequestRelationalTableFilter setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public QueryCollectionDataRequestRelationalTableFilter setTableField(String tableField) {
            this.tableField = tableField;
            return this;
        }
        public String getTableField() {
            return this.tableField;
        }

        public QueryCollectionDataRequestRelationalTableFilter setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
