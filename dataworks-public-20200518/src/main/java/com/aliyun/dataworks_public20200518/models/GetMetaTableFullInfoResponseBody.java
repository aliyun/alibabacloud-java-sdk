// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableFullInfoResponseBody extends TeaModel {
    /**
     * <p>The business data returned.</p>
     */
    @NameInMap("Data")
    public GetMetaTableFullInfoResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
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
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>The GUID of the field.</p>
         */
        @NameInMap("ColumnGuid")
        public String columnGuid;

        /**
         * <p>The name of the field.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The data type of the field.</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>The remarks of the field.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Indicates whether the field is a foreign key. Valid values:</p>
         * <br>
         * <p>*   true: The field is a foreign key.</p>
         * <p>*   false: The field is not a foreign key.</p>
         */
        @NameInMap("IsForeignKey")
        public Boolean isForeignKey;

        /**
         * <p>Indicates whether the field is a partition field. Valid values:</p>
         * <br>
         * <p>*   true: The field is a partition field.</p>
         * <p>*   false: The field is not a partition field.</p>
         */
        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        /**
         * <p>Indicates whether the field is the primary key. Valid values:</p>
         * <br>
         * <p>*   true: The field is the primary key.</p>
         * <p>*   false: The field is not the primary key.</p>
         */
        @NameInMap("IsPrimaryKey")
        public Boolean isPrimaryKey;

        /**
         * <p>The ordinal number of the field.</p>
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
         * <p>The ID of the EMR cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The fields in the metatable.</p>
         */
        @NameInMap("ColumnList")
        public java.util.List<GetMetaTableFullInfoResponseBodyDataColumnList> columnList;

        /**
         * <p>The remarks of the metatable.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time when the metatable was created. You can convert the timestamp to the related date based on the time zone that you use.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The amount of storage resources that are consumed by the metatable. Unit: bytes.</p>
         */
        @NameInMap("DataSize")
        public Long dataSize;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The type of the environment in which the metatable resides. Valid values:</p>
         * <br>
         * <p>*   0: indicates that the metatable resides in the development environment.</p>
         * <p>*   1: indicates that the metatable resides in the production environment.</p>
         */
        @NameInMap("EnvType")
        public Integer envType;

        /**
         * <p>The scope in which the metatable is visible. Valid values:</p>
         * <br>
         * <p>*   0: indicates that the metatable is visible to workspace members.</p>
         * <p>*   1: indicates that the metatable is visible to users within a tenant.</p>
         * <p>*   2: indicates that the metatable is visible to all tenants.</p>
         * <p>*   3: indicates that the metatable is visible only to the metatable owner.</p>
         */
        @NameInMap("IsVisible")
        public Integer isVisible;

        /**
         * <p>The time when the metatable was last accessed. You can convert the timestamp to the related date based on the time zone that you use.</p>
         */
        @NameInMap("LastAccessTime")
        public Long lastAccessTime;

        /**
         * <p>The time when the schema of the metatable was last changed. You can convert the timestamp to the related date based on the time zone that you use.</p>
         */
        @NameInMap("LastDdlTime")
        public Long lastDdlTime;

        /**
         * <p>The time when the metatable was last updated. You can convert the timestamp to the related date based on the time zone that you use.</p>
         */
        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        /**
         * <p>The lifecycle of the metatable. Unit: days.</p>
         */
        @NameInMap("LifeCycle")
        public Integer lifeCycle;

        /**
         * <p>The storage path of the Hive metatable.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The ID of the metatable owner.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The partition key.</p>
         */
        @NameInMap("PartitionKeys")
        public String partitionKeys;

        /**
         * <p>The ID of the workspace to which the metatable belongs.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The name of the workspace to which the metatable belongs.</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Schema")
        public String schema;

        /**
         * <p>The GUID of the metatable.</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The name of the metatable.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The total number of fields.</p>
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
