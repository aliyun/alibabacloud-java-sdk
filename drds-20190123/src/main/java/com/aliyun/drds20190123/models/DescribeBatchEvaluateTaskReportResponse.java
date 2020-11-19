// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBatchEvaluateTaskReportResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeBatchEvaluateTaskReportResponseData data;

    public static DescribeBatchEvaluateTaskReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchEvaluateTaskReportResponse self = new DescribeBatchEvaluateTaskReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBatchEvaluateTaskReportResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBatchEvaluateTaskReportResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBatchEvaluateTaskReportResponse setData(DescribeBatchEvaluateTaskReportResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeBatchEvaluateTaskReportResponseData getData() {
        return this.data;
    }

    public static class DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults extends TeaModel {
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

        public static DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults self = new DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults();
            return TeaModel.build(map, self);
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setShardType(String shardType) {
            this.shardType = shardType;
            return this;
        }
        public String getShardType() {
            return this.shardType;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setDbShardKey(String dbShardKey) {
            this.dbShardKey = dbShardKey;
            return this;
        }
        public String getDbShardKey() {
            return this.dbShardKey;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setTbShardKey(String tbShardKey) {
            this.tbShardKey = tbShardKey;
            return this;
        }
        public String getTbShardKey() {
            return this.tbShardKey;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setTbpartitions(Integer tbpartitions) {
            this.tbpartitions = tbpartitions;
            return this;
        }
        public Integer getTbpartitions() {
            return this.tbpartitions;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setDbpartitions(Integer dbpartitions) {
            this.dbpartitions = dbpartitions;
            return this;
        }
        public Integer getDbpartitions() {
            return this.dbpartitions;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setCreateTableSql(String createTableSql) {
            this.createTableSql = createTableSql;
            return this;
        }
        public String getCreateTableSql() {
            return this.createTableSql;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setSqlCount(Integer sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Integer getSqlCount() {
            return this.sqlCount;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setShardKeyType(String shardKeyType) {
            this.shardKeyType = shardKeyType;
            return this;
        }
        public String getShardKeyType() {
            return this.shardKeyType;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setDbShardMethod(String dbShardMethod) {
            this.dbShardMethod = dbShardMethod;
            return this;
        }
        public String getDbShardMethod() {
            return this.dbShardMethod;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setTbShardMethod(String tbShardMethod) {
            this.tbShardMethod = tbShardMethod;
            return this;
        }
        public String getTbShardMethod() {
            return this.tbShardMethod;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setOriginDbShardMethod(String originDbShardMethod) {
            this.originDbShardMethod = originDbShardMethod;
            return this;
        }
        public String getOriginDbShardMethod() {
            return this.originDbShardMethod;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults setOriginTbShardMethod(String originTbShardMethod) {
            this.originTbShardMethod = originTbShardMethod;
            return this;
        }
        public String getOriginTbShardMethod() {
            return this.originTbShardMethod;
        }

    }

    public static class DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResults extends TeaModel {
        @NameInMap("TableShardResults")
        @Validation(required = true)
        public java.util.List<DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults> tableShardResults;

        public static DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResults self = new DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResults();
            return TeaModel.build(map, self);
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResults setTableShardResults(java.util.List<DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults> tableShardResults) {
            this.tableShardResults = tableShardResults;
            return this;
        }
        public java.util.List<DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResultsTableShardResults> getTableShardResults() {
            return this.tableShardResults;
        }

    }

    public static class DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos extends TeaModel {
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

        public static DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos self = new DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos();
            return TeaModel.build(map, self);
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos setInstId(String instId) {
            this.instId = instId;
            return this;
        }
        public String getInstId() {
            return this.instId;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos setRdsUsedSpace(Integer rdsUsedSpace) {
            this.rdsUsedSpace = rdsUsedSpace;
            return this;
        }
        public Integer getRdsUsedSpace() {
            return this.rdsUsedSpace;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos setRdsPeakIopsWeekly(Integer rdsPeakIopsWeekly) {
            this.rdsPeakIopsWeekly = rdsPeakIopsWeekly;
            return this;
        }
        public Integer getRdsPeakIopsWeekly() {
            return this.rdsPeakIopsWeekly;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos setRdsPeakQpsWeekly(Integer rdsPeakQpsWeekly) {
            this.rdsPeakQpsWeekly = rdsPeakQpsWeekly;
            return this;
        }
        public Integer getRdsPeakQpsWeekly() {
            return this.rdsPeakQpsWeekly;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos setRdsPeakSessionsWeekly(Integer rdsPeakSessionsWeekly) {
            this.rdsPeakSessionsWeekly = rdsPeakSessionsWeekly;
            return this;
        }
        public Integer getRdsPeakSessionsWeekly() {
            return this.rdsPeakSessionsWeekly;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos setDataGrowthScale(Integer dataGrowthScale) {
            this.dataGrowthScale = dataGrowthScale;
            return this;
        }
        public Integer getDataGrowthScale() {
            return this.dataGrowthScale;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos setAvgQpsGrowthScale(Integer avgQpsGrowthScale) {
            this.avgQpsGrowthScale = avgQpsGrowthScale;
            return this;
        }
        public Integer getAvgQpsGrowthScale() {
            return this.avgQpsGrowthScale;
        }

    }

    public static class DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfos extends TeaModel {
        @NameInMap("RdsInstInfos")
        @Validation(required = true)
        public java.util.List<DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos> rdsInstInfos;

        public static DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfos self = new DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfos();
            return TeaModel.build(map, self);
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfos setRdsInstInfos(java.util.List<DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos> rdsInstInfos) {
            this.rdsInstInfos = rdsInstInfos;
            return this;
        }
        public java.util.List<DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfosRdsInstInfos> getRdsInstInfos() {
            return this.rdsInstInfos;
        }

    }

    public static class DescribeBatchEvaluateTaskReportResponseDataEvaluateResults extends TeaModel {
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
        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResults tableShardResults;

        @NameInMap("RdsInstInfos")
        @Validation(required = true)
        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfos rdsInstInfos;

        public static DescribeBatchEvaluateTaskReportResponseDataEvaluateResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchEvaluateTaskReportResponseDataEvaluateResults self = new DescribeBatchEvaluateTaskReportResponseDataEvaluateResults();
            return TeaModel.build(map, self);
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResults setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResults setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResults setInstId(Integer instId) {
            this.instId = instId;
            return this;
        }
        public Integer getInstId() {
            return this.instId;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResults setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResults setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResults setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResults setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResults setRdsType(String rdsType) {
            this.rdsType = rdsType;
            return this;
        }
        public String getRdsType() {
            return this.rdsType;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResults setRdsCount(Integer rdsCount) {
            this.rdsCount = rdsCount;
            return this;
        }
        public Integer getRdsCount() {
            return this.rdsCount;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResults setRdsTotalSpace(String rdsTotalSpace) {
            this.rdsTotalSpace = rdsTotalSpace;
            return this;
        }
        public String getRdsTotalSpace() {
            return this.rdsTotalSpace;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResults setDrdsType(String drdsType) {
            this.drdsType = drdsType;
            return this;
        }
        public String getDrdsType() {
            return this.drdsType;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResults setDrdsCount(Integer drdsCount) {
            this.drdsCount = drdsCount;
            return this;
        }
        public Integer getDrdsCount() {
            return this.drdsCount;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResults setAllSqlCount(Integer allSqlCount) {
            this.allSqlCount = allSqlCount;
            return this;
        }
        public Integer getAllSqlCount() {
            return this.allSqlCount;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResults setSlowSqlCount(Integer slowSqlCount) {
            this.slowSqlCount = slowSqlCount;
            return this;
        }
        public Integer getSlowSqlCount() {
            return this.slowSqlCount;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResults setTableShardResults(DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResults tableShardResults) {
            this.tableShardResults = tableShardResults;
            return this;
        }
        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsTableShardResults getTableShardResults() {
            return this.tableShardResults;
        }

        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResults setRdsInstInfos(DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfos rdsInstInfos) {
            this.rdsInstInfos = rdsInstInfos;
            return this;
        }
        public DescribeBatchEvaluateTaskReportResponseDataEvaluateResultsRdsInstInfos getRdsInstInfos() {
            return this.rdsInstInfos;
        }

    }

    public static class DescribeBatchEvaluateTaskReportResponseData extends TeaModel {
        @NameInMap("EvaluateResults")
        @Validation(required = true)
        public java.util.List<DescribeBatchEvaluateTaskReportResponseDataEvaluateResults> evaluateResults;

        public static DescribeBatchEvaluateTaskReportResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchEvaluateTaskReportResponseData self = new DescribeBatchEvaluateTaskReportResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeBatchEvaluateTaskReportResponseData setEvaluateResults(java.util.List<DescribeBatchEvaluateTaskReportResponseDataEvaluateResults> evaluateResults) {
            this.evaluateResults = evaluateResults;
            return this;
        }
        public java.util.List<DescribeBatchEvaluateTaskReportResponseDataEvaluateResults> getEvaluateResults() {
            return this.evaluateResults;
        }

    }

}
