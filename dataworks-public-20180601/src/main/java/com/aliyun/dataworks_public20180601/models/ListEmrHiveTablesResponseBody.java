// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListEmrHiveTablesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListEmrHiveTablesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static ListEmrHiveTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEmrHiveTablesResponseBody self = new ListEmrHiveTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEmrHiveTablesResponseBody setData(ListEmrHiveTablesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEmrHiveTablesResponseBodyData getData() {
        return this.data;
    }

    public ListEmrHiveTablesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListEmrHiveTablesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListEmrHiveTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEmrHiveTablesResponseBodyDataPagedData extends TeaModel {
        @NameInMap("ClusterBizId")
        public String clusterBizId;

        @NameInMap("ClusterBizName")
        public String clusterBizName;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InputFormat")
        public String inputFormat;

        @NameInMap("IsCompressed")
        public Boolean isCompressed;

        @NameInMap("IsTemporary")
        public Boolean isTemporary;

        @NameInMap("LastAccessTime")
        public String lastAccessTime;

        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        @NameInMap("Location")
        public String location;

        @NameInMap("OutputFormat")
        public String outputFormat;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("OwnerType")
        public String ownerType;

        @NameInMap("PartitionKeys")
        public String partitionKeys;

        @NameInMap("SerializationLib")
        public String serializationLib;

        @NameInMap("TableComment")
        public String tableComment;

        @NameInMap("TableDesc")
        public String tableDesc;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TableParameters")
        public String tableParameters;

        @NameInMap("TableType")
        public String tableType;

        public static ListEmrHiveTablesResponseBodyDataPagedData build(java.util.Map<String, ?> map) throws Exception {
            ListEmrHiveTablesResponseBodyDataPagedData self = new ListEmrHiveTablesResponseBodyDataPagedData();
            return TeaModel.build(map, self);
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setClusterBizId(String clusterBizId) {
            this.clusterBizId = clusterBizId;
            return this;
        }
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setClusterBizName(String clusterBizName) {
            this.clusterBizName = clusterBizName;
            return this;
        }
        public String getClusterBizName() {
            return this.clusterBizName;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setInputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }
        public String getInputFormat() {
            return this.inputFormat;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setIsCompressed(Boolean isCompressed) {
            this.isCompressed = isCompressed;
            return this;
        }
        public Boolean getIsCompressed() {
            return this.isCompressed;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setIsTemporary(Boolean isTemporary) {
            this.isTemporary = isTemporary;
            return this;
        }
        public Boolean getIsTemporary() {
            return this.isTemporary;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setLastAccessTime(String lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public String getLastAccessTime() {
            return this.lastAccessTime;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setLastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public String getOutputFormat() {
            return this.outputFormat;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setPartitionKeys(String partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }
        public String getPartitionKeys() {
            return this.partitionKeys;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setSerializationLib(String serializationLib) {
            this.serializationLib = serializationLib;
            return this;
        }
        public String getSerializationLib() {
            return this.serializationLib;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setTableComment(String tableComment) {
            this.tableComment = tableComment;
            return this;
        }
        public String getTableComment() {
            return this.tableComment;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setTableDesc(String tableDesc) {
            this.tableDesc = tableDesc;
            return this;
        }
        public String getTableDesc() {
            return this.tableDesc;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setTableParameters(String tableParameters) {
            this.tableParameters = tableParameters;
            return this;
        }
        public String getTableParameters() {
            return this.tableParameters;
        }

        public ListEmrHiveTablesResponseBodyDataPagedData setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }
        public String getTableType() {
            return this.tableType;
        }

    }

    public static class ListEmrHiveTablesResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PagedData")
        public java.util.List<ListEmrHiveTablesResponseBodyDataPagedData> pagedData;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListEmrHiveTablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEmrHiveTablesResponseBodyData self = new ListEmrHiveTablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEmrHiveTablesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListEmrHiveTablesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListEmrHiveTablesResponseBodyData setPagedData(java.util.List<ListEmrHiveTablesResponseBodyDataPagedData> pagedData) {
            this.pagedData = pagedData;
            return this;
        }
        public java.util.List<ListEmrHiveTablesResponseBodyDataPagedData> getPagedData() {
            return this.pagedData;
        }

        public ListEmrHiveTablesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
