// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class IcebergTable extends TeaModel {
    /**
     * <p>The table creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1747120676378</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The table creator.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("createdBy")
    public String createdBy;

    /**
     * <p>The metadata of the table.</p>
     */
    @NameInMap("icebergTableMetadata")
    public IcebergTableMetadata icebergTableMetadata;

    /**
     * <p>The table UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>tbl-xxxx</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The table name.</p>
     * 
     * <strong>example:</strong>
     * <p>table1</p>
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
     * <p>oss://clg-iceberg-xxxx/ns-xxxx/table-xxxx</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>The time when the table was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>1744970111419</p>
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

    /**
     * <p>The version of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("version")
    public Long version;

    public static IcebergTable build(java.util.Map<String, ?> map) throws Exception {
        IcebergTable self = new IcebergTable();
        return TeaModel.build(map, self);
    }

    public IcebergTable setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public IcebergTable setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public IcebergTable setIcebergTableMetadata(IcebergTableMetadata icebergTableMetadata) {
        this.icebergTableMetadata = icebergTableMetadata;
        return this;
    }
    public IcebergTableMetadata getIcebergTableMetadata() {
        return this.icebergTableMetadata;
    }

    public IcebergTable setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public IcebergTable setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IcebergTable setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public IcebergTable setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public IcebergTable setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public IcebergTable setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public IcebergTable setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
