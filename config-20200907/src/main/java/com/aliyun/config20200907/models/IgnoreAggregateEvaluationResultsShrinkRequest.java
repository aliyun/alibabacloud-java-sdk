// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class IgnoreAggregateEvaluationResultsShrinkRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("ConfigRuleId")
    public String configRuleId;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("Resources")
    public String resourcesShrink;

    public static IgnoreAggregateEvaluationResultsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IgnoreAggregateEvaluationResultsShrinkRequest self = new IgnoreAggregateEvaluationResultsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IgnoreAggregateEvaluationResultsShrinkRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public IgnoreAggregateEvaluationResultsShrinkRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public IgnoreAggregateEvaluationResultsShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public IgnoreAggregateEvaluationResultsShrinkRequest setResourcesShrink(String resourcesShrink) {
        this.resourcesShrink = resourcesShrink;
        return this;
    }
    public String getResourcesShrink() {
        return this.resourcesShrink;
    }

}
