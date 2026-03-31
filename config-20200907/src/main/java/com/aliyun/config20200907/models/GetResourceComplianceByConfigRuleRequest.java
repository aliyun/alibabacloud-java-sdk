// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceByConfigRuleRequest extends TeaModel {
    /**
     * <p>The compliance evaluation result. Valid values:</p>
     * <ul>
     * <li>COMPLIANT: The resources are evaluated as compliant.</li>
     * <li>NON_COMPLIANT: The resources are evaluated as non-compliant.</li>
     * <li>NOT_APPLICABLE: The rule does not apply to the resources.</li>
     * <li>INSUFFICIENT_DATA: No data is available.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMPLIANT</p>
     */
    @NameInMap("ComplianceType")
    public String complianceType;

    /**
     * <p>The rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-d369626622af008e****</p>
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
