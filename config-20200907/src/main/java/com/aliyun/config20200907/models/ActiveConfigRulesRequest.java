// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ActiveConfigRulesRequest extends TeaModel {
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static ActiveConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveConfigRulesRequest self = new ActiveConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public ActiveConfigRulesRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public ActiveConfigRulesRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
