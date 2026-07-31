// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ColDetailModel extends TeaModel {
    /**
     * <p>The logical name of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The time when the column was created. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-05\&quot;T\&quot;13:17:55\&quot;Z\&quot;</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether the column is the distribution key.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DistributeKey")
    public Boolean distributeKey;

    /**
     * <p>Indicates whether the column can be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Nullable")
    public Boolean nullable;

    /**
     * <p>Indicates whether the column is the partition key.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PartitionKey")
    public Boolean partitionKey;

    /**
     * <p>Indicates whether the column is the primary key.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PrimaryKey")
    public Boolean primaryKey;

    /**
     * <p>The logical name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>schemaName</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The logical name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>tableName</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The data type of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The time when the column was updated. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-05\&quot;T\&quot;13:17:55\&quot;Z\&quot;</p>
     */
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
