// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ModifyScalingRuleRequest extends TeaModel {
    /**
     * <p>Set the value to true if scale-outs are allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AcceptEULA")
    public Boolean acceptEULA;

    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74ee****-db65-4322-a1f6-bcb60e5b****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the instance group to which the application is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8123db90-880f-486f-<strong><strong>-</strong></strong>********</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The relationship among the conditions that trigger a scale-in.</p>
     * <ul>
     * <li>OR: one of the conditions</li>
     * <li>AND: all conditions</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;OR&quot;</p>
     */
    @NameInMap("InCondition")
    public String inCondition;

    /**
     * <p>The CPU utilization that triggers a scale-in.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("InCpu")
    public Integer inCpu;

    /**
     * <p>The duration in which the metric threshold is exceeded. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("InDuration")
    public Integer inDuration;

    /**
     * <p>Specifies whether to allow scale-ins.</p>
     * <ul>
     * <li>true: allows scale-ins.</li>
     * <li>false: does not allow scale-ins.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InEnable")
    public Boolean inEnable;

    /**
     * <p>The minimum number of instances that must be retained in each group when a scale-in is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("InInstanceNum")
    public Integer inInstanceNum;

    /**
     * <p>The system load that triggers a scale-in.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("InLoad")
    public Integer inLoad;

    /**
     * <p>The minimum service latency that triggers a scale-in. The lower limit is 0. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("InRT")
    public Integer inRT;

    /**
     * <p>The number of instances that are removed during each scale-in.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InStep")
    public Integer inStep;

    /**
     * <p>The key pair that is used to log on to the instance. This parameter takes effect only if you choose to create instances based on the specifications of an existing instance during a scale-out.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;tdy218&quot;</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The multi-zone scaling policy. Valid values:</p>
     * <ul>
     * <li>PRIORITY: The vSwitch that is first selected has the highest priority.</li>
     * <li>BALANCE: This policy evenly distributes instances across zones in which the vSwitches reside.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;PRIORITY&quot;</p>
     */
    @NameInMap("MultiAzPolicy")
    public String multiAzPolicy;

    /**
     * <p>The CPU utilization that triggers a scale-out.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("OutCPU")
    public Integer outCPU;

    /**
     * <p>The relationship among the conditions that trigger a scale-out.</p>
     * <ul>
     * <li>OR: one of the conditions</li>
     * <li>AND: all conditions</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;OR&quot;</p>
     */
    @NameInMap("OutCondition")
    public String outCondition;

    /**
     * <p>The duration in which the metric threshold is exceeded. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("OutDuration")
    public Integer outDuration;

    /**
     * <p>Specifies whether to allow scale-outs.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OutEnable")
    public Boolean outEnable;

    /**
     * <p>The maximum number of instances in each group when a scale-out is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OutInstanceNum")
    public Integer outInstanceNum;

    /**
     * <p>The system load that triggers a scale-out.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("OutLoad")
    public Integer outLoad;

    /**
     * <p>The minimum service latency that triggers a scale-out. The lower limit is 0. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OutRT")
    public Integer outRT;

    /**
     * <p>The number of instances that are added during each scale-out.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OutStep")
    public Integer outStep;

    /**
     * <p>The password that is used to log on to the instance. This parameter takes effect only if you choose to create instances based on the specifications of an existing instance during a scale-out.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Pwd*****&quot;</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The source of the instance to be added during a scale-out. Valid values:</p>
     * <ul>
     * <li>NEW: elastic resources</li>
     * <li>AVAILABLE: existing resources If you prefer existing resources to elastic resources, set this parameter to AVAILABLE_FIRST.</li>
     * </ul>
     * <p>If you set this parameter to NEW or AVAILABLE_FIRST, you must specify the auto-scaling parameters. If you set this parameter to NEW, instances are created based on a launch template or the specifications of an existing instance.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;AVAILABLE&quot;</p>
     */
    @NameInMap("ResourceFrom")
    public String resourceFrom;

    /**
     * <p>The instance handling mode during a scale-in. Valid values:</p>
     * <ul>
     * <li>release: When a scale-in is performed, instances that are no longer used are released.</li>
     * <li>recycle: When a scale-in is performed, instances that are no longer used are stopped and reclaimed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;release&quot;</p>
     */
    @NameInMap("ScalingPolicy")
    public String scalingPolicy;

    /**
     * <p>The ID of the launch template that is used to create instances during a scale-out. This parameter takes effect only if you set the OutEnable parameter to true. This parameter takes precedence over the TemplateInstanceId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;lt-wz9hkhn8wp*****&quot;</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The ID of the instance whose specifications are used to create instances during a scale-out. This parameter is valid only when you set the OutEnable parameter to true.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;1&quot;</p>
     */
    @NameInMap("TemplateInstanceId")
    public String templateInstanceId;

    /**
     * <p>The name of the instance whose specifications are used to create instances during a scale-out. This parameter takes effect only if you specify the TemplateInstanceId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;tpl-tdy218&quot;</p>
     */
    @NameInMap("TemplateInstanceName")
    public String templateInstanceName;

    /**
     * <p>The version of the launch template that is used to create instances during a scale-out. This parameter takes effect only if you set the OutEnable parameter to true. To use the default template version, set this parameter to <code>-1</code>. Otherwise, set this parameter to the version that you want to use.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("TemplateVersion")
    public Integer templateVersion;

    /**
     * <p>The IDs of the vSwitches that are associated with the VPC. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;vsw-bp1ldxs3d4fd*****&quot;</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    /**
     * <p>The ID of the virtual private cloud (VPC) that is associated with the instances created based on a launch template or the specifications of an existing instance.</p>
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
