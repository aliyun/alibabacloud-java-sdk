// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("Items")
    public DescribeSQLLogRecordsResponseBodyItems items;

    public static DescribeSQLLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogRecordsResponseBody self = new DescribeSQLLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLLogRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogRecordsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSQLLogRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSQLLogRecordsResponseBody setItems(DescribeSQLLogRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSQLLogRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeSQLLogRecordsResponseBodyItemsSQLRecord extends TeaModel {
        @NameInMap("HostAddress")
        public String hostAddress;

        @NameInMap("SQLText")
        public String SQLText;

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

        @NameInMap("AccountName")
        public String accountName;

        public static DescribeSQLLogRecordsResponseBodyItemsSQLRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogRecordsResponseBodyItemsSQLRecord self = new DescribeSQLLogRecordsResponseBodyItemsSQLRecord();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLRecord setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLRecord setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLRecord setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLRecord setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLRecord setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLRecord setThreadID(String threadID) {
            this.threadID = threadID;
            return this;
        }
        public String getThreadID() {
            return this.threadID;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLRecord setTotalExecutionTimes(Long totalExecutionTimes) {
            this.totalExecutionTimes = totalExecutionTimes;
            return this;
        }
        public Long getTotalExecutionTimes() {
            return this.totalExecutionTimes;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLRecord setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

    public static class DescribeSQLLogRecordsResponseBodyItems extends TeaModel {
        @NameInMap("SQLRecord")
        public java.util.List<DescribeSQLLogRecordsResponseBodyItemsSQLRecord> SQLRecord;

        public static DescribeSQLLogRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogRecordsResponseBodyItems self = new DescribeSQLLogRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogRecordsResponseBodyItems setSQLRecord(java.util.List<DescribeSQLLogRecordsResponseBodyItemsSQLRecord> SQLRecord) {
            this.SQLRecord = SQLRecord;
            return this;
        }
        public java.util.List<DescribeSQLLogRecordsResponseBodyItemsSQLRecord> getSQLRecord() {
            return this.SQLRecord;
        }

    }

}
