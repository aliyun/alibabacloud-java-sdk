// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeProcessListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeProcessListResponseBodyData data;

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
        @NameInMap("InitialAddress")
        public String initialAddress;

        @NameInMap("InitialQueryId")
        public String initialQueryId;

        @NameInMap("InitialUser")
        public String initialUser;

        @NameInMap("Query")
        public String query;

        @NameInMap("QueryDurationMs")
        public Long queryDurationMs;

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
        @NameInMap("DBInstanceID")
        public Integer DBInstanceID;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("ResultSet")
        public java.util.List<DescribeProcessListResponseBodyDataResultSet> resultSet;

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
