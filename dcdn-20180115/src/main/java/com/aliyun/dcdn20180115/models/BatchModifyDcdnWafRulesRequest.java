// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchModifyDcdnWafRulesRequest extends TeaModel {
    /**
     * <p>The ID of the protection policy.</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The configurations of the protection rule.</p>
     */
    @NameInMap("RuleConfigs")
    public String ruleConfigs;

    public static BatchModifyDcdnWafRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchModifyDcdnWafRulesRequest self = new BatchModifyDcdnWafRulesRequest();
        return TeaModel.build(map, self);
    }

    public BatchModifyDcdnWafRulesRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public BatchModifyDcdnWafRulesRequest setRuleConfigs(String ruleConfigs) {
        this.ruleConfigs = ruleConfigs;
        return this;
    }
    public String getRuleConfigs() {
        return this.ruleConfigs;
    }

}
