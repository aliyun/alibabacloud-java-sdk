// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    // The database engine.
    @NameInMap("Engine")
    public String engine;

    // Details about the slow query logs.
    @NameInMap("Items")
    public DescribeSlowLogRecordsResponseBodyItems items;

    // The page number of the returned page. The value must be an integer that is greater than 0. Default value: **1**.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of slow query log entries returned on the page.
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries.
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeSlowLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsResponseBody self = new DescribeSlowLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeSlowLogRecordsResponseBody setItems(DescribeSlowLogRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSlowLogRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeSlowLogRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowLogRecordsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSlowLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeSlowLogRecordsResponseBodyItemsLogRecords extends TeaModel {
        // The username of the database account that performs the operation.
        @NameInMap("AccountName")
        public String accountName;

        // The name of the database.
        @NameInMap("DBName")
        public String DBName;

        // The number of documents that are scanned during the operation.
        @NameInMap("DocsExamined")
        public Long docsExamined;

        // The start time of the operation. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("ExecutionStartTime")
        public String executionStartTime;

        // The host IP address that is used to connect to the database.
        @NameInMap("HostAddress")
        public String hostAddress;

        // The data entries that are scanned during indexing.
        @NameInMap("KeysExamined")
        public Long keysExamined;

        // The execution time of the statement. Unit: milliseconds.
        @NameInMap("QueryTimes")
        public String queryTimes;

        // The number of entries returned.
        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        // The SQL statement that is executed during the slow operation.
        @NameInMap("SQLText")
        public String SQLText;

        // The name of the collection.
        @NameInMap("TableName")
        public String tableName;

        public static DescribeSlowLogRecordsResponseBodyItemsLogRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyItemsLogRecords self = new DescribeSlowLogRecordsResponseBodyItemsLogRecords();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setDocsExamined(Long docsExamined) {
            this.docsExamined = docsExamined;
            return this;
        }
        public Long getDocsExamined() {
            return this.docsExamined;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setExecutionStartTime(String executionStartTime) {
            this.executionStartTime = executionStartTime;
            return this;
        }
        public String getExecutionStartTime() {
            return this.executionStartTime;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setKeysExamined(Long keysExamined) {
            this.keysExamined = keysExamined;
            return this;
        }
        public Long getKeysExamined() {
            return this.keysExamined;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setQueryTimes(String queryTimes) {
            this.queryTimes = queryTimes;
            return this;
        }
        public String getQueryTimes() {
            return this.queryTimes;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeSlowLogRecordsResponseBodyItems extends TeaModel {
        @NameInMap("LogRecords")
        public java.util.List<DescribeSlowLogRecordsResponseBodyItemsLogRecords> logRecords;

        public static DescribeSlowLogRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyItems self = new DescribeSlowLogRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyItems setLogRecords(java.util.List<DescribeSlowLogRecordsResponseBodyItemsLogRecords> logRecords) {
            this.logRecords = logRecords;
            return this;
        }
        public java.util.List<DescribeSlowLogRecordsResponseBodyItemsLogRecords> getLogRecords() {
            return this.logRecords;
        }

    }

}
