// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ColDetailModel extends TeaModel {
    @NameInMap("ColumnName")
    public String columnName;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("DistributeKey")
    public Boolean distributeKey;

    @NameInMap("Nullable")
    public Boolean nullable;

    @NameInMap("PartitionKey")
    public Boolean partitionKey;

    @NameInMap("PrimaryKey")
    public Boolean primaryKey;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("Type")
    public String type;

    @NameInMap("UpdateTime")
    public String updateTime;

    public static ColDetailModel build(java.util.Map<String, ?> map) throws Exception {
        ColDetailModel self = new ColDetailModel();
        return TeaModel.build(map, self);
    }

    public ColDetailModel setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ColDetailModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ColDetailModel setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ColDetailModel setDistributeKey(Boolean distributeKey) {
        this.distributeKey = distributeKey;
        return this;
    }
    public Boolean getDistributeKey() {
        return this.distributeKey;
    }

    public ColDetailModel setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }
    public Boolean getNullable() {
        return this.nullable;
    }

    public ColDetailModel setPartitionKey(Boolean partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }
    public Boolean getPartitionKey() {
        return this.partitionKey;
    }

    public ColDetailModel setPrimaryKey(Boolean primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }
    public Boolean getPrimaryKey() {
        return this.primaryKey;
    }

    public ColDetailModel setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public ColDetailModel setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ColDetailModel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ColDetailModel setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
