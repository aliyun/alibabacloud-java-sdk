// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartAggregateConfigRuleEvaluationRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-3a58626622af0005****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the compliance package.</p>
     * <p>For more information about how to obtain the ID of a compliance package, see <a href="https://help.aliyun.com/document_detail/262059.html">ListAggregateCompliancePacks</a>.</p>
     * <blockquote>
     * <p>You must configure either the <code>CompliancePackId</code> or <code>ConfigRuleId</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cp-ac16626622af0053****</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The rule ID.</p>
     * <p>For more information about how to query the ID of a rule, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
     * <blockquote>
     * <p> You must configure either the <code>CompliancePackId</code> or <code>ConfigRuleId</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cr-c169626622af009f****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>Specifies whether to re-evaluate the ignored non-compliant resource. Valid values:</p>
     * <ul>
     * <li>true: re-evaluates the ignored non-compliant resource based on the rule.</li>
     * <li>false (default): does not re-evaluate the ignored non-compliant resource based on the rule.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
