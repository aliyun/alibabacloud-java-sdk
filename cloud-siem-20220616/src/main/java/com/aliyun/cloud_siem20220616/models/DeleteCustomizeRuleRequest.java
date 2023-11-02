// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteCustomizeRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static DeleteCustomizeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizeRuleRequest self = new DeleteCustomizeRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizeRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteCustomizeRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
