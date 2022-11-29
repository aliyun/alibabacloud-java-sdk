// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafRuleRequest extends TeaModel {
    @NameInMap("RuleId")
    public Long ruleId;

    public static DescribeDcdnWafRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafRuleRequest self = new DescribeDcdnWafRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
