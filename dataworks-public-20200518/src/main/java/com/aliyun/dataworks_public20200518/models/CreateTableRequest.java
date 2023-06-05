// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateTableRequest extends TeaModel {
    /**
     * <p>The comment.</p>
     */
    @NameInMap("AppGuid")
    public String appGuid;

    /**
     * <p>The ID of the logical level.</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The schema information of the table. You need to enter the schema information of the table if you enable the table schema in MaxCompute.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Columns")
    public java.util.List<CreateTableRequestColumns> columns;

    /**
     * <p>Specifies whether the MaxCompute table is a partitioned table. Valid values: 1 and 0. The value 1 indicates that the MaxCompute table is a partitioned table. The value 0 indicates that the MaxCompute table is not a partitioned table. This parameter is deprecated. Do not use this parameter.</p>
     * <br>
     * <p>The Column.N.isPartitionCol parameter is used to specify whether the MaxCompute table is a partitioned table. If the Column.N.isPartitionCol parameter is set to true, the MaxCompute table is a partitioned table.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The environment of the DataWorks workspace. Valid values:</p>
     * <br>
     * <p>*   0: development environment</p>
     * <p>*   1: production environment</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The globally unique identifier (GUID) of the MaxCompute project. Specify the GUID in the odps.{projectName} format.</p>
     */
    @NameInMap("EnvType")
    public Integer envType;

    /**
     * <p>The storage location of the external table.</p>
     */
    @NameInMap("ExternalTableType")
    public String externalTableType;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("HasPart")
    public Integer hasPart;

    /**
     * <p>Specifies whether the table or workspace is visible:</p>
     * <br>
     * <p>*   0: Both the table and workspace are not visible.</p>
     * <p>*   1: The table and workspace are visible.</p>
     * <p>*   2: Only the workspace is visible.</p>
     */
    @NameInMap("IsView")
    public Integer isView;

    /**
     * <p>The ID of the associated category. You can call the [GetMetaCategory](~~173932~~) operation to query the ID of the category that can be associated.</p>
     */
    @NameInMap("LifeCycle")
    public Integer lifeCycle;

    /**
     * <p>The ID of the DataWorks workspace.</p>
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
     * <p>The storage type of the external table. Valid values:</p>
     * <br>
     * <p>*   0: Object Storage Service (OSS)</p>
     * <p>*   1: Tablestore</p>
     * <p>*   2: Volume</p>
     * <p>*   3: MySQL</p>
     */
    @NameInMap("PhysicsLevelId")
    public Long physicsLevelId;

    /**
     * <p>The name of the table.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The display name of the field.</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>The endpoint of MaxCompute.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    @NameInMap("Themes")
    public java.util.List<CreateTableRequestThemes> themes;

    /**
     * <p>The lifecycle of the table. Unit: days. By default, this parameter is left empty, which indicates that the table is permanently stored.</p>
     */
    @NameInMap("Visibility")
    public Integer visibility;

    public static CreateTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTableRequest self = new CreateTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateTableRequest setAppGuid(String appGuid) {
        this.appGuid = appGuid;
        return this;
    }
    public String getAppGuid() {
        return this.appGuid;
    }

    public CreateTableRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public CreateTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTableRequest setColumns(java.util.List<CreateTableRequestColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<CreateTableRequestColumns> getColumns() {
        return this.columns;
    }

    public CreateTableRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
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

    public CreateTableRequest setExternalTableType(String externalTableType) {
        this.externalTableType = externalTableType;
        return this;
    }
    public String getExternalTableType() {
        return this.externalTableType;
    }

    public CreateTableRequest setHasPart(Integer hasPart) {
        this.hasPart = hasPart;
        return this;
    }
    public Integer getHasPart() {
        return this.hasPart;
    }

    public CreateTableRequest setIsView(Integer isView) {
        this.isView = isView;
        return this;
    }
    public Integer getIsView() {
        return this.isView;
    }

    public CreateTableRequest setLifeCycle(Integer lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }
    public Integer getLifeCycle() {
        return this.lifeCycle;
    }

    public CreateTableRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CreateTableRequest setLogicalLevelId(Long logicalLevelId) {
        this.logicalLevelId = logicalLevelId;
        return this;
    }
    public Long getLogicalLevelId() {
        return this.logicalLevelId;
    }

    public CreateTableRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateTableRequest setPhysicsLevelId(Long physicsLevelId) {
        this.physicsLevelId = physicsLevelId;
        return this;
    }
    public Long getPhysicsLevelId() {
        return this.physicsLevelId;
    }

    public CreateTableRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateTableRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public CreateTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateTableRequest setThemes(java.util.List<CreateTableRequestThemes> themes) {
        this.themes = themes;
        return this;
    }
    public java.util.List<CreateTableRequestThemes> getThemes() {
        return this.themes;
    }

    public CreateTableRequest setVisibility(Integer visibility) {
        this.visibility = visibility;
        return this;
    }
    public Integer getVisibility() {
        return this.visibility;
    }

    public static class CreateTableRequestColumns extends TeaModel {
        /**
         * <p>The comment of the field.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The name of the field.</p>
         * <br>
         * <p>You can call the CreateTable operation to configure a maximum of 1,000 fields.</p>
         */
        @NameInMap("ColumnNameCn")
        public String columnNameCn;

        /**
         * <p>The sequence number of the field. You can use this parameter to specify how fields are sorted in a table. By default, fields are sorted in the order in which requests are created.</p>
         * <br>
         * <p>If the field is a partition field, this parameter is not supported.</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>The data type of the field.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the topic.</p>
         */
        @NameInMap("IsPartitionCol")
        public Boolean isPartitionCol;

        /**
         * <p>Specifies whether the current field is a partition field.</p>
         */
        @NameInMap("Length")
        public Integer length;

        /**
         * <p>The length of the field. For more information, see [MaxCompute V2.0 data type edition](~~159541#concept-2454988~~).</p>
         */
        @NameInMap("SeqNumber")
        public Integer seqNumber;

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

        public CreateTableRequestColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateTableRequestColumns setIsPartitionCol(Boolean isPartitionCol) {
            this.isPartitionCol = isPartitionCol;
            return this;
        }
        public Boolean getIsPartitionCol() {
            return this.isPartitionCol;
        }

        public CreateTableRequestColumns setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public CreateTableRequestColumns setSeqNumber(Integer seqNumber) {
            this.seqNumber = seqNumber;
            return this;
        }
        public Integer getSeqNumber() {
            return this.seqNumber;
        }

    }

    public static class CreateTableRequestThemes extends TeaModel {
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
