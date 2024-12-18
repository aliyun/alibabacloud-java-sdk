// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ActiveAggregateConfigRulesRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of the account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-a4e5626622af0079****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The rule ID. Separate multiple rule IDs with commas (,).</p>
     * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-5772ba41209e007b****</p>
     */
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
