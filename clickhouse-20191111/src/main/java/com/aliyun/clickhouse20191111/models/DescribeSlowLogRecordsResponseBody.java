// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details about the slow query logs.</p>
     */
    @NameInMap("SlowLogRecords")
    public DescribeSlowLogRecordsResponseBodySlowLogRecords slowLogRecords;

    public static DescribeSlowLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsResponseBody self = new DescribeSlowLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogRecordsResponseBody setSlowLogRecords(DescribeSlowLogRecordsResponseBodySlowLogRecords slowLogRecords) {
        this.slowLogRecords = slowLogRecords;
        return this;
    }
    public DescribeSlowLogRecordsResponseBodySlowLogRecords getSlowLogRecords() {
        return this.slowLogRecords;
    }

    public static class DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet extends TeaModel {
        /**
         * <p>The IP address of the client that initiated the query.</p>
         */
        @NameInMap("InitialAddress")
        public String initialAddress;

        /**
         * <p>The query ID.</p>
         */
        @NameInMap("InitialQueryId")
        public String initialQueryId;

        /**
         * <p>The username that is used to initiate the query.</p>
         */
        @NameInMap("InitialUser")
        public String initialUser;

        /**
         * <p>The peak memory usage for the query. Unit: bytes.</p>
         */
        @NameInMap("MemoryUsage")
        public String memoryUsage;

        /**
         * <p>The statement that was executed in the query.</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>The duration of the query. Unit: milliseconds.</p>
         */
        @NameInMap("QueryDurationMs")
        public String queryDurationMs;

        /**
         * <p>The beginning of the time range to query. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.</p>
         */
        @NameInMap("QueryStartTime")
        public String queryStartTime;

        /**
         * <p>The size of the data read by executing the statement. Unit: bytes.</p>
         */
        @NameInMap("ReadBytes")
        public String readBytes;

        /**
         * <p>The number of rows read by executing the statement.</p>
         */
        @NameInMap("ReadRows")
        public String readRows;

        /**
         * <p>The size of the result data. Unit: bytes.</p>
         */
        @NameInMap("ResultBytes")
        public String resultBytes;

        /**
         * <p>The query status. Valid values:</p>
         * <br>
         * <p>*   **QueryFinish**: The query is complete.</p>
         * <p>*   **Processing**: The query is running.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet self = new DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setInitialAddress(String initialAddress) {
            this.initialAddress = initialAddress;
            return this;
        }
        public String getInitialAddress() {
            return this.initialAddress;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setInitialQueryId(String initialQueryId) {
            this.initialQueryId = initialQueryId;
            return this;
        }
        public String getInitialQueryId() {
            return this.initialQueryId;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setInitialUser(String initialUser) {
            this.initialUser = initialUser;
            return this;
        }
        public String getInitialUser() {
            return this.initialUser;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setMemoryUsage(String memoryUsage) {
            this.memoryUsage = memoryUsage;
            return this;
        }
        public String getMemoryUsage() {
            return this.memoryUsage;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setQueryDurationMs(String queryDurationMs) {
            this.queryDurationMs = queryDurationMs;
            return this;
        }
        public String getQueryDurationMs() {
            return this.queryDurationMs;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setReadBytes(String readBytes) {
            this.readBytes = readBytes;
            return this;
        }
        public String getReadBytes() {
            return this.readBytes;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setReadRows(String readRows) {
            this.readRows = readRows;
            return this;
        }
        public String getReadRows() {
            return this.readRows;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setResultBytes(String resultBytes) {
            this.resultBytes = resultBytes;
            return this;
        }
        public String getResultBytes() {
            return this.resultBytes;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSlowLogRecordsResponseBodySlowLogRecordsData extends TeaModel {
        @NameInMap("ResultSet")
        public java.util.List<DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet> resultSet;

        public static DescribeSlowLogRecordsResponseBodySlowLogRecordsData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodySlowLogRecordsData self = new DescribeSlowLogRecordsResponseBodySlowLogRecordsData();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsData setResultSet(java.util.List<DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet> resultSet) {
            this.resultSet = resultSet;
            return this;
        }
        public java.util.List<DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet> getResultSet() {
            return this.resultSet;
        }

    }

    public static class DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics extends TeaModel {
        /**
         * <p>The total size of data that were read. Unit: bytes.</p>
         */
        @NameInMap("BytesRead")
        public Integer bytesRead;

        /**
         * <p>The time consumed by the slow query. Unit: milliseconds.</p>
         */
        @NameInMap("ElapsedTime")
        public Float elapsedTime;

        /**
         * <p>The total number of rows that were read.</p>
         */
        @NameInMap("RowsRead")
        public Integer rowsRead;

        public static DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics self = new DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics setBytesRead(Integer bytesRead) {
            this.bytesRead = bytesRead;
            return this;
        }
        public Integer getBytesRead() {
            return this.bytesRead;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics setElapsedTime(Float elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Float getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics setRowsRead(Integer rowsRead) {
            this.rowsRead = rowsRead;
            return this;
        }
        public Integer getRowsRead() {
            return this.rowsRead;
        }

    }

    public static class DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchemaResultSet extends TeaModel {
        /**
         * <p>The name of the column.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the column.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchemaResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchemaResultSet self = new DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchemaResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchemaResultSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchemaResultSet setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchema extends TeaModel {
        @NameInMap("ResultSet")
        public java.util.List<DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchemaResultSet> resultSet;

        public static DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchema self = new DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchema();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchema setResultSet(java.util.List<DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchemaResultSet> resultSet) {
            this.resultSet = resultSet;
            return this;
        }
        public java.util.List<DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchemaResultSet> getResultSet() {
            return this.resultSet;
        }

    }

    public static class DescribeSlowLogRecordsResponseBodySlowLogRecords extends TeaModel {
        /**
         * <p>Details about the slow query logs.</p>
         */
        @NameInMap("Data")
        public DescribeSlowLogRecordsResponseBodySlowLogRecordsData data;

        /**
         * <p>The number of rows in the result set.</p>
         */
        @NameInMap("Rows")
        public String rows;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("RowsBeforeLimitAtLeast")
        public String rowsBeforeLimitAtLeast;

        /**
         * <p>The statistics of the results.</p>
         */
        @NameInMap("Statistics")
        public DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics statistics;

        /**
         * <p>The schema of the table in the database.</p>
         */
        @NameInMap("TableSchema")
        public DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchema tableSchema;

        public static DescribeSlowLogRecordsResponseBodySlowLogRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodySlowLogRecords self = new DescribeSlowLogRecordsResponseBodySlowLogRecords();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecords setData(DescribeSlowLogRecordsResponseBodySlowLogRecordsData data) {
            this.data = data;
            return this;
        }
        public DescribeSlowLogRecordsResponseBodySlowLogRecordsData getData() {
            return this.data;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecords setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecords setRowsBeforeLimitAtLeast(String rowsBeforeLimitAtLeast) {
            this.rowsBeforeLimitAtLeast = rowsBeforeLimitAtLeast;
            return this;
        }
        public String getRowsBeforeLimitAtLeast() {
            return this.rowsBeforeLimitAtLeast;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecords setStatistics(DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics statistics) {
            this.statistics = statistics;
            return this;
        }
        public DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics getStatistics() {
            return this.statistics;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecords setTableSchema(DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchema tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchema getTableSchema() {
            return this.tableSchema;
        }

    }

}
