// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeActiveSQLRecordsResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp***************</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The queried SQL records.</p>
     */
    @NameInMap("Queries")
    public java.util.List<DescribeActiveSQLRecordsResponseBodyQueries> queries;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
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
        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0</p>
         */
        @NameInMap("ClientAddr")
        public String clientAddr;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>xg_analyse</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The progress ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6164</p>
         */
        @NameInMap("PID")
        public String PID;

        /**
         * <p>The SQL statement of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>Select * from t1,t2 where t1.id=t2.id;</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>The execution duration of the query. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60s</p>
         */
        @NameInMap("QueryDuration")
        public String queryDuration;

        /**
         * <p>The start time of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-07T06:59Z</p>
         */
        @NameInMap("QueryStart")
        public String queryStart;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6612</p>
         */
        @NameInMap("SessionID")
        public String sessionID;

        /**
         * <p>Indicates whether the SQL statement is truncated. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SqlTruncated")
        public String sqlTruncated;

        /**
         * <p>The threshold that is used to truncate the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("SqlTruncatedThreshold")
        public String sqlTruncatedThreshold;

        /**
         * <p>The status of the asynchronous request. Valid values:</p>
         * <ul>
         * <li><strong>RUNNING</strong></li>
         * <li><strong>BLOCK</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>testuser</p>
         */
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
