// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateWebFilterRulesShrinkRequest extends TeaModel {
    /**
     * <p>The list of web filtering rules to be updated. You can specify up to 20 rules at a time. The rule IDs in the list must be unique.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public String rulesShrink;

    public static UpdateWebFilterRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebFilterRulesShrinkRequest self = new UpdateWebFilterRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWebFilterRulesShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

}
