// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class StopConfigRulesRequest extends TeaModel {
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static StopConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        StopConfigRulesRequest self = new StopConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public StopConfigRulesRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
