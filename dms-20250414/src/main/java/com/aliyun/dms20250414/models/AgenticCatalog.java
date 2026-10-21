// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticCatalog extends TeaModel {
    /**
     * <p>The business attributes of the catalog, returned as key-value pairs. The following keys may be included:</p>
     * <ul>
     * <li><strong>ALIAS</strong>: the alias of the data source</li>
     * <li><strong>HOST</strong>: the endpoint of the data source</li>
     * <li><strong>PORT</strong>: the connection port of the data source</li>
     * <li><strong>ENV_TYPE</strong>: the environment type of the data source</li>
     * <li><strong>VERSION</strong>: the database version of the data source</li>
     * <li><strong>SYNC_ALIAS</strong>: whether automatic synchronization of instance aliases is enabled</li>
     * </ul>
     */
    @NameInMap("CatalogBizAttrs")
    public java.util.Map<String, ?> catalogBizAttrs;

    /**
     * <p>The type of the catalog. Valid values:</p>
     * <ul>
     * <li><strong>JDBC</strong>: relational database catalog</li>
     * <li><strong>DataLake</strong>: data lake catalog</li>
     * <li><strong>Dataset</strong>: knowledge base catalog</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>JDBC</p>
     */
    @NameInMap("CatalogType")
    public String catalogType;

    /**
     * <p>The unique identifier of the catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>mc-HZ-OfjcNc2z***</p>
     */
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    /**
     * <p>The unique identifier of the data source associated with the catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-HZ-Xk2Pq9Lm***</p>
     */
    @NameInMap("DataSourceUuid")
    public String dataSourceUuid;

    /**
     * <p>The database type of the data source associated with the catalog. The value is the uppercase name of the database type, such as MYSQL.</p>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The description of the catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>Order production database</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>prod_mysql_order</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The extended properties of the catalog, returned as key-value pairs.</p>
     */
    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    /**
     * <p>The region ID of the data source associated with the catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The status of the catalog. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Normal. This value is set when the data source is created.</li>
     * <li><strong>-1</strong>: Deleted. This value is set when the data source is deleted.</li>
     * </ul>
     * <p>Disabling a data source does not change the status of the catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("State")
    public Integer state;

    /**
     * <p>The storage location. This property is returned only for catalogs of the DataLake type.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://examplebucket/datalake/</p>
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

    public AgenticCatalog setDataSourceUuid(String dataSourceUuid) {
        this.dataSourceUuid = dataSourceUuid;
        return this;
    }
    public String getDataSourceUuid() {
        return this.dataSourceUuid;
    }

    public AgenticCatalog setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
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
