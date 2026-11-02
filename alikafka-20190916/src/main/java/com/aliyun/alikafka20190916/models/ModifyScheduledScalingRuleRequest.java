// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ModifyScheduledScalingRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable or disable the scheduled task policy. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the policy.</li>
     * <li><strong>false</strong>: disables the policy.</li>
     * </ul>
     * <blockquote>
     * <p>For a one-time scheduled policy, the start time must be at least 30 minutes later than the current time to enable the policy.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_serverless-cn-vxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The policy name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>contact-id</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static ModifyScheduledScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduledScalingRuleRequest self = new ModifyScheduledScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScheduledScalingRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ModifyScheduledScalingRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyScheduledScalingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyScheduledScalingRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
