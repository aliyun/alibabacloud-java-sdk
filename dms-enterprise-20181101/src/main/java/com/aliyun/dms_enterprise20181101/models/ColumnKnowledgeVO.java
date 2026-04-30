// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ColumnKnowledgeVO extends TeaModel {
    @NameInMap("AssetDescription")
    public String assetDescription;

    @NameInMap("AssetModifiedGmt")
    public String assetModifiedGmt;

    @NameInMap("AutoIncrement")
    public Boolean autoIncrement;

    @NameInMap("ColumnId")
    public Long columnId;

    @NameInMap("ColumnKeyType")
    public String columnKeyType;

    @NameInMap("ColumnName")
    public String columnName;

    @NameInMap("ColumnType")
    public String columnType;

    @NameInMap("Description")
    public String description;

    @NameInMap("HotLevel")
    public Integer hotLevel;

    @NameInMap("Level")
    public Integer level;

    @NameInMap("LevelType")
    public String levelType;

    @NameInMap("Nullable")
    public Boolean nullable;

    @NameInMap("Plain")
    public Boolean plain;

    @NameInMap("Position")
    public Integer position;

    @NameInMap("SecurityLevel")
    public String securityLevel;

    @NameInMap("TableId")
    public Long tableId;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserSensitivityLevel")
    public String userSensitivityLevel;

    public static ColumnKnowledgeVO build(java.util.Map<String, ?> map) throws Exception {
        ColumnKnowledgeVO self = new ColumnKnowledgeVO();
        return TeaModel.build(map, self);
    }

    public ColumnKnowledgeVO setAssetDescription(String assetDescription) {
        this.assetDescription = assetDescription;
        return this;
    }
    public String getAssetDescription() {
        return this.assetDescription;
    }

    public ColumnKnowledgeVO setAssetModifiedGmt(String assetModifiedGmt) {
        this.assetModifiedGmt = assetModifiedGmt;
        return this;
    }
    public String getAssetModifiedGmt() {
        return this.assetModifiedGmt;
    }

    public ColumnKnowledgeVO setAutoIncrement(Boolean autoIncrement) {
        this.autoIncrement = autoIncrement;
        return this;
    }
    public Boolean getAutoIncrement() {
        return this.autoIncrement;
    }

    public ColumnKnowledgeVO setColumnId(Long columnId) {
        this.columnId = columnId;
        return this;
    }
    public Long getColumnId() {
        return this.columnId;
    }

    public ColumnKnowledgeVO setColumnKeyType(String columnKeyType) {
        this.columnKeyType = columnKeyType;
        return this;
    }
    public String getColumnKeyType() {
        return this.columnKeyType;
    }

    public ColumnKnowledgeVO setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ColumnKnowledgeVO setColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }
    public String getColumnType() {
        return this.columnType;
    }

    public ColumnKnowledgeVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ColumnKnowledgeVO setHotLevel(Integer hotLevel) {
        this.hotLevel = hotLevel;
        return this;
    }
    public Integer getHotLevel() {
        return this.hotLevel;
    }

    public ColumnKnowledgeVO setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public ColumnKnowledgeVO setLevelType(String levelType) {
        this.levelType = levelType;
        return this;
    }
    public String getLevelType() {
        return this.levelType;
    }

    public ColumnKnowledgeVO setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }
    public Boolean getNullable() {
        return this.nullable;
    }

    public ColumnKnowledgeVO setPlain(Boolean plain) {
        this.plain = plain;
        return this;
    }
    public Boolean getPlain() {
        return this.plain;
    }

    public ColumnKnowledgeVO setPosition(Integer position) {
        this.position = position;
        return this;
    }
    public Integer getPosition() {
        return this.position;
    }

    public ColumnKnowledgeVO setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }
    public String getSecurityLevel() {
        return this.securityLevel;
    }

    public ColumnKnowledgeVO setTableId(Long tableId) {
        this.tableId = tableId;
        return this;
    }
    public Long getTableId() {
        return this.tableId;
    }

    public ColumnKnowledgeVO setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ColumnKnowledgeVO setUserSensitivityLevel(String userSensitivityLevel) {
        this.userSensitivityLevel = userSensitivityLevel;
        return this;
    }
    public String getUserSensitivityLevel() {
        return this.userSensitivityLevel;
    }

}
