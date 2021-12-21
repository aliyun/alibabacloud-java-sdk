// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetSentinelAppSumMetricResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("MetricData")
    public GetSentinelAppSumMetricResponseBodyMetricData metricData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSentinelAppSumMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSentinelAppSumMetricResponseBody self = new GetSentinelAppSumMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSentinelAppSumMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSentinelAppSumMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSentinelAppSumMetricResponseBody setMetricData(GetSentinelAppSumMetricResponseBodyMetricData metricData) {
        this.metricData = metricData;
        return this;
    }
    public GetSentinelAppSumMetricResponseBodyMetricData getMetricData() {
        return this.metricData;
    }

    public GetSentinelAppSumMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSentinelAppSumMetricResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSentinelAppSumMetricResponseBodyMetricData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AvgRt")
        public Float avgRt;

        @NameInMap("BlockCount")
        public Float blockCount;

        @NameInMap("MachineCount")
        public Long machineCount;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("PassCount")
        public Float passCount;

        @NameInMap("TotalCount")
        public Float totalCount;

        @NameInMap("UserId")
        public String userId;

        public static GetSentinelAppSumMetricResponseBodyMetricData build(java.util.Map<String, ?> map) throws Exception {
            GetSentinelAppSumMetricResponseBodyMetricData self = new GetSentinelAppSumMetricResponseBodyMetricData();
            return TeaModel.build(map, self);
        }

        public GetSentinelAppSumMetricResponseBodyMetricData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetSentinelAppSumMetricResponseBodyMetricData setAvgRt(Float avgRt) {
            this.avgRt = avgRt;
            return this;
        }
        public Float getAvgRt() {
            return this.avgRt;
        }

        public GetSentinelAppSumMetricResponseBodyMetricData setBlockCount(Float blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public Float getBlockCount() {
            return this.blockCount;
        }

        public GetSentinelAppSumMetricResponseBodyMetricData setMachineCount(Long machineCount) {
            this.machineCount = machineCount;
            return this;
        }
        public Long getMachineCount() {
            return this.machineCount;
        }

        public GetSentinelAppSumMetricResponseBodyMetricData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetSentinelAppSumMetricResponseBodyMetricData setPassCount(Float passCount) {
            this.passCount = passCount;
            return this;
        }
        public Float getPassCount() {
            return this.passCount;
        }

        public GetSentinelAppSumMetricResponseBodyMetricData setTotalCount(Float totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Float getTotalCount() {
            return this.totalCount;
        }

        public GetSentinelAppSumMetricResponseBodyMetricData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
