// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSlowLogTrendResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlowLogTrend")
    public DescribeSlowLogTrendResponseBodySlowLogTrend slowLogTrend;

    public static DescribeSlowLogTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogTrendResponseBody self = new DescribeSlowLogTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogTrendResponseBody setSlowLogTrend(DescribeSlowLogTrendResponseBodySlowLogTrend slowLogTrend) {
        this.slowLogTrend = slowLogTrend;
        return this;
    }
    public DescribeSlowLogTrendResponseBodySlowLogTrend getSlowLogTrend() {
        return this.slowLogTrend;
    }

    public static class DescribeSlowLogTrendResponseBodySlowLogTrendDataResultSet extends TeaModel {
        @NameInMap("AvgQueryDurationMs")
        public String avgQueryDurationMs;

        @NameInMap("Count")
        public String count;

        @NameInMap("MaxQueryDurationMs")
        public String maxQueryDurationMs;

        @NameInMap("MinQueryDurationMs")
        public String minQueryDurationMs;

        @NameInMap("QueryStartTime")
        public String queryStartTime;

        public static DescribeSlowLogTrendResponseBodySlowLogTrendDataResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseBodySlowLogTrendDataResultSet self = new DescribeSlowLogTrendResponseBodySlowLogTrendDataResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrendDataResultSet setAvgQueryDurationMs(String avgQueryDurationMs) {
            this.avgQueryDurationMs = avgQueryDurationMs;
            return this;
        }
        public String getAvgQueryDurationMs() {
            return this.avgQueryDurationMs;
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrendDataResultSet setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrendDataResultSet setMaxQueryDurationMs(String maxQueryDurationMs) {
            this.maxQueryDurationMs = maxQueryDurationMs;
            return this;
        }
        public String getMaxQueryDurationMs() {
            return this.maxQueryDurationMs;
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrendDataResultSet setMinQueryDurationMs(String minQueryDurationMs) {
            this.minQueryDurationMs = minQueryDurationMs;
            return this;
        }
        public String getMinQueryDurationMs() {
            return this.minQueryDurationMs;
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrendDataResultSet setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

    }

    public static class DescribeSlowLogTrendResponseBodySlowLogTrendData extends TeaModel {
        @NameInMap("ResultSet")
        public java.util.List<DescribeSlowLogTrendResponseBodySlowLogTrendDataResultSet> resultSet;

        public static DescribeSlowLogTrendResponseBodySlowLogTrendData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseBodySlowLogTrendData self = new DescribeSlowLogTrendResponseBodySlowLogTrendData();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrendData setResultSet(java.util.List<DescribeSlowLogTrendResponseBodySlowLogTrendDataResultSet> resultSet) {
            this.resultSet = resultSet;
            return this;
        }
        public java.util.List<DescribeSlowLogTrendResponseBodySlowLogTrendDataResultSet> getResultSet() {
            return this.resultSet;
        }

    }

    public static class DescribeSlowLogTrendResponseBodySlowLogTrendStatistics extends TeaModel {
        @NameInMap("BytesRead")
        public Integer bytesRead;

        @NameInMap("ElapsedTime")
        public Float elapsedTime;

        @NameInMap("RowsRead")
        public Integer rowsRead;

        public static DescribeSlowLogTrendResponseBodySlowLogTrendStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseBodySlowLogTrendStatistics self = new DescribeSlowLogTrendResponseBodySlowLogTrendStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrendStatistics setBytesRead(Integer bytesRead) {
            this.bytesRead = bytesRead;
            return this;
        }
        public Integer getBytesRead() {
            return this.bytesRead;
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrendStatistics setElapsedTime(Float elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Float getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrendStatistics setRowsRead(Integer rowsRead) {
            this.rowsRead = rowsRead;
            return this;
        }
        public Integer getRowsRead() {
            return this.rowsRead;
        }

    }

    public static class DescribeSlowLogTrendResponseBodySlowLogTrendTableSchemaResultSet extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static DescribeSlowLogTrendResponseBodySlowLogTrendTableSchemaResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseBodySlowLogTrendTableSchemaResultSet self = new DescribeSlowLogTrendResponseBodySlowLogTrendTableSchemaResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrendTableSchemaResultSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrendTableSchemaResultSet setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSlowLogTrendResponseBodySlowLogTrendTableSchema extends TeaModel {
        @NameInMap("ResultSet")
        public java.util.List<DescribeSlowLogTrendResponseBodySlowLogTrendTableSchemaResultSet> resultSet;

        public static DescribeSlowLogTrendResponseBodySlowLogTrendTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseBodySlowLogTrendTableSchema self = new DescribeSlowLogTrendResponseBodySlowLogTrendTableSchema();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrendTableSchema setResultSet(java.util.List<DescribeSlowLogTrendResponseBodySlowLogTrendTableSchemaResultSet> resultSet) {
            this.resultSet = resultSet;
            return this;
        }
        public java.util.List<DescribeSlowLogTrendResponseBodySlowLogTrendTableSchemaResultSet> getResultSet() {
            return this.resultSet;
        }

    }

    public static class DescribeSlowLogTrendResponseBodySlowLogTrend extends TeaModel {
        @NameInMap("Data")
        public DescribeSlowLogTrendResponseBodySlowLogTrendData data;

        @NameInMap("Rows")
        public String rows;

        @NameInMap("RowsBeforeLimitAtLeast")
        public String rowsBeforeLimitAtLeast;

        @NameInMap("Statistics")
        public DescribeSlowLogTrendResponseBodySlowLogTrendStatistics statistics;

        @NameInMap("TableSchema")
        public DescribeSlowLogTrendResponseBodySlowLogTrendTableSchema tableSchema;

        public static DescribeSlowLogTrendResponseBodySlowLogTrend build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseBodySlowLogTrend self = new DescribeSlowLogTrendResponseBodySlowLogTrend();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrend setData(DescribeSlowLogTrendResponseBodySlowLogTrendData data) {
            this.data = data;
            return this;
        }
        public DescribeSlowLogTrendResponseBodySlowLogTrendData getData() {
            return this.data;
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrend setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrend setRowsBeforeLimitAtLeast(String rowsBeforeLimitAtLeast) {
            this.rowsBeforeLimitAtLeast = rowsBeforeLimitAtLeast;
            return this;
        }
        public String getRowsBeforeLimitAtLeast() {
            return this.rowsBeforeLimitAtLeast;
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrend setStatistics(DescribeSlowLogTrendResponseBodySlowLogTrendStatistics statistics) {
            this.statistics = statistics;
            return this;
        }
        public DescribeSlowLogTrendResponseBodySlowLogTrendStatistics getStatistics() {
            return this.statistics;
        }

        public DescribeSlowLogTrendResponseBodySlowLogTrend setTableSchema(DescribeSlowLogTrendResponseBodySlowLogTrendTableSchema tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public DescribeSlowLogTrendResponseBodySlowLogTrendTableSchema getTableSchema() {
            return this.tableSchema;
        }

    }

}
