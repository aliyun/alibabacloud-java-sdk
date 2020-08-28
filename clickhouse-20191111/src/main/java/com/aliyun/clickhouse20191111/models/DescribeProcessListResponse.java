// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeProcessListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ProcessList")
    @Validation(required = true)
    public DescribeProcessListResponseProcessList processList;

    public static DescribeProcessListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessListResponse self = new DescribeProcessListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProcessListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProcessListResponse setProcessList(DescribeProcessListResponseProcessList processList) {
        this.processList = processList;
        return this;
    }
    public DescribeProcessListResponseProcessList getProcessList() {
        return this.processList;
    }

    public static class DescribeProcessListResponseProcessListDataResultSet extends TeaModel {
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

        public static DescribeProcessListResponseProcessListDataResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessListResponseProcessListDataResultSet self = new DescribeProcessListResponseProcessListDataResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeProcessListResponseProcessListDataResultSet setInitialQueryId(String initialQueryId) {
            this.initialQueryId = initialQueryId;
            return this;
        }
        public String getInitialQueryId() {
            return this.initialQueryId;
        }

        public DescribeProcessListResponseProcessListDataResultSet setInitialUser(String initialUser) {
            this.initialUser = initialUser;
            return this;
        }
        public String getInitialUser() {
            return this.initialUser;
        }

        public DescribeProcessListResponseProcessListDataResultSet setInitialAddress(String initialAddress) {
            this.initialAddress = initialAddress;
            return this;
        }
        public String getInitialAddress() {
            return this.initialAddress;
        }

        public DescribeProcessListResponseProcessListDataResultSet setQueryDurationMs(String queryDurationMs) {
            this.queryDurationMs = queryDurationMs;
            return this;
        }
        public String getQueryDurationMs() {
            return this.queryDurationMs;
        }

        public DescribeProcessListResponseProcessListDataResultSet setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        public DescribeProcessListResponseProcessListDataResultSet setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class DescribeProcessListResponseProcessListData extends TeaModel {
        @NameInMap("ResultSet")
        @Validation(required = true)
        public java.util.List<DescribeProcessListResponseProcessListDataResultSet> resultSet;

        public static DescribeProcessListResponseProcessListData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessListResponseProcessListData self = new DescribeProcessListResponseProcessListData();
            return TeaModel.build(map, self);
        }

        public DescribeProcessListResponseProcessListData setResultSet(java.util.List<DescribeProcessListResponseProcessListDataResultSet> resultSet) {
            this.resultSet = resultSet;
            return this;
        }
        public java.util.List<DescribeProcessListResponseProcessListDataResultSet> getResultSet() {
            return this.resultSet;
        }

    }

    public static class DescribeProcessListResponseProcessListTableSchemaResultSet extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static DescribeProcessListResponseProcessListTableSchemaResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessListResponseProcessListTableSchemaResultSet self = new DescribeProcessListResponseProcessListTableSchemaResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeProcessListResponseProcessListTableSchemaResultSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProcessListResponseProcessListTableSchemaResultSet setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeProcessListResponseProcessListTableSchema extends TeaModel {
        @NameInMap("ResultSet")
        @Validation(required = true)
        public java.util.List<DescribeProcessListResponseProcessListTableSchemaResultSet> resultSet;

        public static DescribeProcessListResponseProcessListTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessListResponseProcessListTableSchema self = new DescribeProcessListResponseProcessListTableSchema();
            return TeaModel.build(map, self);
        }

        public DescribeProcessListResponseProcessListTableSchema setResultSet(java.util.List<DescribeProcessListResponseProcessListTableSchemaResultSet> resultSet) {
            this.resultSet = resultSet;
            return this;
        }
        public java.util.List<DescribeProcessListResponseProcessListTableSchemaResultSet> getResultSet() {
            return this.resultSet;
        }

    }

    public static class DescribeProcessListResponseProcessListStatistics extends TeaModel {
        @NameInMap("BytesRead")
        @Validation(required = true)
        public Integer bytesRead;

        @NameInMap("ElapsedTime")
        @Validation(required = true)
        public Float elapsedTime;

        @NameInMap("RowsRead")
        @Validation(required = true)
        public Integer rowsRead;

        public static DescribeProcessListResponseProcessListStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessListResponseProcessListStatistics self = new DescribeProcessListResponseProcessListStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeProcessListResponseProcessListStatistics setBytesRead(Integer bytesRead) {
            this.bytesRead = bytesRead;
            return this;
        }
        public Integer getBytesRead() {
            return this.bytesRead;
        }

        public DescribeProcessListResponseProcessListStatistics setElapsedTime(Float elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Float getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeProcessListResponseProcessListStatistics setRowsRead(Integer rowsRead) {
            this.rowsRead = rowsRead;
            return this;
        }
        public Integer getRowsRead() {
            return this.rowsRead;
        }

    }

    public static class DescribeProcessListResponseProcessList extends TeaModel {
        @NameInMap("Rows")
        @Validation(required = true)
        public String rows;

        @NameInMap("RowsBeforeLimitAtLeast")
        @Validation(required = true)
        public String rowsBeforeLimitAtLeast;

        @NameInMap("Data")
        @Validation(required = true)
        public DescribeProcessListResponseProcessListData data;

        @NameInMap("TableSchema")
        @Validation(required = true)
        public DescribeProcessListResponseProcessListTableSchema tableSchema;

        @NameInMap("Statistics")
        @Validation(required = true)
        public DescribeProcessListResponseProcessListStatistics statistics;

        public static DescribeProcessListResponseProcessList build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessListResponseProcessList self = new DescribeProcessListResponseProcessList();
            return TeaModel.build(map, self);
        }

        public DescribeProcessListResponseProcessList setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public DescribeProcessListResponseProcessList setRowsBeforeLimitAtLeast(String rowsBeforeLimitAtLeast) {
            this.rowsBeforeLimitAtLeast = rowsBeforeLimitAtLeast;
            return this;
        }
        public String getRowsBeforeLimitAtLeast() {
            return this.rowsBeforeLimitAtLeast;
        }

        public DescribeProcessListResponseProcessList setData(DescribeProcessListResponseProcessListData data) {
            this.data = data;
            return this;
        }
        public DescribeProcessListResponseProcessListData getData() {
            return this.data;
        }

        public DescribeProcessListResponseProcessList setTableSchema(DescribeProcessListResponseProcessListTableSchema tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public DescribeProcessListResponseProcessListTableSchema getTableSchema() {
            return this.tableSchema;
        }

        public DescribeProcessListResponseProcessList setStatistics(DescribeProcessListResponseProcessListStatistics statistics) {
            this.statistics = statistics;
            return this;
        }
        public DescribeProcessListResponseProcessListStatistics getStatistics() {
            return this.statistics;
        }

    }

}
