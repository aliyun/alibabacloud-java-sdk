// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeactiveConfigRulesRequest extends TeaModel {
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The ID of the rule. Separate multiple rule IDs with commas (,).</p>
     * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-19a56457e0d90058****</p>
     */
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static DeactiveConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeactiveConfigRulesRequest self = new DeactiveConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeactiveConfigRulesRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public DeactiveConfigRulesRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
