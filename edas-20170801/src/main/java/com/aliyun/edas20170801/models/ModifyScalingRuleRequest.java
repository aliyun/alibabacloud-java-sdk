// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ModifyScalingRuleRequest extends TeaModel {
    /**
     * <p>Must be set to true if auto scaling is used.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AcceptEULA")
    public Boolean acceptEULA;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74ee****-db65-4322-a1f6-bcb60e5b****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The deployment group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8123db90-880f-486f-<strong><strong>-</strong></strong>********</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The trigger condition. Valid values:</p>
     * <ul>
     * <li>OR: Any condition.</li>
     * <li>AND: All conditions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;OR&quot;</p>
     */
    @NameInMap("InCondition")
    public String inCondition;

    /**
     * <p>The trigger metric: CPU utilization.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("InCpu")
    public Integer inCpu;

    /**
     * <p>The duration, in minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("InDuration")
    public Integer inDuration;

    /**
     * <p>Specifies whether to include the scale-in rule. Valid values:</p>
     * <ul>
     * <li>true: Included.</li>
     * <li>false: Not included.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InEnable")
    public Boolean inEnable;

    /**
     * <p>The minimum number of instances to retain when the group scales in.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("InInstanceNum")
    public Integer inInstanceNum;

    /**
     * <p>The trigger metric: system load.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("InLoad")
    public Integer inLoad;

    /**
     * <p>The trigger metric: service latency. Unit: milliseconds. Minimum value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("InRT")
    public Integer inRT;

    /**
     * <p>The number of instances to scale in at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InStep")
    public Integer inStep;

    /**
     * <p>The name of the logon key pair for the instance. This parameter is valid only when the existing instance rule is used for auto scaling.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;tdy218&quot;</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The multi-zone scaling policy for auto scaling. Valid values:</p>
     * <ul>
     * <li>PRIORITY: Priority policy.</li>
     * <li>BALANCE: Balanced distribution policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;PRIORITY&quot;</p>
     */
    @NameInMap("MultiAzPolicy")
    public String multiAzPolicy;

    /**
     * <p>The trigger metric: CPU utilization.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("OutCPU")
    public Integer outCPU;

    /**
     * <p>The trigger condition. Valid values:</p>
     * <ul>
     * <li>OR: Any condition.</li>
     * <li>AND: All conditions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;OR&quot;</p>
     */
    @NameInMap("OutCondition")
    public String outCondition;

    /**
     * <p>The duration, in minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("OutDuration")
    public Integer outDuration;

    /**
     * <p>Specifies whether to include the scale-out rule.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OutEnable")
    public Boolean outEnable;

    /**
     * <p>The maximum number of instances when the group scales out.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OutInstanceNum")
    public Integer outInstanceNum;

    /**
     * <p>The trigger metric: system load.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("OutLoad")
    public Integer outLoad;

    /**
     * <p>The trigger metric: service latency. Unit: milliseconds. Minimum value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OutRT")
    public Integer outRT;

    /**
     * <p>The number of instances to scale out at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OutStep")
    public Integer outStep;

    /**
     * <p>The logon password of the instance. This parameter is valid only when the existing instance rule is used for auto scaling.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Pwd*****&quot;</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The source of instances for scale-out. Valid values:</p>
     * <ul>
     * <li>NEW: Elastic resources.</li>
     * <li>AVAILABLE: Existing resources. To prioritize existing resources, use AVAILABLE_FIRST.</li>
     * </ul>
     * <p>If you set this parameter to NEW or AVAILABLE_FIRST, you must specify auto scaling parameters. Auto scaling includes two modes: launch template and existing instance rule.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;AVAILABLE&quot;</p>
     */
    @NameInMap("ResourceFrom")
    public String resourceFrom;

    /**
     * <p>The reclamation mode for scale-in. Valid values:</p>
     * <ul>
     * <li>release: Release mode.</li>
     * <li>recycle: Stop and reclaim mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;release&quot;</p>
     */
    @NameInMap("ScalingPolicy")
    public String scalingPolicy;

    /**
     * <p>The launch template ID for auto scaling. This parameter is valid only when OutEnable is set to true, and it has a higher priority than TemplateInstanceId.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;lt-wz9hkhn8wp*****&quot;</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The instance ID for the existing instance rule of auto scaling. This parameter is valid only when OutEnable is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;1&quot;</p>
     */
    @NameInMap("TemplateInstanceId")
    public String templateInstanceId;

    /**
     * <p>The instance name for the existing instance rule of auto scaling. This parameter is valid only when TemplateInstanceId is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;tpl-tdy218&quot;</p>
     */
    @NameInMap("TemplateInstanceName")
    public String templateInstanceName;

    /**
     * <p>The launch template version for auto scaling. This parameter is valid only when OutEnable is set to true. Set this parameter to <code>-1</code> to use the default template version, or set it to a specific version number.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("TemplateVersion")
    public Integer templateVersion;

    /**
     * <p>The list of vSwitch IDs in the VPC. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;vsw-bp1ldxs3d4fd*****&quot;</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    /**
     * <p>The VPC ID associated with the launch template or existing instance rule for auto scaling.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;vpc-bp1j55oz3bg*****&quot;</p>
     */
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
