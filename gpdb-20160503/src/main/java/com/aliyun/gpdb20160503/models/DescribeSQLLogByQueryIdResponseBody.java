// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogByQueryIdResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeSQLLogByQueryIdResponseBodyItems> items;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSQLLogByQueryIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogByQueryIdResponseBody self = new DescribeSQLLogByQueryIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogByQueryIdResponseBody setItems(java.util.List<DescribeSQLLogByQueryIdResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSQLLogByQueryIdResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeSQLLogByQueryIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSQLLogByQueryIdResponseBodyItems extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("DBRole")
        public String DBRole;

        @NameInMap("ExecuteCost")
        public Float executeCost;

        @NameInMap("ExecuteState")
        public String executeState;

        @NameInMap("OperationClass")
        public String operationClass;

        @NameInMap("OperationExecuteTime")
        public String operationExecuteTime;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("QueryId")
        public String queryId;

        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        @NameInMap("SQLPlan")
        public String SQLPlan;

        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("ScanRowCounts")
        public Long scanRowCounts;

        @NameInMap("SliceIds")
        public java.util.List<String> sliceIds;

        @NameInMap("SourceIP")
        public String sourceIP;

        @NameInMap("SourcePort")
        public Integer sourcePort;

        public static DescribeSQLLogByQueryIdResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogByQueryIdResponseBodyItems self = new DescribeSQLLogByQueryIdResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogByQueryIdResponseBodyItems setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSQLLogByQueryIdResponseBodyItems setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSQLLogByQueryIdResponseBodyItems setDBRole(String DBRole) {
            this.DBRole = DBRole;
            return this;
        }
        public String getDBRole() {
            return this.DBRole;
        }

        public DescribeSQLLogByQueryIdResponseBodyItems setExecuteCost(Float executeCost) {
            this.executeCost = executeCost;
            return this;
        }
        public Float getExecuteCost() {
            return this.executeCost;
        }

        public DescribeSQLLogByQueryIdResponseBodyItems setExecuteState(String executeState) {
            this.executeState = executeState;
            return this;
        }
        public String getExecuteState() {
            return this.executeState;
        }

        public DescribeSQLLogByQueryIdResponseBodyItems setOperationClass(String operationClass) {
            this.operationClass = operationClass;
            return this;
        }
        public String getOperationClass() {
            return this.operationClass;
        }

        public DescribeSQLLogByQueryIdResponseBodyItems setOperationExecuteTime(String operationExecuteTime) {
            this.operationExecuteTime = operationExecuteTime;
            return this;
        }
        public String getOperationExecuteTime() {
            return this.operationExecuteTime;
        }

        public DescribeSQLLogByQueryIdResponseBodyItems setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public DescribeSQLLogByQueryIdResponseBodyItems setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

        public DescribeSQLLogByQueryIdResponseBodyItems setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSQLLogByQueryIdResponseBodyItems setSQLPlan(String SQLPlan) {
            this.SQLPlan = SQLPlan;
            return this;
        }
        public String getSQLPlan() {
            return this.SQLPlan;
        }

        public DescribeSQLLogByQueryIdResponseBodyItems setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLLogByQueryIdResponseBodyItems setScanRowCounts(Long scanRowCounts) {
            this.scanRowCounts = scanRowCounts;
            return this;
        }
        public Long getScanRowCounts() {
            return this.scanRowCounts;
        }

        public DescribeSQLLogByQueryIdResponseBodyItems setSliceIds(java.util.List<String> sliceIds) {
            this.sliceIds = sliceIds;
            return this;
        }
        public java.util.List<String> getSliceIds() {
            return this.sliceIds;
        }

        public DescribeSQLLogByQueryIdResponseBodyItems setSourceIP(String sourceIP) {
            this.sourceIP = sourceIP;
            return this;
        }
        public String getSourceIP() {
            return this.sourceIP;
        }

        public DescribeSQLLogByQueryIdResponseBodyItems setSourcePort(Integer sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public Integer getSourcePort() {
            return this.sourcePort;
        }

    }

}
