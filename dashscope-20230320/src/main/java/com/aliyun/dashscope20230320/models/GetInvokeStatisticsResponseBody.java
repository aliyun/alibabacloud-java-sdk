// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashscope20230320.models;

import com.aliyun.tea.*;

public class GetInvokeStatisticsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public java.util.List<GetInvokeStatisticsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetInvokeStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInvokeStatisticsResponseBody self = new GetInvokeStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInvokeStatisticsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetInvokeStatisticsResponseBody setData(java.util.List<GetInvokeStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetInvokeStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public GetInvokeStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInvokeStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInvokeStatisticsResponseBodyDataMetrics extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Day")
        public String day;

        @NameInMap("Hour")
        public String hour;

        public static GetInvokeStatisticsResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetInvokeStatisticsResponseBodyDataMetrics self = new GetInvokeStatisticsResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public GetInvokeStatisticsResponseBodyDataMetrics setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetInvokeStatisticsResponseBodyDataMetrics setDay(String day) {
            this.day = day;
            return this;
        }
        public String getDay() {
            return this.day;
        }

        public GetInvokeStatisticsResponseBodyDataMetrics setHour(String hour) {
            this.hour = hour;
            return this;
        }
        public String getHour() {
            return this.hour;
        }

    }

    public static class GetInvokeStatisticsResponseBodyData extends TeaModel {
        /**
         * <p>ApiKey</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        @NameInMap("Metrics")
        public java.util.List<GetInvokeStatisticsResponseBodyDataMetrics> metrics;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("NumUnit")
        public String numUnit;

        @NameInMap("Region")
        public String region;

        @NameInMap("StatisticsUnit")
        public String statisticsUnit;

        @NameInMap("TimeUnit")
        public String timeUnit;

        public static GetInvokeStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInvokeStatisticsResponseBodyData self = new GetInvokeStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInvokeStatisticsResponseBodyData setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public GetInvokeStatisticsResponseBodyData setMetrics(java.util.List<GetInvokeStatisticsResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<GetInvokeStatisticsResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public GetInvokeStatisticsResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetInvokeStatisticsResponseBodyData setNumUnit(String numUnit) {
            this.numUnit = numUnit;
            return this;
        }
        public String getNumUnit() {
            return this.numUnit;
        }

        public GetInvokeStatisticsResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetInvokeStatisticsResponseBodyData setStatisticsUnit(String statisticsUnit) {
            this.statisticsUnit = statisticsUnit;
            return this;
        }
        public String getStatisticsUnit() {
            return this.statisticsUnit;
        }

        public GetInvokeStatisticsResponseBodyData setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

}
