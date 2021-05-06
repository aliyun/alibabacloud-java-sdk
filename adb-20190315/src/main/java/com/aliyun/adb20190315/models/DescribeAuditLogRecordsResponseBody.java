// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAuditLogRecordsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Items")
    public java.util.List<DescribeAuditLogRecordsResponseBodyItems> items;

    public static DescribeAuditLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditLogRecordsResponseBody self = new DescribeAuditLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditLogRecordsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DescribeAuditLogRecordsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAuditLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuditLogRecordsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAuditLogRecordsResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAuditLogRecordsResponseBody setItems(java.util.List<DescribeAuditLogRecordsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAuditLogRecordsResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeAuditLogRecordsResponseBodyItems extends TeaModel {
        @NameInMap("HostAddress")
        public String hostAddress;

        @NameInMap("Succeed")
        public String succeed;

        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("TotalTime")
        public String totalTime;

        @NameInMap("ConnId")
        public String connId;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("SQLType")
        public String SQLType;

        @NameInMap("ExecuteTime")
        public String executeTime;

        @NameInMap("ProcessID")
        public String processID;

        public static DescribeAuditLogRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditLogRecordsResponseBodyItems self = new DescribeAuditLogRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAuditLogRecordsResponseBodyItems setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeAuditLogRecordsResponseBodyItems setSucceed(String succeed) {
            this.succeed = succeed;
            return this;
        }
        public String getSucceed() {
            return this.succeed;
        }

        public DescribeAuditLogRecordsResponseBodyItems setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeAuditLogRecordsResponseBodyItems setTotalTime(String totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public String getTotalTime() {
            return this.totalTime;
        }

        public DescribeAuditLogRecordsResponseBodyItems setConnId(String connId) {
            this.connId = connId;
            return this;
        }
        public String getConnId() {
            return this.connId;
        }

        public DescribeAuditLogRecordsResponseBodyItems setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeAuditLogRecordsResponseBodyItems setSQLType(String SQLType) {
            this.SQLType = SQLType;
            return this;
        }
        public String getSQLType() {
            return this.SQLType;
        }

        public DescribeAuditLogRecordsResponseBodyItems setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public DescribeAuditLogRecordsResponseBodyItems setProcessID(String processID) {
            this.processID = processID;
            return this;
        }
        public String getProcessID() {
            return this.processID;
        }

    }

}
