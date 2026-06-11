// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DLTableInput extends TeaModel {
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
     * <p>8****</p>
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
     * <p>The user who last modified the table.</p>
     * 
     * <strong>example:</strong>
     * <p>1410769</p>
     */
    @NameInMap("ModifierId")
    public Long modifierId;

    /**
     * <p>The name of the table.</p>
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
     * <p>The key-value pair parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    /**
     * <p>The list of attribute columns for the table.</p>
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
     * <p>The storage description. This includes the storage features and format details of the table.</p>
     */
    @NameInMap("StorageDescriptor")
    public DLStorageDescriptor storageDescriptor;

    /**
     * <p>The type of the metadata table. Examples: MANAGED_TABLE, EXTERNAL_TABLE, VIRTUAL_VIEW, INDEX_TABLE, and MATERIALIZED_VIEW.</p>
     * 
     * <strong>example:</strong>
     * <p>EXTERNAL_TABLE</p>
     */
    @NameInMap("TableType")
    public String tableType;

    /**
     * <p>If the table is a view, this parameter indicates the expanded text of the view.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ViewExpandedText")
    public String viewExpandedText;

    /**
     * <p>If the table is a view, this parameter indicates the original text of the view.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ViewOriginalText")
    public String viewOriginalText;

    public static DLTableInput build(java.util.Map<String, ?> map) throws Exception {
        DLTableInput self = new DLTableInput();
        return TeaModel.build(map, self);
    }

    public DLTableInput setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public DLTableInput setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public DLTableInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DLTableInput setLastAccessTime(Integer lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    public DLTableInput setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DLTableInput setModifierId(Long modifierId) {
        this.modifierId = modifierId;
        return this;
    }
    public Long getModifierId() {
        return this.modifierId;
    }

    public DLTableInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DLTableInput setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public DLTableInput setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public DLTableInput setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public DLTableInput setPartitionKeys(java.util.List<DLColumn> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }
    public java.util.List<DLColumn> getPartitionKeys() {
        return this.partitionKeys;
    }

    public DLTableInput setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public DLTableInput setStorageDescriptor(DLStorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
        return this;
    }
    public DLStorageDescriptor getStorageDescriptor() {
        return this.storageDescriptor;
    }

    public DLTableInput setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

    public DLTableInput setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
        return this;
    }
    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    public DLTableInput setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
        return this;
    }
    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

}
