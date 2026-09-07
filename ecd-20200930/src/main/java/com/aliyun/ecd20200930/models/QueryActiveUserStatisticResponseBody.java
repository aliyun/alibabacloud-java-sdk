// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryActiveUserStatisticResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of data points.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of active user statistics.</p>
     */
    @NameInMap("UserStatisticList")
    public java.util.List<QueryActiveUserStatisticResponseBodyUserStatisticList> userStatisticList;

    public static QueryActiveUserStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryActiveUserStatisticResponseBody self = new QueryActiveUserStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryActiveUserStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryActiveUserStatisticResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryActiveUserStatisticResponseBody setUserStatisticList(java.util.List<QueryActiveUserStatisticResponseBodyUserStatisticList> userStatisticList) {
        this.userStatisticList = userStatisticList;
        return this;
    }
    public java.util.List<QueryActiveUserStatisticResponseBodyUserStatisticList> getUserStatisticList() {
        return this.userStatisticList;
    }

    public static class QueryActiveUserStatisticResponseBodyUserStatisticList extends TeaModel {
        /**
         * <p>The number of deduplicated active users within the statistical period.</p>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("ActiveUserCount")
        public Integer activeUserCount;

        /**
         * <p>The formatted date string in UTC+8, in the format of yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-30</p>
         */
        @NameInMap("FormatDate")
        public String formatDate;

        /**
         * <p>The epoch timestamp in milliseconds corresponding to the data point.</p>
         * 
         * <strong>example:</strong>
         * <p>1606723951000</p>
         */
        @NameInMap("TimeStamp")
        public Long timeStamp;

        public static QueryActiveUserStatisticResponseBodyUserStatisticList build(java.util.Map<String, ?> map) throws Exception {
            QueryActiveUserStatisticResponseBodyUserStatisticList self = new QueryActiveUserStatisticResponseBodyUserStatisticList();
            return TeaModel.build(map, self);
        }

        public QueryActiveUserStatisticResponseBodyUserStatisticList setActiveUserCount(Integer activeUserCount) {
            this.activeUserCount = activeUserCount;
            return this;
        }
        public Integer getActiveUserCount() {
            return this.activeUserCount;
        }

        public QueryActiveUserStatisticResponseBodyUserStatisticList setFormatDate(String formatDate) {
            this.formatDate = formatDate;
            return this;
        }
        public String getFormatDate() {
            return this.formatDate;
        }

        public QueryActiveUserStatisticResponseBodyUserStatisticList setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

    }

}
