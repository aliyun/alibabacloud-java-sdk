// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DisableDegradeRuleRequest extends TeaModel {
    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static DisableDegradeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDegradeRuleRequest self = new DisableDegradeRuleRequest();
        return TeaModel.build(map, self);
    }

    public DisableDegradeRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DisableDegradeRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
