// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetFullRequestSampleByInstanceIdResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetFullRequestSampleByInstanceIdResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message that contains information such as an error code is returned.</p>
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

    public static GetFullRequestSampleByInstanceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFullRequestSampleByInstanceIdResponseBody self = new GetFullRequestSampleByInstanceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFullRequestSampleByInstanceIdResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetFullRequestSampleByInstanceIdResponseBody setData(java.util.List<GetFullRequestSampleByInstanceIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetFullRequestSampleByInstanceIdResponseBodyData> getData() {
        return this.data;
    }

    public GetFullRequestSampleByInstanceIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFullRequestSampleByInstanceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFullRequestSampleByInstanceIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFullRequestSampleByInstanceIdResponseBodyData extends TeaModel {
        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The number of rows fetched by PolarDB-X 2.0 compute nodes.</p>
         */
        @NameInMap("Frows")
        public Long frows;

        /**
         * <p>The lock wait duration. Unit: seconds.</p>
         */
        @NameInMap("LockWaitTime")
        public Double lockWaitTime;

        /**
         * <p>The number of logical reads.</p>
         */
        @NameInMap("LogicalRead")
        public Double logicalRead;

        /**
         * <p>The source IP address.</p>
         */
        @NameInMap("OriginHost")
        public String originHost;

        /**
         * <p>The number of physical asynchronous reads.</p>
         */
        @NameInMap("PhysicalAsyncRead")
        public Double physicalAsyncRead;

        /**
         * <p>The number of physical synchronous reads.</p>
         */
        @NameInMap("PhysicalSyncRead")
        public Double physicalSyncRead;

        /**
         * <p>The number of rows updated or returned on PolarDB-X 2.0 compute nodes.</p>
         */
        @NameInMap("Rows")
        public Long rows;

        /**
         * <p>The total number of scanned rows.</p>
         * <br>
         * <p>> This parameter is returned only for ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and PolarDB for MySQL databases.</p>
         */
        @NameInMap("RowsExamined")
        public Long rowsExamined;

        /**
         * <p>The number of rows returned by the SQL statement.</p>
         */
        @NameInMap("RowsReturned")
        public Long rowsReturned;

        /**
         * <p>The amount of time consumed to execute the SQL statement. Unit: seconds.</p>
         */
        @NameInMap("Rt")
        public Double rt;

        /**
         * <p>The number of scanned rows.</p>
         */
        @NameInMap("ScanRows")
        public Long scanRows;

        /**
         * <p>The number of requests sent from PolarDB-X 2.0 compute nodes to data nodes.</p>
         */
        @NameInMap("Scnt")
        public Long scnt;

        /**
         * <p>The sample SQL statement.</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <p>The SQL statement ID.</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The type of the SQL statement. Valid values: **SELECT**, **INSERT**, **UPDATE**, **DELETE**, **LOGIN**, **LOGOUT**, **MERGE**, **ALTER**, **CREATEINDEX**, **DROPINDEX**, **CREATE**, **DROP**, **SET**, **DESC**, **REPLACE**, **CALL**, **BEGIN**, **DESCRIBE**, **ROLLBACK**, **FLUSH**, **USE**, **SHOW**, **START**, **COMMIT**, and **RENAME**.</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The time when the SQL statement was executed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The number of updated rows.</p>
         */
        @NameInMap("UpdateRows")
        public Long updateRows;

        /**
         * <p>The name of the user who executes the SQL statement.</p>
         */
        @NameInMap("User")
        public String user;

        public static GetFullRequestSampleByInstanceIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFullRequestSampleByInstanceIdResponseBodyData self = new GetFullRequestSampleByInstanceIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setFrows(Long frows) {
            this.frows = frows;
            return this;
        }
        public Long getFrows() {
            return this.frows;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setLockWaitTime(Double lockWaitTime) {
            this.lockWaitTime = lockWaitTime;
            return this;
        }
        public Double getLockWaitTime() {
            return this.lockWaitTime;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setLogicalRead(Double logicalRead) {
            this.logicalRead = logicalRead;
            return this;
        }
        public Double getLogicalRead() {
            return this.logicalRead;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setOriginHost(String originHost) {
            this.originHost = originHost;
            return this;
        }
        public String getOriginHost() {
            return this.originHost;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setPhysicalAsyncRead(Double physicalAsyncRead) {
            this.physicalAsyncRead = physicalAsyncRead;
            return this;
        }
        public Double getPhysicalAsyncRead() {
            return this.physicalAsyncRead;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setPhysicalSyncRead(Double physicalSyncRead) {
            this.physicalSyncRead = physicalSyncRead;
            return this;
        }
        public Double getPhysicalSyncRead() {
            return this.physicalSyncRead;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setRows(Long rows) {
            this.rows = rows;
            return this;
        }
        public Long getRows() {
            return this.rows;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setRowsExamined(Long rowsExamined) {
            this.rowsExamined = rowsExamined;
            return this;
        }
        public Long getRowsExamined() {
            return this.rowsExamined;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setRowsReturned(Long rowsReturned) {
            this.rowsReturned = rowsReturned;
            return this;
        }
        public Long getRowsReturned() {
            return this.rowsReturned;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setRt(Double rt) {
            this.rt = rt;
            return this;
        }
        public Double getRt() {
            return this.rt;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setScanRows(Long scanRows) {
            this.scanRows = scanRows;
            return this;
        }
        public Long getScanRows() {
            return this.scanRows;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setScnt(Long scnt) {
            this.scnt = scnt;
            return this;
        }
        public Long getScnt() {
            return this.scnt;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setUpdateRows(Long updateRows) {
            this.updateRows = updateRows;
            return this;
        }
        public Long getUpdateRows() {
            return this.updateRows;
        }

        public GetFullRequestSampleByInstanceIdResponseBodyData setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
