// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ActiveConfigRulesRequest extends TeaModel {
    /**
     * <p>The rule ID. Separate multiple rule IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-2da35180a8d1008e****,cr-2da35180a8d1008e****</p>
     */
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static ActiveConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveConfigRulesRequest self = new ActiveConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public ActiveConfigRulesRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
