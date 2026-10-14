// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OneMetaDatabase extends TeaModel {
    @NameInMap("CatalogName")
    public String catalogName;

    @NameInMap("CatalogType")
    public String catalogType;

    @NameInMap("CatalogUuid")
    public String catalogUuid;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("DatabaseBizAttrs")
    public java.util.Map<String, ?> databaseBizAttrs;

    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    @NameInMap("Description")
    public String description;

    @NameInMap("EngineMeta")
    public OneMetaDatabaseEngineMeta engineMeta;

    @NameInMap("Name")
    public String name;

    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    @NameInMap("QualifiedName")
    public String qualifiedName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SearchName")
    public String searchName;

    @NameInMap("State")
    public Integer state;

    @NameInMap("StorageLocation")
    public String storageLocation;

    public static OneMetaDatabase build(java.util.Map<String, ?> map) throws Exception {
        OneMetaDatabase self = new OneMetaDatabase();
        return TeaModel.build(map, self);
    }

    public OneMetaDatabase setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public OneMetaDatabase setCatalogType(String catalogType) {
        this.catalogType = catalogType;
        return this;
    }
    public String getCatalogType() {
        return this.catalogType;
    }

    public OneMetaDatabase setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public OneMetaDatabase setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public OneMetaDatabase setDatabaseBizAttrs(java.util.Map<String, ?> databaseBizAttrs) {
        this.databaseBizAttrs = databaseBizAttrs;
        return this;
    }
    public java.util.Map<String, ?> getDatabaseBizAttrs() {
        return this.databaseBizAttrs;
    }

    public OneMetaDatabase setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public OneMetaDatabase setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OneMetaDatabase setEngineMeta(OneMetaDatabaseEngineMeta engineMeta) {
        this.engineMeta = engineMeta;
        return this;
    }
    public OneMetaDatabaseEngineMeta getEngineMeta() {
        return this.engineMeta;
    }

    public OneMetaDatabase setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OneMetaDatabase setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public OneMetaDatabase setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public OneMetaDatabase setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public OneMetaDatabase setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

    public OneMetaDatabase setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

    public OneMetaDatabase setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

}
