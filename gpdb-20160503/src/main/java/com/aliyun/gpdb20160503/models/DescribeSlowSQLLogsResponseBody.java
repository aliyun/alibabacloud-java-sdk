// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSlowSQLLogsResponseBody extends TeaModel {
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public java.util.List<DescribeSlowSQLLogsResponseBodyItems> items;

    public static DescribeSlowSQLLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowSQLLogsResponseBody self = new DescribeSlowSQLLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowSQLLogsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSlowSQLLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowSQLLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowSQLLogsResponseBody setItems(java.util.List<DescribeSlowSQLLogsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSlowSQLLogsResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeSlowSQLLogsResponseBodyItems extends TeaModel {
        @NameInMap("OperationClass")
        public String operationClass;

        @NameInMap("ExecuteState")
        public String executeState;

        @NameInMap("ExecuteCost")
        public Float executeCost;

        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("SourcePort")
        public Integer sourcePort;

        @NameInMap("DBRole")
        public String DBRole;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("SourceIP")
        public String sourceIP;

        @NameInMap("SQLPlan")
        public String SQLPlan;

        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("OperationExecuteTime")
        public String operationExecuteTime;

        @NameInMap("ScanRowCounts")
        public Long scanRowCounts;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("QueryId")
        public String queryId;

        public static DescribeSlowSQLLogsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowSQLLogsResponseBodyItems self = new DescribeSlowSQLLogsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSlowSQLLogsResponseBodyItems setOperationClass(String operationClass) {
            this.operationClass = operationClass;
            return this;
        }
        public String getOperationClass() {
            return this.operationClass;
        }

        public DescribeSlowSQLLogsResponseBodyItems setExecuteState(String executeState) {
            this.executeState = executeState;
            return this;
        }
        public String getExecuteState() {
            return this.executeState;
        }

        public DescribeSlowSQLLogsResponseBodyItems setExecuteCost(Float executeCost) {
            this.executeCost = executeCost;
            return this;
        }
        public Float getExecuteCost() {
            return this.executeCost;
        }

        public DescribeSlowSQLLogsResponseBodyItems setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSlowSQLLogsResponseBodyItems setSourcePort(Integer sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public Integer getSourcePort() {
            return this.sourcePort;
        }

        public DescribeSlowSQLLogsResponseBodyItems setDBRole(String DBRole) {
            this.DBRole = DBRole;
            return this;
        }
        public String getDBRole() {
            return this.DBRole;
        }

        public DescribeSlowSQLLogsResponseBodyItems setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public DescribeSlowSQLLogsResponseBodyItems setSourceIP(String sourceIP) {
            this.sourceIP = sourceIP;
            return this;
        }
        public String getSourceIP() {
            return this.sourceIP;
        }

        public DescribeSlowSQLLogsResponseBodyItems setSQLPlan(String SQLPlan) {
            this.SQLPlan = SQLPlan;
            return this;
        }
        public String getSQLPlan() {
            return this.SQLPlan;
        }

        public DescribeSlowSQLLogsResponseBodyItems setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSlowSQLLogsResponseBodyItems setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSlowSQLLogsResponseBodyItems setOperationExecuteTime(String operationExecuteTime) {
            this.operationExecuteTime = operationExecuteTime;
            return this;
        }
        public String getOperationExecuteTime() {
            return this.operationExecuteTime;
        }

        public DescribeSlowSQLLogsResponseBodyItems setScanRowCounts(Long scanRowCounts) {
            this.scanRowCounts = scanRowCounts;
            return this;
        }
        public Long getScanRowCounts() {
            return this.scanRowCounts;
        }

        public DescribeSlowSQLLogsResponseBodyItems setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSlowSQLLogsResponseBodyItems setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

    }

}
