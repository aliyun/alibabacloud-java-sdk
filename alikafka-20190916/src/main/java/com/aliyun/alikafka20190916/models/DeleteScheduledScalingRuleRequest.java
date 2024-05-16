// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteScheduledScalingRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static DeleteScheduledScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduledScalingRuleRequest self = new DeleteScheduledScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScheduledScalingRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteScheduledScalingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteScheduledScalingRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
