// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceByConfigRuleRequest extends TeaModel {
    /**
     * <p>The compliance evaluation result of the resource. Valid values:</p>
     * <br>
     * <p>*   COMPLIANT: The resource is evaluated as compliant.</p>
     * <p>*   NON_COMPLIANT: The resource is evaluated as non-compliant.</p>
     * <p>*   NOT_APPLICABLE: The rule does not apply to the resource.</p>
     * <p>*   INSUFFICIENT_DATA: No resource data is available.</p>
     */
    @NameInMap("ComplianceType")
    public String complianceType;

    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListConfigRules](https://help.aliyun.com/document_detail/169607.html).</p>
     * <br>
     * <p>This parameter is required.</p>
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
