// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelMetricQueryMachineResourceMetricResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelMetricQueryMachineResourceMetricResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelMetricQueryMachineResourceMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelMetricQueryMachineResourceMetricResponseBody self = new SentinelMetricQueryMachineResourceMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelMetricQueryMachineResourceMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelMetricQueryMachineResourceMetricResponseBody setData(java.util.List<SentinelMetricQueryMachineResourceMetricResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelMetricQueryMachineResourceMetricResponseBodyData> getData() {
        return this.data;
    }

    public SentinelMetricQueryMachineResourceMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelMetricQueryMachineResourceMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelMetricQueryMachineResourceMetricResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelMetricQueryMachineResourceMetricResponseBodyData extends TeaModel {
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

        public static SentinelMetricQueryMachineResourceMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelMetricQueryMachineResourceMetricResponseBodyData self = new SentinelMetricQueryMachineResourceMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelMetricQueryMachineResourceMetricResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelMetricQueryMachineResourceMetricResponseBodyData setBlockedQps(Float blockedQps) {
            this.blockedQps = blockedQps;
            return this;
        }
        public Float getBlockedQps() {
            return this.blockedQps;
        }

        public SentinelMetricQueryMachineResourceMetricResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public SentinelMetricQueryMachineResourceMetricResponseBodyData setException(Float exception) {
            this.exception = exception;
            return this;
        }
        public Float getException() {
            return this.exception;
        }

        public SentinelMetricQueryMachineResourceMetricResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelMetricQueryMachineResourceMetricResponseBodyData setPassedQps(Float passedQps) {
            this.passedQps = passedQps;
            return this;
        }
        public Float getPassedQps() {
            return this.passedQps;
        }

        public SentinelMetricQueryMachineResourceMetricResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelMetricQueryMachineResourceMetricResponseBodyData setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public SentinelMetricQueryMachineResourceMetricResponseBodyData setSuccessQps(Float successQps) {
            this.successQps = successQps;
            return this;
        }
        public Float getSuccessQps() {
            return this.successQps;
        }

        public SentinelMetricQueryMachineResourceMetricResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public SentinelMetricQueryMachineResourceMetricResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
