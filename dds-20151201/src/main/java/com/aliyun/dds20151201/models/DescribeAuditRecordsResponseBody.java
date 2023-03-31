// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAuditRecordsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the information of audit log entries.</p>
     */
    @NameInMap("Items")
    public DescribeAuditRecordsResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries on the current page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeAuditRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditRecordsResponseBody self = new DescribeAuditRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditRecordsResponseBody setItems(DescribeAuditRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeAuditRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeAuditRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAuditRecordsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeAuditRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuditRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeAuditRecordsResponseBodyItemsSQLRecord extends TeaModel {
        /**
         * <p>The account of the database.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The time when the statement was executed. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <p>The IP addresses of the client.</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        /**
         * <p>The number of SQL audit log entries that are returned.</p>
         */
        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        /**
         * <p>The statement that was executed.</p>
         */
        @NameInMap("Syntax")
        public String syntax;

        /**
         * <p>The name of the collection.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The ID of the thread.</p>
         */
        @NameInMap("ThreadID")
        public String threadID;

        /**
         * <p>The execution time of the statement. Unit: microseconds.</p>
         */
        @NameInMap("TotalExecutionTimes")
        public Long totalExecutionTimes;

        public static DescribeAuditRecordsResponseBodyItemsSQLRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditRecordsResponseBodyItemsSQLRecord self = new DescribeAuditRecordsResponseBodyItemsSQLRecord();
            return TeaModel.build(map, self);
        }

        public DescribeAuditRecordsResponseBodyItemsSQLRecord setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeAuditRecordsResponseBodyItemsSQLRecord setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeAuditRecordsResponseBodyItemsSQLRecord setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public DescribeAuditRecordsResponseBodyItemsSQLRecord setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeAuditRecordsResponseBodyItemsSQLRecord setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeAuditRecordsResponseBodyItemsSQLRecord setSyntax(String syntax) {
            this.syntax = syntax;
            return this;
        }
        public String getSyntax() {
            return this.syntax;
        }

        public DescribeAuditRecordsResponseBodyItemsSQLRecord setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeAuditRecordsResponseBodyItemsSQLRecord setThreadID(String threadID) {
            this.threadID = threadID;
            return this;
        }
        public String getThreadID() {
            return this.threadID;
        }

        public DescribeAuditRecordsResponseBodyItemsSQLRecord setTotalExecutionTimes(Long totalExecutionTimes) {
            this.totalExecutionTimes = totalExecutionTimes;
            return this;
        }
        public Long getTotalExecutionTimes() {
            return this.totalExecutionTimes;
        }

    }

    public static class DescribeAuditRecordsResponseBodyItems extends TeaModel {
        @NameInMap("SQLRecord")
        public java.util.List<DescribeAuditRecordsResponseBodyItemsSQLRecord> SQLRecord;

        public static DescribeAuditRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditRecordsResponseBodyItems self = new DescribeAuditRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAuditRecordsResponseBodyItems setSQLRecord(java.util.List<DescribeAuditRecordsResponseBodyItemsSQLRecord> SQLRecord) {
            this.SQLRecord = SQLRecord;
            return this;
        }
        public java.util.List<DescribeAuditRecordsResponseBodyItemsSQLRecord> getSQLRecord() {
            return this.SQLRecord;
        }

    }

}
