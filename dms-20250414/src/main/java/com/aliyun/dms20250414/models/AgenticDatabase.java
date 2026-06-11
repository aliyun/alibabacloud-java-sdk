// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticDatabase extends TeaModel {
    /**
     * <p>The name of the catalog.</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The type of the catalog.</p>
     */
    @NameInMap("CatalogType")
    public String catalogType;

    /**
     * <p>The unique identifier of the catalog.</p>
     */
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    /**
     * <p>The data source type, such as <code>MySQL</code> or <code>PostgreSQL</code>.</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The database\&quot;s business attributes.</p>
     */
    @NameInMap("DatabaseBizAttrs")
    public java.util.Map<String, ?> databaseBizAttrs;

    /**
     * <p>The unique identifier of the database.</p>
     */
    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    /**
     * <p>The database description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The metadata for the database engine.</p>
     */
    @NameInMap("EngineMeta")
    public AgenticDatabaseEngineMeta engineMeta;

    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The database\&quot;s extended properties.</p>
     */
    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    /**
     * <p>The fully qualified name of the database.</p>
     */
    @NameInMap("QualifiedName")
    public String qualifiedName;

    /**
     * <p>The region ID of the database.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name used to search the database.</p>
     */
    @NameInMap("SearchName")
    public String searchName;

    /**
     * <p>The database state.</p>
     */
    @NameInMap("State")
    public Integer state;

    /**
     * <p>The database storage location.</p>
     */
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
