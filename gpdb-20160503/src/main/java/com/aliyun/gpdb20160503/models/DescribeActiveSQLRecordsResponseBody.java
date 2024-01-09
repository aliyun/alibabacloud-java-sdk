// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeActiveSQLRecordsResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Queries")
    public java.util.List<DescribeActiveSQLRecordsResponseBodyQueries> queries;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeActiveSQLRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveSQLRecordsResponseBody self = new DescribeActiveSQLRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveSQLRecordsResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeActiveSQLRecordsResponseBody setQueries(java.util.List<DescribeActiveSQLRecordsResponseBodyQueries> queries) {
        this.queries = queries;
        return this;
    }
    public java.util.List<DescribeActiveSQLRecordsResponseBodyQueries> getQueries() {
        return this.queries;
    }

    public DescribeActiveSQLRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeActiveSQLRecordsResponseBodyQueries extends TeaModel {
        @NameInMap("ClientAddr")
        public String clientAddr;

        @NameInMap("Database")
        public String database;

        @NameInMap("PID")
        public String PID;

        @NameInMap("Query")
        public String query;

        @NameInMap("QueryDuration")
        public String queryDuration;

        @NameInMap("QueryStart")
        public String queryStart;

        @NameInMap("SessionID")
        public String sessionID;

        @NameInMap("SqlTruncated")
        public String sqlTruncated;

        @NameInMap("SqlTruncatedThreshold")
        public String sqlTruncatedThreshold;

        @NameInMap("State")
        public String state;

        @NameInMap("User")
        public String user;

        public static DescribeActiveSQLRecordsResponseBodyQueries build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveSQLRecordsResponseBodyQueries self = new DescribeActiveSQLRecordsResponseBodyQueries();
            return TeaModel.build(map, self);
        }

        public DescribeActiveSQLRecordsResponseBodyQueries setClientAddr(String clientAddr) {
            this.clientAddr = clientAddr;
            return this;
        }
        public String getClientAddr() {
            return this.clientAddr;
        }

        public DescribeActiveSQLRecordsResponseBodyQueries setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeActiveSQLRecordsResponseBodyQueries setPID(String PID) {
            this.PID = PID;
            return this;
        }
        public String getPID() {
            return this.PID;
        }

        public DescribeActiveSQLRecordsResponseBodyQueries setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public DescribeActiveSQLRecordsResponseBodyQueries setQueryDuration(String queryDuration) {
            this.queryDuration = queryDuration;
            return this;
        }
        public String getQueryDuration() {
            return this.queryDuration;
        }

        public DescribeActiveSQLRecordsResponseBodyQueries setQueryStart(String queryStart) {
            this.queryStart = queryStart;
            return this;
        }
        public String getQueryStart() {
            return this.queryStart;
        }

        public DescribeActiveSQLRecordsResponseBodyQueries setSessionID(String sessionID) {
            this.sessionID = sessionID;
            return this;
        }
        public String getSessionID() {
            return this.sessionID;
        }

        public DescribeActiveSQLRecordsResponseBodyQueries setSqlTruncated(String sqlTruncated) {
            this.sqlTruncated = sqlTruncated;
            return this;
        }
        public String getSqlTruncated() {
            return this.sqlTruncated;
        }

        public DescribeActiveSQLRecordsResponseBodyQueries setSqlTruncatedThreshold(String sqlTruncatedThreshold) {
            this.sqlTruncatedThreshold = sqlTruncatedThreshold;
            return this;
        }
        public String getSqlTruncatedThreshold() {
            return this.sqlTruncatedThreshold;
        }

        public DescribeActiveSQLRecordsResponseBodyQueries setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeActiveSQLRecordsResponseBodyQueries setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
