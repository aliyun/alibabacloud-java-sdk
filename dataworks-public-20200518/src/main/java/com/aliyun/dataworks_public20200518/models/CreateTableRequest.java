// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateTableRequest extends TeaModel {
    @NameInMap("Columns")
    @Validation(required = true)
    public java.util.List<CreateTableRequestColumns> columns;

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
    public java.util.List<CreateTableRequestThemes> themes;

    @NameInMap("AppGuid")
    public String appGuid;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("HasPart")
    public Integer hasPart;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTableRequest self = new CreateTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateTableRequest setColumns(java.util.List<CreateTableRequestColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<CreateTableRequestColumns> getColumns() {
        return this.columns;
    }

    public CreateTableRequest setIsView(Integer isView) {
        this.isView = isView;
        return this;
    }
    public Integer getIsView() {
        return this.isView;
    }

    public CreateTableRequest setVisibility(Integer visibility) {
        this.visibility = visibility;
        return this;
    }
    public Integer getVisibility() {
        return this.visibility;
    }

    public CreateTableRequest setLifeCycle(Integer lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }
    public Integer getLifeCycle() {
        return this.lifeCycle;
    }

    public CreateTableRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public CreateTableRequest setLogicalLevelId(Long logicalLevelId) {
        this.logicalLevelId = logicalLevelId;
        return this;
    }
    public Long getLogicalLevelId() {
        return this.logicalLevelId;
    }

    public CreateTableRequest setPhysicsLevelId(Long physicsLevelId) {
        this.physicsLevelId = physicsLevelId;
        return this;
    }
    public Long getPhysicsLevelId() {
        return this.physicsLevelId;
    }

    public CreateTableRequest setExternalTableType(String externalTableType) {
        this.externalTableType = externalTableType;
        return this;
    }
    public String getExternalTableType() {
        return this.externalTableType;
    }

    public CreateTableRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CreateTableRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateTableRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public CreateTableRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public CreateTableRequest setThemes(java.util.List<CreateTableRequestThemes> themes) {
        this.themes = themes;
        return this;
    }
    public java.util.List<CreateTableRequestThemes> getThemes() {
        return this.themes;
    }

    public CreateTableRequest setAppGuid(String appGuid) {
        this.appGuid = appGuid;
        return this;
    }
    public String getAppGuid() {
        return this.appGuid;
    }

    public CreateTableRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateTableRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateTableRequest setHasPart(Integer hasPart) {
        this.hasPart = hasPart;
        return this;
    }
    public Integer getHasPart() {
        return this.hasPart;
    }

    public CreateTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateTableRequestColumns extends TeaModel {
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
        public Boolean isPartitionCol;

        @NameInMap("Comment")
        public String comment;

        public static CreateTableRequestColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTableRequestColumns self = new CreateTableRequestColumns();
            return TeaModel.build(map, self);
        }

        public CreateTableRequestColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateTableRequestColumns setColumnNameCn(String columnNameCn) {
            this.columnNameCn = columnNameCn;
            return this;
        }
        public String getColumnNameCn() {
            return this.columnNameCn;
        }

        public CreateTableRequestColumns setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public CreateTableRequestColumns setSeqNumber(Integer seqNumber) {
            this.seqNumber = seqNumber;
            return this;
        }
        public Integer getSeqNumber() {
            return this.seqNumber;
        }

        public CreateTableRequestColumns setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public CreateTableRequestColumns setIsPartitionCol(Boolean isPartitionCol) {
            this.isPartitionCol = isPartitionCol;
            return this;
        }
        public Boolean getIsPartitionCol() {
            return this.isPartitionCol;
        }

        public CreateTableRequestColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

    }

    public static class CreateTableRequestThemes extends TeaModel {
        @NameInMap("ThemeId")
        public Long themeId;

        @NameInMap("ThemeLevel")
        public Integer themeLevel;

        public static CreateTableRequestThemes build(java.util.Map<String, ?> map) throws Exception {
            CreateTableRequestThemes self = new CreateTableRequestThemes();
            return TeaModel.build(map, self);
        }

        public CreateTableRequestThemes setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public CreateTableRequestThemes setThemeLevel(Integer themeLevel) {
            this.themeLevel = themeLevel;
            return this;
        }
        public Integer getThemeLevel() {
            return this.themeLevel;
        }

    }

}
