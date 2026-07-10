// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeSlowLogTrendResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeSlowLogTrendResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7D3ECB0E-98CA-5E08-A9CA-F70C5A1E9BDF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSlowLogTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogTrendResponseBody self = new DescribeSlowLogTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogTrendResponseBody setData(DescribeSlowLogTrendResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSlowLogTrendResponseBodyData getData() {
        return this.data;
    }

    public DescribeSlowLogTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSlowLogTrendResponseBodyDataResultSet extends TeaModel {
        /**
         * <p>The average execution duration, in milliseconds, of slow SQL queries within the time interval.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("AvgQueryDurationMs")
        public Long avgQueryDurationMs;

        /**
         * <p>The number of slow SQL queries in the time interval.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cnt")
        public Long cnt;

        /**
         * <p>The maximum execution duration, in milliseconds, of slow SQL queries within the time interval.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("MaxQueryDurationMs")
        public Long maxQueryDurationMs;

        /**
         * <p>The minimum execution duration, in milliseconds, of slow SQL queries within the time interval.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MinQueryDurationMs")
        public Long minQueryDurationMs;

        /**
         * <p>The start of the time interval for the data point. The time is in UTC and uses the yyyy-MM-dd hh:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-13 17:48:00</p>
         */
        @NameInMap("QueryStartTime")
        public String queryStartTime;

        public static DescribeSlowLogTrendResponseBodyDataResultSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseBodyDataResultSet self = new DescribeSlowLogTrendResponseBodyDataResultSet();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseBodyDataResultSet setAvgQueryDurationMs(Long avgQueryDurationMs) {
            this.avgQueryDurationMs = avgQueryDurationMs;
            return this;
        }
        public Long getAvgQueryDurationMs() {
            return this.avgQueryDurationMs;
        }

        public DescribeSlowLogTrendResponseBodyDataResultSet setCnt(Long cnt) {
            this.cnt = cnt;
            return this;
        }
        public Long getCnt() {
            return this.cnt;
        }

        public DescribeSlowLogTrendResponseBodyDataResultSet setMaxQueryDurationMs(Long maxQueryDurationMs) {
            this.maxQueryDurationMs = maxQueryDurationMs;
            return this;
        }
        public Long getMaxQueryDurationMs() {
            return this.maxQueryDurationMs;
        }

        public DescribeSlowLogTrendResponseBodyDataResultSet setMinQueryDurationMs(Long minQueryDurationMs) {
            this.minQueryDurationMs = minQueryDurationMs;
            return this;
        }
        public Long getMinQueryDurationMs() {
            return this.minQueryDurationMs;
        }

        public DescribeSlowLogTrendResponseBodyDataResultSet setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

    }

    public static class DescribeSlowLogTrendResponseBodyData extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp100p4q1g9z3****</p>
         */
        @NameInMap("DBInstanceID")
        public Integer DBInstanceID;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>Cluster test</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The result set.</p>
         */
        @NameInMap("ResultSet")
        public java.util.List<DescribeSlowLogTrendResponseBodyDataResultSet> resultSet;

        public static DescribeSlowLogTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogTrendResponseBodyData self = new DescribeSlowLogTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogTrendResponseBodyData setDBInstanceID(Integer DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }
        public Integer getDBInstanceID() {
            return this.DBInstanceID;
        }

        public DescribeSlowLogTrendResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeSlowLogTrendResponseBodyData setResultSet(java.util.List<DescribeSlowLogTrendResponseBodyDataResultSet> resultSet) {
            this.resultSet = resultSet;
            return this;
        }
        public java.util.List<DescribeSlowLogTrendResponseBodyDataResultSet> getResultSet() {
            return this.resultSet;
        }

    }

}
