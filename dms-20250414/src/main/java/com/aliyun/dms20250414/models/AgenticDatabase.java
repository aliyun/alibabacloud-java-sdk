// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticDatabase extends TeaModel {
    /**
     * <p>The name of the catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>prod_mysql_order</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

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
     * <p>The UUID of the catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>mc-HZ-OfjcNc2z***</p>
     */
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    /**
     * <p>The business attributes of the database, returned as key-value pairs. Currently, this may include <strong>ENV_TYPE</strong>, which indicates the environment type of the database.</p>
     */
    @NameInMap("DatabaseBizAttrs")
    public java.util.Map<String, ?> databaseBizAttrs;

    /**
     * <p>The unique identifier of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>md-HZ-fp9K7r***</p>
     */
    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    /**
     * <p>The database type inherited from the catalog. The value is the uppercase name of the database type, such as MYSQL.</p>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The description of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>Order database</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The metadata of the database engine. This field is returned only for databases under a JDBC catalog.</p>
     */
    @NameInMap("EngineMeta")
    public AgenticDatabaseEngineMeta engineMeta;

    /**
     * <p>The name of the database. For databases that distinguish schemas, such as PostgreSQL, this is the schema name.</p>
     * 
     * <strong>example:</strong>
     * <p>order_db</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The extended properties of the database, returned as key-value pairs. This field is returned only for databases under a DataLake catalog.</p>
     */
    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    /**
     * <p>The fully qualified name of the database. For databases that distinguish schemas, such as PostgreSQL, the format is database name.schema name.</p>
     * 
     * <strong>example:</strong>
     * <p>order_db</p>
     */
    @NameInMap("QualifiedName")
    public String qualifiedName;

    /**
     * <p>The region ID of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The search name of the database. SearchAgenticDatabase matches search keywords against this name.</p>
     * 
     * <strong>example:</strong>
     * <p>order_db</p>
     */
    @NameInMap("SearchName")
    public String searchName;

    /**
     * <p>The status of the database. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: normal</li>
     * <li><strong>-1</strong>: deleted</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("State")
    public Integer state;

    /**
     * <p>The storage location. This field is returned only for databases under a DataLake catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://examplebucket/datalake/order_db/</p>
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

    public AgenticDatabase setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
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
