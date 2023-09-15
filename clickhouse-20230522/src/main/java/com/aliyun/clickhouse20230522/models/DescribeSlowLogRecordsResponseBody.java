// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeSlowLogRecordsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSlowLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsResponseBody self = new DescribeSlowLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsResponseBody setData(DescribeSlowLogRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSlowLogRecordsResponseBodyData getData() {
        return this.data;
    }

    public DescribeSlowLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSlowLogRecordsResponseBodyDataResultSet extends TeaModel {
        @NameInMap("InitialAddress")
        public String initialAddress;

        @NameInMap("InitialQueryId")
        public String initialQueryId;

        @NameInMap("InitialUser")
        public String initialUser;

        @NameInMap("MemoryUsage")
        public Long memoryUsage;

        @NameInMap("Query")
        public String query;

        @NameInMap("QueryDurationMs")
        public Long queryDurationMs;

        @NameInMap("QueryStartTime")
        public String queryStartTime;

        @NameInMap("ReadBytes")
        public Long readBytes;

        @NameInMap("ReadRows")
        public Long readRows;

        @NameInMap("ResultBytes")
        public Long resultBytes;

        @NameInMap("Type")
        public String type;

        public static DescribeSlowLogRecordsResponseBodyDataResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyDataResultSet self = new DescribeSlowLogRecordsResponseBodyDataResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyDataResultSet setInitialAddress(String initialAddress) {
            this.initialAddress = initialAddress;
            return this;
        }
        public String getInitialAddress() {
            return this.initialAddress;
        }

        public DescribeSlowLogRecordsResponseBodyDataResultSet setInitialQueryId(String initialQueryId) {
            this.initialQueryId = initialQueryId;
            return this;
        }
        public String getInitialQueryId() {
            return this.initialQueryId;
        }

        public DescribeSlowLogRecordsResponseBodyDataResultSet setInitialUser(String initialUser) {
            this.initialUser = initialUser;
            return this;
        }
        public String getInitialUser() {
            return this.initialUser;
        }

        public DescribeSlowLogRecordsResponseBodyDataResultSet setMemoryUsage(Long memoryUsage) {
            this.memoryUsage = memoryUsage;
            return this;
        }
        public Long getMemoryUsage() {
            return this.memoryUsage;
        }

        public DescribeSlowLogRecordsResponseBodyDataResultSet setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public DescribeSlowLogRecordsResponseBodyDataResultSet setQueryDurationMs(Long queryDurationMs) {
            this.queryDurationMs = queryDurationMs;
            return this;
        }
        public Long getQueryDurationMs() {
            return this.queryDurationMs;
        }

        public DescribeSlowLogRecordsResponseBodyDataResultSet setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        public DescribeSlowLogRecordsResponseBodyDataResultSet setReadBytes(Long readBytes) {
            this.readBytes = readBytes;
            return this;
        }
        public Long getReadBytes() {
            return this.readBytes;
        }

        public DescribeSlowLogRecordsResponseBodyDataResultSet setReadRows(Long readRows) {
            this.readRows = readRows;
            return this;
        }
        public Long getReadRows() {
            return this.readRows;
        }

        public DescribeSlowLogRecordsResponseBodyDataResultSet setResultBytes(Long resultBytes) {
            this.resultBytes = resultBytes;
            return this;
        }
        public Long getResultBytes() {
            return this.resultBytes;
        }

        public DescribeSlowLogRecordsResponseBodyDataResultSet setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSlowLogRecordsResponseBodyData extends TeaModel {
        @NameInMap("DBInstanceID")
        public Integer DBInstanceID;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("ResultSet")
        public java.util.List<DescribeSlowLogRecordsResponseBodyDataResultSet> resultSet;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeSlowLogRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyData self = new DescribeSlowLogRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyData setDBInstanceID(Integer DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }
        public Integer getDBInstanceID() {
            return this.DBInstanceID;
        }

        public DescribeSlowLogRecordsResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeSlowLogRecordsResponseBodyData setResultSet(java.util.List<DescribeSlowLogRecordsResponseBodyDataResultSet> resultSet) {
            this.resultSet = resultSet;
            return this;
        }
        public java.util.List<DescribeSlowLogRecordsResponseBodyDataResultSet> getResultSet() {
            return this.resultSet;
        }

        public DescribeSlowLogRecordsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
