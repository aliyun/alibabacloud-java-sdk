// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelHomeBackImageAndModesShrinkRequest extends TeaModel {
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static GetHotelHomeBackImageAndModesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelHomeBackImageAndModesShrinkRequest self = new GetHotelHomeBackImageAndModesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelHomeBackImageAndModesShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
