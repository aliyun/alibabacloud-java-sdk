// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class TableInput extends TeaModel {
    @NameInMap("Cascade")
    public Boolean cascade;

    @NameInMap("CreateTime")
    public Integer createTime;

    @NameInMap("CreatedBy")
    public String createdBy;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("LastAccessTime")
    public Integer lastAccessTime;

    @NameInMap("LastAnalyzedTime")
    public Integer lastAnalyzedTime;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("OwnerType")
    public String ownerType;

    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    @NameInMap("PartitionKeys")
    public java.util.List<FieldSchema> partitionKeys;

    @NameInMap("Privileges")
    public PrincipalPrivilegeSet privileges;

    @NameInMap("Retention")
    public Integer retention;

    @NameInMap("RewriteEnabled")
    public Boolean rewriteEnabled;

    @NameInMap("Sd")
    public StorageDescriptor sd;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("TableType")
    public String tableType;

    @NameInMap("Temporary")
    public Boolean temporary;

    @NameInMap("ViewExpandedText")
    public String viewExpandedText;

    @NameInMap("ViewOriginalText")
    public String viewOriginalText;

    public static TableInput build(java.util.Map<String, ?> map) throws Exception {
        TableInput self = new TableInput();
        return TeaModel.build(map, self);
    }

    public TableInput setCascade(Boolean cascade) {
        this.cascade = cascade;
        return this;
    }
    public Boolean getCascade() {
        return this.cascade;
    }

    public TableInput setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public TableInput setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public TableInput setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public TableInput setLastAccessTime(Integer lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    public TableInput setLastAnalyzedTime(Integer lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
        return this;
    }
    public Integer getLastAnalyzedTime() {
        return this.lastAnalyzedTime;
    }

    public TableInput setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public TableInput setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public TableInput setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public TableInput setPartitionKeys(java.util.List<FieldSchema> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }
    public java.util.List<FieldSchema> getPartitionKeys() {
        return this.partitionKeys;
    }

    public TableInput setPrivileges(PrincipalPrivilegeSet privileges) {
        this.privileges = privileges;
        return this;
    }
    public PrincipalPrivilegeSet getPrivileges() {
        return this.privileges;
    }

    public TableInput setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public TableInput setRewriteEnabled(Boolean rewriteEnabled) {
        this.rewriteEnabled = rewriteEnabled;
        return this;
    }
    public Boolean getRewriteEnabled() {
        return this.rewriteEnabled;
    }

    public TableInput setSd(StorageDescriptor sd) {
        this.sd = sd;
        return this;
    }
    public StorageDescriptor getSd() {
        return this.sd;
    }

    public TableInput setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public TableInput setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

    public TableInput setTemporary(Boolean temporary) {
        this.temporary = temporary;
        return this;
    }
    public Boolean getTemporary() {
        return this.temporary;
    }

    public TableInput setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
        return this;
    }
    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    public TableInput setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
        return this;
    }
    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

}
