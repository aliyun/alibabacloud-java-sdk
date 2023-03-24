// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPolicesForPrivateAccessTagShrinkRequest extends TeaModel {
    @NameInMap("TagIds")
    public String tagIdsShrink;

    public static ListPolicesForPrivateAccessTagShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicesForPrivateAccessTagShrinkRequest self = new ListPolicesForPrivateAccessTagShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicesForPrivateAccessTagShrinkRequest setTagIdsShrink(String tagIdsShrink) {
        this.tagIdsShrink = tagIdsShrink;
        return this;
    }
    public String getTagIdsShrink() {
        return this.tagIdsShrink;
    }

}
