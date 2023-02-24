// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelContactByNumberShrinkRequest extends TeaModel {
    @NameInMap("Number")
    public String number;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static GetHotelContactByNumberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelContactByNumberShrinkRequest self = new GetHotelContactByNumberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelContactByNumberShrinkRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public GetHotelContactByNumberShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
