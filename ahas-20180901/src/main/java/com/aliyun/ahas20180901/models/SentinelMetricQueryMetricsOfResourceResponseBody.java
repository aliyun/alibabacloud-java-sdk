// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelMetricQueryMetricsOfResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelMetricQueryMetricsOfResourceResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelMetricQueryMetricsOfResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelMetricQueryMetricsOfResourceResponseBody self = new SentinelMetricQueryMetricsOfResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelMetricQueryMetricsOfResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelMetricQueryMetricsOfResourceResponseBody setData(java.util.List<SentinelMetricQueryMetricsOfResourceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelMetricQueryMetricsOfResourceResponseBodyData> getData() {
        return this.data;
    }

    public SentinelMetricQueryMetricsOfResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelMetricQueryMetricsOfResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelMetricQueryMetricsOfResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelMetricQueryMetricsOfResourceResponseBodyData extends TeaModel {
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

        public static SentinelMetricQueryMetricsOfResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelMetricQueryMetricsOfResourceResponseBodyData self = new SentinelMetricQueryMetricsOfResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelMetricQueryMetricsOfResourceResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelMetricQueryMetricsOfResourceResponseBodyData setBlockedQps(Float blockedQps) {
            this.blockedQps = blockedQps;
            return this;
        }
        public Float getBlockedQps() {
            return this.blockedQps;
        }

        public SentinelMetricQueryMetricsOfResourceResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public SentinelMetricQueryMetricsOfResourceResponseBodyData setException(Float exception) {
            this.exception = exception;
            return this;
        }
        public Float getException() {
            return this.exception;
        }

        public SentinelMetricQueryMetricsOfResourceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelMetricQueryMetricsOfResourceResponseBodyData setPassedQps(Float passedQps) {
            this.passedQps = passedQps;
            return this;
        }
        public Float getPassedQps() {
            return this.passedQps;
        }

        public SentinelMetricQueryMetricsOfResourceResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelMetricQueryMetricsOfResourceResponseBodyData setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public SentinelMetricQueryMetricsOfResourceResponseBodyData setSuccessQps(Float successQps) {
            this.successQps = successQps;
            return this;
        }
        public Float getSuccessQps() {
            return this.successQps;
        }

        public SentinelMetricQueryMetricsOfResourceResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public SentinelMetricQueryMetricsOfResourceResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
