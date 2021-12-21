// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetMetricsOfResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetMetricsOfResourceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMetricsOfResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetricsOfResourceResponseBody self = new GetMetricsOfResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetricsOfResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMetricsOfResourceResponseBody setData(GetMetricsOfResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetricsOfResourceResponseBodyData getData() {
        return this.data;
    }

    public GetMetricsOfResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMetricsOfResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetricsOfResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetricsOfResourceResponseBodyDataInnerMetrics extends TeaModel {
        @NameInMap("BlockedQps")
        public Float blockedQps;

        @NameInMap("BlockedQpsAvg")
        public Float blockedQpsAvg;

        @NameInMap("BlockedQpsMax")
        public Float blockedQpsMax;

        @NameInMap("BlockedQpsMin")
        public Float blockedQpsMin;

        @NameInMap("BlockedQpsP75")
        public Float blockedQpsP75;

        @NameInMap("BlockedQpsP95")
        public Float blockedQpsP95;

        @NameInMap("BlockedQpsP99")
        public Float blockedQpsP99;

        @NameInMap("BlockedQpsStd")
        public Float blockedQpsStd;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("Exception")
        public Float exception;

        @NameInMap("ExceptionAvg")
        public Float exceptionAvg;

        @NameInMap("ExceptionMax")
        public Float exceptionMax;

        @NameInMap("ExceptionMin")
        public Float exceptionMin;

        @NameInMap("ExceptionP75")
        public Float exceptionP75;

        @NameInMap("ExceptionP95")
        public Float exceptionP95;

        @NameInMap("ExceptionP99")
        public Float exceptionP99;

        @NameInMap("ExceptionStd")
        public Float exceptionStd;

        @NameInMap("PassedQps")
        public Float passedQps;

        @NameInMap("PassedQpsAvg")
        public Float passedQpsAvg;

        @NameInMap("PassedQpsMax")
        public Float passedQpsMax;

        @NameInMap("PassedQpsMin")
        public Float passedQpsMin;

        @NameInMap("PassedQpsP75")
        public Float passedQpsP75;

        @NameInMap("PassedQpsP95")
        public Float passedQpsP95;

        @NameInMap("PassedQpsP99")
        public Float passedQpsP99;

        @NameInMap("PassedQpsStd")
        public Float passedQpsStd;

        @NameInMap("Rt")
        public Float rt;

        @NameInMap("RtAvg")
        public Float rtAvg;

        @NameInMap("RtMax")
        public Float rtMax;

        @NameInMap("RtMin")
        public Float rtMin;

        @NameInMap("RtP75")
        public Float rtP75;

        @NameInMap("RtP95")
        public Float rtP95;

        @NameInMap("RtP99")
        public Float rtP99;

        @NameInMap("RtStd")
        public Float rtStd;

        @NameInMap("SuccessQps")
        public Float successQps;

        @NameInMap("SuccessQpsAvg")
        public Float successQpsAvg;

        @NameInMap("SuccessQpsMax")
        public Float successQpsMax;

        @NameInMap("SuccessQpsMin")
        public Float successQpsMin;

        @NameInMap("SuccessQpsP75")
        public Float successQpsP75;

        @NameInMap("SuccessQpsP95")
        public Float successQpsP95;

        @NameInMap("SuccessQpsP99")
        public Float successQpsP99;

        @NameInMap("SuccessQpsStd")
        public Float successQpsStd;

        @NameInMap("Thread")
        public Float thread;

        @NameInMap("ThreadAvg")
        public Float threadAvg;

        @NameInMap("ThreadMax")
        public Float threadMax;

        @NameInMap("ThreadMin")
        public Float threadMin;

        @NameInMap("ThreadP75")
        public Float threadP75;

        @NameInMap("ThreadP95")
        public Float threadP95;

        @NameInMap("ThreadP99")
        public Float threadP99;

        @NameInMap("ThreadStd")
        public Float threadStd;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetMetricsOfResourceResponseBodyDataInnerMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetMetricsOfResourceResponseBodyDataInnerMetrics self = new GetMetricsOfResourceResponseBodyDataInnerMetrics();
            return TeaModel.build(map, self);
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQps(Float blockedQps) {
            this.blockedQps = blockedQps;
            return this;
        }
        public Float getBlockedQps() {
            return this.blockedQps;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQpsAvg(Float blockedQpsAvg) {
            this.blockedQpsAvg = blockedQpsAvg;
            return this;
        }
        public Float getBlockedQpsAvg() {
            return this.blockedQpsAvg;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQpsMax(Float blockedQpsMax) {
            this.blockedQpsMax = blockedQpsMax;
            return this;
        }
        public Float getBlockedQpsMax() {
            return this.blockedQpsMax;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQpsMin(Float blockedQpsMin) {
            this.blockedQpsMin = blockedQpsMin;
            return this;
        }
        public Float getBlockedQpsMin() {
            return this.blockedQpsMin;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQpsP75(Float blockedQpsP75) {
            this.blockedQpsP75 = blockedQpsP75;
            return this;
        }
        public Float getBlockedQpsP75() {
            return this.blockedQpsP75;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQpsP95(Float blockedQpsP95) {
            this.blockedQpsP95 = blockedQpsP95;
            return this;
        }
        public Float getBlockedQpsP95() {
            return this.blockedQpsP95;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQpsP99(Float blockedQpsP99) {
            this.blockedQpsP99 = blockedQpsP99;
            return this;
        }
        public Float getBlockedQpsP99() {
            return this.blockedQpsP99;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQpsStd(Float blockedQpsStd) {
            this.blockedQpsStd = blockedQpsStd;
            return this;
        }
        public Float getBlockedQpsStd() {
            return this.blockedQpsStd;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setException(Float exception) {
            this.exception = exception;
            return this;
        }
        public Float getException() {
            return this.exception;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setExceptionAvg(Float exceptionAvg) {
            this.exceptionAvg = exceptionAvg;
            return this;
        }
        public Float getExceptionAvg() {
            return this.exceptionAvg;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setExceptionMax(Float exceptionMax) {
            this.exceptionMax = exceptionMax;
            return this;
        }
        public Float getExceptionMax() {
            return this.exceptionMax;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setExceptionMin(Float exceptionMin) {
            this.exceptionMin = exceptionMin;
            return this;
        }
        public Float getExceptionMin() {
            return this.exceptionMin;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setExceptionP75(Float exceptionP75) {
            this.exceptionP75 = exceptionP75;
            return this;
        }
        public Float getExceptionP75() {
            return this.exceptionP75;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setExceptionP95(Float exceptionP95) {
            this.exceptionP95 = exceptionP95;
            return this;
        }
        public Float getExceptionP95() {
            return this.exceptionP95;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setExceptionP99(Float exceptionP99) {
            this.exceptionP99 = exceptionP99;
            return this;
        }
        public Float getExceptionP99() {
            return this.exceptionP99;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setExceptionStd(Float exceptionStd) {
            this.exceptionStd = exceptionStd;
            return this;
        }
        public Float getExceptionStd() {
            return this.exceptionStd;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setPassedQps(Float passedQps) {
            this.passedQps = passedQps;
            return this;
        }
        public Float getPassedQps() {
            return this.passedQps;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setPassedQpsAvg(Float passedQpsAvg) {
            this.passedQpsAvg = passedQpsAvg;
            return this;
        }
        public Float getPassedQpsAvg() {
            return this.passedQpsAvg;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setPassedQpsMax(Float passedQpsMax) {
            this.passedQpsMax = passedQpsMax;
            return this;
        }
        public Float getPassedQpsMax() {
            return this.passedQpsMax;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setPassedQpsMin(Float passedQpsMin) {
            this.passedQpsMin = passedQpsMin;
            return this;
        }
        public Float getPassedQpsMin() {
            return this.passedQpsMin;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setPassedQpsP75(Float passedQpsP75) {
            this.passedQpsP75 = passedQpsP75;
            return this;
        }
        public Float getPassedQpsP75() {
            return this.passedQpsP75;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setPassedQpsP95(Float passedQpsP95) {
            this.passedQpsP95 = passedQpsP95;
            return this;
        }
        public Float getPassedQpsP95() {
            return this.passedQpsP95;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setPassedQpsP99(Float passedQpsP99) {
            this.passedQpsP99 = passedQpsP99;
            return this;
        }
        public Float getPassedQpsP99() {
            return this.passedQpsP99;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setPassedQpsStd(Float passedQpsStd) {
            this.passedQpsStd = passedQpsStd;
            return this;
        }
        public Float getPassedQpsStd() {
            return this.passedQpsStd;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setRtAvg(Float rtAvg) {
            this.rtAvg = rtAvg;
            return this;
        }
        public Float getRtAvg() {
            return this.rtAvg;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setRtMax(Float rtMax) {
            this.rtMax = rtMax;
            return this;
        }
        public Float getRtMax() {
            return this.rtMax;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setRtMin(Float rtMin) {
            this.rtMin = rtMin;
            return this;
        }
        public Float getRtMin() {
            return this.rtMin;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setRtP75(Float rtP75) {
            this.rtP75 = rtP75;
            return this;
        }
        public Float getRtP75() {
            return this.rtP75;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setRtP95(Float rtP95) {
            this.rtP95 = rtP95;
            return this;
        }
        public Float getRtP95() {
            return this.rtP95;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setRtP99(Float rtP99) {
            this.rtP99 = rtP99;
            return this;
        }
        public Float getRtP99() {
            return this.rtP99;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setRtStd(Float rtStd) {
            this.rtStd = rtStd;
            return this;
        }
        public Float getRtStd() {
            return this.rtStd;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQps(Float successQps) {
            this.successQps = successQps;
            return this;
        }
        public Float getSuccessQps() {
            return this.successQps;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQpsAvg(Float successQpsAvg) {
            this.successQpsAvg = successQpsAvg;
            return this;
        }
        public Float getSuccessQpsAvg() {
            return this.successQpsAvg;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQpsMax(Float successQpsMax) {
            this.successQpsMax = successQpsMax;
            return this;
        }
        public Float getSuccessQpsMax() {
            return this.successQpsMax;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQpsMin(Float successQpsMin) {
            this.successQpsMin = successQpsMin;
            return this;
        }
        public Float getSuccessQpsMin() {
            return this.successQpsMin;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQpsP75(Float successQpsP75) {
            this.successQpsP75 = successQpsP75;
            return this;
        }
        public Float getSuccessQpsP75() {
            return this.successQpsP75;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQpsP95(Float successQpsP95) {
            this.successQpsP95 = successQpsP95;
            return this;
        }
        public Float getSuccessQpsP95() {
            return this.successQpsP95;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQpsP99(Float successQpsP99) {
            this.successQpsP99 = successQpsP99;
            return this;
        }
        public Float getSuccessQpsP99() {
            return this.successQpsP99;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQpsStd(Float successQpsStd) {
            this.successQpsStd = successQpsStd;
            return this;
        }
        public Float getSuccessQpsStd() {
            return this.successQpsStd;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setThread(Float thread) {
            this.thread = thread;
            return this;
        }
        public Float getThread() {
            return this.thread;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setThreadAvg(Float threadAvg) {
            this.threadAvg = threadAvg;
            return this;
        }
        public Float getThreadAvg() {
            return this.threadAvg;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setThreadMax(Float threadMax) {
            this.threadMax = threadMax;
            return this;
        }
        public Float getThreadMax() {
            return this.threadMax;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setThreadMin(Float threadMin) {
            this.threadMin = threadMin;
            return this;
        }
        public Float getThreadMin() {
            return this.threadMin;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setThreadP75(Float threadP75) {
            this.threadP75 = threadP75;
            return this;
        }
        public Float getThreadP75() {
            return this.threadP75;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setThreadP95(Float threadP95) {
            this.threadP95 = threadP95;
            return this;
        }
        public Float getThreadP95() {
            return this.threadP95;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setThreadP99(Float threadP99) {
            this.threadP99 = threadP99;
            return this;
        }
        public Float getThreadP99() {
            return this.threadP99;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setThreadStd(Float threadStd) {
            this.threadStd = threadStd;
            return this;
        }
        public Float getThreadStd() {
            return this.threadStd;
        }

        public GetMetricsOfResourceResponseBodyDataInnerMetrics setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetMetricsOfResourceResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("InnerMetrics")
        public java.util.List<GetMetricsOfResourceResponseBodyDataInnerMetrics> innerMetrics;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Resource")
        public String resource;

        public static GetMetricsOfResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetricsOfResourceResponseBodyData self = new GetMetricsOfResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetricsOfResourceResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetMetricsOfResourceResponseBodyData setInnerMetrics(java.util.List<GetMetricsOfResourceResponseBodyDataInnerMetrics> innerMetrics) {
            this.innerMetrics = innerMetrics;
            return this;
        }
        public java.util.List<GetMetricsOfResourceResponseBodyDataInnerMetrics> getInnerMetrics() {
            return this.innerMetrics;
        }

        public GetMetricsOfResourceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetMetricsOfResourceResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

}
