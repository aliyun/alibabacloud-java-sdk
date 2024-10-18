// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class QueryGateVerifyStatisticPublicResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li>If OK is returned, the request is successful.</li>
     * <li>For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/85198.html">API response codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the calls of Phone Number Verification Service, including the total calls, the successful calls, failed calls, unknown calls, and daily calls within the statistical date range.</p>
     */
    @NameInMap("Data")
    public QueryGateVerifyStatisticPublicResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8906582E-6722</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryGateVerifyStatisticPublicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGateVerifyStatisticPublicResponseBody self = new QueryGateVerifyStatisticPublicResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGateVerifyStatisticPublicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGateVerifyStatisticPublicResponseBody setData(QueryGateVerifyStatisticPublicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryGateVerifyStatisticPublicResponseBodyData getData() {
        return this.data;
    }

    public QueryGateVerifyStatisticPublicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGateVerifyStatisticPublicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryGateVerifyStatisticPublicResponseBodyDataDayStatistic extends TeaModel {
        /**
         * <p>The date. This field is accurate to the day. The value of this field is in the YYYYMMDD format. Example: 20220103.</p>
         * 
         * <strong>example:</strong>
         * <p>20220103</p>
         */
        @NameInMap("StatisticDateStr")
        public String statisticDateStr;

        /**
         * <p>The failed calls on the day.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalFail")
        public Long totalFail;

        /**
         * <p>The successful calls on the day.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalSuccess")
        public Long totalSuccess;

        /**
         * <p>The unknown calls on the day.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalUnknown")
        public Long totalUnknown;

        public static QueryGateVerifyStatisticPublicResponseBodyDataDayStatistic build(java.util.Map<String, ?> map) throws Exception {
            QueryGateVerifyStatisticPublicResponseBodyDataDayStatistic self = new QueryGateVerifyStatisticPublicResponseBodyDataDayStatistic();
            return TeaModel.build(map, self);
        }

        public QueryGateVerifyStatisticPublicResponseBodyDataDayStatistic setStatisticDateStr(String statisticDateStr) {
            this.statisticDateStr = statisticDateStr;
            return this;
        }
        public String getStatisticDateStr() {
            return this.statisticDateStr;
        }

        public QueryGateVerifyStatisticPublicResponseBodyDataDayStatistic setTotalFail(Long totalFail) {
            this.totalFail = totalFail;
            return this;
        }
        public Long getTotalFail() {
            return this.totalFail;
        }

        public QueryGateVerifyStatisticPublicResponseBodyDataDayStatistic setTotalSuccess(Long totalSuccess) {
            this.totalSuccess = totalSuccess;
            return this;
        }
        public Long getTotalSuccess() {
            return this.totalSuccess;
        }

        public QueryGateVerifyStatisticPublicResponseBodyDataDayStatistic setTotalUnknown(Long totalUnknown) {
            this.totalUnknown = totalUnknown;
            return this;
        }
        public Long getTotalUnknown() {
            return this.totalUnknown;
        }

    }

    public static class QueryGateVerifyStatisticPublicResponseBodyData extends TeaModel {
        /**
         * <p>The information about the daily calls.</p>
         */
        @NameInMap("DayStatistic")
        public java.util.List<QueryGateVerifyStatisticPublicResponseBodyDataDayStatistic> dayStatistic;

        /**
         * <p>The total calls.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Total")
        public Long total;

        /**
         * <p>The failed calls.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalFail")
        public Long totalFail;

        /**
         * <p>The successful calls.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalSuccess")
        public Long totalSuccess;

        /**
         * <p>The unknown calls.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalUnknown")
        public Long totalUnknown;

        public static QueryGateVerifyStatisticPublicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryGateVerifyStatisticPublicResponseBodyData self = new QueryGateVerifyStatisticPublicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryGateVerifyStatisticPublicResponseBodyData setDayStatistic(java.util.List<QueryGateVerifyStatisticPublicResponseBodyDataDayStatistic> dayStatistic) {
            this.dayStatistic = dayStatistic;
            return this;
        }
        public java.util.List<QueryGateVerifyStatisticPublicResponseBodyDataDayStatistic> getDayStatistic() {
            return this.dayStatistic;
        }

        public QueryGateVerifyStatisticPublicResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryGateVerifyStatisticPublicResponseBodyData setTotalFail(Long totalFail) {
            this.totalFail = totalFail;
            return this;
        }
        public Long getTotalFail() {
            return this.totalFail;
        }

        public QueryGateVerifyStatisticPublicResponseBodyData setTotalSuccess(Long totalSuccess) {
            this.totalSuccess = totalSuccess;
            return this;
        }
        public Long getTotalSuccess() {
            return this.totalSuccess;
        }

        public QueryGateVerifyStatisticPublicResponseBodyData setTotalUnknown(Long totalUnknown) {
            this.totalUnknown = totalUnknown;
            return this;
        }
        public Long getTotalUnknown() {
            return this.totalUnknown;
        }

    }

}
