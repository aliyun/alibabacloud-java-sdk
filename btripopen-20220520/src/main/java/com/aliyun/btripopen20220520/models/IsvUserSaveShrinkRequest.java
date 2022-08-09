// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IsvUserSaveShrinkRequest extends TeaModel {
    @NameInMap("user_list")
    public String userListShrink;

    public static IsvUserSaveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IsvUserSaveShrinkRequest self = new IsvUserSaveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IsvUserSaveShrinkRequest setUserListShrink(String userListShrink) {
        this.userListShrink = userListShrink;
        return this;
    }
    public String getUserListShrink() {
        return this.userListShrink;
    }

}
