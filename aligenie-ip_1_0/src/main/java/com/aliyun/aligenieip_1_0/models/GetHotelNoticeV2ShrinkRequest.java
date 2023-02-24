// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelNoticeV2ShrinkRequest extends TeaModel {
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static GetHotelNoticeV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelNoticeV2ShrinkRequest self = new GetHotelNoticeV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelNoticeV2ShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
