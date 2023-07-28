// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAuditLogRecordsResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The queried SQL audit logs.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAuditLogRecordsResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeAuditLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditLogRecordsResponseBody self = new DescribeAuditLogRecordsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeAuditLogRecordsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
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

    public DescribeAuditLogRecordsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAuditLogRecordsResponseBodyItems extends TeaModel {
        /**
         * <p>This parameter is unavailable.</p>
         */
        @NameInMap("ConnId")
        public String connId;

        /**
         * <p>The name of the database on which the SQL statement was executed.</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The start time of the execution of the SQL statement. The time is displayed in the ISO 8601 standard in the yyyy-MM-dd HH:mm:ss format. The time must be in UTC.</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <p>The IP address and port number of the client that is used to execute the SQL statement.</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("ProcessID")
        public String processID;

        /**
         * <p>Details of the SQL statement.</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>The type of the SQL statement.</p>
         */
        @NameInMap("SQLType")
        public String SQLType;

        /**
         * <p>Indicates whether the SQL statement was successfully executed. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Succeed")
        public String succeed;

        /**
         * <p>The amount of time that is consumed to execute the SQL statement. Unit: milliseconds.</p>
         */
        @NameInMap("TotalTime")
        public String totalTime;

        /**
         * <p>The name of the user who executed the SQL statement.</p>
         */
        @NameInMap("User")
        public String user;

        public static DescribeAuditLogRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditLogRecordsResponseBodyItems self = new DescribeAuditLogRecordsResponseBodyItems();
            return TeaModel.build(map, self);
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

        public DescribeAuditLogRecordsResponseBodyItems setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public DescribeAuditLogRecordsResponseBodyItems setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeAuditLogRecordsResponseBodyItems setProcessID(String processID) {
            this.processID = processID;
            return this;
        }
        public String getProcessID() {
            return this.processID;
        }

        public DescribeAuditLogRecordsResponseBodyItems setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeAuditLogRecordsResponseBodyItems setSQLType(String SQLType) {
            this.SQLType = SQLType;
            return this;
        }
        public String getSQLType() {
            return this.SQLType;
        }

        public DescribeAuditLogRecordsResponseBodyItems setSucceed(String succeed) {
            this.succeed = succeed;
            return this;
        }
        public String getSucceed() {
            return this.succeed;
        }

        public DescribeAuditLogRecordsResponseBodyItems setTotalTime(String totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public String getTotalTime() {
            return this.totalTime;
        }

        public DescribeAuditLogRecordsResponseBodyItems setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
