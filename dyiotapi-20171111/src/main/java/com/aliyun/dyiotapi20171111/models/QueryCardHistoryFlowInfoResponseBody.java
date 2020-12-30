// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class QueryCardHistoryFlowInfoResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<QueryCardHistoryFlowInfoResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCardHistoryFlowInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardHistoryFlowInfoResponseBody self = new QueryCardHistoryFlowInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardHistoryFlowInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCardHistoryFlowInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCardHistoryFlowInfoResponseBody setData(java.util.List<QueryCardHistoryFlowInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCardHistoryFlowInfoResponseBodyData> getData() {
        return this.data;
    }

    public QueryCardHistoryFlowInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCardHistoryFlowInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCardHistoryFlowInfoResponseBodyDataDayUsageList extends TeaModel {
        @NameInMap("Day")
        public Integer day;

        @NameInMap("Value")
        public Long value;

        public static QueryCardHistoryFlowInfoResponseBodyDataDayUsageList build(java.util.Map<String, ?> map) throws Exception {
            QueryCardHistoryFlowInfoResponseBodyDataDayUsageList self = new QueryCardHistoryFlowInfoResponseBodyDataDayUsageList();
            return TeaModel.build(map, self);
        }

        public QueryCardHistoryFlowInfoResponseBodyDataDayUsageList setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public QueryCardHistoryFlowInfoResponseBodyDataDayUsageList setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class QueryCardHistoryFlowInfoResponseBodyData extends TeaModel {
        @NameInMap("DayUsageList")
        public java.util.List<QueryCardHistoryFlowInfoResponseBodyDataDayUsageList> dayUsageList;

        @NameInMap("Month")
        public Long month;

        @NameInMap("CurValue")
        public Long curValue;

        public static QueryCardHistoryFlowInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCardHistoryFlowInfoResponseBodyData self = new QueryCardHistoryFlowInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCardHistoryFlowInfoResponseBodyData setDayUsageList(java.util.List<QueryCardHistoryFlowInfoResponseBodyDataDayUsageList> dayUsageList) {
            this.dayUsageList = dayUsageList;
            return this;
        }
        public java.util.List<QueryCardHistoryFlowInfoResponseBodyDataDayUsageList> getDayUsageList() {
            return this.dayUsageList;
        }

        public QueryCardHistoryFlowInfoResponseBodyData setMonth(Long month) {
            this.month = month;
            return this;
        }
        public Long getMonth() {
            return this.month;
        }

        public QueryCardHistoryFlowInfoResponseBodyData setCurValue(Long curValue) {
            this.curValue = curValue;
            return this;
        }
        public Long getCurValue() {
            return this.curValue;
        }

    }

}
