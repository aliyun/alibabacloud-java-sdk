// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceGroupByRegionRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static GetAggregateResourceComplianceGroupByRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceGroupByRegionRequest self = new GetAggregateResourceComplianceGroupByRegionRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceGroupByRegionRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateResourceComplianceGroupByRegionRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
