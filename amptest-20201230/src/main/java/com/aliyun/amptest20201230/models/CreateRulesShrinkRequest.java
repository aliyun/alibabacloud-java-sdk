// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class CreateRulesShrinkRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public String homeShrink;

    public static CreateRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRulesShrinkRequest self = new CreateRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRulesShrinkRequest setHomeShrink(String homeShrink) {
        this.homeShrink = homeShrink;
        return this;
    }
    public String getHomeShrink() {
        return this.homeShrink;
    }

}
