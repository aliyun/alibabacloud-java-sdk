// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DeleteFlowRuleRequest extends TeaModel {
    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static DeleteFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowRuleRequest self = new DeleteFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DeleteFlowRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
