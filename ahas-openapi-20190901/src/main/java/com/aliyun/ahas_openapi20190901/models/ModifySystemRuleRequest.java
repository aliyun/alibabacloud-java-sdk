// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ModifySystemRuleRequest extends TeaModel {
    @NameInMap("Threshold")
    public Float threshold;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static ModifySystemRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySystemRuleRequest self = new ModifySystemRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifySystemRuleRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

    public ModifySystemRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifySystemRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
