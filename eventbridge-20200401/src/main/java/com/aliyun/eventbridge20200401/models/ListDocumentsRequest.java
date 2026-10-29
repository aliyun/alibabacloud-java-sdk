// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListDocumentsRequest extends TeaModel {
    /**
     * <p>The data catalog to which the knowledge base belongs. This parameter, along with Namespace and KnowledgeBaseName, uniquely identifies the knowledge base. You can call ListCatalogs to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>Optional. Filters documents by file name prefix. The prefix matching semantics are the same as those of the NamePrefix parameter in ListEventStreamings. If this parameter is not specified or is left empty, no filtering is applied. The maximum length is 255 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>After-sales policy</p>
     */
    @NameInMap("FileNamePrefix")
    public String fileNamePrefix;

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
     * <p>The maximum number of results to return per page. If this parameter is not specified or is set to 0, the default value 20 is used. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The namespace to which the knowledge base belongs. The namespace must belong to the specified data catalog. This parameter, along with Catalog and KnowledgeBaseName, uniquely identifies the knowledge base. You can call ListNamespaces to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The token for the next page. You do not need to specify this parameter for the first query. For subsequent queries, use the NextToken value returned in the previous response. An empty value indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>ca1eb85f5d99c7d6a97e6****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Optional. Filters documents by exact document status. Valid values:</p>
     * <ul>
     * <li>UPLOADING: The document is being uploaded.</li>
     * <li>PENDING: The document is pending processing.</li>
     * <li>PROCESSING: The document is being processed.</li>
     * <li>COMPLETED: The document processing is completed.</li>
     * <li>FAILED: The document processing failed.</li>
     * <li>DELETING: The document is being deleted.
     * If this parameter is not specified, no filtering is applied.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListDocumentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentsRequest self = new ListDocumentsRequest();
        return TeaModel.build(map, self);
    }

    public ListDocumentsRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public ListDocumentsRequest setFileNamePrefix(String fileNamePrefix) {
        this.fileNamePrefix = fileNamePrefix;
        return this;
    }
    public String getFileNamePrefix() {
        return this.fileNamePrefix;
    }

    public ListDocumentsRequest setKnowledgeBaseName(String knowledgeBaseName) {
        this.knowledgeBaseName = knowledgeBaseName;
        return this;
    }
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public ListDocumentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDocumentsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListDocumentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDocumentsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
