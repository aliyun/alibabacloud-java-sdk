// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DLPartition extends TeaModel {
    /**
     * <p>The name of the catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The time when the partition was created. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735109884</p>
     */
    @NameInMap("CreateTime")
    public Integer createTime;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The time when the table was last accessed.</p>
     * 
     * <strong>example:</strong>
     * <p>1608707407</p>
     */
    @NameInMap("LastAccessTime")
    public Integer lastAccessTime;

    /**
     * <p>The key-value pair of the partition.</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    /**
     * <p>The description of the data storage.</p>
     */
    @NameInMap("Sd")
    public DLStorageDescriptor sd;

    /**
     * <p>The table name.</p>
     * 
     * <strong>example:</strong>
     * <p>table_name</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The values in a partition key column.</p>
     */
    @NameInMap("Values")
    public java.util.List<String> values;

    public static DLPartition build(java.util.Map<String, ?> map) throws Exception {
        DLPartition self = new DLPartition();
        return TeaModel.build(map, self);
    }

    public DLPartition setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public DLPartition setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public DLPartition setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DLPartition setLastAccessTime(Integer lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    public DLPartition setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public DLPartition setSd(DLStorageDescriptor sd) {
        this.sd = sd;
        return this;
    }
    public DLStorageDescriptor getSd() {
        return this.sd;
    }

    public DLPartition setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public DLPartition setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
