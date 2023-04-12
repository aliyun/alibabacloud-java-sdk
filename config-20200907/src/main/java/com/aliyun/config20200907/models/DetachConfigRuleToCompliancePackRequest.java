// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DetachConfigRuleToCompliancePackRequest extends TeaModel {
    /**
     * <p>The ID of the compliance package from which you want to remove the rule.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a compliance package, see [ListCompliancePacks](~~263332~~).</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The ID of the rule to be removed from the compliance package. Separate multiple rule IDs with commas (,).</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListConfigRules](~~169607~~).</p>
     */
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static DetachConfigRuleToCompliancePackRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachConfigRuleToCompliancePackRequest self = new DetachConfigRuleToCompliancePackRequest();
        return TeaModel.build(map, self);
    }

    public DetachConfigRuleToCompliancePackRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public DetachConfigRuleToCompliancePackRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
