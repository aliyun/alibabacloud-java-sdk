// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateWebFilterRulesShrinkRequest extends TeaModel {
    /**
     * <p>The list of web filtering rules. You can specify a maximum of 100 rules at a time, and the total number of rules in the template after creation must not exceed 100.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public String rulesShrink;

    /**
     * <p>The ID of the web filtering template to which the web filtering rules belong. The template must exist within the current Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wft-3f2a9c1d4b5e6f70</p>
     */
    @NameInMap("WebFilterTemplateId")
    public String webFilterTemplateId;

    public static CreateWebFilterRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWebFilterRulesShrinkRequest self = new CreateWebFilterRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateWebFilterRulesShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

    public CreateWebFilterRulesShrinkRequest setWebFilterTemplateId(String webFilterTemplateId) {
        this.webFilterTemplateId = webFilterTemplateId;
        return this;
    }
    public String getWebFilterTemplateId() {
        return this.webFilterTemplateId;
    }

}
