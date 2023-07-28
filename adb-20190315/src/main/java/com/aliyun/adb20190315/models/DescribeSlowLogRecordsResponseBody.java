// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Details of the slow query logs.</p>
     */
    @NameInMap("Items")
    public DescribeSlowLogRecordsResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The time when the execution started. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time is displayed in UTC.</p>
         */
        @NameInMap("ExecutionStartTime")
        public String executionStartTime;

        /**
         * <p>The IP address of the client that is used to connect to the database.</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        /**
         * <p>The amount of output data in the task. Unit: bytes.</p>
         */
        @NameInMap("OutputSize")
        public String outputSize;

        /**
         * <p>The number of rows parsed by the SQL statement.</p>
         */
        @NameInMap("ParseRowCounts")
        public Long parseRowCounts;

        /**
         * <p>The maximum memory usage when the SQL statement is executed. Unit: KB.</p>
         */
        @NameInMap("PeakMemoryUsage")
        public String peakMemoryUsage;

        /**
         * <p>The amount of time consumed to generate execution plans. Unit: milliseconds.</p>
         */
        @NameInMap("PlanningTime")
        public Long planningTime;

        /**
         * <p>The ID of the process.</p>
         */
        @NameInMap("ProcessID")
        public String processID;

        /**
         * <p>The time consumed to execute the SQL statement. Unit: milliseconds.</p>
         */
        @NameInMap("QueryTime")
        public Long queryTime;

        /**
         * <p>The queuing duration before the query is executed. Unit: milliseconds.</p>
         */
        @NameInMap("QueueTime")
        public Long queueTime;

        /**
         * <p>The number of rows returned by the SQL statement.</p>
         */
        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        /**
         * <p>Details of the SQL statement.</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>The number of rows scanned from a data source in the task.</p>
         */
        @NameInMap("ScanRows")
        public Long scanRows;

        /**
         * <p>The amount of scanned data. Unit: KB.</p>
         */
        @NameInMap("ScanSize")
        public String scanSize;

        /**
         * <p>The total amount of time consumed to scan data. It is an accumulated value collected from multiple TableScanNode nodes. Unit: milliseconds.</p>
         */
        @NameInMap("ScanTime")
        public Long scanTime;

        /**
         * <p>The execution state of the SQL statement.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The username.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The accumulated CPU Time value of all operators collected from all nodes. Unit: milliseconds.</p>
         */
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
