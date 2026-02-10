// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryContentRequest extends TeaModel {
    /**
     * <p>Document collection name.</p>
     * <blockquote>
     * <p>Created by the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> API. You can use the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> API to view the list of created document collections.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>Text content for retrieval.</p>
     * 
     * <strong>example:</strong>
     * <p>What is ADBPG?</p>
     */
    @NameInMap("Content")
    public String content;

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
     * <p>In image search scenarios, the source file name of the image to be searched.</p>
     * <blockquote>
     * <p>The image file must have a file extension. Currently supported image extensions: bmp, jpg, jpeg, png, tiff.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test.jpg</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>In image search scenarios, the publicly accessible URL of the image file.</p>
     * <blockquote>
     * <p>The image file must have a file extension. Currently supported image extensions: bmp, jpg, jpeg, png, tiff.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xx/myImage.jpg">https://xx/myImage.jpg</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>Filter condition for the data to be queried, in SQL WHERE format. It is an expression that returns a boolean value (true or false). The conditions can be simple comparison operators such as equal (=), not equal (&lt;&gt; or !=), greater than (&gt;), less than (&lt;), greater than or equal to (&gt;=), less than or equal to (&lt;=), or more complex expressions combined with logical operators (AND, OR, NOT), and conditions using keywords like IN, BETWEEN, LIKE, etc.</p>
     * <blockquote>
     * <ul>
     * <li>For detailed syntax, refer to: <a href="https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/">https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/</a></li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>title = \&quot;test\&quot; AND name like \&quot;test%\&quot;</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>Whether to enable knowledge graph enhancement. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GraphEnhance")
    public Boolean graphEnhance;

    /**
     * <p>The search parameters of the knowledge graph.</p>
     */
    @NameInMap("GraphSearchArgs")
    public QueryContentRequestGraphSearchArgs graphSearchArgs;

    /**
     * <p>Dual recall algorithm, default is empty (i.e., directly compare and sort the scores of vectors and full text).</p>
     * <p>Available values:</p>
     * <ul>
     * <li>RRF: Reciprocal rank fusion, with a parameter k controlling the fusion effect. See HybridSearchArgs configuration for details;</li>
     * <li>Weight: Weighted ranking, using a parameter alpha to control the weight of vector and full-text scores, then sorting. See HybridSearchArgs configuration for details;</li>
     * <li>Cascaded: Perform full-text retrieval first, then vector retrieval on top of it;</li>
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
     * <p>Specifies whether to return the URL of the document. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeFileUrl")
    public Boolean includeFileUrl;

    /**
     * <p>The metadata fields to be returned. Separate multiple fields with commas (,). This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>title,page</p>
     */
    @NameInMap("IncludeMetadataFields")
    public String includeMetadataFields;

    /**
     * <p>Whether to return vectors. Default is false.</p>
     * <blockquote>
     * <ul>
     * <li><strong>false</strong>: Do not return vectors.</li>
     * <li><strong>true</strong>: Return vectors.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeVector")
    public Boolean includeVector;

    /**
     * <p>Similarity algorithm used during retrieval. If this value is empty, the algorithm specified at the time of knowledge base creation is used. It is recommended not to set this unless there is a specific need.</p>
     * <blockquote>
     * <p>Value description:</p>
     * <ul>
     * <li><strong>l2</strong>: Euclidean distance.</li>
     * <li><strong>ip</strong>: Inner product (dot product) distance.</li>
     * <li><strong>cosine</strong>: Cosine similarity.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cosine</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>Namespace, default is public.</p>
     * <blockquote>
     * <p>You can create a namespace using the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> API and view the list of namespaces using the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> API.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Password for the namespace.</p>
     * <blockquote>
     * <p>This value is specified in the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> API.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("NamespacePassword")
    public String namespacePassword;

    /**
     * <p>Offset, used for paginated queries.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    /**
     * <p>The fields by which to sort the results. This parameter is empty by default.</p>
     * <p>The field must be either a metadata field or a default field in the table (e.g., id). Supported formats include:</p>
     * <p>Single field, such as chunk_id. Multiple fields that are separated by commas (,), such as block_id,chunk_id. Descending order is supported, e.g., block_id DESC, chunk_id DESC.</p>
     * 
     * <strong>example:</strong>
     * <p>created_at</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Recall window. When this value is not empty, it adds context to the returned search results. The format is an array of 2 elements: List&lt;A, B&gt;, where -10 &lt;= A &lt;= 0 and 0 &lt;= B &lt;= 10.</p>
     * <blockquote>
     * <ul>
     * <li>Recommended when documents are fragmented and retrieval may lose contextual information.</li>
     * <li>Re-ranking takes precedence over windowing, i.e., re-rank first, then apply windowing.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("RecallWindow")
    public java.util.List<Integer> recallWindow;

    /**
     * <p>The region ID where the instance is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Re-ranking factor. When this value is not empty, it will re-rank the vector search results. The value range is 1 &lt; RerankFactor &lt;= 5.</p>
     * <blockquote>
     * <ul>
     * <li>Re-ranking is slower when documents are sparsely split.</li>
     * <li>It is recommended that the re-ranked count (TopK * Factor, rounded up) does not exceed 50.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RerankFactor")
    public Double rerankFactor;

    /**
     * <p>The number of the returned top results.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    /**
     * <p>The validity period of the returned image URL.</p>
     * <blockquote>
     * <p> Value Description</p>
     * </blockquote>
     * <ul>
     * <li><p>Supported units are seconds (s) and days (d). For example, 300s specifies that the URL is valid for 300 seconds, and 60d specifies that the URL is valid for 60 days.</p>
     * </li>
     * <li><p>Valid values: 60s to 365d.</p>
     * </li>
     * <li><p>Default value: 7200s, that is, 2 hours.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7200s</p>
     */
    @NameInMap("UrlExpiration")
    public String urlExpiration;

    /**
     * <p>Whether to use full-text retrieval (dual recall). Default is false, which means only vector retrieval is used.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseFullTextRetrieval")
    public Boolean useFullTextRetrieval;

    public static QueryContentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContentRequest self = new QueryContentRequest();
        return TeaModel.build(map, self);
    }

    public QueryContentRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public QueryContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryContentRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public QueryContentRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public QueryContentRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public QueryContentRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public QueryContentRequest setGraphEnhance(Boolean graphEnhance) {
        this.graphEnhance = graphEnhance;
        return this;
    }
    public Boolean getGraphEnhance() {
        return this.graphEnhance;
    }

    public QueryContentRequest setGraphSearchArgs(QueryContentRequestGraphSearchArgs graphSearchArgs) {
        this.graphSearchArgs = graphSearchArgs;
        return this;
    }
    public QueryContentRequestGraphSearchArgs getGraphSearchArgs() {
        return this.graphSearchArgs;
    }

    public QueryContentRequest setHybridSearch(String hybridSearch) {
        this.hybridSearch = hybridSearch;
        return this;
    }
    public String getHybridSearch() {
        return this.hybridSearch;
    }

    public QueryContentRequest setHybridSearchArgs(java.util.Map<String, java.util.Map<String, ?>> hybridSearchArgs) {
        this.hybridSearchArgs = hybridSearchArgs;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getHybridSearchArgs() {
        return this.hybridSearchArgs;
    }

    public QueryContentRequest setIncludeFileUrl(Boolean includeFileUrl) {
        this.includeFileUrl = includeFileUrl;
        return this;
    }
    public Boolean getIncludeFileUrl() {
        return this.includeFileUrl;
    }

    public QueryContentRequest setIncludeMetadataFields(String includeMetadataFields) {
        this.includeMetadataFields = includeMetadataFields;
        return this;
    }
    public String getIncludeMetadataFields() {
        return this.includeMetadataFields;
    }

    public QueryContentRequest setIncludeVector(Boolean includeVector) {
        this.includeVector = includeVector;
        return this;
    }
    public Boolean getIncludeVector() {
        return this.includeVector;
    }

    public QueryContentRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public QueryContentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryContentRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public QueryContentRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public QueryContentRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryContentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryContentRequest setRecallWindow(java.util.List<Integer> recallWindow) {
        this.recallWindow = recallWindow;
        return this;
    }
    public java.util.List<Integer> getRecallWindow() {
        return this.recallWindow;
    }

    public QueryContentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryContentRequest setRerankFactor(Double rerankFactor) {
        this.rerankFactor = rerankFactor;
        return this;
    }
    public Double getRerankFactor() {
        return this.rerankFactor;
    }

    public QueryContentRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public QueryContentRequest setUrlExpiration(String urlExpiration) {
        this.urlExpiration = urlExpiration;
        return this;
    }
    public String getUrlExpiration() {
        return this.urlExpiration;
    }

    public QueryContentRequest setUseFullTextRetrieval(Boolean useFullTextRetrieval) {
        this.useFullTextRetrieval = useFullTextRetrieval;
        return this;
    }
    public Boolean getUseFullTextRetrieval() {
        return this.useFullTextRetrieval;
    }

    public static class QueryContentRequestGraphSearchArgs extends TeaModel {
        /**
         * <p>The number of top entities and relationship edges. Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("GraphTopK")
        public Integer graphTopK;

        public static QueryContentRequestGraphSearchArgs build(java.util.Map<String, ?> map) throws Exception {
            QueryContentRequestGraphSearchArgs self = new QueryContentRequestGraphSearchArgs();
            return TeaModel.build(map, self);
        }

        public QueryContentRequestGraphSearchArgs setGraphTopK(Integer graphTopK) {
            this.graphTopK = graphTopK;
            return this;
        }
        public Integer getGraphTopK() {
            return this.graphTopK;
        }

    }

}
