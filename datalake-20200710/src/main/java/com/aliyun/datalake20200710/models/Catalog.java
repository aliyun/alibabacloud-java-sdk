// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class Catalog extends TeaModel {
    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("CatalogType")
    public String catalogType;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("CreatedBy")
    public String createdBy;

    @NameInMap("DefaultCatalog")
    public Boolean defaultCatalog;

    @NameInMap("Description")
    public String description;

    @NameInMap("JdbcEnabled")
    public Boolean jdbcEnabled;

    @NameInMap("LocationUri")
    public String locationUri;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("Status")
    public String status;

    @NameInMap("StorageAccessConfig")
    public String storageAccessConfig;

    @NameInMap("ThriftEnabled")
    public Boolean thriftEnabled;

    @NameInMap("UpdateTime")
    public Long updateTime;

    public static Catalog build(java.util.Map<String, ?> map) throws Exception {
        Catalog self = new Catalog();
        return TeaModel.build(map, self);
    }

    public Catalog setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public Catalog setCatalogType(String catalogType) {
        this.catalogType = catalogType;
        return this;
    }
    public String getCatalogType() {
        return this.catalogType;
    }

    public Catalog setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Catalog setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public Catalog setDefaultCatalog(Boolean defaultCatalog) {
        this.defaultCatalog = defaultCatalog;
        return this;
    }
    public Boolean getDefaultCatalog() {
        return this.defaultCatalog;
    }

    public Catalog setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Catalog setJdbcEnabled(Boolean jdbcEnabled) {
        this.jdbcEnabled = jdbcEnabled;
        return this;
    }
    public Boolean getJdbcEnabled() {
        return this.jdbcEnabled;
    }

    public Catalog setLocationUri(String locationUri) {
        this.locationUri = locationUri;
        return this;
    }
    public String getLocationUri() {
        return this.locationUri;
    }

    public Catalog setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public Catalog setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Catalog setStorageAccessConfig(String storageAccessConfig) {
        this.storageAccessConfig = storageAccessConfig;
        return this;
    }
    public String getStorageAccessConfig() {
        return this.storageAccessConfig;
    }

    public Catalog setThriftEnabled(Boolean thriftEnabled) {
        this.thriftEnabled = thriftEnabled;
        return this;
    }
    public Boolean getThriftEnabled() {
        return this.thriftEnabled;
    }

    public Catalog setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
