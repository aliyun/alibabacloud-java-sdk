// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class RevertEvaluationResultsShrinkRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-7e72626622af0051****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The resources that are to be re-evaluated.</p>
     * <p>This parameter is required.</p>
     */
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
