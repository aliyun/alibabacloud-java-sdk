// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticDatabase extends TeaModel {
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
    public AgenticDatabaseEngineMeta engineMeta;

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

    public static AgenticDatabase build(java.util.Map<String, ?> map) throws Exception {
        AgenticDatabase self = new AgenticDatabase();
        return TeaModel.build(map, self);
    }

    public AgenticDatabase setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public AgenticDatabase setCatalogType(String catalogType) {
        this.catalogType = catalogType;
        return this;
    }
    public String getCatalogType() {
        return this.catalogType;
    }

    public AgenticDatabase setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public AgenticDatabase setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public AgenticDatabase setDatabaseBizAttrs(java.util.Map<String, ?> databaseBizAttrs) {
        this.databaseBizAttrs = databaseBizAttrs;
        return this;
    }
    public java.util.Map<String, ?> getDatabaseBizAttrs() {
        return this.databaseBizAttrs;
    }

    public AgenticDatabase setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public AgenticDatabase setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgenticDatabase setEngineMeta(AgenticDatabaseEngineMeta engineMeta) {
        this.engineMeta = engineMeta;
        return this;
    }
    public AgenticDatabaseEngineMeta getEngineMeta() {
        return this.engineMeta;
    }

    public AgenticDatabase setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AgenticDatabase setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public AgenticDatabase setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public AgenticDatabase setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AgenticDatabase setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

    public AgenticDatabase setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

    public AgenticDatabase setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

}
