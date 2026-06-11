// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticCatalog extends TeaModel {
    /**
     * <p>A collection of key-value pairs that represents business attributes for the catalog, such as the data owner or department.</p>
     */
    @NameInMap("CatalogBizAttrs")
    public java.util.Map<String, ?> catalogBizAttrs;

    /**
     * <p>The type of the catalog. For example, <code>INTERNAL_METADATA</code> or <code>THIRD_PARTY</code>.</p>
     */
    @NameInMap("CatalogType")
    public String catalogType;

    /**
     * <p>The unique identifier (UUID) of the catalog. This parameter is system-generated and output-only.</p>
     */
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    /**
     * <p>The type of the data source associated with the catalog. For example, <code>MySQL</code>, <code>PostgreSQL</code>, or <code>OSS</code>.</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The unique identifier (UUID) of the associated data source.</p>
     */
    @NameInMap("DataSourceUuid")
    public String dataSourceUuid;

    /**
     * <p>The description of the catalog. It can be up to 2,048 characters long.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the catalog. The name can be up to 256 characters long.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>A collection of key-value pairs that represents additional technical properties for the catalog.</p>
     */
    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    /**
     * <p>The ID of the region where the catalog is located. For example, <code>cn-hangzhou</code>.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The current state of the catalog. Valid values are: <code>0</code> (Creating), <code>1</code> (Active), <code>2</code> (Deleting), and <code>3</code> (Error).</p>
     */
    @NameInMap("State")
    public Integer state;

    /**
     * <p>The storage location for the catalog\&quot;s metadata, such as a database name or a file path.</p>
     */
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
