// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class EnableIsolationRuleRequest extends TeaModel {
    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static EnableIsolationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableIsolationRuleRequest self = new EnableIsolationRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableIsolationRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public EnableIsolationRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
