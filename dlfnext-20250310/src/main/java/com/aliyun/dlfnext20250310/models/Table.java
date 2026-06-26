// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Table extends TeaModel {
    /**
     * <p>The time when the table was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1741266704867</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The user who created the table.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("createdBy")
    public String createdBy;

    @NameInMap("icebergTableMetadata")
    public IcebergTableMetadata icebergTableMetadata;

    /**
     * <p>The UUID of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>Indicates whether the table is an external table.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isExternal")
    public Boolean isExternal;

    /**
     * <p>The name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>table_test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The owner of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>The table URI.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://clg-paimon-xxx/db-xxx/tbl-xxxx</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>The table schema.</p>
     */
    @NameInMap("schema")
    public Schema schema;

    /**
     * <p>The ID of the schema.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("schemaId")
    public Long schemaId;

    /**
     * <p>The storage action.</p>
     */
    @NameInMap("storageAction")
    public String storageAction;

    /**
     * <p>The timestamp of the storage action.</p>
     */
    @NameInMap("storageActionTimestamp")
    public Long storageActionTimestamp;

    /**
     * <p>The storage class of the table.</p>
     */
    @NameInMap("storageClass")
    public String storageClass;

    @NameInMap("type")
    public String type;

    /**
     * <p>The time when the table was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>1741266704867</p>
     */
    @NameInMap("updatedAt")
    public Long updatedAt;

    /**
     * <p>The user who last updated the table.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("updatedBy")
    public String updatedBy;

    public static Table build(java.util.Map<String, ?> map) throws Exception {
        Table self = new Table();
        return TeaModel.build(map, self);
    }

    public Table setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Table setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public Table setIcebergTableMetadata(IcebergTableMetadata icebergTableMetadata) {
        this.icebergTableMetadata = icebergTableMetadata;
        return this;
    }
    public IcebergTableMetadata getIcebergTableMetadata() {
        return this.icebergTableMetadata;
    }

    public Table setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Table setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
        return this;
    }
    public Boolean getIsExternal() {
        return this.isExternal;
    }

    public Table setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Table setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public Table setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public Table setSchema(Schema schema) {
        this.schema = schema;
        return this;
    }
    public Schema getSchema() {
        return this.schema;
    }

    public Table setSchemaId(Long schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public Long getSchemaId() {
        return this.schemaId;
    }

    public Table setStorageAction(String storageAction) {
        this.storageAction = storageAction;
        return this;
    }
    public String getStorageAction() {
        return this.storageAction;
    }

    public Table setStorageActionTimestamp(Long storageActionTimestamp) {
        this.storageActionTimestamp = storageActionTimestamp;
        return this;
    }
    public Long getStorageActionTimestamp() {
        return this.storageActionTimestamp;
    }

    public Table setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public Table setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Table setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public Table setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

}
