// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryHistoryActiveUserStatisticResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5CC5E450-FC43-4F5B-B540-9964BD313427</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of daily active user statistics.</p>
     */
    @NameInMap("UserStatisticList")
    public java.util.List<QueryHistoryActiveUserStatisticResponseBodyUserStatisticList> userStatisticList;

    public static QueryHistoryActiveUserStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryActiveUserStatisticResponseBody self = new QueryHistoryActiveUserStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHistoryActiveUserStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHistoryActiveUserStatisticResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryHistoryActiveUserStatisticResponseBody setUserStatisticList(java.util.List<QueryHistoryActiveUserStatisticResponseBodyUserStatisticList> userStatisticList) {
        this.userStatisticList = userStatisticList;
        return this;
    }
    public java.util.List<QueryHistoryActiveUserStatisticResponseBodyUserStatisticList> getUserStatisticList() {
        return this.userStatisticList;
    }

    public static class QueryHistoryActiveUserStatisticResponseBodyUserStatisticList extends TeaModel {
        /**
         * <p>The number of deduplicated active users on the day.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("ActiveUserCount")
        public Integer activeUserCount;

        /**
         * <p>The date in the standard yyyy-MM-dd format, in the UTC+8 time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-01</p>
         */
        @NameInMap("FormatDate")
        public String formatDate;

        /**
         * <p>The timestamp of the date, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        @NameInMap("TimeStamp")
        public Long timeStamp;

        public static QueryHistoryActiveUserStatisticResponseBodyUserStatisticList build(java.util.Map<String, ?> map) throws Exception {
            QueryHistoryActiveUserStatisticResponseBodyUserStatisticList self = new QueryHistoryActiveUserStatisticResponseBodyUserStatisticList();
            return TeaModel.build(map, self);
        }

        public QueryHistoryActiveUserStatisticResponseBodyUserStatisticList setActiveUserCount(Integer activeUserCount) {
            this.activeUserCount = activeUserCount;
            return this;
        }
        public Integer getActiveUserCount() {
            return this.activeUserCount;
        }

        public QueryHistoryActiveUserStatisticResponseBodyUserStatisticList setFormatDate(String formatDate) {
            this.formatDate = formatDate;
            return this;
        }
        public String getFormatDate() {
            return this.formatDate;
        }

        public QueryHistoryActiveUserStatisticResponseBodyUserStatisticList setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

    }

}
