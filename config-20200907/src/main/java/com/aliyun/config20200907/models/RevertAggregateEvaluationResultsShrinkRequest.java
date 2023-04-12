// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class RevertAggregateEvaluationResultsShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the rule in the account group.</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The resources that are to be reevaluated.</p>
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
