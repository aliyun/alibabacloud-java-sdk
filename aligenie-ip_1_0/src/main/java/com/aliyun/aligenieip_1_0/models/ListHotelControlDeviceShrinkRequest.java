// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelControlDeviceShrinkRequest extends TeaModel {
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static ListHotelControlDeviceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelControlDeviceShrinkRequest self = new ListHotelControlDeviceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelControlDeviceShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
