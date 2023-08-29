// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetTableProfileRequest extends TeaModel {
    /**
     * <p>CatalogId</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>DatabaseName</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>TableName</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static GetTableProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableProfileRequest self = new GetTableProfileRequest();
        return TeaModel.build(map, self);
    }

    public GetTableProfileRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public GetTableProfileRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GetTableProfileRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
