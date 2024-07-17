// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CatalogInput extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("CatalogType")
    public String catalogType;

    @NameInMap("Description")
    public String description;

    @NameInMap("JdbcEnabled")
    public Boolean jdbcEnabled;

    @NameInMap("LocationUri")
    public String locationUri;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("StorageAccessConfig")
    public String storageAccessConfig;

    @NameInMap("ThriftEnabled")
    public Boolean thriftEnabled;

    public static CatalogInput build(java.util.Map<String, ?> map) throws Exception {
        CatalogInput self = new CatalogInput();
        return TeaModel.build(map, self);
    }

    public CatalogInput setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public CatalogInput setCatalogType(String catalogType) {
        this.catalogType = catalogType;
        return this;
    }
    public String getCatalogType() {
        return this.catalogType;
    }

    public CatalogInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CatalogInput setJdbcEnabled(Boolean jdbcEnabled) {
        this.jdbcEnabled = jdbcEnabled;
        return this;
    }
    public Boolean getJdbcEnabled() {
        return this.jdbcEnabled;
    }

    public CatalogInput setLocationUri(String locationUri) {
        this.locationUri = locationUri;
        return this;
    }
    public String getLocationUri() {
        return this.locationUri;
    }

    public CatalogInput setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CatalogInput setStorageAccessConfig(String storageAccessConfig) {
        this.storageAccessConfig = storageAccessConfig;
        return this;
    }
    public String getStorageAccessConfig() {
        return this.storageAccessConfig;
    }

    public CatalogInput setThriftEnabled(Boolean thriftEnabled) {
        this.thriftEnabled = thriftEnabled;
        return this;
    }
    public Boolean getThriftEnabled() {
        return this.thriftEnabled;
    }

}
