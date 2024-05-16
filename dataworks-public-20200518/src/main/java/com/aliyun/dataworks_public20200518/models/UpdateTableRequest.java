// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableRequest extends TeaModel {
    /**
     * <p>Specifies whether the table exists. Valid values:</p>
     * <br>
     * <p>*   true: The table exists.</p>
     * <p>*   false: The table does not exist.</p>
     * <br>
     * <p>This parameter is deprecated. Do not use this parameter.</p>
     */
    @NameInMap("AppGuid")
    public String appGuid;

    /**
     * <p>The ID of the logical level.</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("Columns")
    public java.util.List<UpdateTableRequestColumns> columns;

    /**
     * <p>The schema information of the table. You need to enter the schema information of the table if you enable the table schema in MaxCompute.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Specifies whether the table that you want to update is a partitioned table. Valid values: 0 and 1. The value 0 indicates that the table is not a partitioned table. The value 1 indicates that the table is a partitioned table. This parameter is deprecated. Do not use this parameter.</p>
     * <br>
     * <p>The Column.N.isPartitionCol parameter is used instead of the HasPart parameter to specify whether the MaxCompute table is a partitioned table. If the Column.N.isPartitionCol parameter is set to 1, the MaxCompute table is a partitioned table.</p>
     */
    @NameInMap("CreateIfNotExists")
    public Boolean createIfNotExists;

    /**
     * <p>The environment of the DataWorks workspace. Valid values: 0 and 1. The value 0 indicates the development environment. The value 1 indicates the production environment.</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The globally unique identifier (GUID) of the MaxCompute project. Specify the GUID in the odps.{projectName} format.</p>
     */
    @NameInMap("EnvType")
    public Integer envType;

    /**
     * <p>The storage location of the external table. This parameter is deprecated. Do not use this parameter.</p>
     */
    @NameInMap("ExternalTableType")
    public String externalTableType;

    /**
     * <p>The comment.</p>
     */
    @NameInMap("HasPart")
    public Integer hasPart;

    /**
     * <p>The scope in which the table is visible. Valid values: 0, 1, and 2. The value 0 indicates that the table is invisible to all workspace members. The value 1 indicates that the table is visible to all workspace members. The value 2 indicates that the table is visible to workspace members.</p>
     */
    @NameInMap("IsView")
    public Integer isView;

    /**
     * <p>The ID of the associated category.</p>
     */
    @NameInMap("LifeCycle")
    public Integer lifeCycle;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the DataWorks console to obtain the ID of the DataWorks workspace.</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>The ID of the physical level.</p>
     */
    @NameInMap("LogicalLevelId")
    public Long logicalLevelId;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The type of the external table. Valid values: 0, 1, 2, and 3. The value 0 indicates that the external table is an OSS external table. The value 1 indicates that the external table is a Tablestore external table. The value 2 indicates that the external table is a volume external table. The value 3 indicates that the external table is a MySQL external table. This parameter is deprecated. Do not use this parameter.</p>
     */
    @NameInMap("PhysicsLevelId")
    public Long physicsLevelId;

    /**
     * <p>The name of the MaxCompute table.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The display name of the field.</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>The endpoint of MaxCompute. If this parameter is left empty, the endpoint of the MaxCompute project is used.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    @NameInMap("Themes")
    public java.util.List<UpdateTableRequestThemes> themes;

    /**
     * <p>The lifecycle of the table. Unit: days. If this parameter is left empty, the table is permanently stored.</p>
     */
    @NameInMap("Visibility")
    public Integer visibility;

    public static UpdateTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableRequest self = new UpdateTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableRequest setAppGuid(String appGuid) {
        this.appGuid = appGuid;
        return this;
    }
    public String getAppGuid() {
        return this.appGuid;
    }

    public UpdateTableRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public UpdateTableRequest setColumns(java.util.List<UpdateTableRequestColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<UpdateTableRequestColumns> getColumns() {
        return this.columns;
    }

    public UpdateTableRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateTableRequest setCreateIfNotExists(Boolean createIfNotExists) {
        this.createIfNotExists = createIfNotExists;
        return this;
    }
    public Boolean getCreateIfNotExists() {
        return this.createIfNotExists;
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

    public UpdateTableRequest setExternalTableType(String externalTableType) {
        this.externalTableType = externalTableType;
        return this;
    }
    public String getExternalTableType() {
        return this.externalTableType;
    }

    public UpdateTableRequest setHasPart(Integer hasPart) {
        this.hasPart = hasPart;
        return this;
    }
    public Integer getHasPart() {
        return this.hasPart;
    }

    public UpdateTableRequest setIsView(Integer isView) {
        this.isView = isView;
        return this;
    }
    public Integer getIsView() {
        return this.isView;
    }

    public UpdateTableRequest setLifeCycle(Integer lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }
    public Integer getLifeCycle() {
        return this.lifeCycle;
    }

    public UpdateTableRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public UpdateTableRequest setLogicalLevelId(Long logicalLevelId) {
        this.logicalLevelId = logicalLevelId;
        return this;
    }
    public Long getLogicalLevelId() {
        return this.logicalLevelId;
    }

    public UpdateTableRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public UpdateTableRequest setPhysicsLevelId(Long physicsLevelId) {
        this.physicsLevelId = physicsLevelId;
        return this;
    }
    public Long getPhysicsLevelId() {
        return this.physicsLevelId;
    }

    public UpdateTableRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateTableRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public UpdateTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public UpdateTableRequest setThemes(java.util.List<UpdateTableRequestThemes> themes) {
        this.themes = themes;
        return this;
    }
    public java.util.List<UpdateTableRequestThemes> getThemes() {
        return this.themes;
    }

    public UpdateTableRequest setVisibility(Integer visibility) {
        this.visibility = visibility;
        return this;
    }
    public Integer getVisibility() {
        return this.visibility;
    }

    public static class UpdateTableRequestColumns extends TeaModel {
        /**
         * <p>The comment of the field.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The name of the field.</p>
         */
        @NameInMap("ColumnNameCn")
        public String columnNameCn;

        /**
         * <p>The sequence number of the field. If the field is a partition field, this parameter is not supported.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>The type of the field. For more information, see MaxCompute field types.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the associated topic.</p>
         */
        @NameInMap("IsPartitionCol")
        public Boolean isPartitionCol;

        /**
         * <p>Specifies whether the field is a partition field. Valid values: 0 and 1. The value 0 indicates that the field is not a partition field. The value 1 indicates that the field is a partition field.</p>
         */
        @NameInMap("Length")
        public Integer length;

        /**
         * <p>The length of the field.</p>
         */
        @NameInMap("SeqNumber")
        public Integer seqNumber;

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

        public UpdateTableRequestColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UpdateTableRequestColumns setIsPartitionCol(Boolean isPartitionCol) {
            this.isPartitionCol = isPartitionCol;
            return this;
        }
        public Boolean getIsPartitionCol() {
            return this.isPartitionCol;
        }

        public UpdateTableRequestColumns setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public UpdateTableRequestColumns setSeqNumber(Integer seqNumber) {
            this.seqNumber = seqNumber;
            return this;
        }
        public Integer getSeqNumber() {
            return this.seqNumber;
        }

    }

    public static class UpdateTableRequestThemes extends TeaModel {
        /**
         * <p>The level that corresponds to the topic ID.</p>
         */
        @NameInMap("ThemeId")
        public Long themeId;

        /**
         * <p>The ID of the request.</p>
         */
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
