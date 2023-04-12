// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DetachAggregateConfigRuleToCompliancePackRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the compliance package from which you want to remove the rule.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a compliance package, see [ListAggregateCompliancePacks](~~262059~~).</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The ID of the rule to be removed from the compliance package. Separate multiple rule IDs with commas (,).</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListAggregateConfigRules](~~264148~~).</p>
     */
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static DetachAggregateConfigRuleToCompliancePackRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachAggregateConfigRuleToCompliancePackRequest self = new DetachAggregateConfigRuleToCompliancePackRequest();
        return TeaModel.build(map, self);
    }

    public DetachAggregateConfigRuleToCompliancePackRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public DetachAggregateConfigRuleToCompliancePackRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public DetachAggregateConfigRuleToCompliancePackRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
