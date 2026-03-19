// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class OpenStructDLTableInput extends TeaModel {
    /**
     * <p>The time when the table was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1731586286</p>
     */
    @NameInMap("CreateTime")
    public Integer createTime;

    /**
     * <p>The ID of the user who created the table.</p>
     * 
     * <strong>example:</strong>
     * <p>8***</p>
     */
    @NameInMap("CreatorId")
    public Long creatorId;

    /**
     * <p>The description of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time when the table was last accessed.</p>
     * 
     * <strong>example:</strong>
     * <p>1608707407</p>
     */
    @NameInMap("LastAccessTime")
    public Integer lastAccessTime;

    /**
     * <p>The storage path of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://xxx</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>The ID of the user who last modified the table.</p>
     * 
     * <strong>example:</strong>
     * <p>1410769</p>
     */
    @NameInMap("ModifierId")
    public Long modifierId;

    /**
     * <p>The table name.</p>
     * 
     * <strong>example:</strong>
     * <p>100g_customer</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The owner of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The type of the owner. Valid values: USER, ROLE, and GROUP.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("OwnerType")
    public String ownerType;

    /**
     * <p>The key-value pairs.</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    /**
     * <p>The column attributes of the table.</p>
     */
    @NameInMap("PartitionKeys")
    public java.util.List<DLColumn> partitionKeys;

    /**
     * <p>The retention period of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Retention")
    public Integer retention;

    /**
     * <p>The description of data storage, including the storage characteristics and format of the table.</p>
     */
    @NameInMap("StorageDescriptor")
    public DLStorageDescriptor storageDescriptor;

    /**
     * <p>The type of the metadata table. Valid values: MANAGED_TABLE, EXTERNAL_TABLE, VIRTUAL_VIEW, INDEX_TABLE, and MATERIALIZED_VIEW.</p>
     * 
     * <strong>example:</strong>
     * <p>EXTERNAL_TABLE</p>
     */
    @NameInMap("TableType")
    public String tableType;

    /**
     * <p>The expanded text of the view if the table type is view.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ViewExpandedText")
    public String viewExpandedText;

    /**
     * <p>The original text of the view if the table type is view.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
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
