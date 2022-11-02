// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeWaitingSQLInfoResponseBody extends TeaModel {
    @NameInMap("Database")
    public String database;

    @NameInMap("Items")
    public java.util.List<DescribeWaitingSQLInfoResponseBodyItems> items;

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
        @NameInMap("Application")
        public String application;

        @NameInMap("BlockedByApplication")
        public String blockedByApplication;

        @NameInMap("BlockedByPID")
        public String blockedByPID;

        @NameInMap("BlockedBySQLStmt")
        public String blockedBySQLStmt;

        @NameInMap("BlockedByUser")
        public String blockedByUser;

        @NameInMap("GrantLocks")
        public String grantLocks;

        @NameInMap("NotGrantLocks")
        public String notGrantLocks;

        @NameInMap("PID")
        public String PID;

        @NameInMap("SQLStmt")
        public String SQLStmt;

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
