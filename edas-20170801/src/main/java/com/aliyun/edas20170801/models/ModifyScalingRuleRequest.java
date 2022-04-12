// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ModifyScalingRuleRequest extends TeaModel {
    @NameInMap("AcceptEULA")
    public Boolean acceptEULA;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InCondition")
    public String inCondition;

    @NameInMap("InCpu")
    public Integer inCpu;

    @NameInMap("InDuration")
    public Integer inDuration;

    @NameInMap("InEnable")
    public Boolean inEnable;

    @NameInMap("InInstanceNum")
    public Integer inInstanceNum;

    @NameInMap("InLoad")
    public Integer inLoad;

    @NameInMap("InRT")
    public Integer inRT;

    @NameInMap("InStep")
    public Integer inStep;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("MultiAzPolicy")
    public String multiAzPolicy;

    @NameInMap("OutCPU")
    public Integer outCPU;

    @NameInMap("OutCondition")
    public String outCondition;

    @NameInMap("OutDuration")
    public Integer outDuration;

    @NameInMap("OutEnable")
    public Boolean outEnable;

    @NameInMap("OutInstanceNum")
    public Integer outInstanceNum;

    @NameInMap("OutLoad")
    public Integer outLoad;

    @NameInMap("OutRT")
    public Integer outRT;

    @NameInMap("OutStep")
    public Integer outStep;

    @NameInMap("Password")
    public String password;

    @NameInMap("ResourceFrom")
    public String resourceFrom;

    @NameInMap("ScalingPolicy")
    public String scalingPolicy;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateInstanceId")
    public String templateInstanceId;

    @NameInMap("TemplateInstanceName")
    public String templateInstanceName;

    @NameInMap("TemplateVersion")
    public Integer templateVersion;

    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    @NameInMap("VpcId")
    public String vpcId;

    public static ModifyScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingRuleRequest self = new ModifyScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScalingRuleRequest setAcceptEULA(Boolean acceptEULA) {
        this.acceptEULA = acceptEULA;
        return this;
    }
    public Boolean getAcceptEULA() {
        return this.acceptEULA;
    }

    public ModifyScalingRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyScalingRuleRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyScalingRuleRequest setInCondition(String inCondition) {
        this.inCondition = inCondition;
        return this;
    }
    public String getInCondition() {
        return this.inCondition;
    }

    public ModifyScalingRuleRequest setInCpu(Integer inCpu) {
        this.inCpu = inCpu;
        return this;
    }
    public Integer getInCpu() {
        return this.inCpu;
    }

    public ModifyScalingRuleRequest setInDuration(Integer inDuration) {
        this.inDuration = inDuration;
        return this;
    }
    public Integer getInDuration() {
        return this.inDuration;
    }

    public ModifyScalingRuleRequest setInEnable(Boolean inEnable) {
        this.inEnable = inEnable;
        return this;
    }
    public Boolean getInEnable() {
        return this.inEnable;
    }

    public ModifyScalingRuleRequest setInInstanceNum(Integer inInstanceNum) {
        this.inInstanceNum = inInstanceNum;
        return this;
    }
    public Integer getInInstanceNum() {
        return this.inInstanceNum;
    }

    public ModifyScalingRuleRequest setInLoad(Integer inLoad) {
        this.inLoad = inLoad;
        return this;
    }
    public Integer getInLoad() {
        return this.inLoad;
    }

    public ModifyScalingRuleRequest setInRT(Integer inRT) {
        this.inRT = inRT;
        return this;
    }
    public Integer getInRT() {
        return this.inRT;
    }

    public ModifyScalingRuleRequest setInStep(Integer inStep) {
        this.inStep = inStep;
        return this;
    }
    public Integer getInStep() {
        return this.inStep;
    }

    public ModifyScalingRuleRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public ModifyScalingRuleRequest setMultiAzPolicy(String multiAzPolicy) {
        this.multiAzPolicy = multiAzPolicy;
        return this;
    }
    public String getMultiAzPolicy() {
        return this.multiAzPolicy;
    }

    public ModifyScalingRuleRequest setOutCPU(Integer outCPU) {
        this.outCPU = outCPU;
        return this;
    }
    public Integer getOutCPU() {
        return this.outCPU;
    }

    public ModifyScalingRuleRequest setOutCondition(String outCondition) {
        this.outCondition = outCondition;
        return this;
    }
    public String getOutCondition() {
        return this.outCondition;
    }

    public ModifyScalingRuleRequest setOutDuration(Integer outDuration) {
        this.outDuration = outDuration;
        return this;
    }
    public Integer getOutDuration() {
        return this.outDuration;
    }

    public ModifyScalingRuleRequest setOutEnable(Boolean outEnable) {
        this.outEnable = outEnable;
        return this;
    }
    public Boolean getOutEnable() {
        return this.outEnable;
    }

    public ModifyScalingRuleRequest setOutInstanceNum(Integer outInstanceNum) {
        this.outInstanceNum = outInstanceNum;
        return this;
    }
    public Integer getOutInstanceNum() {
        return this.outInstanceNum;
    }

    public ModifyScalingRuleRequest setOutLoad(Integer outLoad) {
        this.outLoad = outLoad;
        return this;
    }
    public Integer getOutLoad() {
        return this.outLoad;
    }

    public ModifyScalingRuleRequest setOutRT(Integer outRT) {
        this.outRT = outRT;
        return this;
    }
    public Integer getOutRT() {
        return this.outRT;
    }

    public ModifyScalingRuleRequest setOutStep(Integer outStep) {
        this.outStep = outStep;
        return this;
    }
    public Integer getOutStep() {
        return this.outStep;
    }

    public ModifyScalingRuleRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyScalingRuleRequest setResourceFrom(String resourceFrom) {
        this.resourceFrom = resourceFrom;
        return this;
    }
    public String getResourceFrom() {
        return this.resourceFrom;
    }

    public ModifyScalingRuleRequest setScalingPolicy(String scalingPolicy) {
        this.scalingPolicy = scalingPolicy;
        return this;
    }
    public String getScalingPolicy() {
        return this.scalingPolicy;
    }

    public ModifyScalingRuleRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ModifyScalingRuleRequest setTemplateInstanceId(String templateInstanceId) {
        this.templateInstanceId = templateInstanceId;
        return this;
    }
    public String getTemplateInstanceId() {
        return this.templateInstanceId;
    }

    public ModifyScalingRuleRequest setTemplateInstanceName(String templateInstanceName) {
        this.templateInstanceName = templateInstanceName;
        return this;
    }
    public String getTemplateInstanceName() {
        return this.templateInstanceName;
    }

    public ModifyScalingRuleRequest setTemplateVersion(Integer templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public Integer getTemplateVersion() {
        return this.templateVersion;
    }

    public ModifyScalingRuleRequest setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public ModifyScalingRuleRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
