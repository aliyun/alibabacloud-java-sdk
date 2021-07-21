// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableEventRulesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleNames")
    public java.util.List<String> ruleNames;

    public static DisableEventRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableEventRulesRequest self = new DisableEventRulesRequest();
        return TeaModel.build(map, self);
    }

    public DisableEventRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DisableEventRulesRequest setRuleNames(java.util.List<String> ruleNames) {
        this.ruleNames = ruleNames;
        return this;
    }
    public java.util.List<String> getRuleNames() {
        return this.ruleNames;
    }

}
