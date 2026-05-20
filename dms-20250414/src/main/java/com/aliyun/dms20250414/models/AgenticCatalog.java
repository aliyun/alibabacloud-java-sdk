// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticCatalog extends TeaModel {
    @NameInMap("CatalogBizAttrs")
    public java.util.Map<String, ?> catalogBizAttrs;

    @NameInMap("CatalogType")
    public String catalogType;

    @NameInMap("CatalogUuid")
    public String catalogUuid;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("DataSourceUuid")
    public String dataSourceUuid;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("State")
    public Integer state;

    @NameInMap("StorageLocation")
    public String storageLocation;

    public static AgenticCatalog build(java.util.Map<String, ?> map) throws Exception {
        AgenticCatalog self = new AgenticCatalog();
        return TeaModel.build(map, self);
    }

    public AgenticCatalog setCatalogBizAttrs(java.util.Map<String, ?> catalogBizAttrs) {
        this.catalogBizAttrs = catalogBizAttrs;
        return this;
    }
    public java.util.Map<String, ?> getCatalogBizAttrs() {
        return this.catalogBizAttrs;
    }

    public AgenticCatalog setCatalogType(String catalogType) {
        this.catalogType = catalogType;
        return this;
    }
    public String getCatalogType() {
        return this.catalogType;
    }

    public AgenticCatalog setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public AgenticCatalog setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public AgenticCatalog setDataSourceUuid(String dataSourceUuid) {
        this.dataSourceUuid = dataSourceUuid;
        return this;
    }
    public String getDataSourceUuid() {
        return this.dataSourceUuid;
    }

    public AgenticCatalog setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgenticCatalog setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AgenticCatalog setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public AgenticCatalog setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AgenticCatalog setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

    public AgenticCatalog setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

}
