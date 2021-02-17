// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public DescribeSlowLogRecordsResponseBodyItems items;

    @NameInMap("Engine")
    public String engine;

    public static DescribeSlowLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsResponseBody self = new DescribeSlowLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
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

    public DescribeSlowLogRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowLogRecordsResponseBody setItems(DescribeSlowLogRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSlowLogRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeSlowLogRecordsResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public static class DescribeSlowLogRecordsResponseBodyItemsLogRecords extends TeaModel {
        @NameInMap("ExecutionStartTime")
        public String executionStartTime;

        @NameInMap("HostAddress")
        public String hostAddress;

        @NameInMap("QueryTimes")
        public String queryTimes;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        @NameInMap("KeysExamined")
        public Long keysExamined;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("DocsExamined")
        public Long docsExamined;

        @NameInMap("AccountName")
        public String accountName;

        public static DescribeSlowLogRecordsResponseBodyItemsLogRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyItemsLogRecords self = new DescribeSlowLogRecordsResponseBodyItemsLogRecords();
            return TeaModel.build(map, self);
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

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setQueryTimes(String queryTimes) {
            this.queryTimes = queryTimes;
            return this;
        }
        public String getQueryTimes() {
            return this.queryTimes;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setKeysExamined(Long keysExamined) {
            this.keysExamined = keysExamined;
            return this;
        }
        public Long getKeysExamined() {
            return this.keysExamined;
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

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
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
