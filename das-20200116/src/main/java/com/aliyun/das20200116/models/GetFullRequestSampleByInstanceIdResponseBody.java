// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetFullRequestSampleByInstanceIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<GetFullRequestSampleByInstanceIdResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Database")
        public String database;

        @NameInMap("Frows")
        public Long frows;

        @NameInMap("LockWaitTime")
        public Double lockWaitTime;

        @NameInMap("LogicalRead")
        public Double logicalRead;

        @NameInMap("OriginHost")
        public String originHost;

        @NameInMap("PhysicalAsyncRead")
        public Double physicalAsyncRead;

        @NameInMap("PhysicalSyncRead")
        public Double physicalSyncRead;

        @NameInMap("Rows")
        public Long rows;

        @NameInMap("RowsExamined")
        public Long rowsExamined;

        @NameInMap("RowsReturned")
        public Long rowsReturned;

        @NameInMap("Rt")
        public Double rt;

        @NameInMap("ScanRows")
        public Long scanRows;

        @NameInMap("Scnt")
        public Long scnt;

        @NameInMap("Sql")
        public String sql;

        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlType")
        public String sqlType;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("UpdateRows")
        public Long updateRows;

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
