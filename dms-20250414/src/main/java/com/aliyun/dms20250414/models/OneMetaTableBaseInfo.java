// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OneMetaTableBaseInfo extends TeaModel {
    @NameInMap("CatalogType")
    public String catalogType;

    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    @NameInMap("Description")
    public String description;

    @NameInMap("EngineMeta")
    public OneMetaTableEngineMeta engineMeta;

    @NameInMap("Name")
    public String name;

    @NameInMap("QualifiedName")
    public String qualifiedName;

    @NameInMap("TableType")
    public String tableType;

    @NameInMap("TableUuid")
    public String tableUuid;

    public static OneMetaTableBaseInfo build(java.util.Map<String, ?> map) throws Exception {
        OneMetaTableBaseInfo self = new OneMetaTableBaseInfo();
        return TeaModel.build(map, self);
    }

    public OneMetaTableBaseInfo setCatalogType(String catalogType) {
        this.catalogType = catalogType;
        return this;
    }
    public String getCatalogType() {
        return this.catalogType;
    }

    public OneMetaTableBaseInfo setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public OneMetaTableBaseInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OneMetaTableBaseInfo setEngineMeta(OneMetaTableEngineMeta engineMeta) {
        this.engineMeta = engineMeta;
        return this;
    }
    public OneMetaTableEngineMeta getEngineMeta() {
        return this.engineMeta;
    }

    public OneMetaTableBaseInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OneMetaTableBaseInfo setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public OneMetaTableBaseInfo setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

    public OneMetaTableBaseInfo setTableUuid(String tableUuid) {
        this.tableUuid = tableUuid;
        return this;
    }
    public String getTableUuid() {
        return this.tableUuid;
    }

}
