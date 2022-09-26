// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogsV2ResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeSQLLogsV2ResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSQLLogsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogsV2ResponseBody self = new DescribeSQLLogsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogsV2ResponseBody setItems(java.util.List<DescribeSQLLogsV2ResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSQLLogsV2ResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeSQLLogsV2ResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogsV2ResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSQLLogsV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSQLLogsV2ResponseBodyItems extends TeaModel {
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

        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("ScanRowCounts")
        public Long scanRowCounts;

        @NameInMap("SourceIP")
        public String sourceIP;

        @NameInMap("SourcePort")
        public Integer sourcePort;

        public static DescribeSQLLogsV2ResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogsV2ResponseBodyItems self = new DescribeSQLLogsV2ResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogsV2ResponseBodyItems setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSQLLogsV2ResponseBodyItems setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSQLLogsV2ResponseBodyItems setDBRole(String DBRole) {
            this.DBRole = DBRole;
            return this;
        }
        public String getDBRole() {
            return this.DBRole;
        }

        public DescribeSQLLogsV2ResponseBodyItems setExecuteCost(Float executeCost) {
            this.executeCost = executeCost;
            return this;
        }
        public Float getExecuteCost() {
            return this.executeCost;
        }

        public DescribeSQLLogsV2ResponseBodyItems setExecuteState(String executeState) {
            this.executeState = executeState;
            return this;
        }
        public String getExecuteState() {
            return this.executeState;
        }

        public DescribeSQLLogsV2ResponseBodyItems setOperationClass(String operationClass) {
            this.operationClass = operationClass;
            return this;
        }
        public String getOperationClass() {
            return this.operationClass;
        }

        public DescribeSQLLogsV2ResponseBodyItems setOperationExecuteTime(String operationExecuteTime) {
            this.operationExecuteTime = operationExecuteTime;
            return this;
        }
        public String getOperationExecuteTime() {
            return this.operationExecuteTime;
        }

        public DescribeSQLLogsV2ResponseBodyItems setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public DescribeSQLLogsV2ResponseBodyItems setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSQLLogsV2ResponseBodyItems setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLLogsV2ResponseBodyItems setScanRowCounts(Long scanRowCounts) {
            this.scanRowCounts = scanRowCounts;
            return this;
        }
        public Long getScanRowCounts() {
            return this.scanRowCounts;
        }

        public DescribeSQLLogsV2ResponseBodyItems setSourceIP(String sourceIP) {
            this.sourceIP = sourceIP;
            return this;
        }
        public String getSourceIP() {
            return this.sourceIP;
        }

        public DescribeSQLLogsV2ResponseBodyItems setSourcePort(Integer sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public Integer getSourcePort() {
            return this.sourcePort;
        }

    }

}
