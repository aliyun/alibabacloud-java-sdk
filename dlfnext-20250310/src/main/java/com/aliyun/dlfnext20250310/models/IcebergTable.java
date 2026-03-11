// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class IcebergTable extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1747120676378</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::1045689747920334:root</p>
     */
    @NameInMap("createdBy")
    public String createdBy;

    @NameInMap("icebergTableMetadata")
    public IcebergTableMetadata icebergTableMetadata;

    /**
     * <strong>example:</strong>
     * <p>tbl-424fc31c-4876-4df5-97a5-c78f3046e739</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>table1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::1045689747920334:root</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>oss://clg-iceberg-bcc387be9d24490da5f194bbaf990906/ns-b314a3c3-dff5-4e30-8ba2-0493a60566c7.db/iceberg-tbl-56539259-1879-4d6d-bd6e-d1ddb3364cc9</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("updatedAt")
    public Long updatedAt;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::1045689747920334:root</p>
     */
    @NameInMap("updatedBy")
    public String updatedBy;

    /**
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
