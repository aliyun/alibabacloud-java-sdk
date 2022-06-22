// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryRelativeRatioQpsStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryRelativeRatioQpsStatisticsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRelativeRatioQpsStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRelativeRatioQpsStatisticsResponseBody self = new QueryRelativeRatioQpsStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRelativeRatioQpsStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRelativeRatioQpsStatisticsResponseBody setData(java.util.List<QueryRelativeRatioQpsStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryRelativeRatioQpsStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public QueryRelativeRatioQpsStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRelativeRatioQpsStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRelativeRatioQpsStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRelativeRatioQpsStatisticsResponseBodyData extends TeaModel {
        @NameInMap("Ratio")
        public Float ratio;

        @NameInMap("Time")
        public Long time;

        public static QueryRelativeRatioQpsStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRelativeRatioQpsStatisticsResponseBodyData self = new QueryRelativeRatioQpsStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRelativeRatioQpsStatisticsResponseBodyData setRatio(Float ratio) {
            this.ratio = ratio;
            return this;
        }
        public Float getRatio() {
            return this.ratio;
        }

        public QueryRelativeRatioQpsStatisticsResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
