// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartConfigRuleEvaluationRequest extends TeaModel {
    /**
     * <p>The ID of the compliance package.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a compliance package, see [ListCompliancePacks](~~606968~~).</p>
     * <br>
     * <p>>  You must set either the CompliancePackId or ConfigRuleId parameter.</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The rule ID.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListConfigRules](~~609222~~).</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>Specifies whether to re-evaluate ignored non-compliant resources. Valid values:</p>
     * <br>
     * <p>*   true: re-evaluates ignored non-compliant resources based on the rule.</p>
     * <p>*   false: continues to ignore non-compliant resources.</p>
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
