// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class EvaluatePreConfigRulesShrinkRequest extends TeaModel {
    @NameInMap("EnableManagedRules")
    public Boolean enableManagedRules;

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
