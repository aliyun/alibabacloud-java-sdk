// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticTableBaseInfo extends TeaModel {
    /**
     * <p>The type of the catalog to which the table belongs. Valid values:</p>
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
     * <p>The fully qualified name of the database to which the table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>order_db</p>
     */
    @NameInMap("DatabaseQualifiedName")
    public String databaseQualifiedName;

    /**
     * <p>The UUID of the database to which the table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>md-HZ-fp9K7r***</p>
     */
    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    /**
     * <p>The description of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>Order table</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The engine metadata of the table.</p>
     */
    @NameInMap("EngineMeta")
    public AgenticTableEngineMeta engineMeta;

    /**
     * <p>The table name.</p>
     * 
     * <strong>example:</strong>
     * <p>orders</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The fully qualified name of the table. You can use this name as the TableQualifiedName parameter for GetAgenticTableColumn and GetAgenticTableIndex. For SQL Server, the format is schema name.table name.</p>
     * 
     * <strong>example:</strong>
     * <p>orders</p>
     */
    @NameInMap("QualifiedName")
    public String qualifiedName;

    /**
     * <p>The table type. Valid values:</p>
     * <ul>
     * <li><strong>NORMAL</strong>: regular table</li>
     * <li><strong>VIEW</strong>: view</li>
     * <li><strong>FOREIGN</strong>: foreign table</li>
     * <li><strong>SYNONYM</strong>: synonym, supported only for Oracle data sources</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("TableType")
    public String tableType;

    public static AgenticTableBaseInfo build(java.util.Map<String, ?> map) throws Exception {
        AgenticTableBaseInfo self = new AgenticTableBaseInfo();
        return TeaModel.build(map, self);
    }

    public AgenticTableBaseInfo setCatalogType(String catalogType) {
        this.catalogType = catalogType;
        return this;
    }
    public String getCatalogType() {
        return this.catalogType;
    }

    public AgenticTableBaseInfo setDatabaseQualifiedName(String databaseQualifiedName) {
        this.databaseQualifiedName = databaseQualifiedName;
        return this;
    }
    public String getDatabaseQualifiedName() {
        return this.databaseQualifiedName;
    }

    public AgenticTableBaseInfo setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public AgenticTableBaseInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgenticTableBaseInfo setEngineMeta(AgenticTableEngineMeta engineMeta) {
        this.engineMeta = engineMeta;
        return this;
    }
    public AgenticTableEngineMeta getEngineMeta() {
        return this.engineMeta;
    }

    public AgenticTableBaseInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AgenticTableBaseInfo setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public AgenticTableBaseInfo setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

}
