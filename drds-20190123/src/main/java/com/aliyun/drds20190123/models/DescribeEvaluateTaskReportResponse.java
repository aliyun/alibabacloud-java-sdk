// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeEvaluateTaskReportResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("EvaluateResult")
    @Validation(required = true)
    public DescribeEvaluateTaskReportResponseEvaluateResult evaluateResult;

    public static DescribeEvaluateTaskReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateTaskReportResponse self = new DescribeEvaluateTaskReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateTaskReportResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEvaluateTaskReportResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeEvaluateTaskReportResponse setEvaluateResult(DescribeEvaluateTaskReportResponseEvaluateResult evaluateResult) {
        this.evaluateResult = evaluateResult;
        return this;
    }
    public DescribeEvaluateTaskReportResponseEvaluateResult getEvaluateResult() {
        return this.evaluateResult;
    }

    public static class DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults extends TeaModel {
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

        @NameInMap("DbShardMethod")
        @Validation(required = true)
        public String dbShardMethod;

        @NameInMap("TbShardMethod")
        @Validation(required = true)
        public String tbShardMethod;

        @NameInMap("OriginDbShardMethod")
        @Validation(required = true)
        public String originDbShardMethod;

        @NameInMap("OriginTbShardMethod")
        @Validation(required = true)
        public String originTbShardMethod;

        public static DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults self = new DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults setShardType(String shardType) {
            this.shardType = shardType;
            return this;
        }
        public String getShardType() {
            return this.shardType;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults setDbShardKey(String dbShardKey) {
            this.dbShardKey = dbShardKey;
            return this;
        }
        public String getDbShardKey() {
            return this.dbShardKey;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults setTbShardKey(String tbShardKey) {
            this.tbShardKey = tbShardKey;
            return this;
        }
        public String getTbShardKey() {
            return this.tbShardKey;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults setTbpartitions(Integer tbpartitions) {
            this.tbpartitions = tbpartitions;
            return this;
        }
        public Integer getTbpartitions() {
            return this.tbpartitions;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults setDbpartitions(Integer dbpartitions) {
            this.dbpartitions = dbpartitions;
            return this;
        }
        public Integer getDbpartitions() {
            return this.dbpartitions;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults setCreateTableSql(String createTableSql) {
            this.createTableSql = createTableSql;
            return this;
        }
        public String getCreateTableSql() {
            return this.createTableSql;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults setSqlCount(Integer sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Integer getSqlCount() {
            return this.sqlCount;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults setShardKeyType(String shardKeyType) {
            this.shardKeyType = shardKeyType;
            return this;
        }
        public String getShardKeyType() {
            return this.shardKeyType;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults setDbShardMethod(String dbShardMethod) {
            this.dbShardMethod = dbShardMethod;
            return this;
        }
        public String getDbShardMethod() {
            return this.dbShardMethod;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults setTbShardMethod(String tbShardMethod) {
            this.tbShardMethod = tbShardMethod;
            return this;
        }
        public String getTbShardMethod() {
            return this.tbShardMethod;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults setOriginDbShardMethod(String originDbShardMethod) {
            this.originDbShardMethod = originDbShardMethod;
            return this;
        }
        public String getOriginDbShardMethod() {
            return this.originDbShardMethod;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults setOriginTbShardMethod(String originTbShardMethod) {
            this.originTbShardMethod = originTbShardMethod;
            return this;
        }
        public String getOriginTbShardMethod() {
            return this.originTbShardMethod;
        }

    }

    public static class DescribeEvaluateTaskReportResponseEvaluateResultTableShardResults extends TeaModel {
        @NameInMap("TableShardResults")
        @Validation(required = true)
        public java.util.List<DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults> tableShardResults;

        public static DescribeEvaluateTaskReportResponseEvaluateResultTableShardResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateTaskReportResponseEvaluateResultTableShardResults self = new DescribeEvaluateTaskReportResponseEvaluateResultTableShardResults();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResults setTableShardResults(java.util.List<DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults> tableShardResults) {
            this.tableShardResults = tableShardResults;
            return this;
        }
        public java.util.List<DescribeEvaluateTaskReportResponseEvaluateResultTableShardResultsTableShardResults> getTableShardResults() {
            return this.tableShardResults;
        }

    }

    public static class DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfosRdsInstInfos extends TeaModel {
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

        public static DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfosRdsInstInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfosRdsInstInfos self = new DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfosRdsInstInfos();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfosRdsInstInfos setInstId(String instId) {
            this.instId = instId;
            return this;
        }
        public String getInstId() {
            return this.instId;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfosRdsInstInfos setRdsUsedSpace(Integer rdsUsedSpace) {
            this.rdsUsedSpace = rdsUsedSpace;
            return this;
        }
        public Integer getRdsUsedSpace() {
            return this.rdsUsedSpace;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfosRdsInstInfos setRdsPeakIopsWeekly(Integer rdsPeakIopsWeekly) {
            this.rdsPeakIopsWeekly = rdsPeakIopsWeekly;
            return this;
        }
        public Integer getRdsPeakIopsWeekly() {
            return this.rdsPeakIopsWeekly;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfosRdsInstInfos setRdsPeakQpsWeekly(Integer rdsPeakQpsWeekly) {
            this.rdsPeakQpsWeekly = rdsPeakQpsWeekly;
            return this;
        }
        public Integer getRdsPeakQpsWeekly() {
            return this.rdsPeakQpsWeekly;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfosRdsInstInfos setRdsPeakSessionsWeekly(Integer rdsPeakSessionsWeekly) {
            this.rdsPeakSessionsWeekly = rdsPeakSessionsWeekly;
            return this;
        }
        public Integer getRdsPeakSessionsWeekly() {
            return this.rdsPeakSessionsWeekly;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfosRdsInstInfos setDataGrowthScale(Integer dataGrowthScale) {
            this.dataGrowthScale = dataGrowthScale;
            return this;
        }
        public Integer getDataGrowthScale() {
            return this.dataGrowthScale;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfosRdsInstInfos setAvgQpsGrowthScale(Integer avgQpsGrowthScale) {
            this.avgQpsGrowthScale = avgQpsGrowthScale;
            return this;
        }
        public Integer getAvgQpsGrowthScale() {
            return this.avgQpsGrowthScale;
        }

    }

    public static class DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfos extends TeaModel {
        @NameInMap("RdsInstInfos")
        @Validation(required = true)
        public java.util.List<DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfosRdsInstInfos> rdsInstInfos;

        public static DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfos self = new DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfos();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfos setRdsInstInfos(java.util.List<DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfosRdsInstInfos> rdsInstInfos) {
            this.rdsInstInfos = rdsInstInfos;
            return this;
        }
        public java.util.List<DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfosRdsInstInfos> getRdsInstInfos() {
            return this.rdsInstInfos;
        }

    }

    public static class DescribeEvaluateTaskReportResponseEvaluateResult extends TeaModel {
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
        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResults tableShardResults;

        @NameInMap("RdsInstInfos")
        @Validation(required = true)
        public DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfos rdsInstInfos;

        public static DescribeEvaluateTaskReportResponseEvaluateResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateTaskReportResponseEvaluateResult self = new DescribeEvaluateTaskReportResponseEvaluateResult();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateTaskReportResponseEvaluateResult setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResult setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResult setInstId(Integer instId) {
            this.instId = instId;
            return this;
        }
        public Integer getInstId() {
            return this.instId;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResult setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResult setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResult setRdsType(String rdsType) {
            this.rdsType = rdsType;
            return this;
        }
        public String getRdsType() {
            return this.rdsType;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResult setRdsCount(Integer rdsCount) {
            this.rdsCount = rdsCount;
            return this;
        }
        public Integer getRdsCount() {
            return this.rdsCount;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResult setRdsTotalSpace(String rdsTotalSpace) {
            this.rdsTotalSpace = rdsTotalSpace;
            return this;
        }
        public String getRdsTotalSpace() {
            return this.rdsTotalSpace;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResult setDrdsType(String drdsType) {
            this.drdsType = drdsType;
            return this;
        }
        public String getDrdsType() {
            return this.drdsType;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResult setDrdsCount(Integer drdsCount) {
            this.drdsCount = drdsCount;
            return this;
        }
        public Integer getDrdsCount() {
            return this.drdsCount;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResult setAllSqlCount(Integer allSqlCount) {
            this.allSqlCount = allSqlCount;
            return this;
        }
        public Integer getAllSqlCount() {
            return this.allSqlCount;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResult setSlowSqlCount(Integer slowSqlCount) {
            this.slowSqlCount = slowSqlCount;
            return this;
        }
        public Integer getSlowSqlCount() {
            return this.slowSqlCount;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResult setTableShardResults(DescribeEvaluateTaskReportResponseEvaluateResultTableShardResults tableShardResults) {
            this.tableShardResults = tableShardResults;
            return this;
        }
        public DescribeEvaluateTaskReportResponseEvaluateResultTableShardResults getTableShardResults() {
            return this.tableShardResults;
        }

        public DescribeEvaluateTaskReportResponseEvaluateResult setRdsInstInfos(DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfos rdsInstInfos) {
            this.rdsInstInfos = rdsInstInfos;
            return this;
        }
        public DescribeEvaluateTaskReportResponseEvaluateResultRdsInstInfos getRdsInstInfos() {
            return this.rdsInstInfos;
        }

    }

}
