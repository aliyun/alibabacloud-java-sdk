// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryCollectionDataShrinkRequest extends TeaModel {
    /**
     * <p>The name of the collection.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401503.html">ListCollections</a> operation to list available collections.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>The content for full-text search. If this parameter is omitted, only vector search is performed. If this parameter is specified, the system performs a hybrid search of vector search and full-text search.</p>
     * <blockquote>
     * <p>You must specify one of the Content and Vector parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hello_world</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query details for all AnalyticDB for PostgreSQL instances in a region, including their instance IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The filter conditions for data retrieval. It is in the format of a WHERE clause in SQL. This expression returns a boolean value, which can be a simple comparison operator, such as <code>=</code>, <code>&lt;&gt;</code>, <code>!=</code>, <code>&gt;</code>, <code>&lt;</code>, <code>&gt;=</code>, and <code>&lt;=</code>, or a more complex expression combined with logical operators, such as <code>AND</code>, <code>OR</code>, and <code>NOT</code>, and keywords such as <code>IN</code>, <code>BETWEEN</code>, and <code>LIKE</code>.</p>
     * <blockquote>
     * <ul>
     * <li>For more information about the syntax, see <a href="https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/">PostgreSQL WHERE</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pipeline_id=\&quot;1yhpmo0rbn\&quot; AND (spu=\&quot;10025667796135\&quot; AND dept_id=\&quot;226\&quot;)</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The hybrid search algorithm. If this parameter is empty, the system ranks results by directly comparing the scores from the vector search and the full-text search.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>RRF</code>: Reciprocal Rank Fusion. This algorithm has a parameter k to control the fusion effect. For more information, see the description of the <code>HybridSearchArgs</code> parameter.</p>
     * </li>
     * <li><p><code>Weight</code>: weighted sort. This algorithm uses a parameter alpha to control the score ratio of vector search and full-text search, and then sorts the results. For more information about the parameter, see the <code>HybridSearchArgs</code> parameter.</p>
     * </li>
     * <li><p><code>Cascaded</code>: performs a full-text search, and then performs a vector search on the search results.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RRF</p>
     */
    @NameInMap("HybridSearch")
    public String hybridSearch;

    /**
     * <p>The parameters for the hybrid search algorithm. The following algorithms are supported: RRF and Weight.</p>
     * <ul>
     * <li>For RRF, specify the constant k in the scoring algorithm <code>1/(k+rank_i)</code>. The value must be a positive integer greater than 1. The format is as follows:</li>
     * </ul>
     * <pre><code>{ 
     *    &quot;RRF&quot;: {
     *     &quot;k&quot;: 60
     *    }
     * }
     * </code></pre>
     * <ul>
     * <li>For Weight, in the formula <code>alpha * vector_score + (1-alpha) * text_score</code>, the alpha parameter indicates the score ratio of the vector search to the full-text search. The value ranges from 0 to 1. 0 indicates that only the full-text search is used, and 1 indicates that only the vector search is used.</li>
     * </ul>
     * <pre><code>{ 
     *    &quot;Weight&quot;: {
     *     &quot;alpha&quot;: 0.5
     *    }
     * }
     * </code></pre>
     */
    @NameInMap("HybridSearchArgs")
    public String hybridSearchArgsShrink;

    /**
     * <p>This parameter is left empty by default. It specifies the metadata fields to be returned. You can specify multiple fields and separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>title,content</p>
     */
    @NameInMap("IncludeMetadataFields")
    public String includeMetadataFields;

    /**
     * <p>Specifies whether to return sparse vector data. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: returns sparse vector data.</p>
     * </li>
     * <li><p><strong>false</strong>: does not return sparse vector data.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeSparseValues")
    public Boolean includeSparseValues;

    /**
     * <p>Specifies whether to return dense vector data. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: returns dense vector data.</p>
     * </li>
     * <li><p><strong>false</strong>: does not return dense vector data.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeValues")
    public Boolean includeValues;

    /**
     * <p>The similarity algorithm for search. Valid values:</p>
     * <ul>
     * <li><p><strong>l2</strong>: the Euclidean distance.</p>
     * </li>
     * <li><p><strong>ip</strong>: the dot product distance.</p>
     * </li>
     * <li><p><strong>cosine</strong>: the cosine similarity.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, the algorithm specified when the index is created is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cosine</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>The name of the namespace.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to list available namespaces.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The password for the namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("NamespacePassword")
    public String namespacePassword;

    /**
     * <p>This parameter is left empty by default. It specifies the start position of a paged query. This parameter is not supported in hybrid search.</p>
     * <p>The value must be greater than or equal to 0. When this parameter is not empty, Total in the response indicates the total number of hits. This parameter is used with TopK. For example, if you want to retrieve chunks 0 to 44 with a page size of 20, you must send three requests:</p>
     * <ul>
     * <li><p><code>Offset=0, TopK=20</code> returns chunks 0 to 19.</p>
     * </li>
     * <li><p><code>Offset=20, TopK=20</code> returns chunks 20 to 39.</p>
     * </li>
     * <li><p><code>Offset=40, TopK=20</code> returns chunks 40 to 44.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    /**
     * <p>This parameter is left empty by default. It specifies the field based on which to sort the results. This parameter is not supported in hybrid search.</p>
     * <p>The field must be a metadata field or a default field in the table, such as <code>id</code>. The following formats are supported:</p>
     * <ul>
     * <li><p>A single field, such as <code>chunk_id</code>.</p>
     * </li>
     * <li><p>Multiple fields separated by commas (,), such as <code>block_id, chunk_id</code>.</p>
     * </li>
     * <li><p>Descending order, such as <code>block_id DESC, chunk_id DESC</code>.</p>
     * </li>
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
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Uses another relational table to filter vector data, which is similar to the JOIN operation.</p>
     * <blockquote>
     * <p>The data of the relational table can be returned by setting the IncludeMetadataFields parameter. For example, <code>rds_table_name.id</code> indicates that the id field of the relational table is returned.</p>
     * </blockquote>
     */
    @NameInMap("RelationalTableFilter")
    public String relationalTableFilterShrink;

    /**
     * <p>The sparse vector data.</p>
     */
    @NameInMap("SparseVector")
    public String sparseVectorShrink;

    /**
     * <p>Specifies the number of top results to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopK")
    public Long topK;

    /**
     * <p>The vector data. The length of the vector data must be the same as that specified in the <a href="https://help.aliyun.com/document_detail/2401497.html">CreateCollection</a> operation.</p>
     * <blockquote>
     * <ul>
     * <li><p>If <code>SparseVector</code> is empty, only the dense vector search results are returned.</p>
     * </li>
     * <li><p>If both <code>Vector</code> and <code>SparseVector</code> are empty, only the full-text search results are returned.</p>
     * </li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("Vector")
    public String vectorShrink;

    /**
     * <p>The ID of the workspace that consists of multiple database instances. You must specify this parameter or the DBInstanceId parameter. If both this parameter and DBInstanceId are specified, this parameter is used.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-ws-*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryCollectionDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCollectionDataShrinkRequest self = new QueryCollectionDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryCollectionDataShrinkRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public QueryCollectionDataShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryCollectionDataShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public QueryCollectionDataShrinkRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public QueryCollectionDataShrinkRequest setHybridSearch(String hybridSearch) {
        this.hybridSearch = hybridSearch;
        return this;
    }
    public String getHybridSearch() {
        return this.hybridSearch;
    }

    public QueryCollectionDataShrinkRequest setHybridSearchArgsShrink(String hybridSearchArgsShrink) {
        this.hybridSearchArgsShrink = hybridSearchArgsShrink;
        return this;
    }
    public String getHybridSearchArgsShrink() {
        return this.hybridSearchArgsShrink;
    }

    public QueryCollectionDataShrinkRequest setIncludeMetadataFields(String includeMetadataFields) {
        this.includeMetadataFields = includeMetadataFields;
        return this;
    }
    public String getIncludeMetadataFields() {
        return this.includeMetadataFields;
    }

    public QueryCollectionDataShrinkRequest setIncludeSparseValues(Boolean includeSparseValues) {
        this.includeSparseValues = includeSparseValues;
        return this;
    }
    public Boolean getIncludeSparseValues() {
        return this.includeSparseValues;
    }

    public QueryCollectionDataShrinkRequest setIncludeValues(Boolean includeValues) {
        this.includeValues = includeValues;
        return this;
    }
    public Boolean getIncludeValues() {
        return this.includeValues;
    }

    public QueryCollectionDataShrinkRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public QueryCollectionDataShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryCollectionDataShrinkRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public QueryCollectionDataShrinkRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public QueryCollectionDataShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryCollectionDataShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryCollectionDataShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryCollectionDataShrinkRequest setRelationalTableFilterShrink(String relationalTableFilterShrink) {
        this.relationalTableFilterShrink = relationalTableFilterShrink;
        return this;
    }
    public String getRelationalTableFilterShrink() {
        return this.relationalTableFilterShrink;
    }

    public QueryCollectionDataShrinkRequest setSparseVectorShrink(String sparseVectorShrink) {
        this.sparseVectorShrink = sparseVectorShrink;
        return this;
    }
    public String getSparseVectorShrink() {
        return this.sparseVectorShrink;
    }

    public QueryCollectionDataShrinkRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public QueryCollectionDataShrinkRequest setVectorShrink(String vectorShrink) {
        this.vectorShrink = vectorShrink;
        return this;
    }
    public String getVectorShrink() {
        return this.vectorShrink;
    }

    public QueryCollectionDataShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
