// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metastore20241012.models;

import com.aliyun.tea.*;

public class CatalogInput extends TeaModel {
    @NameInMap("AuthorizationType")
    public String authorizationType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    @NameInMap("CatalogType")
    public String catalogType;

    @NameInMap("CatalogVpcConnectionInfo")
    public CatalogVpcConnectionInfo catalogVpcConnectionInfo;

    @NameInMap("Description")
    public String description;

    @NameInMap("JdbcEnabled")
    public Boolean jdbcEnabled;

    @NameInMap("LocationUri")
    public String locationUri;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("ThriftEnabled")
    public Boolean thriftEnabled;

    public static CatalogInput build(java.util.Map<String, ?> map) throws Exception {
        CatalogInput self = new CatalogInput();
        return TeaModel.build(map, self);
    }

    public CatalogInput setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    public CatalogInput setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public CatalogInput setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public CatalogInput setCatalogType(String catalogType) {
        this.catalogType = catalogType;
        return this;
    }
    public String getCatalogType() {
        return this.catalogType;
    }

    public CatalogInput setCatalogVpcConnectionInfo(CatalogVpcConnectionInfo catalogVpcConnectionInfo) {
        this.catalogVpcConnectionInfo = catalogVpcConnectionInfo;
        return this;
    }
    public CatalogVpcConnectionInfo getCatalogVpcConnectionInfo() {
        return this.catalogVpcConnectionInfo;
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

    public CatalogInput setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CatalogInput setThriftEnabled(Boolean thriftEnabled) {
        this.thriftEnabled = thriftEnabled;
        return this;
    }
    public Boolean getThriftEnabled() {
        return this.thriftEnabled;
    }

}
