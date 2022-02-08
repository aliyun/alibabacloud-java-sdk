// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class DescribeEmrHiveTableResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeEmrHiveTableResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEmrHiveTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmrHiveTableResponseBody self = new DescribeEmrHiveTableResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEmrHiveTableResponseBody setData(DescribeEmrHiveTableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEmrHiveTableResponseBodyData getData() {
        return this.data;
    }

    public DescribeEmrHiveTableResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeEmrHiveTableResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeEmrHiveTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEmrHiveTableResponseBodyDataColumns extends TeaModel {
        @NameInMap("ColumnComment")
        public String columnComment;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("ColumnPosition")
        public Integer columnPosition;

        @NameInMap("ColumnType")
        public String columnType;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        public static DescribeEmrHiveTableResponseBodyDataColumns build(java.util.Map<String, ?> map) throws Exception {
            DescribeEmrHiveTableResponseBodyDataColumns self = new DescribeEmrHiveTableResponseBodyDataColumns();
            return TeaModel.build(map, self);
        }

        public DescribeEmrHiveTableResponseBodyDataColumns setColumnComment(String columnComment) {
            this.columnComment = columnComment;
            return this;
        }
        public String getColumnComment() {
            return this.columnComment;
        }

        public DescribeEmrHiveTableResponseBodyDataColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeEmrHiveTableResponseBodyDataColumns setColumnPosition(Integer columnPosition) {
            this.columnPosition = columnPosition;
            return this;
        }
        public Integer getColumnPosition() {
            return this.columnPosition;
        }

        public DescribeEmrHiveTableResponseBodyDataColumns setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public DescribeEmrHiveTableResponseBodyDataColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeEmrHiveTableResponseBodyDataColumns setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeEmrHiveTableResponseBodyDataColumns setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

    public static class DescribeEmrHiveTableResponseBodyData extends TeaModel {
        @NameInMap("ClusterBizId")
        public String clusterBizId;

        @NameInMap("ClusterBizName")
        public String clusterBizName;

        @NameInMap("Columns")
        public java.util.List<DescribeEmrHiveTableResponseBodyDataColumns> columns;

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

        @NameInMap("TableSize")
        public Long tableSize;

        @NameInMap("TableType")
        public String tableType;

        public static DescribeEmrHiveTableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEmrHiveTableResponseBodyData self = new DescribeEmrHiveTableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEmrHiveTableResponseBodyData setClusterBizId(String clusterBizId) {
            this.clusterBizId = clusterBizId;
            return this;
        }
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        public DescribeEmrHiveTableResponseBodyData setClusterBizName(String clusterBizName) {
            this.clusterBizName = clusterBizName;
            return this;
        }
        public String getClusterBizName() {
            return this.clusterBizName;
        }

        public DescribeEmrHiveTableResponseBodyData setColumns(java.util.List<DescribeEmrHiveTableResponseBodyDataColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<DescribeEmrHiveTableResponseBodyDataColumns> getColumns() {
            return this.columns;
        }

        public DescribeEmrHiveTableResponseBodyData setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeEmrHiveTableResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeEmrHiveTableResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeEmrHiveTableResponseBodyData setInputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }
        public String getInputFormat() {
            return this.inputFormat;
        }

        public DescribeEmrHiveTableResponseBodyData setIsCompressed(Boolean isCompressed) {
            this.isCompressed = isCompressed;
            return this;
        }
        public Boolean getIsCompressed() {
            return this.isCompressed;
        }

        public DescribeEmrHiveTableResponseBodyData setIsTemporary(Boolean isTemporary) {
            this.isTemporary = isTemporary;
            return this;
        }
        public Boolean getIsTemporary() {
            return this.isTemporary;
        }

        public DescribeEmrHiveTableResponseBodyData setLastAccessTime(String lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public String getLastAccessTime() {
            return this.lastAccessTime;
        }

        public DescribeEmrHiveTableResponseBodyData setLastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        public DescribeEmrHiveTableResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeEmrHiveTableResponseBodyData setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public String getOutputFormat() {
            return this.outputFormat;
        }

        public DescribeEmrHiveTableResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeEmrHiveTableResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DescribeEmrHiveTableResponseBodyData setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public DescribeEmrHiveTableResponseBodyData setPartitionKeys(String partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }
        public String getPartitionKeys() {
            return this.partitionKeys;
        }

        public DescribeEmrHiveTableResponseBodyData setSerializationLib(String serializationLib) {
            this.serializationLib = serializationLib;
            return this;
        }
        public String getSerializationLib() {
            return this.serializationLib;
        }

        public DescribeEmrHiveTableResponseBodyData setTableComment(String tableComment) {
            this.tableComment = tableComment;
            return this;
        }
        public String getTableComment() {
            return this.tableComment;
        }

        public DescribeEmrHiveTableResponseBodyData setTableDesc(String tableDesc) {
            this.tableDesc = tableDesc;
            return this;
        }
        public String getTableDesc() {
            return this.tableDesc;
        }

        public DescribeEmrHiveTableResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeEmrHiveTableResponseBodyData setTableParameters(String tableParameters) {
            this.tableParameters = tableParameters;
            return this;
        }
        public String getTableParameters() {
            return this.tableParameters;
        }

        public DescribeEmrHiveTableResponseBodyData setTableSize(Long tableSize) {
            this.tableSize = tableSize;
            return this;
        }
        public Long getTableSize() {
            return this.tableSize;
        }

        public DescribeEmrHiveTableResponseBodyData setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }
        public String getTableType() {
            return this.tableType;
        }

    }

}
