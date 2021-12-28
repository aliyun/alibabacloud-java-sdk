// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateAggregateConfigRulesReportRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static GenerateAggregateConfigRulesReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAggregateConfigRulesReportRequest self = new GenerateAggregateConfigRulesReportRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAggregateConfigRulesReportRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GenerateAggregateConfigRulesReportRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GenerateAggregateConfigRulesReportRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
