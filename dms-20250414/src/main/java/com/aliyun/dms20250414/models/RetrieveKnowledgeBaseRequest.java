// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class RetrieveKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>A filter for the data, specified as a SQL <code>WHERE</code> clause.</p>
     * 
     * <strong>example:</strong>
     * <p>title = \&quot;test\&quot; AND name like \&quot;test%\&quot;</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The hybrid search algorithm. If this parameter is not set, the system directly compares and ranks the scores from the dense vector and full-text searches.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>RRF</code>: Reciprocal Rank Fusion. This method uses a parameter <code>k</code> to control the fusion effect. For more information, see the <code>HybridSearchArgs</code> configuration.</p>
     * </li>
     * <li><p><code>Weight</code>: Weighted ranking. This method applies weights to the vector and full-text search scores before ranking. For more information, see the <code>HybridSearchArgs</code> configuration.</p>
     * </li>
     * <li><p><code>Cascaded</code>: Performs a full-text search first, followed by a vector search on the results of the full-text search.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RRF</p>
     */
    @NameInMap("HybridSearch")
    public String hybridSearch;

    /**
     * <p>Parameters for the specified <code>HybridSearch</code> algorithm. Both <code>RRF</code> and <code>Weight</code> are supported. You can use the <code>HybridPathsSetting</code> object to specify the retrieval paths: dense vector (<code>dense</code>), sparse vector (<code>sparse</code>), and full-text search (<code>fulltext</code>). If this object is not provided, the default retrieval paths are <code>dense</code> and <code>fulltext</code>.</p>
     * <ul>
     * <li><code>RRF</code>: Specifies the constant <code>k</code> in the scoring formula <code>1/(k+rank_i)</code>. The value of <code>k</code> must be an integer greater than 1. The format is as follows:</li>
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
     * <li><p><code>Weight</code>:</p>
     * <ul>
     * <li><p>Two-path recall (do not specify <code>HybridPathsSetting</code>; specify only <code>alpha</code>):</p>
     * <ul>
     * <li>The score is calculated using the formula: <code>alpha * dense_score + (1-alpha) * fulltext_score</code>. The <code>alpha</code> parameter balances the scores from the dense vector and full-text searches. Its value must be in the range [0, 1], where 0 relies solely on full-text search, and 1 relies solely on dense vector search.</li>
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
     * <li><p>Three-path recall:</p>
     * <ul>
     * <li>The score is calculated using the formula: <code>normalized_dense * dense_score + normalized_sparse * sparse_score + normalized_fulltext * fulltext_score</code>. The <code>dense</code>, <code>sparse</code>, and <code>fulltext</code> parameters are the weights for the dense vector, sparse vector, and full-text searches, respectively. Their values must be 0 or greater. The system automatically normalizes the weights to sum to 1 (for example, <code>normalized_x = x / (dense + sparse + fulltext)</code>).</li>
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
     * 
     * <strong>example:</strong>
     * <p>{ \&quot;Weight\&quot;: { \&quot;alpha\&quot;: 0.5 } }</p>
     */
    @NameInMap("HybridSearchArgs")
    public String hybridSearchArgs;

    /**
     * <p>The metadata fields to return, separated by commas. By default, no metadata fields are returned.</p>
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
     * <p>false</p>
     */
    @NameInMap("IncludeVector")
    public Boolean includeVector;

    /**
     * <p>The ID of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-***</p>
     */
    @NameInMap("KbUuid")
    public String kbUuid;

    /**
     * <p>The distance metric for retrieval. If unspecified, this defaults to the metric configured for the knowledge base. Only set this parameter if you have specific requirements.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>l2</code>: Euclidean distance.</p>
     * </li>
     * <li><p><code>ip</code>: Inner product.</p>
     * </li>
     * <li><p><code>cosine</code>: Cosine similarity.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cosine</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>The offset for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    /**
     * <p>The field to use for sorting the results. By default, this parameter is empty.</p>
     * <p>The field must be a metadata field or a default table field, such as <code>id</code>. Supported formats include:</p>
     * <p>You can specify a single field (for example, <code>chunk_id</code>), multiple comma-separated fields (for example, <code>block_id, chunk_id</code>), or fields with descending order (for example, <code>block_id DESC, chunk_id DESC</code>).</p>
     * 
     * <strong>example:</strong>
     * <p>created_at</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The query text.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>What is GraphRAG?</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The recall window. If specified, this parameter expands the context of the retrieved results. The format is a two-element array <code>[A, B]</code>, where <code>-10 &lt;= A &lt;= 0</code> and <code>0 &lt;= B &lt;= 10</code>.</p>
     * <blockquote>
     * <ul>
     * <li><p>Recommended when document chunks are highly fragmented, which might cause context loss during retrieval.</p>
     * </li>
     * <li><p>Reranking occurs before windowing is applied.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[-5,5]</p>
     */
    @NameInMap("RecallWindow")
    public String recallWindow;

    /**
     * <p>The factor used to rerank vector search results. The value must be in the range (1, 5].</p>
     * <blockquote>
     * <ul>
     * <li><p>Reranking may be slow if document chunks are sparse.</p>
     * </li>
     * <li><p>The number of items to rerank, calculated as <code>ceil(TopK * RerankFactor)</code>, should not exceed 50.</p>
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
     * <p>The number of top-ranked results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    public static RetrieveKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrieveKnowledgeBaseRequest self = new RetrieveKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public RetrieveKnowledgeBaseRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public RetrieveKnowledgeBaseRequest setHybridSearch(String hybridSearch) {
        this.hybridSearch = hybridSearch;
        return this;
    }
    public String getHybridSearch() {
        return this.hybridSearch;
    }

    public RetrieveKnowledgeBaseRequest setHybridSearchArgs(String hybridSearchArgs) {
        this.hybridSearchArgs = hybridSearchArgs;
        return this;
    }
    public String getHybridSearchArgs() {
        return this.hybridSearchArgs;
    }

    public RetrieveKnowledgeBaseRequest setIncludeMetadataFields(String includeMetadataFields) {
        this.includeMetadataFields = includeMetadataFields;
        return this;
    }
    public String getIncludeMetadataFields() {
        return this.includeMetadataFields;
    }

    public RetrieveKnowledgeBaseRequest setIncludeVector(Boolean includeVector) {
        this.includeVector = includeVector;
        return this;
    }
    public Boolean getIncludeVector() {
        return this.includeVector;
    }

    public RetrieveKnowledgeBaseRequest setKbUuid(String kbUuid) {
        this.kbUuid = kbUuid;
        return this;
    }
    public String getKbUuid() {
        return this.kbUuid;
    }

    public RetrieveKnowledgeBaseRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public RetrieveKnowledgeBaseRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public RetrieveKnowledgeBaseRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public RetrieveKnowledgeBaseRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RetrieveKnowledgeBaseRequest setRecallWindow(String recallWindow) {
        this.recallWindow = recallWindow;
        return this;
    }
    public String getRecallWindow() {
        return this.recallWindow;
    }

    public RetrieveKnowledgeBaseRequest setRerankFactor(Double rerankFactor) {
        this.rerankFactor = rerankFactor;
        return this;
    }
    public Double getRerankFactor() {
        return this.rerankFactor;
    }

    public RetrieveKnowledgeBaseRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

}
