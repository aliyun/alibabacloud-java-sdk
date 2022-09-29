// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelNoticeShrinkRequest extends TeaModel {
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static GetHotelNoticeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelNoticeShrinkRequest self = new GetHotelNoticeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelNoticeShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
