// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class EvaluatePreConfigRulesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the managed rule. Valid values:</p>
     * <br>
     * <p>*   true: enables the managed rule.</p>
     * <p>*   false: does not enable the managed rule. This is the default value.</p>
     * <br>
     * <p>>  After you create an evaluation rule, a managed rule that has the same settings as the evaluation rule is created. After you create a resource, the managed rule can be used to continuously check the compliance of the resource.</p>
     */
    @NameInMap("EnableManagedRules")
    public Boolean enableManagedRules;

    /**
     * <p>The resources that you want to evaluate.</p>
     */
    @NameInMap("ResourceEvaluateItems")
    public String resourceEvaluateItemsShrink;

    public static EvaluatePreConfigRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EvaluatePreConfigRulesShrinkRequest self = new EvaluatePreConfigRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EvaluatePreConfigRulesShrinkRequest setEnableManagedRules(Boolean enableManagedRules) {
        this.enableManagedRules = enableManagedRules;
        return this;
    }
    public Boolean getEnableManagedRules() {
        return this.enableManagedRules;
    }

    public EvaluatePreConfigRulesShrinkRequest setResourceEvaluateItemsShrink(String resourceEvaluateItemsShrink) {
        this.resourceEvaluateItemsShrink = resourceEvaluateItemsShrink;
        return this;
    }
    public String getResourceEvaluateItemsShrink() {
        return this.resourceEvaluateItemsShrink;
    }

}
