// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceByConfigRuleRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("ComplianceType")
    public String complianceType;

    @NameInMap("ConfigRuleId")
    public String configRuleId;

    public static GetAggregateResourceComplianceByConfigRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceByConfigRuleRequest self = new GetAggregateResourceComplianceByConfigRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceByConfigRuleRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateResourceComplianceByConfigRuleRequest setComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }
    public String getComplianceType() {
        return this.complianceType;
    }

    public GetAggregateResourceComplianceByConfigRuleRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

}
