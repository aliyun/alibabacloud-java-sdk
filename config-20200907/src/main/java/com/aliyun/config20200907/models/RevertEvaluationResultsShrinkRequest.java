// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class RevertEvaluationResultsShrinkRequest extends TeaModel {
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    @NameInMap("Resources")
    public String resourcesShrink;

    public static RevertEvaluationResultsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RevertEvaluationResultsShrinkRequest self = new RevertEvaluationResultsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RevertEvaluationResultsShrinkRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public RevertEvaluationResultsShrinkRequest setResourcesShrink(String resourcesShrink) {
        this.resourcesShrink = resourcesShrink;
        return this;
    }
    public String getResourcesShrink() {
        return this.resourcesShrink;
    }

}
