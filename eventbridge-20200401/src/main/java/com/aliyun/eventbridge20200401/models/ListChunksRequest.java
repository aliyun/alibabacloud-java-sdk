// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListChunksRequest extends TeaModel {
    /**
     * <p>The data catalog to which the knowledge base belongs. This parameter is used together with Namespace and KnowledgeBaseName to locate the knowledge base. You can obtain the value by calling the ListCatalogs operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>Optional. If you specify this parameter, only the chunks of the specified document are listed, sorted in ascending order of ChunkSeq within the document. If you do not specify this parameter, the chunks of all documents in the knowledge base are listed, sorted in ascending lexicographical order of DocumentId and then in ascending order of ChunkSeq within the same document, with chunks arranged consecutively. In full-base mode, Keyword filtering is not supported. Use SearchKnowledgeBase instead. In addition, TotalCount is not returned in full-base mode. Pagination ends when NextToken is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>doc-bp1xxxxxxxxxxxx</p>
     */
    @NameInMap("DocumentId")
    public String documentId;

    /**
     * <p>Optional. If you set this parameter to true, only enabled chunks are returned. If you set it to false, only disabled chunks are returned. If you do not specify this parameter, all chunks are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>Optional. This parameter is active only when DocumentId is specified. It filters chunks by keywords in the chunk content. Only chunks that contain the specified keyword are returned. If you specify this parameter in full-base pattern (when DocumentId is not specified), an error is reported. To retrieve full-text content, use SearchKnowledgeBase (set Mode to KEYWORD for full-text index).</p>
     * 
     * <strong>example:</strong>
     * <p>Install</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The name of the knowledge base. The name must be unique within the namespace. It is specified upon creation and cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-knowledge-base</p>
     */
    @NameInMap("KnowledgeBaseName")
    public String knowledgeBaseName;

    /**
     * <p>The maximum number of results to return per page. If you do not specify this parameter or set it to 0, the default value 20 is used. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The namespace to which the knowledge base belongs. The namespace must belong to the specified data catalog. This parameter is used together with Catalog and KnowledgeBaseName to locate the knowledge base. You can obtain the value by calling the ListNamespaces operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>You do not need to specify this parameter for the first query. For subsequent queries, use the NextToken value returned in the previous response. An empty value indicates that no more pages are available.</p>
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
