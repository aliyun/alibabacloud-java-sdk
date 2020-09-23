// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableFullInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetMetaTableFullInfoResponseData data;

    public static GetMetaTableFullInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableFullInfoResponse self = new GetMetaTableFullInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableFullInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableFullInfoResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableFullInfoResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableFullInfoResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableFullInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMetaTableFullInfoResponse setData(GetMetaTableFullInfoResponseData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableFullInfoResponseData getData() {
        return this.data;
    }

    public static class GetMetaTableFullInfoResponseDataColumnList extends TeaModel {
        @NameInMap("ColumnGuid")
        @Validation(required = true)
        public String columnGuid;

        @NameInMap("ColumnName")
        @Validation(required = true)
        public String columnName;

        @NameInMap("ColumnType")
        @Validation(required = true)
        public String columnType;

        @NameInMap("IsPrimaryKey")
        @Validation(required = true)
        public Boolean isPrimaryKey;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("IsPartitionColumn")
        @Validation(required = true)
        public Boolean isPartitionColumn;

        @NameInMap("IsForeignKey")
        @Validation(required = true)
        public Boolean isForeignKey;

        @NameInMap("Caption")
        @Validation(required = true)
        public String caption;

        public static GetMetaTableFullInfoResponseDataColumnList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableFullInfoResponseDataColumnList self = new GetMetaTableFullInfoResponseDataColumnList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableFullInfoResponseDataColumnList setColumnGuid(String columnGuid) {
            this.columnGuid = columnGuid;
            return this;
        }
        public String getColumnGuid() {
            return this.columnGuid;
        }

        public GetMetaTableFullInfoResponseDataColumnList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetMetaTableFullInfoResponseDataColumnList setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public GetMetaTableFullInfoResponseDataColumnList setIsPrimaryKey(Boolean isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }
        public Boolean getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        public GetMetaTableFullInfoResponseDataColumnList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaTableFullInfoResponseDataColumnList setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

        public GetMetaTableFullInfoResponseDataColumnList setIsForeignKey(Boolean isForeignKey) {
            this.isForeignKey = isForeignKey;
            return this;
        }
        public Boolean getIsForeignKey() {
            return this.isForeignKey;
        }

        public GetMetaTableFullInfoResponseDataColumnList setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

    }

    public static class GetMetaTableFullInfoResponseData extends TeaModel {
        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("TableGuid")
        @Validation(required = true)
        public String tableGuid;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("LastModifyTime")
        @Validation(required = true)
        public Long lastModifyTime;

        @NameInMap("LifeCycle")
        @Validation(required = true)
        public Integer lifeCycle;

        @NameInMap("IsVisible")
        @Validation(required = true)
        public Integer isVisible;

        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        @NameInMap("DataSize")
        @Validation(required = true)
        public Long dataSize;

        @NameInMap("EnvType")
        @Validation(required = true)
        public Integer envType;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("TotalColumnCount")
        @Validation(required = true)
        public Long totalColumnCount;

        @NameInMap("LastDdlTime")
        @Validation(required = true)
        public Long lastDdlTime;

        @NameInMap("LastAccessTime")
        @Validation(required = true)
        public Long lastAccessTime;

        @NameInMap("DatabaseName")
        @Validation(required = true)
        public String databaseName;

        @NameInMap("PartitionKeys")
        @Validation(required = true)
        public String partitionKeys;

        @NameInMap("Location")
        @Validation(required = true)
        public String location;

        @NameInMap("ClusterId")
        @Validation(required = true)
        public String clusterId;

        @NameInMap("ColumnList")
        @Validation(required = true)
        public java.util.List<GetMetaTableFullInfoResponseDataColumnList> columnList;

        public static GetMetaTableFullInfoResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableFullInfoResponseData self = new GetMetaTableFullInfoResponseData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableFullInfoResponseData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetMetaTableFullInfoResponseData setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetMetaTableFullInfoResponseData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetMetaTableFullInfoResponseData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetMetaTableFullInfoResponseData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetMetaTableFullInfoResponseData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaTableFullInfoResponseData setLastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        public GetMetaTableFullInfoResponseData setLifeCycle(Integer lifeCycle) {
            this.lifeCycle = lifeCycle;
            return this;
        }
        public Integer getLifeCycle() {
            return this.lifeCycle;
        }

        public GetMetaTableFullInfoResponseData setIsVisible(Integer isVisible) {
            this.isVisible = isVisible;
            return this;
        }
        public Integer getIsVisible() {
            return this.isVisible;
        }

        public GetMetaTableFullInfoResponseData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetMetaTableFullInfoResponseData setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public GetMetaTableFullInfoResponseData setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public GetMetaTableFullInfoResponseData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaTableFullInfoResponseData setTotalColumnCount(Long totalColumnCount) {
            this.totalColumnCount = totalColumnCount;
            return this;
        }
        public Long getTotalColumnCount() {
            return this.totalColumnCount;
        }

        public GetMetaTableFullInfoResponseData setLastDdlTime(Long lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public Long getLastDdlTime() {
            return this.lastDdlTime;
        }

        public GetMetaTableFullInfoResponseData setLastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        public GetMetaTableFullInfoResponseData setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public GetMetaTableFullInfoResponseData setPartitionKeys(String partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }
        public String getPartitionKeys() {
            return this.partitionKeys;
        }

        public GetMetaTableFullInfoResponseData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetMetaTableFullInfoResponseData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetMetaTableFullInfoResponseData setColumnList(java.util.List<GetMetaTableFullInfoResponseDataColumnList> columnList) {
            this.columnList = columnList;
            return this;
        }
        public java.util.List<GetMetaTableFullInfoResponseDataColumnList> getColumnList() {
            return this.columnList;
        }

    }

}
