// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DLTablebaseInfo extends TeaModel {
    /**
     * <p>The catalog to which the table belongs.</p>
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
     * <p>The ID of the user who created the table.</p>
     * 
     * <strong>example:</strong>
     * <p>141****</p>
     */
    @NameInMap("CreatorId")
    public Long creatorId;

    /**
     * <p>The ID of the database in which the table is stored.</p>
     * 
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("DbId")
    public Long dbId;

    /**
     * <p>The name of the database in which the table is stored.</p>
     * 
     * <strong>example:</strong>
     * <p>100g_customer</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The comment of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;table&quot;</p>
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
     * <p>The time when the table was modified.</p>
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
     * <p>test</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The type of the table owner. Valid values: USER, ROLE, and GROUP.</p>
     * 
     * <strong>example:</strong>
     * <p>ROLE</p>
     */
    @NameInMap("OwnerType")
    public String ownerType;

    /**
     * <p>Additional parameters for the table.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;EXTERNAL&quot;: &quot;TRUE&quot;</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The column attributes of the table.</p>
     */
    @NameInMap("PartitionKeys")
    public java.util.List<DLColumn> partitionKeys;

    /**
     * <p>The retention period of the table. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>30000</p>
     */
    @NameInMap("Retention")
    public Integer retention;

    /**
     * <p>The type of the table. Valid values: MANAGED_TABLE, EXTERNAL_TABLE, VIRTUAL_VIEW, INDEX_TABLE, and MATERIALIZED_VIEW.</p>
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
