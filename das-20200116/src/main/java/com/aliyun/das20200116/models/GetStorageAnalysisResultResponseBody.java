// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetStorageAnalysisResultResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetStorageAnalysisResultResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request is successful, **Successful** is returned. Otherwise, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetStorageAnalysisResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStorageAnalysisResultResponseBody self = new GetStorageAnalysisResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStorageAnalysisResultResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetStorageAnalysisResultResponseBody setData(GetStorageAnalysisResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStorageAnalysisResultResponseBodyData getData() {
        return this.data;
    }

    public GetStorageAnalysisResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStorageAnalysisResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStorageAnalysisResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultNeedOptimizeItemList extends TeaModel {
        /**
         * <p>The data associated with the items to be optimized, which is in the JSON format.</p>
         */
        @NameInMap("AssociatedData")
        public String associatedData;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The optimization suggestion. Valid values:</p>
         * <br>
         * <p>*   **NEED_ANALYZE_TABLE**: Execute the `ANALYZE TABLE` statement on the table during off-peak hours.</p>
         * <p>*   **NEED_OPTIMIZE_TABLE**: Reclaim space fragments during off-peak hours.</p>
         * <p>*   **CHANGE_TABLE_ENGINE_IF_NECESSARY**: Change the storage engine type of a table after risk assessment.</p>
         * <p>*   **AUTO_INCREMENT_ID_BE_TO_RUN_OUT**: Pay attention to the usage of auto-increment IDs.</p>
         * <p>*   **DUPLICATE_INDEX**: Optimize indexes of tables.</p>
         * <p>*   **TABLE_SIZE**: Pay attention to the table size.</p>
         * <p>*   **TABLE_ROWS_AND_AVG_ROW_LENGTH**: Pay attention to the number of rows in a table and the average row length.</p>
         * <p>*   **STORAGE_USED_PERCENT**: Pay attention to the space usage to prevent the instance from being locked if the instance is full.</p>
         */
        @NameInMap("OptimizeAdvice")
        public String optimizeAdvice;

        /**
         * <p>The item to be optimized. Valid values:</p>
         * <br>
         * <p>*   **NEED_ANALYZE_TABLE**: tables whose storage statistics obtained from `information_schema.tables` are 50 GB larger or smaller than the physical file sizes.</p>
         * <p>*   **NEED_OPTIMIZE_TABLE**: tables whose space fragments are larger than 6 GB and whose fragmentation rates are greater than 30%. The fragmentation rate of a table is generally calculated based on the following formula: `Fragmentation rate = DataFree/(DataSize + IndexSize + DataFree)`. In this topic, PhyTotalSize = DataSize + IndexSize + DataFree. Thus, the fragmentation rate can be calculated based on the following formula: `Fragmentation rate = DataFree/PhyTotalSize`.</p>
         * <p>*   **TABLE_ENGINE**: tables whose storage engines are not InnoDB or XEngine.</p>
         * <p>*   **AUTO_INCREMENT_ID_BE_TO_RUN_OUT**: tables whose usages of auto-increment IDs exceed 80%.</p>
         * <p>*   **DUPLICATE_INDEX**: tables whose indexes are redundant or duplicate.</p>
         * <p>*   **TABLE_SIZE**: single tables whose sizes are larger than 50 GB.</p>
         * <p>*   **TABLE_ROWS_AND_AVG_ROW_LENGTH**: single tables that contain more than 5 million rows and whose average row lengths exceed 10 KB.</p>
         * <p>*   **TOTAL_DATA_FREE**: instances whose reclaimable spaces are larger than 60 GB and whose total fragmentation rate is larger than 5%.</p>
         * <p>*   **STORAGE_USED_PERCENT**: instances whose space usage is larger than 90%.</p>
         */
        @NameInMap("OptimizeItemName")
        public String optimizeItemName;

        /**
         * <p>The name of the table.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultNeedOptimizeItemList build(java.util.Map<String, ?> map) throws Exception {
            GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultNeedOptimizeItemList self = new GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultNeedOptimizeItemList();
            return TeaModel.build(map, self);
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultNeedOptimizeItemList setAssociatedData(String associatedData) {
            this.associatedData = associatedData;
            return this;
        }
        public String getAssociatedData() {
            return this.associatedData;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultNeedOptimizeItemList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultNeedOptimizeItemList setOptimizeAdvice(String optimizeAdvice) {
            this.optimizeAdvice = optimizeAdvice;
            return this;
        }
        public String getOptimizeAdvice() {
            return this.optimizeAdvice;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultNeedOptimizeItemList setOptimizeItemName(String optimizeItemName) {
            this.optimizeItemName = optimizeItemName;
            return this;
        }
        public String getOptimizeItemName() {
            return this.optimizeItemName;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultNeedOptimizeItemList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats extends TeaModel {
        /**
         * <p>The average length of rows. Unit: bytes.</p>
         */
        @NameInMap("AvgRowLength")
        public Long avgRowLength;

        /**
         * <p>The size of space fragments. Unit: bytes.</p>
         */
        @NameInMap("DataFree")
        public Long dataFree;

        /**
         * <p>The storage space occupied by data. Unit: bytes.</p>
         */
        @NameInMap("DataSize")
        public Long dataSize;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The type of the storage engine used by the table.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>可回收空间大小（碎片空间大小），单位为Byte。</p>
         * <br>
         * <p>> 该参数仅适用于MongoDB实例。表碎片率计算方式为：`FragmentSize/PhyTotalSize`。</p>
         */
        @NameInMap("FragmentSize")
        public Long fragmentSize;

        /**
         * <p>The storage space occupied by indexes. Unit: bytes.</p>
         */
        @NameInMap("IndexSize")
        public Long indexSize;

        /**
         * <p>The storage space of the table. Unit: bytes.</p>
         * <br>
         * <p>>  The value of this parameter is the sum of the values of **DataSize**, **IndexSize**, and **DataFree**.</p>
         */
        @NameInMap("PhyTotalSize")
        public Long phyTotalSize;

        /**
         * <p>The physical file size of the table. Unit: bytes.</p>
         * <br>
         * <p>>  You may fail to obtain the physical file size because of the deployment mode of the database instance.</p>
         */
        @NameInMap("PhysicalFileSize")
        public Long physicalFileSize;

        /**
         * <p>The name of the table.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The number of rows in the table.</p>
         */
        @NameInMap("TableRows")
        public Long tableRows;

        /**
         * <p>The type of the table.</p>
         */
        @NameInMap("TableType")
        public String tableType;

        /**
         * <p>The storage space occupied by table data and indexes. Unit: bytes.</p>
         * <br>
         * <p>>  The value of this parameter is the sum of the values of **DataSize** and **IndexSize**.</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats build(java.util.Map<String, ?> map) throws Exception {
            GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats self = new GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats();
            return TeaModel.build(map, self);
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats setAvgRowLength(Long avgRowLength) {
            this.avgRowLength = avgRowLength;
            return this;
        }
        public Long getAvgRowLength() {
            return this.avgRowLength;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats setDataFree(Long dataFree) {
            this.dataFree = dataFree;
            return this;
        }
        public Long getDataFree() {
            return this.dataFree;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats setFragmentSize(Long fragmentSize) {
            this.fragmentSize = fragmentSize;
            return this;
        }
        public Long getFragmentSize() {
            return this.fragmentSize;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats setIndexSize(Long indexSize) {
            this.indexSize = indexSize;
            return this;
        }
        public Long getIndexSize() {
            return this.indexSize;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats setPhyTotalSize(Long phyTotalSize) {
            this.phyTotalSize = phyTotalSize;
            return this;
        }
        public Long getPhyTotalSize() {
            return this.phyTotalSize;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats setPhysicalFileSize(Long physicalFileSize) {
            this.physicalFileSize = physicalFileSize;
            return this;
        }
        public Long getPhysicalFileSize() {
            return this.physicalFileSize;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats setTableRows(Long tableRows) {
            this.tableRows = tableRows;
            return this;
        }
        public Long getTableRows() {
            return this.tableRows;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }
        public String getTableType() {
            return this.tableType;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

    public static class GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult extends TeaModel {
        /**
         * <p>The reason why the analysis on the database and table fails.</p>
         * <br>
         * <p>*   **DB_OR_TABLE_NOT_EXIST**: The specified database or table does not exist.</p>
         * <p>*   **DB_NOT_EXIST**: The specified database does not exist.</p>
         */
        @NameInMap("AnalysisErrorType")
        public String analysisErrorType;

        /**
         * <p>Indicates whether the analysis on the database and table is successful.</p>
         */
        @NameInMap("AnalysisSuccess")
        public Boolean analysisSuccess;

        /**
         * <p>The estimated average daily growth of the used storage space in the previous seven days. Unit: bytes.</p>
         */
        @NameInMap("DailyIncrement")
        public Long dailyIncrement;

        /**
         * <p>The estimated number of days for which the remaining storage space is available.</p>
         */
        @NameInMap("EstimateAvailableDays")
        public Long estimateAvailableDays;

        /**
         * <p>The items to be optimized, which are generated based on DAS default rules. You can ignore these items based on your business requirements, and create custom rules to generate items to be optimized based on other basic data that is returned.</p>
         */
        @NameInMap("NeedOptimizeItemList")
        public java.util.List<GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultNeedOptimizeItemList> needOptimizeItemList;

        /**
         * <p>The information about the table.</p>
         */
        @NameInMap("TableStats")
        public java.util.List<GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats> tableStats;

        /**
         * <p>The size of remaining storage.</p>
         * <br>
         * <p>>  Unit: bytes.</p>
         */
        @NameInMap("TotalFreeStorageSize")
        public Long totalFreeStorageSize;

        /**
         * <p>The total size of instance storage.</p>
         * <br>
         * <p>>  Unit: bytes.</p>
         */
        @NameInMap("TotalStorageSize")
        public Long totalStorageSize;

        /**
         * <p>The size of used storage.</p>
         * <br>
         * <p>>  Unit: bytes.</p>
         */
        @NameInMap("TotalUsedStorageSize")
        public Long totalUsedStorageSize;

        public static GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult build(java.util.Map<String, ?> map) throws Exception {
            GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult self = new GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult();
            return TeaModel.build(map, self);
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult setAnalysisErrorType(String analysisErrorType) {
            this.analysisErrorType = analysisErrorType;
            return this;
        }
        public String getAnalysisErrorType() {
            return this.analysisErrorType;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult setAnalysisSuccess(Boolean analysisSuccess) {
            this.analysisSuccess = analysisSuccess;
            return this;
        }
        public Boolean getAnalysisSuccess() {
            return this.analysisSuccess;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult setDailyIncrement(Long dailyIncrement) {
            this.dailyIncrement = dailyIncrement;
            return this;
        }
        public Long getDailyIncrement() {
            return this.dailyIncrement;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult setEstimateAvailableDays(Long estimateAvailableDays) {
            this.estimateAvailableDays = estimateAvailableDays;
            return this;
        }
        public Long getEstimateAvailableDays() {
            return this.estimateAvailableDays;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult setNeedOptimizeItemList(java.util.List<GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultNeedOptimizeItemList> needOptimizeItemList) {
            this.needOptimizeItemList = needOptimizeItemList;
            return this;
        }
        public java.util.List<GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultNeedOptimizeItemList> getNeedOptimizeItemList() {
            return this.needOptimizeItemList;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult setTableStats(java.util.List<GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats> tableStats) {
            this.tableStats = tableStats;
            return this;
        }
        public java.util.List<GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats> getTableStats() {
            return this.tableStats;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult setTotalFreeStorageSize(Long totalFreeStorageSize) {
            this.totalFreeStorageSize = totalFreeStorageSize;
            return this;
        }
        public Long getTotalFreeStorageSize() {
            return this.totalFreeStorageSize;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult setTotalStorageSize(Long totalStorageSize) {
            this.totalStorageSize = totalStorageSize;
            return this;
        }
        public Long getTotalStorageSize() {
            return this.totalStorageSize;
        }

        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult setTotalUsedStorageSize(Long totalUsedStorageSize) {
            this.totalUsedStorageSize = totalUsedStorageSize;
            return this;
        }
        public Long getTotalUsedStorageSize() {
            return this.totalUsedStorageSize;
        }

    }

    public static class GetStorageAnalysisResultResponseBodyData extends TeaModel {
        /**
         * <p>The number of databases that have been analyzed.</p>
         */
        @NameInMap("AnalyzedDbCount")
        public Long analyzedDbCount;

        /**
         * <p>The details of storage analysis.</p>
         */
        @NameInMap("StorageAnalysisResult")
        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult storageAnalysisResult;

        /**
         * <p>Indicates whether the task is complete.</p>
         */
        @NameInMap("TaskFinish")
        public Boolean taskFinish;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task progress.</p>
         * <br>
         * <p>>  Valid values are integers that range from 0 to 100.</p>
         */
        @NameInMap("TaskProgress")
        public Long taskProgress;

        /**
         * <p>The status of the storage analysis task. Valid values:</p>
         * <br>
         * <p>*   **INIT**: The task is being initialized.</p>
         * <p>*   **PENDING**: The task is being queued for execution.</p>
         * <p>*   **RECEIVED**: The task is received for execution.</p>
         * <p>*   **RUNNING**: The task is being executed.</p>
         * <p>*   **RETRY**: The task is being retried.</p>
         * <p>*   **SUCCESS**: The task succeeds.</p>
         * <p>*   **FAILURE**: The task fails.</p>
         */
        @NameInMap("TaskState")
        public String taskState;

        /**
         * <p>Indicates whether the task is successful.</p>
         */
        @NameInMap("TaskSuccess")
        public Boolean taskSuccess;

        /**
         * <p>The number of databases that need to be analyzed in the storage analysis task.</p>
         */
        @NameInMap("TotalDbCount")
        public Long totalDbCount;

        public static GetStorageAnalysisResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStorageAnalysisResultResponseBodyData self = new GetStorageAnalysisResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStorageAnalysisResultResponseBodyData setAnalyzedDbCount(Long analyzedDbCount) {
            this.analyzedDbCount = analyzedDbCount;
            return this;
        }
        public Long getAnalyzedDbCount() {
            return this.analyzedDbCount;
        }

        public GetStorageAnalysisResultResponseBodyData setStorageAnalysisResult(GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult storageAnalysisResult) {
            this.storageAnalysisResult = storageAnalysisResult;
            return this;
        }
        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult getStorageAnalysisResult() {
            return this.storageAnalysisResult;
        }

        public GetStorageAnalysisResultResponseBodyData setTaskFinish(Boolean taskFinish) {
            this.taskFinish = taskFinish;
            return this;
        }
        public Boolean getTaskFinish() {
            return this.taskFinish;
        }

        public GetStorageAnalysisResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetStorageAnalysisResultResponseBodyData setTaskProgress(Long taskProgress) {
            this.taskProgress = taskProgress;
            return this;
        }
        public Long getTaskProgress() {
            return this.taskProgress;
        }

        public GetStorageAnalysisResultResponseBodyData setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

        public GetStorageAnalysisResultResponseBodyData setTaskSuccess(Boolean taskSuccess) {
            this.taskSuccess = taskSuccess;
            return this;
        }
        public Boolean getTaskSuccess() {
            return this.taskSuccess;
        }

        public GetStorageAnalysisResultResponseBodyData setTotalDbCount(Long totalDbCount) {
            this.totalDbCount = totalDbCount;
            return this;
        }
        public Long getTotalDbCount() {
            return this.totalDbCount;
        }

    }

}
