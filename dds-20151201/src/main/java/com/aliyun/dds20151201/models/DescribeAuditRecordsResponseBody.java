// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAuditRecordsResponseBody extends TeaModel {
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public DescribeAuditRecordsResponseBodyItems items;

    public static DescribeAuditRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditRecordsResponseBody self = new DescribeAuditRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
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

    public DescribeAuditRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAuditRecordsResponseBody setItems(DescribeAuditRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeAuditRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeAuditRecordsResponseBodyItemsSQLRecord extends TeaModel {
        @NameInMap("HostAddress")
        public String hostAddress;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("ExecuteTime")
        public String executeTime;

        @NameInMap("ThreadID")
        public String threadID;

        @NameInMap("TotalExecutionTimes")
        public Long totalExecutionTimes;

        @NameInMap("Syntax")
        public String syntax;

        @NameInMap("AccountName")
        public String accountName;

        public static DescribeAuditRecordsResponseBodyItemsSQLRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditRecordsResponseBodyItemsSQLRecord self = new DescribeAuditRecordsResponseBodyItemsSQLRecord();
            return TeaModel.build(map, self);
        }

        public DescribeAuditRecordsResponseBodyItemsSQLRecord setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeAuditRecordsResponseBodyItemsSQLRecord setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeAuditRecordsResponseBodyItemsSQLRecord setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
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

        public DescribeAuditRecordsResponseBodyItemsSQLRecord setSyntax(String syntax) {
            this.syntax = syntax;
            return this;
        }
        public String getSyntax() {
            return this.syntax;
        }

        public DescribeAuditRecordsResponseBodyItemsSQLRecord setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
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
