// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryHistoryActiveUserCountResponseBody extends TeaModel {
    /**
     * <p>The active user statistics.</p>
     */
    @NameInMap("ActiveUserCount")
    public QueryHistoryActiveUserCountResponseBodyActiveUserCount activeUserCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890abcdefg</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryHistoryActiveUserCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryActiveUserCountResponseBody self = new QueryHistoryActiveUserCountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHistoryActiveUserCountResponseBody setActiveUserCount(QueryHistoryActiveUserCountResponseBodyActiveUserCount activeUserCount) {
        this.activeUserCount = activeUserCount;
        return this;
    }
    public QueryHistoryActiveUserCountResponseBodyActiveUserCount getActiveUserCount() {
        return this.activeUserCount;
    }

    public QueryHistoryActiveUserCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryHistoryActiveUserCountResponseBodyActiveUserCount extends TeaModel {
        /**
         * <p>The number of daily active users.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DailyActiveUserCount")
        public Integer dailyActiveUserCount;

        /**
         * <p>The number of monthly active users.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("MonthlyActiveUserCount")
        public Integer monthlyActiveUserCount;

        public static QueryHistoryActiveUserCountResponseBodyActiveUserCount build(java.util.Map<String, ?> map) throws Exception {
            QueryHistoryActiveUserCountResponseBodyActiveUserCount self = new QueryHistoryActiveUserCountResponseBodyActiveUserCount();
            return TeaModel.build(map, self);
        }

        public QueryHistoryActiveUserCountResponseBodyActiveUserCount setDailyActiveUserCount(Integer dailyActiveUserCount) {
            this.dailyActiveUserCount = dailyActiveUserCount;
            return this;
        }
        public Integer getDailyActiveUserCount() {
            return this.dailyActiveUserCount;
        }

        public QueryHistoryActiveUserCountResponseBodyActiveUserCount setMonthlyActiveUserCount(Integer monthlyActiveUserCount) {
            this.monthlyActiveUserCount = monthlyActiveUserCount;
            return this;
        }
        public Integer getMonthlyActiveUserCount() {
            return this.monthlyActiveUserCount;
        }

    }

}
