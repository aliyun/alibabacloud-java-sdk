// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRuleComplianceByPackRequest extends TeaModel {
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    public static GetConfigRuleComplianceByPackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRuleComplianceByPackRequest self = new GetConfigRuleComplianceByPackRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigRuleComplianceByPackRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

}
