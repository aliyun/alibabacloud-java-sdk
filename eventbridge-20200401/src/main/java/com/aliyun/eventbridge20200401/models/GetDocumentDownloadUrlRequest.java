// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetDocumentDownloadUrlRequest extends TeaModel {
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
     * <p>The namespace to which the knowledge base belongs. The namespace must belong to the specified data catalog. This parameter, together with Catalog and KnowledgeBaseName, uniquely identifies the knowledge base. You can call ListNamespaces to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The network type of the presigned URL. Valid values:</p>
     * <ul>
     * <li>PUBLIC: Accessible over the Internet. This is the default value.</li>
     * <li>INTERNAL: Accessible only over the internal network within the same Alibaba Cloud region. No Internet traffic fees are incurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    public static GetDocumentDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentDownloadUrlRequest self = new GetDocumentDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetDocumentDownloadUrlRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public GetDocumentDownloadUrlRequest setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public GetDocumentDownloadUrlRequest setKnowledgeBaseName(String knowledgeBaseName) {
        this.knowledgeBaseName = knowledgeBaseName;
        return this;
    }
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public GetDocumentDownloadUrlRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetDocumentDownloadUrlRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

}
