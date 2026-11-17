// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateApplicationCustomRulesShrinkRequest extends TeaModel {
    /**
     * <p>The list of custom application rules to be modified. You can specify up to 20 rules at a time. Rule IDs in the list must be unique.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public String rulesShrink;

    public static UpdateApplicationCustomRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationCustomRulesShrinkRequest self = new UpdateApplicationCustomRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationCustomRulesShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

}
