// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SearchLumaKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The name of the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_agent</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>The name of the data catalog bound to the agent. You can call ListLumaCatalogs to obtain this value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>The name of the knowledge base bound to the agent. You can call ListLumaKnowledgeBases to obtain this value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-knowledge-base</p>
     */
    @NameInMap("KnowledgeBaseName")
    public String knowledgeBaseName;

    /**
     * <p>The metadata filter conditions. The value is a JSON string used to filter the recall scope based on document metadata. For available fields, see the MetadataSchema of the knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;category&quot;:&quot;faq&quot;}</p>
     */
    @NameInMap("MetadataFilter")
    public String metadataFilter;

    /**
     * <p>The retrieve mode. Valid values: vector (AISearch), keyword (keyword retrieve), and hybrid (hybrid retrieve). If you do not specify this parameter, the retrieve configuration of the knowledge base is used.</p>
     * 
     * <strong>example:</strong>
     * <p>hybrid</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The name of the namespace bound to the agent. You can call ListLumaNamespaces to obtain this value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The search query in natural language.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>How to configure event rules</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>Specifies whether to enable reranking. If enabled, the recalled results are reranked to improve precision at the cost of longer execution duration. If you do not specify this parameter, the search configuration of the knowledge base is used.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Rerank")
    public Boolean rerank;

    /**
     * <p>The number of text chunks to return. Valid values: 1 to 100. If you do not specify this parameter, the search configuration of the knowledge base is used.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    public static SearchLumaKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchLumaKnowledgeBaseRequest self = new SearchLumaKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public SearchLumaKnowledgeBaseRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public SearchLumaKnowledgeBaseRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public SearchLumaKnowledgeBaseRequest setKnowledgeBaseName(String knowledgeBaseName) {
        this.knowledgeBaseName = knowledgeBaseName;
        return this;
    }
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public SearchLumaKnowledgeBaseRequest setMetadataFilter(String metadataFilter) {
        this.metadataFilter = metadataFilter;
        return this;
    }
    public String getMetadataFilter() {
        return this.metadataFilter;
    }

    public SearchLumaKnowledgeBaseRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public SearchLumaKnowledgeBaseRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SearchLumaKnowledgeBaseRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchLumaKnowledgeBaseRequest setRerank(Boolean rerank) {
        this.rerank = rerank;
        return this;
    }
    public Boolean getRerank() {
        return this.rerank;
    }

    public SearchLumaKnowledgeBaseRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

}
