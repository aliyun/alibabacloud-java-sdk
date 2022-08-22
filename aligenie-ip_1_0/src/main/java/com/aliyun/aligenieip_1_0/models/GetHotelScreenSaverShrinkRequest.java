// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelScreenSaverShrinkRequest extends TeaModel {
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static GetHotelScreenSaverShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelScreenSaverShrinkRequest self = new GetHotelScreenSaverShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelScreenSaverShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
