// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class QueryGateVerifyStatisticPublicResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryGateVerifyStatisticPublicResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("StatisticDateStr")
        public String statisticDateStr;

        @NameInMap("TotalFail")
        public Long totalFail;

        @NameInMap("TotalSuccess")
        public Long totalSuccess;

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
        @NameInMap("DayStatistic")
        public java.util.List<QueryGateVerifyStatisticPublicResponseBodyDataDayStatistic> dayStatistic;

        @NameInMap("Total")
        public Long total;

        @NameInMap("TotalFail")
        public Long totalFail;

        @NameInMap("TotalSuccess")
        public Long totalSuccess;

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
