// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The data catalog to which the knowledge base belongs. This parameter is used together with Namespace and KnowledgeBaseName to locate the knowledge base. You can call ListCatalogs to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>The name of the knowledge base. The name must be unique within the namespace and cannot be modified after creation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-knowledge-base</p>
     */
    @NameInMap("KnowledgeBaseName")
    public String knowledgeBaseName;

    /**
     * <p>The namespace to which the knowledge base belongs. The namespace must belong to the specified data catalog. This parameter is used together with Catalog and KnowledgeBaseName to locate the knowledge base. You can call ListNamespaces to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static DeleteKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeBaseRequest self = new DeleteKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeBaseRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public DeleteKnowledgeBaseRequest setKnowledgeBaseName(String knowledgeBaseName) {
        this.knowledgeBaseName = knowledgeBaseName;
        return this;
    }
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public DeleteKnowledgeBaseRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
