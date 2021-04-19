// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeProcessListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProcessList")
    public DescribeProcessListResponseBodyProcessList processList;

    public static DescribeProcessListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessListResponseBody self = new DescribeProcessListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProcessListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProcessListResponseBody setProcessList(DescribeProcessListResponseBodyProcessList processList) {
        this.processList = processList;
        return this;
    }
    public DescribeProcessListResponseBodyProcessList getProcessList() {
        return this.processList;
    }

    public static class DescribeProcessListResponseBodyProcessListTableSchemaResultSet extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Name")
        public String name;

        public static DescribeProcessListResponseBodyProcessListTableSchemaResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessListResponseBodyProcessListTableSchemaResultSet self = new DescribeProcessListResponseBodyProcessListTableSchemaResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeProcessListResponseBodyProcessListTableSchemaResultSet setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeProcessListResponseBodyProcessListTableSchemaResultSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeProcessListResponseBodyProcessListTableSchema extends TeaModel {
        @NameInMap("ResultSet")
        public java.util.List<DescribeProcessListResponseBodyProcessListTableSchemaResultSet> resultSet;

        public static DescribeProcessListResponseBodyProcessListTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessListResponseBodyProcessListTableSchema self = new DescribeProcessListResponseBodyProcessListTableSchema();
            return TeaModel.build(map, self);
        }

        public DescribeProcessListResponseBodyProcessListTableSchema setResultSet(java.util.List<DescribeProcessListResponseBodyProcessListTableSchemaResultSet> resultSet) {
            this.resultSet = resultSet;
            return this;
        }
        public java.util.List<DescribeProcessListResponseBodyProcessListTableSchemaResultSet> getResultSet() {
            return this.resultSet;
        }

    }

    public static class DescribeProcessListResponseBodyProcessListDataResultSet extends TeaModel {
        @NameInMap("QueryStartTime")
        public String queryStartTime;

        @NameInMap("Query")
        public String query;

        @NameInMap("InitialAddress")
        public String initialAddress;

        @NameInMap("InitialQueryId")
        public String initialQueryId;

        @NameInMap("InitialUser")
        public String initialUser;

        @NameInMap("QueryDurationMs")
        public String queryDurationMs;

        public static DescribeProcessListResponseBodyProcessListDataResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessListResponseBodyProcessListDataResultSet self = new DescribeProcessListResponseBodyProcessListDataResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeProcessListResponseBodyProcessListDataResultSet setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        public DescribeProcessListResponseBodyProcessListDataResultSet setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public DescribeProcessListResponseBodyProcessListDataResultSet setInitialAddress(String initialAddress) {
            this.initialAddress = initialAddress;
            return this;
        }
        public String getInitialAddress() {
            return this.initialAddress;
        }

        public DescribeProcessListResponseBodyProcessListDataResultSet setInitialQueryId(String initialQueryId) {
            this.initialQueryId = initialQueryId;
            return this;
        }
        public String getInitialQueryId() {
            return this.initialQueryId;
        }

        public DescribeProcessListResponseBodyProcessListDataResultSet setInitialUser(String initialUser) {
            this.initialUser = initialUser;
            return this;
        }
        public String getInitialUser() {
            return this.initialUser;
        }

        public DescribeProcessListResponseBodyProcessListDataResultSet setQueryDurationMs(String queryDurationMs) {
            this.queryDurationMs = queryDurationMs;
            return this;
        }
        public String getQueryDurationMs() {
            return this.queryDurationMs;
        }

    }

    public static class DescribeProcessListResponseBodyProcessListData extends TeaModel {
        @NameInMap("ResultSet")
        public java.util.List<DescribeProcessListResponseBodyProcessListDataResultSet> resultSet;

        public static DescribeProcessListResponseBodyProcessListData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessListResponseBodyProcessListData self = new DescribeProcessListResponseBodyProcessListData();
            return TeaModel.build(map, self);
        }

        public DescribeProcessListResponseBodyProcessListData setResultSet(java.util.List<DescribeProcessListResponseBodyProcessListDataResultSet> resultSet) {
            this.resultSet = resultSet;
            return this;
        }
        public java.util.List<DescribeProcessListResponseBodyProcessListDataResultSet> getResultSet() {
            return this.resultSet;
        }

    }

    public static class DescribeProcessListResponseBodyProcessListStatistics extends TeaModel {
        @NameInMap("RowsRead")
        public Integer rowsRead;

        @NameInMap("ElapsedTime")
        public Float elapsedTime;

        @NameInMap("BytesRead")
        public Integer bytesRead;

        public static DescribeProcessListResponseBodyProcessListStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessListResponseBodyProcessListStatistics self = new DescribeProcessListResponseBodyProcessListStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeProcessListResponseBodyProcessListStatistics setRowsRead(Integer rowsRead) {
            this.rowsRead = rowsRead;
            return this;
        }
        public Integer getRowsRead() {
            return this.rowsRead;
        }

        public DescribeProcessListResponseBodyProcessListStatistics setElapsedTime(Float elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Float getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeProcessListResponseBodyProcessListStatistics setBytesRead(Integer bytesRead) {
            this.bytesRead = bytesRead;
            return this;
        }
        public Integer getBytesRead() {
            return this.bytesRead;
        }

    }

    public static class DescribeProcessListResponseBodyProcessList extends TeaModel {
        @NameInMap("TableSchema")
        public DescribeProcessListResponseBodyProcessListTableSchema tableSchema;

        @NameInMap("Data")
        public DescribeProcessListResponseBodyProcessListData data;

        @NameInMap("Rows")
        public String rows;

        @NameInMap("RowsBeforeLimitAtLeast")
        public String rowsBeforeLimitAtLeast;

        @NameInMap("Statistics")
        public DescribeProcessListResponseBodyProcessListStatistics statistics;

        public static DescribeProcessListResponseBodyProcessList build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessListResponseBodyProcessList self = new DescribeProcessListResponseBodyProcessList();
            return TeaModel.build(map, self);
        }

        public DescribeProcessListResponseBodyProcessList setTableSchema(DescribeProcessListResponseBodyProcessListTableSchema tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public DescribeProcessListResponseBodyProcessListTableSchema getTableSchema() {
            return this.tableSchema;
        }

        public DescribeProcessListResponseBodyProcessList setData(DescribeProcessListResponseBodyProcessListData data) {
            this.data = data;
            return this;
        }
        public DescribeProcessListResponseBodyProcessListData getData() {
            return this.data;
        }

        public DescribeProcessListResponseBodyProcessList setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public DescribeProcessListResponseBodyProcessList setRowsBeforeLimitAtLeast(String rowsBeforeLimitAtLeast) {
            this.rowsBeforeLimitAtLeast = rowsBeforeLimitAtLeast;
            return this;
        }
        public String getRowsBeforeLimitAtLeast() {
            return this.rowsBeforeLimitAtLeast;
        }

        public DescribeProcessListResponseBodyProcessList setStatistics(DescribeProcessListResponseBodyProcessListStatistics statistics) {
            this.statistics = statistics;
            return this;
        }
        public DescribeProcessListResponseBodyProcessListStatistics getStatistics() {
            return this.statistics;
        }

    }

}
