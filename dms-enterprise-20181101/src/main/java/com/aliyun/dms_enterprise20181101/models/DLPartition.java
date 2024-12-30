// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DLPartition extends TeaModel {
    @NameInMap("CatalogName")
    public String catalogName;

    @NameInMap("CreateTime")
    public Integer createTime;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("LastAccessTime")
    public Integer lastAccessTime;

    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    @NameInMap("Sd")
    public DLStorageDescriptor sd;

    @NameInMap("TableName")
    public String tableName;

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
