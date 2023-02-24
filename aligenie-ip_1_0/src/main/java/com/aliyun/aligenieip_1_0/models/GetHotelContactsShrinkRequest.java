// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelContactsShrinkRequest extends TeaModel {
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static GetHotelContactsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelContactsShrinkRequest self = new GetHotelContactsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelContactsShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
