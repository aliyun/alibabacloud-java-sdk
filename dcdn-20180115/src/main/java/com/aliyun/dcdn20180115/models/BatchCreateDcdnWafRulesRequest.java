// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchCreateDcdnWafRulesRequest extends TeaModel {
    /**
     * <p>The configurations of the protection rule.</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The configurations of the RuleConfigs.</p>
     */
    @NameInMap("RuleConfigs")
    public String ruleConfigs;

    public static BatchCreateDcdnWafRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateDcdnWafRulesRequest self = new BatchCreateDcdnWafRulesRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateDcdnWafRulesRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public BatchCreateDcdnWafRulesRequest setRuleConfigs(String ruleConfigs) {
        this.ruleConfigs = ruleConfigs;
        return this;
    }
    public String getRuleConfigs() {
        return this.ruleConfigs;
    }

}
