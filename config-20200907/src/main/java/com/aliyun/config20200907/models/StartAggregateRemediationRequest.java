// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartAggregateRemediationRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>You can call the [ListAggregators](~~255797~~) operation to obtain the account group ID.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>You can call the [ListAggregateConfigRules](~~264148~~) operation to obtain the rule ID.</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    public static StartAggregateRemediationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAggregateRemediationRequest self = new StartAggregateRemediationRequest();
        return TeaModel.build(map, self);
    }

    public StartAggregateRemediationRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public StartAggregateRemediationRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

}
