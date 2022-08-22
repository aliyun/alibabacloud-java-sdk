// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelSampleUtterancesShrinkRequest extends TeaModel {
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static GetHotelSampleUtterancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelSampleUtterancesShrinkRequest self = new GetHotelSampleUtterancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelSampleUtterancesShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
