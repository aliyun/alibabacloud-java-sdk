// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteTableVersionRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    // TableName
    @NameInMap("TableName")
    public String tableName;

    // table version id
    @NameInMap("VersionId")
    public Integer versionId;

    public static DeleteTableVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableVersionRequest self = new DeleteTableVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTableVersionRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public DeleteTableVersionRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DeleteTableVersionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public DeleteTableVersionRequest setVersionId(Integer versionId) {
        this.versionId = versionId;
        return this;
    }
    public Integer getVersionId() {
        return this.versionId;
    }

}
