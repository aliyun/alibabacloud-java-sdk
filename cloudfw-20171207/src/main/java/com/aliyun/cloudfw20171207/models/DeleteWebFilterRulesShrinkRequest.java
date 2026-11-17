// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteWebFilterRulesShrinkRequest extends TeaModel {
    /**
     * <p>The list of web filtering rule IDs to delete. You can specify up to 100 IDs in a single request. The IDs cannot be empty and must be unique.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WebFilterRuleIds")
    public String webFilterRuleIdsShrink;

    public static DeleteWebFilterRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebFilterRulesShrinkRequest self = new DeleteWebFilterRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWebFilterRulesShrinkRequest setWebFilterRuleIdsShrink(String webFilterRuleIdsShrink) {
        this.webFilterRuleIdsShrink = webFilterRuleIdsShrink;
        return this;
    }
    public String getWebFilterRuleIdsShrink() {
        return this.webFilterRuleIdsShrink;
    }

}
