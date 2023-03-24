// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPolicesForPrivateAccessApplicationShrinkRequest extends TeaModel {
    @NameInMap("ApplicationIds")
    public String applicationIdsShrink;

    public static ListPolicesForPrivateAccessApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicesForPrivateAccessApplicationShrinkRequest self = new ListPolicesForPrivateAccessApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicesForPrivateAccessApplicationShrinkRequest setApplicationIdsShrink(String applicationIdsShrink) {
        this.applicationIdsShrink = applicationIdsShrink;
        return this;
    }
    public String getApplicationIdsShrink() {
        return this.applicationIdsShrink;
    }

}
