// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBatchEvaluateTaskReportResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeBatchEvaluateTaskReportResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeBatchEvaluateTaskReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchEvaluateTaskReportResponseBody self = new DescribeBatchEvaluateTaskReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBatchEvaluateTaskReportResponseBody setData(DescribeBatchEvaluateTaskReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeBatchEvaluateTaskReportResponseBodyData getData() {
        return this.data;
    }

    public DescribeBatchEvaluateTaskReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBatchEvaluateTaskReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos extends TeaModel {
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

        public static DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos self = new DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos();
            return TeaModel.build(map, self);
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos setAvgQpsGrowthScale(Integer avgQpsGrowthScale) {
            this.avgQpsGrowthScale = avgQpsGrowthScale;
            return this;
        }
        public Integer getAvgQpsGrowthScale() {
            return this.avgQpsGrowthScale;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos setDataGrowthScale(Integer dataGrowthScale) {
            this.dataGrowthScale = dataGrowthScale;
            return this;
        }
        public Integer getDataGrowthScale() {
            return this.dataGrowthScale;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos setInstId(String instId) {
            this.instId = instId;
            return this;
        }
        public String getInstId() {
            return this.instId;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos setRdsPeakIopsWeekly(Integer rdsPeakIopsWeekly) {
            this.rdsPeakIopsWeekly = rdsPeakIopsWeekly;
            return this;
        }
        public Integer getRdsPeakIopsWeekly() {
            return this.rdsPeakIopsWeekly;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos setRdsPeakQpsWeekly(Integer rdsPeakQpsWeekly) {
            this.rdsPeakQpsWeekly = rdsPeakQpsWeekly;
            return this;
        }
        public Integer getRdsPeakQpsWeekly() {
            return this.rdsPeakQpsWeekly;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos setRdsPeakSessionsWeekly(Integer rdsPeakSessionsWeekly) {
            this.rdsPeakSessionsWeekly = rdsPeakSessionsWeekly;
            return this;
        }
        public Integer getRdsPeakSessionsWeekly() {
            return this.rdsPeakSessionsWeekly;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos setRdsUsedSpace(Integer rdsUsedSpace) {
            this.rdsUsedSpace = rdsUsedSpace;
            return this;
        }
        public Integer getRdsUsedSpace() {
            return this.rdsUsedSpace;
        }

    }

    public static class DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfos extends TeaModel {
        @NameInMap("RdsInstInfos")
        public java.util.List<DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos> rdsInstInfos;

        public static DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfos self = new DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfos();
            return TeaModel.build(map, self);
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfos setRdsInstInfos(java.util.List<DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos> rdsInstInfos) {
            this.rdsInstInfos = rdsInstInfos;
            return this;
        }
        public java.util.List<DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfosRdsInstInfos> getRdsInstInfos() {
            return this.rdsInstInfos;
        }

    }

    public static class DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults extends TeaModel {
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

        public static DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults self = new DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults();
            return TeaModel.build(map, self);
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setCreateTableSql(String createTableSql) {
            this.createTableSql = createTableSql;
            return this;
        }
        public String getCreateTableSql() {
            return this.createTableSql;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setDbShardKey(String dbShardKey) {
            this.dbShardKey = dbShardKey;
            return this;
        }
        public String getDbShardKey() {
            return this.dbShardKey;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setDbShardMethod(String dbShardMethod) {
            this.dbShardMethod = dbShardMethod;
            return this;
        }
        public String getDbShardMethod() {
            return this.dbShardMethod;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setDbpartitions(Integer dbpartitions) {
            this.dbpartitions = dbpartitions;
            return this;
        }
        public Integer getDbpartitions() {
            return this.dbpartitions;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setOriginDbShardMethod(String originDbShardMethod) {
            this.originDbShardMethod = originDbShardMethod;
            return this;
        }
        public String getOriginDbShardMethod() {
            return this.originDbShardMethod;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setOriginTbShardMethod(String originTbShardMethod) {
            this.originTbShardMethod = originTbShardMethod;
            return this;
        }
        public String getOriginTbShardMethod() {
            return this.originTbShardMethod;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setShardKeyType(String shardKeyType) {
            this.shardKeyType = shardKeyType;
            return this;
        }
        public String getShardKeyType() {
            return this.shardKeyType;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setShardType(String shardType) {
            this.shardType = shardType;
            return this;
        }
        public String getShardType() {
            return this.shardType;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setSqlCount(Integer sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Integer getSqlCount() {
            return this.sqlCount;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setTbShardKey(String tbShardKey) {
            this.tbShardKey = tbShardKey;
            return this;
        }
        public String getTbShardKey() {
            return this.tbShardKey;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setTbShardMethod(String tbShardMethod) {
            this.tbShardMethod = tbShardMethod;
            return this;
        }
        public String getTbShardMethod() {
            return this.tbShardMethod;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults setTbpartitions(Integer tbpartitions) {
            this.tbpartitions = tbpartitions;
            return this;
        }
        public Integer getTbpartitions() {
            return this.tbpartitions;
        }

    }

    public static class DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResults extends TeaModel {
        @NameInMap("TableShardResults")
        public java.util.List<DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults> tableShardResults;

        public static DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResults self = new DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResults();
            return TeaModel.build(map, self);
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResults setTableShardResults(java.util.List<DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults> tableShardResults) {
            this.tableShardResults = tableShardResults;
            return this;
        }
        public java.util.List<DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResultsTableShardResults> getTableShardResults() {
            return this.tableShardResults;
        }

    }

    public static class DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults extends TeaModel {
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
        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfos rdsInstInfos;

        @NameInMap("RdsTotalSpace")
        public String rdsTotalSpace;

        @NameInMap("RdsType")
        public String rdsType;

        @NameInMap("SlowSqlCount")
        public Integer slowSqlCount;

        @NameInMap("TableShardResults")
        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResults tableShardResults;

        @NameInMap("TaskId")
        public Integer taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskStatus")
        public String taskStatus;

        public static DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults self = new DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults();
            return TeaModel.build(map, self);
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults setAllSqlCount(Integer allSqlCount) {
            this.allSqlCount = allSqlCount;
            return this;
        }
        public Integer getAllSqlCount() {
            return this.allSqlCount;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults setDrdsCount(Integer drdsCount) {
            this.drdsCount = drdsCount;
            return this;
        }
        public Integer getDrdsCount() {
            return this.drdsCount;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults setDrdsType(String drdsType) {
            this.drdsType = drdsType;
            return this;
        }
        public String getDrdsType() {
            return this.drdsType;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults setInstId(Integer instId) {
            this.instId = instId;
            return this;
        }
        public Integer getInstId() {
            return this.instId;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults setRdsCount(Integer rdsCount) {
            this.rdsCount = rdsCount;
            return this;
        }
        public Integer getRdsCount() {
            return this.rdsCount;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults setRdsInstInfos(DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfos rdsInstInfos) {
            this.rdsInstInfos = rdsInstInfos;
            return this;
        }
        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsRdsInstInfos getRdsInstInfos() {
            return this.rdsInstInfos;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults setRdsTotalSpace(String rdsTotalSpace) {
            this.rdsTotalSpace = rdsTotalSpace;
            return this;
        }
        public String getRdsTotalSpace() {
            return this.rdsTotalSpace;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults setRdsType(String rdsType) {
            this.rdsType = rdsType;
            return this;
        }
        public String getRdsType() {
            return this.rdsType;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults setSlowSqlCount(Integer slowSqlCount) {
            this.slowSqlCount = slowSqlCount;
            return this;
        }
        public Integer getSlowSqlCount() {
            return this.slowSqlCount;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults setTableShardResults(DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResults tableShardResults) {
            this.tableShardResults = tableShardResults;
            return this;
        }
        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResultsTableShardResults getTableShardResults() {
            return this.tableShardResults;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

    public static class DescribeBatchEvaluateTaskReportResponseBodyData extends TeaModel {
        @NameInMap("EvaluateResults")
        public java.util.List<DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults> evaluateResults;

        public static DescribeBatchEvaluateTaskReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchEvaluateTaskReportResponseBodyData self = new DescribeBatchEvaluateTaskReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBatchEvaluateTaskReportResponseBodyData setEvaluateResults(java.util.List<DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults> evaluateResults) {
            this.evaluateResults = evaluateResults;
            return this;
        }
        public java.util.List<DescribeBatchEvaluateTaskReportResponseBodyDataEvaluateResults> getEvaluateResults() {
            return this.evaluateResults;
        }

    }

}
