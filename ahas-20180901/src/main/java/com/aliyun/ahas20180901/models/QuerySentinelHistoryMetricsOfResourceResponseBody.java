// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySentinelHistoryMetricsOfResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QuerySentinelHistoryMetricsOfResourceResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySentinelHistoryMetricsOfResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySentinelHistoryMetricsOfResourceResponseBody self = new QuerySentinelHistoryMetricsOfResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySentinelHistoryMetricsOfResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySentinelHistoryMetricsOfResourceResponseBody setData(java.util.List<QuerySentinelHistoryMetricsOfResourceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySentinelHistoryMetricsOfResourceResponseBodyData> getData() {
        return this.data;
    }

    public QuerySentinelHistoryMetricsOfResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySentinelHistoryMetricsOfResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySentinelHistoryMetricsOfResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySentinelHistoryMetricsOfResourceResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("passQpsL1")
        public Float passQpsL1;

        @NameInMap("resource")
        public String resource;

        @NameInMap("rtL1")
        public Float rtL1;

        @NameInMap("timestamp")
        public Long timestamp;

        public static QuerySentinelHistoryMetricsOfResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySentinelHistoryMetricsOfResourceResponseBodyData self = new QuerySentinelHistoryMetricsOfResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySentinelHistoryMetricsOfResourceResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QuerySentinelHistoryMetricsOfResourceResponseBodyData setPassQpsL1(Float passQpsL1) {
            this.passQpsL1 = passQpsL1;
            return this;
        }
        public Float getPassQpsL1() {
            return this.passQpsL1;
        }

        public QuerySentinelHistoryMetricsOfResourceResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public QuerySentinelHistoryMetricsOfResourceResponseBodyData setRtL1(Float rtL1) {
            this.rtL1 = rtL1;
            return this;
        }
        public Float getRtL1() {
            return this.rtL1;
        }

        public QuerySentinelHistoryMetricsOfResourceResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
