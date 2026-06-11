// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DLTable extends TeaModel {
    /**
     * <p>The name of the data catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The time when the table was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1731586286</p>
     */
    @NameInMap("CreateTime")
    public Integer createTime;

    /**
     * <p>The ID of the table creator.</p>
     * 
     * <strong>example:</strong>
     * <p>8****</p>
     */
    @NameInMap("CreatorId")
    public Long creatorId;

    /**
     * <p>The ID of the database to which the table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("DbId")
    public Long dbId;

    /**
     * <p>The name of the database to which the table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DbName")
    public String dbName;

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
     * <p>The name of the table owner.</p>
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
     * <p>The key-value pairs of the parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;EXTERNAL&quot;: &quot;TRUE&quot;,
     *       &quot;delta.minReaderVersion&quot;: &quot;1&quot;}</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The list of partition keys.</p>
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
     * <p>The storage description, including the storage features and format details of the table.</p>
     */
    @NameInMap("StorageDescriptor")
    public DLStorageDescriptor storageDescriptor;

    /**
     * <p>The type of the metadata table, such as MANAGED_TABLE, EXTERNAL_TABLE, VIRTUAL_VIEW, INDEX_TABLE, or MATERIALIZED_VIEW.</p>
     * 
     * <strong>example:</strong>
     * <p>EXTERNAL_TABLE</p>
     */
    @NameInMap("TableType")
    public String tableType;

    /**
     * <p>The expanded text of the view if the table is a view.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ViewExpandedText")
    public String viewExpandedText;

    /**
     * <p>The original text of the view if the table is a view.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ViewOriginalText")
    public String viewOriginalText;

    public static DLTable build(java.util.Map<String, ?> map) throws Exception {
        DLTable self = new DLTable();
        return TeaModel.build(map, self);
    }

    public DLTable setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public DLTable setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public DLTable setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public DLTable setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public DLTable setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DLTable setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DLTable setLastAccessTime(Integer lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    public DLTable setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DLTable setModifierId(Long modifierId) {
        this.modifierId = modifierId;
        return this;
    }
    public Long getModifierId() {
        return this.modifierId;
    }

    public DLTable setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DLTable setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public DLTable setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public DLTable setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public DLTable setPartitionKeys(java.util.List<DLColumn> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }
    public java.util.List<DLColumn> getPartitionKeys() {
        return this.partitionKeys;
    }

    public DLTable setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public DLTable setStorageDescriptor(DLStorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
        return this;
    }
    public DLStorageDescriptor getStorageDescriptor() {
        return this.storageDescriptor;
    }

    public DLTable setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

    public DLTable setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
        return this;
    }
    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    public DLTable setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
        return this;
    }
    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

}
