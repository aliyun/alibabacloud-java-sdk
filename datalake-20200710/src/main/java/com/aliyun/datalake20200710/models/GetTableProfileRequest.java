// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetTableProfileRequest extends TeaModel {
    /**
     * <p>The ID of the data directory. By default, the ID of the primary account is entered.</p>
     * 
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>The name of the metadatabase.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exp_table</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The name of the metadata table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>admin_user</p>
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
