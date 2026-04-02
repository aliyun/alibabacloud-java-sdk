// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ManageAlertRulesShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static ManageAlertRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ManageAlertRulesShrinkRequest self = new ManageAlertRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ManageAlertRulesShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
