// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Items")
    public DescribeSlowLogRecordsResponseBodyItems items;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeSlowLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsResponseBody self = new DescribeSlowLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSlowLogRecordsResponseBody setItems(DescribeSlowLogRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSlowLogRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeSlowLogRecordsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowLogRecordsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSlowLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogRecordsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord extends TeaModel {
        @NameInMap("DBName")
        public String DBName;

        @NameInMap("ExecutionStartTime")
        public String executionStartTime;

        @NameInMap("HostAddress")
        public String hostAddress;

        @NameInMap("OutputSize")
        public String outputSize;

        @NameInMap("ParseRowCounts")
        public Long parseRowCounts;

        @NameInMap("PeakMemoryUsage")
        public String peakMemoryUsage;

        @NameInMap("PlanningTime")
        public Long planningTime;

        @NameInMap("ProcessID")
        public String processID;

        @NameInMap("QueryTime")
        public Long queryTime;

        @NameInMap("QueueTime")
        public Long queueTime;

        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("ScanRows")
        public Long scanRows;

        @NameInMap("ScanSize")
        public String scanSize;

        @NameInMap("ScanTime")
        public Long scanTime;

        @NameInMap("State")
        public String state;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("WallTime")
        public Long wallTime;

        public static DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord self = new DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setExecutionStartTime(String executionStartTime) {
            this.executionStartTime = executionStartTime;
            return this;
        }
        public String getExecutionStartTime() {
            return this.executionStartTime;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setOutputSize(String outputSize) {
            this.outputSize = outputSize;
            return this;
        }
        public String getOutputSize() {
            return this.outputSize;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setParseRowCounts(Long parseRowCounts) {
            this.parseRowCounts = parseRowCounts;
            return this;
        }
        public Long getParseRowCounts() {
            return this.parseRowCounts;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setPeakMemoryUsage(String peakMemoryUsage) {
            this.peakMemoryUsage = peakMemoryUsage;
            return this;
        }
        public String getPeakMemoryUsage() {
            return this.peakMemoryUsage;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setPlanningTime(Long planningTime) {
            this.planningTime = planningTime;
            return this;
        }
        public Long getPlanningTime() {
            return this.planningTime;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setProcessID(String processID) {
            this.processID = processID;
            return this;
        }
        public String getProcessID() {
            return this.processID;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setQueryTime(Long queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public Long getQueryTime() {
            return this.queryTime;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setQueueTime(Long queueTime) {
            this.queueTime = queueTime;
            return this;
        }
        public Long getQueueTime() {
            return this.queueTime;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setScanRows(Long scanRows) {
            this.scanRows = scanRows;
            return this;
        }
        public Long getScanRows() {
            return this.scanRows;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setScanSize(String scanSize) {
            this.scanSize = scanSize;
            return this;
        }
        public String getScanSize() {
            return this.scanSize;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setScanTime(Long scanTime) {
            this.scanTime = scanTime;
            return this;
        }
        public Long getScanTime() {
            return this.scanTime;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord setWallTime(Long wallTime) {
            this.wallTime = wallTime;
            return this;
        }
        public Long getWallTime() {
            return this.wallTime;
        }

    }

    public static class DescribeSlowLogRecordsResponseBodyItems extends TeaModel {
        @NameInMap("SlowLogRecord")
        public java.util.List<DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord> slowLogRecord;

        public static DescribeSlowLogRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyItems self = new DescribeSlowLogRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyItems setSlowLogRecord(java.util.List<DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord> slowLogRecord) {
            this.slowLogRecord = slowLogRecord;
            return this;
        }
        public java.util.List<DescribeSlowLogRecordsResponseBodyItemsSlowLogRecord> getSlowLogRecord() {
            return this.slowLogRecord;
        }

    }

}
