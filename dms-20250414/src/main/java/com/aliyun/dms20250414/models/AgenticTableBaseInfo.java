// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticTableBaseInfo extends TeaModel {
    @NameInMap("CatalogType")
    public String catalogType;

    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    @NameInMap("Description")
    public String description;

    @NameInMap("EngineMeta")
    public AgenticTableEngineMeta engineMeta;

    @NameInMap("Name")
    public String name;

    @NameInMap("QualifiedName")
    public String qualifiedName;

    @NameInMap("TableType")
    public String tableType;

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
