// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeWaitingSQLRecordsResponseBody extends TeaModel {
    /**
     * <p>The list of lock diagnostics records.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeWaitingSQLRecordsResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWaitingSQLRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWaitingSQLRecordsResponseBody self = new DescribeWaitingSQLRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWaitingSQLRecordsResponseBody setItems(java.util.List<DescribeWaitingSQLRecordsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeWaitingSQLRecordsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeWaitingSQLRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeWaitingSQLRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWaitingSQLRecordsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWaitingSQLRecordsResponseBodyItems extends TeaModel {
        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The ID of the process that uniquely identifies the query.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PID")
        public String PID;

        /**
         * <p>The SQL statement of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>Select * from t1,t2 where t1.id=t2.id;</p>
         */
        @NameInMap("SQLStmt")
        public String SQLStmt;

        /**
         * <p>The ID of the session that contains the query.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("SessionID")
        public String sessionID;

        /**
         * <p>The start time of the query. This value is in the timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1660902033374</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The waiting state of the query. Valid values:</p>
         * <ul>
         * <li><strong>LockWaiting</strong></li>
         * <li><strong>ResourceWaiting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LockWaiting</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The database account that is used to perform the query.</p>
         * 
         * <strong>example:</strong>
         * <p>testUser</p>
         */
        @NameInMap("User")
        public String user;

        /**
         * <p>The waiting period of the query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>26911000</p>
         */
        @NameInMap("WaitingTime")
        public Long waitingTime;

        public static DescribeWaitingSQLRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeWaitingSQLRecordsResponseBodyItems self = new DescribeWaitingSQLRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeWaitingSQLRecordsResponseBodyItems setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeWaitingSQLRecordsResponseBodyItems setPID(String PID) {
            this.PID = PID;
            return this;
        }
        public String getPID() {
            return this.PID;
        }

        public DescribeWaitingSQLRecordsResponseBodyItems setSQLStmt(String SQLStmt) {
            this.SQLStmt = SQLStmt;
            return this;
        }
        public String getSQLStmt() {
            return this.SQLStmt;
        }

        public DescribeWaitingSQLRecordsResponseBodyItems setSessionID(String sessionID) {
            this.sessionID = sessionID;
            return this;
        }
        public String getSessionID() {
            return this.sessionID;
        }

        public DescribeWaitingSQLRecordsResponseBodyItems setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeWaitingSQLRecordsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeWaitingSQLRecordsResponseBodyItems setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public DescribeWaitingSQLRecordsResponseBodyItems setWaitingTime(Long waitingTime) {
            this.waitingTime = waitingTime;
            return this;
        }
        public Long getWaitingTime() {
            return this.waitingTime;
        }

    }

}
