// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSlowLogTrendResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SlowLogTrend")
    @Validation(required = true)
    public DescribeSlowLogTrendResponseSlowLogTrend slowLogTrend;

    public static DescribeSlowLogTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogTrendResponse self = new DescribeSlowLogTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogTrendResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogTrendResponse setSlowLogTrend(DescribeSlowLogTrendResponseSlowLogTrend slowLogTrend) {
        this.slowLogTrend = slowLogTrend;
        return this;
    }
    public DescribeSlowLogTrendResponseSlowLogTrend getSlowLogTrend() {
        return this.slowLogTrend;
    }

    public static class DescribeSlowLogTrendResponseSlowLogTrendDataResultSet extends TeaModel {
        @NameInMap("MaxQueryDurationMs")
        @Validation(required = true)
        public String maxQueryDurationMs;

        @NameInMap("Count")
        @Validation(required = true)
        public String count;

        @NameInMap("MinQueryDurationMs")
        @Validation(required = true)
        public String minQueryDurationMs;

        @NameInMap("AvgQueryDurationMs")
        @Validation(required = true)
        public String avgQueryDurationMs;

        @NameInMap("QueryStartTime")
        @Validation(required = true)
        public String queryStartTime;

        public static DescribeSlowLogTrendResponseSlowLogTrendDataResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseSlowLogTrendDataResultSet self = new DescribeSlowLogTrendResponseSlowLogTrendDataResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseSlowLogTrendDataResultSet setMaxQueryDurationMs(String maxQueryDurationMs) {
            this.maxQueryDurationMs = maxQueryDurationMs;
            return this;
        }
        public String getMaxQueryDurationMs() {
            return this.maxQueryDurationMs;
        }

        public DescribeSlowLogTrendResponseSlowLogTrendDataResultSet setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeSlowLogTrendResponseSlowLogTrendDataResultSet setMinQueryDurationMs(String minQueryDurationMs) {
            this.minQueryDurationMs = minQueryDurationMs;
            return this;
        }
        public String getMinQueryDurationMs() {
            return this.minQueryDurationMs;
        }

        public DescribeSlowLogTrendResponseSlowLogTrendDataResultSet setAvgQueryDurationMs(String avgQueryDurationMs) {
            this.avgQueryDurationMs = avgQueryDurationMs;
            return this;
        }
        public String getAvgQueryDurationMs() {
            return this.avgQueryDurationMs;
        }

        public DescribeSlowLogTrendResponseSlowLogTrendDataResultSet setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

    }

    public static class DescribeSlowLogTrendResponseSlowLogTrendData extends TeaModel {
        @NameInMap("ResultSet")
        @Validation(required = true)
        public java.util.List<DescribeSlowLogTrendResponseSlowLogTrendDataResultSet> resultSet;

        public static DescribeSlowLogTrendResponseSlowLogTrendData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseSlowLogTrendData self = new DescribeSlowLogTrendResponseSlowLogTrendData();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseSlowLogTrendData setResultSet(java.util.List<DescribeSlowLogTrendResponseSlowLogTrendDataResultSet> resultSet) {
            this.resultSet = resultSet;
            return this;
        }
        public java.util.List<DescribeSlowLogTrendResponseSlowLogTrendDataResultSet> getResultSet() {
            return this.resultSet;
        }

    }

    public static class DescribeSlowLogTrendResponseSlowLogTrendTableSchemaResultSet extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static DescribeSlowLogTrendResponseSlowLogTrendTableSchemaResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseSlowLogTrendTableSchemaResultSet self = new DescribeSlowLogTrendResponseSlowLogTrendTableSchemaResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseSlowLogTrendTableSchemaResultSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSlowLogTrendResponseSlowLogTrendTableSchemaResultSet setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSlowLogTrendResponseSlowLogTrendTableSchema extends TeaModel {
        @NameInMap("ResultSet")
        @Validation(required = true)
        public java.util.List<DescribeSlowLogTrendResponseSlowLogTrendTableSchemaResultSet> resultSet;

        public static DescribeSlowLogTrendResponseSlowLogTrendTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseSlowLogTrendTableSchema self = new DescribeSlowLogTrendResponseSlowLogTrendTableSchema();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseSlowLogTrendTableSchema setResultSet(java.util.List<DescribeSlowLogTrendResponseSlowLogTrendTableSchemaResultSet> resultSet) {
            this.resultSet = resultSet;
            return this;
        }
        public java.util.List<DescribeSlowLogTrendResponseSlowLogTrendTableSchemaResultSet> getResultSet() {
            return this.resultSet;
        }

    }

    public static class DescribeSlowLogTrendResponseSlowLogTrendStatistics extends TeaModel {
        @NameInMap("BytesRead")
        @Validation(required = true)
        public Integer bytesRead;

        @NameInMap("ElapsedTime")
        @Validation(required = true)
        public Float elapsedTime;

        @NameInMap("RowsRead")
        @Validation(required = true)
        public Integer rowsRead;

        public static DescribeSlowLogTrendResponseSlowLogTrendStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseSlowLogTrendStatistics self = new DescribeSlowLogTrendResponseSlowLogTrendStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseSlowLogTrendStatistics setBytesRead(Integer bytesRead) {
            this.bytesRead = bytesRead;
            return this;
        }
        public Integer getBytesRead() {
            return this.bytesRead;
        }

        public DescribeSlowLogTrendResponseSlowLogTrendStatistics setElapsedTime(Float elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Float getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeSlowLogTrendResponseSlowLogTrendStatistics setRowsRead(Integer rowsRead) {
            this.rowsRead = rowsRead;
            return this;
        }
        public Integer getRowsRead() {
            return this.rowsRead;
        }

    }

    public static class DescribeSlowLogTrendResponseSlowLogTrend extends TeaModel {
        @NameInMap("Rows")
        @Validation(required = true)
        public String rows;

        @NameInMap("RowsBeforeLimitAtLeast")
        @Validation(required = true)
        public String rowsBeforeLimitAtLeast;

        @NameInMap("Data")
        @Validation(required = true)
        public DescribeSlowLogTrendResponseSlowLogTrendData data;

        @NameInMap("TableSchema")
        @Validation(required = true)
        public DescribeSlowLogTrendResponseSlowLogTrendTableSchema tableSchema;

        @NameInMap("Statistics")
        @Validation(required = true)
        public DescribeSlowLogTrendResponseSlowLogTrendStatistics statistics;

        public static DescribeSlowLogTrendResponseSlowLogTrend build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseSlowLogTrend self = new DescribeSlowLogTrendResponseSlowLogTrend();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseSlowLogTrend setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public DescribeSlowLogTrendResponseSlowLogTrend setRowsBeforeLimitAtLeast(String rowsBeforeLimitAtLeast) {
            this.rowsBeforeLimitAtLeast = rowsBeforeLimitAtLeast;
            return this;
        }
        public String getRowsBeforeLimitAtLeast() {
            return this.rowsBeforeLimitAtLeast;
        }

        public DescribeSlowLogTrendResponseSlowLogTrend setData(DescribeSlowLogTrendResponseSlowLogTrendData data) {
            this.data = data;
            return this;
        }
        public DescribeSlowLogTrendResponseSlowLogTrendData getData() {
            return this.data;
        }

        public DescribeSlowLogTrendResponseSlowLogTrend setTableSchema(DescribeSlowLogTrendResponseSlowLogTrendTableSchema tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public DescribeSlowLogTrendResponseSlowLogTrendTableSchema getTableSchema() {
            return this.tableSchema;
        }

        public DescribeSlowLogTrendResponseSlowLogTrend setStatistics(DescribeSlowLogTrendResponseSlowLogTrendStatistics statistics) {
            this.statistics = statistics;
            return this;
        }
        public DescribeSlowLogTrendResponseSlowLogTrendStatistics getStatistics() {
            return this.statistics;
        }

    }

}
