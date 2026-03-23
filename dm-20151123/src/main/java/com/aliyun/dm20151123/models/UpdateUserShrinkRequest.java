// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class UpdateUserShrinkRequest extends TeaModel {
    @NameInMap("User")
    public String userShrink;

    public static UpdateUserShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserShrinkRequest self = new UpdateUserShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserShrinkRequest setUserShrink(String userShrink) {
        this.userShrink = userShrink;
        return this;
    }
    public String getUserShrink() {
        return this.userShrink;
    }

}
