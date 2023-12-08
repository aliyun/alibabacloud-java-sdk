// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetStorageAnalysisResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetStorageAnalysisResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AssociatedData")
        public String associatedData;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("OptimizeAdvice")
        public String optimizeAdvice;

        @NameInMap("OptimizeItemName")
        public String optimizeItemName;

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
        @NameInMap("AvgRowLength")
        public Long avgRowLength;

        @NameInMap("DataFree")
        public Long dataFree;

        @NameInMap("DataSize")
        public Long dataSize;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("IndexSize")
        public Long indexSize;

        @NameInMap("PhyTotalSize")
        public Long phyTotalSize;

        @NameInMap("PhysicalFileSize")
        public Long physicalFileSize;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TableRows")
        public Long tableRows;

        @NameInMap("TableType")
        public String tableType;

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
        @NameInMap("AnalysisErrorType")
        public String analysisErrorType;

        @NameInMap("AnalysisSuccess")
        public Boolean analysisSuccess;

        @NameInMap("DailyIncrement")
        public Long dailyIncrement;

        @NameInMap("EstimateAvailableDays")
        public Long estimateAvailableDays;

        @NameInMap("NeedOptimizeItemList")
        public java.util.List<GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultNeedOptimizeItemList> needOptimizeItemList;

        @NameInMap("TableStats")
        public java.util.List<GetStorageAnalysisResultResponseBodyDataStorageAnalysisResultTableStats> tableStats;

        @NameInMap("TotalFreeStorageSize")
        public Long totalFreeStorageSize;

        @NameInMap("TotalStorageSize")
        public Long totalStorageSize;

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
        @NameInMap("AnalyzedDbCount")
        public Long analyzedDbCount;

        @NameInMap("StorageAnalysisResult")
        public GetStorageAnalysisResultResponseBodyDataStorageAnalysisResult storageAnalysisResult;

        @NameInMap("TaskFinish")
        public Boolean taskFinish;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskProgress")
        public Long taskProgress;

        @NameInMap("TaskState")
        public String taskState;

        @NameInMap("TaskSuccess")
        public Boolean taskSuccess;

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
