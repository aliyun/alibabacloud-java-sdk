// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class TableSummaryModel extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("SQL")
    public String SQL;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("TableSize")
    public Long tableSize;

    @NameInMap("TableType")
    public String tableType;

    @NameInMap("UpdateTime")
    public String updateTime;

    public static TableSummaryModel build(java.util.Map<String, ?> map) throws Exception {
        TableSummaryModel self = new TableSummaryModel();
        return TeaModel.build(map, self);
    }

    public TableSummaryModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public TableSummaryModel setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TableSummaryModel setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public TableSummaryModel setSQL(String SQL) {
        this.SQL = SQL;
        return this;
    }
    public String getSQL() {
        return this.SQL;
    }

    public TableSummaryModel setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public TableSummaryModel setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public TableSummaryModel setTableSize(Long tableSize) {
        this.tableSize = tableSize;
        return this;
    }
    public Long getTableSize() {
        return this.tableSize;
    }

    public TableSummaryModel setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

    public TableSummaryModel setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
