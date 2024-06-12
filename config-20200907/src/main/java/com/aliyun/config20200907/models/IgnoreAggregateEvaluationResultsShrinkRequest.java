// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class IgnoreAggregateEvaluationResultsShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](https://help.aliyun.com/document_detail/255797.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListAggregateConfigRules](https://help.aliyun.com/document_detail/264148.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The date from which the system automatically re-evaluates the ignored incompliant resources.</p>
     * <br>
     * <p>>  If you leave this parameter empty, the system does not automatically re-evaluate the ignored incompliant resources. You must manually re-evaluate the ignored incompliant resources.</p>
     */
    @NameInMap("IgnoreDate")
    public String ignoreDate;

    /**
     * <p>The reason why you ignore the resource.</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The resources to be ignored.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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

    public IgnoreAggregateEvaluationResultsShrinkRequest setIgnoreDate(String ignoreDate) {
        this.ignoreDate = ignoreDate;
        return this;
    }
    public String getIgnoreDate() {
        return this.ignoreDate;
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
