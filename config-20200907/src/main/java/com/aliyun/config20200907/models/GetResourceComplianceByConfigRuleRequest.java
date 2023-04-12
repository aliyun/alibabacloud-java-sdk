// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceByConfigRuleRequest extends TeaModel {
    /**
     * <p>The compliance evaluation results to be returned. Valid values:</p>
     * <br>
     * <p>*   COMPLIANT: The relevant resources are evaluated as compliant.</p>
     * <p>*   NON_COMPLIANT: The relevant resources are evaluated as non-compliant.</p>
     * <p>*   NOT_APPLICABLE: The rule does not apply to your resources.</p>
     * <p>*   INSUFFICIENT_DATA: No resource data is available.</p>
     */
    @NameInMap("ComplianceType")
    public String complianceType;

    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListConfigRules](~~169607~~).</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    public static GetResourceComplianceByConfigRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceComplianceByConfigRuleRequest self = new GetResourceComplianceByConfigRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceComplianceByConfigRuleRequest setComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }
    public String getComplianceType() {
        return this.complianceType;
    }

    public GetResourceComplianceByConfigRuleRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

}
