// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListDocumentsRequest extends TeaModel {
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
     * <p>Optional. Filters documents by file name prefix (prefix match, with the same semantics as the NamePrefix parameter of ListEventStreamings). If this parameter is not specified or is set to an empty string, no filtering is applied. Maximum length: 255 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>AfterSalesPolicy</p>
     */
    @NameInMap("FileNamePrefix")
    public String fileNamePrefix;

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
     * <p>The maximum number of results to return per page. If this parameter is not specified or is set to 0, the default value of 20 is used. Maximum value: 100.</p>
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
     * <p>Not required for the first query. For subsequent queries, use the NextToken value returned in the previous response. An empty value indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>ca1eb85f5d99c7d6a97e6****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Optional. Filters documents by exact status match. Valid values:</p>
     * <ul>
     * <li>UPLOADING: uploading</li>
     * <li>PENDING: pending processing</li>
     * <li>PROCESSING: processing</li>
     * <li>COMPLETED: completed</li>
     * <li>FAILED: failed</li>
     * <li>DELETING: deleting</li>
     * </ul>
     * <p>If this parameter is not specified, no filtering is applied.</p>
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
