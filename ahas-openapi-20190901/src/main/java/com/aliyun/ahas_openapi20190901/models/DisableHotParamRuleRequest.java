// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DisableHotParamRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static DisableHotParamRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableHotParamRuleRequest self = new DisableHotParamRuleRequest();
        return TeaModel.build(map, self);
    }

    public DisableHotParamRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public DisableHotParamRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
