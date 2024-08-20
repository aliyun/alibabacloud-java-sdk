// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchModifyDcdnWafRulesRequest extends TeaModel {
    /**
     * <p>The ID of the protection policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The configurations of the protection rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;id&quot;:135,&quot;type&quot;:&quot;web_sdk&quot;,&quot;status&quot;:&quot;on&quot;,&quot;config&quot;:{&quot;mode&quot;:&quot;automatic&quot;,&quot;crossDomain&quot;:&quot;example.com&quot;},&quot;action&quot;:&quot;&quot;},{&quot;id&quot;:149,&quot;type&quot;:&quot;intelligence_fake_crawler&quot;,&quot;status&quot;:&quot;on&quot;,&quot;config&quot;:{},&quot;action&quot;:&quot;deny&quot;}]</p>
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
