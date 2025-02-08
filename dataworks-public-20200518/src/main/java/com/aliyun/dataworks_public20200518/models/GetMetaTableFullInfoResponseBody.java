// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableFullInfoResponseBody extends TeaModel {
    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GetMetaTableFullInfoResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1031203110005</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameters are invalid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1411515937****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMetaTableFullInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableFullInfoResponseBody self = new GetMetaTableFullInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableFullInfoResponseBody setData(GetMetaTableFullInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableFullInfoResponseBodyData getData() {
        return this.data;
    }

    public GetMetaTableFullInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableFullInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableFullInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableFullInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableFullInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaTableFullInfoResponseBodyDataColumnList extends TeaModel {
        /**
         * <p>The description of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>data comment</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>The unique identifier of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.engine_name.table_name.1</p>
         */
        @NameInMap("ColumnGuid")
        public String columnGuid;

        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The data type of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>The remarks of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Indicates whether the field is a foreign key. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsForeignKey")
        public Boolean isForeignKey;

        /**
         * <p>Indicates whether the field is a partition field. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        /**
         * <p>Indicates whether the field is a primary key. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsPrimaryKey")
        public Boolean isPrimaryKey;

        /**
         * <p>The sequence number of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Position")
        public Integer position;

        public static GetMetaTableFullInfoResponseBodyDataColumnList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableFullInfoResponseBodyDataColumnList self = new GetMetaTableFullInfoResponseBodyDataColumnList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setColumnGuid(String columnGuid) {
            this.columnGuid = columnGuid;
            return this;
        }
        public String getColumnGuid() {
            return this.columnGuid;
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setIsForeignKey(Boolean isForeignKey) {
            this.isForeignKey = isForeignKey;
            return this;
        }
        public Boolean getIsForeignKey() {
            return this.isForeignKey;
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setIsPrimaryKey(Boolean isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }
        public Boolean getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

    }

    public static class GetMetaTableFullInfoResponseBodyData extends TeaModel {
        /**
         * <p>The EMR cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C-010A704DA760****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The fields in the table.</p>
         */
        @NameInMap("ColumnList")
        public java.util.List<GetMetaTableFullInfoResponseBodyDataColumnList> columnList;

        /**
         * <p>The comment on the table.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time when the table was created. A timestamp is returned for this parameter. You can convert the timestamp to the related date based on the time zone that you use.</p>
         * 
         * <strong>example:</strong>
         * <p>1589870293000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The size of the storage space that is consumed by the table. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DataSize")
        public Long dataSize;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The type of the environment. Valid values:</p>
         * <ul>
         * <li>0: indicates that the table resides in the development environment.</li>
         * <li>1: indicates that the table resides in the production environment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnvType")
        public Integer envType;

        /**
         * <p>The scope in which the table is visible. Valid values:</p>
         * <ul>
         * <li>0: indicates that the table is visible to workspace members.</li>
         * <li>1: indicates that the table is visible to users within a tenant.</li>
         * <li>2: indicates that the table is visible to all tenants.</li>
         * <li>3: indicates that the table is visible only to the table owner.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsVisible")
        public Integer isVisible;

        /**
         * <p>The time when the table was last accessed. A timestamp is returned for this parameter. You can convert the timestamp to the related date based on the time zone that you use.</p>
         * 
         * <strong>example:</strong>
         * <p>1589870294000</p>
         */
        @NameInMap("LastAccessTime")
        public Long lastAccessTime;

        /**
         * <p>The time when the schema of the table was last changed. A timestamp is returned for this parameter. You can convert the timestamp to the related date based on the time zone that you use.</p>
         * 
         * <strong>example:</strong>
         * <p>1589870294000</p>
         */
        @NameInMap("LastDdlTime")
        public Long lastDdlTime;

        /**
         * <p>The time when the table was last updated. A timestamp is returned for this parameter. You can convert the timestamp to the related date based on the time zone that you use.</p>
         * 
         * <strong>example:</strong>
         * <p>1589870294000</p>
         */
        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        /**
         * <p>The lifecycle of the table. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("LifeCycle")
        public Integer lifeCycle;

        /**
         * <p>The storage path of the Hive table.</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs://localhost:777/user/hadoop/test.txt</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The ID of the table owner.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The partition key column.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("PartitionKeys")
        public String partitionKeys;

        /**
         * <p>The ID of the workspace to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The name of the workspace to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The schema information of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <p>The unique identifier of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.engine_name.table_name</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The total number of fields.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("TotalColumnCount")
        public Long totalColumnCount;

        public static GetMetaTableFullInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableFullInfoResponseBodyData self = new GetMetaTableFullInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableFullInfoResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetMetaTableFullInfoResponseBodyData setColumnList(java.util.List<GetMetaTableFullInfoResponseBodyDataColumnList> columnList) {
            this.columnList = columnList;
            return this;
        }
        public java.util.List<GetMetaTableFullInfoResponseBodyDataColumnList> getColumnList() {
            return this.columnList;
        }

        public GetMetaTableFullInfoResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaTableFullInfoResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaTableFullInfoResponseBodyData setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public GetMetaTableFullInfoResponseBodyData setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public GetMetaTableFullInfoResponseBodyData setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public GetMetaTableFullInfoResponseBodyData setIsVisible(Integer isVisible) {
            this.isVisible = isVisible;
            return this;
        }
        public Integer getIsVisible() {
            return this.isVisible;
        }

        public GetMetaTableFullInfoResponseBodyData setLastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        public GetMetaTableFullInfoResponseBodyData setLastDdlTime(Long lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public Long getLastDdlTime() {
            return this.lastDdlTime;
        }

        public GetMetaTableFullInfoResponseBodyData setLastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        public GetMetaTableFullInfoResponseBodyData setLifeCycle(Integer lifeCycle) {
            this.lifeCycle = lifeCycle;
            return this;
        }
        public Integer getLifeCycle() {
            return this.lifeCycle;
        }

        public GetMetaTableFullInfoResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetMetaTableFullInfoResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetMetaTableFullInfoResponseBodyData setPartitionKeys(String partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }
        public String getPartitionKeys() {
            return this.partitionKeys;
        }

        public GetMetaTableFullInfoResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetMetaTableFullInfoResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetMetaTableFullInfoResponseBodyData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public GetMetaTableFullInfoResponseBodyData setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetMetaTableFullInfoResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetMetaTableFullInfoResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetMetaTableFullInfoResponseBodyData setTotalColumnCount(Long totalColumnCount) {
            this.totalColumnCount = totalColumnCount;
            return this;
        }
        public Long getTotalColumnCount() {
            return this.totalColumnCount;
        }

    }

}
