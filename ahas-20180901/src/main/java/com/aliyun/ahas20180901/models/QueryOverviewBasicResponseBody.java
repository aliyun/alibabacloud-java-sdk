// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryOverviewBasicResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryOverviewBasicResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryOverviewBasicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOverviewBasicResponseBody self = new QueryOverviewBasicResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOverviewBasicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOverviewBasicResponseBody setData(QueryOverviewBasicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryOverviewBasicResponseBodyData getData() {
        return this.data;
    }

    public QueryOverviewBasicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOverviewBasicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOverviewBasicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOverviewBasicResponseBodyData extends TeaModel {
        @NameInMap("FailInspectCount")
        public Integer failInspectCount;

        @NameInMap("chaosSuites")
        public Integer chaosSuites;

        @NameInMap("containers")
        public Integer containers;

        @NameInMap("cpuUsage")
        public Float cpuUsage;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("flowLimitApps")
        public Integer flowLimitApps;

        @NameInMap("hosts")
        public Integer hosts;

        @NameInMap("memUsage")
        public Float memUsage;

        @NameInMap("namespaceName")
        public String namespaceName;

        @NameInMap("pods")
        public Integer pods;

        @NameInMap("processes")
        public Integer processes;

        @NameInMap("sentinelApps")
        public Integer sentinelApps;

        @NameInMap("sentinelDegradeRules")
        public Integer sentinelDegradeRules;

        @NameInMap("sentinelFlowRules")
        public Integer sentinelFlowRules;

        @NameInMap("sentinelGatewayApis")
        public Integer sentinelGatewayApis;

        @NameInMap("sentinelGatewayRules")
        public Integer sentinelGatewayRules;

        @NameInMap("sentinelGateways")
        public Integer sentinelGateways;

        @NameInMap("sentinelIsolateRules")
        public Integer sentinelIsolateRules;

        @NameInMap("sentinelMachines")
        public Integer sentinelMachines;

        @NameInMap("sentinelSystemRules")
        public Integer sentinelSystemRules;

        public static QueryOverviewBasicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOverviewBasicResponseBodyData self = new QueryOverviewBasicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOverviewBasicResponseBodyData setFailInspectCount(Integer failInspectCount) {
            this.failInspectCount = failInspectCount;
            return this;
        }
        public Integer getFailInspectCount() {
            return this.failInspectCount;
        }

        public QueryOverviewBasicResponseBodyData setChaosSuites(Integer chaosSuites) {
            this.chaosSuites = chaosSuites;
            return this;
        }
        public Integer getChaosSuites() {
            return this.chaosSuites;
        }

        public QueryOverviewBasicResponseBodyData setContainers(Integer containers) {
            this.containers = containers;
            return this;
        }
        public Integer getContainers() {
            return this.containers;
        }

        public QueryOverviewBasicResponseBodyData setCpuUsage(Float cpuUsage) {
            this.cpuUsage = cpuUsage;
            return this;
        }
        public Float getCpuUsage() {
            return this.cpuUsage;
        }

        public QueryOverviewBasicResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryOverviewBasicResponseBodyData setFlowLimitApps(Integer flowLimitApps) {
            this.flowLimitApps = flowLimitApps;
            return this;
        }
        public Integer getFlowLimitApps() {
            return this.flowLimitApps;
        }

        public QueryOverviewBasicResponseBodyData setHosts(Integer hosts) {
            this.hosts = hosts;
            return this;
        }
        public Integer getHosts() {
            return this.hosts;
        }

        public QueryOverviewBasicResponseBodyData setMemUsage(Float memUsage) {
            this.memUsage = memUsage;
            return this;
        }
        public Float getMemUsage() {
            return this.memUsage;
        }

        public QueryOverviewBasicResponseBodyData setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public QueryOverviewBasicResponseBodyData setPods(Integer pods) {
            this.pods = pods;
            return this;
        }
        public Integer getPods() {
            return this.pods;
        }

        public QueryOverviewBasicResponseBodyData setProcesses(Integer processes) {
            this.processes = processes;
            return this;
        }
        public Integer getProcesses() {
            return this.processes;
        }

        public QueryOverviewBasicResponseBodyData setSentinelApps(Integer sentinelApps) {
            this.sentinelApps = sentinelApps;
            return this;
        }
        public Integer getSentinelApps() {
            return this.sentinelApps;
        }

        public QueryOverviewBasicResponseBodyData setSentinelDegradeRules(Integer sentinelDegradeRules) {
            this.sentinelDegradeRules = sentinelDegradeRules;
            return this;
        }
        public Integer getSentinelDegradeRules() {
            return this.sentinelDegradeRules;
        }

        public QueryOverviewBasicResponseBodyData setSentinelFlowRules(Integer sentinelFlowRules) {
            this.sentinelFlowRules = sentinelFlowRules;
            return this;
        }
        public Integer getSentinelFlowRules() {
            return this.sentinelFlowRules;
        }

        public QueryOverviewBasicResponseBodyData setSentinelGatewayApis(Integer sentinelGatewayApis) {
            this.sentinelGatewayApis = sentinelGatewayApis;
            return this;
        }
        public Integer getSentinelGatewayApis() {
            return this.sentinelGatewayApis;
        }

        public QueryOverviewBasicResponseBodyData setSentinelGatewayRules(Integer sentinelGatewayRules) {
            this.sentinelGatewayRules = sentinelGatewayRules;
            return this;
        }
        public Integer getSentinelGatewayRules() {
            return this.sentinelGatewayRules;
        }

        public QueryOverviewBasicResponseBodyData setSentinelGateways(Integer sentinelGateways) {
            this.sentinelGateways = sentinelGateways;
            return this;
        }
        public Integer getSentinelGateways() {
            return this.sentinelGateways;
        }

        public QueryOverviewBasicResponseBodyData setSentinelIsolateRules(Integer sentinelIsolateRules) {
            this.sentinelIsolateRules = sentinelIsolateRules;
            return this;
        }
        public Integer getSentinelIsolateRules() {
            return this.sentinelIsolateRules;
        }

        public QueryOverviewBasicResponseBodyData setSentinelMachines(Integer sentinelMachines) {
            this.sentinelMachines = sentinelMachines;
            return this;
        }
        public Integer getSentinelMachines() {
            return this.sentinelMachines;
        }

        public QueryOverviewBasicResponseBodyData setSentinelSystemRules(Integer sentinelSystemRules) {
            this.sentinelSystemRules = sentinelSystemRules;
            return this;
        }
        public Integer getSentinelSystemRules() {
            return this.sentinelSystemRules;
        }

    }

}
