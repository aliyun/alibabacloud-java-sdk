// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableBasicInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public GetMetaTableBasicInfoResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetMetaTableBasicInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableBasicInfoResponseBody self = new GetMetaTableBasicInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableBasicInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableBasicInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public GetMetaTableBasicInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaTableBasicInfoResponseBodyData extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("FavoriteCount")
        public Long favoriteCount;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("EnvType")
        public Integer envType;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("IsVisible")
        public Integer isVisible;

        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("ReadCount")
        public Long readCount;

        @NameInMap("IsPartitionTable")
        public Boolean isPartitionTable;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("LifeCycle")
        public Integer lifeCycle;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ViewCount")
        public Long viewCount;

        @NameInMap("LastAccessTime")
        public Long lastAccessTime;

        @NameInMap("DataSize")
        public Long dataSize;

        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        @NameInMap("PartitionKeys")
        public String partitionKeys;

        @NameInMap("LastDdlTime")
        public Long lastDdlTime;

        @NameInMap("Caption")
        public String caption;

        @NameInMap("Location")
        public String location;

        @NameInMap("TenantId")
        public Long tenantId;

        public static GetMetaTableBasicInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableBasicInfoResponseBodyData self = new GetMetaTableBasicInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableBasicInfoResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetMetaTableBasicInfoResponseBodyData setFavoriteCount(Long favoriteCount) {
            this.favoriteCount = favoriteCount;
            return this;
        }
        public Long getFavoriteCount() {
            return this.favoriteCount;
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

        public GetMetaTableBasicInfoResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetMetaTableBasicInfoResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetMetaTableBasicInfoResponseBodyData setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public GetMetaTableBasicInfoResponseBodyData setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public GetMetaTableBasicInfoResponseBodyData setIsVisible(Integer isVisible) {
            this.isVisible = isVisible;
            return this;
        }
        public Integer getIsVisible() {
            return this.isVisible;
        }

        public GetMetaTableBasicInfoResponseBodyData setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetMetaTableBasicInfoResponseBodyData setReadCount(Long readCount) {
            this.readCount = readCount;
            return this;
        }
        public Long getReadCount() {
            return this.readCount;
        }

        public GetMetaTableBasicInfoResponseBodyData setIsPartitionTable(Boolean isPartitionTable) {
            this.isPartitionTable = isPartitionTable;
            return this;
        }
        public Boolean getIsPartitionTable() {
            return this.isPartitionTable;
        }

        public GetMetaTableBasicInfoResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetMetaTableBasicInfoResponseBodyData setLifeCycle(Integer lifeCycle) {
            this.lifeCycle = lifeCycle;
            return this;
        }
        public Integer getLifeCycle() {
            return this.lifeCycle;
        }

        public GetMetaTableBasicInfoResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetMetaTableBasicInfoResponseBodyData setViewCount(Long viewCount) {
            this.viewCount = viewCount;
            return this;
        }
        public Long getViewCount() {
            return this.viewCount;
        }

        public GetMetaTableBasicInfoResponseBodyData setLastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        public GetMetaTableBasicInfoResponseBodyData setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public GetMetaTableBasicInfoResponseBodyData setLastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        public GetMetaTableBasicInfoResponseBodyData setPartitionKeys(String partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }
        public String getPartitionKeys() {
            return this.partitionKeys;
        }

        public GetMetaTableBasicInfoResponseBodyData setLastDdlTime(Long lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public Long getLastDdlTime() {
            return this.lastDdlTime;
        }

        public GetMetaTableBasicInfoResponseBodyData setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public GetMetaTableBasicInfoResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetMetaTableBasicInfoResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
