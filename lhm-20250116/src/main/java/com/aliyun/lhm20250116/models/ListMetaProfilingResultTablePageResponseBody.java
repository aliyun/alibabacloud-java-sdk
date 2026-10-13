// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListMetaProfilingResultTablePageResponseBody extends TeaModel {
    /**
     * <p>The list of table profiling results. For the element structure, see the descriptions of the sub-fields.</p>
     */
    @NameInMap("data")
    public java.util.List<ListMetaProfilingResultTablePageResponseBodyData> data;

    /**
     * <p>The error code. This parameter is an empty string if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. This parameter is an empty string if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>The parameter is invalid or missing.</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The current page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of records to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues of this call.</p>
     * 
     * <strong>example:</strong>
     * <p>3F45B8C1-2A6E-4C9B-9E1F-7D2A1B0C5E66</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success, and a value of false indicates failure. If the call fails, troubleshoot the issue based on errCode and errMessage.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of records that meet the conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListMetaProfilingResultTablePageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetaProfilingResultTablePageResponseBody self = new ListMetaProfilingResultTablePageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetaProfilingResultTablePageResponseBody setData(java.util.List<ListMetaProfilingResultTablePageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMetaProfilingResultTablePageResponseBodyData> getData() {
        return this.data;
    }

    public ListMetaProfilingResultTablePageResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListMetaProfilingResultTablePageResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListMetaProfilingResultTablePageResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListMetaProfilingResultTablePageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetaProfilingResultTablePageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetaProfilingResultTablePageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMetaProfilingResultTablePageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMetaProfilingResultTablePageResponseBodyData extends TeaModel {
        /**
         * <p>The average file size.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("averageFileSize")
        public String averageFileSize;

        /**
         * <p>The average partition size.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("averagePartitionSize")
        public String averagePartitionSize;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-19 22:00:02</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The name of the database, which is used to filter results by database.</p>
         * 
         * <strong>example:</strong>
         * <p>ods</p>
         */
        @NameInMap("dbName")
        public String dbName;

        /**
         * <p>The value of the data partition to which the table belongs, which identifies the partition to which this row of data belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>20240719</p>
         */
        @NameInMap("ds")
        public String ds;

        /**
         * <p>The type of storage engine used by the table.</p>
         * 
         * <strong>example:</strong>
         * <p>PARQUET</p>
         */
        @NameInMap("engine")
        public String engine;

        /**
         * <p>The number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("fileNum")
        public Integer fileNum;

        /**
         * <p>Indicates whether the table is an external table.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("isExternal")
        public Integer isExternal;

        /**
         * <p>Indicates whether the table is a partitioned table.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isPtTable")
        public Integer isPtTable;

        /**
         * <p>Indicates whether the table is a transactional table.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("isTransactional")
        public Integer isTransactional;

        /**
         * <p>The last access time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-19 22:00:02</p>
         */
        @NameInMap("lastAccessed")
        public String lastAccessed;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-19 22:00:02</p>
         */
        @NameInMap("lastModified")
        public String lastModified;

        /**
         * <p>The creation time of the largest partition.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-19 22:00:02</p>
         */
        @NameInMap("maxPtCrtTime")
        public String maxPtCrtTime;

        /**
         * <p>The list of largest partitions.</p>
         */
        @NameInMap("maximumPartitionList")
        public java.util.List<String> maximumPartitionList;

        /**
         * <p>The migration progress percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("migrationProcess")
        public Double migrationProcess;

        /**
         * <p>The migration status, which is used to filter by migration progress or indicate the migration status of an object.</p>
         * 
         * <strong>example:</strong>
         * <p>DONE</p>
         */
        @NameInMap("migrationStatus")
        public String migrationStatus;

        /**
         * <p>The creation time of the smallest partition.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01 08:00:00</p>
         */
        @NameInMap("minPtCrtTime")
        public String minPtCrtTime;

        /**
         * <p>The list of smallest partitions.</p>
         */
        @NameInMap("minimumPartitionList")
        public java.util.List<String> minimumPartitionList;

        /**
         * <p>Indicates whether the object is newly added.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("newAdded")
        public Integer newAdded;

        /**
         * <p>The list of partition field names.</p>
         */
        @NameInMap("partitionFieldNameList")
        public java.util.List<String> partitionFieldNameList;

        /**
         * <p>The number of partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("partitionNum")
        public Integer partitionNum;

        /**
         * <p>The number of data rows.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("recordCount")
        public Long recordCount;

        /**
         * <p>The data storage size.</p>
         * 
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("storageSize")
        public String storageSize;

        /**
         * <p>The table comment or remark.</p>
         * 
         * <strong>example:</strong>
         * <p>Order details table</p>
         */
        @NameInMap("tableComment")
        public String tableComment;

        /**
         * <p>The table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5001</p>
         */
        @NameInMap("tableId")
        public String tableId;

        /**
         * <p>The last modification time of the table schema.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-19 22:00:02</p>
         */
        @NameInMap("tableModTime")
        public String tableModTime;

        /**
         * <p>The name of the table, which is used to filter results by table name.</p>
         * 
         * <strong>example:</strong>
         * <p>ods_order_detail</p>
         */
        @NameInMap("tableName")
        public String tableName;

        /**
         * <p>The identifier of the table type, such as managed table (MANAGED_TABLE) or external table (EXTERNAL_TABLE).</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED_TABLE</p>
         */
        @NameInMap("tableType")
        public String tableType;

        public static ListMetaProfilingResultTablePageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMetaProfilingResultTablePageResponseBodyData self = new ListMetaProfilingResultTablePageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMetaProfilingResultTablePageResponseBodyData setAverageFileSize(String averageFileSize) {
            this.averageFileSize = averageFileSize;
            return this;
        }
        public String getAverageFileSize() {
            return this.averageFileSize;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setAveragePartitionSize(String averagePartitionSize) {
            this.averagePartitionSize = averagePartitionSize;
            return this;
        }
        public String getAveragePartitionSize() {
            return this.averagePartitionSize;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setDs(String ds) {
            this.ds = ds;
            return this;
        }
        public String getDs() {
            return this.ds;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setFileNum(Integer fileNum) {
            this.fileNum = fileNum;
            return this;
        }
        public Integer getFileNum() {
            return this.fileNum;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setIsExternal(Integer isExternal) {
            this.isExternal = isExternal;
            return this;
        }
        public Integer getIsExternal() {
            return this.isExternal;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setIsPtTable(Integer isPtTable) {
            this.isPtTable = isPtTable;
            return this;
        }
        public Integer getIsPtTable() {
            return this.isPtTable;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setIsTransactional(Integer isTransactional) {
            this.isTransactional = isTransactional;
            return this;
        }
        public Integer getIsTransactional() {
            return this.isTransactional;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setLastAccessed(String lastAccessed) {
            this.lastAccessed = lastAccessed;
            return this;
        }
        public String getLastAccessed() {
            return this.lastAccessed;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setMaxPtCrtTime(String maxPtCrtTime) {
            this.maxPtCrtTime = maxPtCrtTime;
            return this;
        }
        public String getMaxPtCrtTime() {
            return this.maxPtCrtTime;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setMaximumPartitionList(java.util.List<String> maximumPartitionList) {
            this.maximumPartitionList = maximumPartitionList;
            return this;
        }
        public java.util.List<String> getMaximumPartitionList() {
            return this.maximumPartitionList;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setMigrationProcess(Double migrationProcess) {
            this.migrationProcess = migrationProcess;
            return this;
        }
        public Double getMigrationProcess() {
            return this.migrationProcess;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setMigrationStatus(String migrationStatus) {
            this.migrationStatus = migrationStatus;
            return this;
        }
        public String getMigrationStatus() {
            return this.migrationStatus;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setMinPtCrtTime(String minPtCrtTime) {
            this.minPtCrtTime = minPtCrtTime;
            return this;
        }
        public String getMinPtCrtTime() {
            return this.minPtCrtTime;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setMinimumPartitionList(java.util.List<String> minimumPartitionList) {
            this.minimumPartitionList = minimumPartitionList;
            return this;
        }
        public java.util.List<String> getMinimumPartitionList() {
            return this.minimumPartitionList;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setNewAdded(Integer newAdded) {
            this.newAdded = newAdded;
            return this;
        }
        public Integer getNewAdded() {
            return this.newAdded;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setPartitionFieldNameList(java.util.List<String> partitionFieldNameList) {
            this.partitionFieldNameList = partitionFieldNameList;
            return this;
        }
        public java.util.List<String> getPartitionFieldNameList() {
            return this.partitionFieldNameList;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setPartitionNum(Integer partitionNum) {
            this.partitionNum = partitionNum;
            return this;
        }
        public Integer getPartitionNum() {
            return this.partitionNum;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setRecordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Long getRecordCount() {
            return this.recordCount;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setStorageSize(String storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public String getStorageSize() {
            return this.storageSize;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setTableComment(String tableComment) {
            this.tableComment = tableComment;
            return this;
        }
        public String getTableComment() {
            return this.tableComment;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setTableModTime(String tableModTime) {
            this.tableModTime = tableModTime;
            return this;
        }
        public String getTableModTime() {
            return this.tableModTime;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListMetaProfilingResultTablePageResponseBodyData setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }
        public String getTableType() {
            return this.tableType;
        }

    }

}
