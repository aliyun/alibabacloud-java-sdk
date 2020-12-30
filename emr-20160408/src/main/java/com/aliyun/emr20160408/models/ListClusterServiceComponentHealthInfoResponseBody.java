// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterServiceComponentHealthInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("HealthInfoList")
    public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoList healthInfoList;

    public static ListClusterServiceComponentHealthInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterServiceComponentHealthInfoResponseBody self = new ListClusterServiceComponentHealthInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterServiceComponentHealthInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterServiceComponentHealthInfoResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterServiceComponentHealthInfoResponseBody setHealthInfoList(ListClusterServiceComponentHealthInfoResponseBodyHealthInfoList healthInfoList) {
        this.healthInfoList = healthInfoList;
        return this;
    }
    public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoList getHealthInfoList() {
        return this.healthInfoList;
    }

    public static class ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetailHealthRuleParam extends TeaModel {
        @NameInMap("Service")
        public String service;

        @NameInMap("Pass")
        public String pass;

        @NameInMap("Component")
        public String component;

        @NameInMap("HostNames")
        public String hostNames;

        @NameInMap("RuleTitle")
        public String ruleTitle;

        @NameInMap("RuleDescription")
        public String ruleDescription;

        @NameInMap("RuleId")
        public String ruleId;

        public static ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetailHealthRuleParam build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetailHealthRuleParam self = new ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetailHealthRuleParam();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetailHealthRuleParam setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetailHealthRuleParam setPass(String pass) {
            this.pass = pass;
            return this;
        }
        public String getPass() {
            return this.pass;
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetailHealthRuleParam setComponent(String component) {
            this.component = component;
            return this;
        }
        public String getComponent() {
            return this.component;
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetailHealthRuleParam setHostNames(String hostNames) {
            this.hostNames = hostNames;
            return this;
        }
        public String getHostNames() {
            return this.hostNames;
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetailHealthRuleParam setRuleTitle(String ruleTitle) {
            this.ruleTitle = ruleTitle;
            return this;
        }
        public String getRuleTitle() {
            return this.ruleTitle;
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetailHealthRuleParam setRuleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            return this;
        }
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetailHealthRuleParam setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetail extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("HealthRuleParam")
        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetailHealthRuleParam healthRuleParam;

        public static ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetail build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetail self = new ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetail();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetail setHealthRuleParam(ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetailHealthRuleParam healthRuleParam) {
            this.healthRuleParam = healthRuleParam;
            return this;
        }
        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetailHealthRuleParam getHealthRuleParam() {
            return this.healthRuleParam;
        }

    }

    public static class ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailList extends TeaModel {
        @NameInMap("HealthDetail")
        public java.util.List<ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetail> healthDetail;

        public static ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailList self = new ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailList();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailList setHealthDetail(java.util.List<ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetail> healthDetail) {
            this.healthDetail = healthDetail;
            return this;
        }
        public java.util.List<ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailListHealthDetail> getHealthDetail() {
            return this.healthDetail;
        }

    }

    public static class ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo extends TeaModel {
        @NameInMap("HealthLevel")
        public String healthLevel;

        @NameInMap("HealthDetailList")
        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailList healthDetailList;

        @NameInMap("ComponentName")
        public String componentName;

        @NameInMap("NormalNum")
        public Integer normalNum;

        @NameInMap("ManualStoppedNum")
        public Integer manualStoppedNum;

        @NameInMap("StoppedNum")
        public Integer stoppedNum;

        @NameInMap("AgentHeartBeatLostNum")
        public Integer agentHeartBeatLostNum;

        @NameInMap("TotalNum")
        public Integer totalNum;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("CreatedTime")
        public Long createdTime;

        public static ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo self = new ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo setHealthLevel(String healthLevel) {
            this.healthLevel = healthLevel;
            return this;
        }
        public String getHealthLevel() {
            return this.healthLevel;
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo setHealthDetailList(ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailList healthDetailList) {
            this.healthDetailList = healthDetailList;
            return this;
        }
        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfoHealthDetailList getHealthDetailList() {
            return this.healthDetailList;
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo setNormalNum(Integer normalNum) {
            this.normalNum = normalNum;
            return this;
        }
        public Integer getNormalNum() {
            return this.normalNum;
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo setManualStoppedNum(Integer manualStoppedNum) {
            this.manualStoppedNum = manualStoppedNum;
            return this;
        }
        public Integer getManualStoppedNum() {
            return this.manualStoppedNum;
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo setStoppedNum(Integer stoppedNum) {
            this.stoppedNum = stoppedNum;
            return this;
        }
        public Integer getStoppedNum() {
            return this.stoppedNum;
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo setAgentHeartBeatLostNum(Integer agentHeartBeatLostNum) {
            this.agentHeartBeatLostNum = agentHeartBeatLostNum;
            return this;
        }
        public Integer getAgentHeartBeatLostNum() {
            return this.agentHeartBeatLostNum;
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

    }

    public static class ListClusterServiceComponentHealthInfoResponseBodyHealthInfoList extends TeaModel {
        @NameInMap("HealthInfo")
        public java.util.List<ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo> healthInfo;

        public static ListClusterServiceComponentHealthInfoResponseBodyHealthInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceComponentHealthInfoResponseBodyHealthInfoList self = new ListClusterServiceComponentHealthInfoResponseBodyHealthInfoList();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceComponentHealthInfoResponseBodyHealthInfoList setHealthInfo(java.util.List<ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo> healthInfo) {
            this.healthInfo = healthInfo;
            return this;
        }
        public java.util.List<ListClusterServiceComponentHealthInfoResponseBodyHealthInfoListHealthInfo> getHealthInfo() {
            return this.healthInfo;
        }

    }

}
