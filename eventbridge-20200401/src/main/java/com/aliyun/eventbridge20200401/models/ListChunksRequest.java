// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListChunksRequest extends TeaModel {
    /**
     * <p>The data catalog to which the knowledge base belongs. This parameter, together with Namespace and KnowledgeBaseName, uniquely identifies a knowledge base. You can call ListCatalogs to obtain this value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>Optional. If specified, only chunks of the specified document are returned, sorted by ChunkSeq in ascending order within the document. If not specified, chunks of all documents in the knowledge base are returned, sorted by DocumentId in lexicographic ascending order, and within the same document by ChunkSeq in ascending order, with chunks listed contiguously. In full knowledge base mode, Keyword filtering is not supported (use SearchKnowledgeBase instead), and TotalCount is not returned. Pagination ends when NextToken is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>doc-bp1xxxxxxxxxxxx</p>
     */
    @NameInMap("DocumentId")
    public String documentId;

    /**
     * <p>Optional. Set to true to return only enabled chunks, or false to return only disabled chunks. If not specified, all chunks are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>Optional. Active only when DocumentId is specified. Filters chunks by keyword in the chunk body. Only chunks that contain the specified keyword are returned. In full knowledge base pattern (when DocumentId is not specified), passing this parameter causes an error. To retrieve content across the full text, use SearchKnowledgeBase (set Mode to KEYWORD for full-text index).</p>
     * 
     * <strong>example:</strong>
     * <p>Installation</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The name of the knowledge base. The name is unique within a namespace and is determined at creation time. It cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-knowledge-base</p>
     */
    @NameInMap("KnowledgeBaseName")
    public String knowledgeBaseName;

    /**
     * <p>The maximum number of results to return per page. If not specified or set to 0, the default value 20 is used. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The namespace to which the knowledge base belongs. The namespace must belong to the specified data catalog. This parameter, together with Catalog and KnowledgeBaseName, uniquely identifies a knowledge base. You can call ListNamespaces to obtain this value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Not required for the first query. For subsequent queries, pass the NextToken returned in the previous response. An empty value indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>ca1eb85f5d99c7d6a97e6****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListChunksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChunksRequest self = new ListChunksRequest();
        return TeaModel.build(map, self);
    }

    public ListChunksRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public ListChunksRequest setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public ListChunksRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ListChunksRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListChunksRequest setKnowledgeBaseName(String knowledgeBaseName) {
        this.knowledgeBaseName = knowledgeBaseName;
        return this;
    }
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public ListChunksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListChunksRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListChunksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
