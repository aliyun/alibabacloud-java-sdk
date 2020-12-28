// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DeleteDegradeRuleRequest extends TeaModel {
    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static DeleteDegradeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDegradeRuleRequest self = new DeleteDegradeRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDegradeRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DeleteDegradeRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
