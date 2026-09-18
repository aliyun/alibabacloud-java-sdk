// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SearchKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The data catalog to which the knowledge base belongs. This parameter, together with Namespace and KnowledgeBaseName, uniquely identifies a knowledge base. You can call ListCatalogs to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>The name of the knowledge base. The name is unique within a namespace and is specified at creation time. It cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-knowledge-base</p>
     */
    @NameInMap("KnowledgeBaseName")
    public String knowledgeBaseName;

    /**
     * <p>Filters search results by document metadata. The value is a JSON expression tree. Nodes are classified into two types: logical nodes {&quot;AndAll&quot;: [child nodes...]} (all conditions must be met), {&quot;OrAll&quot;: [child nodes...]} (any condition must be met), or {&quot;NotAll&quot;: [child nodes...]} (none of the conditions must be met), which support arbitrary nesting; and leaf conditions {&quot;Key&quot;: field name, &quot;Operator&quot;: operator, &quot;Value&quot;: value}, where the In and NotIn operators use &quot;Values&quot;: [values...]. Valid values of Operator: Equals, NotEquals, In, NotIn, GreaterThan, GreaterThanOrEqual, LessThan, LessThanOrEqual (the last four range operators apply only to LONG, DOUBLE, or DATETIME fields), StartsWith, and StringContains (applies only to STRING fields). Fields must be declared in the knowledge base schema. The nesting depth cannot exceed 5, and the total number of leaf conditions cannot exceed 20. DATETIME field value format: ISO-8601 with time zone, yyyy-MM-dd HH:mm:ss, or yyyy-MM-dd.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AndAll&quot;: [{&quot;Key&quot;: &quot;env&quot;, &quot;Operator&quot;: &quot;In&quot;, &quot;Values&quot;: [&quot;prod&quot;, &quot;staging&quot;]}, {&quot;OrAll&quot;: [{&quot;Key&quot;: &quot;score&quot;, &quot;Operator&quot;: &quot;GreaterThan&quot;, &quot;Value&quot;: &quot;0.8&quot;}, {&quot;Key&quot;: &quot;owner&quot;, &quot;Operator&quot;: &quot;Equals&quot;, &quot;Value&quot;: &quot;alice&quot;}]}]}</p>
     */
    @NameInMap("MetadataFilter")
    public String metadataFilter;

    /**
     * <p>The retrieval mode. KEYWORD indicates keyword retrieval. VECTOR indicates vector retrieval. HYBRID indicates hybrid retrieval.</p>
     * 
     * <strong>example:</strong>
     * <p>HYBRID</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The namespace to which the knowledge base belongs. The namespace must belong to the specified data catalog. This parameter, together with Catalog and KnowledgeBaseName, uniquely identifies a knowledge base. You can call ListNamespaces to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The query text. Both keyword retrieval and vector retrieval are based on this text.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>How to configure event rules</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>Optional. Overrides the fusion algorithm configured for the knowledge base for this request. This parameter takes effect only in hybrid search (HYBRID) mode. RRF indicates reciprocal rank fusion. WEIGHTED indicates weighted normalization fusion (used together with VectorWeight). If you set this parameter to WEIGHTED in keyword-only or vector-only mode, an InvalidParameter error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>RRF</p>
     */
    @NameInMap("RankAlgorithm")
    public String rankAlgorithm;

    /**
     * <p>Specifies whether to enable reranking for search results. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Rerank")
    public Boolean rerank;

    /**
     * <p>Optional. Overrides the reranking model configured for the knowledge base for this request. This parameter takes effect when reranking is enabled (in all search modes). Valid values: qwen3-rerank, gte-rerank-v2, and qwen3-vl-rerank. If this parameter is not specified, the value configured for the knowledge base is used. If no value is configured, the default value qwen3-rerank is used. Score distributions differ across models and cannot be compared. Use the same model consistently for a given knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3-rerank</p>
     */
    @NameInMap("RerankModel")
    public String rerankModel;

    /**
     * <p>Optional. Overrides the reciprocal rank fusion (RRF) parameter k configured for the knowledge base for this request. This parameter takes effect only in hybrid search (HYBRID) mode. The value must be greater than 0.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RrfK")
    public Integer rrfK;

    /**
     * <p>The number of most relevant results to return. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    /**
     * <p>Optional. The vector weight for the WEIGHTED fusion algorithm. Valid values: 0 to 1. The keyword weight equals 1 minus this value. If this parameter is not specified, the value configured for the knowledge base is used. If no value is configured, the default value 0.7 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>0.7</p>
     */
    @NameInMap("VectorWeight")
    public Double vectorWeight;

    public static SearchKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchKnowledgeBaseRequest self = new SearchKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public SearchKnowledgeBaseRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public SearchKnowledgeBaseRequest setKnowledgeBaseName(String knowledgeBaseName) {
        this.knowledgeBaseName = knowledgeBaseName;
        return this;
    }
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public SearchKnowledgeBaseRequest setMetadataFilter(String metadataFilter) {
        this.metadataFilter = metadataFilter;
        return this;
    }
    public String getMetadataFilter() {
        return this.metadataFilter;
    }

    public SearchKnowledgeBaseRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public SearchKnowledgeBaseRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SearchKnowledgeBaseRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchKnowledgeBaseRequest setRankAlgorithm(String rankAlgorithm) {
        this.rankAlgorithm = rankAlgorithm;
        return this;
    }
    public String getRankAlgorithm() {
        return this.rankAlgorithm;
    }

    public SearchKnowledgeBaseRequest setRerank(Boolean rerank) {
        this.rerank = rerank;
        return this;
    }
    public Boolean getRerank() {
        return this.rerank;
    }

    public SearchKnowledgeBaseRequest setRerankModel(String rerankModel) {
        this.rerankModel = rerankModel;
        return this;
    }
    public String getRerankModel() {
        return this.rerankModel;
    }

    public SearchKnowledgeBaseRequest setRrfK(Integer rrfK) {
        this.rrfK = rrfK;
        return this;
    }
    public Integer getRrfK() {
        return this.rrfK;
    }

    public SearchKnowledgeBaseRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public SearchKnowledgeBaseRequest setVectorWeight(Double vectorWeight) {
        this.vectorWeight = vectorWeight;
        return this;
    }
    public Double getVectorWeight() {
        return this.vectorWeight;
    }

}
