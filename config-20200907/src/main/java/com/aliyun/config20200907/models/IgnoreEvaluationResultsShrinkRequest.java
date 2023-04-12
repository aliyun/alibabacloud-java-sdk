// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class IgnoreEvaluationResultsShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListConfigRules](~~169607~~).</p>
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
     * <p>The reason why you want to ignore the resource.</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The resources to be ignored.</p>
     */
    @NameInMap("Resources")
    public String resourcesShrink;

    public static IgnoreEvaluationResultsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IgnoreEvaluationResultsShrinkRequest self = new IgnoreEvaluationResultsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IgnoreEvaluationResultsShrinkRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public IgnoreEvaluationResultsShrinkRequest setIgnoreDate(String ignoreDate) {
        this.ignoreDate = ignoreDate;
        return this;
    }
    public String getIgnoreDate() {
        return this.ignoreDate;
    }

    public IgnoreEvaluationResultsShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public IgnoreEvaluationResultsShrinkRequest setResourcesShrink(String resourcesShrink) {
        this.resourcesShrink = resourcesShrink;
        return this;
    }
    public String getResourcesShrink() {
        return this.resourcesShrink;
    }

}
