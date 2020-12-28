// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchDeleteTableVersionsRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    // TableName
    @NameInMap("TableName")
    public String tableName;

    // Table versionIds
    @NameInMap("VersionIds")
    public java.util.List<Integer> versionIds;

    public static BatchDeleteTableVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteTableVersionsRequest self = new BatchDeleteTableVersionsRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteTableVersionsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public BatchDeleteTableVersionsRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public BatchDeleteTableVersionsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public BatchDeleteTableVersionsRequest setVersionIds(java.util.List<Integer> versionIds) {
        this.versionIds = versionIds;
        return this;
    }
    public java.util.List<Integer> getVersionIds() {
        return this.versionIds;
    }

}
