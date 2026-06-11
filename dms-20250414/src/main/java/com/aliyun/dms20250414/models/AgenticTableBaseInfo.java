// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticTableBaseInfo extends TeaModel {
    /**
     * <p>The catalog type.</p>
     */
    @NameInMap("CatalogType")
    public String catalogType;

    /**
     * <p>The database\&quot;s unique identifier.</p>
     */
    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    /**
     * <p>The table description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The engine metadata.</p>
     */
    @NameInMap("EngineMeta")
    public AgenticTableEngineMeta engineMeta;

    /**
     * <p>The table name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The table\&quot;s qualified name.</p>
     */
    @NameInMap("QualifiedName")
    public String qualifiedName;

    /**
     * <p>The table type.</p>
     */
    @NameInMap("TableType")
    public String tableType;

    /**
     * <p>The table\&quot;s unique identifier.</p>
     */
    @NameInMap("TableUuid")
    public String tableUuid;

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

    public AgenticTableBaseInfo setTableUuid(String tableUuid) {
        this.tableUuid = tableUuid;
        return this;
    }
    public String getTableUuid() {
        return this.tableUuid;
    }

}
