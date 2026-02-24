// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class RevertAggregateEvaluationResultsShrinkRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Resources")
    public String resourcesShrink;

    public static RevertAggregateEvaluationResultsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RevertAggregateEvaluationResultsShrinkRequest self = new RevertAggregateEvaluationResultsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RevertAggregateEvaluationResultsShrinkRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public RevertAggregateEvaluationResultsShrinkRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public RevertAggregateEvaluationResultsShrinkRequest setResourcesShrink(String resourcesShrink) {
        this.resourcesShrink = resourcesShrink;
        return this;
    }
    public String getResourcesShrink() {
        return this.resourcesShrink;
    }

}
