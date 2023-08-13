// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetFullRequestOriginStatByInstanceIdResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetFullRequestOriginStatByInstanceIdResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetFullRequestOriginStatByInstanceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFullRequestOriginStatByInstanceIdResponseBody self = new GetFullRequestOriginStatByInstanceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFullRequestOriginStatByInstanceIdResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetFullRequestOriginStatByInstanceIdResponseBody setData(GetFullRequestOriginStatByInstanceIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFullRequestOriginStatByInstanceIdResponseBodyData getData() {
        return this.data;
    }

    public GetFullRequestOriginStatByInstanceIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFullRequestOriginStatByInstanceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFullRequestOriginStatByInstanceIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFullRequestOriginStatByInstanceIdResponseBodyDataList extends TeaModel {
        /**
         * <p>The average number of scanned rows.</p>
         * <br>
         * <p>> This parameter is returned only for ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and PolarDB for MySQL databases.</p>
         */
        @NameInMap("AvgExaminedRows")
        public Double avgExaminedRows;

        /**
         * <p>The average number of rows that are fetched from data nodes by compute nodes on the PolarDB-X 2.0 instance.</p>
         */
        @NameInMap("AvgFetchRows")
        public Long avgFetchRows;

        /**
         * <p>The average lock wait duration. Unit: seconds.</p>
         */
        @NameInMap("AvgLockWaitTime")
        public Double avgLockWaitTime;

        /**
         * <p>The average number of logical reads.</p>
         */
        @NameInMap("AvgLogicalRead")
        public Double avgLogicalRead;

        /**
         * <p>The average number of physical asynchronous reads.</p>
         */
        @NameInMap("AvgPhysicalAsyncRead")
        public Long avgPhysicalAsyncRead;

        /**
         * <p>The average number of physical synchronous reads.</p>
         */
        @NameInMap("AvgPhysicalSyncRead")
        public Double avgPhysicalSyncRead;

        /**
         * <p>The average number of returned rows.</p>
         */
        @NameInMap("AvgReturnedRows")
        public Double avgReturnedRows;

        /**
         * <p>The average number of rows.</p>
         */
        @NameInMap("AvgRows")
        public Long avgRows;

        /**
         * <p>The average execution duration.</p>
         */
        @NameInMap("AvgRt")
        public Double avgRt;

        /**
         * <p>The average number of SQL statements.</p>
         */
        @NameInMap("AvgSqlCount")
        public Long avgSqlCount;

        /**
         * <p>The average number of updated rows.</p>
         * <br>
         * <p>> This parameter is returned only for ApsaraDB RDS for MySQL and PolarDB-X 2.0 databases.</p>
         */
        @NameInMap("AvgUpdatedRows")
        public Double avgUpdatedRows;

        /**
         * <p>The total number of executions.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The percentage of the total number of executions.</p>
         */
        @NameInMap("CountRate")
        public Double countRate;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The number of failed executions.</p>
         */
        @NameInMap("ErrorCount")
        public Long errorCount;

        /**
         * <p>The total number of scanned rows.</p>
         * <br>
         * <p>> This parameter is returned only for ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and PolarDB for MySQL databases.</p>
         */
        @NameInMap("ExaminedRows")
        public Long examinedRows;

        /**
         * <p>The number of rows that are fetched from data nodes by compute nodes on the PolarDB-X 2.0 instance.</p>
         */
        @NameInMap("FetchRows")
        public Long fetchRows;

        /**
         * <p>The network address of the database instance.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The IP address of the client that executes the SQL statement.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The lock wait duration. Unit: seconds.</p>
         */
        @NameInMap("LockWaitTime")
        public Double lockWaitTime;

        /**
         * <p>The number of logical reads.</p>
         */
        @NameInMap("LogicalRead")
        public Long logicalRead;

        /**
         * <p>The IP address of the client that executes the SQL statement.</p>
         */
        @NameInMap("OriginHost")
        public String originHost;

        /**
         * <p>The number of physical asynchronous reads.</p>
         */
        @NameInMap("PhysicalAsyncRead")
        public Long physicalAsyncRead;

        /**
         * <p>The number of physical synchronous reads.</p>
         */
        @NameInMap("PhysicalSyncRead")
        public Long physicalSyncRead;

        /**
         * <p>The port number that is used to connect to the database instance.</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The total number of rows updated or returned by the compute nodes of the PolarDB-X 2.0 instance.</p>
         */
        @NameInMap("Rows")
        public Long rows;

        /**
         * <p>The number of SQL statements that take longer than 1 second to execute.</p>
         */
        @NameInMap("RtGreaterThanOneSecondCount")
        public Long rtGreaterThanOneSecondCount;

        /**
         * <p>The execution duration percentage.</p>
         */
        @NameInMap("RtRate")
        public Double rtRate;

        /**
         * <p>The number of SQL statements.</p>
         */
        @NameInMap("SqlCount")
        public Long sqlCount;

        /**
         * <p>The total number of updated rows.</p>
         */
        @NameInMap("SumUpdatedRows")
        public Long sumUpdatedRows;

        /**
         * <p>The version number.</p>
         */
        @NameInMap("Version")
        public Long version;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetFullRequestOriginStatByInstanceIdResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetFullRequestOriginStatByInstanceIdResponseBodyDataList self = new GetFullRequestOriginStatByInstanceIdResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setAvgExaminedRows(Double avgExaminedRows) {
            this.avgExaminedRows = avgExaminedRows;
            return this;
        }
        public Double getAvgExaminedRows() {
            return this.avgExaminedRows;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setAvgFetchRows(Long avgFetchRows) {
            this.avgFetchRows = avgFetchRows;
            return this;
        }
        public Long getAvgFetchRows() {
            return this.avgFetchRows;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setAvgLockWaitTime(Double avgLockWaitTime) {
            this.avgLockWaitTime = avgLockWaitTime;
            return this;
        }
        public Double getAvgLockWaitTime() {
            return this.avgLockWaitTime;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setAvgLogicalRead(Double avgLogicalRead) {
            this.avgLogicalRead = avgLogicalRead;
            return this;
        }
        public Double getAvgLogicalRead() {
            return this.avgLogicalRead;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setAvgPhysicalAsyncRead(Long avgPhysicalAsyncRead) {
            this.avgPhysicalAsyncRead = avgPhysicalAsyncRead;
            return this;
        }
        public Long getAvgPhysicalAsyncRead() {
            return this.avgPhysicalAsyncRead;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setAvgPhysicalSyncRead(Double avgPhysicalSyncRead) {
            this.avgPhysicalSyncRead = avgPhysicalSyncRead;
            return this;
        }
        public Double getAvgPhysicalSyncRead() {
            return this.avgPhysicalSyncRead;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setAvgReturnedRows(Double avgReturnedRows) {
            this.avgReturnedRows = avgReturnedRows;
            return this;
        }
        public Double getAvgReturnedRows() {
            return this.avgReturnedRows;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setAvgRows(Long avgRows) {
            this.avgRows = avgRows;
            return this;
        }
        public Long getAvgRows() {
            return this.avgRows;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setAvgRt(Double avgRt) {
            this.avgRt = avgRt;
            return this;
        }
        public Double getAvgRt() {
            return this.avgRt;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setAvgSqlCount(Long avgSqlCount) {
            this.avgSqlCount = avgSqlCount;
            return this;
        }
        public Long getAvgSqlCount() {
            return this.avgSqlCount;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setAvgUpdatedRows(Double avgUpdatedRows) {
            this.avgUpdatedRows = avgUpdatedRows;
            return this;
        }
        public Double getAvgUpdatedRows() {
            return this.avgUpdatedRows;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setCountRate(Double countRate) {
            this.countRate = countRate;
            return this;
        }
        public Double getCountRate() {
            return this.countRate;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setExaminedRows(Long examinedRows) {
            this.examinedRows = examinedRows;
            return this;
        }
        public Long getExaminedRows() {
            return this.examinedRows;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setFetchRows(Long fetchRows) {
            this.fetchRows = fetchRows;
            return this;
        }
        public Long getFetchRows() {
            return this.fetchRows;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setLockWaitTime(Double lockWaitTime) {
            this.lockWaitTime = lockWaitTime;
            return this;
        }
        public Double getLockWaitTime() {
            return this.lockWaitTime;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setLogicalRead(Long logicalRead) {
            this.logicalRead = logicalRead;
            return this;
        }
        public Long getLogicalRead() {
            return this.logicalRead;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setOriginHost(String originHost) {
            this.originHost = originHost;
            return this;
        }
        public String getOriginHost() {
            return this.originHost;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setPhysicalAsyncRead(Long physicalAsyncRead) {
            this.physicalAsyncRead = physicalAsyncRead;
            return this;
        }
        public Long getPhysicalAsyncRead() {
            return this.physicalAsyncRead;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setPhysicalSyncRead(Long physicalSyncRead) {
            this.physicalSyncRead = physicalSyncRead;
            return this;
        }
        public Long getPhysicalSyncRead() {
            return this.physicalSyncRead;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setRows(Long rows) {
            this.rows = rows;
            return this;
        }
        public Long getRows() {
            return this.rows;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setRtGreaterThanOneSecondCount(Long rtGreaterThanOneSecondCount) {
            this.rtGreaterThanOneSecondCount = rtGreaterThanOneSecondCount;
            return this;
        }
        public Long getRtGreaterThanOneSecondCount() {
            return this.rtGreaterThanOneSecondCount;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setRtRate(Double rtRate) {
            this.rtRate = rtRate;
            return this;
        }
        public Double getRtRate() {
            return this.rtRate;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setSqlCount(Long sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Long getSqlCount() {
            return this.sqlCount;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setSumUpdatedRows(Long sumUpdatedRows) {
            this.sumUpdatedRows = sumUpdatedRows;
            return this;
        }
        public Long getSumUpdatedRows() {
            return this.sumUpdatedRows;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyDataList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetFullRequestOriginStatByInstanceIdResponseBodyData extends TeaModel {
        /**
         * <p>The details of the full request data.</p>
         */
        @NameInMap("List")
        public java.util.List<GetFullRequestOriginStatByInstanceIdResponseBodyDataList> list;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetFullRequestOriginStatByInstanceIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFullRequestOriginStatByInstanceIdResponseBodyData self = new GetFullRequestOriginStatByInstanceIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyData setList(java.util.List<GetFullRequestOriginStatByInstanceIdResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetFullRequestOriginStatByInstanceIdResponseBodyDataList> getList() {
            return this.list;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
