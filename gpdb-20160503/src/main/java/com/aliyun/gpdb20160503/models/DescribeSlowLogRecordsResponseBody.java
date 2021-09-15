// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("Items")
    public DescribeSlowLogRecordsResponseBodyItems items;

    public static DescribeSlowLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsResponseBody self = new DescribeSlowLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowLogRecordsResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeSlowLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogRecordsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSlowLogRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSlowLogRecordsResponseBody setItems(DescribeSlowLogRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSlowLogRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord extends TeaModel {
        @NameInMap("ExecutionStartTime")
        public String executionStartTime;

        @NameInMap("HostAddress")
        public String hostAddress;

        @NameInMap("QueryTimes")
        public Long queryTimes;

        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        @NameInMap("ParseRowCounts")
        public Long parseRowCounts;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("LockTimes")
        public Long lockTimes;

        public static DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord self = new DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setExecutionStartTime(String executionStartTime) {
            this.executionStartTime = executionStartTime;
            return this;
        }
        public String getExecutionStartTime() {
            return this.executionStartTime;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setQueryTimes(Long queryTimes) {
            this.queryTimes = queryTimes;
            return this;
        }
        public Long getQueryTimes() {
            return this.queryTimes;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setParseRowCounts(Long parseRowCounts) {
            this.parseRowCounts = parseRowCounts;
            return this;
        }
        public Long getParseRowCounts() {
            return this.parseRowCounts;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setLockTimes(Long lockTimes) {
            this.lockTimes = lockTimes;
            return this;
        }
        public Long getLockTimes() {
            return this.lockTimes;
        }

    }

    public static class DescribeSlowLogRecordsResponseBodyItems extends TeaModel {
        @NameInMap("SQLSlowRecord")
        public java.util.List<DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord> SQLSlowRecord;

        public static DescribeSlowLogRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyItems self = new DescribeSlowLogRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyItems setSQLSlowRecord(java.util.List<DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord> SQLSlowRecord) {
            this.SQLSlowRecord = SQLSlowRecord;
            return this;
        }
        public java.util.List<DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord> getSQLSlowRecord() {
            return this.SQLSlowRecord;
        }

    }

}
