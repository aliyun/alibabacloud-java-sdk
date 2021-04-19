// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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

    public static class DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchemaResultSet extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Name")
        public String name;

        public static DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchemaResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchemaResultSet self = new DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchemaResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchemaResultSet setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchemaResultSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

    public static class DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("QueryStartTime")
        public String queryStartTime;

        @NameInMap("Query")
        public String query;

        @NameInMap("ReadRows")
        public String readRows;

        @NameInMap("InitialAddress")
        public String initialAddress;

        @NameInMap("MemoryUsage")
        public String memoryUsage;

        @NameInMap("InitialUser")
        public String initialUser;

        @NameInMap("InitialQueryId")
        public String initialQueryId;

        @NameInMap("ReadBytes")
        public String readBytes;

        @NameInMap("QueryDurationMs")
        public String queryDurationMs;

        @NameInMap("ResultBytes")
        public String resultBytes;

        public static DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet self = new DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setReadRows(String readRows) {
            this.readRows = readRows;
            return this;
        }
        public String getReadRows() {
            return this.readRows;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setInitialAddress(String initialAddress) {
            this.initialAddress = initialAddress;
            return this;
        }
        public String getInitialAddress() {
            return this.initialAddress;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setMemoryUsage(String memoryUsage) {
            this.memoryUsage = memoryUsage;
            return this;
        }
        public String getMemoryUsage() {
            return this.memoryUsage;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setInitialUser(String initialUser) {
            this.initialUser = initialUser;
            return this;
        }
        public String getInitialUser() {
            return this.initialUser;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setInitialQueryId(String initialQueryId) {
            this.initialQueryId = initialQueryId;
            return this;
        }
        public String getInitialQueryId() {
            return this.initialQueryId;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setReadBytes(String readBytes) {
            this.readBytes = readBytes;
            return this;
        }
        public String getReadBytes() {
            return this.readBytes;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setQueryDurationMs(String queryDurationMs) {
            this.queryDurationMs = queryDurationMs;
            return this;
        }
        public String getQueryDurationMs() {
            return this.queryDurationMs;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsDataResultSet setResultBytes(String resultBytes) {
            this.resultBytes = resultBytes;
            return this;
        }
        public String getResultBytes() {
            return this.resultBytes;
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
        @NameInMap("RowsRead")
        public Integer rowsRead;

        @NameInMap("ElapsedTime")
        public Float elapsedTime;

        @NameInMap("BytesRead")
        public Integer bytesRead;

        public static DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics self = new DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics setRowsRead(Integer rowsRead) {
            this.rowsRead = rowsRead;
            return this;
        }
        public Integer getRowsRead() {
            return this.rowsRead;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics setElapsedTime(Float elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Float getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics setBytesRead(Integer bytesRead) {
            this.bytesRead = bytesRead;
            return this;
        }
        public Integer getBytesRead() {
            return this.bytesRead;
        }

    }

    public static class DescribeSlowLogRecordsResponseBodySlowLogRecords extends TeaModel {
        @NameInMap("TableSchema")
        public DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchema tableSchema;

        @NameInMap("Data")
        public DescribeSlowLogRecordsResponseBodySlowLogRecordsData data;

        @NameInMap("Rows")
        public String rows;

        @NameInMap("RowsBeforeLimitAtLeast")
        public String rowsBeforeLimitAtLeast;

        @NameInMap("Statistics")
        public DescribeSlowLogRecordsResponseBodySlowLogRecordsStatistics statistics;

        public static DescribeSlowLogRecordsResponseBodySlowLogRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodySlowLogRecords self = new DescribeSlowLogRecordsResponseBodySlowLogRecords();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodySlowLogRecords setTableSchema(DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchema tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public DescribeSlowLogRecordsResponseBodySlowLogRecordsTableSchema getTableSchema() {
            return this.tableSchema;
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

    }

}
