// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticKnowledgeView extends TeaModel {
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    @NameInMap("ColumnName")
    public String columnName;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    @NameInMap("Description")
    public String description;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("Extra")
    public java.util.Map<String, ?> extra;

    @NameInMap("KnowledgeUuid")
    public String knowledgeUuid;

    @NameInMap("Level")
    public String level;

    @NameInMap("Locked")
    public Boolean locked;

    @NameInMap("LockedBy")
    public String lockedBy;

    @NameInMap("LockedTime")
    public Long lockedTime;

    @NameInMap("ModifyTime")
    public Long modifyTime;

    @NameInMap("QualifiedName")
    public String qualifiedName;

    @NameInMap("Source")
    public String source;

    @NameInMap("Summary")
    public String summary;

    @NameInMap("Title")
    public String title;

    @NameInMap("UnitCatalogUuid")
    public String unitCatalogUuid;

    @NameInMap("UnitDatabaseUuid")
    public String unitDatabaseUuid;

    @NameInMap("Version")
    public String version;

    public static AgenticKnowledgeView build(java.util.Map<String, ?> map) throws Exception {
        AgenticKnowledgeView self = new AgenticKnowledgeView();
        return TeaModel.build(map, self);
    }

    public AgenticKnowledgeView setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public AgenticKnowledgeView setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public AgenticKnowledgeView setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public AgenticKnowledgeView setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public AgenticKnowledgeView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgenticKnowledgeView setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public AgenticKnowledgeView setExtra(java.util.Map<String, ?> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    public AgenticKnowledgeView setKnowledgeUuid(String knowledgeUuid) {
        this.knowledgeUuid = knowledgeUuid;
        return this;
    }
    public String getKnowledgeUuid() {
        return this.knowledgeUuid;
    }

    public AgenticKnowledgeView setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public AgenticKnowledgeView setLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }
    public Boolean getLocked() {
        return this.locked;
    }

    public AgenticKnowledgeView setLockedBy(String lockedBy) {
        this.lockedBy = lockedBy;
        return this;
    }
    public String getLockedBy() {
        return this.lockedBy;
    }

    public AgenticKnowledgeView setLockedTime(Long lockedTime) {
        this.lockedTime = lockedTime;
        return this;
    }
    public Long getLockedTime() {
        return this.lockedTime;
    }

    public AgenticKnowledgeView setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public AgenticKnowledgeView setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public AgenticKnowledgeView setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AgenticKnowledgeView setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public AgenticKnowledgeView setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public AgenticKnowledgeView setUnitCatalogUuid(String unitCatalogUuid) {
        this.unitCatalogUuid = unitCatalogUuid;
        return this;
    }
    public String getUnitCatalogUuid() {
        return this.unitCatalogUuid;
    }

    public AgenticKnowledgeView setUnitDatabaseUuid(String unitDatabaseUuid) {
        this.unitDatabaseUuid = unitDatabaseUuid;
        return this;
    }
    public String getUnitDatabaseUuid() {
        return this.unitDatabaseUuid;
    }

    public AgenticKnowledgeView setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
