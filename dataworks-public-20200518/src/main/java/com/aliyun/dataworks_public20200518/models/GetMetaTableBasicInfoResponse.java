// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableBasicInfoResponse extends TeaModel {
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
    public GetMetaTableBasicInfoResponseData data;

    public static GetMetaTableBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableBasicInfoResponse self = new GetMetaTableBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableBasicInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableBasicInfoResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableBasicInfoResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableBasicInfoResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableBasicInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMetaTableBasicInfoResponse setData(GetMetaTableBasicInfoResponseData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableBasicInfoResponseData getData() {
        return this.data;
    }

    public static class GetMetaTableBasicInfoResponseData extends TeaModel {
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

        @NameInMap("LastDdlTime")
        @Validation(required = true)
        public Long lastDdlTime;

        @NameInMap("LastAccessTime")
        @Validation(required = true)
        public Long lastAccessTime;

        @NameInMap("EnvType")
        @Validation(required = true)
        public Integer envType;

        @NameInMap("DataSize")
        @Validation(required = true)
        public Long dataSize;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

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

        @NameInMap("Caption")
        @Validation(required = true)
        public String caption;

        @NameInMap("IsPartitionTable")
        @Validation(required = true)
        public Boolean isPartitionTable;

        @NameInMap("ReadCount")
        @Validation(required = true)
        public Long readCount;

        @NameInMap("ViewCount")
        @Validation(required = true)
        public Long viewCount;

        @NameInMap("FavoriteCount")
        @Validation(required = true)
        public Long favoriteCount;

        @NameInMap("IsView")
        @Validation(required = true)
        public Boolean isView;

        public static GetMetaTableBasicInfoResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableBasicInfoResponseData self = new GetMetaTableBasicInfoResponseData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableBasicInfoResponseData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetMetaTableBasicInfoResponseData setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetMetaTableBasicInfoResponseData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetMetaTableBasicInfoResponseData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetMetaTableBasicInfoResponseData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetMetaTableBasicInfoResponseData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaTableBasicInfoResponseData setLastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        public GetMetaTableBasicInfoResponseData setLifeCycle(Integer lifeCycle) {
            this.lifeCycle = lifeCycle;
            return this;
        }
        public Integer getLifeCycle() {
            return this.lifeCycle;
        }

        public GetMetaTableBasicInfoResponseData setIsVisible(Integer isVisible) {
            this.isVisible = isVisible;
            return this;
        }
        public Integer getIsVisible() {
            return this.isVisible;
        }

        public GetMetaTableBasicInfoResponseData setLastDdlTime(Long lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public Long getLastDdlTime() {
            return this.lastDdlTime;
        }

        public GetMetaTableBasicInfoResponseData setLastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        public GetMetaTableBasicInfoResponseData setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public GetMetaTableBasicInfoResponseData setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public GetMetaTableBasicInfoResponseData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaTableBasicInfoResponseData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetMetaTableBasicInfoResponseData setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public GetMetaTableBasicInfoResponseData setPartitionKeys(String partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }
        public String getPartitionKeys() {
            return this.partitionKeys;
        }

        public GetMetaTableBasicInfoResponseData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetMetaTableBasicInfoResponseData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetMetaTableBasicInfoResponseData setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public GetMetaTableBasicInfoResponseData setIsPartitionTable(Boolean isPartitionTable) {
            this.isPartitionTable = isPartitionTable;
            return this;
        }
        public Boolean getIsPartitionTable() {
            return this.isPartitionTable;
        }

        public GetMetaTableBasicInfoResponseData setReadCount(Long readCount) {
            this.readCount = readCount;
            return this;
        }
        public Long getReadCount() {
            return this.readCount;
        }

        public GetMetaTableBasicInfoResponseData setViewCount(Long viewCount) {
            this.viewCount = viewCount;
            return this;
        }
        public Long getViewCount() {
            return this.viewCount;
        }

        public GetMetaTableBasicInfoResponseData setFavoriteCount(Long favoriteCount) {
            this.favoriteCount = favoriteCount;
            return this;
        }
        public Long getFavoriteCount() {
            return this.favoriteCount;
        }

        public GetMetaTableBasicInfoResponseData setIsView(Boolean isView) {
            this.isView = isView;
            return this;
        }
        public Boolean getIsView() {
            return this.isView;
        }

    }

}
