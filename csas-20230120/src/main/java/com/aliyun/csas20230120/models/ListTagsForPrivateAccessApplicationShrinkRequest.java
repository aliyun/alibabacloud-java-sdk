// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListTagsForPrivateAccessApplicationShrinkRequest extends TeaModel {
    @NameInMap("ApplicationIds")
    public String applicationIdsShrink;

    public static ListTagsForPrivateAccessApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagsForPrivateAccessApplicationShrinkRequest self = new ListTagsForPrivateAccessApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTagsForPrivateAccessApplicationShrinkRequest setApplicationIdsShrink(String applicationIdsShrink) {
        this.applicationIdsShrink = applicationIdsShrink;
        return this;
    }
    public String getApplicationIdsShrink() {
        return this.applicationIdsShrink;
    }

}
