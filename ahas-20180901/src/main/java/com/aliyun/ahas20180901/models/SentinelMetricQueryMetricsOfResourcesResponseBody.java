// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelMetricQueryMetricsOfResourcesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelMetricQueryMetricsOfResourcesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelMetricQueryMetricsOfResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelMetricQueryMetricsOfResourcesResponseBody self = new SentinelMetricQueryMetricsOfResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelMetricQueryMetricsOfResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelMetricQueryMetricsOfResourcesResponseBody setData(java.util.List<SentinelMetricQueryMetricsOfResourcesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelMetricQueryMetricsOfResourcesResponseBodyData> getData() {
        return this.data;
    }

    public SentinelMetricQueryMetricsOfResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelMetricQueryMetricsOfResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelMetricQueryMetricsOfResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelMetricQueryMetricsOfResourcesResponseBodyDataInnerMetrics extends TeaModel {
        @NameInMap("BlockedQps")
        public Float blockedQps;

        @NameInMap("Exception")
        public Float exception;

        @NameInMap("PassedQps")
        public Float passedQps;

        @NameInMap("Rt")
        public Float rt;

        @NameInMap("SuccessQps")
        public Float successQps;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static SentinelMetricQueryMetricsOfResourcesResponseBodyDataInnerMetrics build(java.util.Map<String, ?> map) throws Exception {
            SentinelMetricQueryMetricsOfResourcesResponseBodyDataInnerMetrics self = new SentinelMetricQueryMetricsOfResourcesResponseBodyDataInnerMetrics();
            return TeaModel.build(map, self);
        }

        public SentinelMetricQueryMetricsOfResourcesResponseBodyDataInnerMetrics setBlockedQps(Float blockedQps) {
            this.blockedQps = blockedQps;
            return this;
        }
        public Float getBlockedQps() {
            return this.blockedQps;
        }

        public SentinelMetricQueryMetricsOfResourcesResponseBodyDataInnerMetrics setException(Float exception) {
            this.exception = exception;
            return this;
        }
        public Float getException() {
            return this.exception;
        }

        public SentinelMetricQueryMetricsOfResourcesResponseBodyDataInnerMetrics setPassedQps(Float passedQps) {
            this.passedQps = passedQps;
            return this;
        }
        public Float getPassedQps() {
            return this.passedQps;
        }

        public SentinelMetricQueryMetricsOfResourcesResponseBodyDataInnerMetrics setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public SentinelMetricQueryMetricsOfResourcesResponseBodyDataInnerMetrics setSuccessQps(Float successQps) {
            this.successQps = successQps;
            return this;
        }
        public Float getSuccessQps() {
            return this.successQps;
        }

        public SentinelMetricQueryMetricsOfResourcesResponseBodyDataInnerMetrics setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class SentinelMetricQueryMetricsOfResourcesResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("InnerMetrics")
        public java.util.List<SentinelMetricQueryMetricsOfResourcesResponseBodyDataInnerMetrics> innerMetrics;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("UserId")
        public String userId;

        public static SentinelMetricQueryMetricsOfResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelMetricQueryMetricsOfResourcesResponseBodyData self = new SentinelMetricQueryMetricsOfResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelMetricQueryMetricsOfResourcesResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelMetricQueryMetricsOfResourcesResponseBodyData setInnerMetrics(java.util.List<SentinelMetricQueryMetricsOfResourcesResponseBodyDataInnerMetrics> innerMetrics) {
            this.innerMetrics = innerMetrics;
            return this;
        }
        public java.util.List<SentinelMetricQueryMetricsOfResourcesResponseBodyDataInnerMetrics> getInnerMetrics() {
            return this.innerMetrics;
        }

        public SentinelMetricQueryMetricsOfResourcesResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelMetricQueryMetricsOfResourcesResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelMetricQueryMetricsOfResourcesResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
