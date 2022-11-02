// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeWaitingSQLRecordsResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeWaitingSQLRecordsResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Database")
        public String database;

        @NameInMap("PID")
        public String PID;

        @NameInMap("SQLStmt")
        public String SQLStmt;

        @NameInMap("SessionID")
        public String sessionID;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("User")
        public String user;

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
