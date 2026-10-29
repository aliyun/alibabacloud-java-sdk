// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetDocumentRequest extends TeaModel {
    /**
     * <p>The data catalog to which the knowledge base belongs. It is used together with Namespace and KnowledgeBaseName to locate the knowledge base. You can call the ListCatalogs operation to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>The ID of the document.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>doc-bp1xxxxxxxxxxxx</p>
     */
    @NameInMap("DocumentId")
    public String documentId;

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
     * <p>The namespace to which the knowledge base belongs. The namespace must belong to the specified data catalog. It is used together with Catalog and KnowledgeBaseName to locate the knowledge base. You can call the ListNamespaces operation to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static GetDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentRequest self = new GetDocumentRequest();
        return TeaModel.build(map, self);
    }

    public GetDocumentRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public GetDocumentRequest setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public GetDocumentRequest setKnowledgeBaseName(String knowledgeBaseName) {
        this.knowledgeBaseName = knowledgeBaseName;
        return this;
    }
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public GetDocumentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
