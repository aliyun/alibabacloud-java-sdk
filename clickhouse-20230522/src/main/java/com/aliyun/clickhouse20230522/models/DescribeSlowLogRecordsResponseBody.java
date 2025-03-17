// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeSlowLogRecordsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DF203CC8-5F68-5E3F-8050-3C77DD65731A</p>
     */
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
        /**
         * <p>The address to which the query statement is sent.</p>
         * 
         * <strong>example:</strong>
         * <p>0:0:0:0:0:ffff:1edd65ea</p>
         */
        @NameInMap("InitialAddress")
        public String initialAddress;

        /**
         * <p>The query ID.</p>
         * 
         * <strong>example:</strong>
         * <p>\&quot;ae915a3ad30e77e67a7215d05b658cc6\&quot;</p>
         */
        @NameInMap("InitialQueryId")
        public String initialQueryId;

        /**
         * <p>The user who executes the query statement.</p>
         * 
         * <strong>example:</strong>
         * <p>bany</p>
         */
        @NameInMap("InitialUser")
        public String initialUser;

        /**
         * <p>The peak memory usage for the query. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>4941696</p>
         */
        @NameInMap("MemoryUsage")
        public Long memoryUsage;

        /**
         * <p>The query statement that is running.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from test</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>The execution duration of slow SQL queries. Minimum value: <strong>1000</strong>. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("QueryDurationMs")
        public Long queryDurationMs;

        /**
         * <p>The beginning of the time range to query. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-11 16:00:00</p>
         */
        @NameInMap("QueryStartTime")
        public String queryStartTime;

        /**
         * <p>The size of the data that is scanned. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>4507128020832</p>
         */
        @NameInMap("ReadBytes")
        public Long readBytes;

        /**
         * <p>The number of read rows.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ReadRows")
        public Long readRows;

        /**
         * <p>The size of the result data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ResultBytes")
        public Long resultBytes;

        /**
         * <p>The type of the slow query logs.</p>
         * 
         * <strong>example:</strong>
         * <p>ExceptionWhileProcessing</p>
         */
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
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp100p4q1g9z32****</p>
         */
        @NameInMap("DBInstanceID")
        public Integer DBInstanceID;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>TestCluster</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The result sets.</p>
         */
        @NameInMap("ResultSet")
        public java.util.List<DescribeSlowLogRecordsResponseBodyDataResultSet> resultSet;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
