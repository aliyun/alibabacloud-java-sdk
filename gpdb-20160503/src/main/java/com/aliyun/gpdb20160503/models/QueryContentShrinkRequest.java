// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryContentShrinkRequest extends TeaModel {
    /**
     * <p>The name of the document collection.</p>
     * <blockquote>
     * <p>A document collection is created by calling the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> operation. Call the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> operation to list your document collections.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>The text to use for retrieval.</p>
     * 
     * <strong>example:</strong>
     * <p>What is AnalyticDB for PostgreSQL?</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to find the IDs of all AnalyticDB for PostgreSQL instances in a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The filename of the source image for a search-by-image query.</p>
     * <blockquote>
     * <p>The image file must have a file extension. The supported extensions are bmp, jpg, jpeg, png, and tiff.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test.jpg</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The publicly accessible URL of the image file for a search-by-image query.</p>
     * <blockquote>
     * <p>The image file must have a file extension. The supported extensions are bmp, jpg, jpeg, png, and tiff.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xx/myImage.jpg">https://xx/myImage.jpg</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>A filter condition for the query, specified as a SQL <code>WHERE</code> clause that returns a boolean value. The clause can use comparison operators (such as <code>=</code>, <code>&lt;&gt;</code>, <code>!=</code>, <code>&gt;</code>, <code>&lt;</code>, <code>&gt;=</code>, and <code>&lt;=</code>), logical operators (<code>AND</code>, <code>OR</code>, and <code>NOT</code>), and keywords such as <code>IN</code>, <code>BETWEEN</code>, and <code>LIKE</code>.</p>
     * <blockquote>
     * <ul>
     * <li>For details about the syntax, see https\://www\.postgresqltutorial.com/postgresql-tutorial/postgresql-where/.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>title = \&quot;test\&quot; AND name like \&quot;test%\&quot;</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>Specifies whether to enable knowledge graph enhancement. The default value is <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GraphEnhance")
    public Boolean graphEnhance;

    /**
     * <p>The parameters for knowledge graph retrieval.</p>
     */
    @NameInMap("GraphSearchArgs")
    public String graphSearchArgsShrink;

    /**
     * <p>Specifies the hybrid search algorithm. If this parameter is not specified, the system directly compares and sorts the scores from dense vector retrieval and full-text search.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>RRF: reciprocal rank fusion. This method uses a <code>k</code> parameter to control the fusion effect. For more information, see the <code>HybridSearchArgs</code> parameter.</p>
     * </li>
     * <li><p>Weight: A weighted sorting method. This method uses parameters to control the score weights of vector retrieval and full-text search before sorting. For more information, see the <code>HybridSearchArgs</code> parameter.</p>
     * </li>
     * <li><p>Cascaded: Performs full-text search first, and then performs vector retrieval on the results.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RRF</p>
     */
    @NameInMap("HybridSearch")
    public String hybridSearch;

    /**
     * <p>Parameters for the multi-channel recall algorithm. Currently, <code>RRF</code> and <code>Weight</code> are supported. <code>HybridPathsSetting</code> can be used to specify the recall paths, including dense vector search (<code>dense</code>), sparse vector search (<code>sparse</code>), and full-text search (<code>fulltext</code>). If this parameter is not specified, the system recalls dense vectors and full-text search results by default.</p>
     * <ul>
     * <li>RRF: Specifies the constant <code>k</code> in the scoring formula <code>1/(k+rank_i)</code>. The value must be an integer greater than 1. Example:</li>
     * </ul>
     * <pre><code>{
     *   &quot;HybridPathsSetting&quot;: {
     *     &quot;paths&quot;: &quot;dense,fulltext&quot;
     *   },
     *   &quot;RRF&quot;: {
     *     &quot;k&quot;: 60
     *   }
     * }
     * </code></pre>
     * <ul>
     * <li><p>Weight:</p>
     * <ul>
     * <li><p>For dual-channel recall (if <code>HybridPathsSetting</code> is not specified, only <code>alpha</code> is configured):</p>
     * <ul>
     * <li>The score is calculated using the formula: <code>alpha * dense_score + (1-alpha) * fulltext_score</code>. The <code>alpha</code> parameter represents the score weight of dense vector retrieval relative to full-text search. The value must be in the range of 0 to 1. A value of 0 indicates that only full-text search is used, and a value of 1 indicates that only dense vector retrieval is used.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <pre><code>{ 
     *    &quot;Weight&quot;: {
     *     &quot;alpha&quot;: 0.5
     *    }
     * }
     * </code></pre>
     * <ul>
     * <li><p>For three-channel recall:</p>
     * <ul>
     * <li>The score is calculated using the formula: <code>normalized_dense * dense_score + normalized_sparse * sparse_score + normalized_fulltext * fulltext_score</code>. The <code>dense</code>, <code>sparse</code>, and <code>fulltext</code> parameters represent the weights for the dense vector, sparse vector, and full-text search results, respectively. Their values must be greater than or equal to 0. The system automatically normalizes the weights to a sum of 1 (for example, <code>normalized_x = x / (dense + sparse + fulltext)</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <pre><code>{
     *   &quot;HybridPathsSetting&quot;: {
     *      &quot;paths&quot;: &quot;dense,sparse,fulltext&quot;
     *    },
     *   &quot;Weight&quot;: {
     *     &quot;dense&quot;: 0.5,
     *     &quot;sparse&quot;: 0.3,
     *     &quot;fulltext&quot;: 0.2
     *   }
     * }
     * </code></pre>
     */
    @NameInMap("HybridSearchArgs")
    public String hybridSearchArgsShrink;

    /**
     * <p>Specifies whether to return the URL of the document. The default value is <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeFileUrl")
    public Boolean includeFileUrl;

    /**
     * <p>The metadata fields to include in the response. If left empty, no metadata is returned. To specify multiple fields, use a comma-separated list.</p>
     * 
     * <strong>example:</strong>
     * <p>title,page</p>
     */
    @NameInMap("IncludeMetadataFields")
    public String includeMetadataFields;

    /**
     * <p>Specifies whether to include the vector in the results. The default value is <code>false</code>.</p>
     * <blockquote>
     * <ul>
     * <li><p><strong>false</strong>: The vector is not returned.</p>
     * </li>
     * <li><p><strong>true</strong>: The vector is returned.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeVector")
    public Boolean includeVector;

    /**
     * <p>The similarity algorithm used for retrieval. If this parameter is not specified, the algorithm that was specified when the document collection was created is used. We recommend that you do not set this parameter unless you have specific requirements.</p>
     * <blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>l2</strong>: Euclidean distance.</p>
     * </li>
     * <li><p><strong>ip</strong>: dot product (inner product) distance.</p>
     * </li>
     * <li><p><strong>cosine</strong>: cosine similarity.</p>
     * </li>
     * </ul>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation to create a namespace and the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to list existing namespaces.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The password for the namespace.</p>
     * <blockquote>
     * <p>This password is set when you call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("NamespacePassword")
    public String namespacePassword;

    /**
     * <p>The offset for paginated queries.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    /**
     * <p>The field to sort the results by. By default, this parameter is empty.</p>
     * <p>The field must be a metadata field or a default field from the table, such as <code>id</code>. Supported formats include single fields (e.g., <code>chunk_id</code>), multiple comma-separated fields (e.g., <code>block_id, chunk_id</code>), and fields with a sort direction (e.g., <code>block_id DESC, chunk_id DESC</code>).</p>
     * 
     * <strong>example:</strong>
     * <p>created_at</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The recall window. If this parameter is specified, additional context is returned with the retrieval results. The value must be a two-element array, <code>[A, B]</code>, where <code>-10 &lt;= A &lt;= 0</code> and <code>0 &lt;= B &lt;= 10</code>.</p>
     * <blockquote>
     * <ul>
     * <li><p>Use this parameter when documents are finely chunked and retrieval might otherwise lose contextual information.</p>
     * </li>
     * <li><p>Reranking is prioritized over windowing. The system first applies reranking and then processes the window.</p>
     * </li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("RecallWindow")
    public String recallWindowShrink;

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
     * <p>The factor for reranking vector retrieval results. The value must be greater than 1 and less than or equal to 5.</p>
     * <blockquote>
     * <ul>
     * <li><p>Reranking may be slower if document chunks are sparse.</p>
     * </li>
     * <li><p>For best performance, the number of items to be reranked (<code>TopK</code> \* <code>RerankFactor</code>, rounded up) should not exceed 50.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RerankFactor")
    public Double rerankFactor;

    /**
     * <p>The parameters for the reranking model.</p>
     */
    @NameInMap("RerankModel")
    public String rerankModelShrink;

    /**
     * <p>The number of top results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    /**
     * <p>The validity period of the returned image URL.</p>
     * <blockquote>
     * <ul>
     * <li><p>The value can be specified in seconds (s) or days (d). For example, <code>300s</code> indicates that the link is valid for 300 seconds, and <code>60d</code> indicates that the link is valid for 60 days.</p>
     * </li>
     * <li><p>The value must be in the range of <code>60s</code> to <code>365d</code>.</p>
     * </li>
     * <li><p>Default value: <code>7200s</code> (2 hours).</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7200s</p>
     */
    @NameInMap("UrlExpiration")
    public String urlExpiration;

    /**
     * <p>(Deprecated) Specifies whether to use full-text search (dual-channel recall). The default value is <code>false</code>, which means only vector retrieval is used.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseFullTextRetrieval")
    public Boolean useFullTextRetrieval;

    public static QueryContentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContentShrinkRequest self = new QueryContentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryContentShrinkRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public QueryContentShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryContentShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public QueryContentShrinkRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public QueryContentShrinkRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public QueryContentShrinkRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public QueryContentShrinkRequest setGraphEnhance(Boolean graphEnhance) {
        this.graphEnhance = graphEnhance;
        return this;
    }
    public Boolean getGraphEnhance() {
        return this.graphEnhance;
    }

    public QueryContentShrinkRequest setGraphSearchArgsShrink(String graphSearchArgsShrink) {
        this.graphSearchArgsShrink = graphSearchArgsShrink;
        return this;
    }
    public String getGraphSearchArgsShrink() {
        return this.graphSearchArgsShrink;
    }

    public QueryContentShrinkRequest setHybridSearch(String hybridSearch) {
        this.hybridSearch = hybridSearch;
        return this;
    }
    public String getHybridSearch() {
        return this.hybridSearch;
    }

    public QueryContentShrinkRequest setHybridSearchArgsShrink(String hybridSearchArgsShrink) {
        this.hybridSearchArgsShrink = hybridSearchArgsShrink;
        return this;
    }
    public String getHybridSearchArgsShrink() {
        return this.hybridSearchArgsShrink;
    }

    public QueryContentShrinkRequest setIncludeFileUrl(Boolean includeFileUrl) {
        this.includeFileUrl = includeFileUrl;
        return this;
    }
    public Boolean getIncludeFileUrl() {
        return this.includeFileUrl;
    }

    public QueryContentShrinkRequest setIncludeMetadataFields(String includeMetadataFields) {
        this.includeMetadataFields = includeMetadataFields;
        return this;
    }
    public String getIncludeMetadataFields() {
        return this.includeMetadataFields;
    }

    public QueryContentShrinkRequest setIncludeVector(Boolean includeVector) {
        this.includeVector = includeVector;
        return this;
    }
    public Boolean getIncludeVector() {
        return this.includeVector;
    }

    public QueryContentShrinkRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public QueryContentShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryContentShrinkRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public QueryContentShrinkRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public QueryContentShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryContentShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryContentShrinkRequest setRecallWindowShrink(String recallWindowShrink) {
        this.recallWindowShrink = recallWindowShrink;
        return this;
    }
    public String getRecallWindowShrink() {
        return this.recallWindowShrink;
    }

    public QueryContentShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryContentShrinkRequest setRerankFactor(Double rerankFactor) {
        this.rerankFactor = rerankFactor;
        return this;
    }
    public Double getRerankFactor() {
        return this.rerankFactor;
    }

    public QueryContentShrinkRequest setRerankModelShrink(String rerankModelShrink) {
        this.rerankModelShrink = rerankModelShrink;
        return this;
    }
    public String getRerankModelShrink() {
        return this.rerankModelShrink;
    }

    public QueryContentShrinkRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public QueryContentShrinkRequest setUrlExpiration(String urlExpiration) {
        this.urlExpiration = urlExpiration;
        return this;
    }
    public String getUrlExpiration() {
        return this.urlExpiration;
    }

    public QueryContentShrinkRequest setUseFullTextRetrieval(Boolean useFullTextRetrieval) {
        this.useFullTextRetrieval = useFullTextRetrieval;
        return this;
    }
    public Boolean getUseFullTextRetrieval() {
        return this.useFullTextRetrieval;
    }

}
