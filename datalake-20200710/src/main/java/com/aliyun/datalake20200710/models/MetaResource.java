// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class MetaResource extends TeaModel {
    @NameInMap("CatalogResource")
    public CatalogResource catalogResource;

    @NameInMap("ColumnResource")
    public ColumnResource columnResource;

    @NameInMap("DatabaseResource")
    public DatabaseResource databaseResource;

    @NameInMap("FunctionResource")
    public FunctionResource functionResource;

    /**
     * <strong>example:</strong>
     * <p>TABLE</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("TableResource")
    public TableResource tableResource;

    public static MetaResource build(java.util.Map<String, ?> map) throws Exception {
        MetaResource self = new MetaResource();
        return TeaModel.build(map, self);
    }

    public MetaResource setCatalogResource(CatalogResource catalogResource) {
        this.catalogResource = catalogResource;
        return this;
    }
    public CatalogResource getCatalogResource() {
        return this.catalogResource;
    }

    public MetaResource setColumnResource(ColumnResource columnResource) {
        this.columnResource = columnResource;
        return this;
    }
    public ColumnResource getColumnResource() {
        return this.columnResource;
    }

    public MetaResource setDatabaseResource(DatabaseResource databaseResource) {
        this.databaseResource = databaseResource;
        return this;
    }
    public DatabaseResource getDatabaseResource() {
        return this.databaseResource;
    }

    public MetaResource setFunctionResource(FunctionResource functionResource) {
        this.functionResource = functionResource;
        return this;
    }
    public FunctionResource getFunctionResource() {
        return this.functionResource;
    }

    public MetaResource setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public MetaResource setTableResource(TableResource tableResource) {
        this.tableResource = tableResource;
        return this;
    }
    public TableResource getTableResource() {
        return this.tableResource;
    }

}
