// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class QuerySqlAnalysisDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public QuerySqlAnalysisDataResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySqlAnalysisDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySqlAnalysisDataResponseBody self = new QuerySqlAnalysisDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySqlAnalysisDataResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QuerySqlAnalysisDataResponseBody setData(QuerySqlAnalysisDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySqlAnalysisDataResponseBodyData getData() {
        return this.data;
    }

    public QuerySqlAnalysisDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySqlAnalysisDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySqlAnalysisDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySqlAnalysisDataResponseBodyDataList extends TeaModel {
        @NameInMap("AvgRowsExamined")
        public Long avgRowsExamined;

        @NameInMap("AvgRt")
        public Double avgRt;

        @NameInMap("Cnt")
        public Long cnt;

        @NameInMap("CurrentEndTime")
        public Long currentEndTime;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("ErrorCnt")
        public Long errorCnt;

        @NameInMap("FirstTime")
        public Long firstTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MaxRowsExamined")
        public Long maxRowsExamined;

        @NameInMap("Sql")
        public String sql;

        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlTextFeature")
        public String sqlTextFeature;

        @NameInMap("SqlType")
        public String sqlType;

        @NameInMap("SumRt")
        public Double sumRt;

        @NameInMap("TableList")
        public String tableList;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Type")
        public String type;

        @NameInMap("UserId")
        public String userId;

        public static QuerySqlAnalysisDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySqlAnalysisDataResponseBodyDataList self = new QuerySqlAnalysisDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QuerySqlAnalysisDataResponseBodyDataList setAvgRowsExamined(Long avgRowsExamined) {
            this.avgRowsExamined = avgRowsExamined;
            return this;
        }
        public Long getAvgRowsExamined() {
            return this.avgRowsExamined;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setAvgRt(Double avgRt) {
            this.avgRt = avgRt;
            return this;
        }
        public Double getAvgRt() {
            return this.avgRt;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setCnt(Long cnt) {
            this.cnt = cnt;
            return this;
        }
        public Long getCnt() {
            return this.cnt;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setCurrentEndTime(Long currentEndTime) {
            this.currentEndTime = currentEndTime;
            return this;
        }
        public Long getCurrentEndTime() {
            return this.currentEndTime;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setErrorCnt(Long errorCnt) {
            this.errorCnt = errorCnt;
            return this;
        }
        public Long getErrorCnt() {
            return this.errorCnt;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setMaxRowsExamined(Long maxRowsExamined) {
            this.maxRowsExamined = maxRowsExamined;
            return this;
        }
        public Long getMaxRowsExamined() {
            return this.maxRowsExamined;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setSqlTextFeature(String sqlTextFeature) {
            this.sqlTextFeature = sqlTextFeature;
            return this;
        }
        public String getSqlTextFeature() {
            return this.sqlTextFeature;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setSumRt(Double sumRt) {
            this.sumRt = sumRt;
            return this;
        }
        public Double getSumRt() {
            return this.sumRt;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setTableList(String tableList) {
            this.tableList = tableList;
            return this;
        }
        public String getTableList() {
            return this.tableList;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QuerySqlAnalysisDataResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QuerySqlAnalysisDataResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QuerySqlAnalysisDataResponseBodyDataList> list;

        @NameInMap("Total")
        public Long total;

        public static QuerySqlAnalysisDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySqlAnalysisDataResponseBodyData self = new QuerySqlAnalysisDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySqlAnalysisDataResponseBodyData setList(java.util.List<QuerySqlAnalysisDataResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QuerySqlAnalysisDataResponseBodyDataList> getList() {
            return this.list;
        }

        public QuerySqlAnalysisDataResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
