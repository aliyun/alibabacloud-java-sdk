// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySentinelAppSummaryMetricOverviewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySentinelAppSummaryMetricOverviewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySentinelAppSummaryMetricOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySentinelAppSummaryMetricOverviewResponseBody self = new QuerySentinelAppSummaryMetricOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySentinelAppSummaryMetricOverviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySentinelAppSummaryMetricOverviewResponseBody setData(QuerySentinelAppSummaryMetricOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySentinelAppSummaryMetricOverviewResponseBodyData getData() {
        return this.data;
    }

    public QuerySentinelAppSummaryMetricOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySentinelAppSummaryMetricOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySentinelAppSummaryMetricOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("blockedQps")
        public Float blockedQps;

        @NameInMap("count")
        public Integer count;

        @NameInMap("exception")
        public Float exception;

        @NameInMap("grayQps")
        public Float grayQps;

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

        @NameInMap("thread")
        public Float thread;

        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("type")
        public Integer type;

        @NameInMap("userId")
        public String userId;

        public static QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics build(java.util.Map<String, ?> map) throws Exception {
            QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics self = new QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics();
            return TeaModel.build(map, self);
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics setBlockedQps(Float blockedQps) {
            this.blockedQps = blockedQps;
            return this;
        }
        public Float getBlockedQps() {
            return this.blockedQps;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics setException(Float exception) {
            this.exception = exception;
            return this;
        }
        public Float getException() {
            return this.exception;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics setGrayQps(Float grayQps) {
            this.grayQps = grayQps;
            return this;
        }
        public Float getGrayQps() {
            return this.grayQps;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics setPassedQps(Float passedQps) {
            this.passedQps = passedQps;
            return this;
        }
        public Float getPassedQps() {
            return this.passedQps;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics setSuccessQps(Float successQps) {
            this.successQps = successQps;
            return this;
        }
        public Float getSuccessQps() {
            return this.successQps;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics setThread(Float thread) {
            this.thread = thread;
            return this;
        }
        public Float getThread() {
            return this.thread;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QuerySentinelAppSummaryMetricOverviewResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("blockQps_5m")
        public Float blockQps5m;

        @NameInMap("chainBlockQps_5m")
        public Float chainBlockQps5m;

        @NameInMap("chainExpQps_5m")
        public Float chainExpQps5m;

        @NameInMap("chainPassQps_5m")
        public Float chainPassQps5m;

        @NameInMap("chainRtAvg")
        public Float chainRtAvg;

        @NameInMap("curMetics")
        public java.util.List<QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics> curMetics;

        @NameInMap("degradeRuleCount")
        public Integer degradeRuleCount;

        @NameInMap("expQps_5m")
        public Float expQps5m;

        @NameInMap("flowRuleCount")
        public Integer flowRuleCount;

        @NameInMap("machineCount")
        public Integer machineCount;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("passQps_5m")
        public Float passQps5m;

        @NameInMap("rtAvg")
        public Float rtAvg;

        @NameInMap("systemRuleCount")
        public Integer systemRuleCount;

        @NameInMap("userId")
        public String userId;

        @NameInMap("ydBlockQps_5m")
        public Float ydBlockQps5m;

        @NameInMap("ydExpQps_5m")
        public Float ydExpQps5m;

        @NameInMap("ydPassQps_5m")
        public Float ydPassQps5m;

        @NameInMap("ydRtAvg")
        public Float ydRtAvg;

        public static QuerySentinelAppSummaryMetricOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySentinelAppSummaryMetricOverviewResponseBodyData self = new QuerySentinelAppSummaryMetricOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setBlockQps5m(Float blockQps5m) {
            this.blockQps5m = blockQps5m;
            return this;
        }
        public Float getBlockQps5m() {
            return this.blockQps5m;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setChainBlockQps5m(Float chainBlockQps5m) {
            this.chainBlockQps5m = chainBlockQps5m;
            return this;
        }
        public Float getChainBlockQps5m() {
            return this.chainBlockQps5m;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setChainExpQps5m(Float chainExpQps5m) {
            this.chainExpQps5m = chainExpQps5m;
            return this;
        }
        public Float getChainExpQps5m() {
            return this.chainExpQps5m;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setChainPassQps5m(Float chainPassQps5m) {
            this.chainPassQps5m = chainPassQps5m;
            return this;
        }
        public Float getChainPassQps5m() {
            return this.chainPassQps5m;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setChainRtAvg(Float chainRtAvg) {
            this.chainRtAvg = chainRtAvg;
            return this;
        }
        public Float getChainRtAvg() {
            return this.chainRtAvg;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setCurMetics(java.util.List<QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics> curMetics) {
            this.curMetics = curMetics;
            return this;
        }
        public java.util.List<QuerySentinelAppSummaryMetricOverviewResponseBodyDataCurMetics> getCurMetics() {
            return this.curMetics;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setDegradeRuleCount(Integer degradeRuleCount) {
            this.degradeRuleCount = degradeRuleCount;
            return this;
        }
        public Integer getDegradeRuleCount() {
            return this.degradeRuleCount;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setExpQps5m(Float expQps5m) {
            this.expQps5m = expQps5m;
            return this;
        }
        public Float getExpQps5m() {
            return this.expQps5m;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setFlowRuleCount(Integer flowRuleCount) {
            this.flowRuleCount = flowRuleCount;
            return this;
        }
        public Integer getFlowRuleCount() {
            return this.flowRuleCount;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setMachineCount(Integer machineCount) {
            this.machineCount = machineCount;
            return this;
        }
        public Integer getMachineCount() {
            return this.machineCount;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setPassQps5m(Float passQps5m) {
            this.passQps5m = passQps5m;
            return this;
        }
        public Float getPassQps5m() {
            return this.passQps5m;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setRtAvg(Float rtAvg) {
            this.rtAvg = rtAvg;
            return this;
        }
        public Float getRtAvg() {
            return this.rtAvg;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setSystemRuleCount(Integer systemRuleCount) {
            this.systemRuleCount = systemRuleCount;
            return this;
        }
        public Integer getSystemRuleCount() {
            return this.systemRuleCount;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setYdBlockQps5m(Float ydBlockQps5m) {
            this.ydBlockQps5m = ydBlockQps5m;
            return this;
        }
        public Float getYdBlockQps5m() {
            return this.ydBlockQps5m;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setYdExpQps5m(Float ydExpQps5m) {
            this.ydExpQps5m = ydExpQps5m;
            return this;
        }
        public Float getYdExpQps5m() {
            return this.ydExpQps5m;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setYdPassQps5m(Float ydPassQps5m) {
            this.ydPassQps5m = ydPassQps5m;
            return this;
        }
        public Float getYdPassQps5m() {
            return this.ydPassQps5m;
        }

        public QuerySentinelAppSummaryMetricOverviewResponseBodyData setYdRtAvg(Float ydRtAvg) {
            this.ydRtAvg = ydRtAvg;
            return this;
        }
        public Float getYdRtAvg() {
            return this.ydRtAvg;
        }

    }

}
