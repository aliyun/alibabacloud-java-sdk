// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class EnableFlowRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static EnableFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableFlowRuleRequest self = new EnableFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableFlowRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public EnableFlowRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
