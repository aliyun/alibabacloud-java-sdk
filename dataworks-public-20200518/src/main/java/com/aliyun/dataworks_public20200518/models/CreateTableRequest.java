// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateTableRequest extends TeaModel {
    /**
     * <p>The ID of the MaxCompute project. Specify the ID in the odps.{projectName} format.</p>
     * 
     * <strong>example:</strong>
     * <p>odps.test</p>
     */
    @NameInMap("AppGuid")
    public String appGuid;

    /**
     * <p>The ID of the associated category. You can call the <a href="https://help.aliyun.com/document_detail/173932.html">GetMetaCategory</a> operation to query the IDs of all categories that can be associated.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>reserved</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of fields. A maximum of 1,000 fields are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Columns")
    public java.util.List<CreateTableRequestColumns> columns;

    /**
     * <p>The comment.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The endpoint of MaxCompute.</p>
     * 
     * <strong>example:</strong>
     * <p>odps://abc</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The environment type of the DataWorks workspace. Valid values:</p>
     * <ul>
     * <li>0: development environment</li>
     * <li>1: production environment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnvType")
    public Integer envType;

    /**
     * <p>The storage type of the external table. Valid values:</p>
     * <ul>
     * <li>0: Object Storage Service (OSS)</li>
     * <li>1: Tablestore</li>
     * <li>2: Volume</li>
     * <li>3: MySQL</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExternalTableType")
    public String externalTableType;

    /**
     * <p>Specifies whether to create a MaxCompute partitioned table. Valid values: 1 and 0. The value 1 indicates a partitioned table. The value 0 indicates a non-partitioned table. This parameter is deprecated. Do not use this parameter. The Column.N.isPartitionCol parameter is used to specify whether to create a MaxCompute partitioned table. If the Column.N.isPartitionCol parameter is set to true, a MaxCompute partitioned table is created.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HasPart")
    public Integer hasPart;

    /**
     * <p>Specifies whether to create a view or table. Valid values:</p>
     * <ul>
     * <li>0: Create a table.</li>
     * <li>1: Create a view.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsView")
    public Integer isView;

    /**
     * <p>The lifecycle of the table. Unit: days. By default, this parameter is left empty, which indicates that the table is permanently stored.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("LifeCycle")
    public Integer lifeCycle;

    /**
     * <p>The storage location of the external table.</p>
     * 
     * <strong>example:</strong>
     * <p>location</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>The ID of the logical level.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("LogicalLevelId")
    public Long logicalLevelId;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the physical level.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("PhysicsLevelId")
    public Long physicsLevelId;

    /**
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The schema information of the table. You need to enter the schema information of the table if you enable the table schema in MaxCompute.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>The name of the table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tableName1</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The list of themes.</p>
     */
    @NameInMap("Themes")
    public java.util.List<CreateTableRequestThemes> themes;

    /**
     * <p>Specifies whether the table or workspace is visible. Valid values:</p>
     * <ul>
     * <li>0: Both the table and workspace are invisible.</li>
     * <li>1: Both the table and workspace are visible.</li>
     * <li>2: Only the workspace is visible.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The name of the field. You can configure a maximum of 1,000 fields when you call the CreateTable operation to create a table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>columnName1</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The display name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>columnName in chinese</p>
         */
        @NameInMap("ColumnNameCn")
        public String columnNameCn;

        /**
         * <p>The data type of the field. For information about supported data types, see <a href="https://help.aliyun.com/document_detail/27821.html">Data type editions</a> in MaxCompute documentation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>The comment of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Specifies whether the field is a partition field.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsPartitionCol")
        public Boolean isPartitionCol;

        /**
         * <p>The length of the field. For more information, see <a href="https://help.aliyun.com/document_detail/159541.html">MaxCompute data type editions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Length")
        public Integer length;

        /**
         * <p>The sequence number of the field. You can use this parameter to specify how fields are sorted in a table. By default, fields are sorted based on the order in which requests are created. If the field is a partition field, this parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The theme ID.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("ThemeId")
        public Long themeId;

        /**
         * <p>The level that corresponds to the theme ID.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
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
