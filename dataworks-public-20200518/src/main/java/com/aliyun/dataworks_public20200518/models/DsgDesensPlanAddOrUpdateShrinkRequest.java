// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanAddOrUpdateShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesensRules")
    public String desensRulesShrink;

    public static DsgDesensPlanAddOrUpdateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgDesensPlanAddOrUpdateShrinkRequest self = new DsgDesensPlanAddOrUpdateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DsgDesensPlanAddOrUpdateShrinkRequest setDesensRulesShrink(String desensRulesShrink) {
        this.desensRulesShrink = desensRulesShrink;
        return this;
    }
    public String getDesensRulesShrink() {
        return this.desensRulesShrink;
    }

}
