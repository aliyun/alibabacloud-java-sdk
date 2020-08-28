// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SlowLogRecords")
    @Validation(required = true)
    public DescribeSlowLogRecordsResponseSlowLogRecords slowLogRecords;

    public static DescribeSlowLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsResponse self = new DescribeSlowLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogRecordsResponse setSlowLogRecords(DescribeSlowLogRecordsResponseSlowLogRecords slowLogRecords) {
        this.slowLogRecords = slowLogRecords;
        return this;
    }
    public DescribeSlowLogRecordsResponseSlowLogRecords getSlowLogRecords() {
        return this.slowLogRecords;
    }

    public static class DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet extends TeaModel {
        @NameInMap("InitialQueryId")
        @Validation(required = true)
        public String initialQueryId;

        @NameInMap("InitialUser")
        @Validation(required = true)
        public String initialUser;

        @NameInMap("InitialAddress")
        @Validation(required = true)
        public String initialAddress;

        @NameInMap("QueryDurationMs")
        @Validation(required = true)
        public String queryDurationMs;

        @NameInMap("QueryStartTime")
        @Validation(required = true)
        public String queryStartTime;

        @NameInMap("Query")
        @Validation(required = true)
        public String query;

        @NameInMap("ReadRows")
        @Validation(required = true)
        public String readRows;

        @NameInMap("ReadBytes")
        @Validation(required = true)
        public String readBytes;

        @NameInMap("ResultBytes")
        @Validation(required = true)
        public String resultBytes;

        @NameInMap("MemoryUsage")
        @Validation(required = true)
        public String memoryUsage;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet self = new DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet setInitialQueryId(String initialQueryId) {
            this.initialQueryId = initialQueryId;
            return this;
        }
        public String getInitialQueryId() {
            return this.initialQueryId;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet setInitialUser(String initialUser) {
            this.initialUser = initialUser;
            return this;
        }
        public String getInitialUser() {
            return this.initialUser;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet setInitialAddress(String initialAddress) {
            this.initialAddress = initialAddress;
            return this;
        }
        public String getInitialAddress() {
            return this.initialAddress;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet setQueryDurationMs(String queryDurationMs) {
            this.queryDurationMs = queryDurationMs;
            return this;
        }
        public String getQueryDurationMs() {
            return this.queryDurationMs;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet setReadRows(String readRows) {
            this.readRows = readRows;
            return this;
        }
        public String getReadRows() {
            return this.readRows;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet setReadBytes(String readBytes) {
            this.readBytes = readBytes;
            return this;
        }
        public String getReadBytes() {
            return this.readBytes;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet setResultBytes(String resultBytes) {
            this.resultBytes = resultBytes;
            return this;
        }
        public String getResultBytes() {
            return this.resultBytes;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet setMemoryUsage(String memoryUsage) {
            this.memoryUsage = memoryUsage;
            return this;
        }
        public String getMemoryUsage() {
            return this.memoryUsage;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSlowLogRecordsResponseSlowLogRecordsData extends TeaModel {
        @NameInMap("ResultSet")
        @Validation(required = true)
        public java.util.List<DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet> resultSet;

        public static DescribeSlowLogRecordsResponseSlowLogRecordsData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseSlowLogRecordsData self = new DescribeSlowLogRecordsResponseSlowLogRecordsData();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsData setResultSet(java.util.List<DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet> resultSet) {
            this.resultSet = resultSet;
            return this;
        }
        public java.util.List<DescribeSlowLogRecordsResponseSlowLogRecordsDataResultSet> getResultSet() {
            return this.resultSet;
        }

    }

    public static class DescribeSlowLogRecordsResponseSlowLogRecordsTableSchemaResultSet extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static DescribeSlowLogRecordsResponseSlowLogRecordsTableSchemaResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseSlowLogRecordsTableSchemaResultSet self = new DescribeSlowLogRecordsResponseSlowLogRecordsTableSchemaResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsTableSchemaResultSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsTableSchemaResultSet setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSlowLogRecordsResponseSlowLogRecordsTableSchema extends TeaModel {
        @NameInMap("ResultSet")
        @Validation(required = true)
        public java.util.List<DescribeSlowLogRecordsResponseSlowLogRecordsTableSchemaResultSet> resultSet;

        public static DescribeSlowLogRecordsResponseSlowLogRecordsTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseSlowLogRecordsTableSchema self = new DescribeSlowLogRecordsResponseSlowLogRecordsTableSchema();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsTableSchema setResultSet(java.util.List<DescribeSlowLogRecordsResponseSlowLogRecordsTableSchemaResultSet> resultSet) {
            this.resultSet = resultSet;
            return this;
        }
        public java.util.List<DescribeSlowLogRecordsResponseSlowLogRecordsTableSchemaResultSet> getResultSet() {
            return this.resultSet;
        }

    }

    public static class DescribeSlowLogRecordsResponseSlowLogRecordsStatistics extends TeaModel {
        @NameInMap("BytesRead")
        @Validation(required = true)
        public Integer bytesRead;

        @NameInMap("ElapsedTime")
        @Validation(required = true)
        public Float elapsedTime;

        @NameInMap("RowsRead")
        @Validation(required = true)
        public Integer rowsRead;

        public static DescribeSlowLogRecordsResponseSlowLogRecordsStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseSlowLogRecordsStatistics self = new DescribeSlowLogRecordsResponseSlowLogRecordsStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsStatistics setBytesRead(Integer bytesRead) {
            this.bytesRead = bytesRead;
            return this;
        }
        public Integer getBytesRead() {
            return this.bytesRead;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsStatistics setElapsedTime(Float elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Float getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecordsStatistics setRowsRead(Integer rowsRead) {
            this.rowsRead = rowsRead;
            return this;
        }
        public Integer getRowsRead() {
            return this.rowsRead;
        }

    }

    public static class DescribeSlowLogRecordsResponseSlowLogRecords extends TeaModel {
        @NameInMap("Rows")
        @Validation(required = true)
        public String rows;

        @NameInMap("RowsBeforeLimitAtLeast")
        @Validation(required = true)
        public String rowsBeforeLimitAtLeast;

        @NameInMap("Data")
        @Validation(required = true)
        public DescribeSlowLogRecordsResponseSlowLogRecordsData data;

        @NameInMap("TableSchema")
        @Validation(required = true)
        public DescribeSlowLogRecordsResponseSlowLogRecordsTableSchema tableSchema;

        @NameInMap("Statistics")
        @Validation(required = true)
        public DescribeSlowLogRecordsResponseSlowLogRecordsStatistics statistics;

        public static DescribeSlowLogRecordsResponseSlowLogRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseSlowLogRecords self = new DescribeSlowLogRecordsResponseSlowLogRecords();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseSlowLogRecords setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecords setRowsBeforeLimitAtLeast(String rowsBeforeLimitAtLeast) {
            this.rowsBeforeLimitAtLeast = rowsBeforeLimitAtLeast;
            return this;
        }
        public String getRowsBeforeLimitAtLeast() {
            return this.rowsBeforeLimitAtLeast;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecords setData(DescribeSlowLogRecordsResponseSlowLogRecordsData data) {
            this.data = data;
            return this;
        }
        public DescribeSlowLogRecordsResponseSlowLogRecordsData getData() {
            return this.data;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecords setTableSchema(DescribeSlowLogRecordsResponseSlowLogRecordsTableSchema tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public DescribeSlowLogRecordsResponseSlowLogRecordsTableSchema getTableSchema() {
            return this.tableSchema;
        }

        public DescribeSlowLogRecordsResponseSlowLogRecords setStatistics(DescribeSlowLogRecordsResponseSlowLogRecordsStatistics statistics) {
            this.statistics = statistics;
            return this;
        }
        public DescribeSlowLogRecordsResponseSlowLogRecordsStatistics getStatistics() {
            return this.statistics;
        }

    }

}
