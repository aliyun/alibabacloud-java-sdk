// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchCreateDcdnWafRulesRequest extends TeaModel {
    /**
     * <p>The ID of the protection policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000001</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The configuration of the protection rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;ttttt&quot;,&quot;action&quot;:&quot;monitor&quot;,&quot;conditions&quot;:[{&quot;key&quot;:&quot;URL&quot;,&quot;opValue&quot;:&quot;match-one&quot;,&quot;values&quot;:&quot;1,2,3,4,5&quot;},{&quot;key&quot;:&quot;Header&quot;,&quot;opValue&quot;:&quot;contain-one&quot;,&quot;subKey&quot;:&quot;testheader&quot;,&quot;values&quot;:&quot;6,7,8,9,10&quot;}],&quot;ratelimit&quot;:{&quot;target&quot;:&quot;header&quot;,&quot;interval&quot;:10,&quot;threshold&quot;:5,&quot;ttl&quot;:1800,&quot;subKey&quot;:&quot;testheadercc&quot;,&quot;status&quot;:{&quot;code&quot;:&quot;502&quot;,&quot;count&quot;:5}},&quot;ccStatus&quot;:&quot;on&quot;,&quot;effect&quot;:&quot;rule&quot;,&quot;status&quot;:&quot;on&quot;}</p>
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
