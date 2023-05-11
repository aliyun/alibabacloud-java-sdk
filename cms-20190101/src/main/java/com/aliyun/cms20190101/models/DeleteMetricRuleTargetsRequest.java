// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleTargetsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the message resource. Valid values of N: 1 to 5.</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("TargetIds")
    public java.util.List<String> targetIds;

    public static DeleteMetricRuleTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleTargetsRequest self = new DeleteMetricRuleTargetsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMetricRuleTargetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteMetricRuleTargetsRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DeleteMetricRuleTargetsRequest setTargetIds(java.util.List<String> targetIds) {
        this.targetIds = targetIds;
        return this;
    }
    public java.util.List<String> getTargetIds() {
        return this.targetIds;
    }

}
