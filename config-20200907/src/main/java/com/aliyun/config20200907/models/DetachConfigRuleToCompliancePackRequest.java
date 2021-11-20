// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DetachConfigRuleToCompliancePackRequest extends TeaModel {
    @NameInMap("CompliancePackId")
    public String compliancePackId;

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
