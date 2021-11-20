// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class AttachConfigRuleToCompliancePackRequest extends TeaModel {
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static AttachConfigRuleToCompliancePackRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachConfigRuleToCompliancePackRequest self = new AttachConfigRuleToCompliancePackRequest();
        return TeaModel.build(map, self);
    }

    public AttachConfigRuleToCompliancePackRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public AttachConfigRuleToCompliancePackRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
