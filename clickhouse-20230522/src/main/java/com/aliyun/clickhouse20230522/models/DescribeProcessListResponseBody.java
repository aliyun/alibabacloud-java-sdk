// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeProcessListResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     */
    @NameInMap("Data")
    public DescribeProcessListResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx-xxx-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProcessListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessListResponseBody self = new DescribeProcessListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProcessListResponseBody setData(DescribeProcessListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeProcessListResponseBodyData getData() {
        return this.data;
    }

    public DescribeProcessListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeProcessListResponseBodyDataResultSet extends TeaModel {
        /**
         * <p>The address from which the query was initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>0:0:0:0:0:ffff:1edd65ea</p>
         */
        @NameInMap("InitialAddress")
        public String initialAddress;

        /**
         * <p>The query ID.</p>
         * 
         * <strong>example:</strong>
         * <p>\&quot;79f7e40b-87e2-4ef4-b6df-21889a3a030e\&quot;</p>
         */
        @NameInMap("InitialQueryId")
        public String initialQueryId;

        /**
         * <p>The user who initiated the query.</p>
         * 
         * <strong>example:</strong>
         * <p>bany</p>
         */
        @NameInMap("InitialUser")
        public String initialUser;

        /**
         * <p>The query statement.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from test</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>The execution duration of the query, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("QueryDurationMs")
        public Long queryDurationMs;

        /**
         * <p>The start time of the query. The time is in UTC and follows the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-23T10:13:23Z</p>
         */
        @NameInMap("QueryStartTime")
        public String queryStartTime;

        public static DescribeProcessListResponseBodyDataResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessListResponseBodyDataResultSet self = new DescribeProcessListResponseBodyDataResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeProcessListResponseBodyDataResultSet setInitialAddress(String initialAddress) {
            this.initialAddress = initialAddress;
            return this;
        }
        public String getInitialAddress() {
            return this.initialAddress;
        }

        public DescribeProcessListResponseBodyDataResultSet setInitialQueryId(String initialQueryId) {
            this.initialQueryId = initialQueryId;
            return this;
        }
        public String getInitialQueryId() {
            return this.initialQueryId;
        }

        public DescribeProcessListResponseBodyDataResultSet setInitialUser(String initialUser) {
            this.initialUser = initialUser;
            return this;
        }
        public String getInitialUser() {
            return this.initialUser;
        }

        public DescribeProcessListResponseBodyDataResultSet setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public DescribeProcessListResponseBodyDataResultSet setQueryDurationMs(Long queryDurationMs) {
            this.queryDurationMs = queryDurationMs;
            return this;
        }
        public Long getQueryDurationMs() {
            return this.queryDurationMs;
        }

        public DescribeProcessListResponseBodyDataResultSet setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

    }

    public static class DescribeProcessListResponseBodyData extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-xxxx</p>
         */
        @NameInMap("DBInstanceID")
        public Integer DBInstanceID;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>For testing</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The result set.</p>
         */
        @NameInMap("ResultSet")
        public java.util.List<DescribeProcessListResponseBodyDataResultSet> resultSet;

        /**
         * <p>The total number of entries that match the filter criteria.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeProcessListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessListResponseBodyData self = new DescribeProcessListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProcessListResponseBodyData setDBInstanceID(Integer DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }
        public Integer getDBInstanceID() {
            return this.DBInstanceID;
        }

        public DescribeProcessListResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeProcessListResponseBodyData setResultSet(java.util.List<DescribeProcessListResponseBodyDataResultSet> resultSet) {
            this.resultSet = resultSet;
            return this;
        }
        public java.util.List<DescribeProcessListResponseBodyDataResultSet> getResultSet() {
            return this.resultSet;
        }

        public DescribeProcessListResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
