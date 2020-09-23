// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableRequest extends TeaModel {
    @NameInMap("HasPart")
    public Integer hasPart;

    @NameInMap("Columns")
    @Validation(required = true)
    public java.util.List<UpdateTableRequestColumns> columns;

    @NameInMap("IsView")
    public Integer isView;

    @NameInMap("Visibility")
    public Integer visibility;

    @NameInMap("LifeCycle")
    public Integer lifeCycle;

    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("LogicalLevelId")
    public Long logicalLevelId;

    @NameInMap("PhysicsLevelId")
    public Long physicsLevelId;

    @NameInMap("ExternalTableType")
    public String externalTableType;

    @NameInMap("Location")
    public String location;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TableName")
    @Validation(required = true)
    public String tableName;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("EnvType")
    public Integer envType;

    @NameInMap("Themes")
    public java.util.List<UpdateTableRequestThemes> themes;

    @NameInMap("AppGuid")
    public String appGuid;

    @NameInMap("CreateIfNotExists")
    public Boolean createIfNotExists;

    public static UpdateTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableRequest self = new UpdateTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableRequest setHasPart(Integer hasPart) {
        this.hasPart = hasPart;
        return this;
    }
    public Integer getHasPart() {
        return this.hasPart;
    }

    public UpdateTableRequest setColumns(java.util.List<UpdateTableRequestColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<UpdateTableRequestColumns> getColumns() {
        return this.columns;
    }

    public UpdateTableRequest setIsView(Integer isView) {
        this.isView = isView;
        return this;
    }
    public Integer getIsView() {
        return this.isView;
    }

    public UpdateTableRequest setVisibility(Integer visibility) {
        this.visibility = visibility;
        return this;
    }
    public Integer getVisibility() {
        return this.visibility;
    }

    public UpdateTableRequest setLifeCycle(Integer lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }
    public Integer getLifeCycle() {
        return this.lifeCycle;
    }

    public UpdateTableRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public UpdateTableRequest setLogicalLevelId(Long logicalLevelId) {
        this.logicalLevelId = logicalLevelId;
        return this;
    }
    public Long getLogicalLevelId() {
        return this.logicalLevelId;
    }

    public UpdateTableRequest setPhysicsLevelId(Long physicsLevelId) {
        this.physicsLevelId = physicsLevelId;
        return this;
    }
    public Long getPhysicsLevelId() {
        return this.physicsLevelId;
    }

    public UpdateTableRequest setExternalTableType(String externalTableType) {
        this.externalTableType = externalTableType;
        return this;
    }
    public String getExternalTableType() {
        return this.externalTableType;
    }

    public UpdateTableRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public UpdateTableRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public UpdateTableRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public UpdateTableRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public UpdateTableRequest setThemes(java.util.List<UpdateTableRequestThemes> themes) {
        this.themes = themes;
        return this;
    }
    public java.util.List<UpdateTableRequestThemes> getThemes() {
        return this.themes;
    }

    public UpdateTableRequest setAppGuid(String appGuid) {
        this.appGuid = appGuid;
        return this;
    }
    public String getAppGuid() {
        return this.appGuid;
    }

    public UpdateTableRequest setCreateIfNotExists(Boolean createIfNotExists) {
        this.createIfNotExists = createIfNotExists;
        return this;
    }
    public Boolean getCreateIfNotExists() {
        return this.createIfNotExists;
    }

    public static class UpdateTableRequestColumns extends TeaModel {
        @NameInMap("ColumnName")
        @Validation(required = true)
        public String columnName;

        @NameInMap("ColumnNameCn")
        public String columnNameCn;

        @NameInMap("ColumnType")
        @Validation(required = true)
        public String columnType;

        @NameInMap("SeqNumber")
        public Integer seqNumber;

        @NameInMap("Length")
        public Integer length;

        @NameInMap("IsPartitionCol")
        public Integer isPartitionCol;

        @NameInMap("IsPrimaryKey")
        public Integer isPrimaryKey;

        @NameInMap("IsNullable")
        public Integer isNullable;

        @NameInMap("Comment")
        public String comment;

        public static UpdateTableRequestColumns build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableRequestColumns self = new UpdateTableRequestColumns();
            return TeaModel.build(map, self);
        }

        public UpdateTableRequestColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public UpdateTableRequestColumns setColumnNameCn(String columnNameCn) {
            this.columnNameCn = columnNameCn;
            return this;
        }
        public String getColumnNameCn() {
            return this.columnNameCn;
        }

        public UpdateTableRequestColumns setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public UpdateTableRequestColumns setSeqNumber(Integer seqNumber) {
            this.seqNumber = seqNumber;
            return this;
        }
        public Integer getSeqNumber() {
            return this.seqNumber;
        }

        public UpdateTableRequestColumns setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public UpdateTableRequestColumns setIsPartitionCol(Integer isPartitionCol) {
            this.isPartitionCol = isPartitionCol;
            return this;
        }
        public Integer getIsPartitionCol() {
            return this.isPartitionCol;
        }

        public UpdateTableRequestColumns setIsPrimaryKey(Integer isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }
        public Integer getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        public UpdateTableRequestColumns setIsNullable(Integer isNullable) {
            this.isNullable = isNullable;
            return this;
        }
        public Integer getIsNullable() {
            return this.isNullable;
        }

        public UpdateTableRequestColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

    }

    public static class UpdateTableRequestThemes extends TeaModel {
        @NameInMap("ThemeId")
        public Long themeId;

        @NameInMap("ThemeLevel")
        public Integer themeLevel;

        public static UpdateTableRequestThemes build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableRequestThemes self = new UpdateTableRequestThemes();
            return TeaModel.build(map, self);
        }

        public UpdateTableRequestThemes setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public UpdateTableRequestThemes setThemeLevel(Integer themeLevel) {
            this.themeLevel = themeLevel;
            return this;
        }
        public Integer getThemeLevel() {
            return this.themeLevel;
        }

    }

}
