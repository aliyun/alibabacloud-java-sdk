// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryCollectionDataRequest extends TeaModel {
    /**
     * <p>The name of the collection.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2401503.html">ListCollections</a> operation to query a list of collections.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>The content that is used for full-text search. If you leave this parameter empty, only vector search is used. If you do not leave this parameter empty, two-way retrieval based on vector search and full-text search is used.</p>
     * <blockquote>
     * <p> You must specify at least one of the Content and Vector parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hello_world</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <strong>example:</strong>
     * <p>response &gt; 200</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The two-way retrieval algorithm. This parameter is empty by default, which specifies that scores of vector search and full-text search are directly compared and sorted without additional weighting or adjustments.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>RRF: The reciprocal rank fusion (RRF) algorithm uses a constant k to control the fusion effect. For more information, see the description of the HybridSearchArgs parameter.</li>
     * <li>Weight: This algorithm uses the alpha parameter to specify the proportion of the vector search score and the full-text search score and then sorts by weight. For more information, see the description of the HybridSearchArgs parameter.</li>
     * <li>Cascaded: This algorithm performs first full-text search and then vector search.</li>
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
     * <p>The metadata fields to be returned. Separate multiple fields with commas (,). This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>title,content</p>
     */
    @NameInMap("IncludeMetadataFields")
    public String includeMetadataFields;

    /**
     * <p>Specifies whether to return vector data. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: returns vector data.</li>
     * <li><strong>false</strong>: does not return vector data. In full-text search scenarios, set this parameter to false.</li>
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
     * <li><strong>l2</strong>: Euclidean distance.</li>
     * <li><strong>ip</strong>: inner product distance.</li>
     * <li><strong>cosine</strong>: cosine similarity.</li>
     * </ul>
     * <blockquote>
     * <p> If you leave this parameter empty, the l2, ip, or cosine algorithm that is specified when you create an index is used.</p>
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
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to query a list of namespaces.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("NamespacePassword")
    public String namespacePassword;

    /**
     * <p>The starting point for paginated queries. This parameter is empty by default. This parameter does not support two-way retrieval scenarios.</p>
     * <p>The value must be greater than or equal to 0. If you do not leave this parameter empty, the Total parameter is returned to indicate the total number of matched entries. You must specify this parameter and the TopK parameter in pairs. For example, to paginate 20 chunks at a time for a total of 45 chunks whose chunk_id values are 0 to 44, three requests are involved:</p>
     * <ul>
     * <li>First request: Set the Offset value to 0 and the TopK value to 20. The chunks whose chunk_id values are 0 to 19 are returned.</li>
     * <li>Second request: Set the Offset value to 20 and the TopK value to 20. The chunks whose chunk_id values are 20 to 39 are returned.</li>
     * <li>Third request: Set the Offset value to 30 and the TopK value to 20. The chunks whose chunk_id values are 40 to 44 are returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    /**
     * <p>The fields by which to sort the results. This parameter is empty by default. This parameter does not support two-way retrieval scenarios.</p>
     * <p>You must specify the default fields in the metadata or the table, such as id. You can specify the following number of fields:</p>
     * <ul>
     * <li>One field, such as chunk_id.</li>
     * <li>Multiple fields that are sorted in ascending order and separated by commas (,), such as block_id and chunk_id.</li>
     * <li>Multiple fields that are sorted in descending order and separated by commas (,), such as block_id DESC, chunk_id DESC.</li>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopK")
    public Long topK;

    /**
     * <p>The vector data. The length of the value must be the same as that of the Dimension parameter in the <a href="https://help.aliyun.com/document_detail/2401497.html">CreateCollection</a> operation.</p>
     * <blockquote>
     * <p> If you leave this parameter empty, only full-text search results are returned.</p>
     * </blockquote>
     */
    @NameInMap("Vector")
    public java.util.List<Double> vector;

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

}
