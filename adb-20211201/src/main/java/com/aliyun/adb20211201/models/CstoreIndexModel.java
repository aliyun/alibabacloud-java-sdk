// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CstoreIndexModel extends TeaModel {
    @NameInMap("ColumnOrds")
    public java.util.List<String> columnOrds;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("IndexColumns")
    public java.util.List<FieldSchemaModel> indexColumns;

    @NameInMap("IndexName")
    public String indexName;

    @NameInMap("IndexType")
    public String indexType;

    @NameInMap("Options")
    public java.util.Map<String, String> options;

    @NameInMap("PhysicalTableName")
    public String physicalTableName;

    @NameInMap("UpdateTime")
    public String updateTime;

    public static CstoreIndexModel build(java.util.Map<String, ?> map) throws Exception {
        CstoreIndexModel self = new CstoreIndexModel();
        return TeaModel.build(map, self);
    }

    public CstoreIndexModel setColumnOrds(java.util.List<String> columnOrds) {
        this.columnOrds = columnOrds;
        return this;
    }
    public java.util.List<String> getColumnOrds() {
        return this.columnOrds;
    }

    public CstoreIndexModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CstoreIndexModel setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CstoreIndexModel setIndexColumns(java.util.List<FieldSchemaModel> indexColumns) {
        this.indexColumns = indexColumns;
        return this;
    }
    public java.util.List<FieldSchemaModel> getIndexColumns() {
        return this.indexColumns;
    }

    public CstoreIndexModel setIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }
    public String getIndexName() {
        return this.indexName;
    }

    public CstoreIndexModel setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }
    public String getIndexType() {
        return this.indexType;
    }

    public CstoreIndexModel setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public CstoreIndexModel setPhysicalTableName(String physicalTableName) {
        this.physicalTableName = physicalTableName;
        return this;
    }
    public String getPhysicalTableName() {
        return this.physicalTableName;
    }

    public CstoreIndexModel setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
