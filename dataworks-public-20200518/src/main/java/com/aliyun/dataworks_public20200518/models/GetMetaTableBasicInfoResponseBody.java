// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableBasicInfoResponseBody extends TeaModel {
    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GetMetaTableBasicInfoResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The connection does not exist.</p>
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
     * <p>0bc1411515937</p>
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

    public static GetMetaTableBasicInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableBasicInfoResponseBody self = new GetMetaTableBasicInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableBasicInfoResponseBody setData(GetMetaTableBasicInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableBasicInfoResponseBodyData getData() {
        return this.data;
    }

    public GetMetaTableBasicInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableBasicInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableBasicInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableBasicInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableBasicInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaTableBasicInfoResponseBodyData extends TeaModel {
        /**
         * <p>The display name of the metatable.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>The ID of the EMR cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The number of fields.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ColumnCount")
        public Integer columnCount;

        /**
         * <p>The comment of the metatable.</p>
         * 
         * <strong>example:</strong>
         * <p>test table</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time when the metatable was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1589870294000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The size of storage space that is occupied by the metatable. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DataSize")
        public Long dataSize;

        /**
         * <p>The name of the metadatabase.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The type of the environment. Valid values:</p>
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
         * <p>The number of times the metatable was added to a favorite list. This parameter is returned only if you set the Extension parameter to true and takes effect only if you set the DataSourceType parameter to odps.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("FavoriteCount")
        public Long favoriteCount;

        /**
         * <p>Indicates whether the metatable is a partitioned table. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsPartitionTable")
        public Boolean isPartitionTable;

        /**
         * <p>Indicates whether the metatable is a view. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsView")
        public Boolean isView;

        /**
         * <p>The scope in which the metatable is visible. Valid values:</p>
         * <ul>
         * <li>0: The metatable is visible to workspace members.</li>
         * <li>1: The metatable is visible to users within the tenant.</li>
         * <li>2: The metatable is visible to all tenants.</li>
         * <li>3: The metatable is visible only to the metatable owner.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsVisible")
        public Integer isVisible;

        /**
         * <p>The time when the metatable was last accessed.</p>
         * 
         * <strong>example:</strong>
         * <p>1589870294000</p>
         */
        @NameInMap("LastAccessTime")
        public Long lastAccessTime;

        /**
         * <p>The time when the schema of the metatable was last changed.</p>
         * 
         * <strong>example:</strong>
         * <p>1589870294000</p>
         */
        @NameInMap("LastDdlTime")
        public Long lastDdlTime;

        /**
         * <p>The time when the metatable was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1589870294000</p>
         */
        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        /**
         * <p>The lifecycle of the table. Unit: day.</p>
         * <blockquote>
         * <p> If the lifecycle is not set for a MaxCompute table, the return value is 0, indicating that the table is permanently valid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("LifeCycle")
        public Integer lifeCycle;

        /**
         * <p>The storage path of the Hive metadatabase.</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs://</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The ID of the metatable owner.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The partition key of the Hive metatable.</p>
         * 
         * <strong>example:</strong>
         * <p>ab</p>
         */
        @NameInMap("PartitionKeys")
        public String partitionKeys;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>232</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The number of times the metatable was read. This parameter is returned only if you set the Extension parameter to true and takes effect only if you set the DataSourceType parameter to odps.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ReadCount")
        public Long readCount;

        /**
         * <p>The schema information of the metatable. This parameter is returned if the three-layer model of MaxCompute is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <p>The GUID of the metatable.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.engine_name.table_name</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The name of the metatable.</p>
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
         * <p>The number of times the metatable was viewed. This parameter is returned only if you set the Extension parameter to true and takes effect only if you set the DataSourceType parameter to odps.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ViewCount")
        public Long viewCount;

        public static GetMetaTableBasicInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableBasicInfoResponseBodyData self = new GetMetaTableBasicInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableBasicInfoResponseBodyData setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public GetMetaTableBasicInfoResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetMetaTableBasicInfoResponseBodyData setColumnCount(Integer columnCount) {
            this.columnCount = columnCount;
            return this;
        }
        public Integer getColumnCount() {
            return this.columnCount;
        }

        public GetMetaTableBasicInfoResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaTableBasicInfoResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaTableBasicInfoResponseBodyData setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public GetMetaTableBasicInfoResponseBodyData setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public GetMetaTableBasicInfoResponseBodyData setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public GetMetaTableBasicInfoResponseBodyData setFavoriteCount(Long favoriteCount) {
            this.favoriteCount = favoriteCount;
            return this;
        }
        public Long getFavoriteCount() {
            return this.favoriteCount;
        }

        public GetMetaTableBasicInfoResponseBodyData setIsPartitionTable(Boolean isPartitionTable) {
            this.isPartitionTable = isPartitionTable;
            return this;
        }
        public Boolean getIsPartitionTable() {
            return this.isPartitionTable;
        }

        public GetMetaTableBasicInfoResponseBodyData setIsView(Boolean isView) {
            this.isView = isView;
            return this;
        }
        public Boolean getIsView() {
            return this.isView;
        }

        public GetMetaTableBasicInfoResponseBodyData setIsVisible(Integer isVisible) {
            this.isVisible = isVisible;
            return this;
        }
        public Integer getIsVisible() {
            return this.isVisible;
        }

        public GetMetaTableBasicInfoResponseBodyData setLastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        public GetMetaTableBasicInfoResponseBodyData setLastDdlTime(Long lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public Long getLastDdlTime() {
            return this.lastDdlTime;
        }

        public GetMetaTableBasicInfoResponseBodyData setLastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        public GetMetaTableBasicInfoResponseBodyData setLifeCycle(Integer lifeCycle) {
            this.lifeCycle = lifeCycle;
            return this;
        }
        public Integer getLifeCycle() {
            return this.lifeCycle;
        }

        public GetMetaTableBasicInfoResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetMetaTableBasicInfoResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetMetaTableBasicInfoResponseBodyData setPartitionKeys(String partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }
        public String getPartitionKeys() {
            return this.partitionKeys;
        }

        public GetMetaTableBasicInfoResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetMetaTableBasicInfoResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetMetaTableBasicInfoResponseBodyData setReadCount(Long readCount) {
            this.readCount = readCount;
            return this;
        }
        public Long getReadCount() {
            return this.readCount;
        }

        public GetMetaTableBasicInfoResponseBodyData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public GetMetaTableBasicInfoResponseBodyData setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetMetaTableBasicInfoResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetMetaTableBasicInfoResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetMetaTableBasicInfoResponseBodyData setViewCount(Long viewCount) {
            this.viewCount = viewCount;
            return this;
        }
        public Long getViewCount() {
            return this.viewCount;
        }

    }

}
