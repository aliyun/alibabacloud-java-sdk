// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeWaitingSQLInfoResponseBody extends TeaModel {
    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The queried lock-waiting query.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeWaitingSQLInfoResponseBodyItems> items;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWaitingSQLInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWaitingSQLInfoResponseBody self = new DescribeWaitingSQLInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWaitingSQLInfoResponseBody setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeWaitingSQLInfoResponseBody setItems(java.util.List<DescribeWaitingSQLInfoResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeWaitingSQLInfoResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeWaitingSQLInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWaitingSQLInfoResponseBodyItems extends TeaModel {
        /**
         * <p>The application that sent the query.</p>
         * 
         * <strong>example:</strong>
         * <p>DataGrip 2022.1.5</p>
         */
        @NameInMap("Application")
        public String application;

        /**
         * <p>The application that sent the blocking query.</p>
         * 
         * <strong>example:</strong>
         * <p>DataGrip 2022.1.5</p>
         */
        @NameInMap("BlockedByApplication")
        public String blockedByApplication;

        /**
         * <p>The process ID of the blocking query.</p>
         * 
         * <strong>example:</strong>
         * <p>110</p>
         */
        @NameInMap("BlockedByPID")
        public String blockedByPID;

        /**
         * <p>The SQL statement of the blocking query.</p>
         * 
         * <strong>example:</strong>
         * <p>Select * from t1;</p>
         */
        @NameInMap("BlockedBySQLStmt")
        public String blockedBySQLStmt;

        /**
         * <p>The database account that is used to perform the blocking query.</p>
         * 
         * <strong>example:</strong>
         * <p>testUser1</p>
         */
        @NameInMap("BlockedByUser")
        public String blockedByUser;

        /**
         * <p>The authorized locks.</p>
         * 
         * <strong>example:</strong>
         * <p>ShareLock,AccessExclusiveLock</p>
         */
        @NameInMap("GrantLocks")
        public String grantLocks;

        /**
         * <p>The unauthorized locks.</p>
         * 
         * <strong>example:</strong>
         * <p>AccessShareLock</p>
         */
        @NameInMap("NotGrantLocks")
        public String notGrantLocks;

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
         * <p>The database account that is used to perform the query.</p>
         * 
         * <strong>example:</strong>
         * <p>testUser</p>
         */
        @NameInMap("User")
        public String user;

        public static DescribeWaitingSQLInfoResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeWaitingSQLInfoResponseBodyItems self = new DescribeWaitingSQLInfoResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeWaitingSQLInfoResponseBodyItems setApplication(String application) {
            this.application = application;
            return this;
        }
        public String getApplication() {
            return this.application;
        }

        public DescribeWaitingSQLInfoResponseBodyItems setBlockedByApplication(String blockedByApplication) {
            this.blockedByApplication = blockedByApplication;
            return this;
        }
        public String getBlockedByApplication() {
            return this.blockedByApplication;
        }

        public DescribeWaitingSQLInfoResponseBodyItems setBlockedByPID(String blockedByPID) {
            this.blockedByPID = blockedByPID;
            return this;
        }
        public String getBlockedByPID() {
            return this.blockedByPID;
        }

        public DescribeWaitingSQLInfoResponseBodyItems setBlockedBySQLStmt(String blockedBySQLStmt) {
            this.blockedBySQLStmt = blockedBySQLStmt;
            return this;
        }
        public String getBlockedBySQLStmt() {
            return this.blockedBySQLStmt;
        }

        public DescribeWaitingSQLInfoResponseBodyItems setBlockedByUser(String blockedByUser) {
            this.blockedByUser = blockedByUser;
            return this;
        }
        public String getBlockedByUser() {
            return this.blockedByUser;
        }

        public DescribeWaitingSQLInfoResponseBodyItems setGrantLocks(String grantLocks) {
            this.grantLocks = grantLocks;
            return this;
        }
        public String getGrantLocks() {
            return this.grantLocks;
        }

        public DescribeWaitingSQLInfoResponseBodyItems setNotGrantLocks(String notGrantLocks) {
            this.notGrantLocks = notGrantLocks;
            return this;
        }
        public String getNotGrantLocks() {
            return this.notGrantLocks;
        }

        public DescribeWaitingSQLInfoResponseBodyItems setPID(String PID) {
            this.PID = PID;
            return this;
        }
        public String getPID() {
            return this.PID;
        }

        public DescribeWaitingSQLInfoResponseBodyItems setSQLStmt(String SQLStmt) {
            this.SQLStmt = SQLStmt;
            return this;
        }
        public String getSQLStmt() {
            return this.SQLStmt;
        }

        public DescribeWaitingSQLInfoResponseBodyItems setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
