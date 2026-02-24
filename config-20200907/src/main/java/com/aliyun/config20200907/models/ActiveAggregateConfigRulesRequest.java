// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ActiveAggregateConfigRulesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("CompliancePackId")
    public String compliancePackId;

    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static ActiveAggregateConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveAggregateConfigRulesRequest self = new ActiveAggregateConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public ActiveAggregateConfigRulesRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public ActiveAggregateConfigRulesRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public ActiveAggregateConfigRulesRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
