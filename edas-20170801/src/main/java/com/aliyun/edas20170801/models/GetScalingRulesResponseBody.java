// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetScalingRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetScalingRulesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UpdateTime")
    public Long updateTime;

    public static GetScalingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScalingRulesResponseBody self = new GetScalingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScalingRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetScalingRulesResponseBody setData(GetScalingRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScalingRulesResponseBodyData getData() {
        return this.data;
    }

    public GetScalingRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScalingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScalingRulesResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static class GetScalingRulesResponseBodyDataRuleListRule extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Cond")
        public String cond;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("InstNum")
        public Integer instNum;

        @NameInMap("LoadNum")
        public Integer loadNum;

        @NameInMap("MetricType")
        public String metricType;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("MultiAzPolicy")
        public String multiAzPolicy;

        @NameInMap("ResourceFrom")
        public String resourceFrom;

        @NameInMap("Rt")
        public Integer rt;

        @NameInMap("SpecId")
        public String specId;

        @NameInMap("Step")
        public Integer step;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateVersion")
        public Integer templateVersion;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        @NameInMap("VpcId")
        public String vpcId;

        public static GetScalingRulesResponseBodyDataRuleListRule build(java.util.Map<String, ?> map) throws Exception {
            GetScalingRulesResponseBodyDataRuleListRule self = new GetScalingRulesResponseBodyDataRuleListRule();
            return TeaModel.build(map, self);
        }

        public GetScalingRulesResponseBodyDataRuleListRule setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setInstNum(Integer instNum) {
            this.instNum = instNum;
            return this;
        }
        public Integer getInstNum() {
            return this.instNum;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setLoadNum(Integer loadNum) {
            this.loadNum = loadNum;
            return this;
        }
        public Integer getLoadNum() {
            return this.loadNum;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setMultiAzPolicy(String multiAzPolicy) {
            this.multiAzPolicy = multiAzPolicy;
            return this;
        }
        public String getMultiAzPolicy() {
            return this.multiAzPolicy;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setResourceFrom(String resourceFrom) {
            this.resourceFrom = resourceFrom;
            return this;
        }
        public String getResourceFrom() {
            return this.resourceFrom;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setRt(Integer rt) {
            this.rt = rt;
            return this;
        }
        public Integer getRt() {
            return this.rt;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setSpecId(String specId) {
            this.specId = specId;
            return this;
        }
        public String getSpecId() {
            return this.specId;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setTemplateVersion(Integer templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public Integer getTemplateVersion() {
            return this.templateVersion;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetScalingRulesResponseBodyDataRuleListRule setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetScalingRulesResponseBodyDataRuleList extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<GetScalingRulesResponseBodyDataRuleListRule> rule;

        public static GetScalingRulesResponseBodyDataRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetScalingRulesResponseBodyDataRuleList self = new GetScalingRulesResponseBodyDataRuleList();
            return TeaModel.build(map, self);
        }

        public GetScalingRulesResponseBodyDataRuleList setRule(java.util.List<GetScalingRulesResponseBodyDataRuleListRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<GetScalingRulesResponseBodyDataRuleListRule> getRule() {
            return this.rule;
        }

    }

    public static class GetScalingRulesResponseBodyData extends TeaModel {
        @NameInMap("ClusterType")
        public Integer clusterType;

        @NameInMap("OversoldFactor")
        public Integer oversoldFactor;

        @NameInMap("RuleList")
        public GetScalingRulesResponseBodyDataRuleList ruleList;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("VpcId")
        public String vpcId;

        public static GetScalingRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScalingRulesResponseBodyData self = new GetScalingRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScalingRulesResponseBodyData setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public GetScalingRulesResponseBodyData setOversoldFactor(Integer oversoldFactor) {
            this.oversoldFactor = oversoldFactor;
            return this;
        }
        public Integer getOversoldFactor() {
            return this.oversoldFactor;
        }

        public GetScalingRulesResponseBodyData setRuleList(GetScalingRulesResponseBodyDataRuleList ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public GetScalingRulesResponseBodyDataRuleList getRuleList() {
            return this.ruleList;
        }

        public GetScalingRulesResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetScalingRulesResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
