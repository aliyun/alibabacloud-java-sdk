// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkKnowledgeBaseParameters extends TeaModel {
    /**
     * <p>The data catalog to which the target knowledge base belongs. This parameter, together with Namespace and KnowledgeBaseName, uniquely identifies the knowledge base. You can call ListCatalogs to obtain this value.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>The name of the target knowledge base, which is unique within the namespace. You can call ListKnowledgeBases to obtain this value.</p>
     * 
     * <strong>example:</strong>
     * <p>my-knowledge-base</p>
     */
    @NameInMap("KnowledgeBaseName")
    public String knowledgeBaseName;

    /**
     * <p>The namespace to which the target knowledge base belongs. The namespace must belong to the specified data catalog. You can call ListNamespaces to obtain this value.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static SinkKnowledgeBaseParameters build(java.util.Map<String, ?> map) throws Exception {
        SinkKnowledgeBaseParameters self = new SinkKnowledgeBaseParameters();
        return TeaModel.build(map, self);
    }

    public SinkKnowledgeBaseParameters setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public SinkKnowledgeBaseParameters setKnowledgeBaseName(String knowledgeBaseName) {
        this.knowledgeBaseName = knowledgeBaseName;
        return this;
    }
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public SinkKnowledgeBaseParameters setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
