// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartAggregateConfigRuleEvaluationRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the compliance package.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a compliance package, see [ListAggregateCompliancePacks](~~262059~~).</p>
     * <br>
     * <p>> You must configure either the `CompliancePackId` or `ConfigRuleId` parameter.</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The rule ID.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListAggregateConfigRules](~~264148~~).</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>Specifies whether to re-evaluate the ignored incompliant resource. Valid values:</p>
     * <br>
     * <p>*   true: The ignored incompliant resource based on the rule are re-evaluated.</p>
     * <p>*   false: The ignored incompliant resource based on the rule are not re-evaluated.</p>
     */
    @NameInMap("RevertEvaluation")
    public Boolean revertEvaluation;

    public static StartAggregateConfigRuleEvaluationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAggregateConfigRuleEvaluationRequest self = new StartAggregateConfigRuleEvaluationRequest();
        return TeaModel.build(map, self);
    }

    public StartAggregateConfigRuleEvaluationRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public StartAggregateConfigRuleEvaluationRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public StartAggregateConfigRuleEvaluationRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public StartAggregateConfigRuleEvaluationRequest setRevertEvaluation(Boolean revertEvaluation) {
        this.revertEvaluation = revertEvaluation;
        return this;
    }
    public Boolean getRevertEvaluation() {
        return this.revertEvaluation;
    }

}
