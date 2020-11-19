// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class GetBatchEvaluateTaskReportResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetBatchEvaluateTaskReportResponseData data;

    public static GetBatchEvaluateTaskReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchEvaluateTaskReportResponse self = new GetBatchEvaluateTaskReportResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchEvaluateTaskReportResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBatchEvaluateTaskReportResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetBatchEvaluateTaskReportResponse setData(GetBatchEvaluateTaskReportResponseData data) {
        this.data = data;
        return this;
    }
    public GetBatchEvaluateTaskReportResponseData getData() {
        return this.data;
    }

    public static class GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults extends TeaModel {
        @NameInMap("Table")
        @Validation(required = true)
        public String table;

        @NameInMap("ShardType")
        @Validation(required = true)
        public String shardType;

        @NameInMap("DbShardKey")
        @Validation(required = true)
        public String dbShardKey;

        @NameInMap("TbShardKey")
        @Validation(required = true)
        public String tbShardKey;

        @NameInMap("Tbpartitions")
        @Validation(required = true)
        public Integer tbpartitions;

        @NameInMap("Dbpartitions")
        @Validation(required = true)
        public Integer dbpartitions;

        @NameInMap("CreateTableSql")
        @Validation(required = true)
        public String createTableSql;

        @NameInMap("RowCount")
        @Validation(required = true)
        public Integer rowCount;

        @NameInMap("SqlCount")
        @Validation(required = true)
        public Integer sqlCount;

        @NameInMap("ShardKeyType")
        @Validation(required = true)
        public String shardKeyType;

        public static GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults build(java.util.Map<String, ?> map) throws Exception {
            GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults self = new GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults();
            return TeaModel.build(map, self);
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setShardType(String shardType) {
            this.shardType = shardType;
            return this;
        }
        public String getShardType() {
            return this.shardType;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setDbShardKey(String dbShardKey) {
            this.dbShardKey = dbShardKey;
            return this;
        }
        public String getDbShardKey() {
            return this.dbShardKey;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setTbShardKey(String tbShardKey) {
            this.tbShardKey = tbShardKey;
            return this;
        }
        public String getTbShardKey() {
            return this.tbShardKey;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setTbpartitions(Integer tbpartitions) {
            this.tbpartitions = tbpartitions;
            return this;
        }
        public Integer getTbpartitions() {
            return this.tbpartitions;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setDbpartitions(Integer dbpartitions) {
            this.dbpartitions = dbpartitions;
            return this;
        }
        public Integer getDbpartitions() {
            return this.dbpartitions;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setCreateTableSql(String createTableSql) {
            this.createTableSql = createTableSql;
            return this;
        }
        public String getCreateTableSql() {
            return this.createTableSql;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setSqlCount(Integer sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Integer getSqlCount() {
            return this.sqlCount;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setShardKeyType(String shardKeyType) {
            this.shardKeyType = shardKeyType;
            return this;
        }
        public String getShardKeyType() {
            return this.shardKeyType;
        }

    }

    public static class GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResults extends TeaModel {
        @NameInMap("TableShardResults")
        @Validation(required = true)
        public java.util.List<GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults> tableShardResults;

        public static GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResults build(java.util.Map<String, ?> map) throws Exception {
            GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResults self = new GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResults();
            return TeaModel.build(map, self);
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResults setTableShardResults(java.util.List<GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults> tableShardResults) {
            this.tableShardResults = tableShardResults;
            return this;
        }
        public java.util.List<GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults> getTableShardResults() {
            return this.tableShardResults;
        }

    }

    public static class GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos extends TeaModel {
        @NameInMap("InstId")
        @Validation(required = true)
        public String instId;

        @NameInMap("RdsUsedSpace")
        @Validation(required = true)
        public Integer rdsUsedSpace;

        @NameInMap("RdsPeakIopsWeekly")
        @Validation(required = true)
        public Integer rdsPeakIopsWeekly;

        @NameInMap("RdsPeakQpsWeekly")
        @Validation(required = true)
        public Integer rdsPeakQpsWeekly;

        @NameInMap("RdsPeakSessionsWeekly")
        @Validation(required = true)
        public Integer rdsPeakSessionsWeekly;

        @NameInMap("DataGrowthScale")
        @Validation(required = true)
        public Integer dataGrowthScale;

        @NameInMap("AvgQpsGrowthScale")
        @Validation(required = true)
        public Integer avgQpsGrowthScale;

        public static GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos build(java.util.Map<String, ?> map) throws Exception {
            GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos self = new GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos();
            return TeaModel.build(map, self);
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos setInstId(String instId) {
            this.instId = instId;
            return this;
        }
        public String getInstId() {
            return this.instId;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos setRdsUsedSpace(Integer rdsUsedSpace) {
            this.rdsUsedSpace = rdsUsedSpace;
            return this;
        }
        public Integer getRdsUsedSpace() {
            return this.rdsUsedSpace;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos setRdsPeakIopsWeekly(Integer rdsPeakIopsWeekly) {
            this.rdsPeakIopsWeekly = rdsPeakIopsWeekly;
            return this;
        }
        public Integer getRdsPeakIopsWeekly() {
            return this.rdsPeakIopsWeekly;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos setRdsPeakQpsWeekly(Integer rdsPeakQpsWeekly) {
            this.rdsPeakQpsWeekly = rdsPeakQpsWeekly;
            return this;
        }
        public Integer getRdsPeakQpsWeekly() {
            return this.rdsPeakQpsWeekly;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos setRdsPeakSessionsWeekly(Integer rdsPeakSessionsWeekly) {
            this.rdsPeakSessionsWeekly = rdsPeakSessionsWeekly;
            return this;
        }
        public Integer getRdsPeakSessionsWeekly() {
            return this.rdsPeakSessionsWeekly;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos setDataGrowthScale(Integer dataGrowthScale) {
            this.dataGrowthScale = dataGrowthScale;
            return this;
        }
        public Integer getDataGrowthScale() {
            return this.dataGrowthScale;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos setAvgQpsGrowthScale(Integer avgQpsGrowthScale) {
            this.avgQpsGrowthScale = avgQpsGrowthScale;
            return this;
        }
        public Integer getAvgQpsGrowthScale() {
            return this.avgQpsGrowthScale;
        }

    }

    public static class GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfos extends TeaModel {
        @NameInMap("RdsInstInfos")
        @Validation(required = true)
        public java.util.List<GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos> rdsInstInfos;

        public static GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfos build(java.util.Map<String, ?> map) throws Exception {
            GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfos self = new GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfos();
            return TeaModel.build(map, self);
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfos setRdsInstInfos(java.util.List<GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos> rdsInstInfos) {
            this.rdsInstInfos = rdsInstInfos;
            return this;
        }
        public java.util.List<GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos> getRdsInstInfos() {
            return this.rdsInstInfos;
        }

    }

    public static class GetBatchEvaluateTaskReportResponseDataEvaluateResults extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public Integer taskId;

        @NameInMap("TaskName")
        @Validation(required = true)
        public String taskName;

        @NameInMap("InstId")
        @Validation(required = true)
        public Integer instId;

        @NameInMap("DbName")
        @Validation(required = true)
        public String dbName;

        @NameInMap("TaskStatus")
        @Validation(required = true)
        public String taskStatus;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("RdsType")
        @Validation(required = true)
        public String rdsType;

        @NameInMap("RdsCount")
        @Validation(required = true)
        public Integer rdsCount;

        @NameInMap("RdsTotalSpace")
        @Validation(required = true)
        public String rdsTotalSpace;

        @NameInMap("DrdsType")
        @Validation(required = true)
        public String drdsType;

        @NameInMap("DrdsCount")
        @Validation(required = true)
        public Integer drdsCount;

        @NameInMap("AllSqlCount")
        @Validation(required = true)
        public Integer allSqlCount;

        @NameInMap("SlowSqlCount")
        @Validation(required = true)
        public Integer slowSqlCount;

        @NameInMap("TableShardResults")
        @Validation(required = true)
        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResults tableShardResults;

        @NameInMap("RdsInstInfos")
        @Validation(required = true)
        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfos rdsInstInfos;

        public static GetBatchEvaluateTaskReportResponseDataEvaluateResults build(java.util.Map<String, ?> map) throws Exception {
            GetBatchEvaluateTaskReportResponseDataEvaluateResults self = new GetBatchEvaluateTaskReportResponseDataEvaluateResults();
            return TeaModel.build(map, self);
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResults setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResults setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResults setInstId(Integer instId) {
            this.instId = instId;
            return this;
        }
        public Integer getInstId() {
            return this.instId;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResults setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResults setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResults setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResults setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResults setRdsType(String rdsType) {
            this.rdsType = rdsType;
            return this;
        }
        public String getRdsType() {
            return this.rdsType;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResults setRdsCount(Integer rdsCount) {
            this.rdsCount = rdsCount;
            return this;
        }
        public Integer getRdsCount() {
            return this.rdsCount;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResults setRdsTotalSpace(String rdsTotalSpace) {
            this.rdsTotalSpace = rdsTotalSpace;
            return this;
        }
        public String getRdsTotalSpace() {
            return this.rdsTotalSpace;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResults setDrdsType(String drdsType) {
            this.drdsType = drdsType;
            return this;
        }
        public String getDrdsType() {
            return this.drdsType;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResults setDrdsCount(Integer drdsCount) {
            this.drdsCount = drdsCount;
            return this;
        }
        public Integer getDrdsCount() {
            return this.drdsCount;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResults setAllSqlCount(Integer allSqlCount) {
            this.allSqlCount = allSqlCount;
            return this;
        }
        public Integer getAllSqlCount() {
            return this.allSqlCount;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResults setSlowSqlCount(Integer slowSqlCount) {
            this.slowSqlCount = slowSqlCount;
            return this;
        }
        public Integer getSlowSqlCount() {
            return this.slowSqlCount;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResults setTableShardResults(GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResults tableShardResults) {
            this.tableShardResults = tableShardResults;
            return this;
        }
        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResults getTableShardResults() {
            return this.tableShardResults;
        }

        public GetBatchEvaluateTaskReportResponseDataEvaluateResults setRdsInstInfos(GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfos rdsInstInfos) {
            this.rdsInstInfos = rdsInstInfos;
            return this;
        }
        public GetBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfos getRdsInstInfos() {
            return this.rdsInstInfos;
        }

    }

    public static class GetBatchEvaluateTaskReportResponseData extends TeaModel {
        @NameInMap("EvaluateResults")
        @Validation(required = true)
        public java.util.List<GetBatchEvaluateTaskReportResponseDataEvaluateResults> evaluateResults;

        public static GetBatchEvaluateTaskReportResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetBatchEvaluateTaskReportResponseData self = new GetBatchEvaluateTaskReportResponseData();
            return TeaModel.build(map, self);
        }

        public GetBatchEvaluateTaskReportResponseData setEvaluateResults(java.util.List<GetBatchEvaluateTaskReportResponseDataEvaluateResults> evaluateResults) {
            this.evaluateResults = evaluateResults;
            return this;
        }
        public java.util.List<GetBatchEvaluateTaskReportResponseDataEvaluateResults> getEvaluateResults() {
            return this.evaluateResults;
        }

    }

}
