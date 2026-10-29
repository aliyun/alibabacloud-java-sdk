// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SearchKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The data catalog to which the knowledge base belongs. This parameter, together with Namespace and KnowledgeBaseName, uniquely identifies the knowledge base. You can call ListCatalogs to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>The name of the knowledge base. The name must be unique within the namespace. The name is specified upon creation and cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-knowledge-base</p>
     */
    @NameInMap("KnowledgeBaseName")
    public String knowledgeBaseName;

    /**
     * <p>Filters search results by document metadata. The value is a JSON expression tree. Nodes are divided into two types: logical nodes and leaf conditions. Logical nodes include {&quot;AndAll&quot;: [child nodes...]} (all conditions met), {&quot;OrAll&quot;: [child nodes...]} (any condition met), and {&quot;NotAll&quot;: [child nodes...]} (no conditions met). Arbitrary nesting is supported. Leaf conditions are in the format of {&quot;Key&quot;: field name, &quot;Operator&quot;: operator, &quot;Value&quot;: value}. For the In and NotIn operators, use &quot;Values&quot;: [values...]. Valid values for Operator: Equals, NotEquals, In, NotIn, GreaterThan, GreaterThanOrEqual, LessThan, and LessThanOrEqual (the last four range operators apply only to LONG, DOUBLE, and DATETIME fields), StartsWith, and StringContains (applies only to STRING fields). The field must be declared in the knowledge base schema. The nesting depth cannot exceed 5, and the total number of leaf conditions cannot exceed 20. Valid formats for DATETIME field values: ISO-8601 with time zone, yyyy-MM-dd HH:mm:ss, or yyyy-MM-dd.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AndAll&quot;: [{&quot;Key&quot;: &quot;env&quot;, &quot;Operator&quot;: &quot;In&quot;, &quot;Values&quot;: [&quot;prod&quot;, &quot;staging&quot;]}, {&quot;OrAll&quot;: [{&quot;Key&quot;: &quot;score&quot;, &quot;Operator&quot;: &quot;GreaterThan&quot;, &quot;Value&quot;: &quot;0.8&quot;}, {&quot;Key&quot;: &quot;owner&quot;, &quot;Operator&quot;: &quot;Equals&quot;, &quot;Value&quot;: &quot;alice&quot;}]}]}</p>
     */
    @NameInMap("MetadataFilter")
    public String metadataFilter;

    /**
     * <p>The retrieve mode. Valid values:</p>
     * <ul>
     * <li>KEYWORD: keyword retrieve.</li>
     * <li>VECTOR: AISearch.</li>
     * <li>HYBRID: hybrid retrieve.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HYBRID</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The namespace to which the knowledge base belongs. The namespace must belong to the specified data catalog. This parameter, together with Catalog and KnowledgeBaseName, uniquely identifies the knowledge base. You can call ListNamespaces to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The retrieve text. Both keyword retrieve and AISearch are based on this text.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>How to configure event rules</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>Optional. Overrides the fusion algorithm configured for the knowledge base in this request. This parameter takes effect only in HYBRID search mode. Valid values: RRF for reciprocal rank fusion, and WEIGHTED for weighted normalization fusion (used with VectorWeight). If you set this parameter to WEIGHTED in KEYWORD or VECTOR single mode, the InvalidParameter error is returned.</p>
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
     * <p>Optional. Overrides the reranking model configured for the knowledge base in this request. This parameter takes effect when reranking is enabled across all search modes. Valid values: qwen3-rerank, gte-rerank-v2, and qwen3-vl-rerank. If this parameter is not specified, the value configured for the knowledge base is used. If no value is configured, the default value is qwen3-rerank. Score distributions of different models cannot be compared horizontally. We recommend that you use a fixed model for each knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3-rerank</p>
     */
    @NameInMap("RerankModel")
    public String rerankModel;

    /**
     * <p>Optional. Overrides the RRF fusion parameter k configured for the knowledge base in this request. This parameter takes effect only in HYBRID search mode and must be greater than 0.</p>
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
     * <p>Optional. The vector path weight for the WEIGHTED fusion algorithm. Valid values: 0 to 1. The keyword path weight is 1 minus this value. If this parameter is not specified, the value configured for the knowledge base is used. If no value is configured, the default value is 0.7.</p>
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
