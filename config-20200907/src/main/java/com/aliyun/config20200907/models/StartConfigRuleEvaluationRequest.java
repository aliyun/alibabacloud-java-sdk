// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartConfigRuleEvaluationRequest extends TeaModel {
    /**
     * <p>The compliance package ID.</p>
     * <p>For more information about how to obtain the ID of a compliance package, see <a href="https://help.aliyun.com/document_detail/606968.html">ListCompliancePacks</a>.</p>
     * <blockquote>
     * <p> You must configure either the <code>CompliancePackId</code> or <code>ConfigRuleId</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cp-ac16626622af0053****</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The rule ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/609222.html">ListConfigRules</a> operation to obtain the rule ID.</p>
     * <blockquote>
     * <p> You must configure either the <code>CompliancePackId</code> or <code>ConfigRuleId</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cr-9920626622af0035****</p>
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

    public static StartConfigRuleEvaluationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartConfigRuleEvaluationRequest self = new StartConfigRuleEvaluationRequest();
        return TeaModel.build(map, self);
    }

    public StartConfigRuleEvaluationRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public StartConfigRuleEvaluationRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public StartConfigRuleEvaluationRequest setRevertEvaluation(Boolean revertEvaluation) {
        this.revertEvaluation = revertEvaluation;
        return this;
    }
    public Boolean getRevertEvaluation() {
        return this.revertEvaluation;
    }

}
