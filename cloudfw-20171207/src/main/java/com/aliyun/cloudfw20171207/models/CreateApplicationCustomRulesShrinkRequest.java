// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateApplicationCustomRulesShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the application template to which the custom rules belong. The template must exist within the current Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ati-4f0691c56b8d4f06</p>
     */
    @NameInMap("ApplicationTemplateId")
    public String applicationTemplateId;

    /**
     * <p>The list of custom rules for the application. You can specify up to 100 rules at a time, and the total number of rules in the template after creation must not exceed 100.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public String rulesShrink;

    public static CreateApplicationCustomRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationCustomRulesShrinkRequest self = new CreateApplicationCustomRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationCustomRulesShrinkRequest setApplicationTemplateId(String applicationTemplateId) {
        this.applicationTemplateId = applicationTemplateId;
        return this;
    }
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

    public CreateApplicationCustomRulesShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

}
