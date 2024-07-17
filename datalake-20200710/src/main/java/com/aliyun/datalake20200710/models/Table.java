// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class Table extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>59c6c8fefeaa46d8b599c1f790c59a19</p>
     */
    @NameInMap("TableId")
    public String tableId;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("TableType")
    public String tableType;

    @NameInMap("TableVersion")
    public TableVersion tableVersion;

    @NameInMap("Temporary")
    public Boolean temporary;

    @NameInMap("UpdateTime")
    public Integer updateTime;

    @NameInMap("ViewExpandedText")
    public String viewExpandedText;

    @NameInMap("ViewOriginalText")
    public String viewOriginalText;

    public static Table build(java.util.Map<String, ?> map) throws Exception {
        Table self = new Table();
        return TeaModel.build(map, self);
    }

    public Table setCascade(Boolean cascade) {
        this.cascade = cascade;
        return this;
    }
    public Boolean getCascade() {
        return this.cascade;
    }

    public Table setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public Table setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public Table setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public Table setLastAccessTime(Integer lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    public Table setLastAnalyzedTime(Integer lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
        return this;
    }
    public Integer getLastAnalyzedTime() {
        return this.lastAnalyzedTime;
    }

    public Table setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public Table setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public Table setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public Table setPartitionKeys(java.util.List<FieldSchema> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }
    public java.util.List<FieldSchema> getPartitionKeys() {
        return this.partitionKeys;
    }

    public Table setPrivileges(PrincipalPrivilegeSet privileges) {
        this.privileges = privileges;
        return this;
    }
    public PrincipalPrivilegeSet getPrivileges() {
        return this.privileges;
    }

    public Table setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public Table setRewriteEnabled(Boolean rewriteEnabled) {
        this.rewriteEnabled = rewriteEnabled;
        return this;
    }
    public Boolean getRewriteEnabled() {
        return this.rewriteEnabled;
    }

    public Table setSd(StorageDescriptor sd) {
        this.sd = sd;
        return this;
    }
    public StorageDescriptor getSd() {
        return this.sd;
    }

    public Table setTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }
    public String getTableId() {
        return this.tableId;
    }

    public Table setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public Table setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

    public Table setTableVersion(TableVersion tableVersion) {
        this.tableVersion = tableVersion;
        return this;
    }
    public TableVersion getTableVersion() {
        return this.tableVersion;
    }

    public Table setTemporary(Boolean temporary) {
        this.temporary = temporary;
        return this;
    }
    public Boolean getTemporary() {
        return this.temporary;
    }

    public Table setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Integer getUpdateTime() {
        return this.updateTime;
    }

    public Table setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
        return this;
    }
    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    public Table setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
        return this;
    }
    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

}
