// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeAdvancedQueryHistoryResponseBody extends TeaModel {
    /**
     * <p>The list of advanced query records.</p>
     */
    @NameInMap("QueryHistoryList")
    public java.util.List<DescribeAdvancedQueryHistoryResponseBodyQueryHistoryList> queryHistoryList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>19F032B7-5FD8-5AC9-97FD-ACF54371****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAdvancedQueryHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvancedQueryHistoryResponseBody self = new DescribeAdvancedQueryHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdvancedQueryHistoryResponseBody setQueryHistoryList(java.util.List<DescribeAdvancedQueryHistoryResponseBodyQueryHistoryList> queryHistoryList) {
        this.queryHistoryList = queryHistoryList;
        return this;
    }
    public java.util.List<DescribeAdvancedQueryHistoryResponseBodyQueryHistoryList> getQueryHistoryList() {
        return this.queryHistoryList;
    }

    public DescribeAdvancedQueryHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAdvancedQueryHistoryResponseBodyQueryHistoryList extends TeaModel {
        /**
         * <p>The ID of the advanced query record.</p>
         * 
         * <strong>example:</strong>
         * <p>query-uIkIvLiVSuCKqg0yoa****</p>
         */
        @NameInMap("QueryId")
        public String queryId;

        /**
         * <p>The conditional statement for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>event.userIdentity.accessKeyId: *</p>
         */
        @NameInMap("QuerySql")
        public String querySql;

        /**
         * <p>Indicates whether simple query mode is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SimpleQuery")
        public Boolean simpleQuery;

        /**
         * <p>The time when the advanced query record was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1753695874000</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeAdvancedQueryHistoryResponseBodyQueryHistoryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvancedQueryHistoryResponseBodyQueryHistoryList self = new DescribeAdvancedQueryHistoryResponseBodyQueryHistoryList();
            return TeaModel.build(map, self);
        }

        public DescribeAdvancedQueryHistoryResponseBodyQueryHistoryList setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

        public DescribeAdvancedQueryHistoryResponseBodyQueryHistoryList setQuerySql(String querySql) {
            this.querySql = querySql;
            return this;
        }
        public String getQuerySql() {
            return this.querySql;
        }

        public DescribeAdvancedQueryHistoryResponseBodyQueryHistoryList setSimpleQuery(Boolean simpleQuery) {
            this.simpleQuery = simpleQuery;
            return this;
        }
        public Boolean getSimpleQuery() {
            return this.simpleQuery;
        }

        public DescribeAdvancedQueryHistoryResponseBodyQueryHistoryList setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

}
