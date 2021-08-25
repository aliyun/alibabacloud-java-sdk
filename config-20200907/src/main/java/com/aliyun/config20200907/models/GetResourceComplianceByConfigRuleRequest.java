// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceByConfigRuleRequest extends TeaModel {
    @NameInMap("ComplianceType")
    public String complianceType;

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
