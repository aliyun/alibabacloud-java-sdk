// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class OpenStructDLTableInput extends TeaModel {
    @NameInMap("CreateTime")
    public Integer createTime;

    @NameInMap("CreatorId")
    public Long creatorId;

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
    public java.util.Map<String, String> parameters;

    @NameInMap("PartitionKeys")
    public java.util.List<DLColumn> partitionKeys;

    @NameInMap("Retention")
    public Integer retention;

    @NameInMap("StorageDescriptor")
    public DLStorageDescriptor storageDescriptor;

    @NameInMap("TableType")
    public String tableType;

    @NameInMap("ViewExpandedText")
    public String viewExpandedText;

    @NameInMap("ViewOriginalText")
    public String viewOriginalText;

    public static OpenStructDLTableInput build(java.util.Map<String, ?> map) throws Exception {
        OpenStructDLTableInput self = new OpenStructDLTableInput();
        return TeaModel.build(map, self);
    }

    public OpenStructDLTableInput setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public OpenStructDLTableInput setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public OpenStructDLTableInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OpenStructDLTableInput setLastAccessTime(Integer lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    public OpenStructDLTableInput setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public OpenStructDLTableInput setModifierId(Long modifierId) {
        this.modifierId = modifierId;
        return this;
    }
    public Long getModifierId() {
        return this.modifierId;
    }

    public OpenStructDLTableInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenStructDLTableInput setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public OpenStructDLTableInput setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public OpenStructDLTableInput setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public OpenStructDLTableInput setPartitionKeys(java.util.List<DLColumn> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }
    public java.util.List<DLColumn> getPartitionKeys() {
        return this.partitionKeys;
    }

    public OpenStructDLTableInput setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public OpenStructDLTableInput setStorageDescriptor(DLStorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
        return this;
    }
    public DLStorageDescriptor getStorageDescriptor() {
        return this.storageDescriptor;
    }

    public OpenStructDLTableInput setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

    public OpenStructDLTableInput setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
        return this;
    }
    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    public OpenStructDLTableInput setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
        return this;
    }
    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

}
