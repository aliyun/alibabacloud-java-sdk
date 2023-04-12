// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeactiveConfigRulesRequest extends TeaModel {
    /**
     * <p>The ID of the rule. Separate multiple rule IDs with commas (,).</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListConfigRules](~~169607~~).</p>
     */
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static DeactiveConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeactiveConfigRulesRequest self = new DeactiveConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeactiveConfigRulesRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
