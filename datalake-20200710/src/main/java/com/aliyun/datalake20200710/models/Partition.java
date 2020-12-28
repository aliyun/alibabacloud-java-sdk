// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class Partition extends TeaModel {
    // CreateTime
    @NameInMap("CreateTime")
    public Integer createTime;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    // LastAccessTime
    @NameInMap("LastAccessTime")
    public Integer lastAccessTime;

    // LastAnalyzedTime
    @NameInMap("LastAnalyzedTime")
    public Integer lastAnalyzedTime;

    // Parameters
    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    @NameInMap("Privileges")
    public PrincipalPrivilegeSet privileges;

    @NameInMap("Sd")
    public StorageDescriptor sd;

    // TableName
    @NameInMap("TableName")
    public String tableName;

    // Values
    @NameInMap("Values")
    public java.util.List<String> values;

    public static Partition build(java.util.Map<String, ?> map) throws Exception {
        Partition self = new Partition();
        return TeaModel.build(map, self);
    }

    public Partition setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public Partition setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public Partition setLastAccessTime(Integer lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    public Partition setLastAnalyzedTime(Integer lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
        return this;
    }
    public Integer getLastAnalyzedTime() {
        return this.lastAnalyzedTime;
    }

    public Partition setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public Partition setPrivileges(PrincipalPrivilegeSet privileges) {
        this.privileges = privileges;
        return this;
    }
    public PrincipalPrivilegeSet getPrivileges() {
        return this.privileges;
    }

    public Partition setSd(StorageDescriptor sd) {
        this.sd = sd;
        return this;
    }
    public StorageDescriptor getSd() {
        return this.sd;
    }

    public Partition setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public Partition setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
