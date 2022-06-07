// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetEnvironmentShrinkRequest extends TeaModel {
    @NameInMap("options")
    public String optionsShrink;

    public static GetEnvironmentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentShrinkRequest self = new GetEnvironmentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentShrinkRequest setOptionsShrink(String optionsShrink) {
        this.optionsShrink = optionsShrink;
        return this;
    }
    public String getOptionsShrink() {
        return this.optionsShrink;
    }

}
