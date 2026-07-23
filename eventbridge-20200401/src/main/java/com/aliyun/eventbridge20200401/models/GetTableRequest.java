// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetTableRequest extends TeaModel {
    /**
     * <p>Data catalog</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>Idempotent token</p>
     * 
     * <strong>example:</strong>
     * <p>1e9b8f60-3a2c-4d7e-9f1b-8c3d5e7a2b4f</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Table name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_table</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Namespace</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static GetTableRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableRequest self = new GetTableRequest();
        return TeaModel.build(map, self);
    }

    public GetTableRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public GetTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetTableRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetTableRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
