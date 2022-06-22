// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySentinelMetricsOfResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySentinelMetricsOfResourceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySentinelMetricsOfResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySentinelMetricsOfResourceResponseBody self = new QuerySentinelMetricsOfResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySentinelMetricsOfResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySentinelMetricsOfResourceResponseBody setData(QuerySentinelMetricsOfResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySentinelMetricsOfResourceResponseBodyData getData() {
        return this.data;
    }

    public QuerySentinelMetricsOfResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySentinelMetricsOfResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySentinelMetricsOfResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics extends TeaModel {
        @NameInMap("blockedQps")
        public Float blockedQps;

        @NameInMap("blockedQpsAvg")
        public Float blockedQpsAvg;

        @NameInMap("blockedQpsMax")
        public Float blockedQpsMax;

        @NameInMap("blockedQpsMin")
        public Float blockedQpsMin;

        @NameInMap("blockedQpsP75")
        public Float blockedQpsP75;

        @NameInMap("blockedQpsP95")
        public Float blockedQpsP95;

        @NameInMap("blockedQpsP99")
        public Float blockedQpsP99;

        @NameInMap("blockedQpsStd")
        public Float blockedQpsStd;

        @NameInMap("count")
        public Integer count;

        @NameInMap("degradeRuleId")
        public Float degradeRuleId;

        @NameInMap("degradeRuleQPS")
        public Float degradeRuleQPS;

        @NameInMap("exception")
        public Float exception;

        @NameInMap("exceptionAvg")
        public Float exceptionAvg;

        @NameInMap("exceptionMax")
        public Float exceptionMax;

        @NameInMap("exceptionMin")
        public Float exceptionMin;

        @NameInMap("exceptionP75")
        public Float exceptionP75;

        @NameInMap("exceptionP95")
        public Float exceptionP95;

        @NameInMap("exceptionP99")
        public Float exceptionP99;

        @NameInMap("exceptionStd")
        public Float exceptionStd;

        @NameInMap("flowRuleId")
        public Float flowRuleId;

        @NameInMap("flowRuleQPS")
        public Float flowRuleQPS;

        @NameInMap("manualDegradeRuleId")
        public Float manualDegradeRuleId;

        @NameInMap("manualDegradeRuleQPS")
        public Float manualDegradeRuleQPS;

        @NameInMap("paramRuleId")
        public Float paramRuleId;

        @NameInMap("paramRuleQPS")
        public Float paramRuleQPS;

        @NameInMap("passedQps")
        public Float passedQps;

        @NameInMap("passedQpsAvg")
        public Float passedQpsAvg;

        @NameInMap("passedQpsMax")
        public Float passedQpsMax;

        @NameInMap("passedQpsMin")
        public Float passedQpsMin;

        @NameInMap("passedQpsP75")
        public Float passedQpsP75;

        @NameInMap("passedQpsP95")
        public Float passedQpsP95;

        @NameInMap("passedQpsP99")
        public Float passedQpsP99;

        @NameInMap("passedQpsStd")
        public Float passedQpsStd;

        @NameInMap("rt")
        public Float rt;

        @NameInMap("rtAvg")
        public Float rtAvg;

        @NameInMap("rtMax")
        public Float rtMax;

        @NameInMap("rtMin")
        public Float rtMin;

        @NameInMap("rtP75")
        public Float rtP75;

        @NameInMap("rtP95")
        public Float rtP95;

        @NameInMap("rtP99")
        public Float rtP99;

        @NameInMap("rtStd")
        public Float rtStd;

        @NameInMap("successQps")
        public Float successQps;

        @NameInMap("successQpsAvg")
        public Float successQpsAvg;

        @NameInMap("successQpsMax")
        public Float successQpsMax;

        @NameInMap("successQpsMin")
        public Float successQpsMin;

        @NameInMap("successQpsP75")
        public Float successQpsP75;

        @NameInMap("successQpsP95")
        public Float successQpsP95;

        @NameInMap("successQpsP99")
        public Float successQpsP99;

        @NameInMap("successQpsStd")
        public Float successQpsStd;

        @NameInMap("systemRuleId")
        public Float systemRuleId;

        @NameInMap("systemRuleQPS")
        public Float systemRuleQPS;

        @NameInMap("thread")
        public Float thread;

        @NameInMap("threadAvg")
        public Float threadAvg;

        @NameInMap("threadMax")
        public Float threadMax;

        @NameInMap("threadMin")
        public Float threadMin;

        @NameInMap("threadP75")
        public Float threadP75;

        @NameInMap("threadP95")
        public Float threadP95;

        @NameInMap("threadP99")
        public Float threadP99;

        @NameInMap("threadStd")
        public Float threadStd;

        @NameInMap("timestamp")
        public Long timestamp;

        public static QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics build(java.util.Map<String, ?> map) throws Exception {
            QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics self = new QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics();
            return TeaModel.build(map, self);
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQps(Float blockedQps) {
            this.blockedQps = blockedQps;
            return this;
        }
        public Float getBlockedQps() {
            return this.blockedQps;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQpsAvg(Float blockedQpsAvg) {
            this.blockedQpsAvg = blockedQpsAvg;
            return this;
        }
        public Float getBlockedQpsAvg() {
            return this.blockedQpsAvg;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQpsMax(Float blockedQpsMax) {
            this.blockedQpsMax = blockedQpsMax;
            return this;
        }
        public Float getBlockedQpsMax() {
            return this.blockedQpsMax;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQpsMin(Float blockedQpsMin) {
            this.blockedQpsMin = blockedQpsMin;
            return this;
        }
        public Float getBlockedQpsMin() {
            return this.blockedQpsMin;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQpsP75(Float blockedQpsP75) {
            this.blockedQpsP75 = blockedQpsP75;
            return this;
        }
        public Float getBlockedQpsP75() {
            return this.blockedQpsP75;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQpsP95(Float blockedQpsP95) {
            this.blockedQpsP95 = blockedQpsP95;
            return this;
        }
        public Float getBlockedQpsP95() {
            return this.blockedQpsP95;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQpsP99(Float blockedQpsP99) {
            this.blockedQpsP99 = blockedQpsP99;
            return this;
        }
        public Float getBlockedQpsP99() {
            return this.blockedQpsP99;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQpsStd(Float blockedQpsStd) {
            this.blockedQpsStd = blockedQpsStd;
            return this;
        }
        public Float getBlockedQpsStd() {
            return this.blockedQpsStd;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setDegradeRuleId(Float degradeRuleId) {
            this.degradeRuleId = degradeRuleId;
            return this;
        }
        public Float getDegradeRuleId() {
            return this.degradeRuleId;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setDegradeRuleQPS(Float degradeRuleQPS) {
            this.degradeRuleQPS = degradeRuleQPS;
            return this;
        }
        public Float getDegradeRuleQPS() {
            return this.degradeRuleQPS;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setException(Float exception) {
            this.exception = exception;
            return this;
        }
        public Float getException() {
            return this.exception;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setExceptionAvg(Float exceptionAvg) {
            this.exceptionAvg = exceptionAvg;
            return this;
        }
        public Float getExceptionAvg() {
            return this.exceptionAvg;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setExceptionMax(Float exceptionMax) {
            this.exceptionMax = exceptionMax;
            return this;
        }
        public Float getExceptionMax() {
            return this.exceptionMax;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setExceptionMin(Float exceptionMin) {
            this.exceptionMin = exceptionMin;
            return this;
        }
        public Float getExceptionMin() {
            return this.exceptionMin;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setExceptionP75(Float exceptionP75) {
            this.exceptionP75 = exceptionP75;
            return this;
        }
        public Float getExceptionP75() {
            return this.exceptionP75;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setExceptionP95(Float exceptionP95) {
            this.exceptionP95 = exceptionP95;
            return this;
        }
        public Float getExceptionP95() {
            return this.exceptionP95;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setExceptionP99(Float exceptionP99) {
            this.exceptionP99 = exceptionP99;
            return this;
        }
        public Float getExceptionP99() {
            return this.exceptionP99;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setExceptionStd(Float exceptionStd) {
            this.exceptionStd = exceptionStd;
            return this;
        }
        public Float getExceptionStd() {
            return this.exceptionStd;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setFlowRuleId(Float flowRuleId) {
            this.flowRuleId = flowRuleId;
            return this;
        }
        public Float getFlowRuleId() {
            return this.flowRuleId;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setFlowRuleQPS(Float flowRuleQPS) {
            this.flowRuleQPS = flowRuleQPS;
            return this;
        }
        public Float getFlowRuleQPS() {
            return this.flowRuleQPS;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setManualDegradeRuleId(Float manualDegradeRuleId) {
            this.manualDegradeRuleId = manualDegradeRuleId;
            return this;
        }
        public Float getManualDegradeRuleId() {
            return this.manualDegradeRuleId;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setManualDegradeRuleQPS(Float manualDegradeRuleQPS) {
            this.manualDegradeRuleQPS = manualDegradeRuleQPS;
            return this;
        }
        public Float getManualDegradeRuleQPS() {
            return this.manualDegradeRuleQPS;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setParamRuleId(Float paramRuleId) {
            this.paramRuleId = paramRuleId;
            return this;
        }
        public Float getParamRuleId() {
            return this.paramRuleId;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setParamRuleQPS(Float paramRuleQPS) {
            this.paramRuleQPS = paramRuleQPS;
            return this;
        }
        public Float getParamRuleQPS() {
            return this.paramRuleQPS;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setPassedQps(Float passedQps) {
            this.passedQps = passedQps;
            return this;
        }
        public Float getPassedQps() {
            return this.passedQps;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setPassedQpsAvg(Float passedQpsAvg) {
            this.passedQpsAvg = passedQpsAvg;
            return this;
        }
        public Float getPassedQpsAvg() {
            return this.passedQpsAvg;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setPassedQpsMax(Float passedQpsMax) {
            this.passedQpsMax = passedQpsMax;
            return this;
        }
        public Float getPassedQpsMax() {
            return this.passedQpsMax;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setPassedQpsMin(Float passedQpsMin) {
            this.passedQpsMin = passedQpsMin;
            return this;
        }
        public Float getPassedQpsMin() {
            return this.passedQpsMin;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setPassedQpsP75(Float passedQpsP75) {
            this.passedQpsP75 = passedQpsP75;
            return this;
        }
        public Float getPassedQpsP75() {
            return this.passedQpsP75;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setPassedQpsP95(Float passedQpsP95) {
            this.passedQpsP95 = passedQpsP95;
            return this;
        }
        public Float getPassedQpsP95() {
            return this.passedQpsP95;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setPassedQpsP99(Float passedQpsP99) {
            this.passedQpsP99 = passedQpsP99;
            return this;
        }
        public Float getPassedQpsP99() {
            return this.passedQpsP99;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setPassedQpsStd(Float passedQpsStd) {
            this.passedQpsStd = passedQpsStd;
            return this;
        }
        public Float getPassedQpsStd() {
            return this.passedQpsStd;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setRtAvg(Float rtAvg) {
            this.rtAvg = rtAvg;
            return this;
        }
        public Float getRtAvg() {
            return this.rtAvg;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setRtMax(Float rtMax) {
            this.rtMax = rtMax;
            return this;
        }
        public Float getRtMax() {
            return this.rtMax;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setRtMin(Float rtMin) {
            this.rtMin = rtMin;
            return this;
        }
        public Float getRtMin() {
            return this.rtMin;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setRtP75(Float rtP75) {
            this.rtP75 = rtP75;
            return this;
        }
        public Float getRtP75() {
            return this.rtP75;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setRtP95(Float rtP95) {
            this.rtP95 = rtP95;
            return this;
        }
        public Float getRtP95() {
            return this.rtP95;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setRtP99(Float rtP99) {
            this.rtP99 = rtP99;
            return this;
        }
        public Float getRtP99() {
            return this.rtP99;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setRtStd(Float rtStd) {
            this.rtStd = rtStd;
            return this;
        }
        public Float getRtStd() {
            return this.rtStd;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQps(Float successQps) {
            this.successQps = successQps;
            return this;
        }
        public Float getSuccessQps() {
            return this.successQps;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQpsAvg(Float successQpsAvg) {
            this.successQpsAvg = successQpsAvg;
            return this;
        }
        public Float getSuccessQpsAvg() {
            return this.successQpsAvg;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQpsMax(Float successQpsMax) {
            this.successQpsMax = successQpsMax;
            return this;
        }
        public Float getSuccessQpsMax() {
            return this.successQpsMax;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQpsMin(Float successQpsMin) {
            this.successQpsMin = successQpsMin;
            return this;
        }
        public Float getSuccessQpsMin() {
            return this.successQpsMin;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQpsP75(Float successQpsP75) {
            this.successQpsP75 = successQpsP75;
            return this;
        }
        public Float getSuccessQpsP75() {
            return this.successQpsP75;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQpsP95(Float successQpsP95) {
            this.successQpsP95 = successQpsP95;
            return this;
        }
        public Float getSuccessQpsP95() {
            return this.successQpsP95;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQpsP99(Float successQpsP99) {
            this.successQpsP99 = successQpsP99;
            return this;
        }
        public Float getSuccessQpsP99() {
            return this.successQpsP99;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQpsStd(Float successQpsStd) {
            this.successQpsStd = successQpsStd;
            return this;
        }
        public Float getSuccessQpsStd() {
            return this.successQpsStd;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setSystemRuleId(Float systemRuleId) {
            this.systemRuleId = systemRuleId;
            return this;
        }
        public Float getSystemRuleId() {
            return this.systemRuleId;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setSystemRuleQPS(Float systemRuleQPS) {
            this.systemRuleQPS = systemRuleQPS;
            return this;
        }
        public Float getSystemRuleQPS() {
            return this.systemRuleQPS;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setThread(Float thread) {
            this.thread = thread;
            return this;
        }
        public Float getThread() {
            return this.thread;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setThreadAvg(Float threadAvg) {
            this.threadAvg = threadAvg;
            return this;
        }
        public Float getThreadAvg() {
            return this.threadAvg;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setThreadMax(Float threadMax) {
            this.threadMax = threadMax;
            return this;
        }
        public Float getThreadMax() {
            return this.threadMax;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setThreadMin(Float threadMin) {
            this.threadMin = threadMin;
            return this;
        }
        public Float getThreadMin() {
            return this.threadMin;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setThreadP75(Float threadP75) {
            this.threadP75 = threadP75;
            return this;
        }
        public Float getThreadP75() {
            return this.threadP75;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setThreadP95(Float threadP95) {
            this.threadP95 = threadP95;
            return this;
        }
        public Float getThreadP95() {
            return this.threadP95;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setThreadP99(Float threadP99) {
            this.threadP99 = threadP99;
            return this;
        }
        public Float getThreadP99() {
            return this.threadP99;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setThreadStd(Float threadStd) {
            this.threadStd = threadStd;
            return this;
        }
        public Float getThreadStd() {
            return this.threadStd;
        }

        public QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class QuerySentinelMetricsOfResourceResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("innerMetrics")
        public java.util.List<QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics> innerMetrics;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("resource")
        public String resource;

        @NameInMap("userId")
        public String userId;

        public static QuerySentinelMetricsOfResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySentinelMetricsOfResourceResponseBodyData self = new QuerySentinelMetricsOfResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySentinelMetricsOfResourceResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QuerySentinelMetricsOfResourceResponseBodyData setInnerMetrics(java.util.List<QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics> innerMetrics) {
            this.innerMetrics = innerMetrics;
            return this;
        }
        public java.util.List<QuerySentinelMetricsOfResourceResponseBodyDataInnerMetrics> getInnerMetrics() {
            return this.innerMetrics;
        }

        public QuerySentinelMetricsOfResourceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QuerySentinelMetricsOfResourceResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public QuerySentinelMetricsOfResourceResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
