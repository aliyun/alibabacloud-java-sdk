// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetFullRequestStatResultByInstanceIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetFullRequestStatResultByInstanceIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetFullRequestStatResultByInstanceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFullRequestStatResultByInstanceIdResponseBody self = new GetFullRequestStatResultByInstanceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFullRequestStatResultByInstanceIdResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetFullRequestStatResultByInstanceIdResponseBody setData(GetFullRequestStatResultByInstanceIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFullRequestStatResultByInstanceIdResponseBodyData getData() {
        return this.data;
    }

    public GetFullRequestStatResultByInstanceIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFullRequestStatResultByInstanceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFullRequestStatResultByInstanceIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFullRequestStatResultByInstanceIdResponseBodyDataResultList extends TeaModel {
        @NameInMap("AvgExaminedRows")
        public Double avgExaminedRows;

        @NameInMap("AvgFetchRows")
        public Long avgFetchRows;

        @NameInMap("AvgLockWaitTime")
        public Double avgLockWaitTime;

        @NameInMap("AvgLogicalRead")
        public Double avgLogicalRead;

        @NameInMap("AvgPhysicalAsyncRead")
        public Long avgPhysicalAsyncRead;

        @NameInMap("AvgPhysicalSyncRead")
        public Long avgPhysicalSyncRead;

        @NameInMap("AvgReturnedRows")
        public Double avgReturnedRows;

        @NameInMap("AvgRt")
        public Double avgRt;

        @NameInMap("AvgSqlCount")
        public Long avgSqlCount;

        @NameInMap("AvgUpdatedRows")
        public Long avgUpdatedRows;

        @NameInMap("Count")
        public Long count;

        @NameInMap("CountRate")
        public Double countRate;

        @NameInMap("Database")
        public String database;

        @NameInMap("ErrorCount")
        public Long errorCount;

        @NameInMap("ExaminedRows")
        public Long examinedRows;

        @NameInMap("FetchRows")
        public Long fetchRows;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("LockWaitTime")
        public Double lockWaitTime;

        @NameInMap("LogicalRead")
        public Long logicalRead;

        @NameInMap("PhysicalAsyncRead")
        public Long physicalAsyncRead;

        @NameInMap("PhysicalSyncRead")
        public Long physicalSyncRead;

        @NameInMap("Port")
        public Long port;

        @NameInMap("Psql")
        public String psql;

        @NameInMap("Rows")
        public Long rows;

        @NameInMap("RtGreaterThanOneSecondCount")
        public Long rtGreaterThanOneSecondCount;

        @NameInMap("RtRate")
        public Double rtRate;

        @NameInMap("SqlCount")
        public Long sqlCount;

        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SumUpdatedRows")
        public Long sumUpdatedRows;

        @NameInMap("Tables")
        public java.util.List<String> tables;

        @NameInMap("Version")
        public Long version;

        @NameInMap("VpcId")
        public String vpcId;

        public static GetFullRequestStatResultByInstanceIdResponseBodyDataResultList build(java.util.Map<String, ?> map) throws Exception {
            GetFullRequestStatResultByInstanceIdResponseBodyDataResultList self = new GetFullRequestStatResultByInstanceIdResponseBodyDataResultList();
            return TeaModel.build(map, self);
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setAvgExaminedRows(Double avgExaminedRows) {
            this.avgExaminedRows = avgExaminedRows;
            return this;
        }
        public Double getAvgExaminedRows() {
            return this.avgExaminedRows;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setAvgFetchRows(Long avgFetchRows) {
            this.avgFetchRows = avgFetchRows;
            return this;
        }
        public Long getAvgFetchRows() {
            return this.avgFetchRows;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setAvgLockWaitTime(Double avgLockWaitTime) {
            this.avgLockWaitTime = avgLockWaitTime;
            return this;
        }
        public Double getAvgLockWaitTime() {
            return this.avgLockWaitTime;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setAvgLogicalRead(Double avgLogicalRead) {
            this.avgLogicalRead = avgLogicalRead;
            return this;
        }
        public Double getAvgLogicalRead() {
            return this.avgLogicalRead;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setAvgPhysicalAsyncRead(Long avgPhysicalAsyncRead) {
            this.avgPhysicalAsyncRead = avgPhysicalAsyncRead;
            return this;
        }
        public Long getAvgPhysicalAsyncRead() {
            return this.avgPhysicalAsyncRead;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setAvgPhysicalSyncRead(Long avgPhysicalSyncRead) {
            this.avgPhysicalSyncRead = avgPhysicalSyncRead;
            return this;
        }
        public Long getAvgPhysicalSyncRead() {
            return this.avgPhysicalSyncRead;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setAvgReturnedRows(Double avgReturnedRows) {
            this.avgReturnedRows = avgReturnedRows;
            return this;
        }
        public Double getAvgReturnedRows() {
            return this.avgReturnedRows;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setAvgRt(Double avgRt) {
            this.avgRt = avgRt;
            return this;
        }
        public Double getAvgRt() {
            return this.avgRt;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setAvgSqlCount(Long avgSqlCount) {
            this.avgSqlCount = avgSqlCount;
            return this;
        }
        public Long getAvgSqlCount() {
            return this.avgSqlCount;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setAvgUpdatedRows(Long avgUpdatedRows) {
            this.avgUpdatedRows = avgUpdatedRows;
            return this;
        }
        public Long getAvgUpdatedRows() {
            return this.avgUpdatedRows;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setCountRate(Double countRate) {
            this.countRate = countRate;
            return this;
        }
        public Double getCountRate() {
            return this.countRate;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setExaminedRows(Long examinedRows) {
            this.examinedRows = examinedRows;
            return this;
        }
        public Long getExaminedRows() {
            return this.examinedRows;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setFetchRows(Long fetchRows) {
            this.fetchRows = fetchRows;
            return this;
        }
        public Long getFetchRows() {
            return this.fetchRows;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setLockWaitTime(Double lockWaitTime) {
            this.lockWaitTime = lockWaitTime;
            return this;
        }
        public Double getLockWaitTime() {
            return this.lockWaitTime;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setLogicalRead(Long logicalRead) {
            this.logicalRead = logicalRead;
            return this;
        }
        public Long getLogicalRead() {
            return this.logicalRead;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setPhysicalAsyncRead(Long physicalAsyncRead) {
            this.physicalAsyncRead = physicalAsyncRead;
            return this;
        }
        public Long getPhysicalAsyncRead() {
            return this.physicalAsyncRead;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setPhysicalSyncRead(Long physicalSyncRead) {
            this.physicalSyncRead = physicalSyncRead;
            return this;
        }
        public Long getPhysicalSyncRead() {
            return this.physicalSyncRead;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setPsql(String psql) {
            this.psql = psql;
            return this;
        }
        public String getPsql() {
            return this.psql;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setRows(Long rows) {
            this.rows = rows;
            return this;
        }
        public Long getRows() {
            return this.rows;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setRtGreaterThanOneSecondCount(Long rtGreaterThanOneSecondCount) {
            this.rtGreaterThanOneSecondCount = rtGreaterThanOneSecondCount;
            return this;
        }
        public Long getRtGreaterThanOneSecondCount() {
            return this.rtGreaterThanOneSecondCount;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setRtRate(Double rtRate) {
            this.rtRate = rtRate;
            return this;
        }
        public Double getRtRate() {
            return this.rtRate;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setSqlCount(Long sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Long getSqlCount() {
            return this.sqlCount;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setSumUpdatedRows(Long sumUpdatedRows) {
            this.sumUpdatedRows = sumUpdatedRows;
            return this;
        }
        public Long getSumUpdatedRows() {
            return this.sumUpdatedRows;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResultList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetFullRequestStatResultByInstanceIdResponseBodyDataResult extends TeaModel {
        @NameInMap("List")
        public java.util.List<GetFullRequestStatResultByInstanceIdResponseBodyDataResultList> list;

        @NameInMap("Total")
        public Long total;

        public static GetFullRequestStatResultByInstanceIdResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetFullRequestStatResultByInstanceIdResponseBodyDataResult self = new GetFullRequestStatResultByInstanceIdResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResult setList(java.util.List<GetFullRequestStatResultByInstanceIdResponseBodyDataResultList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetFullRequestStatResultByInstanceIdResponseBodyDataResultList> getList() {
            return this.list;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyDataResult setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetFullRequestStatResultByInstanceIdResponseBodyData extends TeaModel {
        @NameInMap("Fail")
        public Boolean fail;

        @NameInMap("IsFinish")
        public Boolean isFinish;

        @NameInMap("Result")
        public GetFullRequestStatResultByInstanceIdResponseBodyDataResult result;

        @NameInMap("ResultId")
        public String resultId;

        @NameInMap("State")
        public String state;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetFullRequestStatResultByInstanceIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFullRequestStatResultByInstanceIdResponseBodyData self = new GetFullRequestStatResultByInstanceIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyData setFail(Boolean fail) {
            this.fail = fail;
            return this;
        }
        public Boolean getFail() {
            return this.fail;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyData setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyData setResult(GetFullRequestStatResultByInstanceIdResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public GetFullRequestStatResultByInstanceIdResponseBodyDataResult getResult() {
            return this.result;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyData setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetFullRequestStatResultByInstanceIdResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
