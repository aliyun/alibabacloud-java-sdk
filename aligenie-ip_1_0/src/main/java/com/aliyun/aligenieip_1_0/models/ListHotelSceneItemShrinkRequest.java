// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneItemShrinkRequest extends TeaModel {
    @NameInMap("Payload")
    public String payloadShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static ListHotelSceneItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelSceneItemShrinkRequest self = new ListHotelSceneItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelSceneItemShrinkRequest setPayloadShrink(String payloadShrink) {
        this.payloadShrink = payloadShrink;
        return this;
    }
    public String getPayloadShrink() {
        return this.payloadShrink;
    }

    public ListHotelSceneItemShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
