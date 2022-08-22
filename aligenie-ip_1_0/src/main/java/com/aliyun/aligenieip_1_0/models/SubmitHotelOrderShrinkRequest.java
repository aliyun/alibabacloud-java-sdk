// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class SubmitHotelOrderShrinkRequest extends TeaModel {
    @NameInMap("Payload")
    public String payloadShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static SubmitHotelOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitHotelOrderShrinkRequest self = new SubmitHotelOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitHotelOrderShrinkRequest setPayloadShrink(String payloadShrink) {
        this.payloadShrink = payloadShrink;
        return this;
    }
    public String getPayloadShrink() {
        return this.payloadShrink;
    }

    public SubmitHotelOrderShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
