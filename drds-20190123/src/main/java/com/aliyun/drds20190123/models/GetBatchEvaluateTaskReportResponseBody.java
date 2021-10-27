// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class GetBatchEvaluateTaskReportResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetBatchEvaluateTaskReportResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBatchEvaluateTaskReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBatchEvaluateTaskReportResponseBody self = new GetBatchEvaluateTaskReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBatchEvaluateTaskReportResponseBody setData(GetBatchEvaluateTaskReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBatchEvaluateTaskReportResponseBodyData getData() {
        return this.data;
    }

    public GetBatchEvaluateTaskReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBatchEvaluateTaskReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos extends TeaModel {
        @NameInMap("AvgQpsGrowthScale")
        public Integer avgQpsGrowthScale;

        @NameInMap("DataGrowthScale")
        public Integer dataGrowthScale;

        @NameInMap("InstId")
        public String instId;

        @NameInMap("RdsPeakIopsWeekly")
        public Integer rdsPeakIopsWeekly;

        @NameInMap("RdsPeakQpsWeekly")
        public Integer rdsPeakQpsWeekly;

        @NameInMap("RdsPeakSessionsWeekly")
        public Integer rdsPeakSessionsWeekly;

        @NameInMap("RdsUsedSpace")
        public Integer rdsUsedSpace;

        public static GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos build(java.util.Map<String, ?> map) throws Exception {
            GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos self = new GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos();
            return TeaModel.build(map, self);
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos setAvgQpsGrowthScale(Integer avgQpsGrowthScale) {
            this.avgQpsGrowthScale = avgQpsGrowthScale;
            return this;
        }
        public Integer getAvgQpsGrowthScale() {
            return this.avgQpsGrowthScale;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos setDataGrowthScale(Integer dataGrowthScale) {
            this.dataGrowthScale = dataGrowthScale;
            return this;
        }
        public Integer getDataGrowthScale() {
            return this.dataGrowthScale;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos setInstId(String instId) {
            this.instId = instId;
            return this;
        }
        public String getInstId() {
            return this.instId;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos setRdsPeakIopsWeekly(Integer rdsPeakIopsWeekly) {
            this.rdsPeakIopsWeekly = rdsPeakIopsWeekly;
            return this;
        }
        public Integer getRdsPeakIopsWeekly() {
            return this.rdsPeakIopsWeekly;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos setRdsPeakQpsWeekly(Integer rdsPeakQpsWeekly) {
            this.rdsPeakQpsWeekly = rdsPeakQpsWeekly;
            return this;
        }
        public Integer getRdsPeakQpsWeekly() {
            return this.rdsPeakQpsWeekly;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos setRdsPeakSessionsWeekly(Integer rdsPeakSessionsWeekly) {
            this.rdsPeakSessionsWeekly = rdsPeakSessionsWeekly;
            return this;
        }
        public Integer getRdsPeakSessionsWeekly() {
            return this.rdsPeakSessionsWeekly;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos setRdsUsedSpace(Integer rdsUsedSpace) {
            this.rdsUsedSpace = rdsUsedSpace;
            return this;
        }
        public Integer getRdsUsedSpace() {
            return this.rdsUsedSpace;
        }

    }

    public static class GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfos extends TeaModel {
        @NameInMap("RdsInstInfos")
        public java.util.List<GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos> rdsInstInfos;

        public static GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfos build(java.util.Map<String, ?> map) throws Exception {
            GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfos self = new GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfos();
            return TeaModel.build(map, self);
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfos setRdsInstInfos(java.util.List<GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos> rdsInstInfos) {
            this.rdsInstInfos = rdsInstInfos;
            return this;
        }
        public java.util.List<GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos> getRdsInstInfos() {
            return this.rdsInstInfos;
        }

    }

    public static class GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults extends TeaModel {
        @NameInMap("CreateTableSql")
        public String createTableSql;

        @NameInMap("DbShardKey")
        public String dbShardKey;

        @NameInMap("Dbpartitions")
        public Integer dbpartitions;

        @NameInMap("RowCount")
        public Integer rowCount;

        @NameInMap("ShardKeyType")
        public String shardKeyType;

        @NameInMap("ShardType")
        public String shardType;

        @NameInMap("SqlCount")
        public Integer sqlCount;

        @NameInMap("Table")
        public String table;

        @NameInMap("TbShardKey")
        public String tbShardKey;

        @NameInMap("Tbpartitions")
        public Integer tbpartitions;

        public static GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults build(java.util.Map<String, ?> map) throws Exception {
            GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults self = new GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults();
            return TeaModel.build(map, self);
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setCreateTableSql(String createTableSql) {
            this.createTableSql = createTableSql;
            return this;
        }
        public String getCreateTableSql() {
            return this.createTableSql;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setDbShardKey(String dbShardKey) {
            this.dbShardKey = dbShardKey;
            return this;
        }
        public String getDbShardKey() {
            return this.dbShardKey;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setDbpartitions(Integer dbpartitions) {
            this.dbpartitions = dbpartitions;
            return this;
        }
        public Integer getDbpartitions() {
            return this.dbpartitions;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setShardKeyType(String shardKeyType) {
            this.shardKeyType = shardKeyType;
            return this;
        }
        public String getShardKeyType() {
            return this.shardKeyType;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setShardType(String shardType) {
            this.shardType = shardType;
            return this;
        }
        public String getShardType() {
            return this.shardType;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setSqlCount(Integer sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Integer getSqlCount() {
            return this.sqlCount;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setTbShardKey(String tbShardKey) {
            this.tbShardKey = tbShardKey;
            return this;
        }
        public String getTbShardKey() {
            return this.tbShardKey;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setTbpartitions(Integer tbpartitions) {
            this.tbpartitions = tbpartitions;
            return this;
        }
        public Integer getTbpartitions() {
            return this.tbpartitions;
        }

    }

    public static class GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResults extends TeaModel {
        @NameInMap("TableShardResults")
        public java.util.List<GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults> tableShardResults;

        public static GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResults build(java.util.Map<String, ?> map) throws Exception {
            GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResults self = new GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResults();
            return TeaModel.build(map, self);
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResults setTableShardResults(java.util.List<GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults> tableShardResults) {
            this.tableShardResults = tableShardResults;
            return this;
        }
        public java.util.List<GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults> getTableShardResults() {
            return this.tableShardResults;
        }

    }

    public static class GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults extends TeaModel {
        @NameInMap("AllSqlCount")
        public Integer allSqlCount;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DrdsCount")
        public Integer drdsCount;

        @NameInMap("DrdsType")
        public String drdsType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InstId")
        public Integer instId;

        @NameInMap("RdsCount")
        public Integer rdsCount;

        @NameInMap("RdsInstInfos")
        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfos rdsInstInfos;

        @NameInMap("RdsTotalSpace")
        public String rdsTotalSpace;

        @NameInMap("RdsType")
        public String rdsType;

        @NameInMap("SlowSqlCount")
        public Integer slowSqlCount;

        @NameInMap("TableShardResults")
        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResults tableShardResults;

        @NameInMap("TaskId")
        public Integer taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskStatus")
        public String taskStatus;

        public static GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults build(java.util.Map<String, ?> map) throws Exception {
            GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults self = new GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults();
            return TeaModel.build(map, self);
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults setAllSqlCount(Integer allSqlCount) {
            this.allSqlCount = allSqlCount;
            return this;
        }
        public Integer getAllSqlCount() {
            return this.allSqlCount;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults setDrdsCount(Integer drdsCount) {
            this.drdsCount = drdsCount;
            return this;
        }
        public Integer getDrdsCount() {
            return this.drdsCount;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults setDrdsType(String drdsType) {
            this.drdsType = drdsType;
            return this;
        }
        public String getDrdsType() {
            return this.drdsType;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults setInstId(Integer instId) {
            this.instId = instId;
            return this;
        }
        public Integer getInstId() {
            return this.instId;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults setRdsCount(Integer rdsCount) {
            this.rdsCount = rdsCount;
            return this;
        }
        public Integer getRdsCount() {
            return this.rdsCount;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults setRdsInstInfos(GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfos rdsInstInfos) {
            this.rdsInstInfos = rdsInstInfos;
            return this;
        }
        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfos getRdsInstInfos() {
            return this.rdsInstInfos;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults setRdsTotalSpace(String rdsTotalSpace) {
            this.rdsTotalSpace = rdsTotalSpace;
            return this;
        }
        public String getRdsTotalSpace() {
            return this.rdsTotalSpace;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults setRdsType(String rdsType) {
            this.rdsType = rdsType;
            return this;
        }
        public String getRdsType() {
            return this.rdsType;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults setSlowSqlCount(Integer slowSqlCount) {
            this.slowSqlCount = slowSqlCount;
            return this;
        }
        public Integer getSlowSqlCount() {
            return this.slowSqlCount;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults setTableShardResults(GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResults tableShardResults) {
            this.tableShardResults = tableShardResults;
            return this;
        }
        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResults getTableShardResults() {
            return this.tableShardResults;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

    public static class GetBatchEvaluateTaskReportResponseBodyData extends TeaModel {
        @NameInMap("EvaluateResults")
        public java.util.List<GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults> evaluateResults;

        public static GetBatchEvaluateTaskReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBatchEvaluateTaskReportResponseBodyData self = new GetBatchEvaluateTaskReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBatchEvaluateTaskReportResponseBodyData setEvaluateResults(java.util.List<GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults> evaluateResults) {
            this.evaluateResults = evaluateResults;
            return this;
        }
        public java.util.List<GetBatchEvaluateTaskReportResponseBodyDataEvaluateResults> getEvaluateResults() {
            return this.evaluateResults;
        }

    }

}
