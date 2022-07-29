// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetUnreadMessageCountShrinkRequest extends TeaModel {
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static GetUnreadMessageCountShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUnreadMessageCountShrinkRequest self = new GetUnreadMessageCountShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetUnreadMessageCountShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
