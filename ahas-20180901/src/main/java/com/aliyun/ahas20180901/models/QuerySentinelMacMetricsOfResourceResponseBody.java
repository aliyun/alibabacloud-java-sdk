// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySentinelMacMetricsOfResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySentinelMacMetricsOfResourceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySentinelMacMetricsOfResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySentinelMacMetricsOfResourceResponseBody self = new QuerySentinelMacMetricsOfResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySentinelMacMetricsOfResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySentinelMacMetricsOfResourceResponseBody setData(QuerySentinelMacMetricsOfResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySentinelMacMetricsOfResourceResponseBodyData getData() {
        return this.data;
    }

    public QuerySentinelMacMetricsOfResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySentinelMacMetricsOfResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySentinelMacMetricsOfResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("blockedQps")
        public Float blockedQps;

        @NameInMap("count")
        public Integer count;

        @NameInMap("degradeRuleId")
        public Float degradeRuleId;

        @NameInMap("degradeRuleQPS")
        public Float degradeRuleQPS;

        @NameInMap("exception")
        public Float exception;

        @NameInMap("flowRuleId")
        public Float flowRuleId;

        @NameInMap("flowRuleQPS")
        public Float flowRuleQPS;

        @NameInMap("manualDegradeRuleId")
        public Float manualDegradeRuleId;

        @NameInMap("manualDegradeRuleQPS")
        public Float manualDegradeRuleQPS;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("paramRuleId")
        public Float paramRuleId;

        @NameInMap("paramRuleQPS")
        public Float paramRuleQPS;

        @NameInMap("passedQps")
        public Float passedQps;

        @NameInMap("resource")
        public String resource;

        @NameInMap("rt")
        public Float rt;

        @NameInMap("successQps")
        public Float successQps;

        @NameInMap("systemRuleId")
        public Float systemRuleId;

        @NameInMap("systemRuleQPS")
        public Float systemRuleQPS;

        @NameInMap("thread")
        public Float thread;

        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("userId")
        public String userId;

        public static QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics build(java.util.Map<String, ?> map) throws Exception {
            QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics self = new QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics();
            return TeaModel.build(map, self);
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setBlockedQps(Float blockedQps) {
            this.blockedQps = blockedQps;
            return this;
        }
        public Float getBlockedQps() {
            return this.blockedQps;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setDegradeRuleId(Float degradeRuleId) {
            this.degradeRuleId = degradeRuleId;
            return this;
        }
        public Float getDegradeRuleId() {
            return this.degradeRuleId;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setDegradeRuleQPS(Float degradeRuleQPS) {
            this.degradeRuleQPS = degradeRuleQPS;
            return this;
        }
        public Float getDegradeRuleQPS() {
            return this.degradeRuleQPS;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setException(Float exception) {
            this.exception = exception;
            return this;
        }
        public Float getException() {
            return this.exception;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setFlowRuleId(Float flowRuleId) {
            this.flowRuleId = flowRuleId;
            return this;
        }
        public Float getFlowRuleId() {
            return this.flowRuleId;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setFlowRuleQPS(Float flowRuleQPS) {
            this.flowRuleQPS = flowRuleQPS;
            return this;
        }
        public Float getFlowRuleQPS() {
            return this.flowRuleQPS;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setManualDegradeRuleId(Float manualDegradeRuleId) {
            this.manualDegradeRuleId = manualDegradeRuleId;
            return this;
        }
        public Float getManualDegradeRuleId() {
            return this.manualDegradeRuleId;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setManualDegradeRuleQPS(Float manualDegradeRuleQPS) {
            this.manualDegradeRuleQPS = manualDegradeRuleQPS;
            return this;
        }
        public Float getManualDegradeRuleQPS() {
            return this.manualDegradeRuleQPS;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setParamRuleId(Float paramRuleId) {
            this.paramRuleId = paramRuleId;
            return this;
        }
        public Float getParamRuleId() {
            return this.paramRuleId;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setParamRuleQPS(Float paramRuleQPS) {
            this.paramRuleQPS = paramRuleQPS;
            return this;
        }
        public Float getParamRuleQPS() {
            return this.paramRuleQPS;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setPassedQps(Float passedQps) {
            this.passedQps = passedQps;
            return this;
        }
        public Float getPassedQps() {
            return this.passedQps;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setSuccessQps(Float successQps) {
            this.successQps = successQps;
            return this;
        }
        public Float getSuccessQps() {
            return this.successQps;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setSystemRuleId(Float systemRuleId) {
            this.systemRuleId = systemRuleId;
            return this;
        }
        public Float getSystemRuleId() {
            return this.systemRuleId;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setSystemRuleQPS(Float systemRuleQPS) {
            this.systemRuleQPS = systemRuleQPS;
            return this;
        }
        public Float getSystemRuleQPS() {
            return this.systemRuleQPS;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setThread(Float thread) {
            this.thread = thread;
            return this;
        }
        public Float getThread() {
            return this.thread;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QuerySentinelMacMetricsOfResourceResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("blockedQps")
        public Float blockedQps;

        @NameInMap("deviceConfigurationId")
        public String deviceConfigurationId;

        @NameInMap("deviceId")
        public String deviceId;

        @NameInMap("exception")
        public Float exception;

        @NameInMap("hostname")
        public String hostname;

        @NameInMap("innerMetrics")
        public java.util.List<QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics> innerMetrics;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("parentIp")
        public String parentIp;

        @NameInMap("passedQps")
        public Float passedQps;

        @NameInMap("pid")
        public Integer pid;

        @NameInMap("privateIp")
        public String privateIp;

        @NameInMap("processConfigurationId")
        public String processConfigurationId;

        @NameInMap("resource")
        public String resource;

        @NameInMap("rt")
        public Float rt;

        @NameInMap("userId")
        public String userId;

        @NameInMap("vpcId")
        public String vpcId;

        public static QuerySentinelMacMetricsOfResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySentinelMacMetricsOfResourceResponseBodyData self = new QuerySentinelMacMetricsOfResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setBlockedQps(Float blockedQps) {
            this.blockedQps = blockedQps;
            return this;
        }
        public Float getBlockedQps() {
            return this.blockedQps;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setDeviceConfigurationId(String deviceConfigurationId) {
            this.deviceConfigurationId = deviceConfigurationId;
            return this;
        }
        public String getDeviceConfigurationId() {
            return this.deviceConfigurationId;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setException(Float exception) {
            this.exception = exception;
            return this;
        }
        public Float getException() {
            return this.exception;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setInnerMetrics(java.util.List<QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics> innerMetrics) {
            this.innerMetrics = innerMetrics;
            return this;
        }
        public java.util.List<QuerySentinelMacMetricsOfResourceResponseBodyDataInnerMetrics> getInnerMetrics() {
            return this.innerMetrics;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setParentIp(String parentIp) {
            this.parentIp = parentIp;
            return this;
        }
        public String getParentIp() {
            return this.parentIp;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setPassedQps(Float passedQps) {
            this.passedQps = passedQps;
            return this;
        }
        public Float getPassedQps() {
            return this.passedQps;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QuerySentinelMacMetricsOfResourceResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
