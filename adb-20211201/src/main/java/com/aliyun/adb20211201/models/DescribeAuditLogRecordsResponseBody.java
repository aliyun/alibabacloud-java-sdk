// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAuditLogRecordsResponseBody extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-t4nj8619bz2w3****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The queried SQL audit logs.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAuditLogRecordsResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8A564B7F-8C00-43C0-8EC5-919FBB70573</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>6974</p>
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
         * <p>The connection ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14356****</p>
         */
        @NameInMap("ConnId")
        public String connId;

        /**
         * <p>The name of the database on which the SQL statement was executed.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The start time of the execution of the SQL statement. The time is displayed in the ISO 8601 standard in the yyyy-MM-dd HH:mm:ss format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-12 10:10:00</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <p>The IP address and port number of the client that is used to execute the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>100.104.XX.XX:43908</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>202106081752021720161662490345362390</p>
         */
        @NameInMap("ProcessID")
        public String processID;

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM adb_hdfs_import_source</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>The type of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        @NameInMap("SQLType")
        public String SQLType;

        /**
         * <p>Indicates whether the SQL statement was successfully executed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Succeed")
        public String succeed;

        /**
         * <p>The amount of time that is consumed to execute the SQL statement. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>216</p>
         */
        @NameInMap("TotalTime")
        public String totalTime;

        /**
         * <p>The username that is used to execute the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
