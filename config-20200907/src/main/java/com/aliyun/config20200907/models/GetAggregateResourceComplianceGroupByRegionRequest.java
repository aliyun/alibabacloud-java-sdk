// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceGroupByRegionRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-d6c9626622af0052****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The rule IDs. Separate multiple rule IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cr-2652626622af005e****</p>
     */
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
