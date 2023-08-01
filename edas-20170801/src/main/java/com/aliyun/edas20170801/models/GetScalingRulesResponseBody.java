// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetScalingRulesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public GetScalingRulesResponseBodyData data;

    /**
     * <p>The message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the scaling rule was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
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
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The relationship among the conditions that trigger the scaling rule.</p>
         * <br>
         * <p>*   OR: one of the conditions</p>
         * <p>*   AND: all conditions</p>
         */
        @NameInMap("Cond")
        public String cond;

        /**
         * <p>The minimum CPU utilization that triggers the scaling rule.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the scaling rule was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The duration of the scaling rule. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>Indicates whether scale-ins or scale-outs are allowed. Valid values:</p>
         * <br>
         * <p>*   true: Scale-ins or scale-outs are allowed.</p>
         * <p>*   false: Scale-ins or scale-outs are disallowed.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The ID of the instance group to which the application is deployed.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The maximum number of instances in the group when a scale-out is performed, or the minimum number of instances in the group when a scale-in is performed.</p>
         */
        @NameInMap("InstNum")
        public Integer instNum;

        /**
         * <p>The system load that triggers the scaling rule. The system load is evaluated based on the number of processes that are being executed by CPUs and the number of processes that wait to be executed by CPUs.</p>
         */
        @NameInMap("LoadNum")
        public Integer loadNum;

        /**
         * <p>The type of the metric.</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        /**
         * <p>The type of the scaling rule. Valid values:</p>
         * <br>
         * <p>*   SCALE_IN: scale-in rules</p>
         * <p>*   SCALE_OUT: scale-out rules</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The policy of auto scaling across multiple zones. Valid values:</p>
         * <br>
         * <p>*   PRIORITY: The vSwitch that is first selected has the highest priority.</p>
         * <p>*   BALANCE: This policy evenly distributes instances across zones in which the vSwitches reside.</p>
         */
        @NameInMap("MultiAzPolicy")
        public String multiAzPolicy;

        /**
         * <p>The source of the instance that you want to add during a scale-out. Valid values:</p>
         * <br>
         * <p>*   NEW: Elastic resources are used.</p>
         * <p>*   AVAILABLE: The existing resources are used.</p>
         * <p>*   AVAILABLE_FIRST: The existing resources are used first.</p>
         */
        @NameInMap("ResourceFrom")
        public String resourceFrom;

        /**
         * <p>The service latency that triggers the scaling rule. Unit: milliseconds.</p>
         */
        @NameInMap("Rt")
        public Integer rt;

        /**
         * <p>The ID of the specification.</p>
         */
        @NameInMap("SpecId")
        public String specId;

        /**
         * <p>The number of instances that are added during each scale-out or removed during each scale-in.</p>
         */
        @NameInMap("Step")
        public Integer step;

        /**
         * <p>The ID of the launch template.</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The version of the launch template.</p>
         */
        @NameInMap("TemplateVersion")
        public Integer templateVersion;

        /**
         * <p>The time when the scaling rule was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The IDs of the vSwitches. The IDs of multiple vSwitches are separated by commas (,).</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The ID of the VPC.</p>
         */
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
        /**
         * <p>The type of the cluster. Valid values:</p>
         * <br>
         * <p>*   0: regular Docker cluster</p>
         * <p>*   1: Swarm cluster (deprecated)</p>
         * <p>*   2: Elastic Compute Service (ECS) cluster</p>
         * <p>*   3: self-managed Kubernetes cluster in EDAS</p>
         * <p>*   4: cluster in which Pandora automatically registers applications</p>
         * <p>*   5: Container Service for Kubernetes (ACK) clusters</p>
         */
        @NameInMap("ClusterType")
        public Integer clusterType;

        /**
         * <p>The overcommit ratio supported by a Docker cluster. Valid values:</p>
         * <br>
         * <p>*   1: 1:1, which means that resources are not overcommitted.</p>
         * <p>*   2: 1:2, which means that resources are overcommitted by 1:2.</p>
         * <p>*   4: 1:4, which means that resources are overcommitted by 1:4.</p>
         * <p>*   8: 1:8, which means that resources are overcommitted by 1:8.</p>
         */
        @NameInMap("OversoldFactor")
        public Integer oversoldFactor;

        /**
         * <p>The array data of the scaling rule.</p>
         */
        @NameInMap("RuleList")
        public GetScalingRulesResponseBodyDataRuleList ruleList;

        /**
         * <p>The time when the scaling rule was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
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
