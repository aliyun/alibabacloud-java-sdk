// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetFullRequestStatResultByInstanceIdResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetFullRequestStatResultByInstanceIdResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message that contains information such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7172BECE-588A-5961-8126-C216E16B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The average number of scanned rows.</p>
         * <blockquote>
         * <p>This parameter is returned only for ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and PolarDB for MySQL databases.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("AvgExaminedRows")
        public Double avgExaminedRows;

        /**
         * <p>The average number of rows that are fetched by compute nodes from data nodes on the PolarDB-X 2.0 instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AvgFetchRows")
        public Long avgFetchRows;

        /**
         * <p>The average lock wait latency. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.00009589874265269765</p>
         */
        @NameInMap("AvgLockWaitTime")
        public Double avgLockWaitTime;

        /**
         * <p>The average number of logical reads.</p>
         * 
         * <strong>example:</strong>
         * <p>654.4470327860251</p>
         */
        @NameInMap("AvgLogicalRead")
        public Double avgLogicalRead;

        /**
         * <p>The average number of physical asynchronous reads.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AvgPhysicalAsyncRead")
        public Long avgPhysicalAsyncRead;

        /**
         * <p>The average number of physical synchronous reads.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AvgPhysicalSyncRead")
        public Long avgPhysicalSyncRead;

        /**
         * <p>The average number of returned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("AvgReturnedRows")
        public Double avgReturnedRows;

        /**
         * <p>The average execution duration.</p>
         * 
         * <strong>example:</strong>
         * <p>2.499</p>
         */
        @NameInMap("AvgRt")
        public Double avgRt;

        /**
         * <p>The average number of SQL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("AvgSqlCount")
        public Long avgSqlCount;

        /**
         * <p>The average number of updated rows.</p>
         * <blockquote>
         * <p>This parameter is returned only for ApsaraDB RDS for MySQL and PolarDB-X 2.0 databases.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("AvgUpdatedRows")
        public Long avgUpdatedRows;

        /**
         * <p>The total number of executions.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The percentage of the total number of executions.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0586</p>
         */
        @NameInMap("CountRate")
        public Double countRate;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>dbtest01</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The number of failed executions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ErrorCount")
        public Long errorCount;

        /**
         * <p>The total number of scanned rows.</p>
         * <blockquote>
         * <p>This parameter is returned only for ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and PolarDB for MySQL databases.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ExaminedRows")
        public Long examinedRows;

        /**
         * <p>The number of rows that are fetched by compute nodes from data nodes on the PolarDB-X 2.0 instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FetchRows")
        public Long fetchRows;

        /**
         * <p>The IP address of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6dyi58dm6****.mysql.rds.aliy****.com</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The lock wait latency. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1089.4177720290281</p>
         */
        @NameInMap("LockWaitTime")
        public Double lockWaitTime;

        /**
         * <p>The number of logical reads.</p>
         * 
         * <strong>example:</strong>
         * <p>7.434573266E9</p>
         */
        @NameInMap("LogicalRead")
        public Long logicalRead;

        /**
         * <p>The number of physical asynchronous reads.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PhysicalAsyncRead")
        public Long physicalAsyncRead;

        /**
         * <p>The number of physical synchronous reads.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PhysicalSyncRead")
        public Long physicalSyncRead;

        /**
         * <p>The port number that is used to connect to the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The SQL template.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from dbtest01 where ****</p>
         */
        @NameInMap("Psql")
        public String psql;

        /**
         * <p>The total number of rows updated or returned by the compute nodes of the PolarDB-X 2.0 instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Rows")
        public Long rows;

        /**
         * <p>The number of SQL statements that take longer than 1 second to execute.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("RtGreaterThanOneSecondCount")
        public Long rtGreaterThanOneSecondCount;

        /**
         * <p>The execution duration percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>2.499</p>
         */
        @NameInMap("RtRate")
        public Double rtRate;

        /**
         * <p>The number of SQL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SqlCount")
        public Long sqlCount;

        /**
         * <p>The SQL ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d71f82be1eef72bd105128204d2e****</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The total number of updated rows.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SumUpdatedRows")
        public Long sumUpdatedRows;

        /**
         * <p>The names of tables in the database.</p>
         */
        @NameInMap("Tables")
        public java.util.List<String> tables;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Long version;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zentqj1sk4qmolci****</p>
         */
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
        /**
         * <p>The full request data.</p>
         */
        @NameInMap("List")
        public java.util.List<GetFullRequestStatResultByInstanceIdResponseBodyDataResultList> list;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>Indicates whether the asynchronous request failed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Fail")
        public Boolean fail;

        /**
         * <p>Indicates whether the asynchronous request was complete. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFinish")
        public Boolean isFinish;

        /**
         * <p>The returned full request data.</p>
         */
        @NameInMap("Result")
        public GetFullRequestStatResultByInstanceIdResponseBodyDataResult result;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9CB97BC4-6479-55D0-B9D0-EA925AFE****</p>
         */
        @NameInMap("ResultId")
        public String resultId;

        /**
         * <p>The state of the asynchronous request. Valid values:</p>
         * <ul>
         * <li><strong>RUNNING</strong></li>
         * <li><strong>SUCCESS</strong></li>
         * <li><strong>FAIL</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The time when the asynchronous request was sent. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1645668213000</p>
         */
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
