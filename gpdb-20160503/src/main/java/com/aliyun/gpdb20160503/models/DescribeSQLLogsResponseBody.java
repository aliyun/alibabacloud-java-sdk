// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogsResponseBody extends TeaModel {
    /**
     * <p>The queried SQL execution logs.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeSQLLogsResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSQLLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogsResponseBody self = new DescribeSQLLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogsResponseBody setItems(java.util.List<DescribeSQLLogsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSQLLogsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeSQLLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSQLLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSQLLogsResponseBodyItems extends TeaModel {
        /**
         * <p>The database account that executes the SQL statement.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The role of the database.</p>
         */
        @NameInMap("DBRole")
        public String DBRole;

        /**
         * <p>The execution duration of the SQL statement.</p>
         */
        @NameInMap("ExecuteCost")
        public Float executeCost;

        /**
         * <p>The execution status of the SQL statement. Valid values:</p>
         * <br>
         * <p>*   **success**</p>
         * <p>*   **fail**</p>
         */
        @NameInMap("ExecuteState")
        public String executeState;

        /**
         * <p>The type of the query language.</p>
         */
        @NameInMap("OperationClass")
        public String operationClass;

        /**
         * <p>The time when the SQL statement was executed.</p>
         */
        @NameInMap("OperationExecuteTime")
        public String operationExecuteTime;

        /**
         * <p>The type of the SQL statement.</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        /**
         * <p>The SQL execution plan.</p>
         */
        @NameInMap("SQLPlan")
        public String SQLPlan;

        /**
         * <p>The SQL statement.</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>The number of entries scanned.</p>
         */
        @NameInMap("ScanRowCounts")
        public Long scanRowCounts;

        /**
         * <p>The source IP address.</p>
         */
        @NameInMap("SourceIP")
        public String sourceIP;

        /**
         * <p>The number of the source port.</p>
         */
        @NameInMap("SourcePort")
        public Integer sourcePort;

        public static DescribeSQLLogsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogsResponseBodyItems self = new DescribeSQLLogsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogsResponseBodyItems setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSQLLogsResponseBodyItems setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSQLLogsResponseBodyItems setDBRole(String DBRole) {
            this.DBRole = DBRole;
            return this;
        }
        public String getDBRole() {
            return this.DBRole;
        }

        public DescribeSQLLogsResponseBodyItems setExecuteCost(Float executeCost) {
            this.executeCost = executeCost;
            return this;
        }
        public Float getExecuteCost() {
            return this.executeCost;
        }

        public DescribeSQLLogsResponseBodyItems setExecuteState(String executeState) {
            this.executeState = executeState;
            return this;
        }
        public String getExecuteState() {
            return this.executeState;
        }

        public DescribeSQLLogsResponseBodyItems setOperationClass(String operationClass) {
            this.operationClass = operationClass;
            return this;
        }
        public String getOperationClass() {
            return this.operationClass;
        }

        public DescribeSQLLogsResponseBodyItems setOperationExecuteTime(String operationExecuteTime) {
            this.operationExecuteTime = operationExecuteTime;
            return this;
        }
        public String getOperationExecuteTime() {
            return this.operationExecuteTime;
        }

        public DescribeSQLLogsResponseBodyItems setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public DescribeSQLLogsResponseBodyItems setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSQLLogsResponseBodyItems setSQLPlan(String SQLPlan) {
            this.SQLPlan = SQLPlan;
            return this;
        }
        public String getSQLPlan() {
            return this.SQLPlan;
        }

        public DescribeSQLLogsResponseBodyItems setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLLogsResponseBodyItems setScanRowCounts(Long scanRowCounts) {
            this.scanRowCounts = scanRowCounts;
            return this;
        }
        public Long getScanRowCounts() {
            return this.scanRowCounts;
        }

        public DescribeSQLLogsResponseBodyItems setSourceIP(String sourceIP) {
            this.sourceIP = sourceIP;
            return this;
        }
        public String getSourceIP() {
            return this.sourceIP;
        }

        public DescribeSQLLogsResponseBodyItems setSourcePort(Integer sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public Integer getSourcePort() {
            return this.sourcePort;
        }

    }

}
