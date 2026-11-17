// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteApplicationCustomRulesShrinkRequest extends TeaModel {
    /**
     * <p>The list of IDs of the custom application rules to delete. You can specify up to 100 IDs in a single request. The IDs cannot be empty and must be unique.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationCustomRuleIds")
    public String applicationCustomRuleIdsShrink;

    public static DeleteApplicationCustomRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationCustomRulesShrinkRequest self = new DeleteApplicationCustomRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationCustomRulesShrinkRequest setApplicationCustomRuleIdsShrink(String applicationCustomRuleIdsShrink) {
        this.applicationCustomRuleIdsShrink = applicationCustomRuleIdsShrink;
        return this;
    }
    public String getApplicationCustomRuleIdsShrink() {
        return this.applicationCustomRuleIdsShrink;
    }

}
