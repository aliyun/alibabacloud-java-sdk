// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartAggregateRemediationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    @NameInMap("ResourceAccountId")
    public Long resourceAccountId;

    public static StartAggregateRemediationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAggregateRemediationRequest self = new StartAggregateRemediationRequest();
        return TeaModel.build(map, self);
    }

    public StartAggregateRemediationRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public StartAggregateRemediationRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public StartAggregateRemediationRequest setResourceAccountId(Long resourceAccountId) {
        this.resourceAccountId = resourceAccountId;
        return this;
    }
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

}
