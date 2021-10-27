// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeEvaluateTaskReportResponseBody extends TeaModel {
    @NameInMap("EvaluateResult")
    public DescribeEvaluateTaskReportResponseBodyEvaluateResult evaluateResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeEvaluateTaskReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateTaskReportResponseBody self = new DescribeEvaluateTaskReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateTaskReportResponseBody setEvaluateResult(DescribeEvaluateTaskReportResponseBodyEvaluateResult evaluateResult) {
        this.evaluateResult = evaluateResult;
        return this;
    }
    public DescribeEvaluateTaskReportResponseBodyEvaluateResult getEvaluateResult() {
        return this.evaluateResult;
    }

    public DescribeEvaluateTaskReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEvaluateTaskReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfosRdsInstInfos extends TeaModel {
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

        public static DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfosRdsInstInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfosRdsInstInfos self = new DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfosRdsInstInfos();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfosRdsInstInfos setAvgQpsGrowthScale(Integer avgQpsGrowthScale) {
            this.avgQpsGrowthScale = avgQpsGrowthScale;
            return this;
        }
        public Integer getAvgQpsGrowthScale() {
            return this.avgQpsGrowthScale;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfosRdsInstInfos setDataGrowthScale(Integer dataGrowthScale) {
            this.dataGrowthScale = dataGrowthScale;
            return this;
        }
        public Integer getDataGrowthScale() {
            return this.dataGrowthScale;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfosRdsInstInfos setInstId(String instId) {
            this.instId = instId;
            return this;
        }
        public String getInstId() {
            return this.instId;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfosRdsInstInfos setRdsPeakIopsWeekly(Integer rdsPeakIopsWeekly) {
            this.rdsPeakIopsWeekly = rdsPeakIopsWeekly;
            return this;
        }
        public Integer getRdsPeakIopsWeekly() {
            return this.rdsPeakIopsWeekly;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfosRdsInstInfos setRdsPeakQpsWeekly(Integer rdsPeakQpsWeekly) {
            this.rdsPeakQpsWeekly = rdsPeakQpsWeekly;
            return this;
        }
        public Integer getRdsPeakQpsWeekly() {
            return this.rdsPeakQpsWeekly;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfosRdsInstInfos setRdsPeakSessionsWeekly(Integer rdsPeakSessionsWeekly) {
            this.rdsPeakSessionsWeekly = rdsPeakSessionsWeekly;
            return this;
        }
        public Integer getRdsPeakSessionsWeekly() {
            return this.rdsPeakSessionsWeekly;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfosRdsInstInfos setRdsUsedSpace(Integer rdsUsedSpace) {
            this.rdsUsedSpace = rdsUsedSpace;
            return this;
        }
        public Integer getRdsUsedSpace() {
            return this.rdsUsedSpace;
        }

    }

    public static class DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfos extends TeaModel {
        @NameInMap("RdsInstInfos")
        public java.util.List<DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfosRdsInstInfos> rdsInstInfos;

        public static DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfos self = new DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfos();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfos setRdsInstInfos(java.util.List<DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfosRdsInstInfos> rdsInstInfos) {
            this.rdsInstInfos = rdsInstInfos;
            return this;
        }
        public java.util.List<DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfosRdsInstInfos> getRdsInstInfos() {
            return this.rdsInstInfos;
        }

    }

    public static class DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults extends TeaModel {
        @NameInMap("CreateTableSql")
        public String createTableSql;

        @NameInMap("DbShardKey")
        public String dbShardKey;

        @NameInMap("DbShardMethod")
        public String dbShardMethod;

        @NameInMap("Dbpartitions")
        public Integer dbpartitions;

        @NameInMap("OriginDbShardMethod")
        public String originDbShardMethod;

        @NameInMap("OriginTbShardMethod")
        public String originTbShardMethod;

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

        @NameInMap("TbShardMethod")
        public String tbShardMethod;

        @NameInMap("Tbpartitions")
        public Integer tbpartitions;

        public static DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults self = new DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults setCreateTableSql(String createTableSql) {
            this.createTableSql = createTableSql;
            return this;
        }
        public String getCreateTableSql() {
            return this.createTableSql;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults setDbShardKey(String dbShardKey) {
            this.dbShardKey = dbShardKey;
            return this;
        }
        public String getDbShardKey() {
            return this.dbShardKey;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults setDbShardMethod(String dbShardMethod) {
            this.dbShardMethod = dbShardMethod;
            return this;
        }
        public String getDbShardMethod() {
            return this.dbShardMethod;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults setDbpartitions(Integer dbpartitions) {
            this.dbpartitions = dbpartitions;
            return this;
        }
        public Integer getDbpartitions() {
            return this.dbpartitions;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults setOriginDbShardMethod(String originDbShardMethod) {
            this.originDbShardMethod = originDbShardMethod;
            return this;
        }
        public String getOriginDbShardMethod() {
            return this.originDbShardMethod;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults setOriginTbShardMethod(String originTbShardMethod) {
            this.originTbShardMethod = originTbShardMethod;
            return this;
        }
        public String getOriginTbShardMethod() {
            return this.originTbShardMethod;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults setShardKeyType(String shardKeyType) {
            this.shardKeyType = shardKeyType;
            return this;
        }
        public String getShardKeyType() {
            return this.shardKeyType;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults setShardType(String shardType) {
            this.shardType = shardType;
            return this;
        }
        public String getShardType() {
            return this.shardType;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults setSqlCount(Integer sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Integer getSqlCount() {
            return this.sqlCount;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults setTbShardKey(String tbShardKey) {
            this.tbShardKey = tbShardKey;
            return this;
        }
        public String getTbShardKey() {
            return this.tbShardKey;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults setTbShardMethod(String tbShardMethod) {
            this.tbShardMethod = tbShardMethod;
            return this;
        }
        public String getTbShardMethod() {
            return this.tbShardMethod;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults setTbpartitions(Integer tbpartitions) {
            this.tbpartitions = tbpartitions;
            return this;
        }
        public Integer getTbpartitions() {
            return this.tbpartitions;
        }

    }

    public static class DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResults extends TeaModel {
        @NameInMap("TableShardResults")
        public java.util.List<DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults> tableShardResults;

        public static DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResults self = new DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResults();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResults setTableShardResults(java.util.List<DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults> tableShardResults) {
            this.tableShardResults = tableShardResults;
            return this;
        }
        public java.util.List<DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResultsTableShardResults> getTableShardResults() {
            return this.tableShardResults;
        }

    }

    public static class DescribeEvaluateTaskReportResponseBodyEvaluateResult extends TeaModel {
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
        public DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfos rdsInstInfos;

        @NameInMap("RdsTotalSpace")
        public String rdsTotalSpace;

        @NameInMap("RdsType")
        public String rdsType;

        @NameInMap("SlowSqlCount")
        public Integer slowSqlCount;

        @NameInMap("TableShardResults")
        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResults tableShardResults;

        @NameInMap("TaskId")
        public Integer taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskStatus")
        public String taskStatus;

        public static DescribeEvaluateTaskReportResponseBodyEvaluateResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateTaskReportResponseBodyEvaluateResult self = new DescribeEvaluateTaskReportResponseBodyEvaluateResult();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResult setAllSqlCount(Integer allSqlCount) {
            this.allSqlCount = allSqlCount;
            return this;
        }
        public Integer getAllSqlCount() {
            return this.allSqlCount;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResult setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResult setDrdsCount(Integer drdsCount) {
            this.drdsCount = drdsCount;
            return this;
        }
        public Integer getDrdsCount() {
            return this.drdsCount;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResult setDrdsType(String drdsType) {
            this.drdsType = drdsType;
            return this;
        }
        public String getDrdsType() {
            return this.drdsType;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResult setInstId(Integer instId) {
            this.instId = instId;
            return this;
        }
        public Integer getInstId() {
            return this.instId;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResult setRdsCount(Integer rdsCount) {
            this.rdsCount = rdsCount;
            return this;
        }
        public Integer getRdsCount() {
            return this.rdsCount;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResult setRdsInstInfos(DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfos rdsInstInfos) {
            this.rdsInstInfos = rdsInstInfos;
            return this;
        }
        public DescribeEvaluateTaskReportResponseBodyEvaluateResultRdsInstInfos getRdsInstInfos() {
            return this.rdsInstInfos;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResult setRdsTotalSpace(String rdsTotalSpace) {
            this.rdsTotalSpace = rdsTotalSpace;
            return this;
        }
        public String getRdsTotalSpace() {
            return this.rdsTotalSpace;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResult setRdsType(String rdsType) {
            this.rdsType = rdsType;
            return this;
        }
        public String getRdsType() {
            return this.rdsType;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResult setSlowSqlCount(Integer slowSqlCount) {
            this.slowSqlCount = slowSqlCount;
            return this;
        }
        public Integer getSlowSqlCount() {
            return this.slowSqlCount;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResult setTableShardResults(DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResults tableShardResults) {
            this.tableShardResults = tableShardResults;
            return this;
        }
        public DescribeEvaluateTaskReportResponseBodyEvaluateResultTableShardResults getTableShardResults() {
            return this.tableShardResults;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResult setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResult setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeEvaluateTaskReportResponseBodyEvaluateResult setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
