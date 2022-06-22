// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryClusterTimeStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryClusterTimeStatisticsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryClusterTimeStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterTimeStatisticsResponseBody self = new QueryClusterTimeStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryClusterTimeStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryClusterTimeStatisticsResponseBody setData(QueryClusterTimeStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryClusterTimeStatisticsResponseBodyData getData() {
        return this.data;
    }

    public QueryClusterTimeStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryClusterTimeStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryClusterTimeStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryClusterTimeStatisticsResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Avg")
        public Float avg;

        @NameInMap("Max")
        public Float max;

        @NameInMap("Min")
        public Float min;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Percent50")
        public Float percent50;

        @NameInMap("Percent75")
        public Float percent75;

        @NameInMap("Percent90")
        public Float percent90;

        @NameInMap("Percent95")
        public Float percent95;

        @NameInMap("Percent99")
        public Float percent99;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("UserId")
        public String userId;

        public static QueryClusterTimeStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterTimeStatisticsResponseBodyData self = new QueryClusterTimeStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryClusterTimeStatisticsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryClusterTimeStatisticsResponseBodyData setAvg(Float avg) {
            this.avg = avg;
            return this;
        }
        public Float getAvg() {
            return this.avg;
        }

        public QueryClusterTimeStatisticsResponseBodyData setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

        public QueryClusterTimeStatisticsResponseBodyData setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

        public QueryClusterTimeStatisticsResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryClusterTimeStatisticsResponseBodyData setPercent50(Float percent50) {
            this.percent50 = percent50;
            return this;
        }
        public Float getPercent50() {
            return this.percent50;
        }

        public QueryClusterTimeStatisticsResponseBodyData setPercent75(Float percent75) {
            this.percent75 = percent75;
            return this;
        }
        public Float getPercent75() {
            return this.percent75;
        }

        public QueryClusterTimeStatisticsResponseBodyData setPercent90(Float percent90) {
            this.percent90 = percent90;
            return this;
        }
        public Float getPercent90() {
            return this.percent90;
        }

        public QueryClusterTimeStatisticsResponseBodyData setPercent95(Float percent95) {
            this.percent95 = percent95;
            return this;
        }
        public Float getPercent95() {
            return this.percent95;
        }

        public QueryClusterTimeStatisticsResponseBodyData setPercent99(Float percent99) {
            this.percent99 = percent99;
            return this;
        }
        public Float getPercent99() {
            return this.percent99;
        }

        public QueryClusterTimeStatisticsResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public QueryClusterTimeStatisticsResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryClusterTimeStatisticsResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
