// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DLTablebaseInfo extends TeaModel {
    @NameInMap("CatalogName")
    public String catalogName;

    @NameInMap("CreateTime")
    public Integer createTime;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("DbId")
    public Long dbId;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("Description")
    public String description;

    @NameInMap("LastAccessTime")
    public Integer lastAccessTime;

    @NameInMap("Location")
    public String location;

    @NameInMap("ModifierId")
    public Long modifierId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("OwnerType")
    public String ownerType;

    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    @NameInMap("PartitionKeys")
    public java.util.List<DLColumn> partitionKeys;

    @NameInMap("Retention")
    public Integer retention;

    @NameInMap("TableType")
    public String tableType;

    @NameInMap("ViewExpandedText")
    public String viewExpandedText;

    @NameInMap("ViewOriginalText")
    public String viewOriginalText;

    public static DLTablebaseInfo build(java.util.Map<String, ?> map) throws Exception {
        DLTablebaseInfo self = new DLTablebaseInfo();
        return TeaModel.build(map, self);
    }

    public DLTablebaseInfo setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public DLTablebaseInfo setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public DLTablebaseInfo setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public DLTablebaseInfo setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public DLTablebaseInfo setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DLTablebaseInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DLTablebaseInfo setLastAccessTime(Integer lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    public DLTablebaseInfo setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DLTablebaseInfo setModifierId(Long modifierId) {
        this.modifierId = modifierId;
        return this;
    }
    public Long getModifierId() {
        return this.modifierId;
    }

    public DLTablebaseInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DLTablebaseInfo setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public DLTablebaseInfo setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public DLTablebaseInfo setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public DLTablebaseInfo setPartitionKeys(java.util.List<DLColumn> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }
    public java.util.List<DLColumn> getPartitionKeys() {
        return this.partitionKeys;
    }

    public DLTablebaseInfo setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public DLTablebaseInfo setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

    public DLTablebaseInfo setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
        return this;
    }
    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    public DLTablebaseInfo setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
        return this;
    }
    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

}
