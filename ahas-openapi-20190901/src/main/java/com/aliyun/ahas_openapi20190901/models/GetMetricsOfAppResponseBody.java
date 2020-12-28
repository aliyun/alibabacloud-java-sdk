// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetMetricsOfAppResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetMetricsOfAppResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetMetricsOfAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetricsOfAppResponseBody self = new GetMetricsOfAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetricsOfAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMetricsOfAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetricsOfAppResponseBody setData(GetMetricsOfAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetricsOfAppResponseBodyData getData() {
        return this.data;
    }

    public GetMetricsOfAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMetricsOfAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetricsOfAppResponseBodyDataInnerMetrics extends TeaModel {
        @NameInMap("RtP99")
        public Float rtP99;

        @NameInMap("SuccessQpsAvg")
        public Float successQpsAvg;

        @NameInMap("PassedQpsP99")
        public Float passedQpsP99;

        @NameInMap("RtAvg")
        public Float rtAvg;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("ThreadStd")
        public Float threadStd;

        @NameInMap("PassedQpsAvg")
        public Float passedQpsAvg;

        @NameInMap("ExceptionP95")
        public Float exceptionP95;

        @NameInMap("SuccessQpsMax")
        public Float successQpsMax;

        @NameInMap("RtP95")
        public Float rtP95;

        @NameInMap("BlockedQpsMin")
        public Float blockedQpsMin;

        @NameInMap("BlockedQps")
        public Float blockedQps;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("ThreadP95")
        public Float threadP95;

        @NameInMap("RtStd")
        public Float rtStd;

        @NameInMap("PassedQpsMin")
        public Float passedQpsMin;

        @NameInMap("BlockedQpsP99")
        public Float blockedQpsP99;

        @NameInMap("PassedQpsMax")
        public Float passedQpsMax;

        @NameInMap("ExceptionMax")
        public Float exceptionMax;

        @NameInMap("SuccessQps")
        public Float successQps;

        @NameInMap("SuccessQpsP75")
        public Float successQpsP75;

        @NameInMap("ThreadP75")
        public Float threadP75;

        @NameInMap("SuccessQpsStd")
        public Float successQpsStd;

        @NameInMap("ExceptionMin")
        public Float exceptionMin;

        @NameInMap("PassedQpsP75")
        public Float passedQpsP75;

        @NameInMap("PassedQps")
        public Float passedQps;

        @NameInMap("ThreadMax")
        public Float threadMax;

        @NameInMap("SuccessQpsP99")
        public Float successQpsP99;

        @NameInMap("SuccessQpsMin")
        public Float successQpsMin;

        @NameInMap("ThreadP99")
        public Float threadP99;

        @NameInMap("ExceptionStd")
        public Float exceptionStd;

        @NameInMap("BlockedQpsP95")
        public Float blockedQpsP95;

        @NameInMap("Thread")
        public Float thread;

        @NameInMap("ThreadMin")
        public Float threadMin;

        @NameInMap("RtMin")
        public Float rtMin;

        @NameInMap("BlockedQpsAvg")
        public Float blockedQpsAvg;

        @NameInMap("ThreadAvg")
        public Float threadAvg;

        @NameInMap("BlockedQpsP75")
        public Float blockedQpsP75;

        @NameInMap("RtP75")
        public Float rtP75;

        @NameInMap("ExceptionP99")
        public Float exceptionP99;

        @NameInMap("ExceptionP75")
        public Float exceptionP75;

        @NameInMap("SuccessQpsP95")
        public Float successQpsP95;

        @NameInMap("Rt")
        public Float rt;

        @NameInMap("PassedQpsP95")
        public Float passedQpsP95;

        @NameInMap("RtMax")
        public Float rtMax;

        @NameInMap("BlockedQpsStd")
        public Float blockedQpsStd;

        @NameInMap("BlockedQpsMax")
        public Float blockedQpsMax;

        @NameInMap("Exception")
        public Float exception;

        @NameInMap("ExceptionAvg")
        public Float exceptionAvg;

        @NameInMap("PassedQpsStd")
        public Float passedQpsStd;

        public static GetMetricsOfAppResponseBodyDataInnerMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetMetricsOfAppResponseBodyDataInnerMetrics self = new GetMetricsOfAppResponseBodyDataInnerMetrics();
            return TeaModel.build(map, self);
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setRtP99(Float rtP99) {
            this.rtP99 = rtP99;
            return this;
        }
        public Float getRtP99() {
            return this.rtP99;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setSuccessQpsAvg(Float successQpsAvg) {
            this.successQpsAvg = successQpsAvg;
            return this;
        }
        public Float getSuccessQpsAvg() {
            return this.successQpsAvg;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setPassedQpsP99(Float passedQpsP99) {
            this.passedQpsP99 = passedQpsP99;
            return this;
        }
        public Float getPassedQpsP99() {
            return this.passedQpsP99;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setRtAvg(Float rtAvg) {
            this.rtAvg = rtAvg;
            return this;
        }
        public Float getRtAvg() {
            return this.rtAvg;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setThreadStd(Float threadStd) {
            this.threadStd = threadStd;
            return this;
        }
        public Float getThreadStd() {
            return this.threadStd;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setPassedQpsAvg(Float passedQpsAvg) {
            this.passedQpsAvg = passedQpsAvg;
            return this;
        }
        public Float getPassedQpsAvg() {
            return this.passedQpsAvg;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setExceptionP95(Float exceptionP95) {
            this.exceptionP95 = exceptionP95;
            return this;
        }
        public Float getExceptionP95() {
            return this.exceptionP95;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setSuccessQpsMax(Float successQpsMax) {
            this.successQpsMax = successQpsMax;
            return this;
        }
        public Float getSuccessQpsMax() {
            return this.successQpsMax;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setRtP95(Float rtP95) {
            this.rtP95 = rtP95;
            return this;
        }
        public Float getRtP95() {
            return this.rtP95;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setBlockedQpsMin(Float blockedQpsMin) {
            this.blockedQpsMin = blockedQpsMin;
            return this;
        }
        public Float getBlockedQpsMin() {
            return this.blockedQpsMin;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setBlockedQps(Float blockedQps) {
            this.blockedQps = blockedQps;
            return this;
        }
        public Float getBlockedQps() {
            return this.blockedQps;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setThreadP95(Float threadP95) {
            this.threadP95 = threadP95;
            return this;
        }
        public Float getThreadP95() {
            return this.threadP95;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setRtStd(Float rtStd) {
            this.rtStd = rtStd;
            return this;
        }
        public Float getRtStd() {
            return this.rtStd;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setPassedQpsMin(Float passedQpsMin) {
            this.passedQpsMin = passedQpsMin;
            return this;
        }
        public Float getPassedQpsMin() {
            return this.passedQpsMin;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setBlockedQpsP99(Float blockedQpsP99) {
            this.blockedQpsP99 = blockedQpsP99;
            return this;
        }
        public Float getBlockedQpsP99() {
            return this.blockedQpsP99;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setPassedQpsMax(Float passedQpsMax) {
            this.passedQpsMax = passedQpsMax;
            return this;
        }
        public Float getPassedQpsMax() {
            return this.passedQpsMax;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setExceptionMax(Float exceptionMax) {
            this.exceptionMax = exceptionMax;
            return this;
        }
        public Float getExceptionMax() {
            return this.exceptionMax;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setSuccessQps(Float successQps) {
            this.successQps = successQps;
            return this;
        }
        public Float getSuccessQps() {
            return this.successQps;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setSuccessQpsP75(Float successQpsP75) {
            this.successQpsP75 = successQpsP75;
            return this;
        }
        public Float getSuccessQpsP75() {
            return this.successQpsP75;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setThreadP75(Float threadP75) {
            this.threadP75 = threadP75;
            return this;
        }
        public Float getThreadP75() {
            return this.threadP75;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setSuccessQpsStd(Float successQpsStd) {
            this.successQpsStd = successQpsStd;
            return this;
        }
        public Float getSuccessQpsStd() {
            return this.successQpsStd;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setExceptionMin(Float exceptionMin) {
            this.exceptionMin = exceptionMin;
            return this;
        }
        public Float getExceptionMin() {
            return this.exceptionMin;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setPassedQpsP75(Float passedQpsP75) {
            this.passedQpsP75 = passedQpsP75;
            return this;
        }
        public Float getPassedQpsP75() {
            return this.passedQpsP75;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setPassedQps(Float passedQps) {
            this.passedQps = passedQps;
            return this;
        }
        public Float getPassedQps() {
            return this.passedQps;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setThreadMax(Float threadMax) {
            this.threadMax = threadMax;
            return this;
        }
        public Float getThreadMax() {
            return this.threadMax;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setSuccessQpsP99(Float successQpsP99) {
            this.successQpsP99 = successQpsP99;
            return this;
        }
        public Float getSuccessQpsP99() {
            return this.successQpsP99;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setSuccessQpsMin(Float successQpsMin) {
            this.successQpsMin = successQpsMin;
            return this;
        }
        public Float getSuccessQpsMin() {
            return this.successQpsMin;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setThreadP99(Float threadP99) {
            this.threadP99 = threadP99;
            return this;
        }
        public Float getThreadP99() {
            return this.threadP99;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setExceptionStd(Float exceptionStd) {
            this.exceptionStd = exceptionStd;
            return this;
        }
        public Float getExceptionStd() {
            return this.exceptionStd;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setBlockedQpsP95(Float blockedQpsP95) {
            this.blockedQpsP95 = blockedQpsP95;
            return this;
        }
        public Float getBlockedQpsP95() {
            return this.blockedQpsP95;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setThread(Float thread) {
            this.thread = thread;
            return this;
        }
        public Float getThread() {
            return this.thread;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setThreadMin(Float threadMin) {
            this.threadMin = threadMin;
            return this;
        }
        public Float getThreadMin() {
            return this.threadMin;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setRtMin(Float rtMin) {
            this.rtMin = rtMin;
            return this;
        }
        public Float getRtMin() {
            return this.rtMin;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setBlockedQpsAvg(Float blockedQpsAvg) {
            this.blockedQpsAvg = blockedQpsAvg;
            return this;
        }
        public Float getBlockedQpsAvg() {
            return this.blockedQpsAvg;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setThreadAvg(Float threadAvg) {
            this.threadAvg = threadAvg;
            return this;
        }
        public Float getThreadAvg() {
            return this.threadAvg;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setBlockedQpsP75(Float blockedQpsP75) {
            this.blockedQpsP75 = blockedQpsP75;
            return this;
        }
        public Float getBlockedQpsP75() {
            return this.blockedQpsP75;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setRtP75(Float rtP75) {
            this.rtP75 = rtP75;
            return this;
        }
        public Float getRtP75() {
            return this.rtP75;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setExceptionP99(Float exceptionP99) {
            this.exceptionP99 = exceptionP99;
            return this;
        }
        public Float getExceptionP99() {
            return this.exceptionP99;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setExceptionP75(Float exceptionP75) {
            this.exceptionP75 = exceptionP75;
            return this;
        }
        public Float getExceptionP75() {
            return this.exceptionP75;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setSuccessQpsP95(Float successQpsP95) {
            this.successQpsP95 = successQpsP95;
            return this;
        }
        public Float getSuccessQpsP95() {
            return this.successQpsP95;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setPassedQpsP95(Float passedQpsP95) {
            this.passedQpsP95 = passedQpsP95;
            return this;
        }
        public Float getPassedQpsP95() {
            return this.passedQpsP95;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setRtMax(Float rtMax) {
            this.rtMax = rtMax;
            return this;
        }
        public Float getRtMax() {
            return this.rtMax;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setBlockedQpsStd(Float blockedQpsStd) {
            this.blockedQpsStd = blockedQpsStd;
            return this;
        }
        public Float getBlockedQpsStd() {
            return this.blockedQpsStd;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setBlockedQpsMax(Float blockedQpsMax) {
            this.blockedQpsMax = blockedQpsMax;
            return this;
        }
        public Float getBlockedQpsMax() {
            return this.blockedQpsMax;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setException(Float exception) {
            this.exception = exception;
            return this;
        }
        public Float getException() {
            return this.exception;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setExceptionAvg(Float exceptionAvg) {
            this.exceptionAvg = exceptionAvg;
            return this;
        }
        public Float getExceptionAvg() {
            return this.exceptionAvg;
        }

        public GetMetricsOfAppResponseBodyDataInnerMetrics setPassedQpsStd(Float passedQpsStd) {
            this.passedQpsStd = passedQpsStd;
            return this;
        }
        public Float getPassedQpsStd() {
            return this.passedQpsStd;
        }

    }

    public static class GetMetricsOfAppResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("InnerMetrics")
        public java.util.List<GetMetricsOfAppResponseBodyDataInnerMetrics> innerMetrics;

        public static GetMetricsOfAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetricsOfAppResponseBodyData self = new GetMetricsOfAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetricsOfAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetMetricsOfAppResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetMetricsOfAppResponseBodyData setInnerMetrics(java.util.List<GetMetricsOfAppResponseBodyDataInnerMetrics> innerMetrics) {
            this.innerMetrics = innerMetrics;
            return this;
        }
        public java.util.List<GetMetricsOfAppResponseBodyDataInnerMetrics> getInnerMetrics() {
            return this.innerMetrics;
        }

    }

}
