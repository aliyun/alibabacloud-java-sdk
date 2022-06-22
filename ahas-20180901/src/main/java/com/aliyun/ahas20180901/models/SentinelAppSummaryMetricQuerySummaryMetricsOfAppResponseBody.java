// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBody self = new SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBody setData(java.util.List<SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData> getData() {
        return this.data;
    }

    public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("blockedQps")
        public Float blockedQps;

        @NameInMap("count")
        public Integer count;

        @NameInMap("exception")
        public Float exception;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("passedQps")
        public Float passedQps;

        @NameInMap("resource")
        public String resource;

        @NameInMap("rt")
        public Float rt;

        @NameInMap("successQps")
        public Float successQps;

        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("userId")
        public String userId;

        public static SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData self = new SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData setBlockedQps(Float blockedQps) {
            this.blockedQps = blockedQps;
            return this;
        }
        public Float getBlockedQps() {
            return this.blockedQps;
        }

        public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData setException(Float exception) {
            this.exception = exception;
            return this;
        }
        public Float getException() {
            return this.exception;
        }

        public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData setPassedQps(Float passedQps) {
            this.passedQps = passedQps;
            return this;
        }
        public Float getPassedQps() {
            return this.passedQps;
        }

        public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData setSuccessQps(Float successQps) {
            this.successQps = successQps;
            return this;
        }
        public Float getSuccessQps() {
            return this.successQps;
        }

        public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
