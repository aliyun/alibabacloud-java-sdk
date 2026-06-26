// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Catalog extends TeaModel {
    /**
     * <p>The time when the catalog was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The user who created the catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("createdBy")
    public String createdBy;

    /**
     * <p>The ID of the catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>clg-paimon-xxxx</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>Whether the data catalog is shared.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isShared")
    public Boolean isShared;

    /**
     * <p>The name of the catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>test_catalog</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The extension options.</p>
     */
    @NameInMap("options")
    public java.util.Map<String, String> options;

    /**
     * <p>The catalog owner.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>Share ID.</p>
     * 
     * <strong>example:</strong>
     * <p>share-xxxx</p>
     */
    @NameInMap("shareId")
    public String shareId;

    /**
     * <p>The status of the catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>NEW
     * INITIALIZING
     * INITIALIZE_FAILED
     * RUNNING
     * TERMINATED
     * DELETING
     * DELETE_FAILED 
     * DELETED
     * STORAGE_RESTRICTED</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>Type.</p>
     * 
     * <strong>example:</strong>
     * <p>PAIMON</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The time when the catalog was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("updatedAt")
    public Long updatedAt;

    /**
     * <p>The user who last modified the catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("updatedBy")
    public String updatedBy;

    public static Catalog build(java.util.Map<String, ?> map) throws Exception {
        Catalog self = new Catalog();
        return TeaModel.build(map, self);
    }

    public Catalog setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Catalog setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public Catalog setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Catalog setIsShared(Boolean isShared) {
        this.isShared = isShared;
        return this;
    }
    public Boolean getIsShared() {
        return this.isShared;
    }

    public Catalog setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Catalog setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public Catalog setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public Catalog setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public Catalog setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Catalog setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Catalog setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public Catalog setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

}
