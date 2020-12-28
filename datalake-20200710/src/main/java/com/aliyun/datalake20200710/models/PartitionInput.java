// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class PartitionInput extends TeaModel {
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

    public static PartitionInput build(java.util.Map<String, ?> map) throws Exception {
        PartitionInput self = new PartitionInput();
        return TeaModel.build(map, self);
    }

    public PartitionInput setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public PartitionInput setLastAccessTime(Integer lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    public PartitionInput setLastAnalyzedTime(Integer lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
        return this;
    }
    public Integer getLastAnalyzedTime() {
        return this.lastAnalyzedTime;
    }

    public PartitionInput setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public PartitionInput setPrivileges(PrincipalPrivilegeSet privileges) {
        this.privileges = privileges;
        return this;
    }
    public PrincipalPrivilegeSet getPrivileges() {
        return this.privileges;
    }

    public PartitionInput setSd(StorageDescriptor sd) {
        this.sd = sd;
        return this;
    }
    public StorageDescriptor getSd() {
        return this.sd;
    }

    public PartitionInput setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public PartitionInput setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
